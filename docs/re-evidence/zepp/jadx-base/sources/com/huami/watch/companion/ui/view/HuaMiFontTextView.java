package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes16.dex */
public class HuaMiFontTextView extends AppCompatTextView {
    public HuaMiFontTextView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/HuaMi.ttf"));
    }

    public HuaMiFontTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HuaMiFontTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
