package yz1;

import c2.x2;
import i3.i7;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f200379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o4.d0 f200380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f200381d;

    public /* synthetic */ p(int i14, o4.d0 d0Var, String str, int i15) {
        this.f200378a = i15;
        this.f200379b = i14;
        this.f200380c = d0Var;
        this.f200381d = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        long j8;
        long j14;
        long j15;
        int i14 = this.f200378a;
        o4.d0 d0Var = this.f200380c;
        int i15 = this.f200379b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(i15, mVar, 0);
                    if (d0Var != null) {
                        j8 = d0Var.f128833a;
                    } else {
                        o4.d0.f128823b.getClass();
                        j8 = o4.d0.f128832k;
                    }
                    i7.a(dVarA, this.f200381d, x2.d(h4.r.S, 1.0f), j8, mVar, 384, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    t4.d dVarA2 = n5.c.a(i15, mVar2, 0);
                    if (d0Var != null) {
                        j14 = d0Var.f128833a;
                    } else {
                        o4.d0.f128823b.getClass();
                        j14 = o4.d0.f128832k;
                    }
                    i7.a(dVarA2, this.f200381d, x2.d(h4.r.S, 1.0f), j14, mVar2, 384, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    t4.d dVarA3 = n5.c.a(i15, mVar3, 0);
                    if (d0Var != null) {
                        j15 = d0Var.f128833a;
                    } else {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128832k;
                    }
                    i7.a(dVarA3, this.f200381d, x2.d(h4.r.S, 1.0f), j15, mVar3, 384, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
