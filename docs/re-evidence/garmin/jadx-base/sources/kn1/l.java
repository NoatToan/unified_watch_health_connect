package kn1;

import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b10.b f105678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f105679c;

    public /* synthetic */ l(b10.b bVar, Integer num, int i14) {
        this.f105677a = i14;
        this.f105678b = bVar;
        this.f105679c = num;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f105677a) {
            case 0:
                k0Var.getClass();
                h0.n(k0Var, this.f105678b.f(this.f105679c));
                break;
            default:
                k0Var.getClass();
                h0.n(k0Var, this.f105678b.f(this.f105679c));
                break;
        }
        return Unit.INSTANCE;
    }
}
