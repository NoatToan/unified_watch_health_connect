package com.roomorama.caldroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WeekdayArrayAdapter extends ArrayAdapter<String> {
    public static int textColor = -3355444;

    public WeekdayArrayAdapter(Context context, int i14, List<String> list) {
        super(context, i14, list);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        TextView textView = (TextView) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.weekday_textview, (ViewGroup) null);
        textView.setText((String) getItem(i14));
        textView.setTextColor(textColor);
        textView.setGravity(17);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i14) {
        return false;
    }
}
