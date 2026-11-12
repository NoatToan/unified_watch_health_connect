package ii0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f93745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ li0.f f93746c;

    public /* synthetic */ v(zc.d dVar, li0.f fVar, int i14) {
        this.f93744a = i14;
        this.f93745b = dVar;
        this.f93746c = fVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f93744a;
        zc.d dVar = this.f93745b;
        switch (i19) {
            case 0:
                e2.d dVar2 = (e2.d) obj;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                dVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i14 = (mVar.B(dVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i14 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i14 |= mVar.k(iIntValue) ? 32 : 16;
                }
                if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var = p3.n.f135158a;
                    li0.d0 d0Var = (li0.d0) dVar.a(iIntValue);
                    if (d0Var == null) {
                        mVar.C(28176227);
                        mVar.f();
                    } else {
                        mVar.C(28176228);
                        li0.c0.f112641a.a(d0Var, this.f93746c, e2.d.c(dVar2, h4.r.S), null, mVar, li0.d0.f112647j | (li0.f.f112658h << 3), 8);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                e2.d dVar3 = (e2.d) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                dVar3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i15 = (mVar2.B(dVar3) ? 4 : 2) | iIntValue4;
                } else {
                    i15 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i15 |= mVar2.k(iIntValue3) ? 32 : 16;
                }
                if (mVar2.n(i15 & 1, (i15 & 147) != 146)) {
                    x1 x1Var2 = p3.n.f135158a;
                    li0.d0 d0Var2 = (li0.d0) dVar.a(iIntValue3);
                    if (d0Var2 == null) {
                        mVar2.C(1135787933);
                        mVar2.f();
                    } else {
                        mVar2.C(1135787934);
                        li0.c0.f112641a.a(d0Var2, this.f93746c, e2.d.c(dVar3, h4.r.S), null, mVar2, li0.d0.f112647j | (li0.f.f112658h << 3), 8);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                e2.d dVar4 = (e2.d) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                dVar4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i16 = (mVar3.B(dVar4) ? 4 : 2) | iIntValue6;
                } else {
                    i16 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i16 |= mVar3.k(iIntValue5) ? 32 : 16;
                }
                if (mVar3.n(i16 & 1, (i16 & 147) != 146)) {
                    x1 x1Var3 = p3.n.f135158a;
                    li0.d0 d0Var3 = (li0.d0) dVar.a(iIntValue5);
                    if (d0Var3 == null) {
                        mVar3.C(-104073331);
                        mVar3.f();
                    } else {
                        mVar3.C(-104073330);
                        li0.c0.f112641a.c(d0Var3, this.f93746c, true, e2.d.c(dVar4, h4.r.S), mVar3, li0.d0.f112647j | 384 | (li0.f.f112658h << 3), 0);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                e2.d dVar5 = (e2.d) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                p3.m mVar4 = (p3.m) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                dVar5.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i17 = (mVar4.B(dVar5) ? 4 : 2) | iIntValue8;
                } else {
                    i17 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i17 |= mVar4.k(iIntValue7) ? 32 : 16;
                }
                if (mVar4.n(i17 & 1, (i17 & 147) != 146)) {
                    x1 x1Var4 = p3.n.f135158a;
                    li0.d0 d0Var4 = (li0.d0) dVar.a(iIntValue7);
                    if (d0Var4 == null) {
                        mVar4.C(1292746201);
                        mVar4.f();
                    } else {
                        mVar4.C(1292746202);
                        li0.c0.f112641a.a(d0Var4, this.f93746c, e2.d.c(dVar5, h4.r.S), null, mVar4, li0.d0.f112647j | (li0.f.f112658h << 3), 8);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
            default:
                e2.d dVar6 = (e2.d) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                p3.m mVar5 = (p3.m) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                dVar6.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i18 = (mVar5.B(dVar6) ? 4 : 2) | iIntValue10;
                } else {
                    i18 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i18 |= mVar5.k(iIntValue9) ? 32 : 16;
                }
                if (mVar5.n(i18 & 1, (i18 & 147) != 146)) {
                    x1 x1Var5 = p3.n.f135158a;
                    li0.d0 d0Var5 = (li0.d0) dVar.a(iIntValue9);
                    if (d0Var5 == null) {
                        mVar5.C(-626153311);
                        mVar5.f();
                    } else {
                        mVar5.C(-626153310);
                        li0.c0.f112641a.a(d0Var5, this.f93746c, e2.d.c(dVar6, h4.r.S), null, mVar5, 24576, 8);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
