package com.huami.moving.ui.sport.in;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.moving.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class d implements WheelViewAdapter {
    private List<String> a;
    private Context b;
    private WheelView c;
    private int d;
    private int e;
    private int f;
    private float g = 20.0f;
    private float h = 18.0f;
    private float i = 16.0f;

    public class a {
        public TextView a;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.content_txt);
        }
    }

    public d(Context context, WheelView wheelView, List<String> list) {
        this.b = context;
        this.a = list;
        this.c = wheelView;
        this.d = ContextCompat.getColor(context, R.color.p4);
        this.e = ContextCompat.getColor(context, R.color.s2);
        this.f = ContextCompat.getColor(context, R.color.s3);
    }

    public String a() {
        List<String> list = this.a;
        if (list != null) {
            return list.get(this.c.getRealCurrentItem());
        }
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = View.inflate(this.b, R.layout.wheel_item_normal, null);
            aVar = new a(view);
            aVar.a.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(R.dimen.distance_verify_item_height);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        TextView textView = aVar.a;
        int realCurrentItem = this.c.getRealCurrentItem();
        if (i == realCurrentItem) {
            textView.setTextColor(this.d);
            textView.setTextSize(this.g);
        } else if (i == realCurrentItem - 1 || i == realCurrentItem + 1) {
            textView.setTextColor(this.e);
            textView.setTextSize(this.h);
        } else {
            textView.setTextColor(this.f);
            textView.setTextSize(this.i);
        }
        textView.setText(this.a.get(i));
        return view;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        List<String> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
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
