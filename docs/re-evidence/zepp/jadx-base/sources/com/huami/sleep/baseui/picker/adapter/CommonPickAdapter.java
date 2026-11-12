package com.huami.sleep.baseui.picker.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.sleep.R;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CommonPickAdapter implements WheelViewAdapter {
    public static final int MIDDLE_LARGE_NUM = 8388607;
    public static final String STYLE_MI_UI = "miui";
    public static final String STYLE_NORMAL = "normal";
    public static final int TYPEFACE_DIN_MED = 1;
    public static final int TYPEFACE_KM = 3;
    public static final int TYPEFACE_PT_DIN = 2;
    private static final String r = "CommonPickAdapter";
    private static final int s = 16777215;
    private int a;
    private boolean b;
    private float c;
    private float d;
    private float e;
    private int f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private WheelView m;
    private LayoutInflater n;
    private int o;
    private String p;
    private int q;

    public class a {
        public TextView a;

        private a() {
        }
    }

    public CommonPickAdapter(Context context, int count, WheelView wheelView, int centerColor, int normalColor) {
        this(context, count, wheelView, centerColor, normalColor, false);
    }

    private static String a(String content) {
        try {
            return new DecimalFormat("#,###").format(Integer.valueOf(content).intValue());
        } catch (Exception e) {
            HMLog.e(r, e.getMessage(), new Object[0]);
            return content;
        }
    }

    private void b() {
        int i = this.h;
        this.i = i * (8388607 / i);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return this.h;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View convertView, ViewGroup parent) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return this.i;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int index, View convertView, ViewGroup parent) {
        RelativeLayout relativeLayout = (RelativeLayout) convertView;
        int i = index % this.h;
        if (relativeLayout == null) {
            int i2 = this.a;
            if (i2 == 1) {
                relativeLayout = (RelativeLayout) this.n.inflate(R.layout.wheel_item_din_med, parent, false);
            } else if (i2 == 2) {
                relativeLayout = (RelativeLayout) this.n.inflate(R.layout.wheel_item_pt_din, parent, false);
            } else {
                relativeLayout = i2 == 3 ? (RelativeLayout) this.n.inflate(R.layout.wheel_item_km, parent, false) : (RelativeLayout) this.n.inflate(R.layout.wheel_item_normal, parent, false);
            }
            a aVar = new a();
            TextView textView = (TextView) relativeLayout.findViewById(R.id.content_txt);
            aVar.a = textView;
            textView.getLayoutParams().height = (int) this.g;
            relativeLayout.setTag(aVar);
        }
        TextView textView2 = ((a) relativeLayout.getTag()).a;
        String itemString = getItemString(index);
        int realCurrentItem = this.m.getRealCurrentItem();
        HMLog.d(r, "index = " + index + ", realCurIndex =" + realCurrentItem + ", pos=" + i, new Object[0]);
        if (this.b) {
            itemString = a(itemString);
        }
        textView2.setText(itemString);
        int i3 = (int) this.c;
        if (index == realCurrentItem) {
            textView2.setTextColor(this.k);
        } else if (index == realCurrentItem - 1 || index == realCurrentItem + 1) {
            i3 = (int) this.d;
            textView2.setTextColor(this.l);
        } else {
            i3 = (int) this.e;
            textView2.setTextColor(this.f);
        }
        textView2.setTextSize(i3);
        return relativeLayout;
    }

    public abstract String getItemString(int index);

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        if (this.j) {
            return 16777215;
        }
        return this.h;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return this.j;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver observer) {
    }

    public void setAppendTxt(int appendTxtResId) {
        this.q = appendTxtResId;
    }

    public void setThousandsSeparators(boolean thousandsSeparators) {
        this.b = thousandsSeparators;
    }

    public void setTypeface(int Typeface) {
        this.a = Typeface;
    }

    public void setUIStyle(String style) {
        this.p = style;
    }

    public void setValueGap(int valueGap) {
        this.o = valueGap;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver observer) {
    }

    public CommonPickAdapter(Context context, int count, WheelView wheelView, int centerColor, int normalColor, boolean needLoop) {
        this(context, count, wheelView, centerColor, normalColor, -2003199591, needLoop, 32, 11, 10, 9, 1);
    }

    public CommonPickAdapter(Context context, int count, WheelView wheelView, int centerColor, int normalColor, int normalColorLight, boolean neewLoop, int itemHeightDP, int centerTextSizeDp, int normalTextSizeDp, int normalLightTextDp) {
        this(context, count, wheelView, centerColor, normalColor, normalColorLight, neewLoop, itemHeightDP, centerTextSizeDp, normalTextSizeDp, normalLightTextDp, 1);
    }

    public CommonPickAdapter(Context context, int count, WheelView wheelView, int centerColor, int normalColor, int normalColorLight, boolean neewLoop, int itemHeightDP, int centerTextSizeDp, int normalTextSizeDp, int normalLightTextDp, int valueGap) {
        this(context, count, wheelView, centerColor, normalColor, normalColorLight, neewLoop, itemHeightDP, centerTextSizeDp, normalTextSizeDp, normalLightTextDp, valueGap, 3);
    }

    public CommonPickAdapter(Context context, int count, WheelView wheelView, int centerColor, int normalColor, int normalColorLight, boolean neewLoop, int itemHeightDP, int centerTextSizeDp, int normalTextSizeDp, int normalLightTextDp, int valueGap, int typeface) {
        this.a = 3;
        this.b = false;
        this.h = 0;
        this.o = 1;
        this.m = wheelView;
        this.n = LayoutInflater.from(context);
        this.k = centerColor;
        this.l = normalColor;
        this.f = normalColorLight;
        this.j = neewLoop;
        this.g = TypedValue.applyDimension(1, itemHeightDP, context.getResources().getDisplayMetrics());
        this.c = centerTextSizeDp;
        this.d = normalTextSizeDp;
        this.e = normalLightTextDp;
        setValueGap(valueGap);
        this.h = count;
        this.i = count * (8388607 / count);
        this.a = typeface;
    }
}
