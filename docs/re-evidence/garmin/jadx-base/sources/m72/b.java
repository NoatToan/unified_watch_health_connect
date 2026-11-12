package m72;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117091a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f117092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f117093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f117094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u4.d f117095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f117096f;

    public /* synthetic */ b(String str, e23.a aVar, e23.a aVar2, u4.d dVar, e23.a aVar3) {
        this.f117092b = str;
        this.f117093c = aVar;
        this.f117094d = aVar2;
        this.f117095e = dVar;
        this.f117096f = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f117091a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    g.a(this.f117092b, this.f117093c, this.f117094d, this.f117095e, this.f117096f, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g.a(this.f117092b, this.f117093c, this.f117094d, this.f117095e, this.f117096f, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(String str, e23.a aVar, e23.a aVar2, u4.d dVar, e23.a aVar3, int i14) {
        this.f117092b = str;
        this.f117093c = aVar;
        this.f117094d = aVar2;
        this.f117095e = dVar;
        this.f117096f = aVar3;
    }
}
