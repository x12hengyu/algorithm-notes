> # Algorithm Practice Notes

Hi, this is Xizheng Yu. This is my note of solutions of classical algorithm and data structure problems. You can find solution files written in Java in my repository. All solutions are written by myself and references (solution links) are from public sources include YouTube, LeetCode Community, Geekforgeeks etc., which are organized on the main page. Feel free to reach out if you have any question.

To find those questions, access this [link](https://leetcode.com/problemset/all/) and search the question number listed below.

Questions has been seperated into 2 types: 
- **Bold** Questions: Clssical Question to practice for each category.
- Normal Questions: Additional Question for more practices.


In-page Hyperlinks:
* [Data Structures](#data-structure)
    * [LinkedList](#linkedlist)
    * [Tree](#tree)
    * [BST](#binary-search-tree-bst)
    * [Trie](#trie)
    * [Queue](#queue)
    * [Stack](#stack)
    * [HashTable](#hashtable)
    * [Graph](#graph)
    * [Priority Queue](#priority-queue)
* [Algorithms](#algorithm)
    * [Two-Pointers](#two-pointers)
    * [Sort](#sort)
    * [Greedy](#greedy)
    * [Divide and Conquer (DC)](#divide-and-conquer-dc)
    * [Dynamic Programming (DP)](#dynamic-programming-dp)
    * [Sliding Window](#sliding-window)
    * [Backtrace](#backtrace)
    * [Binary-Search](#binary-search)
* [Others](#others)
    * [Bit Manipulation](#bit-manipulation)
    * [String](#string)
    * [Math](#math)
    * [Other](#others-1)


> # Data Structure

## LinkedList

| Questions | Solutions | Notes |
| --- | --- | --- |
| 2. Add Two Numbers | [Solution](./data-structures/linked-list/2.java) |  |
| **19. Remove Nth Node From End of List** | [Solution](./data-structures/linked-list/19.java) | use two pointers, <br> [Solution with Explanation](https://leetcode.com/problems/remove-nth-node-from-end-of-list/discuss/8804/Simple-Java-solution-in-one-pass) |
| **21. Merge Two Sorted Lists** | [Solution](./data-structures/linked-list/21.java) | [Solution with Explanation](https://leetcode.com/problems/merge-two-sorted-lists/discuss/1405588/100-or-Java-or-Clear-Code-%2B-Explanation) |
| **24. Swap Nodes in Pairs** | [Solution](./data-structures/linked-list/24.java) |  |
| **83. Remove Duplicates from Sorted List** | [Solution](./data-structures/linked-list/83.java) |  |
| 86. Partition List | [Solution](./data-structures/linked-list/86.java) | seperate two list and join |
| 92. Reverse Linked List II | [Solution](./data-structures/linked-list/92.java) |  |
| 114. Flatten Binary Tree to Linked List | [Solution](./data-structures/linked-list/114.java) |  |
| **160. Intersection of Two Linked Lists** | [Solution](./data-structures/linked-list/160.java) |  |
| **206. Reverse Linked List** | [Solution](./data-structures/linked-list/206.java) |  |
| **234. Palindrome Linked List** | [Solution](./data-structures/linked-list/234.java) | [Solution with Explanation](https://leetcode.com/problems/palindrome-linked-list/discuss/64501/Java-easy-to-understand), Cut half, reverse, compare |
| **328. Odd Even Linked List** | [Solution](./data-structures/linked-list/328.java) |  |
| **445. Add Two Numbers II** | [Solution](./data-structures/linked-list/445.java) | stack |
| **725. Split Linked List in Parts** | [Solution](./data-structures/linked-list/725.java) |  |

## Tree

| Questions | Solutions | Notes |
| --- | --- | --- |
| 100. Same Tree | [Solution](./data-structures/tree/100.java) |  |
| **101. Symmetric Tree** | [Solution](./data-structures/tree/101.java) |  |
| 102. Binary Tree Level Order Traversal | [Solution](./data-structures/tree/102.java) | level-order traversal |
| **104. Maximum Depth of Binary Tree** | [Solution](./data-structures/tree/104.java) |  |
| 105. Construct Binary Tree from Preorder and Inorder Traversal | [Solution](./data-structures/tree/105.java) |  |
| **110. Balanced Binary Tree** | [Solution](./data-structures/tree/110.java) |  |
| **111. Minimum Depth of Binary Tree** | [Solution](./data-structures/tree/111.java) | BFS is better than revursively DFS here |
| **112. Path Sum** | [Solution](./data-structures/tree/112.java) |  |
| 129. Sum Root to Leaf Numbers | [Solution](./data-structures/tree/129.java) |  |
| 199. Binary Tree Right Side View | [Solution](./data-structures/tree/199.java) | bfs search from right to left, add first element |
| **226. Invert Binary Tree** | [Solution](./data-structures/tree/226.java) |  |
| **297. Serialize and Deserialize Binary Tree** | [Solution](./data-structures/tree/297.java) | deque, pre-prder |
| **337. House Robber III** | [Solution](./data-structures/tree/337.java) | [Solution with Explanation](https://leetcode.com/problems/house-robber-iii/discuss/79330/Step-by-step-tackling-of-the-problem), DP memorization? or bottom to up backtrace? |
| **404. Sum of Left Leaves** | [Solution](./data-structures/tree/404.java) |  |
| **437. Path Sum III** | [Solution](./data-structures/tree/437.java) | dfs |
| **543. Diameter of Binary Tree** | [Solution](./data-structures/tree/543.java) |  |
| **572. Subtree of Another Tree** | [Solution](./data-structures/tree/572.java) |  |
| **617. Merge Two Binary Trees** | [Solution](./data-structures/tree/617.java) |  |
| 671. Second Minimum Node In a Binary Tree | [Solution](./data-structures/tree/671.java) | This questions refers to a special tree that each node has exactly `two` or `zero` sub-node. |
| **687. Longest Univalue Path** | [Solution](./data-structures/tree/687.java) |  |
| 814. Binary Tree Pruning | [Solution](./data-structures/tree/814.java) |  |
| 1448. Count Good Nodes in Binary Tree | [Solution](./data-structures/tree/1448.java) | dfs |
| 2415. Reverse Odd Levels of Binary Tree | [Solution](./data-structures/tree/2415.java) | bfs |

```
Traversal:        1           
                /   \
               2     3       
             /   \ /   \     
            4    5 6    7    
In-order (Left, Root, Right): [4, 2, 5, 1, 3, 6, 7]
Pre-order (Root, Left, Right): [1, 2, 4, 5, 3, 6, 7]
Post-Order (Left, Right, Root): [4, 5, 2, 6, 7, 3, 1]
Level: [1, 2, 3, 4, 5, 6, 7]
```

| Questions | Solutions | Notes
| --- | --- | ---
| **637. Average of Levels in Binary Tree** | [Solution](./data-structures/tree/637.java)| level-traversal
| **513. Find Bottom Left Tree Value** | [Solution](./data-structures/tree/513.java)|level-traversal, right to left on each level
| **144. Binary Tree Preorder Traversal** | [Solution](./data-structures/tree/144.java)|push right then left
| **94. Binary Tree Inorder Traversal** | [Solution](./data-structures/tree/94.java)|
| **145. Binary Tree Postorder Traversal** | [Solution](./data-structures/tree/145.java)|Iterate from top to bottom, result from back to front

`Morris traversal`: an (in-order) tree traversal algorithm that does not employ the use of `recursion` or a `stack`, visit this [link](https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/) for details

## Binary Search Tree (BST)

| Questions | Solutions | Notes |
| --- | --- | --- |
| **108. Convert Sorted Array to Binary Search Tree** | [Solution](./data-structures/bst/108.java) | divide and conquer |
| **109. Convert Sorted List to Binary Search Tree** | [Solution](./data-structures/bst/109.java) | divide and conquer |
| **230. Kth Smallest Element in a BST** | [Solution](./data-structures/bst/230.java) | Stack, In-Order Traversal |
| **235. Lowest Common Ancestor of a Binary Search Tree** | [Solution](./data-structures/bst/235.java) |  |
| **236. Lowest Common Ancestor of a Binary Tree** | [Solution](./data-structures/bst/236.java) |  |
| **501. Find Mode in Binary Search Tree** | [Solution](./data-structures/bst/501.java) |  |
| **530. Minimum Absolute Difference in BST** | [Solution](./data-structures/bst/530.java) | In-order traversal |
| **538. Convert BST to Greater Tree** | [Solution](./data-structures/bst/538.java) |  |
| **653. Two Sum IV - Input is a BST** | [Solution](./data-structures/bst/653.java) | [Three Approaches with Explanation](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/discuss/106059/JavaC%2B%2B-Three-simple-methods-choose-one-you-like) |
| **669. Trim a Binary Search Tree** | [Solution](./data-structures/bst/669.java) |  |

## Trie

| Questions | Solutions | Notes |
| --- | --- | --- |
| **208. Implement Trie (Prefix Tree)** | [Solution](./data-structures/trie/208.java) |  |
| **677. Map Sum Pairs** | [Solution](./data-structures/trie/677.java) |  |
| **745. Prefix and Suffix Search** | [Solution](./data-structures/trie/745.java) | Since `{` is next to `z` in ASCII table, we use `{` to seperate suffix and prefix. For word `apple`, we are going to insert: `apple{apple, pple{apple, ple{apple, le{apple, e{apple, {apple`. This allow us to search `suffix + { + prefix` in the trie. |
| 1268. Search Suggestions System | [Solution](./data-structures/trie/1268.java) | could also be solved by binary search, [link](https://leetcode.com/problems/search-suggestions-system/discuss/1894633/Java-or-Binary-Search-or-Very-Easy-with-Explanation) |
| 2416. Sum of Prefix Scores of Strings | [Solution](./data-structures/trie/2416.java) | use tire to record each score and sum |

## Queue

| Questions | Solutions | Notes |
| --- | --- | --- |
| **225. Implement Stack using Queues** | [Solution](./data-structures/queue/225.java) | to implement LIFO with queue, we need to put every new element to the end of the queue |

## Stack

| Questions | Solutions | Notes |
| --- | --- | --- |
| **20. Valid Parentheses** | [Solution](./data-structures/stack/20.java) |  |
| **155. Min Stack** | [Solution](./data-structures/stack/155.java) | one normal stack, another stack tracks min values |
| **232. Implement Queue using Stacks** | [Solution](./data-structures/stack/232.java) | use two stacks to reverse order |
| **503. Next Greater Element II** | [Solution](./data-structures/stack/503.java) | This question is tricky because it's a `circular array`  |
| 682. Baseball Game | [Solution](./data-structures/stack/682.java) |  |
| **739. Daily Temperatures** | [Solution](./data-structures/stack/739.java) | monotonic stack |
| 1472. Design Browser History | [Solution](./data-structures/stack/1472.java) | two stacks, one record past, another one for future |

## HashTable

| Questions | Solutions | Notes |
| --- | --- | --- |
| **1. Two Sum** | [Solution](./data-structures/hash/1.java) |  |
| 13. Roman to Integer | [Solution](./data-structures/hash/13.java) | use a prev pointer to manage deduction |
| **128. Longest Consecutive Sequence** | [Solution](./data-structures/hash/128.java) |  |
| **217. Contains Duplicate** | [Solution](./data-structures/hash/217.java) | use HashSet to track unique element. |
| **560. Subarray Sum Equals K** | [Solution](./data-structures/hash/560.java) | [Detailed Explanation](https://leetcode.com/problems/subarray-sum-equals-k/discuss/803317/Java-Solution-with-Detailed-Explanation), use hashset to record previous occurrence of keys to reduce time complexity |
| **594. Longest Harmonious Subsequence** | [Solution](./data-structures/hash/594.java) | subsequence is not consecutive |
| 792. Number of Matching Subsequences | [Solution](./data-structures/hash/792.java) | use start of each word as map key |
| 820. Short Encoding of Words | [Solution](./data-structures/hash/820.java) | hashset / trie |
| **1074. Number of Submatrices That Sum to Target** | [Solution](./data-structures/hash/1074.java) | [Detailed Explanation](https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/discuss/803353/Java-Solution-with-Detailed-Explanation), 3D version of 560 |
| 1630. Arithmetic Subarrays | [Solution](./data-structures/hash/1630.java) |  |
| 2404. Most Frequent Even Element | [Solution](./data-structures/hash/2404.java) |  |

## Graph

Graph Theories:
- Search
    - **Breath-First Search (BFS)** - [Video Explanation](https://www.youtube.com/watch?v=oDqjPvD54Ss)
    - **Depth-First Search (DFS)** - [Video Explanation](https://www.youtube.com/watch?v=7fujbpJ0LB4)
- Shortest Path
    - **Dijkstra's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=pSqmAO-m7Lk&t=784s)
    - **Bellman Ford Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=lyw4FaxrwHg)
- Topological Sort
    - **Kahn's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=cIBFEhD77b4)
- Strongly Connected Components
    - **Tarjan's Strongly Connected Component (SCC) Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=wUgWX0nc4NY&t=2s)
- Union and Find
    - **Disjoint Union and Find** - [Video Explanation](https://www.youtube.com/watch?v=0jNmHPfA_yE)
- Minimum Spanning Tree
    - **Prim's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=jsmMtJpPnhU&t=2s)
    - **Kruskal's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=JZBQLXgSGfs) - Union and Find application
- Network Flow
    - **Ford-Fulkerson Algorithm** - Maximum Flow - [Video Explanation](https://www.youtube.com/watch?v=LdOnanfc5TM), [Java Code](https://gist.githubusercontent.com/thmain/2d475da99d1b794e8cfb9eae5f4e0a11/raw/e5114963f06621a79a8662682c3f6172e766a7fa/MaxFlow_Ford_Fulkerson.java)
    - **Bipartite Matching** - 

| Questions | Solutions | Notes |
| --- | --- | --- |
| **684. Redundant Connection** | [Solution](./data-structures/graph/684.java) | Classical Union and Find |
| 695. Max Area of Island | [Solution](./data-structures/graph/695.java) | dfs |
| **785. Is Graph Bipartite?** | [Solution](./data-structures/graph/785.java) | graph coloring, dfs |
| **1192. Critical Connections in a Network** | [Solution](./data-structures/graph/1192.java) | Tarjan's Algorithm |

## Priority Queue

| Questions | Solutions | Notes |
| --- | --- | --- |
| **295. Find Median from Data Stream** | [Solution](./data-structures/pq/295.java) | double pq |
| **605. Can Place Flowers** | [Solution](./data-structures/pq/605.java) |  |
| 630. Course Schedule III | [Solution](./data-structures/pq/630.java) | greedy sort + pq |
| 1046. Last Stone Weight | [Solution](./data-structures/pq/1046.java) |  |
| 1354. Construct Target Array With Multiple Sums | [Solution](./data-structures/pq/1354.java) | [Graphical Explanation](https://leetcode.com/problems/construct-target-array-with-multiple-sums/discuss/2189445/Visual-Explanation-or-JAVA-Max-Heap), backtrace with pq |
| **1642. Furthest Building You Can Reach** | [Solution](./data-structures/pq/1642.java) | [Solution with Explanation](https://leetcode.com/problems/furthest-building-you-can-reach/discuss/918515/JavaC%2B%2BPython-Priority-Queue), use pq to record height difference |
| 2406. Divide Intervals Into Minimum Number of Groups | [Solution](./data-structures/pq/2406.java) |  |
| 2462. Total Cost to Hire K Workers | [Solution](./data-structures/pq/2462.java) |  |

> # Algorithm

## Two-Pointers

| Questions | Solutions | Notes |
| --- | --- | --- |
| **15. 3Sum** | [Solution](./algorithm/pointers/15.java) | Advanced version of 2 sum, same idea |
| **88. Merge Sorted Array** | [Solution](./algorithm/pointers/88.java) |  |
| **125. Valid Palindrome** | [Solution](./algorithm/pointers/125.java) | head and end pointers |
| **141. Linked List Cycle** | [Solution](./algorithm/pointers/141.java) | Use two different speed pointer to track if they meet |
| **142. Linked List Cycle II** | [Solution](./algorithm/pointers/142.java) |  |
| **167. Two Sum II - Input Array Is Sorted** | [Solution](./algorithm/pointers/167.java) |  |
| **344. Reverse String** | [Solution](./algorithm/pointers/344.java) |  |
| **345. Reverse Vowels of a String** | [Solution](./algorithm/pointers/345.java) |  |
| **524. Longest Word in Dictionary through Deleting** | [Solution](./algorithm/pointers/524.java) |  |
| **541. Reverse String II** | [Solution](./algorithm/pointers/541.java) |  |
| **557. Reverse Words in a String III** | [Solution](./algorithm/pointers/557.java) |  |
| **633. Sum of Square Numbers** | [Solution](./algorithm/pointers/633.java) |  |
| **680. Valid Palindrome II** | [Solution](./algorithm/pointers/680.java) | Two pointers from head and end |
| 2410. Maximum Matching of Players With Trainers | [Solution](./algorithm/pointers/2410.java) |  |

## Sort

QuickSort
- [QuickSelect](https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/2180600/A-Guide-to-Quick-Select-or-JAVA)
- [Hoare’s vs Lomuto partition scheme in QuickSort](https://www.geeksforgeeks.org/hoares-vs-lomuto-partition-scheme-quicksort/)

| Questions | Solutions | Notes |
| --- | --- | --- |
| 56. Merge Intervals | [Solution](./algorithm/sort/56.java) |  |
| **215. Kth Largest Element in an Array** | [Solution](./algorithm/sort/215.java) | priority queue: o(nlogn) <br> quicksort: best o(n) worst o(n^2) |
| **1996. The Number of Weak Characters in the Game** | [Solution](./algorithm/sort/1996.java) | sort attack descending and defense ascending |

## Greedy

"Local Optimal is Global Optimal"

| Questions | Solutions | Notes |
| --- | --- | --- |
| **53. Maximum Subarray** | [Solution](./algorithm/greedy/53.java) |  |
| **121. Best Time to Buy and Sell Stock** | [Solution](./algorithm/greedy/121.java) |  |
| **122. Best Time to Buy and Sell Stock II** | [Solution](./algorithm/greedy/122.java) |  |
| 135. Candy | [Solution](./algorithm/greedy/135.java) | iterate from left and right to ensure both children satisfy conditions |
| **392. Is Subsequence** | [Solution](./algorithm/greedy/392.java) |  |
| **435. Non-overlapping Intervals** | [Solution](./algorithm/greedy/435.java) |  |
| **452. Minimum Number of Arrows to Burst Balloons** | [Solution](./algorithm/greedy/452.java) |  |
| **455. Assign Cookies** | [Solution](./algorithm/greedy/455.java) |  |
| **763. Partition Labels** | [Solution](./algorithm/greedy/763.java) |  |
| **1647. Minimum Deletions to Make Character Frequencies Unique** | [Solution](./algorithm/greedy/1647.java) | check if current freq has been used, if so, delete until find empty freq |
| **1710. Maximum Units on a Truck** | [Solution](./algorithm/greedy/1710.java) | give each box takes same 1 space, sort by unit to maximize unit taken |
| 2405. Optimal Partition of String | [Solution](./algorithm/greedy/2405.java) | hashset |

## Divide and Conquer (DC)

| Questions | Solutions | Notes |
| --- | --- | --- |
| 240. Search a 2D Matrix II | [Solution](./algorithm/dc/240.java) | [DC Approach](https://leetcode.com/problems/search-a-2d-matrix-ii/discuss/66147/*Java*-an-easy-to-understand-divide-and-conquer-method), intuitively should use dc, but more efficent to search from top-right or bottom-left |
| 315. Count of Smaller Numbers After Self | [Solution](./algorithm/dc/315.java) | [Explanation](https://leetcode.com/problems/count-of-smaller-numbers-after-self/discuss/445769/merge-sort-CLEAR-simple-EXPLANATION-with-EXAMPLES-O(n-lg-n)) |

## Dynamic Programming (DP)

| Questions | Solutions | Notes |
| --- | --- | --- |
| **5. Longest Palindromic Substring** | [Solution](./algorithm/dp/5.java) |  |
| **32. Longest Valid Parentheses** | [Solution](./algorithm/dp/32.java) | think as a stack, count left then compare |
| 55. Jump Game | [Solution](./algorithm/dp/55.java) |  |
| **62. Unique Paths** | [Solution](./algorithm/dp/62.java) | [Graphical Explanation](https://leetcode.com/problems/unique-paths/discuss/405983/Easy-understand-Java-Solutions-with-Explanations-(DP-Top-down-Bottom-up-Linear-Space)) |
| **63. Unique Paths II** | [Solution](./algorithm/dp/63.java) |  |
| **64. Minimum Path Sum** | [Solution](./algorithm/dp/64.java) | use matrix to memorize every optimal minimum sum |
| **70. Climbing Stairs** | [Solution](./algorithm/dp/70.java) | fibonacci |
| **97. Interleaving String** | [Solution](./algorithm/dp/97.java) | [Graphical Explanation](https://leetcode.com/problems/interleaving-string/discuss/1468511/Simple-Explanation-for-Bottom-up-Approach-with-diagrams), <br> use 2d boolean array judge matches to s3, could also use 1d to save space, Time: O(mn) <br> Space: O(mn) |
| 118. Pascal's Triangle | [Solution](./algorithm/dp/118.java) |  |
| **120. Triangle** | [Solution](./algorithm/dp/120.java) | top-to-bottom memorization |
| **198. House Robber** | [Solution](./algorithm/dp/198.java) | bellman equation: `opt[i] = Math.max(opt[i-1], opt[i-2]+nums[i]);` |
| **213. House Robber II** | [Solution](./algorithm/dp/213.java) | [Explanation](https://leetcode.com/problems/house-robber-ii/discuss/59934/Simple-AC-solution-in-Java-in-O(n)-with-explanation) |
| 221. Maximal Square | [Solution](./algorithm/dp/221.java) |  |
| **303. Range Sum Query - Immutable** | [Solution](./algorithm/dp/303.java) | prefix sum |
| **304. Range Sum Query 2D - Immutable** | [Solution](./algorithm/dp/304.java) | dp, prefix-sum |
| **322. Coin Change** | [Solution](./algorithm/dp/322.java) | the idea of dp array is actually something like 0-1 knapsack, bellman equation: `dp[i] = Math.min(dp[i], dp[prev] + 1);` |
| 376. Wiggle Subsequence | [Solution](./algorithm/dp/376.java) | Bellman Equations: `up = down + 1` or `down = up + 1 ` |
| **406. Queue Reconstruction by Height** | [Solution](./algorithm/dp/406.java) | [Explanation](https://leetcode.com/problems/queue-reconstruction-by-height/discuss/2211641/Visual-Explanation-or-JAVA-Greedy), Sort by height decending, then sort by k ascending |
| **413. Arithmetic Slices** | [Solution](./algorithm/dp/413.java) | [Explained](https://leetcode.com/problems/arithmetic-slices/discuss/1814356/Java-or-3-liner-or-Explained) |
| **446. Arithmetic Slices II - Subsequence** | [Solution](./algorithm/dp/446.java) | [Graphical Explanation](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/discuss/1455658/C%2B%2BJavaPython-DP-with-Picture-explained-Clean-and-Concisev)， hashmap |
| **474. Ones and Zeroes** | [Solution](./algorithm/dp/474.java) | [Explained](https://leetcode.com/problems/ones-and-zeroes/discuss/1138589/Short-and-Easy-w-Explanation-or-O(L*m*n)-DP-solution-(6-lines)-similar-to-knapsack), like 0-1 knapsack, bellman equation: `dp[i][j] = Math.max(dp[i][j], dp[i-zeroes][j-ones] + 1);` |
| 576. Out of Boundary Paths | [Solution](./algorithm/dp/576.java) | use dp array to record various ways that each location could be reached |
| **583. Delete Operation for Two Strings** | [Solution](./algorithm/dp/583.java) | 1. find the longest common subsequence (1143), use two words' length minus it <br> 2. edit distance |
| 629. K Inverse Pairs Array | [Solution](./algorithm/dp/629.java) |  |
| **647. Palindromic Substrings** | [Solution](./algorithm/dp/647.java) |  |
| **665. Non-decreasing Array** | [Solution](./algorithm/dp/665.java) | [Explanation](https://leetcode.com/problems/non-decreasing-array/discuss/2193070/C%2B%2B-oror-Simple-Code-oror-Full-Explanation) |
| 746. Min Cost Climbing Stairs | [Solution](./algorithm/dp/746.java) |  |
| **968. Binary Tree Cameras (Hard)** | [Solution](./algorithm/dp/968.java) | [Explanation](https://leetcode.com/problems/binary-tree-cameras/discuss/211180/JavaC%2B%2BPython-Greedy-DFS), greedy + dfs search + binary tree |
| **1048. Longest String Chain** | [Solution](./algorithm/dp/1048.java) | [Explanation Solution](https://leetcode.com/problems/longest-string-chain/discuss/2153004/Explaining-Three-Approaches-or-JAVA) |
| **1143. Longest Common Subsequence** | [Solution](./algorithm/dp/1143.java) | [Video Explanation](https://www.youtube.com/watch?v=NnD96abizww) |
| **1277. Count Square Submatrices with All Ones** | [Solution](./algorithm/dp/1277.java) | [Graphical Explanation](https://leetcode.com/problems/count-square-submatrices-with-all-ones/discuss/441620/DP-with-figure-explanation), Time: O(mn) <br> Space: O(mn) |
| **1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold** | [Solution](./algorithm/dp/1292.java) | dp, prefix-sum, sliding window track |
| 1332. Remove Palindromic Subsequences | [Solution](./algorithm/dp/1332.java) | [Solution with Explanation](https://leetcode.com/problems/remove-palindromic-subsequences/discuss/490303/JavaC%2B%2BPython-Maximum-2-Operations), Two-Pointers <br> Subarray vs Subsequence: Subarray need to be consecutive, Subsequence don't have to be consecutive. |
| 1473. Paint House III | [Solution](./algorithm/dp/1473.java) |  |
| 1696. Jump Game VI | [Solution](./algorithm/dp/1696.java) | dp + deque |

## Sliding Window

What is sliding window? View this [link](https://stackoverflow.com/questions/8269916/what-is-sliding-window-algorithm-examples).

| Questions | Solutions | Notes |
| --- | --- | --- |
| **3. Longest Substring Without Repeating Characters** | [Solution](./algorithm/sliding-window/3.java) | [Solution with Explanation](https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1014921/SLIDING-WINDOW-oror-O(n)-oror-Faster-than-90-and-Memory-usage-less-than-100) |
| 424. Longest Repeating Character Replacement | [Solution](./algorithm/sliding-window/424.java) | [Explanation](https://leetcode.com/problems/longest-repeating-character-replacement/discuss/91271/Java-12-lines-O(n)-sliding-window-solution-with-explanation) |
| **1423. Maximum Points You Can Obtain from Cards** | [Solution](./algorithm/sliding-window/1423.java) | [Visualization](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/discuss/597825/Simple-Clean-Intuitive-Explanation-with-Visualization) |
| **1461. Check If a String Contains All Binary Codes of Size K** | [Solution](./algorithm/sliding-window/1461.java) | hashset |
| **1658. Minimum Operations to Reduce X to Zero** | [Solution](./algorithm/sliding-window/1658.java) | [Solution with Explanation](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/discuss/2136555/C%2B%2BPython-Simple-Solution-w-Explanation-or-Sliding-Window) |
| **1695. Maximum Erasure Value** | [Solution](./algorithm/sliding-window/1695.java) | hashset |
| 2414. Length of the Longest Alphabetical Continuous Substring | [Solution](./algorithm/sliding-window/2414.java) |  |
| 2461. Maximum Sum of Distinct Subarrays With Length K | [Solution](./algorithm/sliding-window/2461.java) |  |

## Backtrace

| Questions | Solutions | Notes |
| --- | --- | --- |
| **51. N-Queens** | [Solution](./algorithm/backtrace/51.java) | [Graphical and Video Explanation](http://zxi.mytechroad.com/blog/searching/leetcode-51-n-queens/), <br> Use boolean list to record diagnals |
| 52. N-Queens II | [Solution](./algorithm/backtrace/52.java) | Different from 51, we do not actually place Queen. We only record the column availability instead |
| 473. Matchsticks to Square | [Solution](./algorithm/backtrace/473.java) |  |

## Binary-Search

| Questions | Solutions | Notes |
| --- | --- | --- |
| 4. Median of Two Sorted Arrays | [Solution](./algorithm/binary-search/4.java) | [Solution with explanation](https://zxi.mytechroad.com/blog/algorithms/binary-search/leetcode-4-median-of-two-sorted-arrays/) |
| **34. Find First and Last Position of Element in Sorted Array** | [Solution](./algorithm/binary-search/34.java) |  |
| **300. Longest Increasing Subsequence** | [Solution](./algorithm/binary-search/300.java) | [Video Explanation](https://www.youtube.com/watch?v=l2rCz7skAlk), <br>[Solution with Explanation](https://leetcode.com/problems/longest-increasing-subsequence/discuss/74824/JavaPython-Binary-search-O(nlogn)-time-with-explanation), <br> DP & Greedy & Binary-Search |
| **354. Russian Doll Envelopes** | [Solution](./algorithm/binary-search/354.java) | [Solution with Explanation](https://leetcode.com/problems/russian-doll-envelopes/discuss/82763/Java-NLogN-Solution-with-Explanation), <br> Similar to 300. Longest Increasing Subsequence |

> # Others

## Bit Manipulation

|  | Operators | Lemmas
| --- | --- | --- 
| 1 | ^ | a ^ b ^ b == a
| 2 | << | a << n == a * 2^n
| 3 | >> | a >> n == a * 2^n

| Questions | Solutions | Notes |
| --- | --- | --- |
| **29. Divide Two Integers** | [Solution](./others/bit/29.java) | [Solution with Explanation](https://leetcode.com/problems/divide-two-integers/discuss/1327339/Java-or-0ms-or-100-faster-or-Obeys-all-conditions), This question sucks, use Lemma 2 & 3 |
| **191. Number of 1 Bits** | [Solution](./others/bit/191.java) | [Solution with Explanation](https://leetcode.com/problems/number-of-1-bits/discuss/55099/Simple-Java-Solution-Bit-Shifting), Bit shift |
| **268. Missing Number** | [Solution](./others/bit/268.java) | [XOR Solution with Explanation](https://leetcode.com/problems/missing-number/discuss/69791/4-Line-Simple-Java-Bit-Manipulate-Solution-with-Explaination), Lemma 1 |
| **318. Maximum Product of Word Lengths** | [Solution](./others/bit/318.java) | [Bit Mask Solution with Explanation](https://leetcode.com/problems/maximum-product-of-word-lengths/discuss/1212054/Java-beats-100-with-Explanation) |
| **1342. Number of Steps to Reduce a Number to Zero** | [Solution](./others/bit/1342.java) |  |
| 2411. Smallest Subarrays With Maximum Bitwise OR | [Solution](./others/bit/2411.java) | Use an array to track every bit of number, and record their last positions. |
| 2429. Minimize XOR | [Solution](./others/bit/2429.java) |  |
| 2433. Find The Original Array of Prefix Xor | [Solution](./others/bit/2433.java) | a ^ b = c, b ^ c = a, a ^ c = b |

## String

| Questions | Solutions | Notes |
| --- | --- | --- |
| 6. Zigzag Conversion | [Solution](./others/string/6.java) | stringbuffer |
| **9. Palindrome Number** | [Solution](./others/string/9.java) | 1. use two pointers <br> 2. no extra space, seperate to 2 ints then compare |
| **205. Isomorphic Strings** | [Solution](./others/string/205.java) | use two seperate arr to track previous appeared position |
| **242. Valid Anagram** | [Solution](./others/string/242.java) | use 26 chars array instead of hashmap is easier |
| 387. First Unique Character in a String | [Solution](./others/string/387.java) |  |
| **409. Longest Palindrome** | [Solution](./others/string/409.java) | odd or even char |
| 443. String Compression | [Solution](./others/string/443.java) | two pointers |
| 890. Find and Replace Pattern | [Solution](./others/string/890.java) | normalize string with chars' location + 1 |
| 916. Word Subsets | [Solution](./others/string/916.java) |  |
| 1360. Number of Days Between Two Dates | [Solution](./others/string/1360.java) | leap year satisfy: y % 400 == 0 or y % 4 == 0 && y % 100 != 0 |
| 1446.  Consecutive Characters | [Solution](./others/string/1446.java) |  |
| 2434. Using a Robot to Print the Lexicographically Smallest String | [Solution](./others/string/2434.java) | stack |

## Math

| Questions | Solutions | Notes |
| --- | --- | --- |
| **462. Minimum Moves to Equal Array Elements II** | [Solution](./others/math/462.java) | median |
| **509. Fibonacci Number** | [Solution](./others/math/509.java) | fibonacci number |
| **724. Find Pivot Index** | [Solution](./others/math/724.java) |  |
| 2413. Smallest Even Multiple | [Solution](./others/math/2413.java) |  |
| **2427. Number of Common Factors** | [Solution](./others/math/2427.java) | gcd |
| 2428. Maximum Sum of an Hourglass | [Solution](./others/math/2428.java) | brute force |

## Others

| Questions | Solutions | Notes |
| --- | --- | --- |
| 867. Transpose Matrix | [Solution](./others/others/867.java) |  |
| 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts | [Solution](./others/others/1465.java) |  |
| 1480. Running Sum of 1d Array | [Solution](./others/others/1480.java) | prefix-sum |
| 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers | [Solution](./others/others/1689.java) | just return the max digit |
| 2409. Count Days Spent Together | [Solution](./others/others/2409.java) |  |
| 2432. The Employee That Worked on the Longest Task | [Solution](./others/others/2432.java) |  |
| 2460. Apply Operations to an Array | [Solution](./others/others/2460.java) |  |

> # References

- LeetCode
- https://github.com/CyC2018/cs-notes
- William Fiest's YouTube Channal, great explanation - https://www.youtube.com/c/WilliamFiset-videos