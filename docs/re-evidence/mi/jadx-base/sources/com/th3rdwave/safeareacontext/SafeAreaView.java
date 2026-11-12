package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import defpackage.f08;
import defpackage.y8l;
import defpackage.z8l;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class SafeAreaView extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SafeAreaViewMode f10725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f08 f10726b;
    public EnumSet<SafeAreaViewEdges> c;
    public View d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f10727a;

        public a(AtomicBoolean atomicBoolean) {
            this.f10727a = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f10727a) {
                try {
                    if (this.f10727a.compareAndSet(false, true)) {
                        this.f10727a.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SafeAreaView(Context context) {
        super(context);
        this.f10725a = SafeAreaViewMode.PADDING;
    }

    public static ReactContext b(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof SafeAreaProvider) {
                return (View) parent;
            }
        }
        return this;
    }

    public final boolean d() {
        f08 f08VarC;
        f08 f08Var;
        View view = this.d;
        if (view == null || (f08VarC = y8l.c(view)) == null || ((f08Var = this.f10726b) != null && f08Var.a(f08VarC))) {
            return false;
        }
        this.f10726b = f08VarC;
        e();
        return true;
    }

    public final void e() {
        if (this.f10726b != null) {
            EnumSet<SafeAreaViewEdges> enumSetAllOf = this.c;
            if (enumSetAllOf == null) {
                enumSetAllOf = EnumSet.allOf(SafeAreaViewEdges.class);
            }
            z8l z8lVar = new z8l(this.f10726b, this.f10725a, enumSetAllOf);
            UIManagerModule uIManagerModule = (UIManagerModule) b(this).getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), z8lVar);
                f();
            }
        }
    }

    public final void f() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long jNanoTime = System.nanoTime();
        b(this).runOnNativeModulesQueueThread(new a(atomicBoolean));
        synchronized (atomicBoolean) {
            for (long jNanoTime2 = 0; !atomicBoolean.get() && jNanoTime2 < 500000000; jNanoTime2 += System.nanoTime() - jNanoTime) {
                try {
                    atomicBoolean.wait(500L);
                } catch (InterruptedException unused) {
                    atomicBoolean.set(true);
                }
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View viewA = a();
        this.d = viewA;
        viewA.getViewTreeObserver().addOnPreDrawListener(this);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.d;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zD = d();
        if (zD) {
            requestLayout();
        }
        return !zD;
    }

    public void setEdges(EnumSet<SafeAreaViewEdges> enumSet) {
        this.c = enumSet;
        e();
    }

    public void setMode(SafeAreaViewMode safeAreaViewMode) {
        this.f10725a = safeAreaViewMode;
        e();
    }
}
