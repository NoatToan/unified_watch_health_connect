package h50;

import b82.o;
import e23.p;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.x1;
import r22.m0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f82043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f82045d;

    public /* synthetic */ d(int i14, String str, String str2, boolean z14) {
        this.f82042a = 0;
        this.f82045d = z14;
        this.f82043b = str;
        this.f82044c = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82042a;
        boolean z14 = this.f82045d;
        String str = this.f82044c;
        String str2 = this.f82043b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                e.a(p0.t(1), str2, str, (p3.m) obj, z14);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ln1.m.b(p0.t(1), str2, str, (p3.m) obj, z14);
                break;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m0.a aVar = m0.f149759e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, this.f82045d, z3.f.c(319932450, new o(str2, str, 28), mVar), mVar, 196608, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xu0.e.c(p0.t(1), str2, str, (p3.m) obj, z14);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(String str, String str2, boolean z14, int i14, int i15) {
        this.f82042a = i15;
        this.f82043b = str;
        this.f82044c = str2;
        this.f82045d = z14;
    }

    public /* synthetic */ d(boolean z14, String str, String str2) {
        this.f82042a = 2;
        this.f82045d = z14;
        this.f82043b = str;
        this.f82044c = str2;
    }
}
