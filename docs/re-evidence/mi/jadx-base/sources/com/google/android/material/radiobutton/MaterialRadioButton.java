package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.i8f;
import defpackage.k3j;
import defpackage.k8f;
import defpackage.n8f;
import defpackage.pii;
import defpackage.ua4;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int g = k3j.z;
    public static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iD = i8f.d(this, pii.m);
            int iD2 = i8f.d(this, pii.p);
            int iD3 = i8f.d(this, pii.s);
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = i8f.h(iD3, iD, 1.0f);
            iArr2[1] = i8f.h(iD3, iD2, 0.54f);
            iArr2[2] = i8f.h(iD3, iD2, 0.38f);
            iArr2[3] = i8f.h(iD3, iD2, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && ua4.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            ua4.c(this, getMaterialThemeColorsTintList());
        } else {
            ua4.c(this, null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.S);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = g;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.g5, i, i2, new int[0]);
        if (typedArrayH.hasValue(b4j.h5)) {
            ua4.c(this, k8f.b(context2, typedArrayH, b4j.h5));
        }
        this.f = typedArrayH.getBoolean(b4j.i5, false);
        typedArrayH.recycle();
    }
}
