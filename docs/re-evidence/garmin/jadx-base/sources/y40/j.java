package y40;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import r53.d2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194416a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a50.d f194417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f194418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f194419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f194420e;

    public /* synthetic */ j(a50.d dVar, d2 d2Var, e23.l lVar, e23.l lVar2) {
        this.f194417b = dVar;
        this.f194418c = d2Var;
        this.f194419d = lVar;
        this.f194420e = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f194416a) {
            case 0:
                ((Integer) obj2).getClass();
                k.a(this.f194417b, this.f194418c, this.f194419d, this.f194420e, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    k.a(this.f194417b, this.f194418c, this.f194419d, this.f194420e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(a50.d dVar, d2 d2Var, e23.l lVar, e23.l lVar2, int i14) {
        this.f194417b = dVar;
        this.f194418c = d2Var;
        this.f194419d = lVar;
        this.f194420e = lVar2;
    }
}
