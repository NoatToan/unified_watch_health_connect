package com.huami.bodymeasurements.common.business.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huami.bodymeasurements.common.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DateWheelAdapter implements WheelViewAdapter {
    public static final int MIDDLE_LARGE_NUM = 8388607;
    private static final String s = "DateWheelAdapter";
    private static final int t = 16777215;
    private float a;
    private float b;
    private float c;
    private int d;
    private float e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private WheelView m;
    private LayoutInflater n;
    private int o;
    private int p;
    private String q;
    private List<? extends Item> r;

    public interface Item {
        String getKey();

        String getValue();
    }

    public class b {
        public TextView a;
        public TextView b;

        private b() {
        }
    }

    public DateWheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4) {
        this(context, i, i2, wheelView, i3, i4, false);
    }

    private void a() {
        int i = (this.k - this.l) + 1;
        this.f = i;
        if (i <= 0) {
            this.f = 1;
        }
        int i2 = this.f;
        if (i2 == 1) {
            this.h = false;
        }
        this.g = i2 * (8388607 / i2);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return this.f;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return this.g;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.n.inflate(R.layout.bm_common_item_date_picker_wheel, viewGroup, false);
            bVar = new b();
            bVar.a = (TextView) view.findViewById(R.id.content_txt);
            bVar.b = (TextView) view.findViewById(R.id.suffix);
            bVar.a.getLayoutParams().height = (int) this.e;
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        TextView textView = bVar.a;
        int i2 = i % this.f;
        int realCurrentItem = this.m.getRealCurrentItem();
        if (this.p == 21) {
            textView.setText(this.r.get(i2).getValue());
        }
        int i3 = (int) this.a;
        bVar.b.setVisibility(4);
        if (i == realCurrentItem) {
            if (!TextUtils.isEmpty(this.q)) {
                bVar.b.setVisibility(0);
                bVar.b.setText(this.q);
                bVar.b.setTextColor(this.i);
                bVar.b.setTextSize(i3);
            }
            textView.setTextColor(this.i);
        } else if (i == realCurrentItem - 1 || i == realCurrentItem + 1) {
            i3 = (int) this.b;
            textView.setTextColor(this.j);
        } else {
            i3 = (int) this.c;
            textView.setTextColor(this.d);
        }
        textView.setTextSize(i3);
        return view;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        if (this.h) {
            return 16777215;
        }
        return this.f;
    }

    public int getRealValue() {
        return this.o != 0 ? (this.l + this.m.getCurrentItem()) * this.o : this.m.getCurrentItem();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return this.h;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void setDataList(List<? extends Item> list) {
        this.r = list;
        this.p = 21;
    }

    public void setEndValue(int i) {
        this.k = i;
        a();
    }

    public void setStartValue(int i) {
        this.l = i;
    }

    public void setValueGap(int i) {
        this.o = i;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public DateWheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, boolean z) {
        this(context, i, i2, wheelView, i3, i4, -2003199591, z, 32, 12, 11, 9, 1);
    }

    public DateWheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        this(context, i, i2, wheelView, i3, i4, i5, z, i6, i7, i8, i9, 1);
    }

    public DateWheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10) {
        this.f = 0;
        this.o = 0;
        this.r = new ArrayList();
        this.l = i;
        this.k = i2;
        this.m = wheelView;
        this.n = LayoutInflater.from(context);
        this.i = i3;
        this.j = i4;
        this.d = i5;
        this.h = z;
        this.e = TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
        this.a = i7;
        this.b = i8;
        this.c = i9;
        setValueGap(i10);
        int i11 = (this.k - this.l) + 1;
        this.f = i11;
        if (i11 <= 0) {
            this.f = 1;
        }
        int i12 = this.f;
        if (i12 == 1) {
            this.h = false;
        }
        this.g = i12 * (8388607 / i12);
    }
}
