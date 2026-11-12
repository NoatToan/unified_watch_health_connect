package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc.f f21353b;

    public /* synthetic */ o(sc.f fVar, int i14) {
        this.f21352a = i14;
        this.f21353b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f21352a) {
            case 0:
                this.f21353b.a(a.r.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                this.f21353b.a(a.l.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                this.f21353b.a(a.t.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                break;
            case 4:
                this.f21353b.a(a.x.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                this.f21353b.a(a.e.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                this.f21353b.a(a.u.INSTANCE);
                return Unit.INSTANCE;
            case 7:
                this.f21353b.a(a.C0300a.INSTANCE);
                return Unit.INSTANCE;
            case 8:
                this.f21353b.a(a.t.INSTANCE);
                return Unit.INSTANCE;
            case 9:
                this.f21353b.a(a.y.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                this.f21353b.a(a.s.INSTANCE);
                return Unit.INSTANCE;
            case 11:
                this.f21353b.a(a.t.INSTANCE);
                return Unit.INSTANCE;
            case 12:
                this.f21353b.a(a.m.INSTANCE);
                return Unit.INSTANCE;
            case 13:
                this.f21353b.a(a.m.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                this.f21353b.a(a.l.INSTANCE);
                return Unit.INSTANCE;
            case 15:
                this.f21353b.a(a.t.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                this.f21353b.a(a.i.INSTANCE);
                return Unit.INSTANCE;
            default:
                this.f21353b.a(a.z.INSTANCE);
                return Unit.INSTANCE;
        }
        while (true) {
            sc.f fVar = this.f21353b;
            if (fVar.f158448a.size() <= 1) {
                Object objN0 = p13.h0.n0(fVar);
                a.p pVar = a.p.INSTANCE;
                if (!p005kotlin.jvm.internal.s.g(objN0, pVar)) {
                    fVar.clear();
                    fVar.a(pVar);
                }
                return Unit.INSTANCE;
            }
            fVar.remove(fVar.f158448a.size() - 1);
        }
    }
}
