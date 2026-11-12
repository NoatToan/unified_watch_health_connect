package yq0;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d1;
import c2.a0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.model.GradientColor;
import com.google.android.exoplayer2.audio.WavUtil;
import d53.w;
import f5.g0;
import f5.z0;
import g02.s0;
import h4.r;
import h5.e0;
import i3.mh;
import i3.v5;
import java.util.List;
import o4.q1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.i0;
import s5.x0;
import w5.c0;
import w5.f0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f198731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f198732b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f198731a = 190;
        f198732b = 35;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x047b  */
    /* JADX WARN: Code duplicated, block: B:96:0x044a  */
    public static final void a(r rVar, tq0.c cVar, tq0.l lVar, p3.m mVar, int i14) {
        Throwable th3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        o0 o0Var;
        oq0.b bVar;
        BarChart barChart;
        tq0.i iVar;
        tq0.i.e eVar;
        String str;
        tq0.i iVar2;
        List<tq0.h> listB;
        tq0.i iVar3;
        o0 o0VarE = mVar.E(-252272727);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            char c14 = 3;
            r rVarX = x2.x(x2.f(r.S, 1.0f), null, 3);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarX, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String str2 = (cVar == null || (iVar3 = cVar.f166044a) == null) ? null : iVar3.f166082b;
            if (str2 == null) {
                o0VarE.C(534808747);
                o0VarE.g0(false);
                th3 = null;
                z14 = false;
            } else {
                o0VarE.C(534808748);
                Spanned spannedFromHtml = Html.fromHtml(str2, 63);
                spannedFromHtml.getClass();
                s5.c.b bVar3 = new s5.c.b(0, 1, null);
                bVar3.b(spannedFromHtml.toString());
                Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class);
                spans.getClass();
                int length = spans.length;
                int i17 = 0;
                while (i17 < length) {
                    Object obj = spans[i17];
                    int spanStart = spannedFromHtml.getSpanStart(obj);
                    int spanEnd = spannedFromHtml.getSpanEnd(obj);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == 1) {
                            c14 = 3;
                            f0.f182097b.getClass();
                            bVar3.a(new i0(0L, 0L, f0.f182105j, (w5.b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                        } else if (style != i15) {
                            c14 = 3;
                            if (style == 3) {
                                f0.f182097b.getClass();
                                f0 f0Var = f0.f182105j;
                                w5.b0.f182070b.getClass();
                                bVar3.a(new i0(0L, 0L, f0Var, w5.b0.a(w5.b0.f182071c), (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65523, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                            }
                        } else {
                            c14 = 3;
                            w5.b0.f182070b.getClass();
                            bVar3.a(new i0(0L, 0L, (f0) null, w5.b0.a(w5.b0.f182071c), (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65527, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                        }
                    } else {
                        c14 = 3;
                        if (obj instanceof UnderlineSpan) {
                            d6.i.f57760b.getClass();
                            bVar3.a(new i0(0L, 0L, (f0) null, (w5.b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, d6.i.f57762d, (q1) null, (s5.b0) null, (q4.g) null, 61439, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                        } else if (obj instanceof ForegroundColorSpan) {
                            bVar3.a(new i0(o4.f0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (f0) null, (w5.b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                        }
                    }
                    i17++;
                    i15 = 2;
                }
                s5.c cVarK = bVar3.k();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                r.a aVar2 = r.S;
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar2 = j92.b.f97899b;
                r rVarC2 = c2.l.C(aVar2, eVar2.f97922g, 0.0f, 0.0f, 0.0f, 14);
                bVar4.getClass();
                th3 = null;
                z14 = false;
                mh.d(cVarK, c2.l.A(rVarC2, 0.0f, eVar2.f97917b, 1), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF, o0VarE, 0, 0, 262140);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            h4.d.f81522a.getClass();
            h4.g.b bVar5 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar5, o0VarE, 48);
            x1 x1Var2 = n.f135158a;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
            h5.g.a.b bVar6 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar6);
            }
            b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            BarChart barChart2 = new BarChart(context);
            oq0.b bVar7 = new oq0.b(barChart2, new GradientColor(context.getColor(R.color.gcm3_chart_gradient_purple_end), context.getColor(R.color.gcm3_chart_blue_light)), new GradientColor(context.getColor(R.color.gcm3_chart_gradient_orange_start), context.getColor(R.color.gcm3_chart_gradient_orange_end)), true, 0.0f, 16, null);
            if (cVar == null || (iVar2 = cVar.f166044a) == null || (listB = iVar2.b()) == null) {
                z15 = true;
                z16 = z14;
            } else {
                z15 = true;
                z16 = !listB.isEmpty();
            }
            if (z16) {
                o0VarE.C(1875791804);
                r.a aVar4 = r.S;
                aVar4.getClass();
                r rVarThen = l4.k.g(aVar4, -90.0f).then(g0.d(aVar4, new yp0.b(3)));
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = c2.l.y(rVarThen, j92.b.f97899b.f97920e);
                String str3 = "";
                if (cVar != null && (iVar = cVar.f166044a) != null && (eVar = iVar.f166083c) != null && (str = eVar.f166090c) != null) {
                    str3 = str;
                }
                d92.b.f58624b.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
                d6.h.f57752b.getClass();
                o0 o0Var2 = o0VarE;
                barChart = barChart2;
                bVar = bVar7;
                z17 = z16;
                mh.c(str3, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, o0Var2, 0, 0, 130044);
                o0Var = o0Var2;
                o0Var.g0(z14);
            } else {
                z17 = z16;
                o0Var = o0VarE;
                bVar = bVar7;
                barChart = barChart2;
                o0Var.C(1876166067);
                o0Var.g0(z14);
            }
            r rVarJ = x2.j(x2.f(r.S, 1.0f), f198731a, 0.0f, 2);
            boolean zR = o0Var.r(barChart);
            Object objQ = o0Var.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new xa2.g(barChart, 25);
                o0Var.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xa2.g(barChart, 25);
                    o0Var.K(objQ);
                }
            }
            e23.l lVar2 = (e23.l) objQ;
            boolean zR2 = o0Var.r(bVar) | o0Var.h(z17) | o0Var.r(cVar) | o0Var.r(lVar);
            Object objQ2 = o0Var.q();
            if (zR2) {
                dt1.d dVar = new dt1.d(bVar, z17, cVar, lVar, 8);
                o0Var.K(dVar);
                objQ2 = dVar;
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    dt1.d dVar2 = new dt1.d(bVar, z17, cVar, lVar, 8);
                    o0Var.K(dVar2);
                    objQ2 = dVar2;
                }
            }
            o0VarE = o0Var;
            p002j6.c.b(lVar2, rVarJ, (e23.l) objQ2, o0VarE, 48, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(rVar, cVar, lVar, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:76:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0308  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(tq0.l lVar, tq0.k kVar, List<tq0.k> list, e23.l<? super tq0.l, Unit> lVar2, p3.m mVar, int i14) {
        tq0.g gVar;
        long jC;
        boolean z14;
        o0 o0VarE = mVar.E(-1015372952);
        int i15 = (o0VarE.r(lVar) ? 4 : 2) | i14 | (o0VarE.B(kVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            tq0.g.a aVar = tq0.g.f166059d;
            String str = lVar.f166099a.f166036a;
            aVar.getClass();
            if (str == null) {
                gVar = tq0.g.UNKNOWN;
                break;
            }
            w13.c cVar = tq0.g.f166071p;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    gVar = tq0.g.UNKNOWN;
                    break;
                }
                gVar = (tq0.g) bVarN.next();
            } while (!w.z(str, gVar.f166072a, false));
            tq0.g gVar2 = gVar;
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new ot.c(context, 23);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ot.c(context, 23);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar3 = (e23.l) objQ;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarZ = c2.l.z(aVar3, f14, eVar.f97917b);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d1 d1Var = d1.f16531a;
            int i17 = gVar2.f166073b;
            bVar.getClass();
            float f15 = j92.b.f97901d.f97904c;
            long j8 = d92.b.a(o0VarE).f().f63508c;
            tq0.g.f166059d.getClass();
            switch (tq0.g.a.C3125a.f166075a[gVar2.ordinal()]) {
                case 1:
                    o0VarE.C(817935173);
                    gl.c.f77766a.getClass();
                    jC = gl.c.a(o0VarE).c();
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(817937509);
                    gl.c.f77766a.getClass();
                    jC = gl.c.a(o0VarE).c();
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(817939845);
                    gl.c.f77766a.getClass();
                    jC = gl.c.a(o0VarE).c();
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(817942213);
                    gl.c.f77766a.getClass();
                    jC = gl.c.a(o0VarE).c();
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(817944645);
                    gl.c.f77766a.getClass();
                    jC = gl.c.a(o0VarE).c();
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(817947013);
                    gl.c.f77766a.getClass();
                    jC = gl.c.a(o0VarE).c();
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(817949419);
                    f02.a.f67722a.getClass();
                    jC = f02.a.a(o0VarE);
                    o0VarE.g0(false);
                    break;
                case 8:
                    o0VarE.C(817951979);
                    f02.a.f67722a.getClass();
                    jC = f02.a.a(o0VarE);
                    o0VarE.g0(false);
                    break;
                case 9:
                    o0VarE.C(817954571);
                    f02.a.f67722a.getClass();
                    jC = f02.a.a(o0VarE);
                    o0VarE.g0(false);
                    break;
                case 10:
                    o0VarE.C(817957195);
                    f02.a.f67722a.getClass();
                    jC = f02.a.a(o0VarE);
                    o0VarE.g0(false);
                    break;
                default:
                    throw kg.f.h(o0VarE, 817933556, false);
            }
            d1Var.a(f198732b, i17, f15, j8, jC, o0VarE, 6, 0);
            String strQ = lVar.f166099a.f166038c;
            if (strQ == null) {
                o0VarE.C(-1062900135);
                strQ = gl1.y.Q(o0VarE, gVar2.f166074c);
                z14 = false;
            } else {
                z14 = false;
                o0VarE.C(-1062901530);
            }
            o0VarE.g0(z14);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            bVar.getClass();
            mh.c(strQ, u2Var.a(c2.l.C(aVar3, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            c2.j.d dVar = c2.j.f22693c;
            boolean zB = o0VarE.B(lVar3);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new wr1.d(lVar3, 18);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new wr1.d(lVar3, 18);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar4 = (e23.l) objQ2;
            if ((i16 & 7168) == 2048) {
                z14 = true;
            }
            boolean zR2 = o0VarE.r(lVar) | z14 | o0VarE.r(list);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new wn2.f(lVar2, 17, lVar, list);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new wn2.f(lVar2, 17, lVar, list);
                    o0VarE.K(objQ3);
                }
            }
            int i18 = i16 << 6;
            vq0.b.a(aVar3, dVar, 0, kVar, list, lVar4, (e23.l) objQ3, o0VarE, (i18 & 57344) | (i18 & 7168) | 54, 4);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) lVar, (Object) kVar, (Object) list, (o13.h) lVar2, i14, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x0154  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    /* JADX WARN: Code duplicated, block: B:50:0x017a  */
    /* JADX WARN: Code duplicated, block: B:51:0x017e  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0199  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0202  */
    /* JADX WARN: Code duplicated, block: B:71:0x020f  */
    /* JADX WARN: Code duplicated, block: B:73:0x021d  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0303  */
    /* JADX WARN: Code duplicated, block: B:83:0x0328  */
    /* JADX WARN: Code duplicated, block: B:85:0x032f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0341  */
    /* JADX WARN: Code duplicated, block: B:89:0x0343  */
    /* JADX WARN: Code duplicated, block: B:92:0x034f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0357  */
    /* JADX WARN: Code duplicated, block: B:96:0x035a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0386  */
    public static final void c(r rVar, e eVar, List list, e23.l lVar, p3.m mVar, int i14) {
        r rVar2;
        Context context;
        h5.g.a.f fVar;
        int i15;
        boolean z14;
        Object objQ;
        p3.m.a aVar;
        tq0.l lVar2;
        b0 b0Var;
        tq0.l lVar3;
        Context context2;
        j92.b bVar;
        float f14;
        float f15;
        r rVarA;
        boolean z15;
        int i16;
        float f16;
        o0 o0Var;
        r.a aVar2;
        d dVar;
        tq0.l lVar4;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        a0 a0Var;
        float f17;
        float f18;
        r rVarA2;
        a0 a0Var2;
        String strA;
        float f19;
        float f22;
        boolean zB;
        Object objQ2;
        int i17;
        int i18;
        Object objQ3;
        h4.g gVar;
        z0 z0VarD2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        eVar.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-2080425362);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i14 | 6 | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            r.a aVar3 = r.S;
            x1 x1Var = n.f135158a;
            Context context3 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            d dVar2 = new d();
            tq0.l lVar5 = eVar.f198743b;
            List<tq0.b> list2 = lVar5.f166099a.f166037b;
            float f24 = f198731a;
            r rVarB = x2.b(aVar3, 0.0f, f24, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
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
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                context = context3;
            } else {
                context = context3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var2 = b0.f22601a;
                tq0.k kVar2 = new tq0.k(lVar5.f166101c, lVar5.f166102d);
                i15 = i19 & 7168;
                if (i15 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z14) {
                    lVar2 = lVar5;
                } else {
                    aVar.getClass();
                    lVar2 = lVar5;
                    if (objQ == p3.m.a.f135155b) {
                    }
                    int i24 = i19 & 896;
                    b0Var = b0Var2;
                    lVar3 = lVar2;
                    context2 = context;
                    b(lVar3, kVar2, list, (e23.l) objQ, o0VarE, i24);
                    r rVarL = x2.l(x2.f(aVar3, 1.0f), f24);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f25 = eVar3.f97920e;
                    float f26 = eVar3.f97918c;
                    f14 = eVar3.f97920e;
                    f15 = f26;
                    rVarA = c2.l.A(rVarL, f25, 0.0f, 2);
                    if (eVar.f198742a) {
                        o0VarE.C(-1066680551);
                        gVar = h4.d.a.f81528f;
                        z0VarD2 = c2.q.d(gVar, false);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarA, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, z0VarD2, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        r rVarC4 = u.f22885a.c(aVar3, gVar);
                        bVar.getClass();
                        s0.b(rVarC4, j92.b.f97901d.f97906e, o0VarE, 0, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                        b0Var = b0Var;
                        i16 = 1;
                        f16 = f14;
                        o0Var = o0VarE;
                        aVar2 = aVar3;
                        dVar = dVar2;
                        f15 = f15;
                        lVar4 = lVar3;
                    } else {
                        z15 = false;
                        o0VarE.C(-1066398699);
                        if (eVar.f198745d) {
                            o0VarE.C(-1066365963);
                            z0VarD = c2.q.d(h4.d.a.f81528f, false);
                            iHashCode = Long.hashCode(o0VarE.U);
                            i2VarA0 = o0VarE.a0();
                            rVarC = h4.k.c(rVarA, o0VarE);
                            if (cVar != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar4);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar2, z0VarD, o0VarE);
                            b4.c(c1623g, i2VarA0, o0VarE);
                            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                            }
                            b4.c(fVar, rVarC, o0VarE);
                            u uVar = u.f22885a;
                            String strQ = gl1.y.Q(o0VarE, R.string.demographics_no_data_available);
                            d92.b.f58624b.getClass();
                            x0 x0Var = j92.f.f97932i;
                            gl.c.f77766a.getClass();
                            x0 x0VarA = x0.a(x0Var, gl.c.a(o0VarE).i(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            bVar.getClass();
                            f16 = f14;
                            aVar2 = aVar3;
                            dVar = dVar2;
                            i16 = 1;
                            mh.c(strQ, c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
                            o0Var = o0VarE;
                            o0Var.g0(true);
                            z15 = false;
                            o0Var.g0(false);
                            lVar4 = lVar3;
                        } else {
                            i16 = 1;
                            f16 = f14;
                            o0Var = o0VarE;
                            aVar2 = aVar3;
                            dVar = dVar2;
                            o0Var.C(-1065852200);
                            lVar4 = lVar3;
                            a(rVarA, eVar.f198744c, lVar4, o0Var, 0);
                            o0Var.g0(false);
                        }
                        o0Var.g0(z15);
                    }
                    r rVarF = x2.f(aVar2, 1.0f);
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    a0Var = b0Var;
                    r rVarB2 = a0Var.b(rVarF, aVar5);
                    bVar.getClass();
                    f17 = f15;
                    r rVarA3 = c2.l.A(rVarB2, 0.0f, f17, i16);
                    bVar.getClass();
                    f18 = f16;
                    rVarA2 = c2.l.A(rVarA3, f18, 0.0f, 2);
                    if (list2.size() > i16) {
                        o0Var.C(-1065345195);
                        c2.j.c cVar2 = c2.j.f22696f;
                        tq0.b bVar3 = (tq0.b) h0.e0(lVar4.f166100b, lVar4.f166099a.f166037b);
                        zB = o0Var.B(dVar) | o0Var.r(context2);
                        objQ2 = o0Var.q();
                        if (zB) {
                            objQ2 = new ot.c(22, context2, dVar);
                            o0Var.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new ot.c(22, context2, dVar);
                                o0Var.K(objQ2);
                            }
                        }
                        e23.l lVar6 = (e23.l) objQ2;
                        if (i15 == 2048) {
                            i17 = i16;
                        } else {
                            i17 = 0;
                        }
                        i18 = i17 | (o0Var.r(lVar4) ? 1 : 0);
                        objQ3 = o0Var.q();
                        if (i18 == 0) {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new x9.b(28, lVar, lVar4);
                                o0Var.K(objQ3);
                            }
                        } else {
                            objQ3 = new x9.b(28, lVar, lVar4);
                            o0Var.K(objQ3);
                        }
                        e23.l lVar7 = (e23.l) objQ3;
                        o0 o0Var2 = o0Var;
                        a0Var2 = a0Var;
                        vq0.b.a(rVarA2, cVar2, 0, bVar3, list2, lVar6, lVar7, o0Var2, 48, 4);
                        o0VarE = o0Var2;
                        o0VarE.g0(false);
                        f22 = f17;
                        f19 = f18;
                    } else {
                        a0Var2 = a0Var;
                        o0Var.C(-1064877622);
                        strA = d.a(context2, list2.get(0));
                        if (strA == null) {
                            strA = "";
                        }
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var);
                        d6.h.f57752b.getClass();
                        o0 o0Var3 = o0Var;
                        f19 = f18;
                        String str = strA;
                        f22 = f17;
                        mh.c(str, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var3, 0, 0, 130044);
                        o0VarE = o0Var3;
                        o0VarE.g0(false);
                    }
                    bVar.getClass();
                    bVar.getClass();
                    r rVarB3 = a0Var2.b(c2.l.z(aVar2, f19, f22), aVar5);
                    g6.f.a aVar6 = g6.f.f75994b;
                    v5.a((float) 0.5d, 48, 0, sn.a.c(o0VarE), rVarB3, o0VarE);
                    o0VarE.g0(true);
                    rVar2 = aVar2;
                }
                objQ = new wr1.d(lVar, 17);
                o0VarE.K(objQ);
                int i25 = i19 & 896;
                b0Var = b0Var2;
                lVar3 = lVar2;
                context2 = context;
                b(lVar3, kVar2, list, (e23.l) objQ, o0VarE, i25);
                r rVarL2 = x2.l(x2.f(aVar3, 1.0f), f24);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar4 = j92.b.f97899b;
                float f27 = eVar4.f97920e;
                float f28 = eVar4.f97918c;
                f14 = eVar4.f97920e;
                f15 = f28;
                rVarA = c2.l.A(rVarL2, f27, 0.0f, 2);
                if (eVar.f198742a) {
                    o0VarE.C(-1066680551);
                    gVar = h4.d.a.f81528f;
                    z0VarD2 = c2.q.d(gVar, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    r rVarC5 = u.f22885a.c(aVar3, gVar);
                    bVar.getClass();
                    s0.b(rVarC5, j92.b.f97901d.f97906e, o0VarE, 0, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                    b0Var = b0Var;
                    i16 = 1;
                    f16 = f14;
                    o0Var = o0VarE;
                    aVar2 = aVar3;
                    dVar = dVar2;
                    f15 = f15;
                    lVar4 = lVar3;
                } else {
                    z15 = false;
                    o0VarE.C(-1066398699);
                    if (eVar.f198745d) {
                        o0VarE.C(-1066365963);
                        z0VarD = c2.q.d(h4.d.a.f81528f, false);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarA, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, z0VarD, o0VarE);
                        b4.c(c1623g, i2VarA0, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, o0VarE);
                        u uVar2 = u.f22885a;
                        String strQ2 = gl1.y.Q(o0VarE, R.string.demographics_no_data_available);
                        d92.b.f58624b.getClass();
                        x0 x0Var2 = j92.f.f97932i;
                        gl.c.f77766a.getClass();
                        x0 x0VarA2 = x0.a(x0Var2, gl.c.a(o0VarE).i(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        bVar.getClass();
                        f16 = f14;
                        aVar2 = aVar3;
                        dVar = dVar2;
                        i16 = 1;
                        mh.c(strQ2, c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0VarE, 0, 0, 131068);
                        o0Var = o0VarE;
                        o0Var.g0(true);
                        z15 = false;
                        o0Var.g0(false);
                        lVar4 = lVar3;
                    } else {
                        i16 = 1;
                        f16 = f14;
                        o0Var = o0VarE;
                        aVar2 = aVar3;
                        dVar = dVar2;
                        o0Var.C(-1065852200);
                        lVar4 = lVar3;
                        a(rVarA, eVar.f198744c, lVar4, o0Var, 0);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z15);
                }
                r rVarF2 = x2.f(aVar2, 1.0f);
                h4.g.a aVar7 = h4.d.a.f81537o;
                a0Var = b0Var;
                r rVarB4 = a0Var.b(rVarF2, aVar7);
                bVar.getClass();
                f17 = f15;
                r rVarA4 = c2.l.A(rVarB4, 0.0f, f17, i16);
                bVar.getClass();
                f18 = f16;
                rVarA2 = c2.l.A(rVarA4, f18, 0.0f, 2);
                if (list2.size() > i16) {
                    o0Var.C(-1065345195);
                    c2.j.c cVar3 = c2.j.f22696f;
                    tq0.b bVar4 = (tq0.b) h0.e0(lVar4.f166100b, lVar4.f166099a.f166037b);
                    zB = o0Var.B(dVar) | o0Var.r(context2);
                    objQ2 = o0Var.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ot.c(22, context2, dVar);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new ot.c(22, context2, dVar);
                        o0Var.K(objQ2);
                    }
                    e23.l lVar8 = (e23.l) objQ2;
                    if (i15 == 2048) {
                        i17 = i16;
                    } else {
                        i17 = 0;
                    }
                    i18 = i17 | (o0Var.r(lVar4) ? 1 : 0);
                    objQ3 = o0Var.q();
                    if (i18 == 0) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new x9.b(28, lVar, lVar4);
                            o0Var.K(objQ3);
                        }
                    } else {
                        objQ3 = new x9.b(28, lVar, lVar4);
                        o0Var.K(objQ3);
                    }
                    e23.l lVar9 = (e23.l) objQ3;
                    o0 o0Var4 = o0Var;
                    a0Var2 = a0Var;
                    vq0.b.a(rVarA2, cVar3, 0, bVar4, list2, lVar8, lVar9, o0Var4, 48, 4);
                    o0VarE = o0Var4;
                    o0VarE.g0(false);
                    f22 = f17;
                    f19 = f18;
                } else {
                    a0Var2 = a0Var;
                    o0Var.C(-1064877622);
                    strA = d.a(context2, list2.get(0));
                    if (strA == null) {
                        strA = "";
                    }
                    d92.b.f58624b.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0Var);
                    d6.h.f57752b.getClass();
                    o0 o0Var5 = o0Var;
                    f19 = f18;
                    String str2 = strA;
                    f22 = f17;
                    mh.c(str2, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, o0Var5, 0, 0, 130044);
                    o0VarE = o0Var5;
                    o0VarE.g0(false);
                }
                bVar.getClass();
                bVar.getClass();
                r rVarB5 = a0Var2.b(c2.l.z(aVar2, f19, f22), aVar7);
                g6.f.a aVar8 = g6.f.f75994b;
                v5.a((float) 0.5d, 48, 0, sn.a.c(o0VarE), rVarB5, o0VarE);
                o0VarE.g0(true);
                rVar2 = aVar2;
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var3 = b0.f22601a;
            tq0.k kVar3 = new tq0.k(lVar5.f166101c, lVar5.f166102d);
            i15 = i19 & 7168;
            if (i15 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (z14) {
                aVar.getClass();
                lVar2 = lVar5;
                if (objQ == p3.m.a.f135155b) {
                }
                int i26 = i19 & 896;
                b0Var = b0Var3;
                lVar3 = lVar2;
                context2 = context;
                b(lVar3, kVar3, list, (e23.l) objQ, o0VarE, i26);
                r rVarL3 = x2.l(x2.f(aVar3, 1.0f), f24);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f29 = eVar5.f97920e;
                float f210 = eVar5.f97918c;
                f14 = eVar5.f97920e;
                f15 = f210;
                rVarA = c2.l.A(rVarL3, f29, 0.0f, 2);
                if (eVar.f198742a) {
                    o0VarE.C(-1066680551);
                    gVar = h4.d.a.f81528f;
                    z0VarD2 = c2.q.d(gVar, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    r rVarC6 = u.f22885a.c(aVar3, gVar);
                    bVar.getClass();
                    s0.b(rVarC6, j92.b.f97901d.f97906e, o0VarE, 0, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                    b0Var = b0Var;
                    i16 = 1;
                    f16 = f14;
                    o0Var = o0VarE;
                    aVar2 = aVar3;
                    dVar = dVar2;
                    f15 = f15;
                    lVar4 = lVar3;
                } else {
                    z15 = false;
                    o0VarE.C(-1066398699);
                    if (eVar.f198745d) {
                        o0VarE.C(-1066365963);
                        z0VarD = c2.q.d(h4.d.a.f81528f, false);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarA, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, z0VarD, o0VarE);
                        b4.c(c1623g, i2VarA0, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, o0VarE);
                        u uVar3 = u.f22885a;
                        String strQ3 = gl1.y.Q(o0VarE, R.string.demographics_no_data_available);
                        d92.b.f58624b.getClass();
                        x0 x0Var3 = j92.f.f97932i;
                        gl.c.f77766a.getClass();
                        x0 x0VarA3 = x0.a(x0Var3, gl.c.a(o0VarE).i(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        bVar.getClass();
                        f16 = f14;
                        aVar2 = aVar3;
                        dVar = dVar2;
                        i16 = 1;
                        mh.c(strQ3, c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA3, o0VarE, 0, 0, 131068);
                        o0Var = o0VarE;
                        o0Var.g0(true);
                        z15 = false;
                        o0Var.g0(false);
                        lVar4 = lVar3;
                    } else {
                        i16 = 1;
                        f16 = f14;
                        o0Var = o0VarE;
                        aVar2 = aVar3;
                        dVar = dVar2;
                        o0Var.C(-1065852200);
                        lVar4 = lVar3;
                        a(rVarA, eVar.f198744c, lVar4, o0Var, 0);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z15);
                }
                r rVarF3 = x2.f(aVar2, 1.0f);
                h4.g.a aVar9 = h4.d.a.f81537o;
                a0Var = b0Var;
                r rVarB6 = a0Var.b(rVarF3, aVar9);
                bVar.getClass();
                f17 = f15;
                r rVarA5 = c2.l.A(rVarB6, 0.0f, f17, i16);
                bVar.getClass();
                f18 = f16;
                rVarA2 = c2.l.A(rVarA5, f18, 0.0f, 2);
                if (list2.size() > i16) {
                    o0Var.C(-1065345195);
                    c2.j.c cVar4 = c2.j.f22696f;
                    tq0.b bVar5 = (tq0.b) h0.e0(lVar4.f166100b, lVar4.f166099a.f166037b);
                    zB = o0Var.B(dVar) | o0Var.r(context2);
                    objQ2 = o0Var.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ot.c(22, context2, dVar);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new ot.c(22, context2, dVar);
                        o0Var.K(objQ2);
                    }
                    e23.l lVar10 = (e23.l) objQ2;
                    if (i15 == 2048) {
                        i17 = i16;
                    } else {
                        i17 = 0;
                    }
                    i18 = i17 | (o0Var.r(lVar4) ? 1 : 0);
                    objQ3 = o0Var.q();
                    if (i18 == 0) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new x9.b(28, lVar, lVar4);
                            o0Var.K(objQ3);
                        }
                    } else {
                        objQ3 = new x9.b(28, lVar, lVar4);
                        o0Var.K(objQ3);
                    }
                    e23.l lVar11 = (e23.l) objQ3;
                    o0 o0Var6 = o0Var;
                    a0Var2 = a0Var;
                    vq0.b.a(rVarA2, cVar4, 0, bVar5, list2, lVar10, lVar11, o0Var6, 48, 4);
                    o0VarE = o0Var6;
                    o0VarE.g0(false);
                    f22 = f17;
                    f19 = f18;
                } else {
                    a0Var2 = a0Var;
                    o0Var.C(-1064877622);
                    strA = d.a(context2, list2.get(0));
                    if (strA == null) {
                        strA = "";
                    }
                    d92.b.f58624b.getClass();
                    x0 x0VarF3 = d92.c.f(j92.f.f97932i, o0Var);
                    d6.h.f57752b.getClass();
                    o0 o0Var7 = o0Var;
                    f19 = f18;
                    String str3 = strA;
                    f22 = f17;
                    mh.c(str3, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF3, o0Var7, 0, 0, 130044);
                    o0VarE = o0Var7;
                    o0VarE.g0(false);
                }
                bVar.getClass();
                bVar.getClass();
                r rVarB7 = a0Var2.b(c2.l.z(aVar2, f19, f22), aVar9);
                g6.f.a aVar10 = g6.f.f75994b;
                v5.a((float) 0.5d, 48, 0, sn.a.c(o0VarE), rVarB7, o0VarE);
                o0VarE.g0(true);
                rVar2 = aVar2;
            } else {
                lVar2 = lVar5;
            }
            objQ = new wr1.d(lVar, 17);
            o0VarE.K(objQ);
            int i27 = i19 & 896;
            b0Var = b0Var3;
            lVar3 = lVar2;
            context2 = context;
            b(lVar3, kVar3, list, (e23.l) objQ, o0VarE, i27);
            r rVarL4 = x2.l(x2.f(aVar3, 1.0f), f24);
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar6 = j92.b.f97899b;
            float f211 = eVar6.f97920e;
            float f212 = eVar6.f97918c;
            f14 = eVar6.f97920e;
            f15 = f212;
            rVarA = c2.l.A(rVarL4, f211, 0.0f, 2);
            if (eVar.f198742a) {
                o0VarE.C(-1066680551);
                gVar = h4.d.a.f81528f;
                z0VarD2 = c2.q.d(gVar, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                r rVarC7 = u.f22885a.c(aVar3, gVar);
                bVar.getClass();
                s0.b(rVarC7, j92.b.f97901d.f97906e, o0VarE, 0, 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
                b0Var = b0Var;
                i16 = 1;
                f16 = f14;
                o0Var = o0VarE;
                aVar2 = aVar3;
                dVar = dVar2;
                f15 = f15;
                lVar4 = lVar3;
            } else {
                z15 = false;
                o0VarE.C(-1066398699);
                if (eVar.f198745d) {
                    o0VarE.C(-1066365963);
                    z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    u uVar4 = u.f22885a;
                    String strQ4 = gl1.y.Q(o0VarE, R.string.demographics_no_data_available);
                    d92.b.f58624b.getClass();
                    x0 x0Var4 = j92.f.f97932i;
                    gl.c.f77766a.getClass();
                    x0 x0VarA4 = x0.a(x0Var4, gl.c.a(o0VarE).i(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    bVar.getClass();
                    f16 = f14;
                    aVar2 = aVar3;
                    dVar = dVar2;
                    i16 = 1;
                    mh.c(strQ4, c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA4, o0VarE, 0, 0, 131068);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    z15 = false;
                    o0Var.g0(false);
                    lVar4 = lVar3;
                } else {
                    i16 = 1;
                    f16 = f14;
                    o0Var = o0VarE;
                    aVar2 = aVar3;
                    dVar = dVar2;
                    o0Var.C(-1065852200);
                    lVar4 = lVar3;
                    a(rVarA, eVar.f198744c, lVar4, o0Var, 0);
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
            }
            r rVarF4 = x2.f(aVar2, 1.0f);
            h4.g.a aVar11 = h4.d.a.f81537o;
            a0Var = b0Var;
            r rVarB8 = a0Var.b(rVarF4, aVar11);
            bVar.getClass();
            f17 = f15;
            r rVarA6 = c2.l.A(rVarB8, 0.0f, f17, i16);
            bVar.getClass();
            f18 = f16;
            rVarA2 = c2.l.A(rVarA6, f18, 0.0f, 2);
            if (list2.size() > i16) {
                o0Var.C(-1065345195);
                c2.j.c cVar5 = c2.j.f22696f;
                tq0.b bVar6 = (tq0.b) h0.e0(lVar4.f166100b, lVar4.f166099a.f166037b);
                zB = o0Var.B(dVar) | o0Var.r(context2);
                objQ2 = o0Var.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ot.c(22, context2, dVar);
                        o0Var.K(objQ2);
                    }
                } else {
                    objQ2 = new ot.c(22, context2, dVar);
                    o0Var.K(objQ2);
                }
                e23.l lVar12 = (e23.l) objQ2;
                if (i15 == 2048) {
                    i17 = i16;
                } else {
                    i17 = 0;
                }
                i18 = i17 | (o0Var.r(lVar4) ? 1 : 0);
                objQ3 = o0Var.q();
                if (i18 == 0) {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new x9.b(28, lVar, lVar4);
                        o0Var.K(objQ3);
                    }
                } else {
                    objQ3 = new x9.b(28, lVar, lVar4);
                    o0Var.K(objQ3);
                }
                e23.l lVar13 = (e23.l) objQ3;
                o0 o0Var8 = o0Var;
                a0Var2 = a0Var;
                vq0.b.a(rVarA2, cVar5, 0, bVar6, list2, lVar12, lVar13, o0Var8, 48, 4);
                o0VarE = o0Var8;
                o0VarE.g0(false);
                f22 = f17;
                f19 = f18;
            } else {
                a0Var2 = a0Var;
                o0Var.C(-1064877622);
                strA = d.a(context2, list2.get(0));
                if (strA == null) {
                    strA = "";
                }
                d92.b.f58624b.getClass();
                x0 x0VarF4 = d92.c.f(j92.f.f97932i, o0Var);
                d6.h.f57752b.getClass();
                o0 o0Var9 = o0Var;
                f19 = f18;
                String str4 = strA;
                f22 = f17;
                mh.c(str4, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF4, o0Var9, 0, 0, 130044);
                o0VarE = o0Var9;
                o0VarE.g0(false);
            }
            bVar.getClass();
            bVar.getClass();
            r rVarB9 = a0Var2.b(c2.l.z(aVar2, f19, f22), aVar11);
            g6.f.a aVar12 = g6.f.f75994b;
            v5.a((float) 0.5d, 48, 0, sn.a.c(o0VarE), rVarB9, o0VarE);
            o0VarE.g0(true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(rVar2, eVar, list, lVar, i14, 10);
        }
    }
}
