package com.roomorama.caldroid;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public class SquareTextView extends CellView {
    public SquareTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i14);
    }

    @Override // android.view.View
    public void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i14, i16, i17);
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
