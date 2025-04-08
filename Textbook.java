public class Textbook extends Book{
    private int edition;
    public Textbook(String booktitle, double bookPrice, int edNum){
        super(booktitle, bookPrice);
        edition = edNum;
    }
    public String getBookInfo(){
        return super.getBookInfo() + "-" + edition;
    }
    public int getEdition(){
        return edition;
    }
    public boolean canSubsitiutefor(Textbook n){
        if(n.getTitle().equals(this.getTitle())){
            if(n.getEdition() < this.getEdition()){
                return true;
            }
        }             
        return false;
    }

}

