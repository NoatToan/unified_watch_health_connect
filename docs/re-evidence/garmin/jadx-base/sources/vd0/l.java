package vd0;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.roomorama.caldroid.CaldroidFragment;
import i3.fe;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(oe0.d dVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, p3.m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1446204022);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192) | (o0VarE.r(aVar5) ? 131072 : 65536) | (o0VarE.r(aVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            oe0.a aVar7 = (oe0.a) s9.c.c(dVar.f131260e, o0VarE).getF182175a();
            boolean z14 = (i15 & 14) == 4 || o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new vc0.v(dVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vc0.v(dVar, 1);
                    o0VarE.K(objQ);
                }
            }
            int i16 = i15 << 3;
            int i17 = i15 << 6;
            b(aVar7, dVar, aVar, aVar2, (e23.a) objQ, aVar3, aVar4, aVar5, aVar6, o0VarE, (i17 & 234881024) | (i16 & 7168) | (i16 & 112) | 64 | (i16 & 896) | (458752 & i17) | (3670016 & i17) | (29360128 & i17));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k((androidx.lifecycle.u1) dVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, i14, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r28v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r9v3, types: [p3.m] */
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
    public static final void b(oe0.a aVar, final oe0.d dVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, final e23.a aVar5, final e23.a aVar6, final e23.a aVar7, final e23.a aVar8, p3.m mVar, int i14) {
        int i15;
        ?? r28;
        Object obj;
        boolean z14;
        int i16;
        p3.p1 p1Var;
        ?? r14;
        ?? r15;
        ?? r16;
        int i17;
        boolean z15;
        p3.o0 o0Var;
        Object obj2;
        Object obj3;
        Object obj4;
        p3.o0 o0VarE = mVar.E(995464033);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar5) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar7) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(aVar8) ? 67108864 : 33554432;
        }
        ?? r34 = 1;
        r34 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            final boolean z16 = am.j.z(f12.l.f68084a);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final p3.p1 p1VarC = s9.c.c(dVar.f131262g, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                Boolean boolValueOf = Boolean.valueOf(bo1.a.a().c().E());
                o0VarE.K(boolValueOf);
                obj = boolValueOf;
            }
            obj = objQ;
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            Object obj5 = objQ2;
            if (objQ2 == c2565a) {
                v10.a aVar9 = new v10.a(14);
                o0VarE.K(aVar9);
                obj5 = aVar9;
            }
            final p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr, (e23.a) obj5, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ3 = o0VarE.q();
            Object obj6 = objQ3;
            if (objQ3 == c2565a) {
                v10.a aVar10 = new v10.a(15);
                o0VarE.K(aVar10);
                obj6 = aVar10;
            }
            p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr2, (e23.a) obj6, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ4 = o0VarE.q();
            Object obj7 = objQ4;
            if (objQ4 == c2565a) {
                v10.a aVar11 = new v10.a(16);
                o0VarE.K(aVar11);
                obj7 = aVar11;
            }
            p3.p1 p1Var4 = (p3.p1) d4.a.e(objArr3, (e23.a) obj7, o0VarE, 48);
            Object objQ5 = o0VarE.q();
            Object objF = objQ5;
            if (objQ5 == c2565a) {
                objF = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objF;
            Object objQ6 = o0VarE.q();
            Object obj8 = objQ6;
            if (objQ6 == c2565a) {
                o53.b0 b0VarJ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(b0VarJ);
                obj8 = b0VarJ;
            }
            o53.b0 b0Var = (o53.b0) obj8;
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.u8);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
            i53.c<pe0.d> cVar = ((pe0.c) p1VarC.getF182175a()).f137408c;
            ArrayList arrayList = new ArrayList();
            Iterator<pe0.d> it = cVar.iterator();
            while (it.hasNext()) {
                pe0.d next = it.next();
                Iterator<pe0.d> it3 = it;
                p3.p1 p1Var5 = p1Var4;
                if (next.f137416a != 1) {
                    arrayList.add(next);
                }
                it = it3;
                p1Var4 = p1Var5;
            }
            p3.p1 p1Var6 = p1Var4;
            boolean z17 = !arrayList.isEmpty() && ((pe0.c) p1VarC.getF182175a()).f137407b == null;
            if (aVar.f131248b) {
                o0VarE.C(-878910571);
                Unit unit = Unit.INSTANCE;
                boolean z18 = (i15 & 7168) == 2048;
                Object objQ7 = o0VarE.q();
                if (z18 || objQ7 == p3.m.a.f135155b) {
                    obj4 = objQ7;
                    g gVar = new g(aVar3, null);
                    o0VarE.K(gVar);
                    obj4 = gVar;
                }
                obj4 = objQ7;
                p3.l0.e((e23.p) obj4, unit, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-878837535);
                o0VarE.g0(false);
            }
            if (aVar.f131249c) {
                o0VarE.C(-878793856);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_unable_to_save);
                String strQ3 = gl1.y.Q(o0VarE, R.string.msg_sorry_something_went_wrong);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
                int i18 = 57344 & i15;
                boolean z19 = i18 == 16384;
                Object objQ8 = o0VarE.q();
                if (z19 || objQ8 == p3.m.a.f135155b) {
                    obj2 = objQ8;
                    ux1.g gVar2 = new ux1.g(aVar4, 7);
                    o0VarE.K(gVar2);
                    obj2 = gVar2;
                }
                obj2 = objQ8;
                e23.a<Unit> aVar12 = (e23.a) obj2;
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                boolean z24 = i18 == 16384;
                Object objQ9 = o0VarE.q();
                if (z24 || objQ9 == p3.m.a.f135155b) {
                    obj3 = objQ9;
                    ux1.g gVar3 = new ux1.g(aVar4, 8);
                    o0VarE.K(gVar3);
                    obj3 = gVar3;
                }
                obj3 = objQ9;
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar12, strQ5, (e23.a) obj3, o0VarE, 0, 0, 217);
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(-878331615);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(-878256316);
                Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_sex);
                String[] strArr = {gl1.y.Q(o0VarE, R.string.gender_not_specified), gl1.y.Q(o0VarE, R.string.lbl_gender_female), gl1.y.Q(o0VarE, R.string.lbl_gender_male)};
                String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_done);
                String str = ((pe0.c) p1VarC.getF182175a()).f137409d;
                i16 = i15;
                if (p005kotlin.jvm.internal.s.g(str, je0.g.FEMALE.f98524a)) {
                    i17 = 1;
                } else {
                    i17 = p005kotlin.jvm.internal.s.g(str, je0.g.MALE.f98524a) ? 2 : 0;
                }
                Unit unit2 = Unit.INSTANCE;
                boolean zR = ((i16 & 112) == 32 || ((i16 & 64) != 0 && o0VarE.r(dVar))) | o0VarE.r(context2) | o0VarE.B(strQ6) | o0VarE.r(strArr) | o0VarE.k(i17) | o0VarE.B(strQ7) | o0VarE.B(strQ8) | o0VarE.B(p1Var3);
                Object objQ10 = o0VarE.q();
                if (zR || objQ10 == p3.m.a.f135155b) {
                    p3.o0 o0Var2 = o0VarE;
                    z15 = false;
                    j jVar = new j(context2, strQ6, strArr, i17, strQ7, strQ8, dVar, p1Var3, null);
                    p1Var = p1Var3;
                    o0Var2.K(jVar);
                    objQ10 = jVar;
                    o0Var = o0Var2;
                } else {
                    o0Var = o0VarE;
                    p1Var = p1Var3;
                    z15 = false;
                }
                p3.l0.e((e23.p) objQ10, unit2, o0Var);
                o0Var.g0(z15);
                r15 = o0Var;
                r14 = z15;
            } else {
                p3.o0 o0Var3 = o0VarE;
                i16 = i15;
                p1Var = p1Var3;
                boolean z25 = z14;
                o0Var3.C(-876783103);
                o0Var3.g0(z25);
                r15 = o0Var3;
                r14 = z25;
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                r15.C(-876711245);
                Context context3 = (Context) r15.A(AndroidCompositionLocals_androidKt.f6042b);
                c22.x0.f23314a.getClass();
                String strW2 = gl1.d.W(c22.x0.j8);
                String[] strArr2 = {gl1.y.Q(r15, R.string.gender_not_specified), gl1.y.Q(r15, R.string.common_no), gl1.y.Q(r15, R.string.common_yes)};
                String strQ9 = gl1.y.Q(r15, R.string.lbl_cancel);
                String strQ10 = gl1.y.Q(r15, R.string.lbl_done);
                Boolean bool = ((pe0.c) p1VarC.getF182175a()).f137410e;
                if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                    r16 = 1;
                } else if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    r16 = 2;
                } else {
                    if (bool != null) {
                        lc.u0.r();
                        return;
                    }
                    r16 = r14;
                }
                Unit unit3 = Unit.INSTANCE;
                boolean z26 = (((((r15.r(context3) ? 1 : 0) | (r15.B(strW2) ? 1 : 0) ? 1 : 0) | (r15.r(strArr2) ? 1 : 0) ? 1 : 0) | (r15.k(r16) ? 1 : 0) ? 1 : 0) | (r15.B(strQ9) ? 1 : 0) ? 1 : 0) | (r15.B(strQ10) ? 1 : 0);
                if ((i16 & 112) != 32 && ((i16 & 64) == 0 || !r15.r(dVar))) {
                    r34 = r14;
                }
                p1Var6 = p1Var6;
                boolean z27 = (((z26 ? 1 : 0) | r34) == true ? 1 : 0) | (r15.B(p1Var6) ? 1 : 0);
                Object objQ11 = r15.q();
                if (z27 != 0 || objQ11 == p3.m.a.f135155b) {
                    k kVar = new k(context3, strW2, strArr2, r16, strQ9, strQ10, dVar, p1Var6, null);
                    r15.K(kVar);
                    objQ11 = kVar;
                }
                p3.l0.e((e23.p) objQ11, unit3, r15);
                r15.g0(r14);
            } else {
                r15.C(-875313951);
                r15.g0(r14);
            }
            boolean z28 = aVar.f131247a;
            c2.n0 n0Var = n3.f22788a;
            final boolean z29 = z17;
            final p3.p1 p1Var7 = p1Var;
            final p3.p1 p1Var8 = p1Var6;
            ?? r17 = r15;
            z02.d.a(z28, z3.f.c(1773899580, new j21.g(aVar2, z29, b0Var, strW, strQ, dVar, z16, context, feVar, 3), r15), z3.f.c(169895707, new p21.b(feVar, 20), r15), null, new c2.n0(r14, r14, r14, r14), z3.f.c(-347148616, new e23.p() { // from class: vd0.e
                /* JADX WARN: Code duplicated, block: B:113:0x045b  */
                /* JADX WARN: Code duplicated, block: B:116:0x049a  */
                /* JADX WARN: Code duplicated, block: B:118:0x04a5  */
                /* JADX WARN: Code duplicated, block: B:120:0x04ad  */
                /* JADX WARN: Code duplicated, block: B:121:0x04b4 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:122:0x04b6  */
                /* JADX WARN: Code duplicated, block: B:125:0x04cc  */
                /* JADX WARN: Code duplicated, block: B:128:0x04d1  */
                /* JADX WARN: Code duplicated, block: B:132:0x050f A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:133:0x0511  */
                /* JADX WARN: Code duplicated, block: B:136:0x052a  */
                /* JADX WARN: Code duplicated, block: B:138:0x055b A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:139:0x055d  */
                /* JADX WARN: Code duplicated, block: B:141:0x057d  */
                /* JADX WARN: Code duplicated, block: B:143:0x058c  */
                /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
                /* JADX WARN: Code duplicated, block: B:91:0x0397  */
                /* JADX WARN: Multi-variable type inference failed */
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
                @Override // e23.p
                public final Object invoke(Object obj9, Object obj10) {
                    z3.e eVar;
                    String strH;
                    p3.m mVar2;
                    p3.m.a.C2565a c2565a2;
                    oe0.d dVar2;
                    int i19;
                    int i24;
                    String strH2;
                    int i25;
                    int i26;
                    p3.p1 p1Var9;
                    boolean zB;
                    Object objQ12;
                    oe0.d dVar3;
                    p3.m mVar3;
                    p3.m.a.C2565a c2565a3;
                    Boolean bool2;
                    String strH3;
                    int i27;
                    int i28;
                    boolean zB2;
                    Object objQ13;
                    p3.m.a.C2565a c2565a4;
                    e23.a aVar13;
                    boolean zB3;
                    Object objQ14;
                    boolean zR2;
                    Object objQ15;
                    p3.m.a.C2565a c2565a5;
                    boolean zB4;
                    Object objQ16;
                    p3.m mVar4 = (p3.m) obj9;
                    int iIntValue = ((Integer) obj10).intValue();
                    if (mVar4.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        h4.r rVarD = c2.l.D(u1.a2.b(h4.r.S, u1.a2.a(mVar4), true));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                        int iHashCode = Long.hashCode(mVar4.getU());
                        i2 i2VarX = mVar4.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar4);
                        h5.g.V.getClass();
                        h5.e0.a aVar14 = h5.g.a.f81805b;
                        if (mVar4.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar14);
                        } else {
                            mVar4.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar4);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar4);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        p3.p1 p1Var10 = p1VarC;
                        l.c(((pe0.c) p1Var10.getF182175a()).f137415j, aVar7, mVar4, 0);
                        b82.t0 t0Var = b82.t0.f16792a;
                        String strQ11 = gl1.y.Q(mVar4, R.string.lbl_name);
                        String str2 = ((pe0.c) p1Var10.getF182175a()).f137406a;
                        boolean z34 = ((pe0.c) p1Var10.getF182175a()).f137406a.length() > 100;
                        oe0.d dVar4 = dVar;
                        boolean zR3 = mVar4.r(dVar4);
                        Object objQ17 = mVar4.q();
                        p3.m.a aVar15 = p3.m.f135153a;
                        if (zR3) {
                            objQ17 = new a(dVar4, 0);
                            mVar4.K(objQ17);
                        } else {
                            aVar15.getClass();
                            if (objQ17 == p3.m.a.f135155b) {
                                objQ17 = new a(dVar4, 0);
                                mVar4.K(objQ17);
                            }
                        }
                        x5.v.f188954b.getClass();
                        t0Var.i(null, strQ11, str2, 100, z34, (e23.l) objQ17, null, x5.v.f188955c, 0, null, mVar4, 12585984, 833);
                        l72.p2 p2Var = l72.p2.f111205a;
                        c22.x0.f23314a.getClass();
                        String strW3 = gl1.d.W(c22.x0.J8);
                        pe0.d dVar5 = ((pe0.c) p1Var10.getF182175a()).f137407b;
                        String strL = oi0.c.l(dVar5 != null ? dVar5.f137417b : null, mVar4);
                        if (z29) {
                            m0.f177325a.getClass();
                            eVar = m0.f177326b;
                        } else {
                            eVar = null;
                        }
                        p2Var.h(strW3, strL, null, null, null, false, false, null, eVar, null, aVar5, mVar4, 0, 0, 764);
                        String strW4 = gl1.d.W(c22.x0.M8);
                        mVar4.C(756685183);
                        i53.c<pe0.d> cVar2 = ((pe0.c) p1Var10.getF182175a()).f137408c;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                        Iterator<pe0.d> it4 = cVar2.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(oi0.c.l(it4.next().f137417b, mVar4));
                        }
                        mVar4.f();
                        String strH4 = w5.r.h(null, arrayList2, mVar4);
                        if (strH4 == null) {
                            strH4 = sn.a.h(mVar4, 756686863, R.string.gender_not_specified, mVar4);
                        } else {
                            mVar4.C(756681376);
                            mVar4.f();
                        }
                        l72.p2 p2Var2 = l72.p2.f111205a;
                        p2Var.h(strW4, strH4, null, null, null, false, false, null, null, null, aVar6, mVar4, 0, 0, 1020);
                        Object[] objArr4 = new Object[0];
                        Object objQ18 = mVar4.q();
                        aVar15.getClass();
                        p3.m.a.C2565a c2565a6 = p3.m.a.f135155b;
                        if (objQ18 == c2565a6) {
                            objQ18 = new v10.a(13);
                            mVar4.K(objQ18);
                        }
                        p3.p1 p1Var11 = (p3.p1) d4.a.e(objArr4, (e23.a) objQ18, mVar4, 48);
                        Object[] objArr5 = new Object[0];
                        boolean zB5 = mVar4.B(p1Var10);
                        Object objQ19 = mVar4.q();
                        if (zB5 || objQ19 == c2565a6) {
                            objQ19 = new tn.h(p1Var10, 28);
                            mVar4.K(objQ19);
                        }
                        p3.p1 p1Var12 = (p3.p1) d4.a.e(objArr5, (e23.a) objQ19, mVar4, 0);
                        l72.p2 p2Var3 = l72.p2.f111205a;
                        String strQ12 = gl1.y.Q(mVar4, R.string.lbl_birthdate);
                        Calendar calendar = (Calendar) p1Var12.getF182175a();
                        if (calendar != null) {
                            strH = p005kotlin.jvm.internal.s.g(((pe0.c) p1Var10.getF182175a()).f137413h, CaldroidFragment.MONTH) ? DateTimeFormat.forPattern("MM/yyyy").print(new LocalDate(calendar.getTimeInMillis())) : DateTimeFormat.forPattern("MM/dd/yyyy").print(new LocalDate(calendar.getTimeInMillis()));
                        } else {
                            strH = null;
                        }
                        if (strH == null) {
                            strH = sn.a.h(mVar4, 756741679, R.string.gender_not_specified, mVar4);
                        } else {
                            mVar4.C(756729837);
                            mVar4.f();
                        }
                        boolean zB6 = mVar4.B(p1Var11);
                        Object objQ20 = mVar4.q();
                        if (zB6 || objQ20 == c2565a6) {
                            objQ20 = new tn.h(p1Var11, 29);
                            mVar4.K(objQ20);
                        }
                        p2Var3.h(strQ12, strH, null, null, null, false, false, null, null, null, (e23.a) objQ20, mVar4, 0, 0, 1020);
                        if (((Boolean) p1Var11.getF182175a()).booleanValue()) {
                            mVar4.C(1984384320);
                            h4.r.a aVar16 = h4.r.S;
                            h4.r rVarF = x2.f(aVar16, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1);
                            h4.d.f81522a.getClass();
                            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                            p3.x1 x1Var3 = p3.n.f135158a;
                            int iHashCode2 = Long.hashCode(mVar4.getU());
                            i2 i2VarX2 = mVar4.x();
                            h4.r rVarC2 = h4.k.c(rVarA, mVar4);
                            h5.g.V.getClass();
                            h5.e0.a aVar17 = h5.g.a.f81805b;
                            if (mVar4.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar4.z();
                            if (mVar4.getT()) {
                                mVar4.M(aVar17);
                            } else {
                                mVar4.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD, mVar4);
                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                            c2.u uVar = c2.u.f22885a;
                            h4.r rVarZ = x2.z(aVar16, null, 3);
                            Calendar calendar2 = (Calendar) p1Var12.getF182175a();
                            if (calendar2 == null) {
                                calendar2 = Calendar.getInstance();
                            }
                            Calendar calendar3 = calendar2;
                            calendar3.getClass();
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.set(2000, 0, 1);
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.getClass();
                            boolean zB7 = mVar4.B(p1Var12) | mVar4.r(dVar4);
                            Object objQ21 = mVar4.q();
                            if (zB7) {
                                c2565a5 = c2565a6;
                            } else {
                                if (objQ21 == c2565a5) {
                                }
                                c2565a5 = c2565a6;
                                e23.l lVar = (e23.l) objQ21;
                                zB4 = mVar4.B(p1Var12) | mVar4.r(dVar4);
                                objQ16 = mVar4.q();
                                if (zB4 || objQ16 == c2565a5) {
                                    objQ16 = new u91.i(20, dVar4, p1Var12);
                                    mVar4.K(objQ16);
                                }
                                c2565a2 = c2565a5;
                                dVar2 = dVar4;
                                v0.a(rVarZ, null, calendar3, lVar, (e23.p) objQ16, calendar4, calendar5, false, mVar4, 6, 130);
                                mVar2 = mVar4;
                                mVar2.y();
                                mVar2.f();
                            }
                            c2565a5 = c2565a6;
                            objQ21 = new ty1.g2(13, dVar4, p1Var12);
                            mVar4.K(objQ21);
                            c2565a5 = c2565a6;
                            e23.l lVar2 = (e23.l) objQ21;
                            zB4 = mVar4.B(p1Var12) | mVar4.r(dVar4);
                            objQ16 = mVar4.q();
                            if (zB4) {
                                objQ16 = new u91.i(20, dVar4, p1Var12);
                                mVar4.K(objQ16);
                            } else {
                                objQ16 = new u91.i(20, dVar4, p1Var12);
                                mVar4.K(objQ16);
                            }
                            c2565a2 = c2565a5;
                            dVar2 = dVar4;
                            v0.a(rVarZ, null, calendar3, lVar2, (e23.p) objQ16, calendar4, calendar5, false, mVar4, 6, 130);
                            mVar2 = mVar4;
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2 = mVar4;
                            c2565a2 = c2565a6;
                            dVar2 = dVar4;
                            mVar2.C(1986167936);
                            mVar2.f();
                        }
                        boolean z35 = z16;
                        if (z35) {
                            i19 = 756809601;
                            i24 = R.string.lbl_kg;
                        } else {
                            i19 = 756811394;
                            i24 = R.string.lbl_lbs;
                        }
                        p2Var3.b(null, z3.f.c(-1332239036, new r11.l(p1Var2, z35, dVar2, 7), mVar2), z3.f.c(-1229762043, new b(sn.a.h(mVar2, i19, i24, mVar2), 0), mVar2), null, mVar2, 432, 9);
                        String strQ13 = gl1.y.Q(mVar2, R.string.lbl_sex);
                        String str3 = ((pe0.c) p1Var10.getF182175a()).f137409d;
                        if (p005kotlin.jvm.internal.s.g(str3, je0.g.MALE.f98524a)) {
                            i25 = 756865514;
                            i26 = R.string.lbl_gender_male;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(str3, je0.g.FEMALE.f98524a)) {
                                i25 = 756868236;
                                i26 = R.string.lbl_gender_female;
                            } else {
                                strH2 = sn.a.h(mVar2, 756870511, R.string.gender_not_specified, mVar2);
                            }
                            p1Var9 = p1Var7;
                            zB = mVar2.B(p1Var9);
                            objQ12 = mVar2.q();
                            if (zB || objQ12 == c2565a2) {
                                objQ12 = new c(p1Var9, 0);
                                mVar2.K(objQ12);
                            }
                            e23.a<Unit> aVar18 = (e23.a) objQ12;
                            dVar3 = dVar2;
                            mVar3 = mVar2;
                            c2565a3 = c2565a2;
                            p2Var3.h(strQ13, strH2, null, null, null, false, false, null, null, null, aVar18, mVar3, 0, 0, 1020);
                            c22.x0.f23314a.getClass();
                            String strW5 = gl1.d.W(c22.x0.j8);
                            bool2 = ((pe0.c) p1Var10.getF182175a()).f137410e;
                            if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                                i27 = 756882789;
                                i28 = R.string.common_yes;
                            } else {
                                if (p005kotlin.jvm.internal.s.g(bool2, Boolean.FALSE)) {
                                    i27 = 756884868;
                                    i28 = R.string.common_no;
                                } else {
                                    if (bool2 == null) {
                                        throw n23.j.m(mVar3, 756881209);
                                    }
                                    strH3 = sn.a.h(mVar3, 756886895, R.string.gender_not_specified, mVar3);
                                }
                                p3.p1 p1Var13 = p1Var8;
                                zB2 = mVar3.B(p1Var13);
                                objQ13 = mVar3.q();
                                if (zB2) {
                                    c2565a4 = c2565a3;
                                } else {
                                    c2565a4 = c2565a3;
                                    if (objQ13 == c2565a4) {
                                    }
                                    p3.m.a.C2565a c2565a7 = c2565a4;
                                    p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                                    String strQ14 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                    String strQ15 = gl1.y.Q(mVar3, R.string.lbl_help);
                                    aVar13 = aVar8;
                                    zB3 = mVar3.B(aVar13);
                                    objQ14 = mVar3.q();
                                    if (zB3 || objQ14 == c2565a7) {
                                        objQ14 = new ux1.g(aVar13, 6);
                                        mVar3.K(objQ14);
                                    }
                                    l72.r1.c(strQ14, strQ15, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                                    if (zBooleanValue) {
                                        mVar3.C(1989176517);
                                        String strW6 = gl1.d.W(c22.x0.G8);
                                        String strW7 = gl1.d.W(c22.x0.f23740z8);
                                        z3.e eVarC = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                        zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                        objQ15 = mVar3.q();
                                        if (zR2 || objQ15 == c2565a7) {
                                            objQ15 = new ug2.h(23, dVar3, p1Var10);
                                            mVar3.K(objQ15);
                                        }
                                        p2Var3.h(strW6, strW7, null, null, null, false, false, null, eVarC, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(1989817504);
                                        mVar3.f();
                                    }
                                    mVar3.y();
                                    p3.x1 x1Var4 = p3.n.f135158a;
                                }
                                objQ13 = new c(p1Var13, 1);
                                mVar3.K(objQ13);
                                p3.m.a.C2565a c2565a8 = c2565a4;
                                p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                                String strQ16 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                String strQ17 = gl1.y.Q(mVar3, R.string.lbl_help);
                                aVar13 = aVar8;
                                zB3 = mVar3.B(aVar13);
                                objQ14 = mVar3.q();
                                if (zB3) {
                                    objQ14 = new ux1.g(aVar13, 6);
                                    mVar3.K(objQ14);
                                } else {
                                    objQ14 = new ux1.g(aVar13, 6);
                                    mVar3.K(objQ14);
                                }
                                l72.r1.c(strQ16, strQ17, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                                if (zBooleanValue) {
                                    mVar3.C(1989176517);
                                    String strW8 = gl1.d.W(c22.x0.G8);
                                    String strW9 = gl1.d.W(c22.x0.f23740z8);
                                    z3.e eVarC2 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                    zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                    objQ15 = mVar3.q();
                                    if (zR2) {
                                        objQ15 = new ug2.h(23, dVar3, p1Var10);
                                        mVar3.K(objQ15);
                                    } else {
                                        objQ15 = new ug2.h(23, dVar3, p1Var10);
                                        mVar3.K(objQ15);
                                    }
                                    p2Var3.h(strW8, strW9, null, null, null, false, false, null, eVarC2, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                    mVar3.f();
                                } else {
                                    mVar3.C(1989817504);
                                    mVar3.f();
                                }
                                mVar3.y();
                                p3.x1 x1Var5 = p3.n.f135158a;
                            }
                            strH3 = sn.a.h(mVar3, i27, i28, mVar3);
                            p3.p1 p1Var14 = p1Var8;
                            zB2 = mVar3.B(p1Var14);
                            objQ13 = mVar3.q();
                            if (zB2) {
                                c2565a4 = c2565a3;
                                if (objQ13 == c2565a4) {
                                }
                                p3.m.a.C2565a c2565a9 = c2565a4;
                                p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                                String strQ18 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                String strQ19 = gl1.y.Q(mVar3, R.string.lbl_help);
                                aVar13 = aVar8;
                                zB3 = mVar3.B(aVar13);
                                objQ14 = mVar3.q();
                                if (zB3) {
                                    objQ14 = new ux1.g(aVar13, 6);
                                    mVar3.K(objQ14);
                                } else {
                                    objQ14 = new ux1.g(aVar13, 6);
                                    mVar3.K(objQ14);
                                }
                                l72.r1.c(strQ18, strQ19, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                                if (zBooleanValue) {
                                    mVar3.C(1989176517);
                                    String strW10 = gl1.d.W(c22.x0.G8);
                                    String strW11 = gl1.d.W(c22.x0.f23740z8);
                                    z3.e eVarC3 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                    zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                    objQ15 = mVar3.q();
                                    if (zR2) {
                                        objQ15 = new ug2.h(23, dVar3, p1Var10);
                                        mVar3.K(objQ15);
                                    } else {
                                        objQ15 = new ug2.h(23, dVar3, p1Var10);
                                        mVar3.K(objQ15);
                                    }
                                    p2Var3.h(strW10, strW11, null, null, null, false, false, null, eVarC3, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                    mVar3.f();
                                } else {
                                    mVar3.C(1989817504);
                                    mVar3.f();
                                }
                                mVar3.y();
                                p3.x1 x1Var6 = p3.n.f135158a;
                            } else {
                                c2565a4 = c2565a3;
                            }
                            objQ13 = new c(p1Var14, 1);
                            mVar3.K(objQ13);
                            p3.m.a.C2565a c2565a10 = c2565a4;
                            p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                            String strQ110 = gl1.y.Q(mVar3, R.string.activity_options_title);
                            String strQ111 = gl1.y.Q(mVar3, R.string.lbl_help);
                            aVar13 = aVar8;
                            zB3 = mVar3.B(aVar13);
                            objQ14 = mVar3.q();
                            if (zB3) {
                                objQ14 = new ux1.g(aVar13, 6);
                                mVar3.K(objQ14);
                            } else {
                                objQ14 = new ux1.g(aVar13, 6);
                                mVar3.K(objQ14);
                            }
                            l72.r1.c(strQ110, strQ111, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                            if (zBooleanValue) {
                                mVar3.C(1989176517);
                                String strW12 = gl1.d.W(c22.x0.G8);
                                String strW13 = gl1.d.W(c22.x0.f23740z8);
                                z3.e eVarC4 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                objQ15 = mVar3.q();
                                if (zR2) {
                                    objQ15 = new ug2.h(23, dVar3, p1Var10);
                                    mVar3.K(objQ15);
                                } else {
                                    objQ15 = new ug2.h(23, dVar3, p1Var10);
                                    mVar3.K(objQ15);
                                }
                                p2Var3.h(strW12, strW13, null, null, null, false, false, null, eVarC4, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                mVar3.f();
                            } else {
                                mVar3.C(1989817504);
                                mVar3.f();
                            }
                            mVar3.y();
                            p3.x1 x1Var7 = p3.n.f135158a;
                        }
                        strH2 = sn.a.h(mVar2, i25, i26, mVar2);
                        p1Var9 = p1Var7;
                        zB = mVar2.B(p1Var9);
                        objQ12 = mVar2.q();
                        if (zB) {
                            objQ12 = new c(p1Var9, 0);
                            mVar2.K(objQ12);
                        } else {
                            objQ12 = new c(p1Var9, 0);
                            mVar2.K(objQ12);
                        }
                        e23.a<Unit> aVar19 = (e23.a) objQ12;
                        dVar3 = dVar2;
                        mVar3 = mVar2;
                        c2565a3 = c2565a2;
                        p2Var3.h(strQ13, strH2, null, null, null, false, false, null, null, null, aVar19, mVar3, 0, 0, 1020);
                        c22.x0.f23314a.getClass();
                        String strW14 = gl1.d.W(c22.x0.j8);
                        bool2 = ((pe0.c) p1Var10.getF182175a()).f137410e;
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            i27 = 756882789;
                            i28 = R.string.common_yes;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(bool2, Boolean.FALSE)) {
                                i27 = 756884868;
                                i28 = R.string.common_no;
                            } else {
                                if (bool2 == null) {
                                    throw n23.j.m(mVar3, 756881209);
                                }
                                strH3 = sn.a.h(mVar3, 756886895, R.string.gender_not_specified, mVar3);
                            }
                            p3.p1 p1Var15 = p1Var8;
                            zB2 = mVar3.B(p1Var15);
                            objQ13 = mVar3.q();
                            if (zB2) {
                                c2565a4 = c2565a3;
                                if (objQ13 == c2565a4) {
                                }
                                p3.m.a.C2565a c2565a11 = c2565a4;
                                p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                                String strQ112 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                String strQ113 = gl1.y.Q(mVar3, R.string.lbl_help);
                                aVar13 = aVar8;
                                zB3 = mVar3.B(aVar13);
                                objQ14 = mVar3.q();
                                if (zB3) {
                                    objQ14 = new ux1.g(aVar13, 6);
                                    mVar3.K(objQ14);
                                } else {
                                    objQ14 = new ux1.g(aVar13, 6);
                                    mVar3.K(objQ14);
                                }
                                l72.r1.c(strQ112, strQ113, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                                if (zBooleanValue) {
                                    mVar3.C(1989176517);
                                    String strW15 = gl1.d.W(c22.x0.G8);
                                    String strW16 = gl1.d.W(c22.x0.f23740z8);
                                    z3.e eVarC5 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                    zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                    objQ15 = mVar3.q();
                                    if (zR2) {
                                        objQ15 = new ug2.h(23, dVar3, p1Var10);
                                        mVar3.K(objQ15);
                                    } else {
                                        objQ15 = new ug2.h(23, dVar3, p1Var10);
                                        mVar3.K(objQ15);
                                    }
                                    p2Var3.h(strW15, strW16, null, null, null, false, false, null, eVarC5, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                    mVar3.f();
                                } else {
                                    mVar3.C(1989817504);
                                    mVar3.f();
                                }
                                mVar3.y();
                                p3.x1 x1Var8 = p3.n.f135158a;
                            } else {
                                c2565a4 = c2565a3;
                            }
                            objQ13 = new c(p1Var15, 1);
                            mVar3.K(objQ13);
                            p3.m.a.C2565a c2565a12 = c2565a4;
                            p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                            String strQ114 = gl1.y.Q(mVar3, R.string.activity_options_title);
                            String strQ115 = gl1.y.Q(mVar3, R.string.lbl_help);
                            aVar13 = aVar8;
                            zB3 = mVar3.B(aVar13);
                            objQ14 = mVar3.q();
                            if (zB3) {
                                objQ14 = new ux1.g(aVar13, 6);
                                mVar3.K(objQ14);
                            } else {
                                objQ14 = new ux1.g(aVar13, 6);
                                mVar3.K(objQ14);
                            }
                            l72.r1.c(strQ114, strQ115, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                            if (zBooleanValue) {
                                mVar3.C(1989176517);
                                String strW17 = gl1.d.W(c22.x0.G8);
                                String strW18 = gl1.d.W(c22.x0.f23740z8);
                                z3.e eVarC6 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                objQ15 = mVar3.q();
                                if (zR2) {
                                    objQ15 = new ug2.h(23, dVar3, p1Var10);
                                    mVar3.K(objQ15);
                                } else {
                                    objQ15 = new ug2.h(23, dVar3, p1Var10);
                                    mVar3.K(objQ15);
                                }
                                p2Var3.h(strW17, strW18, null, null, null, false, false, null, eVarC6, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                mVar3.f();
                            } else {
                                mVar3.C(1989817504);
                                mVar3.f();
                            }
                            mVar3.y();
                            p3.x1 x1Var9 = p3.n.f135158a;
                        }
                        strH3 = sn.a.h(mVar3, i27, i28, mVar3);
                        p3.p1 p1Var16 = p1Var8;
                        zB2 = mVar3.B(p1Var16);
                        objQ13 = mVar3.q();
                        if (zB2) {
                            c2565a4 = c2565a3;
                            if (objQ13 == c2565a4) {
                            }
                            p3.m.a.C2565a c2565a13 = c2565a4;
                            p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                            String strQ116 = gl1.y.Q(mVar3, R.string.activity_options_title);
                            String strQ117 = gl1.y.Q(mVar3, R.string.lbl_help);
                            aVar13 = aVar8;
                            zB3 = mVar3.B(aVar13);
                            objQ14 = mVar3.q();
                            if (zB3) {
                                objQ14 = new ux1.g(aVar13, 6);
                                mVar3.K(objQ14);
                            } else {
                                objQ14 = new ux1.g(aVar13, 6);
                                mVar3.K(objQ14);
                            }
                            l72.r1.c(strQ116, strQ117, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                            if (zBooleanValue) {
                                mVar3.C(1989176517);
                                String strW19 = gl1.d.W(c22.x0.G8);
                                String strW110 = gl1.d.W(c22.x0.f23740z8);
                                z3.e eVarC7 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                                zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                                objQ15 = mVar3.q();
                                if (zR2) {
                                    objQ15 = new ug2.h(23, dVar3, p1Var10);
                                    mVar3.K(objQ15);
                                } else {
                                    objQ15 = new ug2.h(23, dVar3, p1Var10);
                                    mVar3.K(objQ15);
                                }
                                p2Var3.h(strW19, strW110, null, null, null, false, false, null, eVarC7, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                                mVar3.f();
                            } else {
                                mVar3.C(1989817504);
                                mVar3.f();
                            }
                            mVar3.y();
                            p3.x1 x1Var10 = p3.n.f135158a;
                        } else {
                            c2565a4 = c2565a3;
                        }
                        objQ13 = new c(p1Var16, 1);
                        mVar3.K(objQ13);
                        p3.m.a.C2565a c2565a14 = c2565a4;
                        p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar3, 0, 0, 1020);
                        String strQ118 = gl1.y.Q(mVar3, R.string.activity_options_title);
                        String strQ119 = gl1.y.Q(mVar3, R.string.lbl_help);
                        aVar13 = aVar8;
                        zB3 = mVar3.B(aVar13);
                        objQ14 = mVar3.q();
                        if (zB3) {
                            objQ14 = new ux1.g(aVar13, 6);
                            mVar3.K(objQ14);
                        } else {
                            objQ14 = new ux1.g(aVar13, 6);
                            mVar3.K(objQ14);
                        }
                        l72.r1.c(strQ118, strQ119, (e23.a) objQ14, false, null, null, mVar3, 0, 56);
                        if (zBooleanValue) {
                            mVar3.C(1989176517);
                            String strW111 = gl1.d.W(c22.x0.G8);
                            String strW112 = gl1.d.W(c22.x0.f23740z8);
                            z3.e eVarC8 = z3.f.c(-1342653405, new sk0.c(p1Var10, 6), mVar3);
                            zR2 = mVar3.r(dVar3) | mVar3.B(p1Var10);
                            objQ15 = mVar3.q();
                            if (zR2) {
                                objQ15 = new ug2.h(23, dVar3, p1Var10);
                                mVar3.K(objQ15);
                            } else {
                                objQ15 = new ug2.h(23, dVar3, p1Var10);
                                mVar3.K(objQ15);
                            }
                            p2Var3.h(strW111, strW112, null, null, null, false, false, null, eVarC8, null, (e23.a) objQ15, mVar3, 100663296, 0, 764);
                            mVar3.f();
                        } else {
                            mVar3.C(1989817504);
                            mVar3.f();
                        }
                        mVar3.y();
                        p3.x1 x1Var11 = p3.n.f135158a;
                    } else {
                        mVar4.e();
                    }
                    return Unit.INSTANCE;
                }
            }, r15), r17, 197040, 8);
            r28 = r17;
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            p3.o0 o0Var4 = o0VarE;
            o0Var4.e();
            r28 = o0Var4;
        }
        p2 p2VarI0 = r28.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(aVar, dVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, i14);
        }
    }

    public static final void c(Uri uri, e23.a aVar, p3.m mVar, int i14) {
        Uri uri2;
        e23.a aVar2 = aVar;
        p3.o0 o0VarE = mVar.E(690791425);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(uri) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarD = u1.w.d(c2.l.A(rVarF, 0.0f, eVar.f97921f, 1), false, null, null, aVar2, 15);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            float f14 = 80;
            g6.f.a aVar6 = g6.f.f75994b;
            h4.r rVarQ = x2.q(aVar3, f14);
            k2.h hVar = k2.i.f102406a;
            h4.r rVarB = l4.k.b(rVarQ, hVar);
            gl.c.f77766a.getClass();
            gl.e eVar3 = gl.c.f77767b;
            h4.r rVarE = u1.n.e(rVarB, eVar3.f77781g, o4.m1.f128891a);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (uri != null) {
                o0VarE.C(1720375471);
                String strQ = gl1.y.Q(o0VarE, R.string.social_group_add_a_photo);
                h4.r rVarB2 = l4.k.b(x2.q(aVar3, f14), hVar);
                f5.k.f68985a.getClass();
                jf.r.a(uri, strQ, rVarB2, null, null, f5.k.a.f68987b, null, o0VarE, (i15 & 14) | 1572864, 1976);
                uri2 = uri;
                o0VarE.g0(false);
            } else {
                uri2 = uri;
                o0VarE.C(1720760522);
                i7.a(n5.c.a(R.drawable.ic_dog_profile_placeholder, o0VarE, 0), gl1.y.Q(o0VarE, R.string.social_group_add_a_photo), x2.q(aVar3, 40), eVar3.f77787j, o0VarE, 384, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            String strQ2 = gl1.y.Q(o0VarE, R.string.social_group_add_a_photo);
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            long jA = d92.b.a(o0VarE).k().a();
            bVar.getClass();
            aVar2 = aVar;
            mh.c(strQ2, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0, 5), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131064);
            o0VarE.g0(true);
        } else {
            uri2 = uri;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u91.i(uri2, aVar2, i14, 21);
        }
    }
}
