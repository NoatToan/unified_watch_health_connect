package yr;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.Locale;
import o4.m1;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.x f198902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f198903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f198904d;

    public /* synthetic */ t(nr.x xVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f198901a = i14;
        this.f198902b = xVar;
        this.f198903c = p1Var;
        this.f198904d = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f198901a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f198904d;
        p1 p1Var2 = this.f198903c;
        nr.x xVar = this.f198902b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
                    boolean zK = mVar.k(xVar.ordinal());
                    Object objQ = mVar.q();
                    if (zK) {
                        objQ = new wn2.f(xVar, 20, p1Var2, p1Var);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wn2.f(xVar, 20, p1Var2, p1Var);
                            mVar.K(objQ);
                        }
                    }
                    e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.txt_activity_name);
                    Locale locale = Locale.ROOT;
                    String upperCase = strQ.toUpperCase(locale);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97932i;
                    s5.x0 x0VarF = d92.c.f(x0Var, mVar2);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    mh.c(upperCase, c2.l.C(c2.l.A(aVar2, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97921f, 0.0f, eVar.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                    String str = (String) p1Var2.getF182175a();
                    boolean z14 = xVar == nr.x.EDIT_NAME;
                    s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
                    w5.f0.f182097b.getClass();
                    s5.x0 x0VarA = s5.x0.a(x0VarB, 0L, 0L, w5.f0.f182104i, null, 0L, null, null, 0, 0L, null, null, 16777211);
                    long jC = d92.b.a(mVar2).c().c();
                    x5.p.f188918b.getClass();
                    int i15 = x5.p.f188925i;
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new xq1.c(p1Var2, 10);
                        mVar2.K(objQ2);
                    }
                    x.c(str, z14, x0VarA, 75, null, null, jC, i15, (e23.l) objQ2, mVar2, 113249280, 48);
                    String upperCase2 = gl1.y.Q(mVar2, R.string.workout_add_notes).toUpperCase(locale);
                    upperCase2.getClass();
                    mh.c(upperCase2, c2.l.C(c2.l.A(aVar2, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97917b, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                    String str2 = (String) p1Var.getF182175a();
                    boolean z15 = xVar == nr.x.EDIT_NOTE;
                    s5.x0 x0Var2 = j92.f.f97931h;
                    s5.x0 x0VarB2 = d92.c.b(x0Var2, mVar2);
                    String strQ2 = gl1.y.Q(mVar2, R.string.txt_title_description_hint);
                    s5.x0 x0VarF2 = d92.c.f(x0Var2, mVar2);
                    int i16 = x5.p.f188920d;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new xq1.c(p1Var, 11);
                        mVar2.K(objQ3);
                    }
                    x.c(str2, z15, x0VarB2, 2000, strQ2, x0VarF2, 0L, i16, (e23.l) objQ3, mVar2, 113249280, 64);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
