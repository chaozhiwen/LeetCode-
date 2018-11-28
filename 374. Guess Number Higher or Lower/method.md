## 问题 ## 
我们正在玩一个猜数字游戏。 游戏规则如下：  
我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。  
每次你猜错了，我会告诉你这个数字是大了还是小了。  
你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）
## 思路 ##
典型的使用二分法，暴力枚举会超时。  
将下界设定为1，上界设定为n，每次用中间值比较。如果中间值大了，说明答案在左边，把上界移动到中间值的左边；如果中间值小了，说明答案在右边，那么就把下界移动
到中间值的右边。然后重新计算中间值，直到和答案匹配
## 算法复杂度 ##
**时间复杂度** O(log n)  
**空间复杂度** O(1)