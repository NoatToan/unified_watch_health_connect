package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.react.ReactRootView;
import com.facebook.react.a;
import defpackage.f8j;

/* JADX INFO: loaded from: classes6.dex */
public class RNGestureHandlerEnabledRootView extends ReactRootView {
    public a t;
    public f8j u;

    public RNGestureHandlerEnabledRootView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f8j f8jVar = this.u;
        if (f8jVar == null || !f8jVar.d(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.facebook.react.ReactRootView
    public void o(a aVar, String str, Bundle bundle) {
        super.o(aVar, str, bundle);
        this.t = aVar;
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        f8j f8jVar = this.u;
        if (f8jVar != null) {
            f8jVar.h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void s() {
        if (this.u != null) {
            t();
        }
        this.u = new f8j(this.t.C(), this);
    }

    public void t() {
        f8j f8jVar = this.u;
        if (f8jVar != null) {
            f8jVar.i();
            this.u = null;
        }
    }

    public RNGestureHandlerEnabledRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
