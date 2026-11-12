package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import defpackage.aak;
import defpackage.f08;
import defpackage.sk1;
import defpackage.y8l;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f10721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f08 f10722b;
    public aak c;

    public interface a {
        void a(SafeAreaProvider safeAreaProvider, f08 f08Var, aak aakVar);
    }

    public SafeAreaProvider(Context context) {
        super(context);
    }

    public final void a() {
        f08 f08VarC = y8l.c(this);
        aak aakVarA = y8l.a((ViewGroup) getRootView(), this);
        if (f08VarC == null || aakVarA == null) {
            return;
        }
        f08 f08Var = this.f10722b;
        if (f08Var == null || this.c == null || !f08Var.a(f08VarC) || !this.c.a(aakVarA)) {
            ((a) sk1.c(this.f10721a)).a(this, f08VarC, aakVarA);
            this.f10722b = f08VarC;
            this.c = aakVarA;
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        return true;
    }

    public void setOnInsetsChangeListener(a aVar) {
        this.f10721a = aVar;
    }
}
