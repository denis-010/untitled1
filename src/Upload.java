public class Upload {
    String situation;
    int subscribers;
    int views;
    int likes;
    int dislikes;
    String[] variants;
    Upload(String situation, String[] variants,int views,int subscribers, int likes, int dislikes){
        this.dislikes = dislikes;
        this.likes = likes;
        this.subscribers = subscribers;
        this.views = views;
        this.situation = situation;
    }
    Upload( int views,int subscribers, int likes, int dislikes){
        this.dislikes = dislikes;
        this.likes = likes;
        this.subscribers = subscribers;
        this.views = views;
    }
    public Upload summ(Upload upload){
        this.views += upload.views;
        this.likes += upload.likes;
        this.dislikes += upload.dislikes;
        this.subscribers += upload.subscribers;
        Upload summ = new Upload(this.views,this.subscribers,this.likes,this.dislikes);
        return summ;
    }
    public void toString(Upload vids){
        String s = "Ваше видео собрало "+ vids.views+ " просмотров"+ " " + vids.likes + " лайков " + vids.dislikes +" дизлайков" + "\n"+"На вашем канале:"+vids.subscribers;
    }
}
