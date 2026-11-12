package com.huami.widget.wheelview.adapters;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes17.dex */
public interface WheelViewAdapter {
    int getBASE_BUNDLE();

    View getEmptyItem(View view, ViewGroup viewGroup);

    int getInitLoopBase();

    View getItem(int i, View view, ViewGroup viewGroup);

    int getItemsCount();

    boolean isNeedLoop();

    void registerDataSetObserver(DataSetObserver dataSetObserver);

    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
