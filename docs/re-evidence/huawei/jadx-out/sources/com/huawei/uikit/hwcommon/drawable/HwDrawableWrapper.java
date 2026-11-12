package com.huawei.uikit.hwcommon.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.DrawableWrapper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes44.dex */
public class HwDrawableWrapper extends DrawableWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f29364b;
    private OnStateChangedListener d;
    private int[] e;

    public interface OnStateChangedListener {
        void onStateChanged(int[] iArr, int[] iArr2, int i, int i2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f29364b.isStateful();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (getDrawable() != null) {
            int colorForState = this.f29364b.getColorForState(iArr, 0);
            int colorForState2 = this.f29364b.getColorForState(this.e, 0);
            OnStateChangedListener onStateChangedListener = this.d;
            if (onStateChangedListener != null) {
                onStateChangedListener.onStateChanged(iArr, this.e, colorForState, colorForState2);
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        int[] state = getState();
        this.e = Arrays.copyOf(state, state.length);
        return super.setState(iArr);
    }
}
