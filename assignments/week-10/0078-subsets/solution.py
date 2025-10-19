class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        '''
        # It can be solved using Heap only no Sliding Window
        # will require some modifications like sorting and all;
        n = len(cardPoints)
        min_heap = []

        heapq.heappush(min_heap, (cardPoints[n - 1], n - 1, False))

        for idx in range(k - 1):
            heapq.heappush(min_heap, (cardPoints[idx], idx, True))
        
        while len(min_heap) > k:
            point, idx, is_beginning = heapq.heappop(min_heap)

            if is_beginning
        
        '''

        # Sliding Window Solution: Intuition ->
        # the total_points is the sum of all cardPoints
        # then remove the sub-array of exactly (n - k) length
        # that while maximizing your (total_points - subarr_points)
        # this way we can exactly k elements by taking a few elements
        # from the beginning and a few elements from the end;

        n = len(cardPoints)
        total_points = sum(cardPoints)
        
        window_size = n - k

        if window_size == 0:
            return total_points

        max_points = 0
        strt_idx = 0
        end_idx = 0

        for end_idx, card, in enumerate(cardPoints):
            total_points -= card

            if (end_idx - strt_idx + 1) == window_size:
                max_points = max(max_points, total_points)

                total_points += cardPoints[strt_idx]
                strt_idx += 1
            
        return max_points