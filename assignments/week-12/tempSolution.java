// BST Solution? BST Really? or just Binary Tree?

    private static Node findLcaNode(Node currNode, int v1, int v2){
        // Base Case:
        if(currNode == null){
            return null;
        }
        
        if(currNode != null && currNode.data > v1 && currNode.data > v2){
            currNode = findLcaNode(currNode.left, v1, v2);
            return currNode;
        }
        else if(currNode != null && currNode.data < v1 && currNode.data < v2){
            currNode = findLcaNode(currNode.right, v1, v2);
            return currNode;
        }
        else{
            return currNode;
        }
    }
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
        return findLcaNode(root, v1, v2);
    }



// minAbsDiff:

        Collections.sort(arr);
        int n = arr.size();
        
        int minAbsDiff = Integer.MAX_VALUE;
        
        for(int i = 1; i < n; i++){
            int newMinAbsDiff = Math.abs(arr.get(i) - arr.get(i - 1));
            minAbsDiff = Math.min(minAbsDiff, newMinAbsDiff);
        }
        
        return minAbsDiff;

//  balancedParentheses:

    private static boolean isOpenParenthe(char currBracket){
        if(currBracket == '(' || currBracket == '[' || currBracket == '{'){
            return true;
        }
        return false;
    }

    public static String isBalanced(String s) {
    // Write your code here
        Stack<Character> stack = new Stack<>();        
        
        for(char currBracket : s.toCharArray()){
            if(stack.isEmpty() || isOpenParenthe(currBracket)){
                stack.push(currBracket);
            }
            else if(currBracket == ')' && stack.peek() == '('){
                stack.pop();
            }
            else if(currBracket == ']' && stack.peek() == '['){
                stack.pop();                
            }
            else if(currBracket == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else{
                return "NO";
            }
        }
               
        if(stack.size() != 0){
            return "NO";
        }
        else{
            return "YES";
        }
    }

// minimumWaitingTime:

Layerst to decode in waiting Time;

// waitingTime = difference between served time and ordered time
// minAvgWaitingTime = totalWaitingTime / n
// 