

public class CscExample{
	int questionNo;
	String category;
	String text;

	public void setQuestion(int questionNo){
	this.questionNo = questionNo;
}
public void setCategory(String category){
	this.category = category;
}
public void setText(String text){
	this.text = text;
}
public int getQuestion(){
	return questionNo;
}

public String  getCategory(){
		return category;

}
public String getText(){
		return text;

}

void addQuestion(CscExample qu)
{
questionNo=questionNo +qu;
}
void removeQuestion(CscExample re)
{
  questionNo=questionNo -re;
}

	}

