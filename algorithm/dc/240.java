// 240. Search a 2D Matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int row = 0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}