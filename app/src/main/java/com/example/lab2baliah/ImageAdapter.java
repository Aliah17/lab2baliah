package com.example.lab2baliah;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.b773cc9641eff8f93e12606fd43d6b0f, R.drawable.bc7a36e6e24c1a55507e3ed11c1cc0a2, R.drawable.cf5f7dca8d30d52a39f4043f3796d7f0,
            R.drawable.d1b8846c3fa47d27584e32534e792711, R.drawable.f96a8e6a33606dcfd64b873a990385a3, R.drawable.e13bd3b01b0a8f88254c473e64e22b4c,
            R.drawable.fbada851adb803bcddcbe1367dfadd, R.drawable.cae4b1c16980cc4e50bb0545f0835bb, R.drawable.aab042f7a5e4992947b3ec7a5dd381,
    };

    public ImageAdapter(Context c){ mContext = c; }

    @Override
    public int getCount() { return thumbImages.length; }

    @Override
    public Object getItem(int position) { return thumbImages[position]; }

    @Override
    public long getItemId(int position){ return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams( new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
