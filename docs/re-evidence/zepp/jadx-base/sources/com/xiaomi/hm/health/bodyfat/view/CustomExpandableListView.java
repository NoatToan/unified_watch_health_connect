package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes19.dex */
public class CustomExpandableListView extends ExpandableListView {
    private static final String a = "CustomExpandableListView";

    public CustomExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
