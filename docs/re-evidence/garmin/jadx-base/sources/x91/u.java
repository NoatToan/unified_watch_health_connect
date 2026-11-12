package x91;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189660a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aa1.j f189661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f189662c;

    public /* synthetic */ u(aa1.j jVar, e23.a aVar) {
        this.f189661b = jVar;
        this.f189662c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f189660a;
        aa1.j jVar = this.f189661b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f189662c, null, jVar.f2301a, mVar, null);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                v.a(jVar, this.f189662c, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(aa1.j jVar, e23.a aVar, int i14) {
        this.f189661b = jVar;
        this.f189662c = aVar;
    }
}
