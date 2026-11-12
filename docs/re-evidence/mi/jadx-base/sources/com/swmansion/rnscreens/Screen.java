package com.swmansion.rnscreens;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.hej;

/* JADX INFO: loaded from: classes6.dex */
public class Screen extends ViewGroup implements hej {
    public static View.OnAttachStateChangeListener g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fragment f10659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenContainer f10660b;
    public boolean c;
    public boolean d;
    public StackPresentation e;
    public StackAnimation f;

    public enum StackAnimation {
        DEFAULT,
        NONE,
        FADE
    }

    public enum StackPresentation {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL
    }

    public static class a implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            view.removeOnAttachStateChangeListener(Screen.g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactContext f10661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10662b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, ReactContext reactContext2, int i, int i2) {
            super(reactContext);
            this.f10661a = reactContext2;
            this.f10662b = i;
            this.c = i2;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            ((UIManagerModule) this.f10661a.getNativeModule(UIManagerModule.class)).updateNodeSize(Screen.this.getId(), this.f10662b, this.c);
        }
    }

    public Screen(ReactContext reactContext) {
        super(reactContext);
        this.e = StackPresentation.PUSH;
        this.f = StackAnimation.DEFAULT;
    }

    public boolean b() {
        return this.c;
    }

    public ScreenContainer getContainer() {
        return this.f10660b;
    }

    public Fragment getFragment() {
        return this.f10659a;
    }

    @Override // defpackage.hej
    public PointerEvents getPointerEvents() {
        return this.d ? PointerEvents.NONE : PointerEvents.AUTO;
    }

    public StackAnimation getStackAnimation() {
        return this.f;
    }

    public StackPresentation getStackPresentation() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(api = 21)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            while (focusedChild instanceof ViewGroup) {
                focusedChild = ((ViewGroup) focusedChild).getFocusedChild();
            }
            if (focusedChild instanceof TextView) {
                TextView textView = (TextView) focusedChild;
                if (textView.getShowSoftInputOnFocus()) {
                    textView.addOnAttachStateChangeListener(g);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearDisappearingChildren();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            ReactContext reactContext = (ReactContext) getContext();
            reactContext.runOnNativeModulesQueueThread(new b(reactContext, reactContext, i3 - i, i4 - i2));
        }
    }

    public void setActive(boolean z) {
        if (z == this.c) {
            return;
        }
        this.c = z;
        ScreenContainer screenContainer = this.f10660b;
        if (screenContainer != null) {
            screenContainer.l();
        }
    }

    public void setContainer(ScreenContainer screenContainer) {
        this.f10660b = screenContainer;
    }

    public void setFragment(Fragment fragment) {
        this.f10659a = fragment;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
    }

    public void setStackAnimation(StackAnimation stackAnimation) {
        this.f = stackAnimation;
    }

    public void setStackPresentation(StackPresentation stackPresentation) {
        this.e = stackPresentation;
    }

    public void setTransitioning(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        super.setLayerType(z ? 2 : 0, null);
    }
}
