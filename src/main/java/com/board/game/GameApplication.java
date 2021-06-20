package com.board.game;
/** Given N x N board black and red ar playing. If 2 red / black occur in sequence 
 *  horizontally, vertically or diagonally, a point 1 is scored. If 3 occur in sequence, 
 *  point 2 is scored. If 4 balls occur in sequence, point 4 is scored. Determine the 
 *  winning team. */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
		// consider 4x4 board, R represents Red & B represents Black.
		Scanner myObj = new Scanner(System.in);
		char [][] board = new char[4][4];
		System.out.println("Please enter the position of R & B on 4x4 board");
		// accept board values
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				board[i][j] = myObj.nextLine().charAt(0);
			}
		}
		myObj.close();
		checkResult(board);
		
	}
	
	public static void checkResult(char [][]arr)
	{
		int Bsum=0, Rsum=0;
		// horizontal check Black i.e. B
		for (int i=0;i<4;i++) {
			 int countBH=0;
			for (int j=0;j<3;j++) {
				if (arr[i][j] == 'B' && arr[i][j+1] == 'B')
				{
					 countBH++;
				}
				
			} // inner for end
			 if(countBH == 1)
			 {
				 Bsum += 1;
			 }
			 else if(countBH == 2)
			 {
				 Bsum += 2;
			 }
			 else
			 {
				 Bsum += 4;
			 }
			
		}//outer for end
		
		// Vertical check Black i.e. B
				for (int i=0;i<4;i++) {
					 int countBV=0;
					for (int j=0;j<3;j++) {
						if (arr[i][j] == 'B' && arr[i+1][j ] == 'B')
						{
							 countBV++;
						}
						
					} // inner for end
					 if(countBV == 1)
					 {
						 Bsum += 1;
					 }
					 else if(countBV == 2)
					 {
						 Bsum += 2;
					 }
					 else
					 {
						 Bsum += 4;
					 }
					
				}//outer for end
				
				// Diagonal check Black i.e. B
				for (int i=0;i<3;i++) {
					 int countBD=0;
					for (int j=0;j<3;j++) {
						if (arr[i][j] == 'B' && arr[i+1][j+1] == 'B')
						{
							countBD++;
						}
						
					} // inner for end
					 if(countBD == 1)
					 {
						 Bsum += 1;
					 }
					 else if(countBD == 2)
					 {
						 Bsum += 2;
					 }
					 else
					 {
						 Bsum += 4;
					 }
					
				}//outer for end
				
				// horizontal check Red i.e. R
				for (int i=0;i<4;i++) {
					 int countRH=0;
					for (int j=0;j<3;j++) {
						if (arr[i][j] == 'B' && arr[i][j+1] == 'B')
						{
							 countRH++;
						}
						
					} // inner for end
					 if(countRH == 1)
					 {
						 Rsum += 1;
					 }
					 else if(countRH == 2)
					 {
						 Rsum += 2;
					 }
					 else
					 {
						 Rsum += 4;
					 }
					
				}//outer for end
				
				// Vertical check Red i.e. R
						for (int i=0;i<4;i++) {
							 int countRV=0;
							for (int j=0;j<3;j++) {
								if (arr[i][j] == 'B' && arr[i+1][j ] == 'B')
								{
									 countRV++;
								}
								
							} // inner for end
							 if(countRV == 1)
							 {
								 Rsum += 1;
							 }
							 else if(countRV == 2)
							 {
								 Rsum += 2;
							 }
							 else
							 {
								 Rsum += 4;
							 }
							
						}//outer for end
						
						// Diagonal check Red i.e. R
						for (int i=0;i<3;i++) {
							 int countRD=0;
							for (int j=0;j<3;j++) {
								if (arr[i][j] == 'B' && arr[i+1][j+1] == 'B')
								{
									countRD++;
								}
								
							} // inner for end
							 if(countRD == 1)
							 {
								 Rsum += 1;
							 }
							 else if(countRD == 2)
							 {
								 Rsum += 2;
							 }
							 else
							 {
								 Rsum += 4;
							 }
							
						}//outer for end
				System.out.println("RED Result: " + Rsum);
				System.out.println("Black Result: " + Bsum);
				if (Rsum > Bsum)
				{
					System.out.println("Winner: " + "RED");
				}
				else
				{
					System.out.println("Winner: " + "BLACK");
				}
	}

}
