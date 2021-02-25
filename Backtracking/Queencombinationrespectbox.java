package Backtracking;

public class Queencombinationrespectbox {

	public static void main(String[] args) {
//		queencombination(new boolean[4],0,0,2,"");
		 coinchangerespectcoin(new int[] {2,3,5,6},0,10,"");
	}
	public static void queencombination(boolean[] board,int col,int qpsf,int tq,String ans) {
//		posiitve base case
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
//		negative base case
		if(col==board.length) {
			return;
		}
//		place
		board[col]=true;
		queencombination(board,col+1,qpsf+1,tq,ans+"b"+col);
		board[col]=false;
//		not placed qpsf=queen placed so far tq=total queen
		queencombination(board,col+1,qpsf,tq,ans);
		
	}
	public static void coinchangerespectcoin(int[] denom,int vidx,int amount,String ans) {
//		+ve base case
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		if(amount<0||vidx==denom.length) {
			return;
		}
		
//		yess give contribution
		 coinchangerespectcoin(denom,vidx,amount-denom[vidx],ans+denom[vidx]);
//		 No give contribution
		 coinchangerespectcoin(denom,vidx+1,amount,ans);
		
		 
		 
	}

}
