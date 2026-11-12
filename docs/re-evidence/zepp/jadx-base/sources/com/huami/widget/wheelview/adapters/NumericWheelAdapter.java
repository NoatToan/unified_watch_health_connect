package com.huami.widget.wheelview.adapters;

import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public class NumericWheelAdapter extends AbstractWheelTextAdapter {
    public static final int DEFAULT_MAX_VALUE = 9;
    private static final int g = 0;
    private int d;
    private int e;
    private String f;

    public NumericWheelAdapter(Context context) {
        this(context, 0, 9);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.AbstractWheelTextAdapter
    public CharSequence getItemText(int i) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        int i2 = this.d + i;
        String str = this.f;
        return str != null ? String.format(str, Integer.valueOf(i2)) : Integer.toString(i2);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        return (this.e - this.d) + 1;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return false;
    }

    public NumericWheelAdapter(Context context, int i, int i2) {
        this(context, i, i2, null);
    }

    public NumericWheelAdapter(Context context, int i, int i2, String str) {
        super(context);
        this.d = i;
        this.e = i2;
        this.f = str;
    }
}
