package Bubblesort;

public class Bubblesort {
    private  String[] data;

    public Bubblesort(){

    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
    public void sortData(){
        int lenData = this.data.length;
        for (int i = 0; i< lenData; i++){
            for (int j = i +1; j < lenData; i++){
                if (this.data[j].compareTo(this.data[j+1])>0){
                    String temp  = this.data[i];
                    this.data[i] = this.data [j];
                    this.data [j]=temp;
                }
            }
        }
    }
    public void printData(){
        for (String datum : this.data){
            System.out.println(datum+"");
        }
    }
    public static void main(String[]args){
        // int[] s =nStringew int[]{10,35,32,13,26};
        String[] s= new String[]{"anam", "bayu","zain","faqih","faqih"};
        Bubblesort _myBubble = new Bubblesort();
        _myBubble.setData(s);
        _myBubble.sortData();
        _myBubble.printData();

    }
}
