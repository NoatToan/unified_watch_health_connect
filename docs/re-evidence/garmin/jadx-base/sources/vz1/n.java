package vz1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import l72.x0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import tn2.s0;
import vd0.f0;
import vn2.b1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f180920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f180921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm1.s f180922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm1.q f180923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zm1.q f180924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.e f180925g;

    public /* synthetic */ n(DateTime dateTime, DateTime dateTime2, zm1.s sVar, zm1.q qVar, zm1.q qVar2, pi0.e eVar, int i14) {
        this.f180919a = i14;
        this.f180920b = dateTime;
        this.f180921c = dateTime2;
        this.f180922d = sVar;
        this.f180923e = qVar;
        this.f180924f = qVar2;
        this.f180925g = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        LocalDate localDate;
        DateTime dateTimeAtStartOfDay;
        LocalDate localDate2;
        DateTime dateTimeAtStartOfDay2;
        switch (this.f180919a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    String strA = null;
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
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarH = x2.h(c2.l.A(rVarF, f14, 0.0f, 2), 350);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new b1(23);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    DateTime dateTime = this.f180920b;
                    boolean zR = mVar.r(dateTime);
                    DateTime dateTime2 = this.f180921c;
                    boolean zR2 = zR | mVar.r(dateTime2);
                    zm1.s sVar = this.f180922d;
                    boolean zR3 = zR2 | mVar.r(sVar);
                    Object objQ2 = mVar.q();
                    if (zR3 || objQ2 == c2565a) {
                        objQ2 = new s0(dateTime, 20, dateTime2, sVar);
                        mVar.K(objQ2);
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar, 6, 0);
                    zm1.q qVar = this.f180923e;
                    pi0.e eVar = this.f180925g;
                    String strA2 = (qVar == null || (localDate2 = qVar.f205329a) == null || (dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay()) == null) ? null : eVar.a(dateTimeAtStartOfDay2, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                    zm1.q qVar2 = this.f180924f;
                    if (qVar2 != null && (localDate = qVar2.f205329a) != null && (dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay()) != null) {
                        strA = eVar.a(dateTimeAtStartOfDay, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                    }
                    c2.l.f(x2.h(aVar, f14), mVar);
                    x0.f111346a.e(c2.l.A(aVar, f14, 0.0f, 2), z3.f.c(-1300336144, new f0(qVar, strA2, qVar2, strA, 2), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    m92.o.a(u1.n.e(c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), d92.b.a(mVar2).c().c(), m1.f128891a), gl1.y.Q(mVar2, R.string.lbl_daily_scores), null, null, z3.f.c(1362317279, new n(this.f180920b, this.f180921c, this.f180922d, this.f180923e, this.f180924f, this.f180925g, 0), mVar2), null, null, mVar2, 24576, 108);
                    g6.f.a aVar5 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar4, 16), mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
