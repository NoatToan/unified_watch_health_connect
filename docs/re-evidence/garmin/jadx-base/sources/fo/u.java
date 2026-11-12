package fo;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72443a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo0.a f72444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f72445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f72446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f72447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.r f72448f;

    public /* synthetic */ u(wo0.a aVar, boolean z14, e23.a aVar2, e23.a aVar3, h4.r rVar) {
        this.f72444b = aVar;
        this.f72445c = z14;
        this.f72446d = aVar2;
        this.f72447e = aVar3;
        this.f72448f = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f72443a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    xo0.b.a(this.f72444b, this.f72445c, this.f72446d, this.f72447e, this.f72448f, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                w.a(this.f72444b, this.f72445c, this.f72446d, this.f72447e, this.f72448f, (p3.m) obj, p0.t(24577));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(wo0.a aVar, boolean z14, e23.a aVar2, e23.a aVar3, h4.r rVar, int i14) {
        this.f72444b = aVar;
        this.f72445c = z14;
        this.f72446d = aVar2;
        this.f72447e = aVar3;
        this.f72448f = rVar;
    }
}
