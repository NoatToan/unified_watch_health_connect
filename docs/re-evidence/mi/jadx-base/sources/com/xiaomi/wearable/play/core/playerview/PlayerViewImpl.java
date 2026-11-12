package com.xiaomi.wearable.play.core.playerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.xiaomi.wearable.play.core.PlayerView;
import com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase;
import com.xiaomi.wearable.play.core.videoview.PlayerVideoView;
import defpackage.a1i;
import defpackage.b1i;
import defpackage.c1i;
import defpackage.cil;
import defpackage.g1i;
import defpackage.ghl;
import defpackage.h1i;
import defpackage.vta;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerViewImpl extends PlayerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerVideoView f14431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerControllerViewBase f14432b;
    public FrameLayout c;
    public boolean d;
    public h1i e;
    public g1i f;
    public c1i g;

    public PlayerViewImpl(Context context) {
        this(context, null);
    }

    public final void a(Context context) {
        cil.d().g(context);
        c(context);
        b(context);
        b1i.d().f();
    }

    public final void b(Context context) {
        this.f14432b.setPlayer(this.f14431a);
        c1i c1iVar = new c1i(this.c);
        this.g = c1iVar;
        c1iVar.i();
        h1i h1iVar = new h1i(context, this);
        this.e = h1iVar;
        h1iVar.b(context);
        g1i g1iVar = new g1i(this);
        this.f = g1iVar;
        g1iVar.e(getContext());
    }

    public final void c(Context context) {
        removeAllViews();
        this.f14431a = new PlayerVideoView(context);
        this.f14432b = PlayerControllerViewBase.a(context);
        this.c = new FrameLayout(context);
        addView(this.f14431a, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f14432b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public boolean d() {
        return this.d;
    }

    public void e() {
        this.d = false;
        a1i.f526b = false;
        PlayerVideoView playerVideoView = this.f14431a;
        if (playerVideoView != null) {
            playerVideoView.t();
        }
    }

    public void f() {
        PlayerVideoView playerVideoView;
        this.d = true;
        a1i.f526b = true;
        if (this.f.h(getContext()) || this.f.f(getContext()) || ghl.c.a(getContext()) || (playerVideoView = this.f14431a) == null) {
            return;
        }
        playerVideoView.u();
    }

    @Override // com.xiaomi.wearable.play.core.PlayerView
    public long getCurrentPosition() {
        return this.f14431a.getCurrentPosition();
    }

    @Override // com.xiaomi.wearable.play.core.PlayerView
    public long getDuration() {
        return this.f14431a.getDuration();
    }

    @Override // com.xiaomi.wearable.play.core.PlayerView
    public void setFullScreenController(vta vtaVar) {
        this.f14432b.setFullScreenController(vtaVar);
    }

    @Override // com.xiaomi.wearable.play.core.PlayerView
    public void setLock(Boolean bool) {
        this.f14432b.setLock(bool);
    }

    public PlayerViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"NewApi"})
    public PlayerViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        a(context);
    }
}
