package com.huami.widget.typeface;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes17.dex */
public class TypefaceTextView extends AppCompatTextView {
    public TypefaceTextView(Context context) {
        super(context);
    }

    private void a(AttributeSet attributeSet) {
        TypefaceManager.get().applyTypeface(this, attributeSet);
    }

    public TypefaceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public TypefaceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
