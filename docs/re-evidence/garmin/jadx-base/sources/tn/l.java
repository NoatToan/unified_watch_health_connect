package tn;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.t0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import l72.r1;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import t21.l0;
import u1.a2;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:110:0x02df  */
    /* JADX WARN: Code duplicated, block: B:122:0x034e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0398  */
    /* JADX WARN: Code duplicated, block: B:99:0x0268  */
    public static final void a(sn.h hVar, final e23.p<? super Integer, ? super List<? extends im.b>, Unit> pVar, p3.m mVar, int i14) {
        final e23.p<? super Integer, ? super List<? extends im.b>, Unit> pVar2;
        Throwable th3;
        boolean z14;
        im.b bVar;
        int seconds;
        Object next;
        Double avgValue;
        sn.h hVar2 = hVar;
        hVar2.getClass();
        o0 o0VarE = mVar.E(1948228473);
        int i15 = (i14 & 6) == 0 ? i14 | ((i14 & 8) == 0 ? o0VarE.B(hVar2) : o0VarE.r(hVar2) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final un.a aVar = new un.a(new l22.a(context));
            im.b bVarA = aVar.a(hVar2, "heartRate");
            bVarA.f94111b = 3;
            l22.b bVar2 = aVar.f172032a;
            final int i16 = 1;
            bVarA.f94112c = com.nimbusds.jose.shaded.gson.internal.a.h(bVar2.getString(R.string.lbl_heart_rate_cap), " (", bVar2.getString(R.string.lbl_bpm), ")");
            sn.g gVarM = hVar2.m();
            if (gVarM != null && (avgValue = gVarM.getAvgValue()) != null) {
                bVarA.f94126p = avgValue.doubleValue();
            }
            aVar.f172033b = bVarA;
            im.b bVarA2 = aVar.a(hVar2, "respiration");
            bVarA2.f94111b = 41;
            bVarA2.f94112c = bVar2.getString(R.string.activities_respiration_title);
            aVar.f172034c = bVarA2;
            im.b bVarA3 = aVar.a(hVar2, "stress");
            List<o20.a> list = bVarA3.f94122l;
            list.getClass();
            for (o20.a aVar2 : list) {
                if (Double.isNaN(aVar2.D())) {
                    aVar2.G(0.0d);
                }
            }
            bVarA3.f94111b = 43;
            bVarA3.f94112c = bVar2.getString(R.string.title_stress);
            aVar.f172035d = bVarA3;
            if (oc.b.y()) {
                im.b bVarA4 = aVar.a(hVar2, "spo2");
                List<o20.a> list2 = bVarA4.f94122l;
                list2.getClass();
                th3 = null;
                ArrayList<o20.a> arrayList = new ArrayList(list2);
                if (arrayList.isEmpty()) {
                    bVar = bVarA4;
                } else {
                    for (o20.a aVar3 : arrayList) {
                        if (aVar3.D() == 100.0d) {
                            aVar3.G(99.5d);
                        } else if (Double.isNaN(aVar3.D())) {
                            aVar3.G(Double.NEGATIVE_INFINITY);
                        }
                    }
                    DateTime dateTimeU = hVar2.u();
                    DateTime dateTimeK = hVar2.k();
                    if (dateTimeU == null || dateTimeK == null || arrayList.size() >= (seconds = Seconds.secondsBetween(dateTimeU, dateTimeK).getSeconds() + 1) || seconds < 0) {
                        bVar = bVarA4;
                    } else {
                        int i17 = 0;
                        while (true) {
                            double d14 = i17;
                            Iterator it = arrayList.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((o20.a) next).C() != d14);
                            if (next == null) {
                                arrayList.add(i17, new o20.a(d14, Double.NaN));
                            }
                            if (i17 == seconds) {
                                break;
                            }
                            i17++;
                            bVarA4 = bVarA4;
                        }
                        bVar = bVarA4;
                    }
                    bVar.k(arrayList);
                }
                bVar.f94111b = 55;
                bVar.f94112c = bVar2.getString(R.string.device_settings_pulse_ox);
                aVar.f172036e = bVar;
            } else {
                th3 = null;
            }
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strH = com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.lbl_heart_rate_cap), " (", context.getString(R.string.lbl_bpm), ")");
            wn.b.a aVar6 = wn.b.f186094a;
            un.b bVar4 = un.b.HEART_RATE;
            aVar6.getClass();
            wn.a aVarA = wn.b.a.a(context, bVar4);
            im.b bVar5 = aVar.f172033b;
            int i18 = i15 & 112;
            boolean zR = (i18 == 32) | o0VarE.r(aVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar7 = p3.m.f135153a;
            if (zR) {
                final int i19 = 0;
                objQ = new e23.a() { // from class: tn.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                pVar.invoke(3, aVar.b());
                                break;
                            case 1:
                                pVar.invoke(55, aVar.b());
                                break;
                            case 2:
                                pVar.invoke(41, aVar.b());
                                break;
                            default:
                                pVar.invoke(43, aVar.b());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar7.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final int i110 = 0;
                    objQ = new e23.a() { // from class: tn.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i110) {
                                case 0:
                                    pVar.invoke(3, aVar.b());
                                    break;
                                case 1:
                                    pVar.invoke(55, aVar.b());
                                    break;
                                case 2:
                                    pVar.invoke(41, aVar.b());
                                    break;
                                default:
                                    pVar.invoke(43, aVar.b());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            int i24 = sn.h.f160385q << 6;
            int i25 = (i15 << 6) & 896;
            pVar2 = pVar;
            vn.c.a(strH, aVarA, hVar2, bVar5, (e23.a) objQ, false, false, o0VarE, i24 | i25, 96);
            if (oc.b.y()) {
                o0VarE.C(1130287924);
                g6.f.a aVar8 = g6.f.f75994b;
                c2.l.f(x2.h(aVar4, 16), o0VarE);
                String strQ = gl1.y.Q(o0VarE, R.string.device_settings_pulse_ox);
                wn.a aVarA2 = wn.b.a.a(context, un.b.PULSE_OX);
                im.b bVar6 = aVar.f172036e;
                boolean zR2 = o0VarE.r(aVar) | (i18 == 32);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new e23.a() { // from class: tn.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    pVar2.invoke(3, aVar.b());
                                    break;
                                case 1:
                                    pVar2.invoke(55, aVar.b());
                                    break;
                                case 2:
                                    pVar2.invoke(41, aVar.b());
                                    break;
                                default:
                                    pVar2.invoke(43, aVar.b());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    aVar7.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e23.a() { // from class: tn.j
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        pVar2.invoke(3, aVar.b());
                                        break;
                                    case 1:
                                        pVar2.invoke(55, aVar.b());
                                        break;
                                    case 2:
                                        pVar2.invoke(41, aVar.b());
                                        break;
                                    default:
                                        pVar2.invoke(43, aVar.b());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    }
                }
                vn.c.a(strQ, aVarA2, hVar, bVar6, (e23.a) objQ2, false, false, o0VarE, i24 | 1572864 | i25, 32);
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(1130902003);
                o0VarE.g0(false);
            }
            float f14 = 16;
            g6.f.a aVar9 = g6.f.f75994b;
            c2.l.f(x2.h(aVar4, f14), o0VarE);
            String strH2 = com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.activities_respiration_title), " (", context.getString(R.string.activities_brpm_common_lbl), ")");
            wn.a aVarA3 = wn.b.a.a(context, un.b.RESPIRATION);
            boolean z15 = z14;
            im.b bVar7 = aVar.f172034c;
            boolean zR3 = (i18 == 32 ? true : z15) | o0VarE.r(aVar);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                final int i26 = 2;
                objQ3 = new e23.a() { // from class: tn.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                pVar2.invoke(3, aVar.b());
                                break;
                            case 1:
                                pVar2.invoke(55, aVar.b());
                                break;
                            case 2:
                                pVar2.invoke(41, aVar.b());
                                break;
                            default:
                                pVar2.invoke(43, aVar.b());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar7.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    final int i27 = 2;
                    objQ3 = new e23.a() { // from class: tn.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    pVar2.invoke(3, aVar.b());
                                    break;
                                case 1:
                                    pVar2.invoke(55, aVar.b());
                                    break;
                                case 2:
                                    pVar2.invoke(41, aVar.b());
                                    break;
                                default:
                                    pVar2.invoke(43, aVar.b());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            }
            int i28 = i24 | 1572864 | i25;
            vn.c.a(strH2, aVarA3, hVar, bVar7, (e23.a) objQ3, false, false, o0VarE, i28, 32);
            c2.l.f(x2.h(aVar4, f14), o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.title_stress);
            wn.a aVarA4 = wn.b.a.a(context, un.b.STRESS);
            im.b bVar8 = aVar.f172035d;
            boolean zR4 = o0VarE.r(aVar) | (i18 == 32 ? true : z15);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                final int i29 = 3;
                objQ4 = new e23.a() { // from class: tn.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i29) {
                            case 0:
                                pVar2.invoke(3, aVar.b());
                                break;
                            case 1:
                                pVar2.invoke(55, aVar.b());
                                break;
                            case 2:
                                pVar2.invoke(41, aVar.b());
                                break;
                            default:
                                pVar2.invoke(43, aVar.b());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            } else {
                aVar7.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    final int i210 = 3;
                    objQ4 = new e23.a() { // from class: tn.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    pVar2.invoke(3, aVar.b());
                                    break;
                                case 1:
                                    pVar2.invoke(55, aVar.b());
                                    break;
                                case 2:
                                    pVar2.invoke(41, aVar.b());
                                    break;
                                default:
                                    pVar2.invoke(43, aVar.b());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                }
            }
            hVar2 = hVar;
            vn.c.a(strQ2, aVarA4, hVar2, bVar8, (e23.a) objQ4, false, false, o0VarE, i28, 32);
            o0VarE.g0(true);
        } else {
            pVar2 = pVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(hVar2, pVar2, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0346  */
    /* JADX WARN: Code duplicated, block: B:102:0x0354  */
    /* JADX WARN: Code duplicated, block: B:104:0x036b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0377  */
    /* JADX WARN: Code duplicated, block: B:108:0x037f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0394  */
    /* JADX WARN: Code duplicated, block: B:112:0x0396  */
    /* JADX WARN: Code duplicated, block: B:114:0x0399  */
    /* JADX WARN: Code duplicated, block: B:115:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x03be  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:121:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0408  */
    /* JADX WARN: Code duplicated, block: B:127:0x0414  */
    /* JADX WARN: Code duplicated, block: B:128:0x0416  */
    /* JADX WARN: Code duplicated, block: B:130:0x0419  */
    /* JADX WARN: Code duplicated, block: B:131:0x0425  */
    /* JADX WARN: Code duplicated, block: B:134:0x0435  */
    /* JADX WARN: Code duplicated, block: B:137:0x045b  */
    /* JADX WARN: Code duplicated, block: B:138:0x047d  */
    /* JADX WARN: Code duplicated, block: B:141:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0225  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0303  */
    /* JADX WARN: Code duplicated, block: B:92:0x031e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0326  */
    /* JADX WARN: Code duplicated, block: B:98:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r4v19, types: [b82.t0] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v44 */
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
    public static final void b(sn.h hVar, e23.p pVar, sy.i iVar, p3.m mVar, int i14) {
        ?? r14;
        Object obj;
        p3.m.a.C2565a c2565a;
        h5.g.a.f fVar;
        b0 b0Var;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        String str;
        float f14;
        p3.m.a.C2565a c2565a2;
        String str2;
        ?? r15;
        boolean z14;
        String notes;
        Object objQ;
        Object obj2;
        p1 p1Var;
        ?? r16;
        Object objQ2;
        Object obj3;
        p1 p1Var2;
        ?? r17;
        String strJ;
        ?? r18;
        String strJ2;
        Object objQ3;
        Object obj4;
        sn.f deviceMetaData;
        ?? r19;
        DateTime dateTimeT;
        String string;
        DateTime dateTimeT2;
        String string2;
        o0 o0VarE = mVar.E(-1436595768);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            wn.c cVar2 = new wn.c((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            p1 p1VarA = s02.a.a(o0VarE);
            Object objQ4 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
            if (objQ4 == c2565a3) {
                obj = objQ4;
                Boolean bool = (Boolean) p1VarA.getF182175a();
                bool.getClass();
                c2 c2VarN = p0.n(bool);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            }
            obj = objQ4;
            p1 p1Var3 = (p1) obj;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            if (configuration.orientation == 2) {
                o0VarE.C(1725211748);
                h4.r rVarB = a2.b(x2.f(h4.r.S, 1.0f), a2.a(o0VarE), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA2 = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var2 = b0.f22601a;
                if (hVar != null) {
                    o0VarE.C(1034108510);
                    a(hVar, pVar, o0VarE, sn.h.f160385q | (i15 & 14) | (i15 & 112));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1034241128);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(false);
                r14 = o0VarE;
            } else {
                o0VarE.C(1725778490);
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarP = c2.l.p(a2.b(x2.f(aVar2, 1.0f), a2.a(o0VarE), true));
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81536n;
                z zVarA3 = y.a(kVar2, aVar3, o0VarE, 0);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarP, o0VarE);
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
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA3, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA2, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    c2565a = c2565a3;
                } else {
                    c2565a = c2565a3;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, o0VarE);
                    b0Var = b0.f22601a;
                    h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                    zVarA = y.a(kVar2, aVar3, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarE, o0VarE);
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
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    if (hVar != null || (dateTimeT2 = hVar.t()) == null || (string2 = dateTimeT2.toString("MMMM d, yyyy")) == null) {
                        str = "";
                    } else {
                        str = string2;
                    }
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    f14 = 16;
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarC4 = c2.l.C(rVarF, 0.0f, f14, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    c2565a2 = c2565a;
                    mh.c(str, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 130044);
                    if (hVar != null) {
                        dateTimeT = hVar.t();
                        if (dateTimeT != null) {
                            string = j0.r(cVar2.f186096a, dateTimeT);
                        } else {
                            string = cVar2.f186097b.getString(R.string.no_value);
                        }
                        str2 = string;
                    } else {
                        str2 = "";
                    }
                    fVar2.getClass();
                    mh.c(str2, c2.l.A(x2.f(aVar2, 1.0f), 0.0f, 8, 1), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, j92.f.f97935l, o0VarE, 48, 0, 130044);
                    r15 = o0VarE;
                    r15.g0(true);
                    if (hVar != null) {
                        r15.C(-87596326);
                        a(hVar, pVar, r15, sn.h.f160385q | (i15 & 14) | (i15 & 112));
                        notes = hVar.getNotes();
                        if (notes == null) {
                            notes = "";
                        }
                        objQ = r15.q();
                        obj2 = objQ;
                        if (objQ == c2565a2) {
                            c2 c2VarN2 = p0.n(notes);
                            r15.K(c2VarN2);
                            obj2 = c2VarN2;
                        }
                        p1Var = (p1) obj2;
                        if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                            p1Var3.setValue(Boolean.TRUE);
                        } else {
                            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                p1Var3.setValue(Boolean.FALSE);
                                r16 = 0;
                                r16 = 0;
                                qVar.y(false);
                                if (!notes.equals((String) p1Var.getF182175a())) {
                                    iVar.invoke((String) p1Var.getF182175a());
                                }
                            }
                            objQ2 = r15.q();
                            obj3 = objQ2;
                            if (objQ2 == c2565a2) {
                                c2 c2VarN3 = p0.n("");
                                r15.K(c2VarN3);
                                obj3 = c2VarN3;
                            }
                            p1Var2 = (p1) obj3;
                            if (((String) p1Var.getF182175a()).length() == 0) {
                                r17 = 1;
                            } else {
                                r17 = r16;
                            }
                            if (r17 != 0) {
                                r15.C(-86926387);
                                r15.g0(r16);
                                strJ = "";
                            } else {
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(r15, -2803762, R.string.activity_summary_activity_notes, r15, r16);
                            }
                            p1Var2.setValue(strJ);
                            if (((String) p1Var2.getF182175a()).length() > 0) {
                                r18 = 1;
                            } else {
                                r18 = r16;
                            }
                            if (r18 != 0) {
                                r15.C(-86805144);
                                r1.b((String) p1Var2.getF182175a(), null, r15, r16, 2);
                                r15.g0(r16);
                            } else {
                                r15.C(-86726063);
                                c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), r15);
                                r15.g0(r16);
                            }
                            ?? r24 = t0.f16792a;
                            String str3 = (String) p1Var.getF182175a();
                            if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                                if (((String) p1Var.getF182175a()).length() == 0) {
                                    r19 = 1;
                                } else {
                                    r19 = r16;
                                }
                                if (r19 != 0) {
                                    r15.C(-86483955);
                                    r15.g0(r16);
                                    strJ2 = "";
                                } else {
                                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                                }
                            } else {
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                            }
                            objQ3 = r15.q();
                            obj4 = objQ3;
                            if (objQ3 == c2565a2) {
                                sk0.n nVar = new sk0.n(p1Var, 10);
                                r15.K(nVar);
                                obj4 = nVar;
                            }
                            z14 = r16 == true ? 1 : 0;
                            r24.b(str3, null, null, strJ2, 0, 0, null, (e23.l) obj4, r15, 100687872, 230);
                            deviceMetaData = hVar.getDeviceMetaData();
                            if (deviceMetaData != null) {
                                r15.C(-86123175);
                                r1.b(gl1.y.Q(r15, R.string.lbl_device), z3.f.c(-2025672120, new i(deviceMetaData, z14 ? 1 : 0), r15), r15, 48, z14 ? 1 : 0);
                                r15.g0(z14);
                            } else {
                                r15.C(-84531759);
                                r15.g0(z14);
                            }
                            i7.a(n5.c.a(R.drawable.ic_device_rotation, r15, z14 ? 1 : 0), gl1.y.Q(r15, R.string.default_image_view_content_description), b0Var.b(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, f14, 0.0f, 24, 5), h4.d.a.f81537o), 0L, r15, 0, 8);
                            r15.g0(z14);
                        }
                        r16 = 0;
                        objQ2 = r15.q();
                        obj3 = objQ2;
                        if (objQ2 == c2565a2) {
                            c2 c2VarN4 = p0.n("");
                            r15.K(c2VarN4);
                            obj3 = c2VarN4;
                        }
                        p1Var2 = (p1) obj3;
                        if (((String) p1Var.getF182175a()).length() == 0) {
                            r17 = 1;
                        } else {
                            r17 = r16;
                        }
                        if (r17 != 0) {
                            r15.C(-86926387);
                            r15.g0(r16);
                            strJ = "";
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(r15, -2803762, R.string.activity_summary_activity_notes, r15, r16);
                        }
                        p1Var2.setValue(strJ);
                        if (((String) p1Var2.getF182175a()).length() > 0) {
                            r18 = 1;
                        } else {
                            r18 = r16;
                        }
                        if (r18 != 0) {
                            r15.C(-86805144);
                            r1.b((String) p1Var2.getF182175a(), null, r15, r16, 2);
                            r15.g0(r16);
                        } else {
                            r15.C(-86726063);
                            c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), r15);
                            r15.g0(r16);
                        }
                        ?? r25 = t0.f16792a;
                        String str4 = (String) p1Var.getF182175a();
                        if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                        } else {
                            if (((String) p1Var.getF182175a()).length() == 0) {
                                r19 = 1;
                            } else {
                                r19 = r16;
                            }
                            if (r19 != 0) {
                                r15.C(-86483955);
                                r15.g0(r16);
                                strJ2 = "";
                            } else {
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                            }
                        }
                        objQ3 = r15.q();
                        obj4 = objQ3;
                        if (objQ3 == c2565a2) {
                            sk0.n nVar2 = new sk0.n(p1Var, 10);
                            r15.K(nVar2);
                            obj4 = nVar2;
                        }
                        z14 = r16 == true ? 1 : 0;
                        r25.b(str4, null, null, strJ2, 0, 0, null, (e23.l) obj4, r15, 100687872, 230);
                        deviceMetaData = hVar.getDeviceMetaData();
                        if (deviceMetaData != null) {
                            r15.C(-86123175);
                            r1.b(gl1.y.Q(r15, R.string.lbl_device), z3.f.c(-2025672120, new i(deviceMetaData, z14 ? 1 : 0), r15), r15, 48, z14 ? 1 : 0);
                            r15.g0(z14);
                        } else {
                            r15.C(-84531759);
                            r15.g0(z14);
                        }
                        i7.a(n5.c.a(R.drawable.ic_device_rotation, r15, z14 ? 1 : 0), gl1.y.Q(r15, R.string.default_image_view_content_description), b0Var.b(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, f14, 0.0f, 24, 5), h4.d.a.f81537o), 0L, r15, 0, 8);
                        r15.g0(z14);
                    } else {
                        z14 = false;
                        r15.C(-84006991);
                        r15.g0(false);
                    }
                    r15.g0(true);
                    r15.g0(z14);
                    r14 = r15;
                }
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0Var = b0.f22601a;
                h4.r rVarE2 = u1.n.e(x2.f(aVar2, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                zVarA = y.a(kVar2, aVar3, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE2, o0VarE);
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
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                if (hVar != null) {
                    str = "";
                } else {
                    str = "";
                }
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r rVarF2 = x2.f(aVar2, 1.0f);
                f14 = 16;
                g6.f.a aVar6 = g6.f.f75994b;
                h4.r rVarC5 = c2.l.C(rVarF2, 0.0f, f14, 0.0f, 0.0f, 13);
                d6.h.f57752b.getClass();
                int i17 = d6.h.f57755e;
                c2565a2 = c2565a;
                mh.c(str, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 48, 0, 130044);
                if (hVar != null) {
                    dateTimeT = hVar.t();
                    if (dateTimeT != null) {
                        string = j0.r(cVar2.f186096a, dateTimeT);
                    } else {
                        string = cVar2.f186097b.getString(R.string.no_value);
                    }
                    str2 = string;
                } else {
                    str2 = "";
                }
                fVar3.getClass();
                mh.c(str2, c2.l.A(x2.f(aVar2, 1.0f), 0.0f, 8, 1), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, j92.f.f97935l, o0VarE, 48, 0, 130044);
                r15 = o0VarE;
                r15.g0(true);
                if (hVar != null) {
                    r15.C(-87596326);
                    a(hVar, pVar, r15, sn.h.f160385q | (i15 & 14) | (i15 & 112));
                    notes = hVar.getNotes();
                    if (notes == null) {
                        notes = "";
                    }
                    objQ = r15.q();
                    obj2 = objQ;
                    if (objQ == c2565a2) {
                        c2 c2VarN5 = p0.n(notes);
                        r15.K(c2VarN5);
                        obj2 = c2VarN5;
                    }
                    p1Var = (p1) obj2;
                    if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                        p1Var3.setValue(Boolean.TRUE);
                    } else {
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            p1Var3.setValue(Boolean.FALSE);
                            r16 = 0;
                            r16 = 0;
                            qVar.y(false);
                            if (!notes.equals((String) p1Var.getF182175a())) {
                                iVar.invoke((String) p1Var.getF182175a());
                            }
                        }
                        objQ2 = r15.q();
                        obj3 = objQ2;
                        if (objQ2 == c2565a2) {
                            c2 c2VarN6 = p0.n("");
                            r15.K(c2VarN6);
                            obj3 = c2VarN6;
                        }
                        p1Var2 = (p1) obj3;
                        if (((String) p1Var.getF182175a()).length() == 0) {
                            r17 = 1;
                        } else {
                            r17 = r16;
                        }
                        if (r17 != 0) {
                            r15.C(-86926387);
                            r15.g0(r16);
                            strJ = "";
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(r15, -2803762, R.string.activity_summary_activity_notes, r15, r16);
                        }
                        p1Var2.setValue(strJ);
                        if (((String) p1Var2.getF182175a()).length() > 0) {
                            r18 = 1;
                        } else {
                            r18 = r16;
                        }
                        if (r18 != 0) {
                            r15.C(-86805144);
                            r1.b((String) p1Var2.getF182175a(), null, r15, r16, 2);
                            r15.g0(r16);
                        } else {
                            r15.C(-86726063);
                            c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), r15);
                            r15.g0(r16);
                        }
                        ?? r26 = t0.f16792a;
                        String str5 = (String) p1Var.getF182175a();
                        if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                        } else {
                            if (((String) p1Var.getF182175a()).length() == 0) {
                                r19 = 1;
                            } else {
                                r19 = r16;
                            }
                            if (r19 != 0) {
                                r15.C(-86483955);
                                r15.g0(r16);
                                strJ2 = "";
                            } else {
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                            }
                        }
                        objQ3 = r15.q();
                        obj4 = objQ3;
                        if (objQ3 == c2565a2) {
                            sk0.n nVar3 = new sk0.n(p1Var, 10);
                            r15.K(nVar3);
                            obj4 = nVar3;
                        }
                        z14 = r16 == true ? 1 : 0;
                        r26.b(str5, null, null, strJ2, 0, 0, null, (e23.l) obj4, r15, 100687872, 230);
                        deviceMetaData = hVar.getDeviceMetaData();
                        if (deviceMetaData != null) {
                            r15.C(-86123175);
                            r1.b(gl1.y.Q(r15, R.string.lbl_device), z3.f.c(-2025672120, new i(deviceMetaData, z14 ? 1 : 0), r15), r15, 48, z14 ? 1 : 0);
                            r15.g0(z14);
                        } else {
                            r15.C(-84531759);
                            r15.g0(z14);
                        }
                        i7.a(n5.c.a(R.drawable.ic_device_rotation, r15, z14 ? 1 : 0), gl1.y.Q(r15, R.string.default_image_view_content_description), b0Var.b(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, f14, 0.0f, 24, 5), h4.d.a.f81537o), 0L, r15, 0, 8);
                        r15.g0(z14);
                    }
                    r16 = 0;
                    objQ2 = r15.q();
                    obj3 = objQ2;
                    if (objQ2 == c2565a2) {
                        c2 c2VarN7 = p0.n("");
                        r15.K(c2VarN7);
                        obj3 = c2VarN7;
                    }
                    p1Var2 = (p1) obj3;
                    if (((String) p1Var.getF182175a()).length() == 0) {
                        r17 = 1;
                    } else {
                        r17 = r16;
                    }
                    if (r17 != 0) {
                        r15.C(-86926387);
                        r15.g0(r16);
                        strJ = "";
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(r15, -2803762, R.string.activity_summary_activity_notes, r15, r16);
                    }
                    p1Var2.setValue(strJ);
                    if (((String) p1Var2.getF182175a()).length() > 0) {
                        r18 = 1;
                    } else {
                        r18 = r16;
                    }
                    if (r18 != 0) {
                        r15.C(-86805144);
                        r1.b((String) p1Var2.getF182175a(), null, r15, r16, 2);
                        r15.g0(r16);
                    } else {
                        r15.C(-86726063);
                        c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), r15);
                        r15.g0(r16);
                    }
                    ?? r27 = t0.f16792a;
                    String str6 = (String) p1Var.getF182175a();
                    if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                    } else {
                        if (((String) p1Var.getF182175a()).length() == 0) {
                            r19 = 1;
                        } else {
                            r19 = r16;
                        }
                        if (r19 != 0) {
                            r15.C(-86483955);
                            r15.g0(r16);
                            strJ2 = "";
                        } else {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r15, -2789508, R.string.mct_add_notes, r15, r16);
                        }
                    }
                    objQ3 = r15.q();
                    obj4 = objQ3;
                    if (objQ3 == c2565a2) {
                        sk0.n nVar4 = new sk0.n(p1Var, 10);
                        r15.K(nVar4);
                        obj4 = nVar4;
                    }
                    z14 = r16 == true ? 1 : 0;
                    r27.b(str6, null, null, strJ2, 0, 0, null, (e23.l) obj4, r15, 100687872, 230);
                    deviceMetaData = hVar.getDeviceMetaData();
                    if (deviceMetaData != null) {
                        r15.C(-86123175);
                        r1.b(gl1.y.Q(r15, R.string.lbl_device), z3.f.c(-2025672120, new i(deviceMetaData, z14 ? 1 : 0), r15), r15, 48, z14 ? 1 : 0);
                        r15.g0(z14);
                    } else {
                        r15.C(-84531759);
                        r15.g0(z14);
                    }
                    i7.a(n5.c.a(R.drawable.ic_device_rotation, r15, z14 ? 1 : 0), gl1.y.Q(r15, R.string.default_image_view_content_description), b0Var.b(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, f14, 0.0f, 24, 5), h4.d.a.f81537o), 0L, r15, 0, 8);
                    r15.g0(z14);
                } else {
                    z14 = false;
                    r15.C(-84006991);
                    r15.g0(false);
                }
                r15.g0(true);
                r15.g0(z14);
                r14 = r15;
            }
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(hVar, pVar, iVar, i14, 6);
        }
    }
}
