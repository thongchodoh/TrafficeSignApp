package sdu.cs58.wipawee.trafficesignapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//class ทำหน้าที่สร้าง Layout เสมือนเพื่อนำไปแสดงผลบนหน้า Activity
public class MyAdapter extends BaseAdapter{
    //Explicit ประกาศตัวแปล
    private Context context;
    private int[] ints;//เก็บข้อมูลโลโก้ป้ายจราจร
    private String[] titleStrings, detailStrings;//เก็บข้อมูลชื่อกับรายละเอียดของข้อมูลป้ายจราจร

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {//นับจำนวนข้อมูลในArrayแล้วส่งข้อมูลไปยัง getView()
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//รับข้อมูลจาก Method getCount() มาแสดงผล
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        //ผููกตัวแปลบน JAVA กับอิลิเมนท์บน XML หน้าที่ my_listview
        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);

        //show Data นำข้อมูลไปแสดงผลบนแอป
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        return view1;
    }
}//end class
