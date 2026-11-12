package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes9.dex */
public class SelectorImageView extends AppCompatImageView {
    public SelectorImageView(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (z) {
            setAlpha(0.85f);
        } else {
            setAlpha(1.0f);
        }
    }

    public SelectorImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectorImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
