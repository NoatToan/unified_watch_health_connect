package ao1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import p3.x1;
import wn1.n;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11561a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f11562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f11564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f11565e;

    public /* synthetic */ h(n nVar, String str, e23.a aVar, e23.a aVar2) {
        this.f11562b = nVar;
        this.f11563c = str;
        this.f11564d = aVar;
        this.f11565e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11561a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    k.e(this.f11562b, this.f11563c, this.f11564d, this.f11565e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k.e(this.f11562b, this.f11563c, this.f11564d, this.f11565e, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(n nVar, String str, e23.a aVar, e23.a aVar2, int i14) {
        this.f11562b = nVar;
        this.f11563c = str;
        this.f11564d = aVar;
        this.f11565e = aVar2;
    }
}
