package p003ji0;

import e2.d;
import e23.r;
import h2.c0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f98807b;

    public /* synthetic */ p(e eVar, int i14) {
        this.f98806a = i14;
        this.f98807b = eVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f98806a;
        e eVar = this.f98807b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj2;
                num.getClass();
                int iIntValue = ((Integer) obj4).intValue();
                ((c0) obj).getClass();
                x1 x1Var = n.f135158a;
                eVar.invoke(num, (m) obj3, Integer.valueOf((iIntValue >> 3) & 14));
                break;
            default:
                ((Integer) obj2).getClass();
                m mVar = (m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((d) obj).getClass();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    x1 x1Var2 = n.f135158a;
                    eVar.invoke(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
