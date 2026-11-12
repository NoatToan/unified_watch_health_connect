package com.huami.sleepassistant.lib.ui.breathe.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.sleepassistant.lib.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BreathePickAdapter implements WheelViewAdapter {
    private final Context a;
    private List<Integer> b;
    private WheelView c;

    public static class ViewHolder {
        public TextView a;
    }

    public BreathePickAdapter(Context context, List<Integer> data, WheelView mWheelView) {
        this.a = context;
        this.b = data;
        this.c = mWheelView;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return this.b.size();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View convertView, ViewGroup parent) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return 1;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int index, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.a).inflate(R.layout.sls_item_wheel_view, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.a = (TextView) convertView.findViewById(R.id.content_txt);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        int realCurrentItem = this.c.getRealCurrentItem();
        if (index == realCurrentItem) {
            viewHolder.a.setTextColor(ContextCompat.getColor(this.a, R.color.white100));
        } else if (index == realCurrentItem - 1 || index == realCurrentItem + 1) {
            viewHolder.a.setTextColor(ContextCompat.getColor(this.a, R.color.sls_white_60));
        } else {
            viewHolder.a.setTextColor(ContextCompat.getColor(this.a, R.color.sls_white_60));
        }
        viewHolder.a.setText(String.valueOf(this.b.get(index)));
        return convertView;
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
    public void registerDataSetObserver(DataSetObserver observer) {
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver observer) {
    }
}
