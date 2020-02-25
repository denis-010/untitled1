public class GameplayFeatures {
    public String UserVids(String VidName){
        String word = " ";

        for (int i = 0;i<VidName.length();i++) {

            if(VidName.charAt(i) == ' ') {
                word  += VidName.charAt(i);
            }
        }
        return word;
    }
}
