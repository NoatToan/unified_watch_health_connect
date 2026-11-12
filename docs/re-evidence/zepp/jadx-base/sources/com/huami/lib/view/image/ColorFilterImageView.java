package com.huami.lib.view.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
public class ColorFilterImageView extends AppCompatImageView {
    private static final int b = -1;
    private final int a;

    public ColorFilterImageView(Context context) {
        this(context, null);
    }

    private void a() {
        int i = this.a;
        if (i == -1) {
            return;
        }
        setColorFilter(i, PorterDuff.Mode.OVERLAY);
    }

    public ColorFilterImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorFilterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorFilterImageView, i, 0);
        this.a = typedArrayObtainStyledAttributes.getColor(R.styleable.ColorFilterImageView_filter_color, -1);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
