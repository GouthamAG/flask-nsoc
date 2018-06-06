package ram.calculator;


import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;
import java.math.*;

public class MainActivity extends Activity implements OnClickListener {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_p,b_ce,ba,bm,bd,bs,b_ent,b_pow,b_rt,b_per,b_dot,b_del;
EditText res;int enta=0;
ToggleButton tg;

String result="0";String t="";int tim=0;
char sl='0';
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_main);
		res=(EditText)findViewById(R.id.res);
		res.setEnabled(false);
		res.setText(result);
	tg=(ToggleButton)findViewById(R.id.TGButton);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.Button2);
		b3=(Button)findViewById(R.id.Button3);
		b4=(Button)findViewById(R.id.Button4);
		b5=(Button)findViewById(R.id.Button5);
		b6=(Button)findViewById(R.id.Button6);
		b7=(Button)findViewById(R.id.Button7);
		b8=(Button)findViewById(R.id.Button8);
		b9=(Button)findViewById(R.id.Button9);
		b0=(Button)findViewById(R.id.button0);
		b_ce=(Button)findViewById(R.id.buttonce);
		//sfasfsaefefkknkndsfsdfugu
		b_ent=(Button)findViewById(R.id.buttonent);
		b_pow=(Button)findViewById(R.id.buttonpow);
		b_rt=(Button)findViewById(R.id.buttonrt);
		b_per=(Button)findViewById(R.id.buttonper);
		ba=(Button)findViewById(R.id.buttonadd);
		bm=(Button)findViewById(R.id.buttonml);
		bd=(Button)findViewById(R.id.buttondv);
		bs=(Button)findViewById(R.id.buttonmi);
		b_dot=(Button) findViewById(R.id.button_dota);
		b_del=(Button) findViewById(R.id.btn_del);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b0.setOnClickListener(this);
		
		b_ce.setOnClickListener(this);
		b_del.setOnClickListener(this);
		b_dot.setOnClickListener(this);
		b_ent.setOnClickListener(this);
		b_pow.setOnClickListener(this);
		b_rt.setOnClickListener(this);
		b_per.setOnClickListener(this);
		bm.setOnClickListener(this);
		
		ba.setOnClickListener(this);

		bd.setOnClickListener(this);
		bs.setOnClickListener(this);
			
	}
public void tgb(View view){
	boolean a=((ToggleButton) view).isChecked();

	if(a==true){
		Intent in=new Intent(this,ScientificActivity.class);
		startActivity(in);
	}
	
}
	public void onClick(View v) {
		// TODO Auto-generated method stub{
		
		if(sl=='+'||sl=='-'||sl=='*'||sl=='/'||sl=='^'){
			 
			
			 if(tim==0){t=result;
			 result="";}tim++;
			 switch(v.getId())
				{
				case R.id.button0:
					if(enta==1){
						result="";
						sl='0';tim=0;
						 t="";enta=0;
					}else{
					result+="0";res.setText(result);
					}
					break;
				
				
			case R.id.button1:	if(enta==1){
				result="";
				sl='0';tim=0;
				 t="";enta=0;
			}else{result+="1";res.setText(result);}

			break;

		case R.id.Button2:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="2";res.setText(result);}

		break;

		case R.id.Button3:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="3";res.setText(result);}

		break;

		case R.id.Button4:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="4";res.setText(result);}

		break;

		case R.id.Button5:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="5";res.setText(result);}

		break;

		case R.id.Button6:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="6";res.setText(result);}

		break;

		case R.id.Button7:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="7";res.setText(result);}

		break;
		case R.id.Button8:	if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{result+="8";res.setText(result);}

		break;
		case R.id.Button9:		if(enta==1){
			result="";
			sl='0';tim=0;
			 t="";enta=0;
		}else{
			result+="9";res.setText(result);}
		break;

		case R.id.button_dota:int count=0;
			for(int i=0;i<result.length();i++){
				char b=result.charAt(i);
				if(b=='.'){
					count++;
				}}
			if(count==0){
			result+=".";}res.setText(result);
		break;		
		case R.id.btn_del:try{
			int c=result.length()-1;if(result.length()>0){
			result=result.substring(0,c);res.setText(result);}}
		catch(Exception e){}if(result.length()==0)
		{
			result="";res.setText(result);
		}

		break;
		case R.id.buttonce:
			result="0";res.setText(result);
			sl='0';enta=0;tim=0;t="";
		break;	
		case R.id.buttonadd:if(enta==1){
			sl='+';enta=0;tim=0;
		}else{if(result!=""){
			 
				
			if(sl=='*'){
			Double f3=Double.parseDouble(result)*Double.parseDouble(t);
			 result=f3.toString();res.setText(result);tim=0;sl='+';tim=0;break;}
			if(sl=='-'){Double f2=Double.parseDouble(t)-Double.parseDouble(result);
			 result=f2.toString();res.setText(result);	tim=0;sl='+';tim=0;break;}
			if(sl=='+'){Double f2=Double.parseDouble(t)+Double.parseDouble(result);
			 result=f2.toString();	res.setText(result);tim=0;sl='+';tim=0;break;}
			if(sl=='/'){	
				 Double f4=Double.parseDouble(t)/Double.parseDouble(result);
				 result=f4.toString();res.setText(result);tim=0;sl='+';tim=0;break;}
			 if(sl=='^'){Double f5=Math.pow(Double.parseDouble(t),Double.parseDouble(result));
			 result=f5.toString();tim=0;sl='+';break;}
		}}
		break;
		case R.id.buttonmi:if(enta==1){
			sl='-';enta=0;tim=0;
		}else{if(result!=""){
			
			if(sl=='/'){	
				 Double f4=Double.parseDouble(t)/Double.parseDouble(result);
				 result=f4.toString();res.setText(result);tim=0;sl='-';tim=0;break;}	
			if(sl=='*'){
			Double f3=Double.parseDouble(result)*Double.parseDouble(t);
			 result=f3.toString();res.setText(result);tim=0;sl='-';	tim=0;break;}
			if(sl=='-'){Double f2=Double.parseDouble(t)-Double.parseDouble(result);
			 result=f2.toString();res.setText(result);	tim=0;sl='-';tim=0;break;}
			if(sl=='+'){Double f2=Double.parseDouble(t)+Double.parseDouble(result);
			 result=f2.toString();	res.setText(result);tim=0;sl='-';tim=0;break;}
			 if(sl=='^'){Double f5=Math.pow(Double.parseDouble(t),Double.parseDouble(result));
			 result=f5.toString();tim=0;sl='-';break;}
		}}
		break;
		case R.id.buttonml:if(enta==1){
			sl='*';enta=0;tim=0;
		}else{if(result!=""){ 
			if(sl=='/'){	
				 Double f4=Double.parseDouble(t)/Double.parseDouble(result);
				 result=f4.toString();res.setText(result);tim=0;sl='*';tim=0;break;}	
			if(sl=='*'){
			Double f3=Double.parseDouble(result)*Double.parseDouble(t);
			 result=f3.toString();res.setText(result);tim=0;sl='*';tim=0;break;	}
			if(sl=='-'){Double f2=Double.parseDouble(t)-Double.parseDouble(result);
			 result=f2.toString();res.setText(result);	tim=0;sl='*';tim=0;break;}
			if(sl=='+'){Double f2=Double.parseDouble(t)+Double.parseDouble(result);
			 result=f2.toString();res.setText(result);	tim=0;sl='*';tim=0;break;}
			 if(sl=='^'){Double f5=Math.pow(Double.parseDouble(t),Double.parseDouble(result));
			 result=f5.toString();tim=0;sl='*';break;}
			
			
		}}
		break;
		case R.id.buttondv:if(enta==1){
			sl='/';enta=0;tim=0;
		}else{if(result!=""){
			
		if(sl=='/'){	
			 Double f4=Double.parseDouble(t)/Double.parseDouble(result);
			 result=f4.toString();res.setText(result);tim=0;sl='/';tim=0;break;}	
		if(sl=='*'){
		Double f3=Double.parseDouble(result)*Double.parseDouble(t);
		 result=f3.toString();res.setText(result);tim=0;sl='/';	tim=0;break;}
		if(sl=='-'){Double f2=Double.parseDouble(t)-Double.parseDouble(result);
		 result=f2.toString();	res.setText(result);tim=0;sl='/';tim=0;break;}
		if(sl=='+'){Double f2=Double.parseDouble(t)+Double.parseDouble(result);
		 result=f2.toString();res.setText(result);	tim=0;sl='/';tim=0;break;}
		 if(sl=='^'){Double f5=Math.pow(Double.parseDouble(t),Double.parseDouble(result));
		 result=f5.toString();tim=0;sl='/';break;}
		}
		}
		break;
		case R.id.buttonpow:if(enta==1){
			sl='^';enta=0;tim=0;
		}else{
			if(result!=""){
				
				if(sl=='/'){	
					 Double f4=Double.parseDouble(t)/Double.parseDouble(result);
					 result=f4.toString();res.setText(result);tim=0;sl='^';tim=0;break;}	
				if(sl=='*'){
				Double f3=Double.parseDouble(result)*Double.parseDouble(t);
				 result=f3.toString();res.setText(result);tim=0;sl='^';	tim=0;break;}
				if(sl=='-'){Double f2=Double.parseDouble(t)-Double.parseDouble(result);
				 result=f2.toString();	res.setText(result);tim=0;sl='^';tim=0;break;}
				if(sl=='+'){Double f2=Double.parseDouble(t)+Double.parseDouble(result);
				 result=f2.toString();res.setText(result);	tim=0;sl='^';tim=0;break;}
			 if(sl=='^'){Double f5=Math.pow(Double.parseDouble(t),Double.parseDouble(result));
			 result=f5.toString();tim=0;sl='^';break;}
			 }
			}	
		break;
		case R.id.buttonrt:	if(result!=""){if(Double.parseDouble(result)>=0){
			Double d=(Math.sqrt(Double.parseDouble(result)));
		result=d.toString();res.setText(result);}else{
			Toast.makeText(getApplicationContext(),"Square Roots of Negative Values : Not Defined",Toast.LENGTH_SHORT).show();
		}}
		break;
		case R.id.buttonent:
enta=1;

			if(result!=""){
			
			 if(sl=='+'){
				 Double f=Double.parseDouble(result)+Double.parseDouble(t);
				 result=f.toString();
				 
					res.setText(result);
			 }if(sl=='-'){
				 Double f=Double.parseDouble(t)-Double.parseDouble(result);
				 result=f.toString();
					res.setText(result);
			 }if(sl=='*'){
				 Double f=Double.parseDouble(result)*Double.parseDouble(t);
				 result=f.toString();
					res.setText(result);
			 }if(sl=='/'){
				 Double f=Double.parseDouble(t)/Double.parseDouble(result);
				 result=f.toString();
					res.setText(result);
			 }
			 if(sl=='^'){
				 Double f=Math.pow(Double.parseDouble(t),Double.parseDouble(result));
				 result=f.toString();
					res.setText(result);
			 }
			
				}
			
			else{res.setText(t);}
			break;
		
		}
		}
		
		if(sl=='0'){
	
				switch(v.getId())
		{
		case R.id.button0:result+="0";res.setText(result);
			
			break;
case R.id.button1:result+="1";res.setText(result);
break;

case R.id.Button2:result+="2";res.setText(result);
break;

case R.id.Button3:result+="3";res.setText(result);
break;

case R.id.Button4:result+="4";res.setText(result);
break;

case R.id.Button5:result+="5";res.setText(result);
break;

case R.id.Button6:result+="6";res.setText(result);
break;

case R.id.Button7:result+="7";res.setText(result);
break;

case R.id.Button8:result+="8";res.setText(result);
break;
case R.id.Button9:	
	result+="9";res.setText(result);
break;

case R.id.button_dota:int count=0;
	for(int i=0;i<result.length();i++){
		char b=result.charAt(i);
		if(b=='.'){
			count++;
		}}
	if(count==0){
	result+=".";res.setText(result);}
break;		
case R.id.btn_del:try{
	int c=result.length()-1;if(result.length()>0){
	result=result.substring(0,c);res.setText(result);}}
catch(Exception e){}if(result.length()==0)
{
	result="";res.setText(result);
}

break;
case R.id.buttonce:
	result="0";res.setText(result);
break;	
case R.id.buttonadd:sl='+';

break;
case R.id.buttonmi:sl='-';

break;
case R.id.buttonml:sl='*';
break;

case R.id.buttondv:sl='/';
break;
case R.id.buttonpow:sl='^';
break;
case R.id.buttonent:res.setText(result);
break;

case R.id.buttonrt:if(result!=""){	if(Double.parseDouble(result)>=0){
	Double d=(Math.sqrt(Double.parseDouble(result)));
result=d.toString();res.setText(result);}else{
	Toast.makeText(getApplicationContext(),"Square Roots of Negative Values : Not Defined",Toast.LENGTH_SHORT).show();
}}
break;
		}	
		}
	}
	}
