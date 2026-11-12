package g11;

import a3.q;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g21.f0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.text.NumberFormat;
import java.util.ArrayList;
import m92.w;
import o4.d0;
import o70.t;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import yz1.u;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:63:0x026d  */
    public static final void a(String str, i53.c<q01.c> cVar, p3.m mVar, int i14) {
        long jG;
        o0 o0VarE = mVar.E(2041796086);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strP = y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{str}, o0VarE);
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            q01.c cVar3 = null;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97921f), o0VarE);
            r rVarF = x2.f(aVar, 1.0f);
            ArrayList arrayList = new ArrayList();
            int size = cVar.size();
            q01.c cVar4 = (q01.c) h0.n0(cVar);
            int i16 = size - (cVar4 != null ? cVar4.f141987c : 0);
            o0VarE.C(2103852043);
            int i17 = 0;
            for (q01.c cVar5 : cVar) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                if (cVar5.f141986b) {
                    o0VarE.C(1548695865);
                    if (i17 >= i16) {
                        o0VarE.C(2128169902);
                        gl.c.f77766a.getClass();
                        jG = gl.c.a(o0VarE).f();
                    } else {
                        o0VarE.C(2128171120);
                        gl.c.f77766a.getClass();
                        jG = gl.c.a(o0VarE).g();
                    }
                    o0VarE.g0(false);
                    arrayList.add(new m92.h0.e.d(new m92.h0.e.a(i17, 1.0f), new o92.b(o92.e.CIRCLE, jG, null, 4, null), null, 4, null));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1549104290);
                    o0VarE.g0(false);
                }
                i17 = i18;
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            x1 x1Var2 = p3.n.f135158a;
            Float fValueOf = Float.valueOf(28.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.c cVar6 = j92.b.f97901d;
            float f14 = cVar6.f97902a;
            m92.h0.e.a aVar3 = new m92.h0.e.a(0.0f, 1.0f);
            o92.e eVar = o92.e.CIRCLE;
            gl.c.f77766a.getClass();
            m92.h0.e.d dVar = new m92.h0.e.d(aVar3, new o92.b(eVar, gl.c.a(o0VarE).g(), null, 4, null), null, 4, null);
            bVar2.getClass();
            w.a(rVarF, cVarE, fValueOf, f14, dVar, g6.f.a(cVar6.f97902a / 4), Float.valueOf(0.0f), Float.valueOf(2.0f), o0VarE, 905970054);
            r.a aVar4 = r.S;
            bVar2.getClass();
            c2.l.f(x2.h(aVar4, j92.b.f97899b.f97918c), o0VarE);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = y.Q(o0VarE, R.string.label_last_4w);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            boolean zB = o0VarE.B(strP);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new fp0.c(strP, 28);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fp0.c(strP, 28);
                    o0VarE.K(objQ);
                }
            }
            mh.c(strQ, v.c((e23.l) objQ, aVar4, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            for (q01.c cVar7 : cVar) {
                if (cVar7.f141985a.equals(LocalDate.now())) {
                    cVar3 = cVar7;
                    break;
                }
            }
            q01.c cVar8 = cVar3;
            int i19 = cVar8 != null ? cVar8.f141987c : 0;
            if (i19 > 1) {
                o0VarE.C(121626673);
                String str2 = NumberFormat.getIntegerInstance().format(Integer.valueOf(i19));
                str2.getClass();
                String strP2 = y.P(R.string.variable_streak, new Object[]{y.P(R.string.mct_num_days_label, new Object[]{str2}, o0VarE)}, o0VarE);
                c2.l.f(u2Var.a(r.S, 1.0f, true), o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(121985126);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            r.a aVar6 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            e5.t(aVar6, j92.b.f97899b.f97920e, o0VarE, true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(str, i14, cVar);
        }
    }

    public static final void b(r rVar, String str, String str2, e23.a<Unit> aVar, String str3, p3.m mVar, int i14, int i15) {
        e23.a<Unit> aVar2;
        int i16;
        String str4;
        int i17;
        e23.a<Unit> aVar3;
        String str5;
        o0 o0VarE = mVar.E(175322555);
        int i18 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i18 | (o0VarE.r(aVar2) ? 2048 : 1024);
        }
        int i24 = i15 & 16;
        if (i24 != 0) {
            i17 = i16 | 24576;
            str4 = str3;
        } else {
            str4 = str3;
            i17 = i16 | (o0VarE.B(str4) ? 16384 : 8192);
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            z3.e eVarC = null;
            e23.a<Unit> aVar4 = i19 != 0 ? null : aVar2;
            String str6 = i24 != 0 ? null : str4;
            x1 x1Var = p3.n.f135158a;
            yz1.d dVar = new yz1.d(u.SUCCESS, null, false, 6, null);
            String strQ = y.Q(o0VarE, R.string.lbl_nutrition);
            t tVar = t.T;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            if (aVar4 == null || str6 == null) {
                o0VarE.C(355107051);
                o0VarE.g0(false);
            } else {
                o0VarE.C(354672586);
                eVarC = z3.f.c(985248215, new ao1.g(str6, aVar4), o0VarE);
                o0VarE.g0(false);
            }
            int i25 = i17 << 6;
            yz1.s.d(rVar, dVar, strQ, str, str2, dVarB, d0VarE, 0.0f, null, 0.0f, null, aVar4, eVarC, o0VarE, (i17 & 14) | (i25 & 7168) | (i25 & 57344), (i17 << 3) & 57344, 16256);
            str5 = str6;
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
            str5 = str4;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar, str, str2, aVar3, str5, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    public static final void c(r rVar, v21.e eVar, q01.f.d dVar, p3.m mVar, int i14) {
        v21.e eVar2;
        int i15;
        v21.e eVar3;
        o0 o0VarE = mVar.E(-2108922263);
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 16 | (o0VarE.r(dVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ);
                }
                i15 = i16 & (-113);
                eVar3 = (v21.e) objQ;
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u uVar = dVar.f142005a;
            g21.u uVar2 = dVar.f142009b;
            f0 f0Var = dVar.f142010c;
            i53.c<q01.c> cVar = dVar.f142011d;
            boolean z14 = dVar.f142012e;
            boolean zR = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new cy1.a(context, 25);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new cy1.a(context, 25);
                    o0VarE.K(objQ2);
                }
            }
            e(rVar, eVar3, uVar, uVar2, f0Var, cVar, z14, (e23.a) objQ2, o0VarE, i15 & 126, 0);
            eVar2 = eVar3;
        } else {
            o0VarE.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.f0(rVar, eVar2, dVar, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    public static final void d(r rVar, v21.e eVar, q01.f.C2664f c2664f, p3.m mVar, int i14) {
        v21.e eVar2;
        int i15;
        v21.e eVar3;
        o0 o0VarE = mVar.E(1054465975);
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 16 | (o0VarE.r(c2664f) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ);
                }
                i15 = i16 & (-113);
                eVar3 = (v21.e) objQ;
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u uVar = c2664f.f142005a;
            g21.u uVar2 = c2664f.f142014b;
            f0 f0Var = c2664f.f142015c;
            i53.c<q01.c> cVar = c2664f.f142016d;
            boolean z14 = c2664f.f142017e;
            boolean zR = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new cy1.a(context, 21);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new cy1.a(context, 21);
                    o0VarE.K(objQ2);
                }
            }
            e(rVar, eVar3, uVar, uVar2, f0Var, cVar, z14, (e23.a) objQ2, o0VarE, i15 & 126, 0);
            eVar2 = eVar3;
        } else {
            o0VarE.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.f0(rVar, eVar2, c2664f, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0118  */
    /* JADX WARN: Code duplicated, block: B:105:0x011c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:124:0x017e  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:138:0x0205  */
    /* JADX WARN: Code duplicated, block: B:140:0x0243  */
    /* JADX WARN: Code duplicated, block: B:142:0x028b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0292  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
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
    public static final void e(r rVar, v21.e eVar, u uVar, g21.u uVar2, f0 f0Var, i53.c<q01.c> cVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        v21.e eVar2;
        final g21.u uVar3;
        final f0 f0Var2;
        int i17;
        i53.c<q01.c> cVar2;
        int i18;
        int i19;
        boolean z15;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        e23.a<Unit> aVar2;
        i53.c<q01.c> cVar3;
        boolean z17;
        p2 p2VarI0;
        int i28;
        p3.m.a aVar3;
        final v21.e eVar3;
        int i29;
        int i30;
        boolean z18;
        Object objQ;
        Context context;
        String strQ;
        boolean zR;
        Object objQ2;
        int i34;
        boolean zR2;
        Object objQ3;
        boolean zR3;
        Object objQ4;
        o0 o0VarE = mVar.E(-1677473591);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                eVar2 = eVar;
                int i35 = o0VarE.r(eVar2) ? 32 : 16;
                i16 |= i35;
            } else {
                eVar2 = eVar;
            }
            i16 |= i35;
        } else {
            eVar2 = eVar;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(uVar.ordinal()) ? 256 : 128;
        }
        int i36 = i15 & 8;
        if (i36 == 0) {
            if ((i14 & 3072) == 0) {
                uVar3 = uVar2;
                i16 |= o0VarE.B(uVar3) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    f0Var2 = f0Var;
                    int i37 = o0VarE.B(f0Var2) ? 16384 : 8192;
                    i16 |= i37;
                } else {
                    f0Var2 = f0Var;
                }
                i16 |= i37;
            } else {
                f0Var2 = f0Var;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    cVar2 = cVar;
                    if (o0VarE.r(cVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    if ((1572864 & i14) == 0) {
                        z15 = z14;
                        if (o0VarE.h(z15)) {
                            i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 128;
                    if (i25 != 0) {
                        if ((12582912 & i14) == 0) {
                            if (o0VarE.r(aVar)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i16 |= i26;
                        }
                        i27 = i16;
                        if ((4793491 & i16) != 4793490) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i27 & 1, z16)) {
                            o0VarE.G0();
                            i28 = i14 & 1;
                            aVar3 = p3.m.f135153a;
                            if (i28 != 0 || o0VarE.o0()) {
                                if ((i15 & 2) != 0) {
                                    objQ = o0VarE.q();
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                        o0VarE.K(objQ);
                                    }
                                    eVar3 = (v21.e) objQ;
                                    i29 = i27 & (-113);
                                } else {
                                    eVar3 = eVar2;
                                    i29 = i27;
                                }
                                if (i36 != 0) {
                                    uVar3 = null;
                                }
                                if ((i15 & 16) != 0) {
                                    i29 &= -57345;
                                    f0Var2 = new f0(null, null, null, null, 15, null);
                                }
                                if (i17 != 0) {
                                    cVar2 = null;
                                }
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i25 != 0) {
                                    i30 = i29;
                                    z18 = z15;
                                    aVar = null;
                                } else {
                                    i30 = i29;
                                }
                                o0VarE.h0();
                                x1 x1Var = p3.n.f135158a;
                                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                                strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                                if (cVar2 != null) {
                                    o0VarE.C(-1670651927);
                                    yz1.d dVar = new yz1.d(uVar, null, false, 6, null);
                                    t tVar = t.T;
                                    u4.d dVarB = t.b(tVar);
                                    d0 d0VarE = tVar.e(null, o0VarE, 1);
                                    if (z18) {
                                        i34 = R.drawable.ic_gcm_add_16;
                                    } else {
                                        i34 = 0;
                                    }
                                    String strQ2 = y.Q(o0VarE, R.string.log_food);
                                    final int i38 = 0;
                                    z3.e eVarC = z3.f.c(436301304, new e23.p() { // from class: g11.g
                                        @Override // e23.p
                                        public final Object invoke(Object obj, Object obj2) {
                                            p3.m mVar2;
                                            switch (i38) {
                                                case 0:
                                                    p3.m mVar3 = (p3.m) obj;
                                                    int iIntValue = ((Integer) obj2).intValue();
                                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        x1 x1Var2 = p3.n.f135158a;
                                                        r.a aVar4 = r.S;
                                                        r rVarD = x2.d(aVar4, 1.0f);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.a aVar5 = h4.d.a.f81537o;
                                                        c2.j.f22691a.getClass();
                                                        z zVarA = c2.y.a(c2.j.f22694d, aVar5, mVar3, 48);
                                                        int iHashCode = Long.hashCode(mVar3.getU());
                                                        i2 i2VarX = mVar3.x();
                                                        r rVarC = h4.k.c(rVarD, mVar3);
                                                        h5.g.V.getClass();
                                                        e0.a aVar6 = h5.g.a.f81805b;
                                                        if (mVar3.F() == null) {
                                                            p0.l();
                                                            throw null;
                                                        }
                                                        mVar3.z();
                                                        if (mVar3.getT()) {
                                                            mVar3.M(aVar6);
                                                        } else {
                                                            mVar3.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                        b0 b0Var = b0.f22601a;
                                                        g21.u uVar4 = uVar3;
                                                        v21.e eVar4 = eVar3;
                                                        f0 f0Var3 = f0Var2;
                                                        if (uVar4 != null) {
                                                            mVar3.C(-922063526);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            p.a(x2.d(c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                            mVar3.f();
                                                            mVar2 = mVar3;
                                                        } else {
                                                            mVar3.C(-921653985);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            mVar2 = mVar3;
                                                            c.b(x2.d(c2.l.A(aVar4, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                            mVar2.f();
                                                        }
                                                        mVar2.y();
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    p3.m mVar4 = (p3.m) obj;
                                                    int iIntValue2 = ((Integer) obj2).intValue();
                                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        x1 x1Var3 = p3.n.f135158a;
                                                        r.a aVar7 = r.S;
                                                        r rVarD2 = x2.d(aVar7, 1.0f);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.a aVar8 = h4.d.a.f81537o;
                                                        c2.j.f22691a.getClass();
                                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar8, mVar4, 48);
                                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                                        i2 i2VarX2 = mVar4.x();
                                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                        h5.g.V.getClass();
                                                        e0.a aVar9 = h5.g.a.f81805b;
                                                        if (mVar4.F() == null) {
                                                            p0.l();
                                                            throw null;
                                                        }
                                                        mVar4.z();
                                                        if (mVar4.getT()) {
                                                            mVar4.M(aVar9);
                                                        } else {
                                                            mVar4.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                        b0 b0Var2 = b0.f22601a;
                                                        g21.u uVar5 = uVar3;
                                                        v21.e eVar5 = eVar3;
                                                        f0 f0Var4 = f0Var2;
                                                        if (uVar5 != null) {
                                                            mVar4.C(-1230096029);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            p.a(x2.d(c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                            mVar4 = mVar4;
                                                            mVar4.f();
                                                        } else {
                                                            mVar4.C(-1229686488);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            c.b(x2.d(c2.l.A(aVar7, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                            mVar4.f();
                                                        }
                                                        mVar4.y();
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }, o0VarE);
                                    int i39 = i30;
                                    z3.e eVarC2 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                                    zR2 = o0VarE.r(context);
                                    objQ3 = o0VarE.q();
                                    if (zR2) {
                                        objQ3 = new cy1.a(context, 22);
                                        o0VarE.K(objQ3);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new cy1.a(context, 22);
                                            o0VarE.K(objQ3);
                                        }
                                    }
                                    e23.a aVar4 = (e23.a) objQ3;
                                    zR3 = o0VarE.r(context);
                                    objQ4 = o0VarE.q();
                                    if (zR3) {
                                        objQ4 = new cy1.a(context, 23);
                                        o0VarE.K(objQ4);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new cy1.a(context, 23);
                                            o0VarE.K(objQ4);
                                        }
                                    }
                                    yz1.s.b(rVar, dVar, strQ, null, dVarB, d0VarE, 0.0f, i34, null, 0.0f, strQ2, aVar, eVarC, eVarC2, false, false, aVar4, (e23.a) objQ4, null, o0VarE, i39 & 14, ((i39 >> 18) & 112) | 3456, 312136);
                                    o0VarE.g0(false);
                                } else {
                                    int i44 = i30;
                                    o0VarE.C(-1668325656);
                                    yz1.d dVar2 = new yz1.d(uVar, null, false, 6, null);
                                    t tVar2 = t.T;
                                    u4.d dVarB2 = t.b(tVar2);
                                    final int i45 = 1;
                                    d0 d0VarE2 = tVar2.e(null, o0VarE, 1);
                                    String strQ3 = y.Q(o0VarE, R.string.log_food);
                                    z3.e eVarC3 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                                        @Override // e23.p
                                        public final Object invoke(Object obj, Object obj2) {
                                            p3.m mVar2;
                                            switch (i45) {
                                                case 0:
                                                    p3.m mVar3 = (p3.m) obj;
                                                    int iIntValue = ((Integer) obj2).intValue();
                                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        x1 x1Var2 = p3.n.f135158a;
                                                        r.a aVar5 = r.S;
                                                        r rVarD = x2.d(aVar5, 1.0f);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.a aVar6 = h4.d.a.f81537o;
                                                        c2.j.f22691a.getClass();
                                                        z zVarA = c2.y.a(c2.j.f22694d, aVar6, mVar3, 48);
                                                        int iHashCode = Long.hashCode(mVar3.getU());
                                                        i2 i2VarX = mVar3.x();
                                                        r rVarC = h4.k.c(rVarD, mVar3);
                                                        h5.g.V.getClass();
                                                        e0.a aVar7 = h5.g.a.f81805b;
                                                        if (mVar3.F() == null) {
                                                            p0.l();
                                                            throw null;
                                                        }
                                                        mVar3.z();
                                                        if (mVar3.getT()) {
                                                            mVar3.M(aVar7);
                                                        } else {
                                                            mVar3.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                        b0 b0Var = b0.f22601a;
                                                        g21.u uVar4 = uVar3;
                                                        v21.e eVar4 = eVar3;
                                                        f0 f0Var3 = f0Var2;
                                                        if (uVar4 != null) {
                                                            mVar3.C(-922063526);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            p.a(x2.d(c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                            mVar3.f();
                                                            mVar2 = mVar3;
                                                        } else {
                                                            mVar3.C(-921653985);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            mVar2 = mVar3;
                                                            c.b(x2.d(c2.l.A(aVar5, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                            mVar2.f();
                                                        }
                                                        mVar2.y();
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    p3.m mVar4 = (p3.m) obj;
                                                    int iIntValue2 = ((Integer) obj2).intValue();
                                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        x1 x1Var3 = p3.n.f135158a;
                                                        r.a aVar8 = r.S;
                                                        r rVarD2 = x2.d(aVar8, 1.0f);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.a aVar9 = h4.d.a.f81537o;
                                                        c2.j.f22691a.getClass();
                                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar9, mVar4, 48);
                                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                                        i2 i2VarX2 = mVar4.x();
                                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                        h5.g.V.getClass();
                                                        e0.a aVar10 = h5.g.a.f81805b;
                                                        if (mVar4.F() == null) {
                                                            p0.l();
                                                            throw null;
                                                        }
                                                        mVar4.z();
                                                        if (mVar4.getT()) {
                                                            mVar4.M(aVar10);
                                                        } else {
                                                            mVar4.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                        b0 b0Var2 = b0.f22601a;
                                                        g21.u uVar5 = uVar3;
                                                        v21.e eVar5 = eVar3;
                                                        f0 f0Var4 = f0Var2;
                                                        if (uVar5 != null) {
                                                            mVar4.C(-1230096029);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            p.a(x2.d(c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                            mVar4 = mVar4;
                                                            mVar4.f();
                                                        } else {
                                                            mVar4.C(-1229686488);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58625c.getClass();
                                                            c.b(x2.d(c2.l.A(aVar8, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                            mVar4.f();
                                                        }
                                                        mVar4.y();
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }, o0VarE);
                                    zR = o0VarE.r(context);
                                    objQ2 = o0VarE.q();
                                    if (zR) {
                                        objQ2 = new cy1.a(context, 24);
                                        o0VarE.K(objQ2);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new cy1.a(context, 24);
                                            o0VarE.K(objQ2);
                                        }
                                    }
                                    yz1.s.c(rVar, dVar2, strQ, null, dVarB2, d0VarE2, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ3, aVar, eVarC3, (e23.a) objQ2, o0VarE, i44 & 14, ((i44 >> 18) & 112) | 384, 840);
                                    o0VarE.g0(false);
                                }
                                eVar2 = eVar3;
                                cVar3 = cVar2;
                                aVar2 = aVar;
                                z17 = z18;
                            } else {
                                o0VarE.e();
                                int i46 = (i15 & 2) != 0 ? i27 & (-113) : i27;
                                if ((i15 & 16) != 0) {
                                    i46 &= -57345;
                                }
                                i30 = i46;
                                eVar3 = eVar2;
                            }
                            z18 = z15;
                            o0VarE.h0();
                            x1 x1Var2 = p3.n.f135158a;
                            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                            strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                            if (cVar2 != null) {
                                o0VarE.C(-1670651927);
                                yz1.d dVar3 = new yz1.d(uVar, null, false, 6, null);
                                t tVar3 = t.T;
                                u4.d dVarB3 = t.b(tVar3);
                                d0 d0VarE3 = tVar3.e(null, o0VarE, 1);
                                if (z18) {
                                    i34 = R.drawable.ic_gcm_add_16;
                                } else {
                                    i34 = 0;
                                }
                                String strQ4 = y.Q(o0VarE, R.string.log_food);
                                final int i310 = 0;
                                z3.e eVarC4 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                                    @Override // e23.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        p3.m mVar2;
                                        switch (i310) {
                                            case 0:
                                                p3.m mVar3 = (p3.m) obj;
                                                int iIntValue = ((Integer) obj2).intValue();
                                                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var3 = p3.n.f135158a;
                                                    r.a aVar5 = r.S;
                                                    r rVarD = x2.d(aVar5, 1.0f);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.a aVar6 = h4.d.a.f81537o;
                                                    c2.j.f22691a.getClass();
                                                    z zVarA = c2.y.a(c2.j.f22694d, aVar6, mVar3, 48);
                                                    int iHashCode = Long.hashCode(mVar3.getU());
                                                    i2 i2VarX = mVar3.x();
                                                    r rVarC = h4.k.c(rVarD, mVar3);
                                                    h5.g.V.getClass();
                                                    e0.a aVar7 = h5.g.a.f81805b;
                                                    if (mVar3.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar3.z();
                                                    if (mVar3.getT()) {
                                                        mVar3.M(aVar7);
                                                    } else {
                                                        mVar3.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                    h5.g.a.b bVar = h5.g.a.f81813j;
                                                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                    b0 b0Var = b0.f22601a;
                                                    g21.u uVar4 = uVar3;
                                                    v21.e eVar4 = eVar3;
                                                    f0 f0Var3 = f0Var2;
                                                    if (uVar4 != null) {
                                                        mVar3.C(-922063526);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        p.a(x2.d(c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                        mVar3.f();
                                                        mVar2 = mVar3;
                                                    } else {
                                                        mVar3.C(-921653985);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        mVar2 = mVar3;
                                                        c.b(x2.d(c2.l.A(aVar5, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                        mVar2.f();
                                                    }
                                                    mVar2.y();
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar4 = (p3.m) obj;
                                                int iIntValue2 = ((Integer) obj2).intValue();
                                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var4 = p3.n.f135158a;
                                                    r.a aVar8 = r.S;
                                                    r rVarD2 = x2.d(aVar8, 1.0f);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.a aVar9 = h4.d.a.f81537o;
                                                    c2.j.f22691a.getClass();
                                                    z zVarA2 = c2.y.a(c2.j.f22694d, aVar9, mVar4, 48);
                                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                                    i2 i2VarX2 = mVar4.x();
                                                    r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                    h5.g.V.getClass();
                                                    e0.a aVar10 = h5.g.a.f81805b;
                                                    if (mVar4.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar4.z();
                                                    if (mVar4.getT()) {
                                                        mVar4.M(aVar10);
                                                    } else {
                                                        mVar4.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                    b0 b0Var2 = b0.f22601a;
                                                    g21.u uVar5 = uVar3;
                                                    v21.e eVar5 = eVar3;
                                                    f0 f0Var4 = f0Var2;
                                                    if (uVar5 != null) {
                                                        mVar4.C(-1230096029);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        p.a(x2.d(c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                        mVar4 = mVar4;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(-1229686488);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        c.b(x2.d(c2.l.A(aVar8, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                        mVar4.f();
                                                    }
                                                    mVar4.y();
                                                } else {
                                                    mVar4.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, o0VarE);
                                int i311 = i30;
                                z3.e eVarC5 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                                zR2 = o0VarE.r(context);
                                objQ3 = o0VarE.q();
                                if (zR2) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new cy1.a(context, 22);
                                        o0VarE.K(objQ3);
                                    }
                                } else {
                                    objQ3 = new cy1.a(context, 22);
                                    o0VarE.K(objQ3);
                                }
                                e23.a aVar5 = (e23.a) objQ3;
                                zR3 = o0VarE.r(context);
                                objQ4 = o0VarE.q();
                                if (zR3) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new cy1.a(context, 23);
                                        o0VarE.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new cy1.a(context, 23);
                                    o0VarE.K(objQ4);
                                }
                                yz1.s.b(rVar, dVar3, strQ, null, dVarB3, d0VarE3, 0.0f, i34, null, 0.0f, strQ4, aVar, eVarC4, eVarC5, false, false, aVar5, (e23.a) objQ4, null, o0VarE, i311 & 14, ((i311 >> 18) & 112) | 3456, 312136);
                                o0VarE.g0(false);
                            } else {
                                int i47 = i30;
                                o0VarE.C(-1668325656);
                                yz1.d dVar4 = new yz1.d(uVar, null, false, 6, null);
                                t tVar4 = t.T;
                                u4.d dVarB4 = t.b(tVar4);
                                final int i48 = 1;
                                d0 d0VarE4 = tVar4.e(null, o0VarE, 1);
                                String strQ5 = y.Q(o0VarE, R.string.log_food);
                                z3.e eVarC6 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                                    @Override // e23.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        p3.m mVar2;
                                        switch (i48) {
                                            case 0:
                                                p3.m mVar3 = (p3.m) obj;
                                                int iIntValue = ((Integer) obj2).intValue();
                                                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var3 = p3.n.f135158a;
                                                    r.a aVar6 = r.S;
                                                    r rVarD = x2.d(aVar6, 1.0f);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.a aVar7 = h4.d.a.f81537o;
                                                    c2.j.f22691a.getClass();
                                                    z zVarA = c2.y.a(c2.j.f22694d, aVar7, mVar3, 48);
                                                    int iHashCode = Long.hashCode(mVar3.getU());
                                                    i2 i2VarX = mVar3.x();
                                                    r rVarC = h4.k.c(rVarD, mVar3);
                                                    h5.g.V.getClass();
                                                    e0.a aVar8 = h5.g.a.f81805b;
                                                    if (mVar3.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar3.z();
                                                    if (mVar3.getT()) {
                                                        mVar3.M(aVar8);
                                                    } else {
                                                        mVar3.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                    h5.g.a.b bVar = h5.g.a.f81813j;
                                                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                    b0 b0Var = b0.f22601a;
                                                    g21.u uVar4 = uVar3;
                                                    v21.e eVar4 = eVar3;
                                                    f0 f0Var3 = f0Var2;
                                                    if (uVar4 != null) {
                                                        mVar3.C(-922063526);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        p.a(x2.d(c2.l.C(aVar6, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                        mVar3.f();
                                                        mVar2 = mVar3;
                                                    } else {
                                                        mVar3.C(-921653985);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        mVar2 = mVar3;
                                                        c.b(x2.d(c2.l.A(aVar6, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                        mVar2.f();
                                                    }
                                                    mVar2.y();
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar4 = (p3.m) obj;
                                                int iIntValue2 = ((Integer) obj2).intValue();
                                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var4 = p3.n.f135158a;
                                                    r.a aVar9 = r.S;
                                                    r rVarD2 = x2.d(aVar9, 1.0f);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.a aVar10 = h4.d.a.f81537o;
                                                    c2.j.f22691a.getClass();
                                                    z zVarA2 = c2.y.a(c2.j.f22694d, aVar10, mVar4, 48);
                                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                                    i2 i2VarX2 = mVar4.x();
                                                    r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                    h5.g.V.getClass();
                                                    e0.a aVar11 = h5.g.a.f81805b;
                                                    if (mVar4.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar4.z();
                                                    if (mVar4.getT()) {
                                                        mVar4.M(aVar11);
                                                    } else {
                                                        mVar4.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                    b0 b0Var2 = b0.f22601a;
                                                    g21.u uVar5 = uVar3;
                                                    v21.e eVar5 = eVar3;
                                                    f0 f0Var4 = f0Var2;
                                                    if (uVar5 != null) {
                                                        mVar4.C(-1230096029);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        p.a(x2.d(c2.l.C(aVar9, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                        mVar4 = mVar4;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(-1229686488);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        c.b(x2.d(c2.l.A(aVar9, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                        mVar4.f();
                                                    }
                                                    mVar4.y();
                                                } else {
                                                    mVar4.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, o0VarE);
                                zR = o0VarE.r(context);
                                objQ2 = o0VarE.q();
                                if (zR) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new cy1.a(context, 24);
                                        o0VarE.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new cy1.a(context, 24);
                                    o0VarE.K(objQ2);
                                }
                                yz1.s.c(rVar, dVar4, strQ, null, dVarB4, d0VarE4, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ5, aVar, eVarC6, (e23.a) objQ2, o0VarE, i47 & 14, ((i47 >> 18) & 112) | 384, 840);
                                o0VarE.g0(false);
                            }
                            eVar2 = eVar3;
                            cVar3 = cVar2;
                            aVar2 = aVar;
                            z17 = z18;
                        } else {
                            o0VarE.e();
                            aVar2 = aVar;
                            cVar3 = cVar2;
                            z17 = z15;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                        }
                    }
                    i16 |= 12582912;
                    i27 = i16;
                    if ((4793491 & i16) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i27 & 1, z16)) {
                        o0VarE.G0();
                        i28 = i14 & 1;
                        aVar3 = p3.m.f135153a;
                        if (i28 != 0) {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        } else {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var3 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                        if (cVar2 != null) {
                            o0VarE.C(-1670651927);
                            yz1.d dVar5 = new yz1.d(uVar, null, false, 6, null);
                            t tVar5 = t.T;
                            u4.d dVarB5 = t.b(tVar5);
                            d0 d0VarE5 = tVar5.e(null, o0VarE, 1);
                            if (z18) {
                                i34 = R.drawable.ic_gcm_add_16;
                            } else {
                                i34 = 0;
                            }
                            String strQ6 = y.Q(o0VarE, R.string.log_food);
                            final int i312 = 0;
                            z3.e eVarC7 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i312) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var4 = p3.n.f135158a;
                                                r.a aVar6 = r.S;
                                                r rVarD = x2.d(aVar6, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar7 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar7, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar8 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar8);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar6, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar6, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                r.a aVar9 = r.S;
                                                r rVarD2 = x2.d(aVar9, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar10 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar10, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar11 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar11);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar9, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar9, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            int i313 = i30;
                            z3.e eVarC8 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                            zR2 = o0VarE.r(context);
                            objQ3 = o0VarE.q();
                            if (zR2) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new cy1.a(context, 22);
                                    o0VarE.K(objQ3);
                                }
                            } else {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                            e23.a aVar6 = (e23.a) objQ3;
                            zR3 = o0VarE.r(context);
                            objQ4 = o0VarE.q();
                            if (zR3) {
                                aVar3.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new cy1.a(context, 23);
                                    o0VarE.K(objQ4);
                                }
                            } else {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                            yz1.s.b(rVar, dVar5, strQ, null, dVarB5, d0VarE5, 0.0f, i34, null, 0.0f, strQ6, aVar, eVarC7, eVarC8, false, false, aVar6, (e23.a) objQ4, null, o0VarE, i313 & 14, ((i313 >> 18) & 112) | 3456, 312136);
                            o0VarE.g0(false);
                        } else {
                            int i49 = i30;
                            o0VarE.C(-1668325656);
                            yz1.d dVar6 = new yz1.d(uVar, null, false, 6, null);
                            t tVar6 = t.T;
                            u4.d dVarB6 = t.b(tVar6);
                            final int i410 = 1;
                            d0 d0VarE6 = tVar6.e(null, o0VarE, 1);
                            String strQ7 = y.Q(o0VarE, R.string.log_food);
                            z3.e eVarC9 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i410) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var4 = p3.n.f135158a;
                                                r.a aVar7 = r.S;
                                                r rVarD = x2.d(aVar7, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar8 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar8, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar9 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar9);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar7, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                r.a aVar10 = r.S;
                                                r rVarD2 = x2.d(aVar10, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar11 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar11, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar12 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar12);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar10, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar10, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            zR = o0VarE.r(context);
                            objQ2 = o0VarE.q();
                            if (zR) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new cy1.a(context, 24);
                                    o0VarE.K(objQ2);
                                }
                            } else {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                            yz1.s.c(rVar, dVar6, strQ, null, dVarB6, d0VarE6, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ7, aVar, eVarC9, (e23.a) objQ2, o0VarE, i49 & 14, ((i49 >> 18) & 112) | 384, 840);
                            o0VarE.g0(false);
                        }
                        eVar2 = eVar3;
                        cVar3 = cVar2;
                        aVar2 = aVar;
                        z17 = z18;
                    } else {
                        o0VarE.e();
                        aVar2 = aVar;
                        cVar3 = cVar2;
                        z17 = z15;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                    }
                }
                i16 |= 1572864;
                z15 = z14;
                i25 = i15 & 128;
                if (i25 != 0) {
                    if ((12582912 & i14) == 0) {
                        if (o0VarE.r(aVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    i27 = i16;
                    if ((4793491 & i16) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i27 & 1, z16)) {
                        o0VarE.G0();
                        i28 = i14 & 1;
                        aVar3 = p3.m.f135153a;
                        if (i28 != 0) {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        } else {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var4 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                        if (cVar2 != null) {
                            o0VarE.C(-1670651927);
                            yz1.d dVar7 = new yz1.d(uVar, null, false, 6, null);
                            t tVar7 = t.T;
                            u4.d dVarB7 = t.b(tVar7);
                            d0 d0VarE7 = tVar7.e(null, o0VarE, 1);
                            if (z18) {
                                i34 = R.drawable.ic_gcm_add_16;
                            } else {
                                i34 = 0;
                            }
                            String strQ8 = y.Q(o0VarE, R.string.log_food);
                            final int i314 = 0;
                            z3.e eVarC10 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i314) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                r.a aVar7 = r.S;
                                                r rVarD = x2.d(aVar7, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar8 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar8, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar9 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar9);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar7, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var6 = p3.n.f135158a;
                                                r.a aVar10 = r.S;
                                                r rVarD2 = x2.d(aVar10, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar11 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar11, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar12 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar12);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar10, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar10, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            int i315 = i30;
                            z3.e eVarC11 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                            zR2 = o0VarE.r(context);
                            objQ3 = o0VarE.q();
                            if (zR2) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new cy1.a(context, 22);
                                    o0VarE.K(objQ3);
                                }
                            } else {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                            e23.a aVar7 = (e23.a) objQ3;
                            zR3 = o0VarE.r(context);
                            objQ4 = o0VarE.q();
                            if (zR3) {
                                aVar3.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new cy1.a(context, 23);
                                    o0VarE.K(objQ4);
                                }
                            } else {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                            yz1.s.b(rVar, dVar7, strQ, null, dVarB7, d0VarE7, 0.0f, i34, null, 0.0f, strQ8, aVar, eVarC10, eVarC11, false, false, aVar7, (e23.a) objQ4, null, o0VarE, i315 & 14, ((i315 >> 18) & 112) | 3456, 312136);
                            o0VarE.g0(false);
                        } else {
                            int i411 = i30;
                            o0VarE.C(-1668325656);
                            yz1.d dVar8 = new yz1.d(uVar, null, false, 6, null);
                            t tVar8 = t.T;
                            u4.d dVarB8 = t.b(tVar8);
                            final int i412 = 1;
                            d0 d0VarE8 = tVar8.e(null, o0VarE, 1);
                            String strQ9 = y.Q(o0VarE, R.string.log_food);
                            z3.e eVarC12 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i412) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                r.a aVar8 = r.S;
                                                r rVarD = x2.d(aVar8, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar9 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar9, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar10 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar10);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar8, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var6 = p3.n.f135158a;
                                                r.a aVar11 = r.S;
                                                r rVarD2 = x2.d(aVar11, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar12 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar12, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar13 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar13);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar11, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar11, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            zR = o0VarE.r(context);
                            objQ2 = o0VarE.q();
                            if (zR) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new cy1.a(context, 24);
                                    o0VarE.K(objQ2);
                                }
                            } else {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                            yz1.s.c(rVar, dVar8, strQ, null, dVarB8, d0VarE8, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ9, aVar, eVarC12, (e23.a) objQ2, o0VarE, i411 & 14, ((i411 >> 18) & 112) | 384, 840);
                            o0VarE.g0(false);
                        }
                        eVar2 = eVar3;
                        cVar3 = cVar2;
                        aVar2 = aVar;
                        z17 = z18;
                    } else {
                        o0VarE.e();
                        aVar2 = aVar;
                        cVar3 = cVar2;
                        z17 = z15;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                    }
                }
                i16 |= 12582912;
                i27 = i16;
                if ((4793491 & i16) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar3 = p3.m.f135153a;
                    if (i28 != 0) {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                    if (cVar2 != null) {
                        o0VarE.C(-1670651927);
                        yz1.d dVar9 = new yz1.d(uVar, null, false, 6, null);
                        t tVar9 = t.T;
                        u4.d dVarB9 = t.b(tVar9);
                        d0 d0VarE9 = tVar9.e(null, o0VarE, 1);
                        if (z18) {
                            i34 = R.drawable.ic_gcm_add_16;
                        } else {
                            i34 = 0;
                        }
                        String strQ10 = y.Q(o0VarE, R.string.log_food);
                        final int i316 = 0;
                        z3.e eVarC13 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i316) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            r.a aVar8 = r.S;
                                            r rVarD = x2.d(aVar8, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar9 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar9, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar10 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar10);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar8, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            r.a aVar11 = r.S;
                                            r rVarD2 = x2.d(aVar11, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar12 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar12, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar13 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar13);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar11, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar11, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        int i317 = i30;
                        z3.e eVarC14 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                        zR2 = o0VarE.r(context);
                        objQ3 = o0VarE.q();
                        if (zR2) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar8 = (e23.a) objQ3;
                        zR3 = o0VarE.r(context);
                        objQ4 = o0VarE.q();
                        if (zR3) {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                        yz1.s.b(rVar, dVar9, strQ, null, dVarB9, d0VarE9, 0.0f, i34, null, 0.0f, strQ10, aVar, eVarC13, eVarC14, false, false, aVar8, (e23.a) objQ4, null, o0VarE, i317 & 14, ((i317 >> 18) & 112) | 3456, 312136);
                        o0VarE.g0(false);
                    } else {
                        int i413 = i30;
                        o0VarE.C(-1668325656);
                        yz1.d dVar10 = new yz1.d(uVar, null, false, 6, null);
                        t tVar10 = t.T;
                        u4.d dVarB10 = t.b(tVar10);
                        final int i414 = 1;
                        d0 d0VarE10 = tVar10.e(null, o0VarE, 1);
                        String strQ11 = y.Q(o0VarE, R.string.log_food);
                        z3.e eVarC15 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i414) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            r.a aVar9 = r.S;
                                            r rVarD = x2.d(aVar9, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar10 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar10, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar11 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar11);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar9, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar9, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            r.a aVar12 = r.S;
                                            r rVarD2 = x2.d(aVar12, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar13 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar13, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar14 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar14);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar12, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        zR = o0VarE.r(context);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                        yz1.s.c(rVar, dVar10, strQ, null, dVarB10, d0VarE10, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ11, aVar, eVarC15, (e23.a) objQ2, o0VarE, i413 & 14, ((i413 >> 18) & 112) | 384, 840);
                        o0VarE.g0(false);
                    }
                    eVar2 = eVar3;
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    cVar3 = cVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                }
            }
            i16 |= 196608;
            cVar2 = cVar;
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 128;
                if (i25 != 0) {
                    if ((12582912 & i14) == 0) {
                        if (o0VarE.r(aVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    i27 = i16;
                    if ((4793491 & i16) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i27 & 1, z16)) {
                        o0VarE.G0();
                        i28 = i14 & 1;
                        aVar3 = p3.m.f135153a;
                        if (i28 != 0) {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        } else {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var6 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                        if (cVar2 != null) {
                            o0VarE.C(-1670651927);
                            yz1.d dVar11 = new yz1.d(uVar, null, false, 6, null);
                            t tVar11 = t.T;
                            u4.d dVarB11 = t.b(tVar11);
                            d0 d0VarE11 = tVar11.e(null, o0VarE, 1);
                            if (z18) {
                                i34 = R.drawable.ic_gcm_add_16;
                            } else {
                                i34 = 0;
                            }
                            String strQ12 = y.Q(o0VarE, R.string.log_food);
                            final int i318 = 0;
                            z3.e eVarC16 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i318) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var7 = p3.n.f135158a;
                                                r.a aVar9 = r.S;
                                                r rVarD = x2.d(aVar9, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar10 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar10, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar11 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar11);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar9, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar9, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var8 = p3.n.f135158a;
                                                r.a aVar12 = r.S;
                                                r rVarD2 = x2.d(aVar12, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar13 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar13, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar14 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar14);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar12, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            int i319 = i30;
                            z3.e eVarC17 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                            zR2 = o0VarE.r(context);
                            objQ3 = o0VarE.q();
                            if (zR2) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new cy1.a(context, 22);
                                    o0VarE.K(objQ3);
                                }
                            } else {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                            e23.a aVar9 = (e23.a) objQ3;
                            zR3 = o0VarE.r(context);
                            objQ4 = o0VarE.q();
                            if (zR3) {
                                aVar3.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new cy1.a(context, 23);
                                    o0VarE.K(objQ4);
                                }
                            } else {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                            yz1.s.b(rVar, dVar11, strQ, null, dVarB11, d0VarE11, 0.0f, i34, null, 0.0f, strQ12, aVar, eVarC16, eVarC17, false, false, aVar9, (e23.a) objQ4, null, o0VarE, i319 & 14, ((i319 >> 18) & 112) | 3456, 312136);
                            o0VarE.g0(false);
                        } else {
                            int i415 = i30;
                            o0VarE.C(-1668325656);
                            yz1.d dVar12 = new yz1.d(uVar, null, false, 6, null);
                            t tVar12 = t.T;
                            u4.d dVarB12 = t.b(tVar12);
                            final int i416 = 1;
                            d0 d0VarE12 = tVar12.e(null, o0VarE, 1);
                            String strQ13 = y.Q(o0VarE, R.string.log_food);
                            z3.e eVarC18 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i416) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var7 = p3.n.f135158a;
                                                r.a aVar10 = r.S;
                                                r rVarD = x2.d(aVar10, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar11 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar11, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar12 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar12);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar10, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar10, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var8 = p3.n.f135158a;
                                                r.a aVar13 = r.S;
                                                r rVarD2 = x2.d(aVar13, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar14 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar14, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar15 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar15);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar13, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar13, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            zR = o0VarE.r(context);
                            objQ2 = o0VarE.q();
                            if (zR) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new cy1.a(context, 24);
                                    o0VarE.K(objQ2);
                                }
                            } else {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                            yz1.s.c(rVar, dVar12, strQ, null, dVarB12, d0VarE12, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ13, aVar, eVarC18, (e23.a) objQ2, o0VarE, i415 & 14, ((i415 >> 18) & 112) | 384, 840);
                            o0VarE.g0(false);
                        }
                        eVar2 = eVar3;
                        cVar3 = cVar2;
                        aVar2 = aVar;
                        z17 = z18;
                    } else {
                        o0VarE.e();
                        aVar2 = aVar;
                        cVar3 = cVar2;
                        z17 = z15;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                    }
                }
                i16 |= 12582912;
                i27 = i16;
                if ((4793491 & i16) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar3 = p3.m.f135153a;
                    if (i28 != 0) {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var7 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                    if (cVar2 != null) {
                        o0VarE.C(-1670651927);
                        yz1.d dVar13 = new yz1.d(uVar, null, false, 6, null);
                        t tVar13 = t.T;
                        u4.d dVarB13 = t.b(tVar13);
                        d0 d0VarE13 = tVar13.e(null, o0VarE, 1);
                        if (z18) {
                            i34 = R.drawable.ic_gcm_add_16;
                        } else {
                            i34 = 0;
                        }
                        String strQ14 = y.Q(o0VarE, R.string.log_food);
                        final int i3110 = 0;
                        z3.e eVarC19 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i3110) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var8 = p3.n.f135158a;
                                            r.a aVar10 = r.S;
                                            r rVarD = x2.d(aVar10, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar11 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar11, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar12 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar12);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar10, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar10, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var9 = p3.n.f135158a;
                                            r.a aVar13 = r.S;
                                            r rVarD2 = x2.d(aVar13, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar14 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar14, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar15 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar15);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar13, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar13, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        int i3111 = i30;
                        z3.e eVarC110 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                        zR2 = o0VarE.r(context);
                        objQ3 = o0VarE.q();
                        if (zR2) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar10 = (e23.a) objQ3;
                        zR3 = o0VarE.r(context);
                        objQ4 = o0VarE.q();
                        if (zR3) {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                        yz1.s.b(rVar, dVar13, strQ, null, dVarB13, d0VarE13, 0.0f, i34, null, 0.0f, strQ14, aVar, eVarC19, eVarC110, false, false, aVar10, (e23.a) objQ4, null, o0VarE, i3111 & 14, ((i3111 >> 18) & 112) | 3456, 312136);
                        o0VarE.g0(false);
                    } else {
                        int i417 = i30;
                        o0VarE.C(-1668325656);
                        yz1.d dVar14 = new yz1.d(uVar, null, false, 6, null);
                        t tVar14 = t.T;
                        u4.d dVarB14 = t.b(tVar14);
                        final int i418 = 1;
                        d0 d0VarE14 = tVar14.e(null, o0VarE, 1);
                        String strQ15 = y.Q(o0VarE, R.string.log_food);
                        z3.e eVarC111 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i418) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var8 = p3.n.f135158a;
                                            r.a aVar11 = r.S;
                                            r rVarD = x2.d(aVar11, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar12 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar12, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar13 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar13);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar11, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar11, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var9 = p3.n.f135158a;
                                            r.a aVar14 = r.S;
                                            r rVarD2 = x2.d(aVar14, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar15 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar15, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar16 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar16);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar14, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar14, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        zR = o0VarE.r(context);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                        yz1.s.c(rVar, dVar14, strQ, null, dVarB14, d0VarE14, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ15, aVar, eVarC111, (e23.a) objQ2, o0VarE, i417 & 14, ((i417 >> 18) & 112) | 384, 840);
                        o0VarE.g0(false);
                    }
                    eVar2 = eVar3;
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    cVar3 = cVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                }
            }
            i16 |= 1572864;
            z15 = z14;
            i25 = i15 & 128;
            if (i25 != 0) {
                if ((12582912 & i14) == 0) {
                    if (o0VarE.r(aVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i16;
                if ((4793491 & i16) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar3 = p3.m.f135153a;
                    if (i28 != 0) {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var8 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                    if (cVar2 != null) {
                        o0VarE.C(-1670651927);
                        yz1.d dVar15 = new yz1.d(uVar, null, false, 6, null);
                        t tVar15 = t.T;
                        u4.d dVarB15 = t.b(tVar15);
                        d0 d0VarE15 = tVar15.e(null, o0VarE, 1);
                        if (z18) {
                            i34 = R.drawable.ic_gcm_add_16;
                        } else {
                            i34 = 0;
                        }
                        String strQ16 = y.Q(o0VarE, R.string.log_food);
                        final int i3112 = 0;
                        z3.e eVarC112 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i3112) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var9 = p3.n.f135158a;
                                            r.a aVar11 = r.S;
                                            r rVarD = x2.d(aVar11, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar12 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar12, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar13 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar13);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar11, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar11, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var10 = p3.n.f135158a;
                                            r.a aVar14 = r.S;
                                            r rVarD2 = x2.d(aVar14, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar15 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar15, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar16 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar16);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar14, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar14, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        int i3113 = i30;
                        z3.e eVarC113 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                        zR2 = o0VarE.r(context);
                        objQ3 = o0VarE.q();
                        if (zR2) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar11 = (e23.a) objQ3;
                        zR3 = o0VarE.r(context);
                        objQ4 = o0VarE.q();
                        if (zR3) {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                        yz1.s.b(rVar, dVar15, strQ, null, dVarB15, d0VarE15, 0.0f, i34, null, 0.0f, strQ16, aVar, eVarC112, eVarC113, false, false, aVar11, (e23.a) objQ4, null, o0VarE, i3113 & 14, ((i3113 >> 18) & 112) | 3456, 312136);
                        o0VarE.g0(false);
                    } else {
                        int i419 = i30;
                        o0VarE.C(-1668325656);
                        yz1.d dVar16 = new yz1.d(uVar, null, false, 6, null);
                        t tVar16 = t.T;
                        u4.d dVarB16 = t.b(tVar16);
                        final int i4110 = 1;
                        d0 d0VarE16 = tVar16.e(null, o0VarE, 1);
                        String strQ17 = y.Q(o0VarE, R.string.log_food);
                        z3.e eVarC114 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i4110) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var9 = p3.n.f135158a;
                                            r.a aVar12 = r.S;
                                            r rVarD = x2.d(aVar12, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar13 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar13, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar14 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar14);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar12, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var10 = p3.n.f135158a;
                                            r.a aVar15 = r.S;
                                            r rVarD2 = x2.d(aVar15, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar16 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar16, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar17 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar17);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar15, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        zR = o0VarE.r(context);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                        yz1.s.c(rVar, dVar16, strQ, null, dVarB16, d0VarE16, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ17, aVar, eVarC114, (e23.a) objQ2, o0VarE, i419 & 14, ((i419 >> 18) & 112) | 384, 840);
                        o0VarE.g0(false);
                    }
                    eVar2 = eVar3;
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    cVar3 = cVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                }
            }
            i16 |= 12582912;
            i27 = i16;
            if ((4793491 & i16) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i28 = i14 & 1;
                aVar3 = p3.m.f135153a;
                if (i28 != 0) {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                }
                o0VarE.h0();
                x1 x1Var9 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                if (cVar2 != null) {
                    o0VarE.C(-1670651927);
                    yz1.d dVar17 = new yz1.d(uVar, null, false, 6, null);
                    t tVar17 = t.T;
                    u4.d dVarB17 = t.b(tVar17);
                    d0 d0VarE17 = tVar17.e(null, o0VarE, 1);
                    if (z18) {
                        i34 = R.drawable.ic_gcm_add_16;
                    } else {
                        i34 = 0;
                    }
                    String strQ18 = y.Q(o0VarE, R.string.log_food);
                    final int i3114 = 0;
                    z3.e eVarC115 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i3114) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var10 = p3.n.f135158a;
                                        r.a aVar12 = r.S;
                                        r rVarD = x2.d(aVar12, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar13 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar13, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar14 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar14);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar12, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var11 = p3.n.f135158a;
                                        r.a aVar15 = r.S;
                                        r rVarD2 = x2.d(aVar15, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar16 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar16, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar17 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar17);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar15, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    int i3115 = i30;
                    z3.e eVarC116 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                    zR2 = o0VarE.r(context);
                    objQ3 = o0VarE.q();
                    if (zR2) {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new cy1.a(context, 22);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar12 = (e23.a) objQ3;
                    zR3 = o0VarE.r(context);
                    objQ4 = o0VarE.q();
                    if (zR3) {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new cy1.a(context, 23);
                        o0VarE.K(objQ4);
                    }
                    yz1.s.b(rVar, dVar17, strQ, null, dVarB17, d0VarE17, 0.0f, i34, null, 0.0f, strQ18, aVar, eVarC115, eVarC116, false, false, aVar12, (e23.a) objQ4, null, o0VarE, i3115 & 14, ((i3115 >> 18) & 112) | 3456, 312136);
                    o0VarE.g0(false);
                } else {
                    int i4111 = i30;
                    o0VarE.C(-1668325656);
                    yz1.d dVar18 = new yz1.d(uVar, null, false, 6, null);
                    t tVar18 = t.T;
                    u4.d dVarB18 = t.b(tVar18);
                    final int i4112 = 1;
                    d0 d0VarE18 = tVar18.e(null, o0VarE, 1);
                    String strQ19 = y.Q(o0VarE, R.string.log_food);
                    z3.e eVarC117 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i4112) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var10 = p3.n.f135158a;
                                        r.a aVar13 = r.S;
                                        r rVarD = x2.d(aVar13, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar14 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar14, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar15 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar15);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar13, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar13, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var11 = p3.n.f135158a;
                                        r.a aVar16 = r.S;
                                        r rVarD2 = x2.d(aVar16, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar17 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar17, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar18 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar18);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar16, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar16, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    zR = o0VarE.r(context);
                    objQ2 = o0VarE.q();
                    if (zR) {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new cy1.a(context, 24);
                        o0VarE.K(objQ2);
                    }
                    yz1.s.c(rVar, dVar18, strQ, null, dVarB18, d0VarE18, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ19, aVar, eVarC117, (e23.a) objQ2, o0VarE, i4111 & 14, ((i4111 >> 18) & 112) | 384, 840);
                    o0VarE.g0(false);
                }
                eVar2 = eVar3;
                cVar3 = cVar2;
                aVar2 = aVar;
                z17 = z18;
            } else {
                o0VarE.e();
                aVar2 = aVar;
                cVar3 = cVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
            }
        }
        i16 |= 3072;
        uVar3 = uVar2;
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                f0Var2 = f0Var;
                if (o0VarE.B(f0Var2)) {
                }
                i16 |= i37;
            } else {
                f0Var2 = f0Var;
            }
            i16 |= i37;
        } else {
            f0Var2 = f0Var;
        }
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                cVar2 = cVar;
                if (o0VarE.r(cVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 128;
                if (i25 != 0) {
                    if ((12582912 & i14) == 0) {
                        if (o0VarE.r(aVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    i27 = i16;
                    if ((4793491 & i16) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i27 & 1, z16)) {
                        o0VarE.G0();
                        i28 = i14 & 1;
                        aVar3 = p3.m.f135153a;
                        if (i28 != 0) {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        } else {
                            if ((i15 & 2) != 0) {
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                    o0VarE.K(objQ);
                                }
                                eVar3 = (v21.e) objQ;
                                i29 = i27 & (-113);
                            } else {
                                eVar3 = eVar2;
                                i29 = i27;
                            }
                            if (i36 != 0) {
                                uVar3 = null;
                            }
                            if ((i15 & 16) != 0) {
                                i29 &= -57345;
                                f0Var2 = new f0(null, null, null, null, 15, null);
                            }
                            if (i17 != 0) {
                                cVar2 = null;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i25 != 0) {
                                i30 = i29;
                                z18 = z15;
                                aVar = null;
                            } else {
                                i30 = i29;
                                z18 = z15;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var10 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                        if (cVar2 != null) {
                            o0VarE.C(-1670651927);
                            yz1.d dVar19 = new yz1.d(uVar, null, false, 6, null);
                            t tVar19 = t.T;
                            u4.d dVarB19 = t.b(tVar19);
                            d0 d0VarE19 = tVar19.e(null, o0VarE, 1);
                            if (z18) {
                                i34 = R.drawable.ic_gcm_add_16;
                            } else {
                                i34 = 0;
                            }
                            String strQ110 = y.Q(o0VarE, R.string.log_food);
                            final int i3116 = 0;
                            z3.e eVarC118 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i3116) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var11 = p3.n.f135158a;
                                                r.a aVar13 = r.S;
                                                r rVarD = x2.d(aVar13, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar14 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar14, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar15 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar15);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar13, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar13, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var12 = p3.n.f135158a;
                                                r.a aVar16 = r.S;
                                                r rVarD2 = x2.d(aVar16, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar17 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar17, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar18 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar18);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar16, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar16, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            int i3117 = i30;
                            z3.e eVarC119 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                            zR2 = o0VarE.r(context);
                            objQ3 = o0VarE.q();
                            if (zR2) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new cy1.a(context, 22);
                                    o0VarE.K(objQ3);
                                }
                            } else {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                            e23.a aVar13 = (e23.a) objQ3;
                            zR3 = o0VarE.r(context);
                            objQ4 = o0VarE.q();
                            if (zR3) {
                                aVar3.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new cy1.a(context, 23);
                                    o0VarE.K(objQ4);
                                }
                            } else {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                            yz1.s.b(rVar, dVar19, strQ, null, dVarB19, d0VarE19, 0.0f, i34, null, 0.0f, strQ110, aVar, eVarC118, eVarC119, false, false, aVar13, (e23.a) objQ4, null, o0VarE, i3117 & 14, ((i3117 >> 18) & 112) | 3456, 312136);
                            o0VarE.g0(false);
                        } else {
                            int i4113 = i30;
                            o0VarE.C(-1668325656);
                            yz1.d dVar110 = new yz1.d(uVar, null, false, 6, null);
                            t tVar110 = t.T;
                            u4.d dVarB110 = t.b(tVar110);
                            final int i4114 = 1;
                            d0 d0VarE110 = tVar110.e(null, o0VarE, 1);
                            String strQ111 = y.Q(o0VarE, R.string.log_food);
                            z3.e eVarC1110 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2;
                                    switch (i4114) {
                                        case 0:
                                            p3.m mVar3 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                x1 x1Var11 = p3.n.f135158a;
                                                r.a aVar14 = r.S;
                                                r rVarD = x2.d(aVar14, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar15 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA = c2.y.a(c2.j.f22694d, aVar15, mVar3, 48);
                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                i2 i2VarX = mVar3.x();
                                                r rVarC = h4.k.c(rVarD, mVar3);
                                                h5.g.V.getClass();
                                                e0.a aVar16 = h5.g.a.f81805b;
                                                if (mVar3.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar3.z();
                                                if (mVar3.getT()) {
                                                    mVar3.M(aVar16);
                                                } else {
                                                    mVar3.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                h5.g.a.b bVar = h5.g.a.f81813j;
                                                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                b0 b0Var = b0.f22601a;
                                                g21.u uVar4 = uVar3;
                                                v21.e eVar4 = eVar3;
                                                f0 f0Var3 = f0Var2;
                                                if (uVar4 != null) {
                                                    mVar3.C(-922063526);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar14, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                    mVar3.f();
                                                    mVar2 = mVar3;
                                                } else {
                                                    mVar3.C(-921653985);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    mVar2 = mVar3;
                                                    c.b(x2.d(c2.l.A(aVar14, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                    mVar2.f();
                                                }
                                                mVar2.y();
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar4 = (p3.m) obj;
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var12 = p3.n.f135158a;
                                                r.a aVar17 = r.S;
                                                r rVarD2 = x2.d(aVar17, 1.0f);
                                                h4.d.f81522a.getClass();
                                                h4.g.a aVar18 = h4.d.a.f81537o;
                                                c2.j.f22691a.getClass();
                                                z zVarA2 = c2.y.a(c2.j.f22694d, aVar18, mVar4, 48);
                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                i2 i2VarX2 = mVar4.x();
                                                r rVarC2 = h4.k.c(rVarD2, mVar4);
                                                h5.g.V.getClass();
                                                e0.a aVar19 = h5.g.a.f81805b;
                                                if (mVar4.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar4.z();
                                                if (mVar4.getT()) {
                                                    mVar4.M(aVar19);
                                                } else {
                                                    mVar4.c();
                                                }
                                                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                b0 b0Var2 = b0.f22601a;
                                                g21.u uVar5 = uVar3;
                                                v21.e eVar5 = eVar3;
                                                f0 f0Var4 = f0Var2;
                                                if (uVar5 != null) {
                                                    mVar4.C(-1230096029);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    p.a(x2.d(c2.l.C(aVar17, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                    mVar4 = mVar4;
                                                    mVar4.f();
                                                } else {
                                                    mVar4.C(-1229686488);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c.b(x2.d(c2.l.A(aVar17, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                    mVar4.f();
                                                }
                                                mVar4.y();
                                            } else {
                                                mVar4.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, o0VarE);
                            zR = o0VarE.r(context);
                            objQ2 = o0VarE.q();
                            if (zR) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new cy1.a(context, 24);
                                    o0VarE.K(objQ2);
                                }
                            } else {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                            yz1.s.c(rVar, dVar110, strQ, null, dVarB110, d0VarE110, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ111, aVar, eVarC1110, (e23.a) objQ2, o0VarE, i4113 & 14, ((i4113 >> 18) & 112) | 384, 840);
                            o0VarE.g0(false);
                        }
                        eVar2 = eVar3;
                        cVar3 = cVar2;
                        aVar2 = aVar;
                        z17 = z18;
                    } else {
                        o0VarE.e();
                        aVar2 = aVar;
                        cVar3 = cVar2;
                        z17 = z15;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                    }
                }
                i16 |= 12582912;
                i27 = i16;
                if ((4793491 & i16) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar3 = p3.m.f135153a;
                    if (i28 != 0) {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var11 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                    if (cVar2 != null) {
                        o0VarE.C(-1670651927);
                        yz1.d dVar111 = new yz1.d(uVar, null, false, 6, null);
                        t tVar111 = t.T;
                        u4.d dVarB111 = t.b(tVar111);
                        d0 d0VarE111 = tVar111.e(null, o0VarE, 1);
                        if (z18) {
                            i34 = R.drawable.ic_gcm_add_16;
                        } else {
                            i34 = 0;
                        }
                        String strQ112 = y.Q(o0VarE, R.string.log_food);
                        final int i3118 = 0;
                        z3.e eVarC1111 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i3118) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var12 = p3.n.f135158a;
                                            r.a aVar14 = r.S;
                                            r rVarD = x2.d(aVar14, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar15 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar15, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar16 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar16);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar14, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar14, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var13 = p3.n.f135158a;
                                            r.a aVar17 = r.S;
                                            r rVarD2 = x2.d(aVar17, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar18 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar18, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar19 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar19);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar17, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar17, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        int i3119 = i30;
                        z3.e eVarC1112 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                        zR2 = o0VarE.r(context);
                        objQ3 = o0VarE.q();
                        if (zR2) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar14 = (e23.a) objQ3;
                        zR3 = o0VarE.r(context);
                        objQ4 = o0VarE.q();
                        if (zR3) {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                        yz1.s.b(rVar, dVar111, strQ, null, dVarB111, d0VarE111, 0.0f, i34, null, 0.0f, strQ112, aVar, eVarC1111, eVarC1112, false, false, aVar14, (e23.a) objQ4, null, o0VarE, i3119 & 14, ((i3119 >> 18) & 112) | 3456, 312136);
                        o0VarE.g0(false);
                    } else {
                        int i4115 = i30;
                        o0VarE.C(-1668325656);
                        yz1.d dVar112 = new yz1.d(uVar, null, false, 6, null);
                        t tVar112 = t.T;
                        u4.d dVarB112 = t.b(tVar112);
                        final int i4116 = 1;
                        d0 d0VarE112 = tVar112.e(null, o0VarE, 1);
                        String strQ113 = y.Q(o0VarE, R.string.log_food);
                        z3.e eVarC1113 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i4116) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var12 = p3.n.f135158a;
                                            r.a aVar15 = r.S;
                                            r rVarD = x2.d(aVar15, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar16 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar16, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar17 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar17);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar15, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var13 = p3.n.f135158a;
                                            r.a aVar18 = r.S;
                                            r rVarD2 = x2.d(aVar18, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar19 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar19, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar110 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar110);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar18, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar18, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        zR = o0VarE.r(context);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                        yz1.s.c(rVar, dVar112, strQ, null, dVarB112, d0VarE112, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ113, aVar, eVarC1113, (e23.a) objQ2, o0VarE, i4115 & 14, ((i4115 >> 18) & 112) | 384, 840);
                        o0VarE.g0(false);
                    }
                    eVar2 = eVar3;
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    cVar3 = cVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                }
            }
            i16 |= 1572864;
            z15 = z14;
            i25 = i15 & 128;
            if (i25 != 0) {
                if ((12582912 & i14) == 0) {
                    if (o0VarE.r(aVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i16;
                if ((4793491 & i16) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar3 = p3.m.f135153a;
                    if (i28 != 0) {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var12 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                    if (cVar2 != null) {
                        o0VarE.C(-1670651927);
                        yz1.d dVar113 = new yz1.d(uVar, null, false, 6, null);
                        t tVar113 = t.T;
                        u4.d dVarB113 = t.b(tVar113);
                        d0 d0VarE113 = tVar113.e(null, o0VarE, 1);
                        if (z18) {
                            i34 = R.drawable.ic_gcm_add_16;
                        } else {
                            i34 = 0;
                        }
                        String strQ114 = y.Q(o0VarE, R.string.log_food);
                        final int i31110 = 0;
                        z3.e eVarC1114 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i31110) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var13 = p3.n.f135158a;
                                            r.a aVar15 = r.S;
                                            r rVarD = x2.d(aVar15, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar16 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar16, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar17 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar17);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar15, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var14 = p3.n.f135158a;
                                            r.a aVar18 = r.S;
                                            r rVarD2 = x2.d(aVar18, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar19 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar19, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar110 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar110);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar18, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar18, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        int i31111 = i30;
                        z3.e eVarC1115 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                        zR2 = o0VarE.r(context);
                        objQ3 = o0VarE.q();
                        if (zR2) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar15 = (e23.a) objQ3;
                        zR3 = o0VarE.r(context);
                        objQ4 = o0VarE.q();
                        if (zR3) {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                        yz1.s.b(rVar, dVar113, strQ, null, dVarB113, d0VarE113, 0.0f, i34, null, 0.0f, strQ114, aVar, eVarC1114, eVarC1115, false, false, aVar15, (e23.a) objQ4, null, o0VarE, i31111 & 14, ((i31111 >> 18) & 112) | 3456, 312136);
                        o0VarE.g0(false);
                    } else {
                        int i4117 = i30;
                        o0VarE.C(-1668325656);
                        yz1.d dVar114 = new yz1.d(uVar, null, false, 6, null);
                        t tVar114 = t.T;
                        u4.d dVarB114 = t.b(tVar114);
                        final int i4118 = 1;
                        d0 d0VarE114 = tVar114.e(null, o0VarE, 1);
                        String strQ115 = y.Q(o0VarE, R.string.log_food);
                        z3.e eVarC1116 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i4118) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var13 = p3.n.f135158a;
                                            r.a aVar16 = r.S;
                                            r rVarD = x2.d(aVar16, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar17 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar17, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar18 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar18);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar16, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar16, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var14 = p3.n.f135158a;
                                            r.a aVar19 = r.S;
                                            r rVarD2 = x2.d(aVar19, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar110 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar110, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar111 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar111);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar19, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar19, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        zR = o0VarE.r(context);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                        yz1.s.c(rVar, dVar114, strQ, null, dVarB114, d0VarE114, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ115, aVar, eVarC1116, (e23.a) objQ2, o0VarE, i4117 & 14, ((i4117 >> 18) & 112) | 384, 840);
                        o0VarE.g0(false);
                    }
                    eVar2 = eVar3;
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    cVar3 = cVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                }
            }
            i16 |= 12582912;
            i27 = i16;
            if ((4793491 & i16) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i28 = i14 & 1;
                aVar3 = p3.m.f135153a;
                if (i28 != 0) {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                }
                o0VarE.h0();
                x1 x1Var13 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                if (cVar2 != null) {
                    o0VarE.C(-1670651927);
                    yz1.d dVar115 = new yz1.d(uVar, null, false, 6, null);
                    t tVar115 = t.T;
                    u4.d dVarB115 = t.b(tVar115);
                    d0 d0VarE115 = tVar115.e(null, o0VarE, 1);
                    if (z18) {
                        i34 = R.drawable.ic_gcm_add_16;
                    } else {
                        i34 = 0;
                    }
                    String strQ116 = y.Q(o0VarE, R.string.log_food);
                    final int i31112 = 0;
                    z3.e eVarC1117 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i31112) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var14 = p3.n.f135158a;
                                        r.a aVar16 = r.S;
                                        r rVarD = x2.d(aVar16, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar17 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar17, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar18 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar18);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar16, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar16, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var15 = p3.n.f135158a;
                                        r.a aVar19 = r.S;
                                        r rVarD2 = x2.d(aVar19, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar110 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar110, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar111 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar111);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar19, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar19, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    int i31113 = i30;
                    z3.e eVarC1118 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                    zR2 = o0VarE.r(context);
                    objQ3 = o0VarE.q();
                    if (zR2) {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new cy1.a(context, 22);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar16 = (e23.a) objQ3;
                    zR3 = o0VarE.r(context);
                    objQ4 = o0VarE.q();
                    if (zR3) {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new cy1.a(context, 23);
                        o0VarE.K(objQ4);
                    }
                    yz1.s.b(rVar, dVar115, strQ, null, dVarB115, d0VarE115, 0.0f, i34, null, 0.0f, strQ116, aVar, eVarC1117, eVarC1118, false, false, aVar16, (e23.a) objQ4, null, o0VarE, i31113 & 14, ((i31113 >> 18) & 112) | 3456, 312136);
                    o0VarE.g0(false);
                } else {
                    int i4119 = i30;
                    o0VarE.C(-1668325656);
                    yz1.d dVar116 = new yz1.d(uVar, null, false, 6, null);
                    t tVar116 = t.T;
                    u4.d dVarB116 = t.b(tVar116);
                    final int i41110 = 1;
                    d0 d0VarE116 = tVar116.e(null, o0VarE, 1);
                    String strQ117 = y.Q(o0VarE, R.string.log_food);
                    z3.e eVarC1119 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i41110) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var14 = p3.n.f135158a;
                                        r.a aVar17 = r.S;
                                        r rVarD = x2.d(aVar17, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar18 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar18, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar19 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar19);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar17, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar17, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var15 = p3.n.f135158a;
                                        r.a aVar110 = r.S;
                                        r rVarD2 = x2.d(aVar110, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar111 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar111, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar112 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar112);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar110, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar110, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    zR = o0VarE.r(context);
                    objQ2 = o0VarE.q();
                    if (zR) {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new cy1.a(context, 24);
                        o0VarE.K(objQ2);
                    }
                    yz1.s.c(rVar, dVar116, strQ, null, dVarB116, d0VarE116, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ117, aVar, eVarC1119, (e23.a) objQ2, o0VarE, i4119 & 14, ((i4119 >> 18) & 112) | 384, 840);
                    o0VarE.g0(false);
                }
                eVar2 = eVar3;
                cVar3 = cVar2;
                aVar2 = aVar;
                z17 = z18;
            } else {
                o0VarE.e();
                aVar2 = aVar;
                cVar3 = cVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
            }
        }
        i16 |= 196608;
        cVar2 = cVar;
        i19 = i15 & 64;
        if (i19 != 0) {
            if ((1572864 & i14) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            i25 = i15 & 128;
            if (i25 != 0) {
                if ((12582912 & i14) == 0) {
                    if (o0VarE.r(aVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i16;
                if ((4793491 & i16) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar3 = p3.m.f135153a;
                    if (i28 != 0) {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                o0VarE.K(objQ);
                            }
                            eVar3 = (v21.e) objQ;
                            i29 = i27 & (-113);
                        } else {
                            eVar3 = eVar2;
                            i29 = i27;
                        }
                        if (i36 != 0) {
                            uVar3 = null;
                        }
                        if ((i15 & 16) != 0) {
                            i29 &= -57345;
                            f0Var2 = new f0(null, null, null, null, 15, null);
                        }
                        if (i17 != 0) {
                            cVar2 = null;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i25 != 0) {
                            i30 = i29;
                            z18 = z15;
                            aVar = null;
                        } else {
                            i30 = i29;
                            z18 = z15;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var14 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                    if (cVar2 != null) {
                        o0VarE.C(-1670651927);
                        yz1.d dVar117 = new yz1.d(uVar, null, false, 6, null);
                        t tVar117 = t.T;
                        u4.d dVarB117 = t.b(tVar117);
                        d0 d0VarE117 = tVar117.e(null, o0VarE, 1);
                        if (z18) {
                            i34 = R.drawable.ic_gcm_add_16;
                        } else {
                            i34 = 0;
                        }
                        String strQ118 = y.Q(o0VarE, R.string.log_food);
                        final int i31114 = 0;
                        z3.e eVarC11110 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i31114) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var15 = p3.n.f135158a;
                                            r.a aVar17 = r.S;
                                            r rVarD = x2.d(aVar17, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar18 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar18, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar19 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar19);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar17, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar17, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var16 = p3.n.f135158a;
                                            r.a aVar110 = r.S;
                                            r rVarD2 = x2.d(aVar110, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar111 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar111, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar112 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar112);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar110, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar110, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        int i31115 = i30;
                        z3.e eVarC11111 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                        zR2 = o0VarE.r(context);
                        objQ3 = o0VarE.q();
                        if (zR2) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new cy1.a(context, 22);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                        e23.a aVar17 = (e23.a) objQ3;
                        zR3 = o0VarE.r(context);
                        objQ4 = o0VarE.q();
                        if (zR3) {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cy1.a(context, 23);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                        yz1.s.b(rVar, dVar117, strQ, null, dVarB117, d0VarE117, 0.0f, i34, null, 0.0f, strQ118, aVar, eVarC11110, eVarC11111, false, false, aVar17, (e23.a) objQ4, null, o0VarE, i31115 & 14, ((i31115 >> 18) & 112) | 3456, 312136);
                        o0VarE.g0(false);
                    } else {
                        int i41111 = i30;
                        o0VarE.C(-1668325656);
                        yz1.d dVar118 = new yz1.d(uVar, null, false, 6, null);
                        t tVar118 = t.T;
                        u4.d dVarB118 = t.b(tVar118);
                        final int i41112 = 1;
                        d0 d0VarE118 = tVar118.e(null, o0VarE, 1);
                        String strQ119 = y.Q(o0VarE, R.string.log_food);
                        z3.e eVarC11112 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2;
                                switch (i41112) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var15 = p3.n.f135158a;
                                            r.a aVar18 = r.S;
                                            r rVarD = x2.d(aVar18, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar19 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA = c2.y.a(c2.j.f22694d, aVar19, mVar3, 48);
                                            int iHashCode = Long.hashCode(mVar3.getU());
                                            i2 i2VarX = mVar3.x();
                                            r rVarC = h4.k.c(rVarD, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar110 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar110);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                            b0 b0Var = b0.f22601a;
                                            g21.u uVar4 = uVar3;
                                            v21.e eVar4 = eVar3;
                                            f0 f0Var3 = f0Var2;
                                            if (uVar4 != null) {
                                                mVar3.C(-922063526);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar18, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                                mVar3.f();
                                                mVar2 = mVar3;
                                            } else {
                                                mVar3.C(-921653985);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                mVar2 = mVar3;
                                                c.b(x2.d(c2.l.A(aVar18, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                                mVar2.f();
                                            }
                                            mVar2.y();
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var16 = p3.n.f135158a;
                                            r.a aVar111 = r.S;
                                            r rVarD2 = x2.d(aVar111, 1.0f);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar112 = h4.d.a.f81537o;
                                            c2.j.f22691a.getClass();
                                            z zVarA2 = c2.y.a(c2.j.f22694d, aVar112, mVar4, 48);
                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX2 = mVar4.x();
                                            r rVarC2 = h4.k.c(rVarD2, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar113 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar113);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                            b0 b0Var2 = b0.f22601a;
                                            g21.u uVar5 = uVar3;
                                            v21.e eVar5 = eVar3;
                                            f0 f0Var4 = f0Var2;
                                            if (uVar5 != null) {
                                                mVar4.C(-1230096029);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                p.a(x2.d(c2.l.C(aVar111, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                                mVar4 = mVar4;
                                                mVar4.f();
                                            } else {
                                                mVar4.C(-1229686488);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c.b(x2.d(c2.l.A(aVar111, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                                mVar4.f();
                                            }
                                            mVar4.y();
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, o0VarE);
                        zR = o0VarE.r(context);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cy1.a(context, 24);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                        yz1.s.c(rVar, dVar118, strQ, null, dVarB118, d0VarE118, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ119, aVar, eVarC11112, (e23.a) objQ2, o0VarE, i41111 & 14, ((i41111 >> 18) & 112) | 384, 840);
                        o0VarE.g0(false);
                    }
                    eVar2 = eVar3;
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    cVar3 = cVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
                }
            }
            i16 |= 12582912;
            i27 = i16;
            if ((4793491 & i16) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i28 = i14 & 1;
                aVar3 = p3.m.f135153a;
                if (i28 != 0) {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                }
                o0VarE.h0();
                x1 x1Var15 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                if (cVar2 != null) {
                    o0VarE.C(-1670651927);
                    yz1.d dVar119 = new yz1.d(uVar, null, false, 6, null);
                    t tVar119 = t.T;
                    u4.d dVarB119 = t.b(tVar119);
                    d0 d0VarE119 = tVar119.e(null, o0VarE, 1);
                    if (z18) {
                        i34 = R.drawable.ic_gcm_add_16;
                    } else {
                        i34 = 0;
                    }
                    String strQ1110 = y.Q(o0VarE, R.string.log_food);
                    final int i31116 = 0;
                    z3.e eVarC11113 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i31116) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var16 = p3.n.f135158a;
                                        r.a aVar18 = r.S;
                                        r rVarD = x2.d(aVar18, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar19 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar19, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar110 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar110);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar18, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar18, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var17 = p3.n.f135158a;
                                        r.a aVar111 = r.S;
                                        r rVarD2 = x2.d(aVar111, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar112 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar112, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar113 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar113);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar111, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar111, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    int i31117 = i30;
                    z3.e eVarC11114 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                    zR2 = o0VarE.r(context);
                    objQ3 = o0VarE.q();
                    if (zR2) {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new cy1.a(context, 22);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar18 = (e23.a) objQ3;
                    zR3 = o0VarE.r(context);
                    objQ4 = o0VarE.q();
                    if (zR3) {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new cy1.a(context, 23);
                        o0VarE.K(objQ4);
                    }
                    yz1.s.b(rVar, dVar119, strQ, null, dVarB119, d0VarE119, 0.0f, i34, null, 0.0f, strQ1110, aVar, eVarC11113, eVarC11114, false, false, aVar18, (e23.a) objQ4, null, o0VarE, i31117 & 14, ((i31117 >> 18) & 112) | 3456, 312136);
                    o0VarE.g0(false);
                } else {
                    int i41113 = i30;
                    o0VarE.C(-1668325656);
                    yz1.d dVar1110 = new yz1.d(uVar, null, false, 6, null);
                    t tVar1110 = t.T;
                    u4.d dVarB1110 = t.b(tVar1110);
                    final int i41114 = 1;
                    d0 d0VarE1110 = tVar1110.e(null, o0VarE, 1);
                    String strQ1111 = y.Q(o0VarE, R.string.log_food);
                    z3.e eVarC11115 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i41114) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var16 = p3.n.f135158a;
                                        r.a aVar19 = r.S;
                                        r rVarD = x2.d(aVar19, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar110 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar110, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar111 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar111);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar19, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar19, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var17 = p3.n.f135158a;
                                        r.a aVar112 = r.S;
                                        r rVarD2 = x2.d(aVar112, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar113 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar113, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar114 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar114);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar112, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar112, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    zR = o0VarE.r(context);
                    objQ2 = o0VarE.q();
                    if (zR) {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new cy1.a(context, 24);
                        o0VarE.K(objQ2);
                    }
                    yz1.s.c(rVar, dVar1110, strQ, null, dVarB1110, d0VarE1110, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ1111, aVar, eVarC11115, (e23.a) objQ2, o0VarE, i41113 & 14, ((i41113 >> 18) & 112) | 384, 840);
                    o0VarE.g0(false);
                }
                eVar2 = eVar3;
                cVar3 = cVar2;
                aVar2 = aVar;
                z17 = z18;
            } else {
                o0VarE.e();
                aVar2 = aVar;
                cVar3 = cVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
            }
        }
        i16 |= 1572864;
        z15 = z14;
        i25 = i15 & 128;
        if (i25 != 0) {
            if ((12582912 & i14) == 0) {
                if (o0VarE.r(aVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
            i27 = i16;
            if ((4793491 & i16) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i28 = i14 & 1;
                aVar3 = p3.m.f135153a;
                if (i28 != 0) {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            o0VarE.K(objQ);
                        }
                        eVar3 = (v21.e) objQ;
                        i29 = i27 & (-113);
                    } else {
                        eVar3 = eVar2;
                        i29 = i27;
                    }
                    if (i36 != 0) {
                        uVar3 = null;
                    }
                    if ((i15 & 16) != 0) {
                        i29 &= -57345;
                        f0Var2 = new f0(null, null, null, null, 15, null);
                    }
                    if (i17 != 0) {
                        cVar2 = null;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        i30 = i29;
                        z18 = z15;
                        aVar = null;
                    } else {
                        i30 = i29;
                        z18 = z15;
                    }
                }
                o0VarE.h0();
                x1 x1Var16 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                strQ = y.Q(o0VarE, R.string.lbl_nutrition);
                if (cVar2 != null) {
                    o0VarE.C(-1670651927);
                    yz1.d dVar1111 = new yz1.d(uVar, null, false, 6, null);
                    t tVar1111 = t.T;
                    u4.d dVarB1111 = t.b(tVar1111);
                    d0 d0VarE1111 = tVar1111.e(null, o0VarE, 1);
                    if (z18) {
                        i34 = R.drawable.ic_gcm_add_16;
                    } else {
                        i34 = 0;
                    }
                    String strQ1112 = y.Q(o0VarE, R.string.log_food);
                    final int i31118 = 0;
                    z3.e eVarC11116 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i31118) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var17 = p3.n.f135158a;
                                        r.a aVar19 = r.S;
                                        r rVarD = x2.d(aVar19, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar110 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar110, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar111 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar111);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar19, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar19, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var18 = p3.n.f135158a;
                                        r.a aVar112 = r.S;
                                        r rVarD2 = x2.d(aVar112, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar113 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar113, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar114 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar114);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar112, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar112, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    int i31119 = i30;
                    z3.e eVarC11117 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                    zR2 = o0VarE.r(context);
                    objQ3 = o0VarE.q();
                    if (zR2) {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cy1.a(context, 22);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new cy1.a(context, 22);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar19 = (e23.a) objQ3;
                    zR3 = o0VarE.r(context);
                    objQ4 = o0VarE.q();
                    if (zR3) {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cy1.a(context, 23);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new cy1.a(context, 23);
                        o0VarE.K(objQ4);
                    }
                    yz1.s.b(rVar, dVar1111, strQ, null, dVarB1111, d0VarE1111, 0.0f, i34, null, 0.0f, strQ1112, aVar, eVarC11116, eVarC11117, false, false, aVar19, (e23.a) objQ4, null, o0VarE, i31119 & 14, ((i31119 >> 18) & 112) | 3456, 312136);
                    o0VarE.g0(false);
                } else {
                    int i41115 = i30;
                    o0VarE.C(-1668325656);
                    yz1.d dVar1112 = new yz1.d(uVar, null, false, 6, null);
                    t tVar1112 = t.T;
                    u4.d dVarB1112 = t.b(tVar1112);
                    final int i41116 = 1;
                    d0 d0VarE1112 = tVar1112.e(null, o0VarE, 1);
                    String strQ1113 = y.Q(o0VarE, R.string.log_food);
                    z3.e eVarC11118 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2;
                            switch (i41116) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var17 = p3.n.f135158a;
                                        r.a aVar110 = r.S;
                                        r rVarD = x2.d(aVar110, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar111 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA = c2.y.a(c2.j.f22694d, aVar111, mVar3, 48);
                                        int iHashCode = Long.hashCode(mVar3.getU());
                                        i2 i2VarX = mVar3.x();
                                        r rVarC = h4.k.c(rVarD, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar112 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar112);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                        b0 b0Var = b0.f22601a;
                                        g21.u uVar4 = uVar3;
                                        v21.e eVar4 = eVar3;
                                        f0 f0Var3 = f0Var2;
                                        if (uVar4 != null) {
                                            mVar3.C(-922063526);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar110, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                            mVar3.f();
                                            mVar2 = mVar3;
                                        } else {
                                            mVar3.C(-921653985);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            mVar2 = mVar3;
                                            c.b(x2.d(c2.l.A(aVar110, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                            mVar2.f();
                                        }
                                        mVar2.y();
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var18 = p3.n.f135158a;
                                        r.a aVar113 = r.S;
                                        r rVarD2 = x2.d(aVar113, 1.0f);
                                        h4.d.f81522a.getClass();
                                        h4.g.a aVar114 = h4.d.a.f81537o;
                                        c2.j.f22691a.getClass();
                                        z zVarA2 = c2.y.a(c2.j.f22694d, aVar114, mVar4, 48);
                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX2 = mVar4.x();
                                        r rVarC2 = h4.k.c(rVarD2, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar115 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar115);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                        b0 b0Var2 = b0.f22601a;
                                        g21.u uVar5 = uVar3;
                                        v21.e eVar5 = eVar3;
                                        f0 f0Var4 = f0Var2;
                                        if (uVar5 != null) {
                                            mVar4.C(-1230096029);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            p.a(x2.d(c2.l.C(aVar113, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                            mVar4 = mVar4;
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1229686488);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c.b(x2.d(c2.l.A(aVar113, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                            mVar4.f();
                                        }
                                        mVar4.y();
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, o0VarE);
                    zR = o0VarE.r(context);
                    objQ2 = o0VarE.q();
                    if (zR) {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cy1.a(context, 24);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new cy1.a(context, 24);
                        o0VarE.K(objQ2);
                    }
                    yz1.s.c(rVar, dVar1112, strQ, null, dVarB1112, d0VarE1112, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ1113, aVar, eVarC11118, (e23.a) objQ2, o0VarE, i41115 & 14, ((i41115 >> 18) & 112) | 384, 840);
                    o0VarE.g0(false);
                }
                eVar2 = eVar3;
                cVar3 = cVar2;
                aVar2 = aVar;
                z17 = z18;
            } else {
                o0VarE.e();
                aVar2 = aVar;
                cVar3 = cVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
            }
        }
        i16 |= 12582912;
        i27 = i16;
        if ((4793491 & i16) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i27 & 1, z16)) {
            o0VarE.G0();
            i28 = i14 & 1;
            aVar3 = p3.m.f135153a;
            if (i28 != 0) {
                if ((i15 & 2) != 0) {
                    objQ = o0VarE.q();
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        o0VarE.K(objQ);
                    }
                    eVar3 = (v21.e) objQ;
                    i29 = i27 & (-113);
                } else {
                    eVar3 = eVar2;
                    i29 = i27;
                }
                if (i36 != 0) {
                    uVar3 = null;
                }
                if ((i15 & 16) != 0) {
                    i29 &= -57345;
                    f0Var2 = new f0(null, null, null, null, 15, null);
                }
                if (i17 != 0) {
                    cVar2 = null;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i25 != 0) {
                    i30 = i29;
                    z18 = z15;
                    aVar = null;
                } else {
                    i30 = i29;
                    z18 = z15;
                }
            } else {
                if ((i15 & 2) != 0) {
                    objQ = o0VarE.q();
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        o0VarE.K(objQ);
                    }
                    eVar3 = (v21.e) objQ;
                    i29 = i27 & (-113);
                } else {
                    eVar3 = eVar2;
                    i29 = i27;
                }
                if (i36 != 0) {
                    uVar3 = null;
                }
                if ((i15 & 16) != 0) {
                    i29 &= -57345;
                    f0Var2 = new f0(null, null, null, null, 15, null);
                }
                if (i17 != 0) {
                    cVar2 = null;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i25 != 0) {
                    i30 = i29;
                    z18 = z15;
                    aVar = null;
                } else {
                    i30 = i29;
                    z18 = z15;
                }
            }
            o0VarE.h0();
            x1 x1Var17 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            strQ = y.Q(o0VarE, R.string.lbl_nutrition);
            if (cVar2 != null) {
                o0VarE.C(-1670651927);
                yz1.d dVar1113 = new yz1.d(uVar, null, false, 6, null);
                t tVar1113 = t.T;
                u4.d dVarB1113 = t.b(tVar1113);
                d0 d0VarE1113 = tVar1113.e(null, o0VarE, 1);
                if (z18) {
                    i34 = R.drawable.ic_gcm_add_16;
                } else {
                    i34 = 0;
                }
                String strQ1114 = y.Q(o0VarE, R.string.log_food);
                final int i311110 = 0;
                z3.e eVarC11119 = z3.f.c(436301304, new e23.p() { // from class: g11.g
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2;
                        switch (i311110) {
                            case 0:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var18 = p3.n.f135158a;
                                    r.a aVar110 = r.S;
                                    r rVarD = x2.d(aVar110, 1.0f);
                                    h4.d.f81522a.getClass();
                                    h4.g.a aVar111 = h4.d.a.f81537o;
                                    c2.j.f22691a.getClass();
                                    z zVarA = c2.y.a(c2.j.f22694d, aVar111, mVar3, 48);
                                    int iHashCode = Long.hashCode(mVar3.getU());
                                    i2 i2VarX = mVar3.x();
                                    r rVarC = h4.k.c(rVarD, mVar3);
                                    h5.g.V.getClass();
                                    e0.a aVar112 = h5.g.a.f81805b;
                                    if (mVar3.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar3.z();
                                    if (mVar3.getT()) {
                                        mVar3.M(aVar112);
                                    } else {
                                        mVar3.c();
                                    }
                                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                    h5.g.a.b bVar = h5.g.a.f81813j;
                                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                    b0 b0Var = b0.f22601a;
                                    g21.u uVar4 = uVar3;
                                    v21.e eVar4 = eVar3;
                                    f0 f0Var3 = f0Var2;
                                    if (uVar4 != null) {
                                        mVar3.C(-922063526);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        p.a(x2.d(c2.l.C(aVar110, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                        mVar3.f();
                                        mVar2 = mVar3;
                                    } else {
                                        mVar3.C(-921653985);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        mVar2 = mVar3;
                                        c.b(x2.d(c2.l.A(aVar110, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                        mVar2.f();
                                    }
                                    mVar2.y();
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                            default:
                                p3.m mVar4 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var19 = p3.n.f135158a;
                                    r.a aVar113 = r.S;
                                    r rVarD2 = x2.d(aVar113, 1.0f);
                                    h4.d.f81522a.getClass();
                                    h4.g.a aVar114 = h4.d.a.f81537o;
                                    c2.j.f22691a.getClass();
                                    z zVarA2 = c2.y.a(c2.j.f22694d, aVar114, mVar4, 48);
                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                    i2 i2VarX2 = mVar4.x();
                                    r rVarC2 = h4.k.c(rVarD2, mVar4);
                                    h5.g.V.getClass();
                                    e0.a aVar115 = h5.g.a.f81805b;
                                    if (mVar4.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar4.z();
                                    if (mVar4.getT()) {
                                        mVar4.M(aVar115);
                                    } else {
                                        mVar4.c();
                                    }
                                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                    b0 b0Var2 = b0.f22601a;
                                    g21.u uVar5 = uVar3;
                                    v21.e eVar5 = eVar3;
                                    f0 f0Var4 = f0Var2;
                                    if (uVar5 != null) {
                                        mVar4.C(-1230096029);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        p.a(x2.d(c2.l.C(aVar113, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                        mVar4 = mVar4;
                                        mVar4.f();
                                    } else {
                                        mVar4.C(-1229686488);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c.b(x2.d(c2.l.A(aVar113, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                        mVar4.f();
                                    }
                                    mVar4.y();
                                } else {
                                    mVar4.e();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, o0VarE);
                int i311111 = i30;
                z3.e eVarC111110 = z3.f.c(-35696105, new h(strQ, cVar2, 1, (byte) 0), o0VarE);
                zR2 = o0VarE.r(context);
                objQ3 = o0VarE.q();
                if (zR2) {
                    aVar3.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new cy1.a(context, 22);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new cy1.a(context, 22);
                    o0VarE.K(objQ3);
                }
                e23.a aVar110 = (e23.a) objQ3;
                zR3 = o0VarE.r(context);
                objQ4 = o0VarE.q();
                if (zR3) {
                    aVar3.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new cy1.a(context, 23);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new cy1.a(context, 23);
                    o0VarE.K(objQ4);
                }
                yz1.s.b(rVar, dVar1113, strQ, null, dVarB1113, d0VarE1113, 0.0f, i34, null, 0.0f, strQ1114, aVar, eVarC11119, eVarC111110, false, false, aVar110, (e23.a) objQ4, null, o0VarE, i311111 & 14, ((i311111 >> 18) & 112) | 3456, 312136);
                o0VarE.g0(false);
            } else {
                int i41117 = i30;
                o0VarE.C(-1668325656);
                yz1.d dVar1114 = new yz1.d(uVar, null, false, 6, null);
                t tVar1114 = t.T;
                u4.d dVarB1114 = t.b(tVar1114);
                final int i41118 = 1;
                d0 d0VarE1114 = tVar1114.e(null, o0VarE, 1);
                String strQ1115 = y.Q(o0VarE, R.string.log_food);
                z3.e eVarC111111 = z3.f.c(2059149583, new e23.p() { // from class: g11.g
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2;
                        switch (i41118) {
                            case 0:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var18 = p3.n.f135158a;
                                    r.a aVar111 = r.S;
                                    r rVarD = x2.d(aVar111, 1.0f);
                                    h4.d.f81522a.getClass();
                                    h4.g.a aVar112 = h4.d.a.f81537o;
                                    c2.j.f22691a.getClass();
                                    z zVarA = c2.y.a(c2.j.f22694d, aVar112, mVar3, 48);
                                    int iHashCode = Long.hashCode(mVar3.getU());
                                    i2 i2VarX = mVar3.x();
                                    r rVarC = h4.k.c(rVarD, mVar3);
                                    h5.g.V.getClass();
                                    e0.a aVar113 = h5.g.a.f81805b;
                                    if (mVar3.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar3.z();
                                    if (mVar3.getT()) {
                                        mVar3.M(aVar113);
                                    } else {
                                        mVar3.c();
                                    }
                                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                    h5.g.a.b bVar = h5.g.a.f81813j;
                                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                    b0 b0Var = b0.f22601a;
                                    g21.u uVar4 = uVar3;
                                    v21.e eVar4 = eVar3;
                                    f0 f0Var3 = f0Var2;
                                    if (uVar4 != null) {
                                        mVar3.C(-922063526);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        p.a(x2.d(c2.l.C(aVar111, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar4, uVar4, f0Var3, true, false, mVar3, 196608, 66);
                                        mVar3.f();
                                        mVar2 = mVar3;
                                    } else {
                                        mVar3.C(-921653985);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        mVar2 = mVar3;
                                        c.b(x2.d(c2.l.A(aVar111, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar4, f0Var3, false, mVar2, 0, 50);
                                        mVar2.f();
                                    }
                                    mVar2.y();
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                            default:
                                p3.m mVar4 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var19 = p3.n.f135158a;
                                    r.a aVar114 = r.S;
                                    r rVarD2 = x2.d(aVar114, 1.0f);
                                    h4.d.f81522a.getClass();
                                    h4.g.a aVar115 = h4.d.a.f81537o;
                                    c2.j.f22691a.getClass();
                                    z zVarA2 = c2.y.a(c2.j.f22694d, aVar115, mVar4, 48);
                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                    i2 i2VarX2 = mVar4.x();
                                    r rVarC2 = h4.k.c(rVarD2, mVar4);
                                    h5.g.V.getClass();
                                    e0.a aVar116 = h5.g.a.f81805b;
                                    if (mVar4.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar4.z();
                                    if (mVar4.getT()) {
                                        mVar4.M(aVar116);
                                    } else {
                                        mVar4.c();
                                    }
                                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                    b0 b0Var2 = b0.f22601a;
                                    g21.u uVar5 = uVar3;
                                    v21.e eVar5 = eVar3;
                                    f0 f0Var4 = f0Var2;
                                    if (uVar5 != null) {
                                        mVar4.C(-1230096029);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        p.a(x2.d(c2.l.C(aVar114, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f), null, eVar5, uVar5, f0Var4, true, false, mVar4, 196608, 66);
                                        mVar4 = mVar4;
                                        mVar4.f();
                                    } else {
                                        mVar4.C(-1229686488);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c.b(x2.d(c2.l.A(aVar114, 0.0f, j92.b.f97899b.f97920e, 1), 1.0f), null, eVar5, f0Var4, false, mVar4, 0, 50);
                                        mVar4.f();
                                    }
                                    mVar4.y();
                                } else {
                                    mVar4.e();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, o0VarE);
                zR = o0VarE.r(context);
                objQ2 = o0VarE.q();
                if (zR) {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cy1.a(context, 24);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new cy1.a(context, 24);
                    o0VarE.K(objQ2);
                }
                yz1.s.c(rVar, dVar1114, strQ, null, dVarB1114, d0VarE1114, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ1115, aVar, eVarC111111, (e23.a) objQ2, o0VarE, i41117 & 14, ((i41117 >> 18) & 112) | 384, 840);
                o0VarE.g0(false);
            }
            eVar2 = eVar3;
            cVar3 = cVar2;
            aVar2 = aVar;
            z17 = z18;
        } else {
            o0VarE.e();
            aVar2 = aVar;
            cVar3 = cVar2;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(rVar, eVar2, uVar, uVar3, f0Var2, cVar3, z17, aVar2, i14, i15);
        }
    }
}
