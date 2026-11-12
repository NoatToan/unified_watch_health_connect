package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.huami.watch.companion.util.FixTimeUtil;
import com.huami.watch.companionlib.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WheelAdapter implements WheelViewAdapter {
    public static final int MIDDLE_LARGE_NUM = 8388607;
    public static final String STYLE_MI_UI = "miui";
    public static final String STYLE_NORMAL = "normal";
    private static final String x = "PickAdapter";
    private static final int y = 16777215;
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
    private Context o;
    private int p;
    private int q;
    private String r;
    private int s;
    private String t;
    private String u;
    private Typeface v;
    private List<? extends Item> w;

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

    public WheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4) {
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

    public String getFormatStr() {
        return this.t;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return this.g;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = "normal".equals(this.r) ? this.n.inflate(R.layout.watch_wheel_item_init_userinfo, viewGroup, false) : this.n.inflate(R.layout.watch_wheel_item_normal, viewGroup, false);
            bVar = new b();
            bVar.a = (TextView) view.findViewById(R.id.content_txt);
            bVar.b = (TextView) view.findViewById(R.id.suffix);
            bVar.a.getLayoutParams().height = (int) this.e;
            Typeface typefaceCreateFromAsset = this.v;
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.o.getAssets(), "fonts/BebasKai-Regular.otf");
                this.v = typefaceCreateFromAsset;
            }
            bVar.a.setTypeface(typefaceCreateFromAsset);
            bVar.b.setTypeface(typefaceCreateFromAsset);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        TextView textView = bVar.a;
        int i2 = i % this.f;
        String string = !TextUtils.isEmpty(this.t) ? String.format(this.t, Integer.valueOf((this.l + i2) * this.p)) : String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf((this.l + i2) * this.p));
        int realCurrentItem = this.m.getRealCurrentItem();
        switch (this.q) {
            case 17:
                string = i2 != 0 ? this.o.getString(R.string.unit_afternoon) : this.o.getString(R.string.unit_forenoon);
                break;
            case 19:
                string = "." + String.format("%01d", Integer.valueOf((i2 + this.l) * 5));
                break;
            case 20:
                if (i2 == 0) {
                    string = this.o.getString(R.string.weather_temp_unit_c);
                } else if (i2 == 1) {
                    string = this.o.getString(R.string.weather_temp_unit_f);
                }
                break;
            case 21:
                string = this.w.get(i2).getValue();
                break;
            case 22:
                Context context = this.o;
                string = FixTimeUtil.formatFixTime(context, context.getResources().getIntArray(R.array.pin_time)[i2]);
                break;
            case 23:
                string = this.w.get(i2).getValue();
                break;
        }
        textView.setText(string);
        int i3 = (int) this.a;
        bVar.b.setVisibility(4);
        if (i == realCurrentItem) {
            if (!TextUtils.isEmpty(this.u)) {
                bVar.b.setVisibility(0);
                bVar.b.setText(this.u);
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
        return this.p != 0 ? (this.l + this.m.getCurrentItem()) * this.p : this.m.getCurrentItem();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return this.h;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void setAppendTxt(int i) {
        this.s = i;
    }

    public void setDataList(List<? extends Item> list) {
        this.w = list;
        this.q = 21;
    }

    public void setEndValue(int i) {
        this.k = i;
        a();
    }

    public void setFormatStr(String str) {
        this.t = str;
    }

    public void setMode(int i) {
        this.q = i;
    }

    public void setStartValue(int i) {
        this.l = i;
    }

    public void setSuffixStr(String str) {
        this.u = str;
    }

    public void setUIStyle(String str) {
        this.r = str;
    }

    public void setValueGap(int i) {
        this.p = i;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public WheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, boolean z) {
        this(context, i, i2, wheelView, i3, i4, -2003199591, z, 32, 12, 11, 9, 1);
    }

    public WheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        this(context, i, i2, wheelView, i3, i4, i5, z, i6, i7, i8, i9, 1);
    }

    public WheelAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10) {
        this.f = 0;
        this.p = 0;
        this.w = new ArrayList();
        this.o = context;
        this.l = i;
        this.k = i2;
        this.m = wheelView;
        this.n = LayoutInflater.from(context);
        this.i = i3;
        this.j = i4;
        this.d = i5;
        this.h = z;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.e = TypedValue.applyDimension(1, i6, displayMetrics);
        this.a = TypedValue.applyDimension(1, i7, displayMetrics);
        this.b = TypedValue.applyDimension(1, i8, displayMetrics);
        this.c = TypedValue.applyDimension(1, i9, displayMetrics);
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
