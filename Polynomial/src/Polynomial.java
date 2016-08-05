import java.util.LinkedList;
import java.util.List;

public class Polynomial {

	
	public List<Double> coefficients;
	public Polynomial(){
		this. coefficients = new LinkedList<Double>();
	}
	public Polynomial(String A){
		String[] coeff = A.split(" ");
		for(int i = coeff.length-1; i>=0; i--){
			Double num = Double.parseDouble(coeff[i]);
			this.coefficients.add(num);
		}
	}
	
	public Polynomial add(Polynomial b){
	    Polynomial addResult = new Polynomial();
		for(int i=0;i<this.coefficients.size() && i<b.coefficients.size();i++) 
		    addResult.coefficients.add(this.coefficients.get(i) + b.coefficients.get(i));
		if(this.coefficients.size() > b.coefficients.size()) {
		    for(int i=b.coefficients.size();i<this.coefficients.size();i++)
		        addResult.coefficients.add(this.coefficients.get(i));
		}
		 
		 else {
		    for(int i=this.coefficients.size();i<b.coefficients.size();i++)
		        addResult.coefficients.add(b.coefficients.get(i));
		 }
	
		
		return addResult;
	}
	
	public Polynomial  subtract(Polynomial b){
		Polynomial subResult = new Polynomial();
		for(int i=0;i<this.coefficients.size() && i<b.coefficients.size();i++) 
		    subResult.coefficients.add(this.coefficients.get(i) - b.coefficients.get(i));
		if(this.coefficients.size() > b.coefficients.size()) {
		    for(int i=b.coefficients.size();i<this.coefficients.size();i++)
		        subResult.coefficients.add(this.coefficients.get(i));
		}
		return subResult;
		
	}
	
	public Polynomial multiply(Polynomial A){
		
		return null;
	}
	
	public String toString(){
		String result = "";
		for(int i = this.coefficients.size()-1 ;i>=0; i++){
			result = this.coefficients.get(i).toString();
			result = result +  " ";
		}
		return result;
	}
	
	public String toHTML(){
		
		String result = "<span>";
		for(int i = this.coefficients.size()-1; i>=0; i--){
			result = result + this.coefficients.get(i);
			if(i!=this.coefficients.size()-1){
				result += "x";
				result += "<sup>"+i+"</sup>"; 
			}
		}
		result += "</span>";
		return result;
	}
	
	public String toLatex(){
		
		String result = "\\begin{equation}";
		for(int i = this.coefficients.size()-1; i>=0; i--){
			result = result + this.coefficients.get(i);
			if(i!=this.coefficients.size()-1){
				result += "x";
				result += "^"+i; 
			}
		}
		
		result += "\\end{equation}"; 
		return null;
	}
	
	
	public static void main(String[] args){
		
		
	}
	
}
