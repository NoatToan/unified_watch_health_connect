package t42;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import h5.e0;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l72.f3;
import o72.h3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((l42.c) t7).getTimestampGmt(), ((l42.c) t14).getTimestampGmt());
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void a(q42.y r42, q42.d0 r43, l42.a r44, e23.a<p005kotlin.Unit> r45, p3.m r46, int r47) {
        /*
            Method dump skipped, instruction units count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t42.p.a(q42.y, q42.d0, l42.a, e23.a, p3.m, int):void");
    }

    public static final void b(String str, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1989799656);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarE = d92.c.e(j92.f.f97932i);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            float f16 = eVar.f97918c;
            bVar.getClass();
            g02.c.a(str, c2.l.B(aVar, f14, eVar.f97921f, f15, f16), 0L, null, 0, false, 0, x0VarE, 0.0d, o0VarE, i15 & 14, 380);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v128 */
    /* JADX WARN: Type inference failed for: r3v134 */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void c(List<l42.c> list, p3.m mVar, int i14) {
        String strP;
        Double dValueOf;
        ?? r14;
        ?? J;
        String str;
        double dB;
        Double bodyWater;
        Integer boneMass;
        Integer muscleMass;
        boolean z14;
        String str2;
        String strJ;
        String strJ2;
        boolean z15;
        String str3;
        String strP2;
        ?? E = mVar.E(1386248073);
        int i15 = (E.r(list) ? 4 : 2) | i14;
        ?? r15 = 1;
        ?? r16 = 0;
        if (E.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            new q42.h(context);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, E, 0);
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            h4.r rVarC = h4.k.c(aVar, E);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            ?? r17 = 0;
            if (E.f135177b == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar2);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            b0 b0Var = b0.f22601a;
            E.C(366661727);
            Iterator it = h0.G0(h0.N0(list, new a())).iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                l42.c cVar = (l42.c) next;
                if (cVar.m() > 0) {
                    E.C(-1133009463);
                    E.g0(r16);
                    strP = DateFormat.getTimeFormat(context).format(new Date(cVar.m()));
                } else {
                    E.C(-1132888811);
                    strP = gl1.y.P(R.string.lbl_weight_index, new Object[]{String.valueOf(i16)}, E);
                    E.g0(r16);
                }
                strP.getClass();
                b(strP, E, r16);
                Double weight = cVar.getWeight();
                String strB = q42.h.b(context, weight != null ? weight.doubleValue() : 0.0d);
                Double weightDelta = cVar.getWeightDelta();
                if (weightDelta == null) {
                    r14 = r17;
                } else {
                    l3.a aVar3 = l3.f23124b;
                    double dAbs = Math.abs(weightDelta.doubleValue());
                    aVar3.getClass();
                    dValueOf = Double.valueOf(k42.b.c(l3.a.P1(dAbs)));
                }
                if (r14 != 0) {
                    r14 = dValueOf;
                    double dDoubleValue = r14.doubleValue();
                    l3.f23124b.getClass();
                    J = k42.b.j(context, dDoubleValue, r15, l3.f23130h);
                } else {
                    r14 = dValueOf;
                    J = r17;
                }
                int iP = k42.b.p(cVar.getWeightDelta());
                if (iP == 2131232769) {
                    str = "↑";
                } else if (iP == 2131232767) {
                    str = "↓";
                } else {
                    str = iP == 2131232768 ? "→" : "";
                }
                String strO = k42.b.o(context, cVar.getWeightDelta(), J == 0 ? "" : J);
                b92.a.C0235a c0235a = new b92.a.C0235a(r17, r15, r17);
                String strQ = gl1.y.Q(E, R.string.lbl_delta_elevation);
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                String str4 = str;
                linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strQ);
                linkedHashMap.put("value", strO);
                b92.a aVarB = c0235a.b();
                ?? r18 = J;
                String strQ2 = gl1.y.Q(E, R.string.lbl_body_weight);
                b92.a.C0235a c0235a2 = new b92.a.C0235a(r17, r15, r17);
                String strQ3 = gl1.y.Q(E, R.string.lbl_body_weight);
                LinkedHashMap linkedHashMap2 = c0235a2.f16962a;
                linkedHashMap2.put(Constants.ScionAnalytics.PARAM_LABEL, strQ3);
                Object objQ = E.q();
                p3.m.f135153a.getClass();
                Object obj = p3.m.a.f135155b;
                if (objQ == obj) {
                    objQ = new t21.u(16);
                    E.K(objQ);
                }
                linkedHashMap2.put("value", oi0.c.B(strB, (e23.l) objQ, E));
                b92.a aVarB2 = c0235a2.b();
                int i18 = b92.a.f16960b;
                Iterator it3 = it;
                f3.a(strQ2, null, strB, aVarB2, null, E, 0, 18);
                if (r18 == 0) {
                    E.C(-1131123703);
                    E.g0(false);
                } else {
                    E.C(-1131123702);
                    f3.a(gl1.y.Q(E, R.string.lbl_delta_elevation), null, gl1.y.P(R.string.string_space_string_pattern, new Object[]{r18, str4}, E), aVarB, null, E, 0, 18);
                    Unit unit = Unit.INSTANCE;
                    E.g0(false);
                }
                Double bmi = cVar.getBmi();
                if (bmi != null) {
                    dB = bmi.doubleValue();
                } else {
                    l3.a aVar4 = l3.f23124b;
                    Double weight2 = cVar.getWeight();
                    double dDoubleValue2 = weight2 != null ? weight2.doubleValue() : 0.0d;
                    aVar4.getClass();
                    dB = k42.b.b(l3.a.P1(dDoubleValue2));
                }
                String strD = k42.b.d(Double.valueOf(dB), "", l3.f23138p);
                String strQ4 = gl1.y.Q(E, R.string.lbl_weight_characteristic_bmi);
                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                String strQ5 = gl1.y.Q(E, R.string.lbl_weight_characteristic_bmi);
                LinkedHashMap linkedHashMap3 = c0235a3.f16962a;
                linkedHashMap3.put(Constants.ScionAnalytics.PARAM_LABEL, strQ5);
                linkedHashMap3.put("value", strD);
                f3.a(strQ4, null, strD, c0235a3.b(), null, E, 0, 18);
                k42.b.f102880a.getClass();
                Double bodyFat = cVar.getBodyFat();
                if ((bodyFat == null || bodyFat.doubleValue() <= 0.0d || Double.isNaN(bodyFat.doubleValue())) && (((bodyWater = cVar.getBodyWater()) == null || bodyWater.doubleValue() <= 0.0d || Double.isNaN(bodyWater.doubleValue())) && (((boneMass = cVar.getBoneMass()) == null || boneMass.intValue() <= 0) && ((muscleMass = cVar.getMuscleMass()) == null || muscleMass.intValue() <= 0)))) {
                    E.C(-1126088899);
                    E.g0(false);
                } else {
                    E.C(-1129822384);
                    Double bodyFat2 = cVar.getBodyFat();
                    if (bodyFat2 == null || bodyFat2.doubleValue() <= 0.0d) {
                        z14 = false;
                        E.C(-1129793399);
                        E.g0(false);
                        str2 = null;
                    } else {
                        E.C(-1129730965);
                        String strG = k42.b.g(bodyFat2);
                        if (strG == null) {
                            E.C(-1129607679);
                            z14 = false;
                            E.g0(false);
                            strP2 = null;
                        } else {
                            z14 = false;
                            E.C(-1129607678);
                            strP2 = gl1.y.P(R.string.lbl_value_percent, new Object[]{strG}, E);
                            E.g0(false);
                        }
                        E.g0(z14);
                        str2 = strP2;
                    }
                    if (str2 == null) {
                        E.C(-1129477696);
                        E.g0(z14);
                    } else {
                        E.C(-1129477695);
                        String strQ6 = gl1.y.Q(E, R.string.lbl_body_fat);
                        b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                        String strQ7 = gl1.y.Q(E, R.string.lbl_body_fat);
                        LinkedHashMap linkedHashMap4 = c0235a4.f16962a;
                        linkedHashMap4.put(Constants.ScionAnalytics.PARAM_LABEL, strQ7);
                        linkedHashMap4.put("value", str2);
                        f3.a(strQ6, null, str2, c0235a4.b(), null, E, 0, 18);
                        Unit unit2 = Unit.INSTANCE;
                        E.g0(false);
                    }
                    Integer muscleMass2 = cVar.getMuscleMass();
                    if (muscleMass2 == null) {
                        strJ = null;
                    } else {
                        l3.a aVar5 = l3.f23124b;
                        double dIntValue = muscleMass2.intValue();
                        aVar5.getClass();
                        strJ = k42.b.j(context, k42.b.c(l3.a.P1(dIntValue)), true, l3.f23130h);
                    }
                    if (strJ == null) {
                        E.C(-1128321644);
                        E.g0(false);
                    } else {
                        E.C(-1128321643);
                        String strQ8 = gl1.y.Q(E, R.string.lbl_skeletal_muscle_mass);
                        b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                        String strQ9 = gl1.y.Q(E, R.string.lbl_skeletal_muscle_mass);
                        LinkedHashMap linkedHashMap5 = c0235a5.f16962a;
                        linkedHashMap5.put(Constants.ScionAnalytics.PARAM_LABEL, strQ9);
                        Object objQ2 = E.q();
                        if (objQ2 == obj) {
                            objQ2 = new t21.u(17);
                            E.K(objQ2);
                        }
                        linkedHashMap5.put("value", oi0.c.B(strJ, (e23.l) objQ2, E));
                        f3.a(strQ8, null, strJ, c0235a5.b(), null, E, 0, 18);
                        Unit unit3 = Unit.INSTANCE;
                        E.g0(false);
                    }
                    Integer boneMass2 = cVar.getBoneMass();
                    if (boneMass2 == null) {
                        strJ2 = null;
                    } else {
                        l3.a aVar6 = l3.f23124b;
                        double dIntValue2 = boneMass2.intValue();
                        aVar6.getClass();
                        strJ2 = k42.b.j(context, k42.b.c(l3.a.P1(dIntValue2)), true, l3.f23130h);
                    }
                    if (strJ2 == null) {
                        E.C(-1127104305);
                        z15 = false;
                        E.g0(false);
                    } else {
                        E.C(-1127104304);
                        String strQ10 = gl1.y.Q(E, R.string.lbl_weight_characteristic_bone_mass);
                        b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
                        String strQ11 = gl1.y.Q(E, R.string.lbl_weight_characteristic_bone_mass);
                        LinkedHashMap linkedHashMap6 = c0235a6.f16962a;
                        linkedHashMap6.put(Constants.ScionAnalytics.PARAM_LABEL, strQ11);
                        Object objQ3 = E.q();
                        if (objQ3 == obj) {
                            objQ3 = new t21.u(18);
                            E.K(objQ3);
                        }
                        linkedHashMap6.put("value", oi0.c.B(strJ2, (e23.l) objQ3, E));
                        f3.a(strQ10, null, strJ2, c0235a6.b(), null, E, 0, 18);
                        Unit unit4 = Unit.INSTANCE;
                        z15 = false;
                        E.g0(false);
                    }
                    String strG2 = k42.b.g(cVar.getBodyWater());
                    if (strG2 == null) {
                        E.C(-1126421158);
                        E.g0(z15);
                        str3 = null;
                    } else {
                        E.C(-1126421157);
                        String strP3 = gl1.y.P(R.string.lbl_value_percent, new Object[]{strG2}, E);
                        E.g0(z15);
                        str3 = strP3;
                    }
                    if (str3 == null) {
                        E.C(-1126283456);
                        E.g0(z15);
                    } else {
                        E.C(-1126283455);
                        f3.a(gl1.y.Q(E, R.string.lbl_body_water), null, str3, null, null, E, 0, 26);
                        Unit unit5 = Unit.INSTANCE;
                        z15 = false;
                        E.g0(false);
                    }
                    E.g0(z15);
                }
                h4.r.a aVar7 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar7, j92.b.f97899b.f97920e), E);
                it = it3;
                i16 = i17;
                r15 = 1;
                r16 = 0;
                r17 = 0;
            }
            E.g0(r16);
            E.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            E.e();
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 19);
        }
    }
}
