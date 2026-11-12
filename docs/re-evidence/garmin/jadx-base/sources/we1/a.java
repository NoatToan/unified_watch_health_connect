package we1;

import af1.k;
import af1.p;
import c2.t;
import e23.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f184768b;

    public /* synthetic */ a(d dVar, int i14) {
        this.f184767a = i14;
        this.f184768b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15 = this.f184767a;
        d dVar = this.f184768b;
        Object[] objArr = 0;
        final int i16 = 1;
        switch (i15) {
            case 0:
                final o82.g gVar = (o82.g) obj;
                final o82.a aVar = (o82.a) obj2;
                m mVar = (m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar);
                if ((iD & 6) == 0) {
                    i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar.B(aVar) ? 32 : 16;
                }
                if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var = n.f135158a;
                    int i17 = com.garmin.android.apps.connectmobile.running_economy.presentation.b.a.f41160a[gVar.ordinal()];
                    if (i17 == 1) {
                        mVar.C(1681614481);
                        u82.e.b(aVar, dVar.f184787l, null, false, z3.f.c(1672475781, new a(dVar, i16), mVar), mVar, ((i14 >> 3) & 14) | 24576, 12);
                        mVar.f();
                    } else if (i17 == 2) {
                        mVar.C(1681981273);
                        u82.a aVar2 = dVar.f184788m;
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        u82.e.b(aVar, aVar2, null, false, z3.f.c(2085323644, new r() { // from class: we1.b
                            @Override // e23.r
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i18 = objArr2;
                                o82.a aVar3 = aVar;
                                u82.f fVar = (u82.f) obj6;
                                m mVar2 = (m) obj7;
                                int iC = vb.h.c((Integer) obj8, (t) obj5, fVar);
                                switch (i18) {
                                    case 0:
                                        x1 x1Var2 = n.f135158a;
                                        k.a(fVar, gVar, aVar3.f130843a, aVar3.f130844b, mVar2, (iC >> 3) & 14);
                                        break;
                                    default:
                                        x1 x1Var3 = n.f135158a;
                                        p.a(fVar, gVar, aVar3.f130843a, aVar3.f130844b, mVar2, (iC >> 3) & 14);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar), mVar, ((i14 >> 3) & 14) | 24576, 12);
                        mVar.f();
                    } else if (i17 == 3 || i17 == 4) {
                        mVar.C(1682609271);
                        u82.e.b(aVar, dVar.f184789n, null, false, z3.f.c(815707453, new r() { // from class: we1.b
                            @Override // e23.r
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i18 = i16;
                                o82.a aVar3 = aVar;
                                u82.f fVar = (u82.f) obj6;
                                m mVar2 = (m) obj7;
                                int iC = vb.h.c((Integer) obj8, (t) obj5, fVar);
                                switch (i18) {
                                    case 0:
                                        x1 x1Var2 = n.f135158a;
                                        k.a(fVar, gVar, aVar3.f130843a, aVar3.f130844b, mVar2, (iC >> 3) & 14);
                                        break;
                                    default:
                                        x1 x1Var3 = n.f135158a;
                                        p.a(fVar, gVar, aVar3.f130843a, aVar3.f130844b, mVar2, (iC >> 3) & 14);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar), mVar, ((i14 >> 3) & 14) | 24576, 12);
                        mVar.f();
                    } else {
                        mVar.C(747030753);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                u82.f fVar = (u82.f) obj2;
                m mVar2 = (m) obj3;
                int iC = vb.h.c((Integer) obj4, (t) obj, fVar);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar2.B(fVar) : mVar2.r(fVar) ? 32 : 16;
                }
                if (mVar2.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var2 = n.f135158a;
                    af1.h.b(fVar, (qe1.i) dVar.f184783h.getF182175a(), dVar, mVar2, (iC >> 3) & 14);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
