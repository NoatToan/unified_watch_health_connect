package com.xiaomi.wearable.play.core.controller;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cil;
import defpackage.dwc;
import defpackage.l0i;
import defpackage.u0i;
import defpackage.vta;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PlayerControllerViewBase extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0i f14428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f14429b;
    public View.OnClickListener c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerControllerViewBase.this.f14428a.n(view);
        }
    }

    public PlayerControllerViewBase(Context context) {
        super(context);
        this.f14429b = Boolean.FALSE;
        this.c = new a();
        d();
        b();
        c();
    }

    public static PlayerControllerViewBase a(Context context) {
        try {
            return (PlayerControllerViewBase) Class.forName(cil.d().e().get(6)).getConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
            return new PlayerControllerView(context);
        }
    }

    public final void b() {
        this.f14428a = new u0i(this);
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(String str, String str2);

    public abstract void f(int i, int i2);

    public abstract void g();

    public abstract View getAnimationView();

    public abstract void h(String str);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14428a.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f14428a.v();
        super.onDetachedFromWindow();
    }

    public void setFullScreenController(vta vtaVar) {
        this.f14428a.r(vtaVar);
    }

    public void setLock(Boolean bool) {
        this.f14429b = bool;
    }

    public abstract void setPlayImage(boolean z);

    public void setPlayer(dwc dwcVar) {
        this.f14428a.u(dwcVar);
    }

    public abstract void setSeekBar(int i);

    public abstract void setViewData(l0i l0iVar);
}
