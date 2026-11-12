package com.xiaomi.hm.health.lab.view.picker;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import com.xiaomi.hm.health.lab.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class PickerAdapter implements WheelViewAdapter {
    private Context a;
    private ArrayList<String> b;
    private WheelView c;

    public static class ViewHolder {
        public TextView a;
    }

    public PickerAdapter(Context context, ArrayList<String> arrayList, WheelView wheelView) {
        this.a = context;
        this.b = arrayList;
        this.c = wheelView;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return this.b.size();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return 1;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.lab_item_wheel_view, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.a = (TextView) view.findViewById(R.id.lab_wheel_view_content);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        int realCurrentItem = this.c.getRealCurrentItem();
        if (i == realCurrentItem) {
            viewHolder.a.setTextColor(ContextCompat.getColor(this.a, R.color.lab_temperature_red));
        } else if (i == realCurrentItem - 1 || i == realCurrentItem + 1) {
            viewHolder.a.setTextColor(ContextCompat.getColor(this.a, R.color.lab_temperature_options_out));
        } else {
            viewHolder.a.setTextColor(ContextCompat.getColor(this.a, R.color.lab_temperature_options_out));
        }
        viewHolder.a.setText(this.b.get(i));
        return view;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        return this.b.size();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return false;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
