 
package com.my.newproject3; 
import android.app.*; 
import android.os.*; 
import android.view.*; 
import android.view.View.*; 
import android.widget.*; 
import android.content.*; 
import android.content.ClipboardManager;
import android.graphics.*; 
import android.media.*; 
import android.net.*; 
import android.text.*; 
import android.utiI.*; 
import android.webkit.*; 
import android.animation.*; 
import android.view.animation.*; 
import java.util.*; 
import java.text.* 
public class MainActivity extends Activity { 
private Text View textview6; 
private Text View textview5; 
private Text View textview1; 
private EditText edittext1;  
private Text View textview2; 
private EditText edittext2; 
private Button button1; 
private WebView webview1; 
private Spinner spinner1; 
private LinearLayout linear2; 
private HorizontalScrollView hscroll1; 
private String webview ="";
 
private Timer _timer = new Timer(); 
private Intent intent = new Intent(); 
private ObjectAnimator objectanimator = new ObjectAnimator(); 
private TimerTask timer; 
private MediaPlayer mediaplayer; 
@Override 
protected void onCreate(Bundle savedlnstanceState) {  
super.onCreate(savedlnstanceState); 
setContentView(R.Iayout.main); 
Initialize(); 
initializeLogic(); 
private void initialize() { 
textview6 = (TextView) findViewByld(R. id.textview6); 
textview5 = (TextView) findViewByld(R.id.textview5);
textview1 = (TextView) findViewByld(R.id.textview1); 
edittext1= (EditText) findViewByld(R.id.edittext1); 
textview2 = (TextView) f ndViewByld(R.id.textview2); 
edittext2 = (EditText) findViewByld(R.id.edittext2); 
button 1 = (Button) find ViewByld(R.id.button1);
Webview 1 = (WebView) findViewByld(R.id.webview1); 
Webview1=.getSettings.setJavaScriptEnabIed(true); 
webview 1=getSettings().setSupportZoom(true); 
Webview1 .setWebViewClient(new Web ViewClient() { 
@Override 
public void onPageStarted(WebView _view,final String _url, Bitmap _favicon) { 
super.onPageStarted(_view, _url, _favicon); 
}
@Override 
public void onPageFinished(WebView _view,final String _url) { 
super.onPageFinished(_view, _url); 
} 
spinner1 = (Spinner) findViewByld(R.id.spinner1); 
linear2 = (LinearLayout) findViewByld(R.id.linear2); 
hscroll1= (HorizontalScroilView) findViewByld(R.id.hscroll1);  
button 1 .setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick( View _v) { 
public voidonClick(View_v) { 
webviewl .IoadUrl (“http://www.youtube.com”); 
} 
private void initializeLogic() { 
webviewl1.getSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); 

II created automatically 
private void showMessage(String _s) { 
Toast.makeText(getApplicationContext, _s, Toast.LENGTH_SHORT).show(); 
private int getLocationX( View _v)
 {  
int _location[] = new int[2]; 
_v.getLocationlnWindow(_Iocation); 
return _location[0]; 
private int getLocationY( View _v) { 
int _locationfl = new int[2]; 
_v.getLocationlnWindow(_location); 
return _location[1]; 
}
private intgetRandom(int _minValue ,int _maxValue){ 
Random random = new Random(); 
return random.nextlnt(_maxValue - _minValue + 1) + _minValue; 
public ArrayList< Double> getCheckedltemPositionsToArray(ListView _list) { 
ArrayList<Double> _result = new ArrayList<Double>; 
SparseBooleanArray _arr = _list.getCheckedltemPositionsO; 
for (mt _ildx = 0; _ildx _arr.sizeO; _ildx++) { 
if (_arr.valueAt(_ildx)) 
_result.add((double)_arr.keyAt(_ildx)); 
} 
return _result; 
private float getDip(int _input){ 
return Typed Value.applyDimension(Typed Value.COMPLEX_UNIT_DIP, _input, getResources.getDisplayMetrics);
} 
private int getDispIayWidthPixeIs(){ 
return getResources.getDispIayMetrics.widthPixeIs;
}  
private int getDisplayHeightPixels(){ 
return getResources.getDispIayMetrics.heightPixeIs; 
}
}






 



