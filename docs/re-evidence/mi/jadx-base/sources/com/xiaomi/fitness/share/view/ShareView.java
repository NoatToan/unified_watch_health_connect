package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bsi;

/* JADX INFO: loaded from: classes8.dex */
public class ShareView extends ConstraintLayout {
    public ShareView(Context context) {
        this(context, null, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public ShareView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setId(bsi.o6);
    }
}
