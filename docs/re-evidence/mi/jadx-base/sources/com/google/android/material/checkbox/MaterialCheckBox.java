package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.i8f;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.n8f;
import defpackage.pii;
import defpackage.ua4;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int h = k3j.y;
    public static final int[][] i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;
    public boolean g;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int[][] iArr = i;
            int[] iArr2 = new int[iArr.length];
            int iD = i8f.d(this, pii.m);
            int iD2 = i8f.d(this, pii.s);
            int iD3 = i8f.d(this, pii.p);
            iArr2[0] = i8f.h(iD2, iD, 1.0f);
            iArr2[1] = i8f.h(iD2, iD3, 0.54f);
            iArr2[2] = i8f.h(iD2, iD3, 0.38f);
            iArr2[3] = i8f.h(iD2, iD3, 0.38f);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.g || !TextUtils.isEmpty(getText()) || (drawableA = ua4.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (ayq.j(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            k47.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.g = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            ua4.c(this, getMaterialThemeColorsTintList());
        } else {
            ua4.c(this, null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i2) {
        int i3 = h;
        super(n8f.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.W4, i2, i3, new int[0]);
        if (typedArrayH.hasValue(b4j.X4)) {
            ua4.c(this, k8f.b(context2, typedArrayH, b4j.X4));
        }
        this.f = typedArrayH.getBoolean(b4j.Z4, false);
        this.g = typedArrayH.getBoolean(b4j.Y4, true);
        typedArrayH.recycle();
    }
}
