package g52;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75953a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z42.d f75954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.g f75955c;

    public /* synthetic */ b(z42.d dVar, o82.g gVar) {
        this.f75954b = dVar;
        this.f75955c = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75953a;
        o82.g gVar = this.f75955c;
        z42.d dVar = this.f75954b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                c.a(dVar, gVar, mVar, p0.t(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    c.a(dVar, gVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(z42.d dVar, o82.g gVar, int i14) {
        this.f75954b = dVar;
        this.f75955c = gVar;
    }
}
