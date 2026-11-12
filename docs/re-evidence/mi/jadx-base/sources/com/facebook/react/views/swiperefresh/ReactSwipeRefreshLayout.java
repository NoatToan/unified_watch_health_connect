package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import defpackage.exh;
import defpackage.phg;

/* JADX INFO: loaded from: classes4.dex */
public class ReactSwipeRefreshLayout extends SwipeRefreshLayout {
    public boolean Q;
    public boolean R;
    public float S;
    public int T;
    public float U;
    public boolean V;

    public ReactSwipeRefreshLayout(ReactContext reactContext) {
        super(reactContext);
        this.Q = false;
        this.R = false;
        this.S = 0.0f;
        this.T = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!w(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        phg.a(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.Q) {
            return;
        }
        this.Q = true;
        setProgressViewOffset(this.S);
        setRefreshing(this.R);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.S = f;
        if (this.Q) {
            int progressCircleDiameter = getProgressCircleDiameter();
            n(false, Math.round(exh.c(f)) - progressCircleDiameter, Math.round(exh.c(f + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        this.R = z;
        if (this.Q) {
            super.setRefreshing(z);
        }
    }

    public final boolean w(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.U);
            if (this.V || fAbs > this.T) {
                this.V = true;
                return false;
            }
        }
        return true;
    }
}
