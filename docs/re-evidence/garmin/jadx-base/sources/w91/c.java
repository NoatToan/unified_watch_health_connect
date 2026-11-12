package w91;

import androidx.lifecycle.v1;
import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f183585c;

    public /* synthetic */ c(ba1.d dVar, m0 m0Var, int i14) {
        this.f183583a = i14;
        this.f183584b = dVar;
        this.f183585c = m0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f183583a) {
            case 0:
                q91.d dVar = (q91.d) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                dVar.getClass();
                ba1.d dVar2 = this.f183584b;
                m0 m0Var = this.f183585c;
                if (zBooleanValue) {
                    switch (q91.d.c.f143583a[dVar.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            w72.f fVar = new w72.f(10);
                            dVar2.getClass();
                            ge1.b.T(v1.a(dVar2), null, null, new ba1.f(dVar2, dVar, fVar, null), 3);
                            lc.y.l(m0Var, y.b.INSTANCE);
                            break;
                        default:
                            dVar2.C4(dVar, new f(dVar2, dVar, m0Var, 1));
                            lc.y.l(m0Var, y.g.INSTANCE);
                            break;
                    }
                } else {
                    dVar2.I4(dVar);
                    lc.y.l(m0Var, y.e.INSTANCE);
                }
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                q91.d dVar3 = (q91.d) obj2;
                dVar3.getClass();
                ba1.d dVar4 = this.f183584b;
                dVar4.A4(jLongValue, false, new f(dVar4, dVar3, this.f183585c, 0));
                break;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                q91.d dVar5 = (q91.d) obj2;
                dVar5.getClass();
                ba1.d dVar6 = this.f183584b;
                dVar6.A4(jLongValue2, true, new f(dVar6, dVar5, this.f183585c, 2));
                break;
        }
        return Unit.INSTANCE;
    }
}
