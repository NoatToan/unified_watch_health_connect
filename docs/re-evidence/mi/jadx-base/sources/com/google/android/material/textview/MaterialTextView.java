package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.b4j;
import defpackage.e8f;
import defpackage.k8f;
import defpackage.n8f;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public static boolean f(Context context) {
        return e8f.b(context, pii.e0, true);
    }

    public static int g(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, b4j.q5, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b4j.r5, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i = 0; i < iArr.length && iD < 0; i++) {
            iD = k8f.d(context, typedArray, iArr[i], -1);
        }
        return iD;
    }

    public static boolean i(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, b4j.q5, i, i2);
        int iH = h(context, typedArrayObtainStyledAttributes, b4j.s5, b4j.t5);
        typedArrayObtainStyledAttributes.recycle();
        return iH != -1;
    }

    public final void d(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, b4j.m5);
        int iH = h(getContext(), typedArrayObtainStyledAttributes, b4j.o5, b4j.p5);
        typedArrayObtainStyledAttributes.recycle();
        if (iH >= 0) {
            setLineHeight(iH);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (f(context)) {
            d(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        int iG;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (f(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (i(context2, theme, attributeSet, i, i2) || (iG = g(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            d(theme, iG);
        }
    }
}
