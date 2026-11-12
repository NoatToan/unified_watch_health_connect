package hx0;

import com.garmin.android.apps.connectmobile.R;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a f86060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86063e;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i14) {
        this.f86059a = i14;
        this.f86060b = aVar;
        this.f86061c = localDate;
        this.f86062d = localDate2;
        this.f86063e = localDate3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f86059a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-602938150, new h(this.f86060b, this.f86061c, this.f86062d, this.f86063e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_whoops);
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_atp_error);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_try_again);
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar = this.f86060b;
                    boolean zR = mVar2.r(aVar);
                    LocalDate localDate = this.f86061c;
                    boolean zR2 = zR | mVar2.r(localDate);
                    LocalDate localDate2 = this.f86062d;
                    boolean zR3 = zR2 | mVar2.r(localDate2);
                    LocalDate localDate3 = this.f86063e;
                    boolean zR4 = zR3 | mVar2.r(localDate3);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR4) {
                        ho.d0 d0Var = new ho.d0(aVar, localDate, localDate2, localDate3, 3);
                        mVar2.K(d0Var);
                        objQ = d0Var;
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            ho.d0 d0Var2 = new ho.d0(aVar, localDate, localDate2, localDate3, 3);
                            mVar2.K(d0Var2);
                            objQ = d0Var2;
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                    boolean zR5 = mVar2.r(aVar);
                    Object objQ2 = mVar2.q();
                    if (zR5) {
                        objQ2 = new g(aVar, 0);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new g(aVar, 0);
                            mVar2.K(objQ2);
                        }
                    }
                    b82.n.d(null, strQ, strQ2, null, strQ3, aVar3, strQ4, (e23.a) objQ2, mVar2, 0, 9);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
