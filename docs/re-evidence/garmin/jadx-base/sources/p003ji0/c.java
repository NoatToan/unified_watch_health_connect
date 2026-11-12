package p003ji0;

import c2.x2;
import e2.f0;
import e23.l;
import e23.q;
import f5.k2;
import f5.v1;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f98768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f98769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f98770d;

    public /* synthetic */ c(l lVar, k2 k2Var, v1 v1Var, int i14) {
        this.f98767a = i14;
        this.f98768b = lVar;
        this.f98769c = k2Var;
        this.f98770d = v1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f98767a) {
            case 0:
                f0Var.getClass();
                final int i14 = 1;
                final k2 k2Var = this.f98769c;
                final v1 v1Var = this.f98770d;
                f0.b(f0Var, null, new e(-433137208, true, new q() { // from class: ji0.d
                    @Override // e23.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i15 = i14;
                        v1 v1Var2 = v1Var;
                        k2 k2Var2 = k2Var;
                        e2.d dVar = (e2.d) obj2;
                        m mVar = (m) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i15) {
                            case 0:
                                dVar.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = n.f135158a;
                                    c2.l.f(x2.h(r.S, k2Var2.c1(v1Var2.f69145b)), mVar);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                dVar.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var2 = n.f135158a;
                                    c2.l.f(x2.h(r.S, k2Var2.c1(v1Var2.f69145b)), mVar);
                                } else {
                                    mVar.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                this.f98768b.invoke(f0Var);
                break;
            default:
                f0Var.getClass();
                final int i15 = 0;
                final k2 k2Var2 = this.f98769c;
                final v1 v1Var2 = this.f98770d;
                f0.b(f0Var, null, new e(-1395257023, true, new q() { // from class: ji0.d
                    @Override // e23.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i16 = i15;
                        v1 v1Var3 = v1Var2;
                        k2 k2Var3 = k2Var2;
                        e2.d dVar = (e2.d) obj2;
                        m mVar = (m) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i16) {
                            case 0:
                                dVar.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = n.f135158a;
                                    c2.l.f(x2.h(r.S, k2Var3.c1(v1Var3.f69145b)), mVar);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                dVar.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var2 = n.f135158a;
                                    c2.l.f(x2.h(r.S, k2Var3.c1(v1Var3.f69145b)), mVar);
                                } else {
                                    mVar.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                this.f98768b.invoke(f0Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
