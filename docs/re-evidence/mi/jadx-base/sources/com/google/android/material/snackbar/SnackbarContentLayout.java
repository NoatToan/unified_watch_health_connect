package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import defpackage.i8f;
import defpackage.iqi;
import defpackage.ki4;
import defpackage.pii;
import defpackage.pmi;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ki4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f8829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f8830b;
    public int c;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public static void d(View view, int i, int i2) {
        if (c.W(view)) {
            c.J0(view, c.F(view), i, c.E(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // defpackage.ki4
    public void a(int i, int i2) {
        this.f8829a.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f8829a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f8830b.getVisibility() == 0) {
            this.f8830b.setAlpha(0.0f);
            this.f8830b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // defpackage.ki4
    public void b(int i, int i2) {
        this.f8829a.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f8829a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f8830b.getVisibility() == 0) {
            this.f8830b.setAlpha(1.0f);
            this.f8830b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void c(float f) {
        if (f != 1.0f) {
            this.f8830b.setTextColor(i8f.h(i8f.d(this, pii.s), this.f8830b.getCurrentTextColor(), f));
        }
    }

    public final boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f8829a.getPaddingTop() == i2 && this.f8829a.getPaddingBottom() == i3) {
            return z;
        }
        d(this.f8829a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f8830b;
    }

    public TextView getMessageView() {
        return this.f8829a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8829a = (TextView) findViewById(iqi.Y);
        this.f8830b = (Button) findViewById(iqi.X);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(pmi.n);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pmi.m);
        boolean z = this.f8829a.getLayout().getLineCount() > 1;
        if (!z || this.c <= 0 || this.f8830b.getMeasuredWidth() <= this.c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.c = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
