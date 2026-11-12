package gp;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78386a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f78387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f78388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f78389d;

    public /* synthetic */ k(i53.c cVar, String str, String str2) {
        this.f78387b = cVar;
        this.f78388c = str;
        this.f78389d = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78386a) {
            case 0:
                ((Integer) obj2).getClass();
                l.b(this.f78387b, this.f78388c, this.f78389d, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    k71.c.a(this.f78387b, this.f78388c, this.f78389d, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(i53.c cVar, String str, String str2, int i14) {
        this.f78387b = cVar;
        this.f78388c = str;
        this.f78389d = str2;
    }
}
