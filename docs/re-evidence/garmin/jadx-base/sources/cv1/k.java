package cv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c42.c0;
import ca0.v0;
import com.garmin.android.apps.connectmobile.R;
import cq.t;
import cw1.q0;
import d6.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.Locale;
import kotlin.t1;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    public static final void a(r rVar, String str, String str2, String str3, String str4, hv1.c cVar, p3.m mVar, int i14) {
        hv1.c cVar2;
        o0 o0Var;
        boolean z14;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1974505831);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.B(str4) ? 16384 : 8192) | (o0VarE.k(cVar.ordinal()) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(u1.n.e(rVar, am.j.B(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            String str5 = null;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            r rVarC2 = u.f22885a.c(rVar, h4.d.a.f81530h);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar2 = r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97918c;
            float f15 = eVar2.f97918c;
            float f16 = eVar2.f97917b;
            bVar2.getClass();
            r rVarZ = c2.l.z(aVar2, f14, f16);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                z14 = true;
                objQ = new t(str2, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z14 = true;
                    objQ = new t(str2, 1);
                    o0VarE.K(objQ);
                } else {
                    z14 = true;
                }
            }
            r rVarC4 = v.c((e23.l) objQ, rVarZ, false);
            p.f57793b.getClass();
            int i16 = p.f57795d;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, i16, false, 1, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, (i15 >> 3) & 14, 24960, 110588);
            bVar2.getClass();
            bVar2.getClass();
            r rVarZ2 = c2.l.z(aVar2, f15, f16);
            fVar2.getClass();
            x0 x0Var = j92.f.f97933j;
            mh.c(str3, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, i16, false, 2, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, (i15 >> 9) & 14, 24960, 110588);
            bVar2.getClass();
            bVar2.getClass();
            r rVarZ3 = c2.l.z(aVar2, f15, f16);
            if (str4 == null) {
                o0VarE.C(1234585273);
                o0VarE.g0(false);
                cVar2 = cVar;
            } else {
                o0VarE.C(1234585274);
                cVar2 = cVar;
                if (cVar2 == hv1.c.VIDEO) {
                    o0VarE.C(333317692);
                    o0VarE.g0(false);
                    str5 = str4;
                } else {
                    o0VarE.C(333318179);
                    String strP = gl1.y.P(R.string.num_min_read, new Object[]{str4}, o0VarE);
                    o0VarE.g0(false);
                    str5 = strP;
                }
                o0VarE.g0(false);
            }
            if (str5 == null) {
                str5 = "";
            }
            fVar2.getClass();
            mh.c(str5, rVarZ3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 1, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 221184, 81916);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            cVar2 = cVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c(rVar, str, str2, str3, str4, cVar2, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x014a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01da  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0265  */
    /* JADX WARN: Code duplicated, block: B:72:0x0269  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(r rVar, String str, hv1.c cVar, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        p3.c<?> cVar2;
        h5.g.a.f fVar;
        u uVar;
        r.a aVar2;
        int i15;
        boolean z15;
        o0 o0Var2;
        j92.b bVar;
        j92.e eVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean z16;
        Object objQ;
        o0 o0VarE = mVar.E(-292509090);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.k(cVar.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            gl.c.f77766a.getClass();
            long jG = gl.c.a(o0VarE).g();
            m1.a aVar3 = m1.f128891a;
            r rVarE = u1.n.e(rVarF, jG, aVar3);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar2 = cVar3;
            } else {
                cVar2 = cVar3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                uVar = u.f22885a;
                aVar2 = r.S;
                g6.f.a aVar5 = g6.f.f75994b;
                r rVarT = x2.t(uVar.c(aVar2, gVar), 300, 400, 0.0f, 12);
                f5.k.f68985a.getClass();
                jf.r.a(str, "", rVarT, null, null, f5.k.a.f68987b, null, o0VarE, ((i16 >> 3) & 14) | 1572912, 1976);
                if (cVar == hv1.c.VIDEO) {
                    o0VarE.C(-1621164926);
                    if ((i16 & 57344) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ = o0VarE.q();
                    if (z16) {
                        objQ = new v0(aVar, 25);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v0(aVar, 25);
                            o0VarE.K(objQ);
                        }
                    }
                    i15 = 0;
                    q0.a((e23.a) objQ, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    i15 = 0;
                    o0VarE.C(-1621076514);
                    o0VarE.g0(false);
                }
                if (z14) {
                    o0VarE.C(-1621026480);
                    r rVarC3 = uVar.c(aVar2, h4.d.a.f81524b);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    float f14 = eVar.f97917b;
                    bVar.getClass();
                    r rVarC4 = c2.l.C(rVarC3, eVar.f97917b, f14, 0.0f, 0.0f, 12);
                    bVar.getClass();
                    r rVarE2 = u1.n.e(l4.k.b(rVarC4, k2.i.a(j92.b.f97900c.f97910b)), d92.b.a(o0VarE).c().f(), aVar3);
                    c2.j.f22691a.getClass();
                    zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i15);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarE2, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    bVar.getClass();
                    float f15 = eVar.f97918c;
                    bVar.getClass();
                    r rVarZ = c2.l.z(aVar2, f15, eVar.f97917b);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97935l, o0VarE);
                    String upperCase = gl1.y.Q(o0VarE, R.string.social_new_badge_hint).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                    o0 o0Var3 = o0VarE;
                    z15 = true;
                    o0Var3.g0(true);
                    o0Var3.g0(i15);
                    o0Var2 = o0Var3;
                } else {
                    z15 = true;
                    o0VarE.C(-1620367234);
                    o0VarE.g0(i15);
                    o0Var2 = o0VarE;
                }
                o0Var2.g0(z15);
                o0Var = o0Var2;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            uVar = u.f22885a;
            aVar2 = r.S;
            g6.f.a aVar6 = g6.f.f75994b;
            r rVarT2 = x2.t(uVar.c(aVar2, gVar), 300, 400, 0.0f, 12);
            f5.k.f68985a.getClass();
            jf.r.a(str, "", rVarT2, null, null, f5.k.a.f68987b, null, o0VarE, ((i16 >> 3) & 14) | 1572912, 1976);
            if (cVar == hv1.c.VIDEO) {
                o0VarE.C(-1621164926);
                if ((i16 & 57344) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ = o0VarE.q();
                if (z16) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new v0(aVar, 25);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new v0(aVar, 25);
                    o0VarE.K(objQ);
                }
                i15 = 0;
                q0.a((e23.a) objQ, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                i15 = 0;
                o0VarE.C(-1621076514);
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE.C(-1621026480);
                r rVarC5 = uVar.c(aVar2, h4.d.a.f81524b);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f16 = eVar.f97917b;
                bVar.getClass();
                r rVarC6 = c2.l.C(rVarC5, eVar.f97917b, f16, 0.0f, 0.0f, 12);
                bVar.getClass();
                r rVarE3 = u1.n.e(l4.k.b(rVarC6, k2.i.a(j92.b.f97900c.f97910b)), d92.b.a(o0VarE).c().f(), aVar3);
                c2.j.f22691a.getClass();
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i15);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE3, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                bVar.getClass();
                float f17 = eVar.f97918c;
                bVar.getClass();
                r rVarZ2 = c2.l.z(aVar2, f17, eVar.f97917b);
                d92.b.f58624b.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97935l, o0VarE);
                String upperCase2 = gl1.y.Q(o0VarE, R.string.social_new_badge_hint).toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                mh.c(upperCase2, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
                o0 o0Var4 = o0VarE;
                z15 = true;
                o0Var4.g0(true);
                o0Var4.g0(i15);
                o0Var2 = o0Var4;
            } else {
                z15 = true;
                o0VarE.C(-1620367234);
                o0VarE.g0(i15);
                o0Var2 = o0VarE;
            }
            o0Var2.g0(z15);
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(rVar, str, cVar, z14, aVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x0196  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0203  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205  */
    /* JADX WARN: Code duplicated, block: B:91:0x020e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:95:0x0218  */
    /* JADX WARN: Code duplicated, block: B:97:0x024b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(final av1.g gVar, final e23.p<? super Long, ? super hv1.c, Unit> pVar, p3.m mVar, int i14) {
        r rVarR;
        hv1.c cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean z14;
        boolean z15;
        Object objQ;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ2;
        boolean z19;
        gVar.getClass();
        hv1.c cVar2 = gVar.f13277h;
        pVar.getClass();
        o0 o0VarE = mVar.E(1024353169);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(gVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16);
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar = r.S;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            float f14 = 150;
            g6.f.a aVar2 = g6.f.f75994b;
            aVar.getClass();
            if (f75992b <= 1.0f) {
                rVarR = x2.r(aVar, f14, 281.0f);
            } else if (f75992b > 1.0f && f75992b <= 1.3f) {
                rVarR = x2.r(aVar, f14, 281.0f * f75992b);
            } else if (f75992b <= 1.3f || f75992b >= 1.6f) {
                rVarR = f75992b >= 1.6f ? x2.r(aVar, f14 * 2, 281.0f * f75992b) : x2.r(aVar, f14, 281.0f);
            } else {
                rVarR = x2.r(aVar, f14, (281.0f * f75992b) - 50);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarE = u1.n.e(l4.k.b(rVarR, k2.i.a(j92.b.f97899b.f97918c)), ds.e0.w(o0VarE), m1.f128891a);
            int i17 = i15 & 112;
            int i18 = i15 & 14;
            boolean z24 = (i17 == 32) | (i18 == 4);
            Object objQ3 = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z24) {
                objQ3 = new e23.a() { // from class: cv1.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                av1.g gVar2 = gVar;
                                pVar.invoke(Long.valueOf(gVar2.f13270a), gVar2.f13277h);
                                break;
                            default:
                                av1.g gVar3 = gVar;
                                pVar.invoke(Long.valueOf(gVar3.f13270a), gVar3.f13277h);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e23.a() { // from class: cv1.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    av1.g gVar2 = gVar;
                                    pVar.invoke(Long.valueOf(gVar2.f13270a), gVar2.f13277h);
                                    break;
                                default:
                                    av1.g gVar3 = gVar;
                                    pVar.invoke(Long.valueOf(gVar3.f13270a), gVar3.f13277h);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ3, 15);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u uVar = u.f22885a;
                r rVarD2 = x2.d(aVar, 1.0f);
                c2.j.f22691a.getClass();
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD2, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                r rVarF = x2.f(aVar, 1.0f);
                boolean zR = o0VarE.r(context);
                if (i18 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zR | z14;
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new cn1.d(11, context, (Object) gVar);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cn1.d(11, context, (Object) gVar);
                        o0VarE.K(objQ);
                    }
                }
                r rVarB = v.b(rVarF, (e23.l) objQ);
                r rVarA = b0Var.a(rVarB, 0.7f, true);
                String str = gVar.f13276g;
                boolean z25 = gVar.f13278i;
                if (i17 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i18 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objQ2 = o0VarE.q();
                if (z18) {
                    z19 = true;
                    final char c14 = 1 == true ? 1 : 0;
                    objQ2 = new e23.a() { // from class: cv1.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (c14) {
                                case 0:
                                    av1.g gVar2 = gVar;
                                    pVar.invoke(Long.valueOf(gVar2.f13270a), gVar2.f13277h);
                                    break;
                                default:
                                    av1.g gVar3 = gVar;
                                    pVar.invoke(Long.valueOf(gVar3.f13270a), gVar3.f13277h);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        z19 = true;
                        final int c15 = 1 == true ? 1 : 0;
                        objQ2 = new e23.a() { // from class: cv1.j
                            @Override // e23.a
                            public final Object invoke() {
                                switch (c15) {
                                    case 0:
                                        av1.g gVar2 = gVar;
                                        pVar.invoke(Long.valueOf(gVar2.f13270a), gVar2.f13277h);
                                        break;
                                    default:
                                        av1.g gVar3 = gVar;
                                        pVar.invoke(Long.valueOf(gVar3.f13270a), gVar3.f13277h);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        z19 = true;
                    }
                }
                b(rVarA, str, cVar, z25, (e23.a) objQ2, o0VarE, 0);
                a(b0Var.a(rVarB, 0.3f, z19), gVar.f13271b, gVar.f13272c, gVar.f13273d, gVar.f13274e, cVar, o0VarE, 0);
                o0VarE = o0VarE;
                o0VarE.g0(z19);
                o0VarE.g0(z19);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u uVar2 = u.f22885a;
            r rVarD3 = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD3, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            r rVarF2 = x2.f(aVar, 1.0f);
            boolean zR2 = o0VarE.r(context);
            if (i18 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zR2 | z14;
            objQ = o0VarE.q();
            if (z15) {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cn1.d(11, context, (Object) gVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new cn1.d(11, context, (Object) gVar);
                o0VarE.K(objQ);
            }
            r rVarB2 = v.b(rVarF2, (e23.l) objQ);
            r rVarA2 = b0Var2.a(rVarB2, 0.7f, true);
            String str2 = gVar.f13276g;
            boolean z26 = gVar.f13278i;
            if (i17 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i18 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z16 | z17;
            objQ2 = o0VarE.q();
            if (z18) {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    z19 = true;
                    final int c16 = 1 == true ? 1 : 0;
                    objQ2 = new e23.a() { // from class: cv1.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (c16) {
                                case 0:
                                    av1.g gVar2 = gVar;
                                    pVar.invoke(Long.valueOf(gVar2.f13270a), gVar2.f13277h);
                                    break;
                                default:
                                    av1.g gVar3 = gVar;
                                    pVar.invoke(Long.valueOf(gVar3.f13270a), gVar3.f13277h);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    z19 = true;
                }
            } else {
                z19 = true;
                final int c17 = 1 == true ? 1 : 0;
                objQ2 = new e23.a() { // from class: cv1.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (c17) {
                            case 0:
                                av1.g gVar2 = gVar;
                                pVar.invoke(Long.valueOf(gVar2.f13270a), gVar2.f13277h);
                                break;
                            default:
                                av1.g gVar3 = gVar;
                                pVar.invoke(Long.valueOf(gVar3.f13270a), gVar3.f13277h);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            b(rVarA2, str2, cVar, z26, (e23.a) objQ2, o0VarE, 0);
            a(b0Var2.a(rVarB2, 0.3f, z19), gVar.f13271b, gVar.f13272c, gVar.f13273d, gVar.f13274e, cVar, o0VarE, 0);
            o0VarE = o0VarE;
            o0VarE.g0(z19);
            o0VarE.g0(z19);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(gVar, pVar, i14, 23);
        }
    }

    public static final void d(final i53.c<av1.g> cVar, final e23.p<? super Long, ? super hv1.c, Unit> pVar, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        cVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(1101589119);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.r(pVar) ? 32 : 16);
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar.size() > 2) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar2 = new e23.p(cVar, pVar, i14, i16) { // from class: cv1.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f55894a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i53.c f55895b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ e23.p f55896c;

                        {
                            this.f55894a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f55894a;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    k.d(this.f55895b, this.f55896c, mVar2, p0.t(1));
                                    break;
                                default:
                                    k.d(this.f55895b, this.f55896c, mVar2, p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                r rVarF = x2.f(r.S, 1.0f);
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97920e;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(892934100);
                Iterator<av1.g> it = cVar.iterator();
                while (it.hasNext()) {
                    c(it.next(), pVar, o0VarE, i15 & 112);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar2;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar2 = new e23.p(cVar, pVar, i14, i17) { // from class: cv1.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f55894a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i53.c f55895b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.p f55896c;

                {
                    this.f55894a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f55894a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            k.d(this.f55895b, this.f55896c, mVar2, p0.t(1));
                            break;
                        default:
                            k.d(this.f55895b, this.f55896c, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar2;
        }
    }
}
