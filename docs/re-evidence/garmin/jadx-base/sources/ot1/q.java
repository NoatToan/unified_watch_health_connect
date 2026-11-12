package ot1;

import androidx.lifecycle.v1;
import o53.b0;
import o53.s0;
import p005kotlin.Unit;
import qt1.j0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.k f133815b;

    public /* synthetic */ q(qt1.k kVar, int i14) {
        this.f133814a = i14;
        this.f133815b = kVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133814a;
        qt1.k kVar = this.f133815b;
        switch (i14) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                u uVar = u.f133824a;
                vs1.k kVar2 = kVar.f147684t;
                b0 b0Var = kVar2.f179842a;
                x53.c cVar = s0.f129406a;
                ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.j(kVar2, jLongValue, zBooleanValue, null), 2);
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                u uVar2 = u.f133824a;
                ge1.b.T(v1.a(kVar), null, null, new j0(kVar, iIntValue2, iIntValue, null), 3);
                break;
            case 2:
                long jLongValue2 = ((Long) obj).longValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                y yVar = y.f133845a;
                vs1.k kVar3 = kVar.f147684t;
                b0 b0Var2 = kVar3.f179842a;
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(b0Var2, x53.b.f189152a, null, new vs1.j(kVar3, jLongValue2, zBooleanValue2, null), 2);
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                y yVar2 = y.f133845a;
                ge1.b.T(v1.a(kVar), null, null, new j0(kVar, iIntValue4, iIntValue3, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
