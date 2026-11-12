package wx1;

import c2.x2;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187928a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.p f187929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f187930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.c f187931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f187932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f187933f;

    public /* synthetic */ e(dy1.p pVar, int i14, i53.c cVar, e23.l lVar, p1 p1Var) {
        this.f187929b = pVar;
        this.f187930c = i14;
        this.f187931d = cVar;
        this.f187932e = lVar;
        this.f187933f = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        int i14 = this.f187928a;
        p1 p1Var = this.f187933f;
        dy1.p pVar = this.f187929b;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    i53.c cVar = this.f187931d;
                    mVar2.N(495451793, cVar);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(-1820783557);
                        Long l14 = pVar.f61601g;
                        vx.c.b(null, Long.valueOf(l14 != null ? l14.longValue() : 0L), this.f187930c, cVar, 0L, this.f187932e, mVar2, 384, 49);
                        mVar = mVar2;
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.q(aVar, j92.b.f97899b.f97920e), mVar);
                        mVar.f();
                    } else {
                        mVar = mVar2;
                        mVar.C(-1820264617);
                        mVar.f();
                    }
                    mVar.Q();
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar3.C(-1211543224);
                        Long l15 = pVar.f61601g;
                        vx.c.b(null, Long.valueOf(l15 != null ? l15.longValue() : 0L), this.f187930c, this.f187931d, 0L, this.f187932e, mVar3, 384, 49);
                        mVar3.f();
                    } else {
                        mVar3.C(-1211159103);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(i53.c cVar, dy1.p pVar, int i14, e23.l lVar, p1 p1Var) {
        this.f187931d = cVar;
        this.f187929b = pVar;
        this.f187930c = i14;
        this.f187932e = lVar;
        this.f187933f = p1Var;
    }
}
