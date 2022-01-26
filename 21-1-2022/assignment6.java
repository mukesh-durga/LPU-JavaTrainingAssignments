//Assignment : Rotate the image 180 degree to left
public class assignment6 {

	public static void main(String []args){

		String[][][] image={
				{       {"1","1","1"},
						{"2","2","2"},
						{"3","3","3"}},

				{       {"4","4","4"},
						{"5","5","5"},
						{"6","6","6"} },

				{       {"7","7","7"},
						{"8","8","8"},
						{"9","9","9"} }

		};


		for (int i = 0; i< 3; i++) {
			for (int j =0; j<3; j++) {
				System.out.print("[");
				for (int k = 0; k <3; k++) {
					System.out.print(image[i][j][k]+",");
				}
				System.out.print("] ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Image after 180 degree rotate to left: ");
		System.out.println();
         System.out.println("_____________________________________");
		for (int i = 2; i>=0; i--) {
			for (int j =2; j>=0; j--) {
				if(j==2){
					System.out.print("|");
				}
				System.out.print("[");

				for (int k = 2; k>=0; k--) {
					System.out.print(image[i][j][k]+",");
				}

				System.out.print("]");
			}

			System.out.println("|");
		}
		System.out.println("-------------------------------------");

	}
}
