package yy1;

import android.content.Context;
import android.location.Location;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.s0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.room.a0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import cw1.v0;
import g02.b2;
import h5.e0;
import i3.bi;
import i3.e5;
import i3.i7;
import i3.mh;
import i3.si;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.t1;
import l72.c1;
import l72.p2;
import m4.g0;
import o4.d0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p006l2.a2;
import p13.h0;
import p13.j0;
import p13.u0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import v62.q5;
import w51.n0;
import ya0.f0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes10.dex */
public final class v {
    public static final void a(boolean z14, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        boolean z15;
        String strJ;
        String strJ2;
        e23.l<? super Boolean, Unit> lVar2 = lVar;
        o0 o0VarE = mVar.E(-2119065645);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 798984167, R.string.lbl_selected, o0VarE, false);
            } else {
                o0VarE.C(-1001248223);
                o0VarE.g0(false);
                strJ = "";
            }
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_yes);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ, ". ", strJ));
            b92.a aVarB = c0235a.b();
            p2 p2Var = p2.f111205a;
            z3.e eVarC = z3.f.c(-913903246, new rw0.g(z14, 22), o0VarE);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new f0(lVar2, 6);
                o0VarE.K(objQ);
            }
            int i16 = b92.a.f16960b;
            p2Var.g(strQ, null, aVarB, null, eVarC, false, false, (e23.a) objQ, o0VarE, 24576, 234);
            if (z14) {
                o0VarE.C(-1000400063);
                o0VarE.g0(false);
                strJ2 = "";
            } else {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 799011527, R.string.lbl_selected, o0VarE, false);
            }
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_no);
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            c0235a2.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ2, ". ", strJ2));
            b92.a aVarB2 = c0235a2.b();
            z15 = z14;
            z3.e eVarC2 = z3.f.c(-1243770533, new rw0.g(z15, 23), o0VarE);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new f0(lVar, 7);
                o0VarE.K(objQ2);
            }
            e23.a aVar3 = (e23.a) objQ2;
            lVar2 = lVar;
            p2Var.g(strQ2, null, aVarB2, null, eVarC2, false, false, aVar3, o0VarE, 24576, 234);
            o0VarE.g0(true);
        } else {
            z15 = z14;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c21.a(z15, lVar2, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    public static final void b(ArrayList arrayList, e23.l lVar, p3.m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(327685381);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
            }
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(h4.r.S, 400);
            boolean zR = o0VarE.r(arrayList2) | ((i15 & 112) == 32) | o0VarE.r(arrayList);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new wn2.f(arrayList2, 23, lVar, arrayList);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wn2.f(arrayList2, 23, lVar, arrayList);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarH, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 6, 510);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.y(i14, 5, lVar, arrayList);
        }
    }

    public static final void c(h4.r rVar, String str, String str2, a2 a2Var, a2.j jVar, boolean z14, boolean z15, e23.p pVar, p3.m mVar, int i14) {
        a2 a2Var2;
        a2.j jVar2;
        pVar.getClass();
        o0 o0VarE = mVar.E(1114449926);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | 27648 | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(pVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x5.v.f188954b.getClass();
            int i16 = x5.v.f188955c;
            x5.p.f188918b.getClass();
            a2 a2Var3 = new a2(0, (Boolean) null, i16, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar3 = (a2.j) objQ;
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            d92.b.f58623a.getClass();
            p3.v.a(u2.f201804a.c(new t2(d92.b.a(o0VarE).k().a(), d0.c(0.4f, d92.b.a(o0VarE).k().a(), 14), null)), z3.f.c(-1320272698, new j21.g(rVar, qVar, pVar, str, a2Var3, jVar3, str2, z14, z15), o0VarE), o0VarE, 56);
            a2Var2 = a2Var3;
            jVar2 = jVar3;
        } else {
            o0VarE.e();
            a2Var2 = a2Var;
            jVar2 = jVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.l(rVar, str, str2, a2Var2, jVar2, z14, z15, pVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0420  */
    /* JADX WARN: Code duplicated, block: B:159:0x0427  */
    /* JADX WARN: Code duplicated, block: B:160:0x042b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0446  */
    /* JADX WARN: Code duplicated, block: B:168:0x0458  */
    /* JADX WARN: Code duplicated, block: B:170:0x0466  */
    /* JADX WARN: Code duplicated, block: B:171:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:173:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:183:0x052d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0545  */
    /* JADX WARN: Code duplicated, block: B:188:0x0553  */
    /* JADX WARN: Code duplicated, block: B:194:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:198:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:201:0x060b  */
    /* JADX WARN: Code duplicated, block: B:204:0x064a  */
    /* JADX WARN: Code duplicated, block: B:209:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:211:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:212:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:219:0x06db  */
    /* JADX WARN: Code duplicated, block: B:221:0x079a  */
    /* JADX WARN: Code duplicated, block: B:223:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:226:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:228:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:230:0x080c  */
    /* JADX WARN: Code duplicated, block: B:236:0x082d  */
    /* JADX WARN: Code duplicated, block: B:256:0x088e  */
    /* JADX WARN: Code duplicated, block: B:258:0x089a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:264:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:280:0x0927  */
    /* JADX WARN: Code duplicated, block: B:282:0x0939  */
    /* JADX WARN: Code duplicated, block: B:284:0x0943  */
    /* JADX WARN: Code duplicated, block: B:285:0x0973  */
    /* JADX WARN: Code duplicated, block: B:287:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:288:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:293:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:296:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:298:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:303:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:305:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:307:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void d(AddTIEventViewModel addTIEventViewModel, boolean z14, int i14, int i15, boolean z15, e23.l lVar, e23.a aVar, p3.m mVar, int i16) {
        p3.c<?> cVar;
        int i17;
        p1 p1Var;
        p1 p1Var2;
        Object qVar;
        Context context;
        c.q qVar2;
        Object jVar;
        m4.q qVar3;
        o53.b0 b0Var;
        final p1 p1Var3;
        p1 p1Var4;
        p1 p1Var5;
        boolean z16;
        h5.g.a.f fVar;
        h4.r.a aVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        c.q qVar4;
        p1 p1Var6;
        final p1 p1Var7;
        o0 o0Var;
        boolean z17;
        Context context2;
        p1 p1Var8;
        p1 p1Var9;
        boolean z18;
        boolean z19;
        Object objQ;
        boolean z24;
        p1 p1Var10;
        p1 p1Var11;
        o0 o0Var2;
        boolean z25;
        boolean z26;
        Object objQ2;
        String str;
        j92.b bVar;
        j92.e eVar;
        h5.g.a.e eVar2;
        boolean zR;
        Object objQ3;
        boolean z27;
        boolean zR2;
        Object objQ4;
        o0 o0Var3;
        ky1.b bVar2;
        List<vo0.e> listB;
        boolean z28;
        vo0.f fVar2;
        Object objQ5;
        Context context3;
        boolean zR3;
        Object dVar;
        h5.g.a.b bVar3;
        int i18;
        Context context4;
        p1 p1Var12;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z29;
        boolean z34;
        boolean z35;
        DateTime dateTime;
        final AddTIEventViewModel addTIEventViewModel2 = addTIEventViewModel;
        addTIEventViewModel2.getClass();
        y0<ky1.b<vo0.f>> y0Var = addTIEventViewModel2.N2;
        o0 o0VarP = a0.p(lVar, aVar, mVar, 1722276717);
        p3.c<?> cVar2 = o0VarP.f135177b;
        int i19 = i16 | (o0VarP.r(addTIEventViewModel2) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.k(i14) ? 256 : 128) | (o0VarP.k(i15) ? 2048 : 1024) | (o0VarP.h(z15) ? 16384 : 8192) | (o0VarP.r(lVar) ? 131072 : 65536) | (o0VarP.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarP.n(i19 & 1, (599187 & i19) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context5 = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            m4.q qVar5 = (m4.q) o0VarP.A(t1.f91491i);
            p1 p1VarG = o53.f0.G((y0) addTIEventViewModel2.f46426o1.getValue(), o0VarP);
            p1 p1VarG2 = o53.f0.G(y0Var, o0VarP);
            p1 p1VarG3 = o53.f0.G((s0) addTIEventViewModel2.f46424n1.getValue(), o0VarP);
            p1 p1VarG4 = o53.f0.G((s0) addTIEventViewModel2.Q1.getValue(), o0VarP);
            p1 p1VarG5 = o53.f0.G(addTIEventViewModel2.R5(), o0VarP);
            Unit unit = Unit.INSTANCE;
            boolean zR4 = o0VarP.r(addTIEventViewModel2);
            Object objQ6 = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR4) {
                objQ6 = new n(addTIEventViewModel2, null);
                o0VarP.K(objQ6);
            } else {
                aVar3.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new n(addTIEventViewModel2, null);
                    o0VarP.K(objQ6);
                }
            }
            l0.e((e23.p) objQ6, unit, o0VarP);
            Object objQ7 = o0VarP.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ7 == c2565a) {
                objQ7 = l0.j(t13.h.f161748a, o0VarP);
                o0VarP.K(objQ7);
            }
            o53.b0 b0Var2 = (o53.b0) objQ7;
            int i24 = i19;
            Object objQ8 = o0VarP.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ8);
            }
            p1 p1Var13 = (p1) objQ8;
            Object objQ9 = o0VarP.q();
            if (objQ9 == c2565a) {
                objQ9 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ9);
            }
            p1 p1Var14 = (p1) objQ9;
            Object objQ10 = o0VarP.q();
            if (objQ10 == c2565a) {
                if (!addTIEventViewModel2.j6() || addTIEventViewModel2.C2) {
                    cVar = cVar2;
                    if (addTIEventViewModel2.C2) {
                        dateTime = addTIEventViewModel2.p5();
                    } else {
                        DateTime dateTimeP5 = addTIEventViewModel2.p5();
                        dateTime = dateTimeP5 != null ? new DateTime(dateTimeP5.withTimeAtStartOfDay().getMillis() + ((long) 28800000)) : null;
                    }
                } else if (addTIEventViewModel2.m6()) {
                    cVar = cVar2;
                    dateTime = new DateTime(new DateTime().getMillis() + ((long) DateTimeConstants.MILLIS_PER_HOUR));
                } else {
                    cVar = cVar2;
                }
                objQ10 = p0.n(dateTime);
                o0VarP.K(objQ10);
            } else {
                cVar = cVar2;
            }
            p1 p1Var15 = (p1) objQ10;
            Object objQ11 = o0VarP.q();
            if (objQ11 == c2565a) {
                objQ11 = p0.n((my1.g) p1VarG5.getF182175a());
                o0VarP.K(objQ11);
            }
            p1 p1Var16 = (p1) objQ11;
            Object objQ12 = o0VarP.q();
            if (objQ12 == c2565a) {
                if (addTIEventViewModel2.f46443w2) {
                    ww1.v vVar = addTIEventViewModel2.A2;
                    if (vVar != null) {
                        z34 = true;
                        if (vVar.f187881e) {
                        }
                        objQ12 = hb.a.n(z35, o0VarP);
                    }
                    z35 = false;
                    objQ12 = hb.a.n(z35, o0VarP);
                } else {
                    z34 = true;
                }
                z35 = z34;
                objQ12 = hb.a.n(z35, o0VarP);
            }
            p1 p1Var17 = (p1) objQ12;
            Object objQ13 = o0VarP.q();
            if (objQ13 == c2565a) {
                objQ13 = hb.a.n(a7.b.checkSelfPermission(context5, "android.permission.ACCESS_FINE_LOCATION") == 0, o0VarP);
            }
            p1 p1Var18 = (p1) objQ13;
            Object objQ14 = o0VarP.q();
            if (objQ14 == c2565a) {
                objQ14 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ14);
            }
            p1 p1Var19 = (p1) objQ14;
            boolean zM6 = addTIEventViewModel2.m6();
            boolean z36 = !zM6;
            String id3 = TimeZone.getDefault().getID();
            if (((my1.g) p1VarG4.getF182175a()) != null) {
                p1Var16.setValue((my1.g) p1VarG4.getF182175a());
                ((y0) addTIEventViewModel2.P1.getValue()).m(null);
            }
            g.g gVar = new g.g();
            boolean zR5 = o0VarP.r(b0Var2) | o0VarP.r(context5) | o0VarP.r(addTIEventViewModel2) | o0VarP.B(p1VarG5);
            Object objQ15 = o0VarP.q();
            if (zR5 || objQ15 == c2565a) {
                i17 = 0;
                objQ15 = new b82.l0(b0Var2, p1Var18, context5, addTIEventViewModel2, p1VarG5, p1Var16, p1Var13);
                b0Var2 = b0Var2;
                addTIEventViewModel2 = addTIEventViewModel2;
                p1Var = p1Var18;
                p1Var2 = p1Var16;
                o0VarP.K(objQ15);
            } else {
                p1Var = p1Var18;
                p1Var2 = p1Var16;
                i17 = 0;
            }
            c.q qVarC = c.w.c(gVar, (e23.l) objQ15, o0VarP, i17);
            if (addTIEventViewModel2.f46443w2) {
                o0VarP.C(669400597);
                my1.g gVar2 = (my1.g) p1VarG5.getF182175a();
                boolean zB = o0VarP.B(p1VarG5);
                Object objQ16 = o0VarP.q();
                if (zB || objQ16 == c2565a) {
                    objQ16 = new o(p1VarG5, p1Var2, null);
                    o0VarP.K(objQ16);
                }
                l0.e((e23.p) objQ16, gVar2, o0VarP);
                boolean zR6 = o0VarP.r(addTIEventViewModel2) | o0VarP.r(context5);
                Object objQ17 = o0VarP.q();
                if (zR6 || objQ17 == c2565a) {
                    objQ17 = new p(addTIEventViewModel2, context5, p1Var, null);
                    o0VarP.K(objQ17);
                }
                l0.e((e23.p) objQ17, unit, o0VarP);
                o0VarP.g0(false);
                qVar2 = qVarC;
                p1Var2 = p1Var2;
                context = context5;
                p1Var = p1Var;
            } else {
                o0VarP.C(670122990);
                boolean zR7 = o0VarP.r(context5) | o0VarP.r(addTIEventViewModel2) | o0VarP.r(qVarC);
                Object objQ18 = o0VarP.q();
                if (zR7 || objQ18 == c2565a) {
                    qVar = new q(context5, addTIEventViewModel, qVarC, p1Var, null);
                    context = context5;
                    addTIEventViewModel2 = addTIEventViewModel;
                    qVar2 = qVarC;
                    o0VarP.K(qVar);
                } else {
                    qVar2 = qVarC;
                    qVar = objQ18;
                    context = context5;
                }
                l0.e((e23.p) qVar, unit, o0VarP);
                o0VarP.g0(false);
            }
            boolean z37 = ((Boolean) p1Var13.getF182175a()).booleanValue() || addTIEventViewModel2.C2;
            boolean zR8 = o0VarP.r(addTIEventViewModel2) | ((3670016 & i24) == 1048576) | o0VarP.r(qVar5);
            Object objQ19 = o0VarP.q();
            if (zR8 || objQ19 == c2565a) {
                qVar3 = qVar5;
                p1 p1Var20 = p1Var2;
                b0Var = b0Var2;
                jVar = new ck0.j(addTIEventViewModel2, aVar, qVar3, p1Var13, p1Var20, p1Var15, 17);
                p1Var3 = p1Var13;
                p1Var4 = p1Var20;
                p1Var5 = p1Var15;
                o0VarP.K(jVar);
            } else {
                jVar = objQ19;
                qVar3 = qVar5;
                p1Var5 = p1Var15;
                p1Var4 = p1Var2;
                b0Var = b0Var2;
                p1Var3 = p1Var13;
            }
            c.w.a(0, 0, (e23.a) jVar, o0VarP, z37);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            p1 p1Var21 = p1Var4;
            z zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarP, 54);
            int iHashCode3 = Long.hashCode(o0VarP.getU());
            p1 p1Var22 = p1Var5;
            i2 i2VarA2 = o0VarP.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarP);
            h5.g.V.getClass();
            o53.b0 b0Var3 = b0Var;
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            p1 p1Var23 = p1VarG5;
            if (o0VarP.T) {
                o0VarP.M(aVar5);
            } else {
                o0VarP.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, o0VarP);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarP);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            c.q qVar6 = qVar2;
            if (o0VarP.T) {
                z16 = z36;
            } else {
                z16 = z36;
                if (!p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarP);
                aVar2 = aVar4;
                h4.r rVarB = u1.a2.b(b0.f22601a.a(x2.f(aVar4, 1.0f), 1.0f, true), u1.a2.a(o0VarP), true);
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
                iHashCode = Long.hashCode(o0VarP.getU());
                i2VarA0 = o0VarP.a0();
                rVarC = h4.k.c(rVarB, o0VarP);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarP.z();
                if (o0VarP.T) {
                    o0VarP.M(aVar5);
                } else {
                    o0VarP.c();
                }
                b4.c(eVar3, zVarA, o0VarP);
                b4.c(c1623g, i2VarA0, o0VarP);
                if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarP, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0VarP);
                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    eVar3 = eVar3;
                    i24 = i24;
                    aVar2 = aVar2;
                    p1Var23 = p1Var23;
                    qVar4 = qVar6;
                    o0VarP.C(-1798901983);
                    o0VarP.g0(false);
                } else {
                    o0VarP.C(-1799665978);
                    qVar3.y(true);
                    if (addTIEventViewModel2.f46443w2) {
                        o0VarP.C(-1799448203);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        qVar4 = qVar6;
                        b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, addTIEventViewModel2.f46445x2, gl1.y.Q(o0VarP, R.string.allows_up_to_date_weather_info), null, null, null, o0VarP, i24 & 8176, 448);
                        o0VarP = o0VarP;
                        z29 = false;
                        o0VarP.g0(false);
                    } else {
                        qVar4 = qVar6;
                        z29 = false;
                        o0VarP.C(-1798967765);
                        g(o0VarP, 0);
                        o0VarP.g0(false);
                    }
                    o0VarP.g0(z29);
                }
                if (addTIEventViewModel2.f46443w2 || ((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    p1Var6 = r22;
                    o0VarP.C(-1798681759);
                    o0VarP.g0(false);
                } else {
                    o0VarP.C(-1798816299);
                    boolean zBooleanValue = ((Boolean) r22.getF182175a()).booleanValue();
                    Object objQ20 = o0VarP.q();
                    if (objQ20 == c2565a) {
                        p1Var6 = p1Var17;
                        objQ20 = new xq1.c(p1Var6, 13);
                        o0VarP.K(objQ20);
                    } else {
                        p1Var6 = r22;
                    }
                    a(zBooleanValue, (e23.l) objQ20, o0VarP, 48);
                    o0VarP.g0(false);
                }
                if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                    o0VarP.C(-1798376595);
                    str = (String) p1VarG3.getF182175a();
                    if (str == null) {
                        str = "";
                    }
                    String strQ = gl1.y.Q(o0VarP, R.string.lbl_enter_group_location);
                    boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    eVar2 = eVar3;
                    h4.r rVarF = x2.f(c2.l.C(aVar2, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 1.0f);
                    zR = o0VarP.r(addTIEventViewModel2);
                    objQ3 = o0VarP.q();
                    if (zR || objQ3 == c2565a) {
                        final int i25 = 1;
                        objQ3 = new e23.l() { // from class: yy1.i
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                String title;
                                Double latitude;
                                switch (i25) {
                                    case 0:
                                        vo0.e eVar4 = (vo0.e) obj;
                                        eVar4.getClass();
                                        p1Var3.setValue(Boolean.FALSE);
                                        vo0.a address = eVar4.getAddress();
                                        if (address == null || (title = address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) {
                                            title = eVar4.getTitle();
                                        }
                                        AddTIEventViewModel addTIEventViewModel3 = addTIEventViewModel2;
                                        addTIEventViewModel3.J6(title);
                                        vo0.c cVar3 = eVar4.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String();
                                        if (cVar3 != null && (latitude = cVar3.getLatitude()) != null) {
                                            double dDoubleValue = latitude.doubleValue();
                                            Double longitude = cVar3.getLongitude();
                                            if (longitude != null) {
                                                com.garmin.android.library.mapsdkadapter.f fVar3 = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, longitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.d.GOOGLE);
                                                addTIEventViewModel3.I6(fVar3);
                                                addTIEventViewModel3.f46447y2 = title != null ? new o13.p<>(title, fVar3) : null;
                                                ge1.b.T(v1.a(addTIEventViewModel3), null, null, new mz1.o(addTIEventViewModel3, fVar3, null), 3);
                                            }
                                        }
                                        break;
                                    default:
                                        g0 g0Var = (g0) obj;
                                        g0Var.getClass();
                                        boolean zA = g0Var.a();
                                        p1 p1Var24 = p1Var3;
                                        if (zA) {
                                            p1Var24.setValue(Boolean.TRUE);
                                            addTIEventViewModel2.N2.m(null);
                                        } else {
                                            p1Var24.setValue(Boolean.FALSE);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarP.K(objQ3);
                    }
                    h4.r rVarB2 = m4.e.b(rVarF, (e23.l) objQ3);
                    z27 = z16;
                    zR2 = o0VarP.r(addTIEventViewModel2) | o0VarP.h(z27) | o0VarP.r(b0Var3);
                    objQ4 = o0VarP.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new x72.m(addTIEventViewModel2, z27, b0Var3, p1Var3);
                        o0VarP.K(objQ4);
                    }
                    o0Var3 = o0VarP;
                    c(rVarB2, str, strQ, null, null, zBooleanValue2, zM6, (e23.p) objQ4, o0Var3, 0);
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        h4.r rVarC4 = c2.l.C(ds.e0.g(o0Var3, -1796506613, aVar2, 1.0f, bVar), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                        context3 = context;
                        zR3 = o0Var3.r(b0Var3) | o0Var3.r(context3) | o0Var3.r(addTIEventViewModel2) | o0Var3.B(p1Var23) | o0Var3.r(qVar4);
                        Object objQ21 = o0Var3.q();
                        if (!zR3 || objQ21 == c2565a) {
                            bVar3 = bVar4;
                            i18 = 54;
                            p1 p1Var24 = p1Var3;
                            dVar = new av0.d(b0Var3, qVar4, p1Var, context3, addTIEventViewModel2, p1Var23, p1Var21, p1Var24);
                            context4 = context3;
                            p1Var12 = p1Var21;
                            p1Var3 = p1Var24;
                            o0Var3.K(dVar);
                        } else {
                            dVar = objQ21;
                            context4 = context3;
                            p1Var12 = p1Var21;
                            bVar3 = bVar4;
                            i18 = 54;
                        }
                        h4.r rVarD2 = u1.w.d(rVarC4, false, null, null, (e23.a) dVar, 15);
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0Var3, i18);
                        x1 x1Var2 = p3.n.f135158a;
                        iHashCode2 = Long.hashCode(o0Var3.getU());
                        i2VarA1 = o0Var3.a0();
                        rVarC2 = h4.k.c(rVarD2, o0Var3);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0Var3.z();
                        if (o0Var3.T) {
                            o0Var3.M(aVar5);
                        } else {
                            o0Var3.c();
                        }
                        b4.c(eVar2, s2VarA, o0Var3);
                        b4.c(c1623g, i2VarA1, o0Var3);
                        if (o0Var3.T || !p005kotlin.jvm.internal.s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                        }
                        b4.c(fVar, rVarC2, o0Var3);
                        c2.u2 u2Var = c2.u2.f22900a;
                        d6.h.f57752b.getClass();
                        int i26 = d6.h.f57757g;
                        String strQ2 = gl1.y.Q(o0Var3, R.string.use_my_current_location);
                        d92.b.f58624b.getClass();
                        x0 x0VarA = x0.a(j92.f.f97933j, hb.a.e(o0Var3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.h hVarA = d6.h.a(i26);
                        h4.r.a aVar6 = aVar2;
                        mh.c(strQ2, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0VarA, o0Var3, 0, 0, 130046);
                        r4.getClass();
                        c2.l.f(x2.u(aVar6, eVar.f97918c), o0Var3);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = q5.a(t62.b.f162798a);
                        long jA = d92.b.a(o0Var3).k().a();
                        r4.getClass();
                        j92.c cVar3 = j92.b.f97901d;
                        h4.r rVarU = x2.u(aVar6, cVar3.f97903b);
                        bVar.getClass();
                        context2 = context4;
                        p1Var7 = p1Var3;
                        p1Var8 = p1Var12;
                        i7.b(dVarA, null, x2.h(rVarU, cVar3.f97903b), jA, o0Var3, 48, 0);
                        o0Var = o0Var3;
                        z18 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        p1Var7 = p1Var3;
                        p1Var6 = p1Var6;
                        c2565a = c2565a;
                        o0Var = o0Var3;
                        z18 = true;
                        context2 = context;
                        p1Var8 = p1Var21;
                        o0Var.C(-1794701855);
                        o0Var.g0(false);
                    }
                    if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                        addTIEventViewModel2 = addTIEventViewModel;
                        z17 = zM6;
                        o0Var.C(-1794199903);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1794644846);
                        id3.getClass();
                        List list = (List) p1VarG.getF182175a();
                        DateTime dateTime2 = (DateTime) p1Var22.getF182175a();
                        my1.g gVar3 = (my1.g) p1Var8.getF182175a();
                        objQ5 = o0Var.q();
                        if (objQ5 == c2565a) {
                            objQ5 = new j10.q(p1Var22, p1Var8, 6);
                            o0Var.K(objQ5);
                        }
                        addTIEventViewModel2 = addTIEventViewModel;
                        z17 = zM6;
                        f(z17, addTIEventViewModel2, id3, list, dateTime2, gVar3, (e23.p) objQ5, o0Var, ((i24 << 3) & 112) | 1572864);
                        o0Var.g0(false);
                    }
                    bVar2 = (ky1.b) p1VarG2.getF182175a();
                    if (bVar2 != null || (fVar2 = (vo0.f) bVar2.f107775a) == null) {
                        listB = null;
                    } else {
                        listB = fVar2.b();
                    }
                    if (!((Boolean) p1Var7.getF182175a()).booleanValue() && listB != null && (listB.isEmpty() ^ z18) == z18) {
                        o0Var.C(-1793954135);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listB) {
                            if (((vo0.e) obj).getAddress() != null) {
                                arrayList.add(obj);
                            }
                        }
                        boolean zR9 = o0Var.r(addTIEventViewModel2);
                        Object objQ22 = o0Var.q();
                        if (zR9 || objQ22 == p3.m.a.f135155b) {
                            z28 = false;
                            final Object[] objArr = 0 == true ? 1 : 0;
                            objQ22 = new e23.l() { // from class: yy1.i
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    String title;
                                    Double latitude;
                                    switch (objArr) {
                                        case 0:
                                            vo0.e eVar4 = (vo0.e) obj2;
                                            eVar4.getClass();
                                            p1Var7.setValue(Boolean.FALSE);
                                            vo0.a address = eVar4.getAddress();
                                            if (address == null || (title = address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) {
                                                title = eVar4.getTitle();
                                            }
                                            AddTIEventViewModel addTIEventViewModel3 = addTIEventViewModel2;
                                            addTIEventViewModel3.J6(title);
                                            vo0.c cVar4 = eVar4.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String();
                                            if (cVar4 != null && (latitude = cVar4.getLatitude()) != null) {
                                                double dDoubleValue = latitude.doubleValue();
                                                Double longitude = cVar4.getLongitude();
                                                if (longitude != null) {
                                                    com.garmin.android.library.mapsdkadapter.f fVar3 = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, longitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.d.GOOGLE);
                                                    addTIEventViewModel3.I6(fVar3);
                                                    addTIEventViewModel3.f46447y2 = title != null ? new o13.p<>(title, fVar3) : null;
                                                    ge1.b.T(v1.a(addTIEventViewModel3), null, null, new mz1.o(addTIEventViewModel3, fVar3, null), 3);
                                                }
                                            }
                                            break;
                                        default:
                                            g0 g0Var = (g0) obj2;
                                            g0Var.getClass();
                                            boolean zA = g0Var.a();
                                            p1 p1Var25 = p1Var7;
                                            if (zA) {
                                                p1Var25.setValue(Boolean.TRUE);
                                                addTIEventViewModel2.N2.m(null);
                                            } else {
                                                p1Var25.setValue(Boolean.FALSE);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var.K(objQ22);
                        } else {
                            z28 = false;
                        }
                        b(arrayList, (e23.l) objQ22, o0Var, z28 ? 1 : 0);
                        o0Var.g0(z28);
                        p1Var9 = p1Var14;
                    } else if (((Boolean) p1Var7.getF182175a()).booleanValue() || listB == null || listB.isEmpty() != z18) {
                        p1Var9 = r21;
                        o0Var.C(-1792251615);
                        z28 = false;
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1792459749);
                        o0Var.g0(false);
                        y0Var.m(null);
                        p1Var9 = r21;
                        p1Var9.setValue(Boolean.TRUE);
                        p1Var7.setValue(Boolean.FALSE);
                        z28 = false;
                    }
                    o0Var.g0(z28);
                } else {
                    p1Var7 = p1Var3;
                    p1Var6 = p1Var6;
                    o0Var = o0VarP;
                    z17 = zM6;
                    context2 = context;
                    p1Var8 = p1Var21;
                    p1Var22 = p1Var22;
                    p1Var9 = r21;
                    z18 = true;
                    o0Var.C(-1792237727);
                    o0Var.g0(false);
                }
                p1Var19.setValue(Boolean.valueOf((addTIEventViewModel2.f46443w2 ? g22.n.d((String) p1VarG3.getF182175a()) || !z17 : g22.n.d((String) p1VarG3.getF182175a()) || !((Boolean) p1Var6.getF182175a()).booleanValue()) ? z18 : false));
                o0Var.g0(z18);
                if (z15) {
                    o0VarP = o0Var;
                    z19 = z18;
                    o0VarP.C(1800832651);
                    o0VarP.g0(false);
                } else {
                    o0Var.C(1799139369);
                    if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                        o0VarP = o0Var;
                        z19 = z18;
                        z24 = false;
                        o0VarP.C(1800822731);
                        o0VarP.g0(false);
                    } else {
                        o0Var.C(1799176538);
                        if (addTIEventViewModel2.f46443w2) {
                            o0Var.C(1799207042);
                            z3.e eVarC = z3.f.c(138379089, new ta0.g0(addTIEventViewModel2, lVar, p1Var19, p1Var8, p1Var22, p1Var6), o0Var);
                            o0 o0Var4 = o0Var;
                            z19 = z18;
                            b82.c.b(null, null, eVarC, null, 0L, o0Var4, 384, 27);
                            o0VarP = o0Var4;
                            z24 = false;
                            o0VarP.g0(false);
                        } else {
                            p1Var10 = p1Var22;
                            p1Var11 = p1Var8;
                            o0Var2 = o0Var;
                            z19 = z18;
                            o0Var2.C(1799924165);
                            l72.f0 f0Var = l72.f0.f110999a;
                            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            j92.b bVar5 = d92.b.f58625c;
                            bVar5.getClass();
                            j92.e eVar4 = j92.b.f97899b;
                            float f14 = eVar4.f97918c;
                            bVar5.getClass();
                            float f15 = eVar4.f97922g;
                            bVar5.getClass();
                            float f16 = eVar4.f97920e;
                            bVar5.getClass();
                            h4.r rVarB3 = c2.l.B(rVarF2, f16, f14, eVar4.f97920e, f15);
                            String strQ3 = gl1.y.Q(o0Var2, R.string.lbl_next);
                            boolean zBooleanValue3 = ((Boolean) p1Var19.getF182175a()).booleanValue();
                            boolean zR10 = o0Var2.r(addTIEventViewModel2);
                            if ((i24 & 458752) == 131072) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                            z26 = zR10 | z25;
                            objQ2 = o0Var2.q();
                            if (z26 || objQ2 == p3.m.a.f135155b) {
                                j jVar2 = new j(addTIEventViewModel2, lVar, p1Var11, p1Var10, p1Var6, 0);
                                o0Var2.K(jVar2);
                                objQ2 = jVar2;
                            }
                            f0Var.d(0, 1, (e23.a) objQ2, rVarB3, strQ3, o0Var2, null, zBooleanValue3);
                            o0VarP = o0Var2;
                            z24 = false;
                            o0VarP.g0(false);
                        }
                        o0VarP.g0(z24);
                    }
                    o0VarP.g0(z24);
                }
                if (((Boolean) p1Var9.getF182175a()).booleanValue()) {
                    o0VarP.C(1800876981);
                    p1Var9.setValue(Boolean.FALSE);
                    objQ = o0VarP.q();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yg2.l0(p1Var7, 13);
                        o0VarP.K(objQ);
                    }
                    o13.p pVar = new o13.p(context2.getString(R.string.lbl_ok), new n0((e23.a) objQ, 24));
                    c22.f fVar3 = c22.f.f23050a;
                    String string = context2.getString(R.string.update_location);
                    String string2 = context2.getString(R.string.enter_event_valid_location);
                    fVar3.getClass();
                    Context context6 = context2;
                    androidx.appcompat.app.e eVarB = c22.f.b(context6, string, string2, pVar, null, null, false);
                    eVarB.setOnShowListener(new c22.e(context6, 0));
                    eVarB.show();
                    o0VarP.g0(false);
                } else {
                    o0VarP.C(1801021131);
                    o0VarP.g0(false);
                }
                o0VarP.g0(z19);
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.A(iHashCode3, o0VarP, iHashCode3, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarP);
            aVar2 = aVar4;
            h4.r rVarB4 = u1.a2.b(b0.f22601a.a(x2.f(aVar4, 1.0f), 1.0f, true), u1.a2.a(o0VarP), true);
            zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
            iHashCode = Long.hashCode(o0VarP.getU());
            i2VarA0 = o0VarP.a0();
            rVarC = h4.k.c(rVarB4, o0VarP);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar5);
            } else {
                o0VarP.c();
            }
            b4.c(eVar3, zVarA, o0VarP);
            b4.c(c1623g, i2VarA0, o0VarP);
            if (o0VarP.T) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0VarP);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarP.C(-1799665978);
                qVar3.y(true);
                if (addTIEventViewModel2.f46443w2) {
                    o0VarP.C(-1799448203);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    qVar4 = qVar6;
                    b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, addTIEventViewModel2.f46445x2, gl1.y.Q(o0VarP, R.string.allows_up_to_date_weather_info), null, null, null, o0VarP, i24 & 8176, 448);
                    o0VarP = o0VarP;
                    z29 = false;
                    o0VarP.g0(false);
                } else {
                    qVar4 = qVar6;
                    z29 = false;
                    o0VarP.C(-1798967765);
                    g(o0VarP, 0);
                    o0VarP.g0(false);
                }
                o0VarP.g0(z29);
            } else {
                eVar3 = eVar3;
                i24 = i24;
                aVar2 = aVar2;
                p1Var23 = p1Var23;
                qVar4 = qVar6;
                o0VarP.C(-1798901983);
                o0VarP.g0(false);
            }
            if (addTIEventViewModel2.f46443w2) {
                p1Var6 = r22;
                o0VarP.C(-1798681759);
                o0VarP.g0(false);
            } else {
                p1Var6 = r22;
                o0VarP.C(-1798681759);
                o0VarP.g0(false);
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0VarP.C(-1798376595);
                str = (String) p1VarG3.getF182175a();
                if (str == null) {
                    str = "";
                }
                String strQ4 = gl1.y.Q(o0VarP, R.string.lbl_enter_group_location);
                boolean zBooleanValue4 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                eVar2 = eVar3;
                h4.r rVarF3 = x2.f(c2.l.C(aVar2, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 1.0f);
                zR = o0VarP.r(addTIEventViewModel2);
                objQ3 = o0VarP.q();
                if (zR) {
                    final int i27 = 1;
                    objQ3 = new e23.l() { // from class: yy1.i
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            String title;
                            Double latitude;
                            switch (i27) {
                                case 0:
                                    vo0.e eVar5 = (vo0.e) obj2;
                                    eVar5.getClass();
                                    p1Var3.setValue(Boolean.FALSE);
                                    vo0.a address = eVar5.getAddress();
                                    if (address == null || (title = address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) {
                                        title = eVar5.getTitle();
                                    }
                                    AddTIEventViewModel addTIEventViewModel3 = addTIEventViewModel2;
                                    addTIEventViewModel3.J6(title);
                                    vo0.c cVar4 = eVar5.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String();
                                    if (cVar4 != null && (latitude = cVar4.getLatitude()) != null) {
                                        double dDoubleValue = latitude.doubleValue();
                                        Double longitude = cVar4.getLongitude();
                                        if (longitude != null) {
                                            com.garmin.android.library.mapsdkadapter.f fVar4 = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, longitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.d.GOOGLE);
                                            addTIEventViewModel3.I6(fVar4);
                                            addTIEventViewModel3.f46447y2 = title != null ? new o13.p<>(title, fVar4) : null;
                                            ge1.b.T(v1.a(addTIEventViewModel3), null, null, new mz1.o(addTIEventViewModel3, fVar4, null), 3);
                                        }
                                    }
                                    break;
                                default:
                                    g0 g0Var = (g0) obj2;
                                    g0Var.getClass();
                                    boolean zA = g0Var.a();
                                    p1 p1Var25 = p1Var3;
                                    if (zA) {
                                        p1Var25.setValue(Boolean.TRUE);
                                        addTIEventViewModel2.N2.m(null);
                                    } else {
                                        p1Var25.setValue(Boolean.FALSE);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarP.K(objQ3);
                } else {
                    final int i28 = 1;
                    objQ3 = new e23.l() { // from class: yy1.i
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            String title;
                            Double latitude;
                            switch (i28) {
                                case 0:
                                    vo0.e eVar5 = (vo0.e) obj2;
                                    eVar5.getClass();
                                    p1Var3.setValue(Boolean.FALSE);
                                    vo0.a address = eVar5.getAddress();
                                    if (address == null || (title = address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) {
                                        title = eVar5.getTitle();
                                    }
                                    AddTIEventViewModel addTIEventViewModel3 = addTIEventViewModel2;
                                    addTIEventViewModel3.J6(title);
                                    vo0.c cVar4 = eVar5.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String();
                                    if (cVar4 != null && (latitude = cVar4.getLatitude()) != null) {
                                        double dDoubleValue = latitude.doubleValue();
                                        Double longitude = cVar4.getLongitude();
                                        if (longitude != null) {
                                            com.garmin.android.library.mapsdkadapter.f fVar4 = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, longitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.d.GOOGLE);
                                            addTIEventViewModel3.I6(fVar4);
                                            addTIEventViewModel3.f46447y2 = title != null ? new o13.p<>(title, fVar4) : null;
                                            ge1.b.T(v1.a(addTIEventViewModel3), null, null, new mz1.o(addTIEventViewModel3, fVar4, null), 3);
                                        }
                                    }
                                    break;
                                default:
                                    g0 g0Var = (g0) obj2;
                                    g0Var.getClass();
                                    boolean zA = g0Var.a();
                                    p1 p1Var25 = p1Var3;
                                    if (zA) {
                                        p1Var25.setValue(Boolean.TRUE);
                                        addTIEventViewModel2.N2.m(null);
                                    } else {
                                        p1Var25.setValue(Boolean.FALSE);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarP.K(objQ3);
                }
                h4.r rVarB5 = m4.e.b(rVarF3, (e23.l) objQ3);
                z27 = z16;
                zR2 = o0VarP.r(addTIEventViewModel2) | o0VarP.h(z27) | o0VarP.r(b0Var3);
                objQ4 = o0VarP.q();
                if (zR2) {
                    objQ4 = new x72.m(addTIEventViewModel2, z27, b0Var3, p1Var3);
                    o0VarP.K(objQ4);
                } else {
                    objQ4 = new x72.m(addTIEventViewModel2, z27, b0Var3, p1Var3);
                    o0VarP.K(objQ4);
                }
                o0Var3 = o0VarP;
                c(rVarB5, str, strQ4, null, null, zBooleanValue4, zM6, (e23.p) objQ4, o0Var3, 0);
                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    h4.r rVarC5 = c2.l.C(ds.e0.g(o0Var3, -1796506613, aVar2, 1.0f, bVar), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    context3 = context;
                    zR3 = o0Var3.r(b0Var3) | o0Var3.r(context3) | o0Var3.r(addTIEventViewModel2) | o0Var3.B(p1Var23) | o0Var3.r(qVar4);
                    Object objQ23 = o0Var3.q();
                    if (zR3) {
                        bVar3 = bVar4;
                        i18 = 54;
                        p1 p1Var25 = p1Var3;
                        dVar = new av0.d(b0Var3, qVar4, p1Var, context3, addTIEventViewModel2, p1Var23, p1Var21, p1Var25);
                        context4 = context3;
                        p1Var12 = p1Var21;
                        p1Var3 = p1Var25;
                        o0Var3.K(dVar);
                    } else {
                        bVar3 = bVar4;
                        i18 = 54;
                        p1 p1Var26 = p1Var3;
                        dVar = new av0.d(b0Var3, qVar4, p1Var, context3, addTIEventViewModel2, p1Var23, p1Var21, p1Var26);
                        context4 = context3;
                        p1Var12 = p1Var21;
                        p1Var3 = p1Var26;
                        o0Var3.K(dVar);
                    }
                    h4.r rVarD3 = u1.w.d(rVarC5, false, null, null, (e23.a) dVar, 15);
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0Var3, i18);
                    x1 x1Var4 = p3.n.f135158a;
                    iHashCode2 = Long.hashCode(o0Var3.getU());
                    i2VarA1 = o0Var3.a0();
                    rVarC2 = h4.k.c(rVarD3, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar5);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar2, s2VarA, o0Var3);
                    b4.c(c1623g, i2VarA1, o0Var3);
                    if (o0Var3.T) {
                        v.h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                    } else {
                        v.h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, o0Var3);
                    c2.u2 u2Var2 = c2.u2.f22900a;
                    d6.h.f57752b.getClass();
                    int i29 = d6.h.f57757g;
                    String strQ5 = gl1.y.Q(o0Var3, R.string.use_my_current_location);
                    d92.b.f58624b.getClass();
                    x0 x0VarA2 = x0.a(j92.f.f97933j, hb.a.e(o0Var3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h hVarA2 = d6.h.a(i29);
                    h4.r.a aVar7 = aVar2;
                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0VarA2, o0Var3, 0, 0, 130046);
                    r4.getClass();
                    c2.l.f(x2.u(aVar7, eVar.f97918c), o0Var3);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = q5.a(t62.b.f162798a);
                    long jA2 = d92.b.a(o0Var3).k().a();
                    r4.getClass();
                    j92.c cVar4 = j92.b.f97901d;
                    h4.r rVarU2 = x2.u(aVar7, cVar4.f97903b);
                    bVar.getClass();
                    context2 = context4;
                    p1Var7 = p1Var3;
                    p1Var8 = p1Var12;
                    i7.b(dVarA2, null, x2.h(rVarU2, cVar4.f97903b), jA2, o0Var3, 48, 0);
                    o0Var = o0Var3;
                    z18 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    p1Var7 = p1Var3;
                    p1Var6 = p1Var6;
                    c2565a = c2565a;
                    o0Var = o0Var3;
                    z18 = true;
                    context2 = context;
                    p1Var8 = p1Var21;
                    o0Var.C(-1794701855);
                    o0Var.g0(false);
                }
                if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                    o0Var.C(-1794644846);
                    id3.getClass();
                    List list2 = (List) p1VarG.getF182175a();
                    DateTime dateTime3 = (DateTime) p1Var22.getF182175a();
                    my1.g gVar4 = (my1.g) p1Var8.getF182175a();
                    objQ5 = o0Var.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new j10.q(p1Var22, p1Var8, 6);
                        o0Var.K(objQ5);
                    }
                    addTIEventViewModel2 = addTIEventViewModel;
                    z17 = zM6;
                    f(z17, addTIEventViewModel2, id3, list2, dateTime3, gVar4, (e23.p) objQ5, o0Var, ((i24 << 3) & 112) | 1572864);
                    o0Var.g0(false);
                } else {
                    addTIEventViewModel2 = addTIEventViewModel;
                    z17 = zM6;
                    o0Var.C(-1794199903);
                    o0Var.g0(false);
                }
                bVar2 = (ky1.b) p1VarG2.getF182175a();
                if (bVar2 != null) {
                    listB = null;
                } else {
                    listB = null;
                }
                if (!((Boolean) p1Var7.getF182175a()).booleanValue()) {
                    if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                        p1Var9 = r21;
                        o0Var.C(-1792251615);
                        z28 = false;
                        o0Var.g0(false);
                    } else {
                        p1Var9 = r21;
                        o0Var.C(-1792251615);
                        z28 = false;
                        o0Var.g0(false);
                    }
                } else if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                    p1Var9 = r21;
                    o0Var.C(-1792251615);
                    z28 = false;
                    o0Var.g0(false);
                } else {
                    p1Var9 = r21;
                    o0Var.C(-1792251615);
                    z28 = false;
                    o0Var.g0(false);
                }
                o0Var.g0(z28);
            } else {
                p1Var7 = p1Var3;
                p1Var6 = p1Var6;
                o0Var = o0VarP;
                z17 = zM6;
                context2 = context;
                p1Var8 = p1Var21;
                p1Var22 = p1Var22;
                p1Var9 = r21;
                z18 = true;
                o0Var.C(-1792237727);
                o0Var.g0(false);
            }
            p1Var19.setValue(Boolean.valueOf((addTIEventViewModel2.f46443w2 ? g22.n.d((String) p1VarG3.getF182175a()) || !z17 : g22.n.d((String) p1VarG3.getF182175a()) || !((Boolean) p1Var6.getF182175a()).booleanValue()) ? z18 : false));
            o0Var.g0(z18);
            if (z15) {
                o0Var.C(1799139369);
                if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                    o0Var.C(1799176538);
                    if (addTIEventViewModel2.f46443w2) {
                        o0Var.C(1799207042);
                        z3.e eVarC2 = z3.f.c(138379089, new ta0.g0(addTIEventViewModel2, lVar, p1Var19, p1Var8, p1Var22, p1Var6), o0Var);
                        o0 o0Var5 = o0Var;
                        z19 = z18;
                        b82.c.b(null, null, eVarC2, null, 0L, o0Var5, 384, 27);
                        o0VarP = o0Var5;
                        z24 = false;
                        o0VarP.g0(false);
                    } else {
                        p1Var10 = p1Var22;
                        p1Var11 = p1Var8;
                        o0Var2 = o0Var;
                        z19 = z18;
                        o0Var2.C(1799924165);
                        l72.f0 f0Var2 = l72.f0.f110999a;
                        h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        j92.b bVar6 = d92.b.f58625c;
                        bVar6.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        float f17 = eVar5.f97918c;
                        bVar6.getClass();
                        float f18 = eVar5.f97922g;
                        bVar6.getClass();
                        float f19 = eVar5.f97920e;
                        bVar6.getClass();
                        h4.r rVarB6 = c2.l.B(rVarF4, f19, f17, eVar5.f97920e, f18);
                        String strQ6 = gl1.y.Q(o0Var2, R.string.lbl_next);
                        boolean zBooleanValue5 = ((Boolean) p1Var19.getF182175a()).booleanValue();
                        boolean zR11 = o0Var2.r(addTIEventViewModel2);
                        if ((i24 & 458752) == 131072) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                        z26 = zR11 | z25;
                        objQ2 = o0Var2.q();
                        if (z26) {
                            j jVar3 = new j(addTIEventViewModel2, lVar, p1Var11, p1Var10, p1Var6, 0);
                            o0Var2.K(jVar3);
                            objQ2 = jVar3;
                        } else {
                            j jVar4 = new j(addTIEventViewModel2, lVar, p1Var11, p1Var10, p1Var6, 0);
                            o0Var2.K(jVar4);
                            objQ2 = jVar4;
                        }
                        f0Var2.d(0, 1, (e23.a) objQ2, rVarB6, strQ6, o0Var2, null, zBooleanValue5);
                        o0VarP = o0Var2;
                        z24 = false;
                        o0VarP.g0(false);
                    }
                    o0VarP.g0(z24);
                } else {
                    o0VarP = o0Var;
                    z19 = z18;
                    z24 = false;
                    o0VarP.C(1800822731);
                    o0VarP.g0(false);
                }
                o0VarP.g0(z24);
            } else {
                o0VarP = o0Var;
                z19 = z18;
                o0VarP.C(1800832651);
                o0VarP.g0(false);
            }
            if (((Boolean) p1Var9.getF182175a()).booleanValue()) {
                o0VarP.C(1800876981);
                p1Var9.setValue(Boolean.FALSE);
                objQ = o0VarP.q();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yg2.l0(p1Var7, 13);
                    o0VarP.K(objQ);
                }
                o13.p pVar2 = new o13.p(context2.getString(R.string.lbl_ok), new n0((e23.a) objQ, 24));
                c22.f fVar4 = c22.f.f23050a;
                String string3 = context2.getString(R.string.update_location);
                String string4 = context2.getString(R.string.enter_event_valid_location);
                fVar4.getClass();
                Context context7 = context2;
                androidx.appcompat.app.e eVarB2 = c22.f.b(context7, string3, string4, pVar2, null, null, false);
                eVarB2.setOnShowListener(new c22.e(context7, 0));
                eVarB2.show();
                o0VarP.g0(false);
            } else {
                o0VarP.C(1801021131);
                o0VarP.g0(false);
            }
            o0VarP.g0(z19);
            x1 x1Var5 = p3.n.f135158a;
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(addTIEventViewModel, z14, i14, i15, z15, lVar, aVar, i16);
        }
    }

    public static final void e(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0234  */
    /* JADX WARN: Code duplicated, block: B:164:0x0365  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(boolean z14, AddTIEventViewModel addTIEventViewModel, String str, List<my1.g> list, DateTime dateTime, my1.g gVar, e23.p<? super DateTime, ? super my1.g, Unit> pVar, p3.m mVar, int i14) {
        e23.p<? super DateTime, ? super my1.g, Unit> pVar2;
        int i15;
        int i16;
        int i17;
        Map mapL;
        List listB1;
        String str2;
        p1 p1Var;
        p1 p1Var2;
        String strC;
        Set setKeySet;
        Collection collectionValues;
        addTIEventViewModel.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-625208321);
        int i18 = (i14 & 6) == 0 ? (o0VarE.h(z14) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i18 |= o0VarE.r(addTIEventViewModel) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i18 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i18 |= o0VarE.r(dateTime) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i18 |= o0VarE.r(gVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            pVar2 = pVar;
            i18 |= o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            pVar2 = pVar;
        }
        if (o0VarE.n(i18 & 1, (599187 & i18) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.no_value);
            if (list != null) {
                Iterator<my1.g> it = list.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (p005kotlin.jvm.internal.s.g(it.next().getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String(), str)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                i15 = i19;
            } else {
                i15 = 0;
            }
            if (list != null) {
                strQ.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                for (my1.g gVar2 : list) {
                    lz1.b.f115398a.getClass();
                    arrayList2.add(Boolean.valueOf(arrayList.add(new o13.p(gVar2, lz1.b.a.a(gVar2)))));
                    i18 = i18;
                }
                i16 = i18;
                if (z14) {
                    i17 = 0;
                } else {
                    i17 = 0;
                    arrayList.add(0, new o13.p(null, strQ));
                }
                mapL = u0.l(arrayList);
            } else {
                i16 = i18;
                i17 = 0;
                mapL = null;
            }
            if (mapL == null || (collectionValues = mapL.values()) == null || (listB1 = h0.b1(collectionValues)) == null) {
                listB1 = j0.f134944a;
            }
            List list2 = listB1;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(i15, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(dateTime);
                o0VarE.K(objQ4);
            }
            p1 p1Var5 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(gVar == null ? (mapL == null || (setKeySet = mapL.keySet()) == null) ? null : (my1.g) h0.X(setKeySet, n1Var.getIntValue()) : gVar);
                o0VarE.K(objQ5);
            }
            p1 p1Var6 = (p1) objQ5;
            int i24 = i17;
            si siVarZ = bi.z(dateTime != null ? dateTime.getHourOfDay() : DateTime.now().getHourOfDay(), dateTime != null ? dateTime.getMinuteOfHour() : DateTime.now().getMinuteOfHour(), DateFormat.is24HourFormat(context), o0VarE, 0, 0);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                if (z14) {
                    c22.j0.f23099a.getClass();
                    strC = dateTime == null ? null : c22.j0.C(dateTime.getHourOfDay(), dateTime.getMinuteOfHour());
                    if (strC == null) {
                        strC = strQ;
                    }
                } else {
                    strC = strQ;
                }
                objQ6 = p0.n(strC);
                o0VarE.K(objQ6);
            }
            p1 p1Var7 = (p1) objQ6;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, i24);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            p2 p2Var = p2.f111205a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_start_time);
            String str3 = (String) p1Var7.getF182175a();
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new yg2.l0(p1Var3, 10);
                o0VarE.K(objQ7);
            }
            p2Var.h(strQ2, str3, null, rVarC2, null, false, false, null, null, null, (e23.a) objQ7, o0VarE, 0, 6, 1012);
            if (mapL != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapL.entrySet()) {
                    my1.g gVar3 = (my1.g) entry.getKey();
                    if (p005kotlin.jvm.internal.s.g(gVar3 != null ? gVar3.getUnitKey() : null, gVar != null ? gVar.getUnitKey() : null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection collectionValues2 = linkedHashMap.values();
                if (collectionValues2 != null) {
                    str2 = (String) h0.c0(collectionValues2);
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            String str4 = str2 == null ? (list2.isEmpty() || n1Var.getIntValue() <= -1 || n1Var.getIntValue() >= list2.size()) ? strQ : (String) list2.get(n1Var.getIntValue()) : str2;
            boolean zB = o0VarE.B(str4);
            Object objQ8 = o0VarE.q();
            if (zB || objQ8 == p3.m.a.f135155b) {
                objQ8 = new y01.k(str4, 11);
                o0VarE.K(objQ8);
            }
            int iO = zf.b.o((e23.l) objQ8, list2);
            p2 p2Var2 = p2.f111205a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.time_zone);
            Object objQ9 = o0VarE.q();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ9 == c2565a2) {
                objQ9 = new yg2.l0(p1Var4, 11);
                o0VarE.K(objQ9);
            }
            p2Var2.h(strQ3, str4, null, null, null, false, false, null, null, null, (e23.a) objQ9, o0VarE, 0, 6, 1020);
            o0 o0Var = o0VarE;
            if (addTIEventViewModel.f46443w2) {
                o0Var.C(457870168);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(aVar3, f14, eVar.f97916a, 0.0f, 0.0f, 12);
                String strQ4 = gl1.y.Q(o0Var, R.string.can_change_at_any_time);
                d92.b.f58624b.getClass();
                mh.c(strQ4, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(458188569);
                o0Var.g0(false);
            }
            String strQ5 = gl1.y.Q(o0Var, R.string.lbl_select_time);
            String strQ6 = gl1.y.Q(o0Var, R.string.common_button_ok);
            boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
            String strQ7 = gl1.y.Q(o0Var, R.string.common_cancel);
            Object objQ10 = o0Var.q();
            if (objQ10 == c2565a2) {
                objQ10 = new yg2.l0(p1Var3, 12);
                o0Var.K(objQ10);
            }
            e23.a aVar4 = (e23.a) objQ10;
            int i25 = i16 & 3670016;
            boolean zR = (i25 == 1048576) | o0Var.r(context);
            Object objQ11 = o0Var.q();
            if (zR || objQ11 == c2565a2) {
                p1Var = p1Var5;
                objQ11 = new ta0.g0(pVar2, context, p1Var3, p1Var, p1Var6, p1Var7, 24);
                o0Var.K(objQ11);
            } else {
                p1Var = p1Var5;
            }
            o0 o0Var2 = o0Var;
            g82.e.a(strQ5, siVarZ, zBooleanValue, strQ7, aVar4, strQ6, (e23.p) objQ11, o0Var2, 24576);
            o0VarE = o0Var2;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(459032637);
                c1 c1Var = c1.f110940a;
                String strQ8 = gl1.y.Q(o0VarE, R.string.time_zone);
                z3.e eVarC = z3.f.c(420545555, new vx1.a(list2, iO, n1Var, 23), o0VarE);
                String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_done);
                boolean zR2 = (i25 == 1048576) | o0VarE.r(mapL);
                Object objQ12 = o0VarE.q();
                if (zR2 || objQ12 == c2565a2) {
                    objQ12 = new p50.d(mapL, pVar, n1Var, p1Var, p1Var4);
                    p1Var2 = p1Var4;
                    o0VarE.K(objQ12);
                } else {
                    p1Var2 = p1Var4;
                }
                e23.a<Unit> aVar5 = (e23.a) objQ12;
                Object objQ13 = o0VarE.q();
                if (objQ13 == c2565a2) {
                    objQ13 = new yg2.l0(p1Var2, 14);
                    o0VarE.K(objQ13);
                }
                c1Var.a(true, strQ8, null, eVarC, null, strQ9, false, false, aVar5, null, (e23.a) objQ13, o0VarE, 3078, 6, 724);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(460597145);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.q(z14, addTIEventViewModel, str, list, dateTime, gVar, pVar, i14, 3);
        }
    }

    public static final void g(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(335459047);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = y.a(cVar, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.provide_more_details);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            d6.p.f57793b.getClass();
            int i16 = d6.p.f57795d;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, i16, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 384, 125948);
            o0Var = o0VarE;
            if (bo1.a.a().c().E0()) {
                o0Var.C(199719816);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                String strQ2 = gl1.y.Q(o0Var, R.string.information_provides_weather_forecast);
                fVar.getClass();
                mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0Var), o0Var, 0, 0, 130044);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(200003621);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yu1.a(i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:43:0x00ca->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r11.K5(r10, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(Context context, AddTIEventViewModel addTIEventViewModel, v13.c cVar) {
        u uVar;
        mv0.e eVar;
        Location location;
        AddTIEventViewModel addTIEventViewModel2;
        com.garmin.android.library.mapsdkadapter.f fVarC;
        String id3;
        List list;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f200196e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f200196e = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(cVar);
            }
        } else {
            uVar = new u(cVar);
        }
        Object objC = uVar.f200195d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f200196e;
        my1.g gVar = null;
        Object obj = null;
        if (i15 == 0) {
            o13.r.b(objC);
            mv0.e eVar2 = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
            j22.b.f96736a.getClass();
            if (j22.b.c(context) && eVar2.a("TILocationScreen")) {
                uVar.f200192a = addTIEventViewModel;
                uVar.f200193b = eVar2;
                uVar.f200196e = 1;
                Object objD = eVar2.d("TILocationScreen", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, uVar);
                if (objD != aVar) {
                    objC = objD;
                    eVar = eVar2;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            eVar = uVar.f200193b;
            addTIEventViewModel = uVar.f200192a;
            o13.r.b(objC);
        } else if (i15 == 2) {
            addTIEventViewModel2 = uVar.f200192a;
            o13.r.b(objC);
            location = (Location) objC;
            addTIEventViewModel = addTIEventViewModel2;
            if (location != null) {
                fVarC = com.garmin.android.library.mapsdkadapter.n.c(location);
            } else {
                fVarC = null;
            }
            if (fVarC != null) {
                uVar.f200192a = addTIEventViewModel;
                uVar.f200193b = null;
                uVar.f200194c = fVarC;
                uVar.f200196e = 3;
            }
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVarC = uVar.f200194c;
            addTIEventViewModel = uVar.f200192a;
            o13.r.b(objC);
        }
        addTIEventViewModel.I6(fVarC);
        addTIEventViewModel.m6();
        id3 = TimeZone.getDefault().getID();
        id3.getClass();
        list = (List) ((y0) addTIEventViewModel.f46426o1.getValue()).d();
        if (list != null) {
            for (Object obj2 : list) {
                if (p005kotlin.jvm.internal.s.g(((my1.g) obj2).getUnitKey(), id3)) {
                    obj = obj2;
                    break;
                }
            }
            gVar = (my1.g) obj;
        }
        addTIEventViewModel.M6(gVar);
        return Unit.INSTANCE;
        location = (Location) objC;
        if (location != null) {
            if (location != null) {
                fVarC = com.garmin.android.library.mapsdkadapter.n.c(location);
            } else {
                fVarC = null;
            }
            if (fVarC != null) {
                uVar.f200192a = addTIEventViewModel;
                uVar.f200193b = null;
                uVar.f200194c = fVarC;
                uVar.f200196e = 3;
            }
            addTIEventViewModel.I6(fVarC);
            addTIEventViewModel.m6();
            id3 = TimeZone.getDefault().getID();
            id3.getClass();
            list = (List) ((y0) addTIEventViewModel.f46426o1.getValue()).d();
            if (list != null) {
                while (r12.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((my1.g) obj2).getUnitKey(), id3)) {
                        obj = obj2;
                        break;
                    }
                }
                gVar = (my1.g) obj;
            }
            addTIEventViewModel.M6(gVar);
            return Unit.INSTANCE;
        }
        uVar.f200192a = addTIEventViewModel;
        uVar.f200193b = null;
        uVar.f200196e = 2;
        objC = eVar.c("TILocationScreen", uVar);
        if (objC != aVar) {
            addTIEventViewModel2 = addTIEventViewModel;
            location = (Location) objC;
            addTIEventViewModel = addTIEventViewModel2;
            if (location != null) {
                fVarC = com.garmin.android.library.mapsdkadapter.n.c(location);
            } else {
                fVarC = null;
            }
            if (fVarC != null) {
                uVar.f200192a = addTIEventViewModel;
                uVar.f200193b = null;
                uVar.f200194c = fVarC;
                uVar.f200196e = 3;
            }
            addTIEventViewModel.I6(fVarC);
            addTIEventViewModel.m6();
            id3 = TimeZone.getDefault().getID();
            id3.getClass();
            list = (List) ((y0) addTIEventViewModel.f46426o1.getValue()).d();
            if (list != null) {
                while (r12.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((my1.g) obj2).getUnitKey(), id3)) {
                        obj = obj2;
                        break;
                    }
                }
                gVar = (my1.g) obj;
            }
            addTIEventViewModel.M6(gVar);
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
