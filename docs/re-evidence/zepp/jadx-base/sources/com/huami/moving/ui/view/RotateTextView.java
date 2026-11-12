package com.huami.moving.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes5.dex */
public class RotateTextView extends TextView {
    private static final int b = 0;
    private int a;

    public RotateTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        canvas.rotate(360 - this.a, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setAntiColockWiseDegree(int i) {
        if (i < 0 || i > 360) {
            this.a = 0;
        } else {
            this.a = i;
        }
    }

    public RotateTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.rotate);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.rotate_anticlockwise_degree, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public RotateTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
