package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.ReactViewGroup;
import defpackage.f8j;
import defpackage.sk1;

/* JADX INFO: loaded from: classes6.dex */
public class RNGestureHandlerRootView extends ReactViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f8j f10629b;

    public RNGestureHandlerRootView(Context context) {
        super(context);
    }

    public static boolean a(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof RNGestureHandlerEnabledRootView) || (parent instanceof RNGestureHandlerRootView)) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        f8j f8jVar = this.f10629b;
        if (f8jVar != null) {
            f8jVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f10628a && ((f8j) sk1.c(this.f10629b)).d(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10628a = !a(this);
        if (this.f10628a && this.f10629b == null) {
            this.f10629b = new f8j((ReactContext) getContext(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f10628a) {
            ((f8j) sk1.c(this.f10629b)).h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
