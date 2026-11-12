package com.xiaomi.fitness.baseui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.gki;
import defpackage.loi;
import defpackage.vli;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class BottomButtonV6 extends MLTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11672b;
    public int c;
    public int d;

    public BottomButtonV6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11672b = 0;
        this.c = 0;
        this.d = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.K6);
        this.f11672b = typedArrayObtainStyledAttributes.getInteger(z4j.M6, 0);
        this.c = typedArrayObtainStyledAttributes.getInteger(z4j.L6, 0);
        g();
        f();
        int i = this.d;
        if (i != 1) {
            if (i == 2 && !isInEditMode()) {
                getPaint().setFakeBoldText(true);
            }
        } else if (!isInEditMode()) {
            getPaint().setFakeBoldText(false);
        }
        setTextSize(0, getResources().getDimension(vli.f37007a));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    @TargetApi(11)
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isEnabled()) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.5f);
        }
    }

    public final void f() {
        int i = this.c;
        if (i == 0) {
            setBackgroundResource(loi.m);
            return;
        }
        if (i == 1) {
            setBackgroundResource(loi.l);
        } else if (i == 2) {
            setBackgroundResource(loi.l);
        } else {
            if (i != 3) {
                return;
            }
            setBackgroundResource(loi.o);
        }
    }

    public final void g() {
        int i = this.f11672b;
        if (i == 0) {
            setTextColor(getResources().getColor(gki.p));
        } else {
            if (i != 1) {
                return;
            }
            setTextColor(getResources().getColor(gki.w));
        }
    }

    public void setButtonStyle(int i) {
        this.f11672b = i;
        g();
        f();
    }
}
