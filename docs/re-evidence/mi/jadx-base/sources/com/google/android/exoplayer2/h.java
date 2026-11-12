package com.google.android.exoplayer2;

import defpackage.f14;
import defpackage.lbo;
import defpackage.n0i;
import defpackage.rk1;
import defpackage.vif;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements vif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbo f7924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7925b;
    public s c;
    public vif d;
    public boolean e = true;
    public boolean f;

    public interface a {
        void onPlaybackParametersChanged(n0i n0iVar);
    }

    public h(a aVar, f14 f14Var) {
        this.f7925b = aVar;
        this.f7924a = new lbo(f14Var);
    }

    public void a(s sVar) {
        if (sVar == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public void b(s sVar) throws ExoPlaybackException {
        vif vifVar;
        vif vifVarO = sVar.o();
        if (vifVarO == null || vifVarO == (vifVar = this.d)) {
            return;
        }
        if (vifVar != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.d = vifVarO;
        this.c = sVar;
        vifVarO.d(this.f7924a.c());
    }

    @Override // defpackage.vif
    public n0i c() {
        vif vifVar = this.d;
        return vifVar != null ? vifVar.c() : this.f7924a.c();
    }

    @Override // defpackage.vif
    public void d(n0i n0iVar) {
        vif vifVar = this.d;
        if (vifVar != null) {
            vifVar.d(n0iVar);
            n0iVar = this.d.c();
        }
        this.f7924a.d(n0iVar);
    }

    public void e(long j) {
        this.f7924a.a(j);
    }

    public final boolean f(boolean z) {
        s sVar = this.c;
        return sVar == null || sVar.b() || (!this.c.isReady() && (z || this.c.f()));
    }

    public void g() {
        this.f = true;
        this.f7924a.b();
    }

    public void h() {
        this.f = false;
        this.f7924a.e();
    }

    public long i(boolean z) {
        j(z);
        return v();
    }

    public final void j(boolean z) {
        if (f(z)) {
            this.e = true;
            if (this.f) {
                this.f7924a.b();
                return;
            }
            return;
        }
        vif vifVar = (vif) rk1.e(this.d);
        long jV = vifVar.v();
        if (this.e) {
            if (jV < this.f7924a.v()) {
                this.f7924a.e();
                return;
            } else {
                this.e = false;
                if (this.f) {
                    this.f7924a.b();
                }
            }
        }
        this.f7924a.a(jV);
        n0i n0iVarC = vifVar.c();
        if (n0iVarC.equals(this.f7924a.c())) {
            return;
        }
        this.f7924a.d(n0iVarC);
        this.f7925b.onPlaybackParametersChanged(n0iVarC);
    }

    @Override // defpackage.vif
    public long v() {
        return this.e ? this.f7924a.v() : ((vif) rk1.e(this.d)).v();
    }
}
