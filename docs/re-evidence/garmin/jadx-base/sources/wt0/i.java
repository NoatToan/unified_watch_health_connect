package wt0;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import c2.b0;
import c2.l;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.k;
import d53.u;
import e23.p;
import gg1.o0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.fe;
import i3.i7;
import i3.mh;
import org.joda.time.DateTime;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.f0;
import s5.w0;
import s5.x0;
import u1.y0;
import v62.r9;
import wv0.t;
import x5.l0;
import x91.o;
import xg0.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187023a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f187023a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                j jVar = j.f187024a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    d.a(false, new tt0.e.a("123", "Ad Hoc #1", DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S"), DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S"), 1, new tt0.a.C3128a(10, 2L)), mVar, 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                j jVar2 = j.f187024a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    d.d(false, new tt0.e.c("123", k.LONG_DISTANCE.f30610a, "Expedition #1", 90.0d, 100.0d, 90, DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S"), DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S")), o0.METRIC, mVar2, 390);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                j jVar3 = j.f187024a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    d.b(false, new tt0.e.b("123", "Badge #1", k.LONG_DISTANCE.f30610a, 90.0d, 100.0d, 90, DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S"), DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S"), true, 4, true), o0.METRIC, mVar3, 390);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                wu0.a aVar = wu0.a.f187235a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strQ = y.Q(mVar4, R.string.lbl_group_ride_setup);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                wu0.a aVar2 = wu0.a.f187235a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar3 = r.S;
                    r rVarC = x2.c(x2.f(aVar3, 1.0f), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = l.y(rVarC, eVar.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(cVar, h4.d.a.f81537o, mVar5, 54);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC2 = h4.k.c(rVarY, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar4);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar5);
                    b0 b0Var = b0.f22601a;
                    y0.a(n5.c.a(2131231871, mVar5, 0), "", l.y(aVar3, eVar.f97920e), null, null, 0.0f, null, mVar5, 48, 120);
                    String strQ2 = y.Q(mVar5, R.string.lbl_group_ride_consent_title);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar5, 0, 0, 131068);
                    String strQ3 = y.Q(mVar5, R.string.lbl_group_ride_consent_description);
                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar5);
                    d6.h.f57752b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar5, 0, 0, 130046);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Fragment) obj).getClass();
                ((dx2.c) obj2).getClass();
                return Unit.INSTANCE;
            case 6:
                Scope scope = (Scope) obj;
                wv.a aVar5 = wv.a.f187356a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new uv.d(ModuleExtKt.androidContext(scope));
            case 7:
                boolean zBooleanValue = false;
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                wv.a aVar6 = wv.a.f187356a;
                scope2.getClass();
                parametersHolder.getClass();
                long jLongValue = parametersHolder.isNotEmpty() ? ((Number) parametersHolder.get(0)).longValue() : -1L;
                if (parametersHolder.isNotEmpty()) {
                    zBooleanValue = ((Boolean) parametersHolder.get(1)).booleanValue();
                }
                return new yv.d(jLongValue, zBooleanValue, (uv.d) scope2.get((k23.d<?>) s0.f105811a.b(uv.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 8:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                t tVar = t.f187446a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.plus, mVar6, 0);
                    long jG = fb1.c.g(d92.b.f58623a, mVar6);
                    r.a aVar7 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, x2.q(aVar7, j92.b.f97901d.f97903b), jG, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).intValue();
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                x41.a aVar8 = x41.a.f188818a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    l51.k.a(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                d4.n nVar = (d4.n) obj;
                l0 l0Var = (l0) obj2;
                return x.d(f0.a(l0Var.f188878a, f0.f157159a, nVar), f0.a(w0.a(l0Var.f188879b), f0.f157174p, nVar));
            case 12:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                x70.e eVar2 = x70.e.f189404a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r.a aVar9 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar9, j92.b.f97899b.f97917b), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                x72.g.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                x72.e eVar3 = (x72.e) obj2;
                ((d4.n) obj).getClass();
                eVar3.getClass();
                return u0.e(new o13.p("themeMode", Integer.valueOf(eVar3.f189449a.ordinal())), new o13.p("colorMode", Integer.valueOf(eVar3.f189450b.ordinal())), new o13.p("fontScaleMode", Integer.valueOf(eVar3.f189452d.ordinal())), new o13.p("fontScale", Integer.valueOf((int) eVar3.f189451c)), new o13.p("textDirection", Integer.valueOf(eVar3.f189453e.ordinal())));
            case 15:
                ((Long) obj).longValue();
                ((q91.d) obj2).getClass();
                return Unit.INSTANCE;
            case 16:
                ((Long) obj).longValue();
                ((q91.d) obj2).getClass();
                return Unit.INSTANCE;
            case 17:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                x91.k kVar = x91.k.f189620a;
                long j8 = 1L;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    aa1.e eVar4 = new aa1.e(false, false, false, q91.d.f143561h, "1 km", 1L, "7:45", null, "Aug 1, 2026", null, i53.a.a(new aa1.d("Olathe Run 1 km", null, "Aug 1, 2026 9:45 AM", 1L, "7:45", null, j8, j8, "running", 745.0d, 34, null)), 647, null);
                    fe feVar = new fe();
                    Object objQ = mVar9.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new x91.j((int) (null == true ? 1 : 0));
                        mVar9.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar9.q();
                    int i15 = 18;
                    if (objQ2 == c2565a) {
                        objQ2 = new i(null == true ? 1 : 0, i15);
                        mVar9.K(objQ2);
                    }
                    p pVar = (p) objQ2;
                    Object objQ3 = mVar9.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new x1.b(i15);
                        mVar9.K(objQ3);
                    }
                    e23.a aVar10 = (e23.a) objQ3;
                    Object objQ4 = mVar9.q();
                    int i16 = 19;
                    if (objQ4 == c2565a) {
                        objQ4 = new x1.b(i16);
                        mVar9.K(objQ4);
                    }
                    e23.a aVar11 = (e23.a) objQ4;
                    Object objQ5 = mVar9.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new i(null == true ? 1 : 0, i16);
                        mVar9.K(objQ5);
                    }
                    p pVar2 = (p) objQ5;
                    Object objQ6 = mVar9.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new x91.j(i14);
                        mVar9.K(objQ6);
                    }
                    e23.l lVar2 = (e23.l) objQ6;
                    Object objQ7 = mVar9.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new x1.b(20);
                        mVar9.K(objQ7);
                    }
                    o.a(eVar4, feVar, lVar, pVar, aVar10, aVar11, pVar2, lVar2, (e23.a) objQ7, null, null, mVar9, 115043712, 1536);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Long) obj).longValue();
                x91.k kVar2 = x91.k.f189620a;
                return Unit.INSTANCE;
            case 19:
                ((Long) obj).longValue();
                x91.k kVar3 = x91.k.f189620a;
                ((q91.d) obj2).getClass();
                return Unit.INSTANCE;
            case 20:
                ((Long) obj).longValue();
                ((q91.d) obj2).getClass();
                return Unit.INSTANCE;
            case 21:
                ((Long) obj).longValue();
                ((q91.d) obj2).getClass();
                return Unit.INSTANCE;
            case 22:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger = xc0.g.f189921g;
                dialogInterface.getClass();
                dialogInterface.cancel();
                return Unit.INSTANCE;
            case 23:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger2 = xc0.g.f189921g;
                dialogInterface2.getClass();
                dialogInterface2.cancel();
                return Unit.INSTANCE;
            case 24:
                return Integer.valueOf(((xd1.d) obj).f190018a.compareTo(((xd1.d) obj2).f190018a));
            case 25:
                xd1.d dVar = (xd1.d) obj2;
                if (!u.q(((xd1.d) obj).f190018a, "Unknown", true)) {
                    i14 = u.q(dVar.f190018a, "Unknown", true) ? -1 : 0;
                }
                return Integer.valueOf(i14);
            case 26:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                w wVar = w.f190854a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    mh.c(y.Q(mVar10, R.string.lbl_add_photo), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar10, 0, 0, 262142);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                w wVar2 = w.f190854a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    String strQ4 = y.Q(mVar11, R.string.lbl_unfollow);
                    d92.b.f58623a.getClass();
                    mh.c(strQ4, null, d92.b.a(mVar11).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar11, 0, 0, 262138);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 28:
                boolean z14 = false;
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                w wVar3 = w.f190854a;
                if ((iIntValue12 & 3) != 2) {
                    z14 = true;
                }
                if (mVar12.n(iIntValue12 & 1, z14)) {
                    x1 x1Var12 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = r9.a(t62.b.f162798a);
                    d92.b.f58623a.getClass();
                    i7.b(dVarA2, null, null, d92.b.a(mVar12).f().f(), mVar12, 48, 4);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                w wVar4 = w.f190854a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    mh.c(y.Q(mVar13, R.string.title_edit_activity), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar13, 0, 0, 262142);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(byte b14, int i14) {
        this.f187023a = i14;
    }
}
