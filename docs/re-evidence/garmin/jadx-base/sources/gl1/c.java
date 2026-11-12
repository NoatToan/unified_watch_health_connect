package gl1;

import android.content.Context;
import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f77830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.q f77831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f77832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l80.b f77833e;

    public /* synthetic */ c(m0 m0Var, c.q qVar, Context context, l80.b bVar, int i14) {
        this.f77829a = i14;
        this.f77830b = m0Var;
        this.f77831c = qVar;
        this.f77832d = context;
        this.f77833e = bVar;
    }

    @Override // e23.t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i14 = this.f77829a;
        l80.b bVar = this.f77833e;
        c.q qVar = this.f77831c;
        m0 m0Var = this.f77830b;
        switch (i14) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                zf2.d dVar = (zf2.d) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj6).booleanValue();
                dVar.getClass();
                if (bVar.a(jLongValue)) {
                    if (dVar == zf2.d.f204583b2 && zBooleanValue4) {
                        m0Var.getClass();
                        lc.y.l(m0Var, new k(jLongValue, dVar.f204629a));
                    } else {
                        qVar.a(q.a(this.f77832d, jLongValue, dVar, null, null, zBooleanValue, zBooleanValue2, zBooleanValue3, 24), null);
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    m0Var.getClass();
                    lc.y.l(m0Var, new f(jLongValue));
                }
                break;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                zf2.d dVar2 = (zf2.d) obj2;
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj4).booleanValue();
                boolean zBooleanValue7 = ((Boolean) obj5).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj6).booleanValue();
                dVar2.getClass();
                if (bVar.a(jLongValue2)) {
                    if (dVar2 == zf2.d.f204583b2 && zBooleanValue8) {
                        m0Var.getClass();
                        lc.y.l(m0Var, new k(jLongValue2, dVar2.f204629a));
                    } else {
                        qVar.a(q.a(this.f77832d, jLongValue2, dVar2, null, null, zBooleanValue5, zBooleanValue6, zBooleanValue7, 24), null);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    m0Var.getClass();
                    lc.y.l(m0Var, new f(jLongValue2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
