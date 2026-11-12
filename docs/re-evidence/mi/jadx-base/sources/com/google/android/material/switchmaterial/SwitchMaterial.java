package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.i8f;
import defpackage.k3j;
import defpackage.n8f;
import defpackage.pii;
import defpackage.pmi;
import defpackage.v68;

/* JADX INFO: loaded from: classes5.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int b0 = k3j.A;
    public static final int[][] c0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final v68 U;
    public ColorStateList V;
    public ColorStateList W;
    public boolean a0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.V == null) {
            int iD = i8f.d(this, pii.s);
            int iD2 = i8f.d(this, pii.m);
            float dimension = getResources().getDimension(pmi.z0);
            if (this.U.e()) {
                dimension += ayq.i(this);
            }
            int iC = this.U.c(iD, dimension);
            int[][] iArr = c0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = i8f.h(iD, iD2, 1.0f);
            iArr2[1] = iC;
            iArr2[2] = i8f.h(iD, iD2, 0.38f);
            iArr2[3] = iC;
            this.V = new ColorStateList(iArr, iArr2);
        }
        return this.V;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.W == null) {
            int[][] iArr = c0;
            int[] iArr2 = new int[iArr.length];
            int iD = i8f.d(this, pii.s);
            int iD2 = i8f.d(this, pii.m);
            int iD3 = i8f.d(this, pii.p);
            iArr2[0] = i8f.h(iD, iD2, 0.54f);
            iArr2[1] = i8f.h(iD, iD3, 0.32f);
            iArr2[2] = i8f.h(iD, iD2, 0.12f);
            iArr2[3] = i8f.h(iD, iD3, 0.12f);
            this.W = new ColorStateList(iArr, iArr2);
        }
        return this.W;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.a0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.a0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.c0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        int i2 = b0;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.U = new v68(context2);
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.t8, i, i2, new int[0]);
        this.a0 = typedArrayH.getBoolean(b4j.u8, false);
        typedArrayH.recycle();
    }
}
