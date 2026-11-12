package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.c;
import defpackage.g06;
import defpackage.k3j;
import defpackage.nge;
import defpackage.o7d;
import defpackage.oge;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int p = k3j.C;

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    private void s() {
        setIndeterminateDrawable(o7d.t(getContext(), (LinearProgressIndicatorSpec) this.f8776a));
        setProgressDrawable(g06.v(getContext(), (LinearProgressIndicatorSpec) this.f8776a));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f8776a).g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f8776a).h;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void o(int i, boolean z) {
        S s = this.f8776a;
        if (s != 0 && ((LinearProgressIndicatorSpec) s).g == 0 && isIndeterminate()) {
            return;
        }
        super.o(i, z);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f8776a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).h != 1 && ((c.A(this) != 1 || ((LinearProgressIndicatorSpec) this.f8776a).h != 2) && (c.A(this) != 0 || ((LinearProgressIndicatorSpec) this.f8776a).h != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        o7d<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        g06<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f8776a).g == i) {
            return;
        }
        if (q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.f8776a;
        ((LinearProgressIndicatorSpec) s).g = i;
        ((LinearProgressIndicatorSpec) s).e();
        if (i == 0) {
            getIndeterminateDrawable().w(new nge((LinearProgressIndicatorSpec) this.f8776a));
        } else {
            getIndeterminateDrawable().w(new oge(getContext(), (LinearProgressIndicatorSpec) this.f8776a));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f8776a).e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f8776a;
        ((LinearProgressIndicatorSpec) s).h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i != 1 && ((c.A(this) != 1 || ((LinearProgressIndicatorSpec) this.f8776a).h != 2) && (c.A(this) != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.i = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f8776a).e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.B);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, p);
        s();
    }
}
