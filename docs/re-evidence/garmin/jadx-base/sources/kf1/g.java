package kf1;

import e23.p;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104635a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.g f104636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f104637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if1.c f104638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.a f104639e;

    public /* synthetic */ g(if1.c cVar, of1.a aVar, o82.g gVar, boolean z14) {
        this.f104638d = cVar;
        this.f104639e = aVar;
        this.f104636b = gVar;
        this.f104637c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f104635a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    mVar.C(-251487525);
                    if1.c cVar = this.f104638d;
                    Integer num = cVar.f93215f;
                    of1.a aVar = this.f104639e;
                    o82.g gVar = this.f104636b;
                    boolean z14 = this.f104637c;
                    if (num == null || num.intValue() <= 0) {
                        mVar.C(-787910512);
                        mVar.f();
                    } else {
                        mVar.C(-788418881);
                        String strValueOf = String.valueOf(num.intValue());
                        aVar.getClass();
                        String strQ = y.Q(mVar, of1.a.h());
                        e eVar = e.TOLERANCE;
                        h.c(strValueOf, strQ, y.Q(mVar, eVar.f104633a), eVar, gVar, z14, mVar, 3072);
                        mVar.f();
                    }
                    mVar.f();
                    mVar.C(-251465486);
                    Float f14 = cVar.f93213d;
                    if (f14 == null || f14.floatValue() <= 0.0f) {
                        mVar.C(-523663220);
                        mVar.f();
                    } else {
                        mVar.C(-524802966);
                        String strValueOf2 = String.valueOf(f14.floatValue());
                        aVar.getClass();
                        String strQ2 = y.Q(mVar, of1.a.h());
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        int iFloatValue = (int) f14.floatValue();
                        boolean z15 = ef1.e.f63968a;
                        String strQ3 = y.Q(mVar, (iFloatValue < iIntValue2 || iFloatValue == 0 || iIntValue2 == 0) ? e.NORMAL_IMPACT_LOAD.f104633a : e.ABOVE_TOLERANCE_IMPACT_LOAD.f104633a);
                        int iIntValue3 = num != null ? num.intValue() : 0;
                        int iFloatValue2 = (int) f14.floatValue();
                        h.c(strValueOf2, strQ2, strQ3, (iFloatValue2 < iIntValue3 || iFloatValue2 == 0 || iIntValue3 == 0) ? e.NORMAL_IMPACT_LOAD : e.ABOVE_TOLERANCE_IMPACT_LOAD, gVar, z14, mVar, 0);
                        mVar.f();
                    }
                    mVar.f();
                    Float f15 = cVar.f93214e;
                    if (!z14 || f15 == null || f15.floatValue() <= 0.0f) {
                        mVar.C(676860107);
                        mVar.f();
                    } else {
                        mVar.C(676332518);
                        aVar.getClass();
                        String strA = of1.a.a(f15, mVar);
                        String strQ4 = y.Q(mVar, of1.a.h());
                        e eVar2 = e.REAL_DISTANCE;
                        h.c(strA, strQ4, y.Q(mVar, eVar2.f104633a), eVar2, gVar, true, mVar, 199680);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h.b(this.f104636b, this.f104637c, this.f104638d, this.f104639e, (m) obj, p0.t(513));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(o82.g gVar, boolean z14, if1.c cVar, of1.a aVar, int i14) {
        this.f104636b = gVar;
        this.f104637c = z14;
        this.f104638d = cVar;
        this.f104639e = aVar;
    }
}
