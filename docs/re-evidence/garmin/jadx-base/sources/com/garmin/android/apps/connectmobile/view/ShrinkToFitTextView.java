package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class ShrinkToFitTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f47515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f47516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47517c;

    public ShrinkToFitTextView(Context context) {
        super(context);
        c(context, null, 0);
    }

    public final void c(Context context, AttributeSet attributeSet, int i14) {
        this.f47515a = new Paint();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149717s, i14, 0);
            Context context2 = getContext();
            this.f47517c = typedArrayObtainStyledAttributes.getDimension(0, context2 != null ? (int) (10 * context2.getResources().getDisplayMetrics().scaledDensity) : -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f47516b = getTextSize();
    }

    public final void d(int i14, String str) {
        if (i14 <= 0 || str == null || str.length() == 0) {
            return;
        }
        int paddingLeft = (i14 - getPaddingLeft()) - getPaddingRight();
        this.f47515a.set(getPaint());
        while (true) {
            float f14 = this.f47516b;
            float f15 = this.f47517c;
            if (f14 - f15 <= 0.5f) {
                setTextSize(0, f15);
                return;
            }
            float f16 = (f14 + f15) / 2.0f;
            this.f47515a.setTextSize(f16);
            if (this.f47515a.measureText(str) >= paddingLeft) {
                this.f47516b = f16;
            } else {
                this.f47517c = f16;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        if (i14 != i16) {
            d(i14, getText().toString());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        d(getWidth(), charSequence.toString());
    }

    public void setMinTextSize(float f14) {
        this.f47517c = f14;
    }

    public ShrinkToFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet, 0);
    }

    public ShrinkToFitTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        c(context, attributeSet, i14);
    }
}
