package lg1;

import ak0.o;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import e23.p;
import i3.fe;
import p005kotlin.Unit;
import p006l2.v0;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestGoogleAgeSignalsActivity f112250b;

    public /* synthetic */ f(TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity, int i14) {
        this.f112249a = i14;
        this.f112250b = testGoogleAgeSignalsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112249a;
        m.a aVar = m.f135153a;
        TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity = this.f112250b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1454859474, new f(testGoogleAgeSignalsActivity, 5), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i16 = TestGoogleAgeSignalsActivity.f41746b;
                testGoogleAgeSignalsActivity.M9((m) obj, p0.t(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int i17 = TestGoogleAgeSignalsActivity.f41746b;
                testGoogleAgeSignalsActivity.K9((m) obj, p0.t(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i18 = TestGoogleAgeSignalsActivity.f41746b;
                testGoogleAgeSignalsActivity.N9((m) obj, p0.t(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i19 = TestGoogleAgeSignalsActivity.f41746b;
                testGoogleAgeSignalsActivity.O9((m) obj, p0.t(1));
                break;
            case 5:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i24 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new fe();
                        mVar2.K(objQ);
                    }
                    fe feVar = (fe) objQ;
                    z02.d.a(false, z3.f.c(1599920493, new f(testGoogleAgeSignalsActivity, 6), mVar2), z3.f.c(-599211252, new o(feVar, 24), mVar2), null, null, z3.f.c(1393328105, new g(testGoogleAgeSignalsActivity, feVar), mVar2), mVar2, 197040, 25);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i25 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zR = mVar3.r(testGoogleAgeSignalsActivity);
                    Object objQ2 = mVar3.q();
                    if (zR) {
                        objQ2 = new v0(testGoogleAgeSignalsActivity, 10);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new v0(testGoogleAgeSignalsActivity, 10);
                            mVar3.K(objQ2);
                        }
                    }
                    z02.f.c(6, 54, null, (e23.a) objQ2, null, "Test Google Age Signals", mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity, int i14, int i15) {
        this.f112249a = i15;
        this.f112250b = testGoogleAgeSignalsActivity;
    }
}
