public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /// ----------------- methods we actually do ------------------------
  public int getCount(int num)
  {
	  int count = 0;
	  
	  for(int k = 0; k < matrix.length; k++)
	  {
		  for(int n = 0; n < matrix[k].length; n++)
		  {
			  if(matrix[k][n] == num)
				count++;
		  }
	  }
	  
	  return count;
  }
  
  public int getLargest()
  {
	  int largest = -1;
	  
	  for(int k = 0; k < matrix.length; k++)
	  {
		  for(int n = 0; n < matrix[k].length; n++)
		  {
			  if(matrix[k][n] > largest)
				largest = matrix[k][n];
		  }
	  }
	  
	  return largest;
  }
  
  public int getColTotal(int col)
  {
	  int total = 0;
	  
	  for(int k = 0; k < matrix.length; k++)
	  {
		  total += matrix[k][col];
	  }
	  
	  return total;
  }
  
  public void reverseRows()
  {
	  System.out.println("\nArray before reverseRows:");
	  for(int k = 0; k < matrix.length; k++)
	  {
		  for(int n = 0; n < matrix[k].length; n++)
		  {
			  System.out.print(matrix[k][n] + " ");
		  }
		  
		  System.out.print();
	  }
	  
	  System.out.println("\nArray after reverseRows:");
	  
	  for(int k = 0; k < matrix.length; k++)
	  {
		  for(int n = 0; n < matrix[k].length; n++)
		  {
			  int temp = matrix[k][n];
			  
			  matrix[k][n] == matrix[k][matrix[k].length - n];
			  
			  matrix[k][matrix[k].length - n] = matrix[k][n];
			  
			  System.out.print(matrix[k][n] + " ");
		  }
		  
		  System.out.print();
	  }
  }
 
  /// ------------------ methods we actually do ------------------------
  
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}
