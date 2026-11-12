package ad0;

import e23.p;
import h4.r;
import i3.h7;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f2741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2743d;

    public /* synthetic */ h(e23.l lVar, r rVar, boolean z14) {
        this.f2740a = 1;
        this.f2741b = lVar;
        this.f2742c = z14;
        this.f2743d = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f2740a;
        r rVar = this.f2743d;
        e23.l lVar = this.f2741b;
        boolean z14 = this.f2742c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                i.a(p0.t(7), lVar, rVar, (p3.m) obj, z14);
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    boolean zB = mVar.B(lVar) | mVar.h(z14);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e(lVar, z14, 6);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(lVar, z14, 6);
                            mVar.K(objQ);
                        }
                    }
                    h7.a((e23.a) objQ, this.f2743d, false, null, null, z3.f.c(154625007, new an1.i(z14, 29), mVar), mVar, 1572864, 60);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                m30.r.a(p0.t(1), lVar, rVar, (p3.m) obj, z14);
                break;
            default:
                ((Integer) obj2).getClass();
                ys1.a.a(p0.t(1), lVar, rVar, (p3.m) obj, z14);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(r rVar, boolean z14, e23.l lVar, int i14, int i15) {
        this.f2740a = i15;
        this.f2743d = rVar;
        this.f2742c = z14;
        this.f2741b = lVar;
    }
}
