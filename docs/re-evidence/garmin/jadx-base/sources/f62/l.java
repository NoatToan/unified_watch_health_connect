package f62;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf62/l;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f69268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f69269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f69271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.y0 f69272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f69273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.y0 f69274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f69275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.y0 f69276i;

    public l() {
        o13.t tVarB = o13.m.b(new ey0.a(22));
        this.f69271d = tVarB;
        this.f69272e = (androidx.lifecycle.y0) tVarB.getValue();
        o13.t tVarB2 = o13.m.b(new ey0.a(23));
        this.f69273f = tVarB2;
        this.f69274g = (androidx.lifecycle.y0) tVarB2.getValue();
        o13.t tVarB3 = o13.m.b(new ey0.a(24));
        this.f69275h = tVarB3;
        this.f69276i = (androidx.lifecycle.y0) tVarB3.getValue();
    }

    public static x52.h x4(i iVar) {
        if (iVar == null) {
            return null;
        }
        x52.h hVar = x52.h.f189116c;
        if (iVar.equals(hVar.f189123a)) {
            return hVar;
        }
        x52.h hVar2 = x52.h.f189117d;
        if (iVar.equals(hVar2.f189123a)) {
            return hVar2;
        }
        x52.h hVar3 = x52.h.f189118e;
        if (iVar.equals(hVar3.f189123a)) {
            return hVar3;
        }
        x52.h hVar4 = x52.h.f189119f;
        if (iVar.equals(hVar4.f189123a)) {
            return hVar4;
        }
        x52.h hVar5 = x52.h.f189120g;
        if (iVar.equals(hVar5.f189123a)) {
            return hVar5;
        }
        if (zf.b.D(iVar.f69253a)) {
            return null;
        }
        return x52.h.f189121h;
    }

    public final i y4() {
        i iVar = this.f69268a;
        if (iVar != null) {
            return iVar;
        }
        p005kotlin.jvm.internal.s.m("poolSize");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z4(x52.h hVar) {
        hVar.getClass();
        i iVarY4 = y4();
        i iVar = hVar.f189123a;
        if (iVarY4.equals(iVar)) {
            return true;
        }
        if (iVar.f69253a == null && y4().f69253a == null) {
            return true;
        }
        x52.h hVar2 = (x52.h) this.f69272e.d();
        if (hVar2 != null) {
            return hVar2.f189124b;
        }
        return false;
    }
}
