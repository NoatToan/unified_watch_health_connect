package jl0;

import am.j;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h82.p;
import i3.i7;
import i3.mh;
import i3.ua;
import java.util.Locale;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import v.h;
import v62.n7;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99468a;

        static {
            int[] iArr = new int[il0.c.values().length];
            try {
                iArr[il0.c.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[il0.c.DOWNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[il0.c.NOT_DOWNLOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[il0.c.DOWNLOAD_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f99468a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x0417  */
    /* JADX WARN: Code duplicated, block: B:125:0x0458  */
    /* JADX WARN: Code duplicated, block: B:98:0x0395  */
    public static final void a(il0.a aVar, r rVar, l<? super il0.a, Unit> lVar, m mVar, int i14, int i15) {
        l<? super il0.a, Unit> lVar2;
        int i16;
        l<? super il0.a, Unit> lVar3;
        l<? super il0.a, Unit> lVar4;
        String strQ;
        l<? super il0.a, Unit> lVar5;
        l<? super il0.a, Unit> lVar6;
        aVar.getClass();
        o0 o0VarE = mVar.E(1167727830);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i16 = i17 | (o0VarE.r(lVar2) ? 256 : 128);
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            m.a aVar2 = m.f135153a;
            if (i18 != 0) {
                Object objQ = o0VarE.q();
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j02.r(26);
                    o0VarE.K(objQ);
                }
                lVar4 = (l) objQ;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            r.a aVar4 = r.S;
            r rVarX = x2.x(u2Var.a(aVar4, 1.0f, true), null, 3);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarX, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            int i19 = i16;
            String name = aVar.getName();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            f02.m.f67741a.getClass();
            l<? super il0.a, Unit> lVar7 = lVar4;
            mh.c(name, null, f02.m.a(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131066);
            if (aVar.getStatus() == il0.c.DOWNLOAD_FAILED) {
                o0VarE.C(-2004426001);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_download_failed);
                fVar2.getClass();
                x0 x0Var2 = j92.f.f97932i;
                long jE = d92.b.a(o0VarE).k().e();
                bVar.getClass();
                mh.c(strQ2, c2.l.C(aVar4, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 131064);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2004125890);
                String strQ3 = gl1.y.Q(o0VarE, R.string.no_value);
                String city = aVar.getCity();
                if (city == null) {
                    city = "";
                }
                if (w.J(city)) {
                    city = strQ3;
                }
                String state = aVar.getState();
                if (state == null) {
                    state = "";
                }
                String upperCase = state.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (!w.J(upperCase)) {
                    strQ3 = upperCase;
                }
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                bVar.getClass();
                mh.c(((Object) city) + ", " + ((Object) strQ3), c2.l.C(aVar4, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            if (aVar.getDistanceFromOrigin() != null) {
                o0VarE.C(-2003673383);
                String str = aVar.getDistanceFromOrigin() + StringUtils.SPACE + gl1.y.Q(o0VarE, aVar.getDistanceUnitLabel());
                fVar2.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0VarE);
                bVar.getClass();
                o0 o0Var = o0VarE;
                mh.c(str, c2.l.C(aVar4, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 131068);
                o0VarE = o0Var;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2003400986);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            il0.c status = aVar.getStatus();
            if (status == null) {
                o0VarE.C(-1733746533);
                o0VarE.g0(false);
                strQ = null;
            } else {
                o0VarE.C(-1733746532);
                il0.c.f93960a.getClass();
                strQ = gl1.y.Q(o0VarE, il0.c.a.a(status));
                o0VarE.g0(false);
            }
            if (strQ == null) {
                strQ = "";
            }
            il0.c status2 = aVar.getStatus();
            int i24 = status2 == null ? -1 : a.f99468a[status2.ordinal()];
            if (i24 == 1) {
                lVar5 = lVar7;
                o0VarE.C(-1733601421);
                bVar.getClass();
                r rVarQ = x2.q(r28, j92.b.f97901d.f97904c);
                boolean zB = o0VarE.B(strQ);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new e(strQ, 0);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e(strQ, 0);
                        o0VarE.K(objQ2);
                    }
                }
                r rVarC3 = v.c((l) objQ2, rVarQ, false);
                o0 o0Var2 = o0VarE;
                long jG = vb.h.g(o0Var2);
                g6.f.a aVar5 = g6.f.f75994b;
                ua.a(2, 0.0f, 0, 384, 56, jG, 0L, rVarC3, o0Var2);
                o0VarE = o0Var2;
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
            } else if (i24 == 2) {
                lVar5 = lVar7;
                o0VarE.C(-1733159733);
                t4.d dVarA = n5.c.a(R.drawable.check, o0VarE, 0);
                long jD = j.d(o0VarE);
                boolean zB2 = o0VarE.B(strQ);
                Object objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new e(strQ, 1);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new e(strQ, 1);
                        o0VarE.K(objQ3);
                    }
                }
                i7.a(dVarA, null, v.c((l) objQ3, r28, false), jD, o0VarE, 48, 0);
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
            } else if (i24 == 3 || i24 == 4) {
                o0VarE.C(-1732718913);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = n7.a(t62.b.f162798a);
                long jA = f02.m.a();
                boolean zB3 = o0VarE.B(strQ);
                Object objQ4 = o0VarE.q();
                if (zB3) {
                    objQ4 = new e(strQ, 2);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new e(strQ, 2);
                        o0VarE.K(objQ4);
                    }
                }
                r rVarC4 = v.c((l) objQ4, aVar4, false);
                boolean z14 = ((i19 & 14) == 4) | ((i19 & 896) == 256);
                Object objQ5 = o0VarE.q();
                if (z14) {
                    lVar6 = lVar7;
                    objQ5 = new f(lVar6, aVar, 0);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == m.a.f135155b) {
                        lVar6 = lVar7;
                        objQ5 = new f(lVar6, aVar, 0);
                        o0VarE.K(objQ5);
                    } else {
                        lVar6 = lVar7;
                    }
                }
                lVar5 = lVar6;
                i7.b(dVarA2, null, u1.w.d(rVarC4, false, null, null, (e23.a) objQ5, 15), jA, o0VarE, 48, 0);
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
            } else {
                o0VarE.C(1606687414);
                o0VarE.g0(false);
                Unit unit4 = Unit.INSTANCE;
                lVar5 = lVar7;
            }
            o0VarE.g0(true);
            lVar3 = lVar5;
        } else {
            o0VarE.e();
            lVar3 = lVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(aVar, rVar, (l) lVar3, i14, i15);
        }
    }
}
