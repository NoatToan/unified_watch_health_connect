package qv1;

import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import e23.p;
import lc.m0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.n;
import p3.p1;
import p3.v;
import p3.x1;
import p3.x3;
import p3.y3;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147925a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f147926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FBTProgressReportActivity f147927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv1.c f147928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.e f147929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f147930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f147931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x3 f147932h;

    public /* synthetic */ a(FBTProgressReportActivity fBTProgressReportActivity, m mVar, uv1.c cVar, pi0.e eVar, Long l14, m0 m0Var, p1 p1Var) {
        this.f147927c = fBTProgressReportActivity;
        this.f147926b = mVar;
        this.f147928d = cVar;
        this.f147929e = eVar;
        this.f147930f = l14;
        this.f147931g = m0Var;
        this.f147932h = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f147925a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FBTProgressReportActivity.a aVar = FBTProgressReportActivity.f45512b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    y3 y3Var = g02.d.f74342a;
                    FBTProgressReportActivity fBTProgressReportActivity = this.f147927c;
                    v.a(y3Var.c(fBTProgressReportActivity.getOnBackPressedDispatcher()), z3.f.c(-323787761, new a(this.f147926b, fBTProgressReportActivity, this.f147928d, this.f147929e, this.f147930f, this.f147931g, this.f147932h), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FBTProgressReportActivity.a aVar2 = FBTProgressReportActivity.f45512b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Unit unit = Unit.INSTANCE;
                    m mVar3 = this.f147926b;
                    boolean zR = mVar2.r(mVar3);
                    FBTProgressReportActivity fBTProgressReportActivity2 = this.f147927c;
                    boolean zR2 = zR | mVar2.r(fBTProgressReportActivity2);
                    uv1.c cVar = this.f147928d;
                    boolean zK = zR2 | mVar2.k(cVar.ordinal());
                    pi0.e eVar = this.f147929e;
                    boolean zR3 = zK | mVar2.r(eVar);
                    Long l14 = this.f147930f;
                    boolean zB = zR3 | mVar2.B(l14);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new FBTProgressReportActivity.c(mVar3, fBTProgressReportActivity2, cVar, eVar, l14, null);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new FBTProgressReportActivity.c(mVar3, fBTProgressReportActivity2, cVar, eVar, l14, null);
                            mVar2.K(objQ);
                        }
                    }
                    l0.e((p) objQ, unit, mVar2);
                    vv1.c cVar2 = (vv1.c) s9.c.c(fBTProgressReportActivity2.ca().f147943j, mVar2).getF182175a();
                    if (cVar2 == null) {
                        mVar2.C(535959925);
                        mVar2.f();
                    } else {
                        mVar2.C(535959926);
                        boolean zG = s.g(cVar2.f180508a, Boolean.TRUE);
                        m0 m0Var = this.f147931g;
                        z02.d.a(zG, z3.f.c(556616385, new na0.a(cVar2, fBTProgressReportActivity2, m0Var, this.f147932h, 28), mVar2), null, null, null, z3.f.c(21800133, new pp.g(fBTProgressReportActivity2, 8, cVar2, m0Var), mVar2), mVar2, 196656, 28);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(m mVar, FBTProgressReportActivity fBTProgressReportActivity, uv1.c cVar, pi0.e eVar, Long l14, m0 m0Var, x3 x3Var) {
        this.f147926b = mVar;
        this.f147927c = fBTProgressReportActivity;
        this.f147928d = cVar;
        this.f147929e = eVar;
        this.f147930f = l14;
        this.f147931g = m0Var;
        this.f147932h = x3Var;
    }
}
