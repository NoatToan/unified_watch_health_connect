package b82;

import i3.mh;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16506a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16509d;

    public /* synthetic */ c2(int i14, String str, int i15) {
        this.f16507b = i14;
        this.f16508c = str;
        this.f16509d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16506a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d2 d2Var = d2.f16532a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f16508c, null, 0L, null, 0L, null, 0L, null, 0L, this.f16507b, false, this.f16509d, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 110590);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rr0.g.c(this.f16507b, p3.p0.t(1 | this.f16509d), this.f16508c, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c2(String str, int i14, int i15) {
        this.f16508c = str;
        this.f16507b = i14;
        this.f16509d = i15;
    }
}
