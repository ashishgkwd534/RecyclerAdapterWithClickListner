package com.ags.recycleradapterclicklistner;

import android.content.Context;
import android.widget.Toast;

public class RecyclerAdaper {
    Object object;
    int layout;

    /*public RecyclerAdaper(Object object, int layout) {
        this.object = object;
        this.layout = layout;
    }*/
    public static void toastLong(Context context,String massage){
        Toast.makeText(context, massage, Toast.LENGTH_LONG).show();
    }
    public static void toastShort(Context context,String massage){
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show();
    }
}
