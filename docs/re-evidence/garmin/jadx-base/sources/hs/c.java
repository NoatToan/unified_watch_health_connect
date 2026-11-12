package hs;

import e23.l;
import g22.n;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import r22.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f85316b;

    public /* synthetic */ c(p1 p1Var, int i14) {
        this.f85315a = i14;
        this.f85316b = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f85315a) {
            case 0:
                k0Var.getClass();
                h0.n(k0Var, String.valueOf(this.f85316b.f149797e));
                break;
            default:
                k0Var.getClass();
                p1 p1Var = this.f85316b;
                if (n.d(p1Var.f149796d)) {
                    h0.n(k0Var, p1Var.f149796d.toString());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
