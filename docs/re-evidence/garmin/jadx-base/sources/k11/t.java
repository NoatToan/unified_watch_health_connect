package k11;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import l72.i3;
import lc.u0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l11.n f102260b;

    public /* synthetic */ t(l11.n nVar, int i14) {
        this.f102259a = i14;
        this.f102260b = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l11.l lVar;
        l11.l lVar2;
        l11.l lVar3;
        Object value;
        l11.m mVar;
        l11.l lVar4;
        switch (this.f102259a) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "ADD_MEAL")) {
                    l11.n nVar = this.f102260b;
                    l11.m mVar2 = (l11.m) nVar.f108199j.getValue();
                    if (mVar2 != null && (lVar = mVar2.f108184a) != null) {
                        b63.u uVarA = b63.q.a(nVar.f108191b.b(), lVar.f108180b);
                        int i14 = l11.n.c.f108213a[nVar.f108194e.ordinal()];
                        if (i14 == 1 || i14 == 2 || i14 == 3) {
                            nVar.f108201l.k(null, new l11.n.b.g(uVarA, lVar.f108179a));
                        } else {
                            if (i14 != 4) {
                                u0.r();
                                return null;
                            }
                            ge1.b.T(v1.a(nVar), null, null, new l11.p(nVar, uVarA, lVar, null), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                b11.l lVar5 = (b11.l) obj;
                lVar5.getClass();
                l11.n nVar2 = this.f102260b;
                nVar2.getClass();
                p2 p2Var = nVar2.f108199j;
                l11.m mVar3 = (l11.m) p2Var.getValue();
                if (mVar3 != null && (lVar2 = mVar3.f108184a) != null) {
                    l11.l lVarA = l11.l.a(lVar2, b11.a.b.d(lVar2.f108179a, null, false, Long.valueOf(lVar5.f14331a), null, 507), null, 30);
                    l11.m mVar4 = (l11.m) p2Var.getValue();
                    p2Var.setValue(mVar4 != null ? l11.m.a(mVar4, lVarA) : null);
                }
                return Unit.INSTANCE;
            case 2:
                b63.v vVar = (b63.v) obj;
                vVar.getClass();
                l11.n nVar3 = this.f102260b;
                nVar3.getClass();
                p2 p2Var2 = nVar3.f108199j;
                l11.m mVar5 = (l11.m) p2Var2.getValue();
                if (mVar5 != null && (lVar3 = mVar5.f108184a) != null) {
                    b11.m mVar6 = nVar3.f108192c;
                    if (mVar6.f14338a) {
                        b11.l lVarL = zf.b.L(lVar3.f108182d, true, vVar, mVar6.f14339b, nVar3.f108198i.a());
                        if (lVarL == null) {
                            nVar3.f108201l.setValue(l11.n.b.C2079b.f108204a);
                            i2.f36769a.getClass();
                            i2.a.f(a2.NUTRITION, "FoodDetailsViewModel", "Failed to find meal for time " + vVar);
                        } else {
                            do {
                                value = p2Var2.getValue();
                                mVar = (l11.m) value;
                            } while (!p2Var2.b(value, mVar != null ? l11.m.a(mVar, l11.l.a(mVar.f108184a, b11.a.b.d(lVar3.f108179a, null, false, Long.valueOf(lVarL.f14331a), null, 507), vVar, 28)) : null));
                        }
                    } else {
                        l11.m mVar7 = (l11.m) p2Var2.getValue();
                        p2Var2.setValue(mVar7 != null ? l11.m.a(mVar7, l11.l.a(lVar3, null, vVar, 29)) : null);
                    }
                }
                return Unit.INSTANCE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l11.n nVar4 = this.f102260b;
                l11.m mVar8 = (l11.m) nVar4.f108199j.getValue();
                if (mVar8 != null && (lVar4 = mVar8.f108184a) != null) {
                    ge1.b.T(v1.a(nVar4), null, null, new l11.q(nVar4, zBooleanValue, lVar4.f108179a, null), 3);
                }
                return Unit.INSTANCE;
        }
    }
}
