package zz1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207634a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f207635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f207636c;

    public /* synthetic */ b(d dVar, String str) {
        this.f207635b = dVar;
        this.f207636c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f207634a;
        String str = this.f207636c;
        d dVar = this.f207635b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    c.e(dVar, str, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                c.e(dVar, str, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(d dVar, String str, int i14) {
        this.f207635b = dVar;
        this.f207636c = str;
    }
}
