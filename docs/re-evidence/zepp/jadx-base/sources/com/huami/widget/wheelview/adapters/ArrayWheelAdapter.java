package com.huami.widget.wheelview.adapters;

import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public class ArrayWheelAdapter<T> extends AbstractWheelTextAdapter {
    private T[] d;

    public ArrayWheelAdapter(Context context, T[] tArr) {
        super(context);
        this.d = tArr;
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
        if (i < 0) {
            return null;
        }
        T[] tArr = this.d;
        if (i >= tArr.length) {
            return null;
        }
        T t = tArr[i];
        return t instanceof CharSequence ? (CharSequence) t : t.toString();
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        return this.d.length;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return false;
    }
}
