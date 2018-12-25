## 题目
编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：  
每行中的整数从左到右按升序排列。  
每行的第一个整数大于前一行的最后一个整数。
## 思路
题目的意思很清楚，这个二维数组是升序的，那么我就重新定义了一个数组，把这个二维数组每一行拼接起来，然后再使用二分查找。
## 算法复杂度
**时间复杂度**：O(m*n)  
拼接数组时间开销是行*列，二分查找O(n*log n)  
**空间复杂度**：O(m*n)