package ln1;

import android.content.Context;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import km1.v;
import l3.p1;
import li0.x;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113677a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f113678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.c f113679c;

    public /* synthetic */ l(Context context, km1.c cVar) {
        this.f113678b = context;
        this.f113679c = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        String strE;
        String string;
        jm1.c sleepScores;
        jm1.c sleepScores2;
        int i14 = this.f113677a;
        km1.c cVar = this.f113679c;
        Context context = this.f113678b;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar, 16);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    jm1.d remPercentage = null;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    v dailySleep = cVar.getDailySleep();
                    if (dailySleep != null && (sleepScores2 = dailySleep.getSleepScores()) != null) {
                        remPercentage = sleepScores2.getRemPercentage();
                    }
                    if (remPercentage != null) {
                        mVar2.C(878177143);
                        mn1.d dVar = new mn1.d(new l22.a(context));
                        oi0.h hVar = new oi0.h(context);
                        c2.l.f(x2.h(aVar, 48), mVar2);
                        l22.b bVar2 = dVar.f119771a;
                        String strA = bVar2.a(R.string.string_colon_pattern, bVar2.getString(R.string.lbl_your_total));
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar2), mVar2, 0, 0, 131070);
                        mVar = mVar2;
                        c2.l.f(x2.h(aVar, 24), mVar);
                        v dailySleep2 = cVar.getDailySleep();
                        boolean zQ = (dailySleep2 == null || (sleepScores = dailySleep2.getSleepScores()) == null) ? false : sleepScores.q();
                        int iH0 = (int) (((double) cVar.h0()) * 60.0d);
                        m.b(0, dVar.c(iH0), hVar.c(iH0, true), mVar, zQ);
                        Integer numQ = cVar.q();
                        if (numQ == null || (strE = String.valueOf(numQ.intValue())) == null) {
                            strE = dVar.e();
                        }
                        String strA2 = bVar2.a(R.string.lbl_sessions_over_5_minutes, strE);
                        if (numQ == null) {
                            string = bVar2.a(R.string.lbl_awakenings, "0");
                        } else {
                            string = numQ.intValue() == 1 ? bVar2.getString(R.string.lbl_one_awakening) : bVar2.a(R.string.lbl_awakenings, numQ);
                        }
                        m.b(0, strA2, bVar2.a(R.string.lbl_sessions_over_5_minutes_without_abbreviation, string), mVar, zQ);
                        mVar.f();
                    } else {
                        mVar = mVar2;
                        mVar.C(879691679);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(c2.l.A(h4.r.S, 16, 0.0f, 2), 1.0f), 270);
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new x(23);
                        mVar3.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR = mVar3.r(context) | mVar3.r(cVar);
                    Object objQ2 = mVar3.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new p1(16, context, cVar);
                        mVar3.K(objQ2);
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar3, 54, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(km1.c cVar, Context context) {
        this.f113679c = cVar;
        this.f113678b = context;
    }
}
