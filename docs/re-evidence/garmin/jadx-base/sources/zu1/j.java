package zu1;

import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import o53.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import vu1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f207121b;

    public /* synthetic */ j(k kVar, int i14) {
        this.f207120a = i14;
        this.f207121b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f207120a;
        int i15 = 1;
        k kVar = this.f207121b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                k.a aVar = k.f207122d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-989059760, new j(kVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                k.a aVar2 = k.f207122d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarG = f0.G(((o) kVar.f207123a.getValue()).Q0, mVar2);
                    g3 g3Var = (g3) p1VarG.getF182175a();
                    fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                    int i16 = pVar == null ? -1 : k.b.f207126a[pVar.ordinal()];
                    if (i16 == 1) {
                        mVar2.C(-1603445853);
                        g22.e.f(kVar);
                        g3 g3Var2 = (g3) p1VarG.getF182175a();
                        av1.f fVar = g3Var2 != null ? (av1.f) g3Var2.f35301b : null;
                        if (fVar == null) {
                            mVar2.C(-1603339028);
                            mVar2.f();
                        } else {
                            mVar2.C(-1603339027);
                            kVar.w6(fVar, mVar2, 0);
                            mVar2.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar2.f();
                    } else if (i16 == 2) {
                        mVar2.C(-1603171565);
                        mVar2.f();
                        g22.e.f(kVar);
                        g22.e.a(kVar, null);
                    } else if (i16 != 3) {
                        mVar2.C(-1602952240);
                        mVar2.f();
                    } else {
                        mVar2.C(-1298635835);
                        mVar2.f();
                        g22.e.l(kVar);
                    }
                } else {
                    mVar2.e();
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                hv1.c cVar = (hv1.c) obj2;
                k.a aVar3 = k.f207122d;
                cVar.getClass();
                ((o) kVar.f207123a.getValue()).i5(jLongValue, cVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
