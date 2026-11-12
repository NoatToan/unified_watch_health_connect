package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* JADX INFO: loaded from: classes16.dex */
public class MeasureListView extends ListView {
    public MeasureListView(Context context) {
        super(context);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public MeasureListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeasureListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
