package e11;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f61922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f61923c;

    public /* synthetic */ m(e23.p pVar, p1 p1Var, int i14) {
        this.f61921a = i14;
        this.f61922b = pVar;
        this.f61923c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61921a;
        Object[] objArr = 0;
        e23.p pVar = this.f61922b;
        p1 p1Var = this.f61923c;
        switch (i14) {
            case 0:
                a11.r rVar = (a11.r) obj;
                Double d14 = (Double) obj2;
                d14.getClass();
                rVar.getClass();
                pVar.invoke(d14, rVar);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                str.getClass();
                p1Var.setValue(str);
                pVar.invoke(str, bool);
                break;
            case 2:
                String str2 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                str2.getClass();
                p1Var.setValue(str2);
                pVar.invoke(str2, bool2);
                break;
            case 3:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_start_recording);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    o13.p pVar2 = (o13.p) p1Var.getF182175a();
                    boolean z14 = (pVar2 != null ? (zf2.i) pVar2.f128594a : null) != null;
                    boolean zB = mVar.B(pVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new hl1.s(pVar, p1Var, objArr == true ? 1 : 0);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new hl1.s(pVar, p1Var, objArr == true ? 1 : 0);
                            mVar.K(objQ);
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ, rVarF, strQ, mVar, null, z14);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b82.c.b(c2.l.s(h4.r.S), null, z3.f.c(-931742278, new m(p1Var, pVar, 3), mVar2), null, tn.k.a(d92.b.f58623a, mVar2), mVar2, 384, 10);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(p1 p1Var, e23.p pVar, int i14) {
        this.f61921a = i14;
        this.f61923c = p1Var;
        this.f61922b = pVar;
    }
}
