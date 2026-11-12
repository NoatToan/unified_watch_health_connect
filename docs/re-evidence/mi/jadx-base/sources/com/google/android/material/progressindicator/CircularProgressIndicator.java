package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.g06;
import defpackage.k3j;
import defpackage.o7d;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int p = k3j.x;

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f8776a).i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f8776a).h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f8776a).g;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public final void s() {
        setIndeterminateDrawable(o7d.s(getContext(), (CircularProgressIndicatorSpec) this.f8776a));
        setProgressDrawable(g06.u(getContext(), (CircularProgressIndicatorSpec) this.f8776a));
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f8776a).i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f8776a;
        if (((CircularProgressIndicatorSpec) s).h != i) {
            ((CircularProgressIndicatorSpec) s).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        S s = this.f8776a;
        if (((CircularProgressIndicatorSpec) s).g != iMax) {
            ((CircularProgressIndicatorSpec) s).g = iMax;
            ((CircularProgressIndicatorSpec) s).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f8776a).e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.f30433k);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, p);
        s();
    }
}
