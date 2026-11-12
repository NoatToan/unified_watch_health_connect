package vp1;

import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import u91.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f179395b;

    public /* synthetic */ d(f fVar, int i14) {
        this.f179394a = i14;
        this.f179395b = fVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f179394a;
        f fVar = this.f179395b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = f.f179398h;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    fVar.i(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = f.f179398h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    fVar.g(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = f.f179398h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    fVar.h(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                r rVar = (r) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = f.f179398h;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i19 = ((iIntValue4 << 3) & 112) | 6;
                    rVar.j(z3.f.c(1511299188, new t12.a(rVar, 19), mVar4), mVar4, i19);
                    rVar.j(z3.f.c(-1046611029, new t12.a(rVar, 20), mVar4), mVar4, i19);
                    rVar.j(z3.f.c(901119404, new t12.a(rVar, 21), mVar4), mVar4, i19);
                    b.f179385a.getClass();
                    rVar.j(b.f179386b, mVar4, i19);
                    rVar.j(b.f179387c, mVar4, i19);
                    rVar.j(b.f179388d, mVar4, i19);
                    if (fVar.f179399f) {
                        mVar4.C(1217768940);
                        rVar.j(b.f179389e, mVar4, i19);
                        mVar4.f();
                    } else {
                        mVar4.C(1218102407);
                        mVar4.f();
                    }
                    if (fVar.f179400g) {
                        mVar4.C(1218149775);
                        rVar.j(b.f179390f, mVar4, i19);
                        mVar4.f();
                    } else {
                        mVar4.C(1218480359);
                        mVar4.f();
                    }
                    rVar.j(z3.f.c(102106544, new t12.a(rVar, 22), mVar4), mVar4, i19);
                } else {
                    mVar4.e();
                }
                break;
            default:
                r rVar2 = (r) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i24 = f.f179398h;
                rVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i25 = ((iIntValue5 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(-1488894613, new t12.a(rVar2, 24), mVar5), mVar5, i25);
                    rVar2.a(z3.f.c(-1192968926, new i(29, rVar2, fVar), mVar5), mVar5, i25);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
