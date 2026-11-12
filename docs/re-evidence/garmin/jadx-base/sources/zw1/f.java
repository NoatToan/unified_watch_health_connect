package zw1;

import e23.p;
import o53.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f207263b;

    public /* synthetic */ f(g gVar, int i14) {
        this.f207262a = i14;
        this.f207263b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f207262a;
        g gVar = this.f207263b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = g.f207264g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1534085231, new f(gVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = g.f207264g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Boolean bool = (Boolean) f0.F(gVar.f207272f, Boolean.TRUE, mVar2, 48).getF182175a();
                    bool.getClass();
                    e.c(bool.booleanValue(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
