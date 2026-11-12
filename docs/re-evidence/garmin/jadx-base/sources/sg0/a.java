package sg0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f159021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f159022c;

    public /* synthetic */ a(o53.b0 b0Var, mc mcVar, int i14) {
        this.f159020a = i14;
        this.f159021b = b0Var;
        this.f159022c = mcVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0150  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f159020a;
        p3.m.a aVar = p3.m.f135153a;
        mc mcVar = this.f159022c;
        o53.b0 b0Var = this.f159021b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarA = t2Var.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = c2.l.A(rVarA, j92.b.f97899b.f97920e, 0.0f, 2);
                    String strQ = gl1.y.Q(mVar, R.string.lbl_child_account);
                    d92.b.f58624b.getClass();
                    g02.c.a(strQ, rVarA2, 0L, null, 0, false, 0, d92.c.b(d92.c.e(j92.f.f97931h), mVar), 0.0d, mVar, 0, 380);
                    l72.o0 o0Var = l72.o0.SMALL;
                    boolean zR = mVar.r(b0Var) | mVar.B(mcVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new nw0.n(b0Var, mcVar, 11);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new nw0.n(b0Var, mcVar, 11);
                            mVar.K(objQ);
                        }
                    }
                    l72.u0.a(null, o0Var, null, null, (e23.a) objQ, mVar, 48, 13);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarA3 = t2Var2.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA4 = c2.l.A(rVarA3, j92.b.f97899b.f97920e, 0.0f, 2);
                    String strQ2 = gl1.y.Q(mVar2, R.string.accounts_you_can_view);
                    d92.b.f58624b.getClass();
                    g02.c.a(strQ2, rVarA4, 0L, null, 0, false, 0, d92.c.b(d92.c.e(j92.f.f97931h), mVar2), 0.0d, mVar2, 0, 380);
                    l72.o0 o0Var2 = l72.o0.SMALL;
                    boolean zR2 = mVar2.r(b0Var) | mVar2.B(mcVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new nw0.n(b0Var, mcVar, 18);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new nw0.n(b0Var, mcVar, 18);
                            mVar2.K(objQ2);
                        }
                    }
                    l72.u0.a(null, o0Var2, null, null, (e23.a) objQ2, mVar2, 48, 13);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
