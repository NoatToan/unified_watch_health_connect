package w40;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181924a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f181925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j61.e f181926c;

    public /* synthetic */ b(e eVar, j61.e eVar2) {
        this.f181925b = eVar;
        this.f181926c = eVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f181924a;
        j61.e eVar = this.f181926c;
        e eVar2 = this.f181925b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                e.a aVar = e.f181932h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    eVar2.z6(eVar, mVar, 8);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                e.a aVar2 = e.f181932h;
                eVar2.z6(eVar, mVar, p0.t(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(e eVar, j61.e eVar2, int i14) {
        this.f181925b = eVar;
        this.f181926c = eVar2;
    }
}
