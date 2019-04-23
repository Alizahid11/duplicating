class Remove{
	public void Duplicates(String msg){
		String word = "";
		String msg2 = "";
		int duplicatesFound = 0;
		String word2 = "";

		for (int x=0; x<msg.length(); x++){
			if(msg.substring(x, x + 1).equals(" ")){
			if(msg2.equals("")){
				msg2 = msg2 + word + " ";

			}
			else{
				for (int y = 0; y<msg2.length(); y++ ){
					if (msg2.substring(y, y + 1).equals(" ")){
						if (word2.equals(word)){
							duplicatesFound++;
						}
						word2 = "";
					}
					else{
					word2 = word2 + msg2.substring(y, y + 1);
					}
				}
				if (duplicatesFound == 0){
					msg2 = msg2 + word + " ";
				}
				duplicatesFound = 0;
			}
			word = "";
			}
			else{
				word = word +msg.substring(x, x + 1);
			}
		}
		System.out.println(msg2);
	}
}

class FindandCut{
	public static void main(String az[]){
		Remove x = new Remove();
		x.Duplicates("Ali Ali Ali is is a a a lion Ali");
}			
		}









