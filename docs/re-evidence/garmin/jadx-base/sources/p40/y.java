package p40;

import c2.x2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q40.b f135774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f135775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f135776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f135777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ov1.u f135778f;

    public /* synthetic */ y(q40.b bVar, boolean z14, k kVar, k kVar2, ov1.u uVar, int i14) {
        this.f135773a = i14;
        this.f135774b = bVar;
        this.f135775c = z14;
        this.f135776d = kVar;
        this.f135777e = kVar2;
        this.f135778f = uVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135773a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(580741469, new y(this.f135774b, this.f135775c, this.f135776d, this.f135777e, this.f135778f, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x.a(x2.f(h4.r.S, 1.0f), this.f135774b, this.f135775c, this.f135776d, this.f135777e, this.f135778f, mVar2, 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
