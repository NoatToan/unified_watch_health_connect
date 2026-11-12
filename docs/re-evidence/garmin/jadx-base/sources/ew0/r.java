package ew0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c12.h f66272b;

    public /* synthetic */ r(c12.h hVar, int i14) {
        this.f66271a = i14;
        this.f66272b = hVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f66271a) {
            case 0:
                this.f66272b.b(g0.c.f66219a);
                break;
            case 1:
                this.f66272b.b(g0.d.f66220a);
                break;
            case 2:
                this.f66272b.b(g0.b.f66218a);
                break;
            case 3:
                this.f66272b.b(jy0.v.g.f101832b);
                break;
            case 4:
                this.f66272b.b(jy0.v.h.f101833b);
                break;
            case 5:
                this.f66272b.a();
                break;
            default:
                this.f66272b.b(jy0.v.d.f101829b);
                break;
        }
        return Unit.INSTANCE;
    }
}
