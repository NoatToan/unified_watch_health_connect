package an0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import d6.p;
import do1.o;
import e23.l;
import f12.u;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import i3.mh;
import j92.f;
import km0.m;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v.h;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0205  */
    /* JADX WARN: Code duplicated, block: B:107:0x0211  */
    /* JADX WARN: Code duplicated, block: B:110:0x026e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0275  */
    /* JADX WARN: Code duplicated, block: B:113:0x0279  */
    /* JADX WARN: Code duplicated, block: B:118:0x0294  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:143:0x033c  */
    /* JADX WARN: Code duplicated, block: B:144:0x033e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0370  */
    /* JADX WARN: Code duplicated, block: B:148:0x0396  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4  */
    public static final void a(m mVar, l<? super Long, Unit> lVar, l<? super Long, Unit> lVar2, p3.m mVar2, int i14) {
        int i15;
        boolean z14;
        long jE;
        hi0.l lVar3;
        g.a.f fVar;
        boolean z15;
        boolean z16;
        Object objQ;
        j profileImageUrls;
        String str;
        Long userLevel;
        u uVarA;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        String fullName;
        hi0.e followStatus;
        hi0.e.b relationshipStatus;
        hi0.g info;
        String str2;
        String fullName2;
        Long count;
        String str3;
        mVar.getClass();
        wm0.b bVar = mVar.f105413b;
        hi0.l lVar4 = mVar.f105412a;
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar2.E(-627908273);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(mVar) : o0VarE.r(mVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o oVar = (o) KoinJavaComponent.get$default(o.class, null, null, 6, null);
            boolean zK = o0VarE.k(bVar == null ? -1 : bVar.ordinal());
            Object objQ2 = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zK) {
                if (bVar == wm0.b.INVITED) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = Boolean.valueOf(z14);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    if (bVar == wm0.b.INVITED) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ2 = Boolean.valueOf(z14);
                    o0VarE.K(objQ2);
                }
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            r.a aVar2 = r.S;
            int i16 = i15 & 14;
            boolean zH = ((i15 & 112) == 32) | ((i15 & 896) == 256) | o0VarE.h(zBooleanValue) | (i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(mVar)));
            Object objQ3 = o0VarE.q();
            if (zH) {
                objQ3 = new d(zBooleanValue, lVar2, mVar, lVar);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new d(zBooleanValue, lVar2, mVar, lVar);
                    o0VarE.K(objQ3);
                }
            }
            r rVarD = w.d(aVar2, false, null, null, (e23.a) objQ3, 15);
            if (zBooleanValue) {
                o0VarE.C(-2124407241);
                jE = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(-2124406057);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
            }
            r rVarE = u1.n.e(rVarD, jE, m1.f128891a);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
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
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            g.a.b bVar4 = g.a.f81813j;
            if (o0VarE.T) {
                lVar3 = lVar4;
            } else {
                lVar3 = lVar4;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                boolean zR = o0VarE.r(context);
                if (i16 != 4 || ((i15 & 8) != 0 && o0VarE.r(mVar))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zR | z15;
                objQ = o0VarE.q();
                if (z16) {
                    objQ = new a11.n(28, context, mVar);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a11.n(28, context, mVar);
                        o0VarE.K(objQ);
                    }
                }
                r rVarD2 = w.d(aVar2, false, null, null, (e23.a) objQ, 15);
                profileImageUrls = lVar3.getProfileImageUrls();
                if (profileImageUrls != null) {
                    str = profileImageUrls.f46879h;
                } else {
                    str = null;
                }
                userLevel = lVar3.getUserLevel();
                if (userLevel != null) {
                    uVarA = u.a((int) userLevel.longValue());
                } else {
                    uVarA = null;
                }
                b12.b bVar5 = new b12.b(str, null, uVarA, null, null, 26, null);
                bVar2.getClass();
                b12.k.b(rVarD2, null, j92.b.f97901d.f97906e, bVar5, o0VarE, b12.b.f14385f << 9, 18);
                r rVarA = u2Var.a(aVar2, 1.0f, true);
                bVar2.getClass();
                r rVarA2 = c2.l.A(rVarA, eVar.f97920e, 0.0f, 2);
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA2, o0VarE);
                if (cVar != null) {
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
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                fullName = lVar3.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(f.f97931h, o0VarE);
                p.f57793b.getClass();
                int i17 = p.f57795d;
                mh.c(fullName, null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, x0VarB, o0VarE, 0, 24960, 110590);
                oVar.getClass();
                followStatus = lVar3.getFollowStatus();
                if (followStatus != null) {
                    relationshipStatus = followStatus.getRelationshipStatus();
                } else {
                    relationshipStatus = null;
                }
                int i18 = relationshipStatus != null ? o.a.f60609b[relationshipStatus.ordinal()] : -1;
                str2 = ((i18 == 1 && i18 != 2) || (info = lVar3.getInfo()) == null || (fullName2 = info.getFullName()) == null || (count = lVar3.getInfo().getCount()) == null) ? lVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String() : oVar.b((int) count.longValue(), fullName2);
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                fVar2.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 2, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                if (zBooleanValue) {
                    o0VarE.C(2088787960);
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, null, hb.a.s(o0VarE), o0VarE, 48, 4);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2088963823);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var2 = u2.f22900a;
            boolean zR2 = o0VarE.r(context);
            if (i16 != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            z16 = zR2 | z15;
            objQ = o0VarE.q();
            if (z16) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a11.n(28, context, mVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a11.n(28, context, mVar);
                o0VarE.K(objQ);
            }
            r rVarD3 = w.d(aVar2, false, null, null, (e23.a) objQ, 15);
            profileImageUrls = lVar3.getProfileImageUrls();
            if (profileImageUrls != null) {
                str = profileImageUrls.f46879h;
            } else {
                str = null;
            }
            userLevel = lVar3.getUserLevel();
            if (userLevel != null) {
                uVarA = u.a((int) userLevel.longValue());
            } else {
                uVarA = null;
            }
            b12.b bVar6 = new b12.b(str, null, uVarA, null, null, 26, null);
            bVar2.getClass();
            b12.k.b(rVarD3, null, j92.b.f97901d.f97906e, bVar6, o0VarE, b12.b.f14385f << 9, 18);
            r rVarA3 = u2Var2.a(aVar2, 1.0f, true);
            bVar2.getClass();
            r rVarA4 = c2.l.A(rVarA3, eVar.f97920e, 0.0f, 2);
            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA4, o0VarE);
            if (cVar != null) {
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
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            fullName = lVar3.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0VarB2 = d92.c.b(f.f97931h, o0VarE);
            p.f57793b.getClass();
            int i19 = p.f57795d;
            mh.c(fullName, null, 0L, null, 0L, null, 0L, null, 0L, i19, false, 1, 0, null, x0VarB2, o0VarE, 0, 24960, 110590);
            oVar.getClass();
            followStatus = lVar3.getFollowStatus();
            if (followStatus != null) {
                relationshipStatus = followStatus.getRelationshipStatus();
            } else {
                relationshipStatus = null;
            }
            int i110 = relationshipStatus != null ? o.a.f60609b[relationshipStatus.ordinal()] : -1;
            if (i110 == 1) {
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            fVar3.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, i19, false, 2, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            if (zBooleanValue) {
                o0VarE.C(2088787960);
                s62.a.f157643a.getClass();
                i7.b(e1.a(t62.b.f162798a), null, null, hb.a.s(o0VarE), o0VarE, 48, 4);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(2088963823);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(mVar, lVar, lVar2, i14, 5);
        }
    }
}
