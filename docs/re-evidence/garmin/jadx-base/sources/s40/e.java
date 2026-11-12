package s40;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t40.a f157052b;

    public /* synthetic */ e(t40.a aVar, int i14) {
        this.f157051a = 2;
        this.f157052b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f157051a;
        byte b14 = 0;
        t40.a aVar = this.f157052b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g.a aVar2 = g.f157056i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1100961306, new e(aVar, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g.a aVar3 = g.f157056i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    i.a(aVar, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i.a(aVar, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(t40.a aVar, int i14, byte b14) {
        this.f157051a = i14;
        this.f157052b = aVar;
    }
}
