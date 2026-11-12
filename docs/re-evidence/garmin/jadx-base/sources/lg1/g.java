package lg1;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.fe;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import u1.a2;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112251a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestGoogleAgeSignalsActivity f112252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f112253c;

    public /* synthetic */ g(TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity, fe feVar) {
        this.f112252b = testGoogleAgeSignalsActivity;
        this.f112253c = feVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112251a;
        fe feVar = this.f112253c;
        TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity = this.f112252b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                int i15 = TestGoogleAgeSignalsActivity.f41746b;
                testGoogleAgeSignalsActivity.L9(feVar, mVar, p0.t(7));
                return Unit.INSTANCE;
            default:
                int iIntValue = num.intValue();
                int i16 = TestGoogleAgeSignalsActivity.f41746b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarB = a2.b(x2.d(r.S, 1.0f), a2.a(mVar), true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(rVarB, j92.b.f97899b.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar = h4.d.a.f81537o;
                    j.f22691a.getClass();
                    z zVarA = y.a(j.f22694d, aVar, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    testGoogleAgeSignalsActivity.M9(mVar, 0);
                    testGoogleAgeSignalsActivity.K9(mVar, 0);
                    testGoogleAgeSignalsActivity.N9(mVar, 0);
                    testGoogleAgeSignalsActivity.L9(feVar, mVar, 6);
                    testGoogleAgeSignalsActivity.O9(mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity, fe feVar, int i14) {
        this.f112252b = testGoogleAgeSignalsActivity;
        this.f112253c = feVar;
    }
}
