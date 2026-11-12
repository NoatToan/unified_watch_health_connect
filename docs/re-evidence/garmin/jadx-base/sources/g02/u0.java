package g02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f74579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f74580c;

    public /* synthetic */ u0(Object obj, e23.a aVar, int i14) {
        this.f74578a = 0;
        this.f74579b = obj;
        this.f74580c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74578a;
        e23.a aVar = this.f74580c;
        Object obj3 = this.f74579b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                v0.a(obj3, aVar, mVar, p3.p0.t(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    v0.a(obj3, aVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    v0.a(obj3, aVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u0(Object obj, e23.a aVar, int i14, byte b14) {
        this.f74578a = i14;
        this.f74579b = obj;
        this.f74580c = aVar;
    }
}
