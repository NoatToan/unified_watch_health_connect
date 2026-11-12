package m72;

import c2.x2;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f117099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f117100d;

    public /* synthetic */ c(float f14, String str, String str2) {
        this.f117097a = 3;
        this.f117099c = str;
        this.f117098b = f14;
        this.f117100d = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f117097a;
        String str = this.f117100d;
        String str2 = this.f117099c;
        float f14 = this.f117098b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                f.d(f14, str2, str, (p3.m) obj, p0.t(433));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f.e(f14, str2, str, (p3.m) obj, p0.t(433));
                break;
            case 2:
                ((Integer) obj2).getClass();
                f.f(f14, str2, str, (p3.m) obj, p0.t(433));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    mh.c(this.f117099c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                    c2.l.f(x2.u(r.S, f14), mVar);
                    mh.c(this.f117100d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(float f14, String str, String str2, int i14, int i15) {
        this.f117097a = i15;
        this.f117098b = f14;
        this.f117099c = str;
        this.f117100d = str2;
    }
}
