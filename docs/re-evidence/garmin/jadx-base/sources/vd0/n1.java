package vd0;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.roomorama.caldroid.CaldroidFragment;
import i3.fe;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177336a;

        static {
            int[] iArr = new int[je0.g.values().length];
            try {
                iArr[je0.g.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[je0.g.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f177336a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(oe0.s sVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, p3.m mVar, int i14) {
        sVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-435392353);
        int i15 = i14 | (o0VarE.r(sVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192) | (o0VarE.r(aVar5) ? 131072 : 65536) | (o0VarE.r(aVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarC = s9.c.c(sVar.f131411g, o0VarE);
            p3.p1 p1VarC2 = s9.c.c(sVar.f131413i, o0VarE);
            oe0.o oVar = (oe0.o) p1VarC.getF182175a();
            pe0.j jVar = (pe0.j) p1VarC2.getF182175a();
            pe0.d dVar = ((pe0.j) p1VarC2.getF182175a()).f137452b;
            boolean z14 = (i15 & 14) == 4 || o0VarE.r(sVar);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new vc0.v(sVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vc0.v(sVar, 2);
                    o0VarE.K(objQ);
                }
            }
            int i16 = i15 << 9;
            int i17 = i15 << 12;
            b(oVar, jVar, dVar, sVar, aVar, aVar2, (e23.a) objQ, aVar3, aVar4, aVar5, aVar6, o0VarE, (i16 & 458752) | (i16 & 7168) | 4096 | (57344 & i16) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), (i15 >> 18) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k((androidx.lifecycle.u1) sVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, i14, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r10v4, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r28v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v20 */
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
    public static final void b(oe0.o oVar, final pe0.j jVar, final pe0.d dVar, final oe0.s sVar, e23.a aVar, e23.a aVar2, e23.a aVar3, final e23.a aVar4, final e23.a aVar5, final e23.a aVar6, final e23.a aVar7, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        ?? r28;
        Object obj;
        int i18;
        boolean z14;
        boolean z15;
        p3.p1 p1Var;
        boolean z16;
        ?? r15;
        ?? r14;
        p3.p1 p1Var2;
        ?? r16;
        int i19;
        Object g1Var;
        boolean z17;
        boolean z18;
        p3.o0 o0Var;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        p3.o0 o0VarE = mVar.E(-423256725);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(oVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(jVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(sVar) : o0VarE.r(sVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.r(aVar4) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.r(aVar5) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(aVar6) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(aVar7) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            final boolean z19 = am.j.z(f12.l.f68084a);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
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
            String str = jVar.f137460j;
            boolean zB = o0VarE.B(str);
            Object objQ2 = o0VarE.q();
            Object objN = objQ2;
            if (zB || objQ2 == c2565a) {
                objN = hb.a.n(str == null, o0VarE);
            }
            final p3.p1 p1Var3 = (p3.p1) objN;
            if (((Boolean) p1Var3.getF182175a()).booleanValue() || str == null) {
                i18 = 0;
                o0VarE.C(784057143);
                o0VarE.g0(false);
            } else {
                o0VarE.C(783757311);
                boolean zR = o0VarE.r(context) | o0VarE.B(str) | o0VarE.B(p1Var3);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    obj5 = objQ3;
                    k1 k1Var = new k1(context, str, p1Var3, null);
                    o0VarE.K(k1Var);
                    obj5 = k1Var;
                }
                p3.l0.e((e23.p) obj5, str, o0VarE);
                i18 = 0;
                o0VarE.g0(false);
            }
            Object[] objArr = new Object[i18];
            int i24 = i16 & 112;
            boolean zH = (i24 == 32) | o0VarE.h(z19);
            Object objQ4 = o0VarE.q();
            Object obj6 = objQ4;
            if (zH || objQ4 == c2565a) {
                b50.o oVar2 = new b50.o(jVar, z19, 14);
                o0VarE.K(oVar2);
                obj6 = oVar2;
            }
            p3.p1 p1Var4 = (p3.p1) d4.a.e(objArr, (e23.a) obj6, o0VarE, 0);
            Double dValueOf = Double.valueOf(jVar.f137456f);
            Boolean boolValueOf2 = Boolean.valueOf(z19);
            boolean zB2 = (i24 == 32) | o0VarE.B(p1Var4) | o0VarE.h(z19);
            Object objQ5 = o0VarE.q();
            Object obj7 = objQ5;
            if (zB2 || objQ5 == c2565a) {
                l1 l1Var = new l1(jVar, z19, p1Var4, null);
                o0VarE.K(l1Var);
                obj7 = l1Var;
            }
            p3.l0.f(dValueOf, boolValueOf2, (e23.p) obj7, o0VarE);
            Object[] objArr2 = new Object[0];
            Object objQ6 = o0VarE.q();
            Object obj8 = objQ6;
            if (objQ6 == c2565a) {
                v10.a aVar8 = new v10.a(26);
                o0VarE.K(aVar8);
                obj8 = aVar8;
            }
            p3.p1 p1Var5 = (p3.p1) d4.a.e(objArr2, (e23.a) obj8, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ7 = o0VarE.q();
            Object obj9 = objQ7;
            if (objQ7 == c2565a) {
                v10.a aVar9 = new v10.a(27);
                o0VarE.K(aVar9);
                obj9 = aVar9;
            }
            p3.p1 p1Var6 = (p3.p1) d4.a.e(objArr3, (e23.a) obj9, o0VarE, 48);
            Object objQ8 = o0VarE.q();
            Object objF = objQ8;
            if (objQ8 == c2565a) {
                objF = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objF;
            Object objQ9 = o0VarE.q();
            Object obj10 = objQ9;
            if (objQ9 == c2565a) {
                o53.b0 b0VarJ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(b0VarJ);
                obj10 = b0VarJ;
            }
            o53.b0 b0Var = (o53.b0) obj10;
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.u8);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
            i53.c<pe0.d> cVar = jVar.f137453c;
            if (cVar != null && cVar.isEmpty()) {
                z14 = false;
                break;
            }
            Iterator<pe0.d> it = cVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                } else {
                    if (it.next().f137416a != 1) {
                        z14 = true;
                        break;
                    }
                }
            }
            boolean z24 = z14 && jVar.f137452b == null;
            if (oVar.f131391c) {
                o0VarE.C(785188674);
                Unit unit = Unit.INSTANCE;
                boolean z25 = ((458752 & i16) == 131072) | ((i16 & 7168) == 2048 || ((i16 & 4096) != 0 && o0VarE.r(sVar)));
                Object objQ10 = o0VarE.q();
                if (z25 || objQ10 == p3.m.a.f135155b) {
                    obj4 = objQ10;
                    m1 m1Var = new m1(aVar2, sVar, null);
                    o0VarE.K(m1Var);
                    obj4 = m1Var;
                }
                obj4 = objQ10;
                p3.l0.e((e23.p) obj4, unit, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(785301111);
                o0VarE.g0(false);
            }
            if (oVar.f131392d) {
                o0VarE.C(785344790);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_unable_to_save);
                String strQ3 = gl1.y.Q(o0VarE, R.string.msg_sorry_something_went_wrong);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
                int i25 = 3670016 & i16;
                boolean z26 = i25 == 1048576;
                Object objQ11 = o0VarE.q();
                if (z26 || objQ11 == p3.m.a.f135155b) {
                    obj2 = objQ11;
                    ux1.g gVar = new ux1.g(aVar3, 16);
                    o0VarE.K(gVar);
                    obj2 = gVar;
                }
                obj2 = objQ11;
                e23.a<Unit> aVar10 = (e23.a) obj2;
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                boolean z27 = i25 == 1048576;
                Object objQ12 = o0VarE.q();
                if (z27 || objQ12 == p3.m.a.f135155b) {
                    obj3 = objQ12;
                    ux1.g gVar2 = new ux1.g(aVar3, 17);
                    o0VarE.K(gVar2);
                    obj3 = gVar2;
                }
                obj3 = objQ12;
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar10, strQ5, (e23.a) obj3, o0VarE, 0, 0, 217);
                z15 = false;
                o0VarE.g0(false);
            } else {
                z15 = false;
                o0VarE.C(785807031);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0VarE.C(785881586);
                Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_sex);
                String[] strArr = {gl1.y.Q(o0VarE, R.string.gender_not_specified), gl1.y.Q(o0VarE, R.string.lbl_gender_female), gl1.y.Q(o0VarE, R.string.lbl_gender_male)};
                String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_done);
                je0.g gVar3 = jVar.f137454d;
                int i26 = gVar3 == null ? -1 : a.f177336a[gVar3.ordinal()];
                if (i26 != 1) {
                    p1Var = p1Var4;
                    i19 = i26 != 2 ? 0 : 2;
                } else {
                    p1Var = p1Var4;
                    i19 = 1;
                }
                Unit unit2 = Unit.INSTANCE;
                boolean zR2 = o0VarE.r(context2) | o0VarE.B(strQ6) | o0VarE.r(strArr) | o0VarE.k(i19) | o0VarE.B(strQ7) | o0VarE.B(strQ8) | ((i16 & 7168) == 2048 || ((i16 & 4096) != 0 && o0VarE.r(sVar))) | o0VarE.B(p1Var5);
                Object objQ13 = o0VarE.q();
                if (zR2 || objQ13 == p3.m.a.f135155b) {
                    p3.o0 o0Var2 = o0VarE;
                    z17 = false;
                    z18 = true;
                    g1Var = new g1(context2, strQ6, strArr, i19, strQ7, strQ8, sVar, p1Var5, null);
                    o0Var2.K(g1Var);
                    o0Var = o0Var2;
                } else {
                    g1Var = objQ13;
                    o0Var = o0VarE;
                    z17 = false;
                    z18 = true;
                }
                p3.l0.e((e23.p) g1Var, unit2, o0Var);
                o0Var.g0(z17);
                r14 = o0Var;
                r15 = z17;
                z16 = z18;
            } else {
                p3.o0 o0Var3 = o0VarE;
                i16 = i16;
                boolean z28 = z15;
                p1Var5 = p1Var5;
                p1Var = p1Var4;
                z16 = true;
                o0Var3.C(787331735);
                o0Var3.g0(z28);
                r14 = o0Var3;
                r15 = z28;
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                r14.C(787404554);
                Context context3 = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                c22.x0.f23314a.getClass();
                String strW2 = gl1.d.W(c22.x0.j8);
                String[] strArr2 = {gl1.y.Q(r14, R.string.gender_not_specified), gl1.y.Q(r14, R.string.common_no), gl1.y.Q(r14, R.string.common_yes)};
                String strQ9 = gl1.y.Q(r14, R.string.lbl_cancel);
                String strQ10 = gl1.y.Q(r14, R.string.lbl_done);
                Boolean bool = jVar.f137455e;
                if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                    r16 = z16 ? 1 : 0;
                } else if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    r16 = 2;
                } else {
                    if (bool != null) {
                        lc.u0.r();
                        return;
                    }
                    r16 = r15;
                }
                Unit unit3 = Unit.INSTANCE;
                p1Var2 = p1Var6;
                boolean z29 = ((((((((r14.r(context3) ? 1 : 0) | (r14.B(strW2) ? 1 : 0)) | (r14.r(strArr2) ? 1 : 0) ? 1 : 0) | (r14.k(r16) ? 1 : 0)) | (r14.B(strQ9) ? 1 : 0) ? 1 : 0) | (r14.B(strQ10) ? 1 : 0)) | (((i16 & 7168) == 2048 || ((i16 & 4096) != 0 && r14.r(sVar))) ? z16 ? 1 : 0 : r15)) == true ? 1 : 0) | (r14.B(p1Var2) ? 1 : 0);
                Object objQ14 = r14.q();
                if (z29 != 0 || objQ14 == p3.m.a.f135155b) {
                    h1 h1Var = new h1(context3, strW2, strArr2, r16, strQ9, strQ10, sVar, p1Var2, null);
                    r14.K(h1Var);
                    objQ14 = h1Var;
                }
                p3.l0.e((e23.p) objQ14, unit3, r14);
                r14.g0(r15);
            } else {
                p1Var2 = p1Var6;
                r14.C(788831639);
                r14.g0(r15);
            }
            ?? r34 = z16;
            if (!oVar.f131390b && ((Boolean) p1Var3.getF182175a()).booleanValue() && !oVar.f131389a) {
                r34 = z16;
                r34 = z16;
                r34 = r15;
            }
            r34 = z16;
            r34 = z16;
            r34 = z16;
            c2.n0 n0Var = n3.f22788a;
            final boolean z34 = z24;
            final p3.p1 p1Var7 = p1Var2;
            final p3.p1 p1Var8 = p1Var5;
            final p3.p1 p1Var9 = p1Var;
            ?? r17 = r14;
            z02.d.a(r34, z3.f.c(-72948176, new j21.g(aVar, z34, b0Var, strW, strQ, sVar, z19, context, feVar, 4), r14), z3.f.c(1986974321, new p21.b(feVar, 21), r14), null, new c2.n0(r15, r15, r15, r15), z3.f.c(-423192780, new e23.p() { // from class: vd0.e1
                /* JADX WARN: Code duplicated, block: B:102:0x03db  */
                /* JADX WARN: Code duplicated, block: B:127:0x04a2  */
                /* JADX WARN: Code duplicated, block: B:130:0x04e1  */
                /* JADX WARN: Code duplicated, block: B:133:0x04ee  */
                /* JADX WARN: Code duplicated, block: B:135:0x04f6  */
                /* JADX WARN: Code duplicated, block: B:136:0x04fd A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:137:0x04ff  */
                /* JADX WARN: Code duplicated, block: B:140:0x0518  */
                /* JADX WARN: Code duplicated, block: B:143:0x051d  */
                /* JADX WARN: Code duplicated, block: B:147:0x0562 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:148:0x0564  */
                /* JADX WARN: Code duplicated, block: B:151:0x057f  */
                /* JADX WARN: Code duplicated, block: B:153:0x05b2 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:154:0x05b4  */
                /* JADX WARN: Code duplicated, block: B:156:0x05d5  */
                /* JADX WARN: Code duplicated, block: B:158:0x05e4  */
                /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
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
                public final Object invoke(Object obj11, Object obj12) {
                    z3.e eVar;
                    String str2;
                    String strH;
                    char c14;
                    p3.m mVar2;
                    oe0.s sVar2;
                    p3.m.a.C2565a c2565a2;
                    int i27;
                    int i28;
                    int i29;
                    char c15;
                    int i30;
                    int i34;
                    String strH2;
                    p3.p1 p1Var10;
                    boolean zB3;
                    Object objQ15;
                    p3.m mVar3;
                    oe0.s sVar3;
                    p3.m.a.C2565a c2565a3;
                    Boolean bool2;
                    String strH3;
                    int i35;
                    int i36;
                    boolean zB4;
                    Object objQ16;
                    p3.m.a.C2565a c2565a4;
                    e23.a aVar11;
                    boolean zB5;
                    Object objQ17;
                    boolean zR3;
                    Object objQ18;
                    p3.m.a.C2565a c2565a5;
                    boolean zB6;
                    Object objQ19;
                    p3.m mVar4 = (p3.m) obj11;
                    int iIntValue = ((Integer) obj12).intValue();
                    if (mVar4.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        if (!((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        h4.r rVarD = c2.l.D(u1.a2.b(h4.r.S, u1.a2.a(mVar4), true));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                        int iHashCode = Long.hashCode(mVar4.getU());
                        i2 i2VarX = mVar4.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar4);
                        h5.g.V.getClass();
                        h5.e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar4.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar12);
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
                        pe0.j jVar2 = jVar;
                        Uri uri = jVar2.f137461k;
                        String str3 = jVar2.f137458h;
                        n1.c(uri, jVar2.f137460j, aVar6, mVar4, 0);
                        b82.t0 t0Var = b82.t0.f16792a;
                        String strQ11 = gl1.y.Q(mVar4, R.string.lbl_name);
                        String str4 = jVar2.f137451a;
                        boolean z35 = jVar2.f137451a.length() > 100;
                        oe0.s sVar4 = sVar;
                        boolean zR4 = mVar4.r(sVar4);
                        Object objQ20 = mVar4.q();
                        p3.m.a aVar13 = p3.m.f135153a;
                        if (zR4) {
                            objQ20 = new d1(sVar4, 0);
                            mVar4.K(objQ20);
                        } else {
                            aVar13.getClass();
                            if (objQ20 == p3.m.a.f135155b) {
                                objQ20 = new d1(sVar4, 0);
                                mVar4.K(objQ20);
                            }
                        }
                        x5.v.f188954b.getClass();
                        t0Var.i(null, strQ11, str4, 100, z35, (e23.l) objQ20, null, x5.v.f188955c, 0, null, mVar4, 12585984, 833);
                        l72.p2 p2Var = l72.p2.f111205a;
                        c22.x0.f23314a.getClass();
                        String strW3 = gl1.d.W(c22.x0.J8);
                        pe0.d dVar2 = dVar;
                        String strL = oi0.c.l(dVar2 != null ? dVar2.f137417b : null, mVar4);
                        if (z34) {
                            r0.f177368a.getClass();
                            eVar = r0.f177369b;
                        } else {
                            eVar = null;
                        }
                        p2Var.h(strW3, strL, null, null, null, false, false, null, eVar, null, aVar4, mVar4, 0, 0, 764);
                        String strW4 = gl1.d.W(c22.x0.M8);
                        mVar4.C(-555787385);
                        i53.c<pe0.d> cVar2 = jVar2.f137453c;
                        ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                        Iterator<pe0.d> it3 = cVar2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(oi0.c.l(it3.next().f137417b, mVar4));
                        }
                        mVar4.f();
                        String strH4 = w5.r.h(null, arrayList, mVar4);
                        if (strH4 == null) {
                            strH4 = sn.a.h(mVar4, -555785705, R.string.gender_not_specified, mVar4);
                        } else {
                            mVar4.C(-555791068);
                            mVar4.f();
                        }
                        l72.p2 p2Var2 = l72.p2.f111205a;
                        p2Var.h(strW4, strH4, null, null, null, false, false, null, null, null, aVar5, mVar4, 0, 0, 1020);
                        Object[] objArr4 = new Object[0];
                        Object objQ21 = mVar4.q();
                        aVar13.getClass();
                        p3.m.a.C2565a c2565a6 = p3.m.a.f135155b;
                        if (objQ21 == c2565a6) {
                            objQ21 = new v10.a(25);
                            mVar4.K(objQ21);
                        }
                        p3.p1 p1Var11 = (p3.p1) d4.a.e(objArr4, (e23.a) objQ21, mVar4, 48);
                        Object[] objArr5 = new Object[0];
                        boolean zB7 = mVar4.B(jVar2);
                        Object objQ22 = mVar4.q();
                        if (zB7 || objQ22 == c2565a6) {
                            objQ22 = new vc0.v(jVar2, 3);
                            mVar4.K(objQ22);
                        }
                        p3.p1 p1Var12 = (p3.p1) d4.a.e(objArr5, (e23.a) objQ22, mVar4, 0);
                        String str5 = jVar2.f137457g;
                        boolean zB8 = mVar4.B(p1Var12) | mVar4.B(jVar2);
                        Object objQ23 = mVar4.q();
                        if (zB8 || objQ23 == c2565a6) {
                            objQ23 = new j1(jVar2, p1Var12, null);
                            mVar4.K(objQ23);
                        }
                        p3.l0.e((e23.p) objQ23, str5, mVar4);
                        l72.p2 p2Var3 = l72.p2.f111205a;
                        String strQ12 = gl1.y.Q(mVar4, R.string.lbl_birthdate);
                        Calendar calendar = (Calendar) p1Var12.getF182175a();
                        if (calendar != null) {
                            str2 = str3;
                            strH = p005kotlin.jvm.internal.s.g(str2, CaldroidFragment.MONTH) ? DateTimeFormat.forPattern("MM/yyyy").print(new LocalDate(calendar.getTimeInMillis())) : DateTimeFormat.forPattern("MM/dd/yyyy").print(new LocalDate(calendar.getTimeInMillis()));
                        } else {
                            strQ12 = strQ12;
                            str2 = str3;
                            strH = null;
                        }
                        if (strH == null) {
                            c14 = 5526;
                            strH = sn.a.h(mVar4, -555753545, R.string.gender_not_specified, mVar4);
                        } else {
                            c14 = 5526;
                            mVar4.C(-555765263);
                            mVar4.f();
                        }
                        boolean zB9 = mVar4.B(p1Var11);
                        Object objQ24 = mVar4.q();
                        if (zB9 || objQ24 == c2565a6) {
                            objQ24 = new c(p1Var11, 12);
                            mVar4.K(objQ24);
                        }
                        String str6 = str2;
                        p2Var3.h(strQ12, strH, null, null, null, false, false, null, null, null, (e23.a) objQ24, mVar4, 100663296, 0, 764);
                        if (((Boolean) p1Var11.getF182175a()).booleanValue()) {
                            mVar4.C(-48220017);
                            h4.r.a aVar14 = h4.r.S;
                            h4.r rVarF = x2.f(aVar14, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            i27 = 1;
                            h4.r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1);
                            h4.d.f81522a.getClass();
                            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                            p3.x1 x1Var3 = p3.n.f135158a;
                            int iHashCode2 = Long.hashCode(mVar4.getU());
                            i2 i2VarX2 = mVar4.x();
                            h4.r rVarC2 = h4.k.c(rVarA, mVar4);
                            h5.g.V.getClass();
                            h5.e0.a aVar15 = h5.g.a.f81805b;
                            if (mVar4.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar4.z();
                            if (mVar4.getT()) {
                                mVar4.M(aVar15);
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
                            h4.r rVarZ = x2.z(aVar14, null, 3);
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
                            boolean zG = p005kotlin.jvm.internal.s.g(str6, CaldroidFragment.MONTH);
                            boolean zB10 = mVar4.B(p1Var12) | mVar4.r(sVar4);
                            Object objQ25 = mVar4.q();
                            if (zB10) {
                                c2565a5 = c2565a6;
                            } else {
                                c2565a5 = c2565a6;
                                if (objQ25 == c2565a5) {
                                }
                                e23.l lVar = (e23.l) objQ25;
                                zB6 = mVar4.B(p1Var12) | mVar4.r(sVar4);
                                objQ19 = mVar4.q();
                                if (zB6 || objQ19 == c2565a5) {
                                    objQ19 = new u91.i(26, sVar4, p1Var12);
                                    mVar4.K(objQ19);
                                }
                                sVar2 = sVar4;
                                c2565a2 = c2565a5;
                                v0.a(rVarZ, null, calendar3, lVar, (e23.p) objQ19, calendar4, calendar5, zG, mVar4, 6, 2);
                                mVar2 = mVar4;
                                mVar2.y();
                                mVar2.f();
                            }
                            objQ25 = new ty1.g2(15, sVar4, p1Var12);
                            mVar4.K(objQ25);
                            e23.l lVar2 = (e23.l) objQ25;
                            zB6 = mVar4.B(p1Var12) | mVar4.r(sVar4);
                            objQ19 = mVar4.q();
                            if (zB6) {
                                objQ19 = new u91.i(26, sVar4, p1Var12);
                                mVar4.K(objQ19);
                            } else {
                                objQ19 = new u91.i(26, sVar4, p1Var12);
                                mVar4.K(objQ19);
                            }
                            sVar2 = sVar4;
                            c2565a2 = c2565a5;
                            v0.a(rVarZ, null, calendar3, lVar2, (e23.p) objQ19, calendar4, calendar5, zG, mVar4, 6, 2);
                            mVar2 = mVar4;
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2 = mVar4;
                            sVar2 = sVar4;
                            c2565a2 = c2565a6;
                            i27 = 1;
                            mVar2.C(-46366248);
                            mVar2.f();
                        }
                        boolean z36 = z19;
                        if (z36) {
                            i28 = -555682007;
                            i29 = R.string.lbl_kg;
                        } else {
                            i28 = -555680214;
                            i29 = R.string.lbl_lbs;
                        }
                        p2Var3.b(null, z3.f.c(1078595368, new r11.l(p1Var9, z36, sVar2, 8), mVar2), z3.f.c(1310263879, new b(sn.a.h(mVar2, i28, i29, mVar2), 4), mVar2), null, mVar2, 432, 9);
                        String strQ13 = gl1.y.Q(mVar2, R.string.lbl_sex);
                        je0.g gVar4 = jVar2.f137454d;
                        int i37 = gVar4 == null ? -1 : n1.a.f177336a[gVar4.ordinal()];
                        if (i37 != i27) {
                            if (i37 != 2) {
                                c15 = 5526;
                                strH2 = sn.a.h(mVar2, -555621481, R.string.gender_not_specified, mVar2);
                            } else {
                                c15 = 5526;
                                i30 = -555626350;
                                i34 = R.string.lbl_gender_male;
                            }
                            p1Var10 = p1Var8;
                            zB3 = mVar2.B(p1Var10);
                            objQ15 = mVar2.q();
                            if (zB3 || objQ15 == c2565a2) {
                                objQ15 = new c(p1Var10, 13);
                                mVar2.K(objQ15);
                            }
                            mVar3 = mVar2;
                            sVar3 = sVar2;
                            c2565a3 = c2565a2;
                            p2Var3.h(strQ13, strH2, null, null, null, false, false, null, null, null, (e23.a) objQ15, mVar3, 0, 0, 1020);
                            c22.x0.f23314a.getClass();
                            String strW5 = gl1.d.W(c22.x0.j8);
                            bool2 = jVar2.f137455e;
                            if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                                i35 = -555609331;
                                i36 = R.string.common_yes;
                            } else {
                                if (p005kotlin.jvm.internal.s.g(bool2, Boolean.FALSE)) {
                                    i35 = -555607252;
                                    i36 = R.string.common_no;
                                } else {
                                    if (bool2 == null) {
                                        throw n23.j.m(mVar3, -555610787);
                                    }
                                    strH3 = sn.a.h(mVar3, -555605225, R.string.gender_not_specified, mVar3);
                                }
                                p3.p1 p1Var13 = p1Var7;
                                zB4 = mVar3.B(p1Var13);
                                objQ16 = mVar3.q();
                                if (zB4) {
                                    c2565a4 = c2565a3;
                                } else {
                                    c2565a4 = c2565a3;
                                    if (objQ16 == c2565a4) {
                                    }
                                    p3.m.a.C2565a c2565a7 = c2565a4;
                                    p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                                    String strQ14 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                    String strQ15 = gl1.y.Q(mVar3, R.string.lbl_help);
                                    aVar11 = aVar7;
                                    zB5 = mVar3.B(aVar11);
                                    objQ17 = mVar3.q();
                                    if (zB5 || objQ17 == c2565a7) {
                                        objQ17 = new ux1.g(aVar11, 14);
                                        mVar3.K(objQ17);
                                    }
                                    l72.r1.c(strQ14, strQ15, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                                    if (zBooleanValue) {
                                        mVar3.C(-43373787);
                                        String strW6 = gl1.d.W(c22.x0.G8);
                                        String strW7 = gl1.d.W(c22.x0.f23740z8);
                                        z3.e eVarC = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                        zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                        objQ18 = mVar3.q();
                                        if (zR3 || objQ18 == c2565a7) {
                                            objQ18 = new ug2.h(25, sVar3, jVar2);
                                            mVar3.K(objQ18);
                                        }
                                        p2Var3.h(strW6, strW7, null, null, null, false, false, null, eVarC, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(-42740488);
                                        mVar3.f();
                                    }
                                    mVar3.y();
                                    p3.x1 x1Var4 = p3.n.f135158a;
                                }
                                objQ16 = new c(p1Var13, 14);
                                mVar3.K(objQ16);
                                p3.m.a.C2565a c2565a8 = c2565a4;
                                p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                                String strQ16 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                String strQ17 = gl1.y.Q(mVar3, R.string.lbl_help);
                                aVar11 = aVar7;
                                zB5 = mVar3.B(aVar11);
                                objQ17 = mVar3.q();
                                if (zB5) {
                                    objQ17 = new ux1.g(aVar11, 14);
                                    mVar3.K(objQ17);
                                } else {
                                    objQ17 = new ux1.g(aVar11, 14);
                                    mVar3.K(objQ17);
                                }
                                l72.r1.c(strQ16, strQ17, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                                if (zBooleanValue) {
                                    mVar3.C(-43373787);
                                    String strW8 = gl1.d.W(c22.x0.G8);
                                    String strW9 = gl1.d.W(c22.x0.f23740z8);
                                    z3.e eVarC2 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                    zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                    objQ18 = mVar3.q();
                                    if (zR3) {
                                        objQ18 = new ug2.h(25, sVar3, jVar2);
                                        mVar3.K(objQ18);
                                    } else {
                                        objQ18 = new ug2.h(25, sVar3, jVar2);
                                        mVar3.K(objQ18);
                                    }
                                    p2Var3.h(strW8, strW9, null, null, null, false, false, null, eVarC2, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-42740488);
                                    mVar3.f();
                                }
                                mVar3.y();
                                p3.x1 x1Var5 = p3.n.f135158a;
                            }
                            strH3 = sn.a.h(mVar3, i35, i36, mVar3);
                            p3.p1 p1Var14 = p1Var7;
                            zB4 = mVar3.B(p1Var14);
                            objQ16 = mVar3.q();
                            if (zB4) {
                                c2565a4 = c2565a3;
                                if (objQ16 == c2565a4) {
                                }
                                p3.m.a.C2565a c2565a9 = c2565a4;
                                p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                                String strQ18 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                String strQ19 = gl1.y.Q(mVar3, R.string.lbl_help);
                                aVar11 = aVar7;
                                zB5 = mVar3.B(aVar11);
                                objQ17 = mVar3.q();
                                if (zB5) {
                                    objQ17 = new ux1.g(aVar11, 14);
                                    mVar3.K(objQ17);
                                } else {
                                    objQ17 = new ux1.g(aVar11, 14);
                                    mVar3.K(objQ17);
                                }
                                l72.r1.c(strQ18, strQ19, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                                if (zBooleanValue) {
                                    mVar3.C(-43373787);
                                    String strW10 = gl1.d.W(c22.x0.G8);
                                    String strW11 = gl1.d.W(c22.x0.f23740z8);
                                    z3.e eVarC3 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                    zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                    objQ18 = mVar3.q();
                                    if (zR3) {
                                        objQ18 = new ug2.h(25, sVar3, jVar2);
                                        mVar3.K(objQ18);
                                    } else {
                                        objQ18 = new ug2.h(25, sVar3, jVar2);
                                        mVar3.K(objQ18);
                                    }
                                    p2Var3.h(strW10, strW11, null, null, null, false, false, null, eVarC3, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-42740488);
                                    mVar3.f();
                                }
                                mVar3.y();
                                p3.x1 x1Var6 = p3.n.f135158a;
                            } else {
                                c2565a4 = c2565a3;
                            }
                            objQ16 = new c(p1Var14, 14);
                            mVar3.K(objQ16);
                            p3.m.a.C2565a c2565a10 = c2565a4;
                            p2Var3.h(strW5, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                            String strQ110 = gl1.y.Q(mVar3, R.string.activity_options_title);
                            String strQ111 = gl1.y.Q(mVar3, R.string.lbl_help);
                            aVar11 = aVar7;
                            zB5 = mVar3.B(aVar11);
                            objQ17 = mVar3.q();
                            if (zB5) {
                                objQ17 = new ux1.g(aVar11, 14);
                                mVar3.K(objQ17);
                            } else {
                                objQ17 = new ux1.g(aVar11, 14);
                                mVar3.K(objQ17);
                            }
                            l72.r1.c(strQ110, strQ111, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                            if (zBooleanValue) {
                                mVar3.C(-43373787);
                                String strW12 = gl1.d.W(c22.x0.G8);
                                String strW13 = gl1.d.W(c22.x0.f23740z8);
                                z3.e eVarC4 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                objQ18 = mVar3.q();
                                if (zR3) {
                                    objQ18 = new ug2.h(25, sVar3, jVar2);
                                    mVar3.K(objQ18);
                                } else {
                                    objQ18 = new ug2.h(25, sVar3, jVar2);
                                    mVar3.K(objQ18);
                                }
                                p2Var3.h(strW12, strW13, null, null, null, false, false, null, eVarC4, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                mVar3.f();
                            } else {
                                mVar3.C(-42740488);
                                mVar3.f();
                            }
                            mVar3.y();
                            p3.x1 x1Var7 = p3.n.f135158a;
                        } else {
                            c15 = 5526;
                            i30 = -555623756;
                            i34 = R.string.lbl_gender_female;
                        }
                        strH2 = sn.a.h(mVar2, i30, i34, mVar2);
                        p1Var10 = p1Var8;
                        zB3 = mVar2.B(p1Var10);
                        objQ15 = mVar2.q();
                        if (zB3) {
                            objQ15 = new c(p1Var10, 13);
                            mVar2.K(objQ15);
                        } else {
                            objQ15 = new c(p1Var10, 13);
                            mVar2.K(objQ15);
                        }
                        mVar3 = mVar2;
                        sVar3 = sVar2;
                        c2565a3 = c2565a2;
                        p2Var3.h(strQ13, strH2, null, null, null, false, false, null, null, null, (e23.a) objQ15, mVar3, 0, 0, 1020);
                        c22.x0.f23314a.getClass();
                        String strW14 = gl1.d.W(c22.x0.j8);
                        bool2 = jVar2.f137455e;
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            i35 = -555609331;
                            i36 = R.string.common_yes;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(bool2, Boolean.FALSE)) {
                                i35 = -555607252;
                                i36 = R.string.common_no;
                            } else {
                                if (bool2 == null) {
                                    throw n23.j.m(mVar3, -555610787);
                                }
                                strH3 = sn.a.h(mVar3, -555605225, R.string.gender_not_specified, mVar3);
                            }
                            p3.p1 p1Var15 = p1Var7;
                            zB4 = mVar3.B(p1Var15);
                            objQ16 = mVar3.q();
                            if (zB4) {
                                c2565a4 = c2565a3;
                                if (objQ16 == c2565a4) {
                                }
                                p3.m.a.C2565a c2565a11 = c2565a4;
                                p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                                String strQ112 = gl1.y.Q(mVar3, R.string.activity_options_title);
                                String strQ113 = gl1.y.Q(mVar3, R.string.lbl_help);
                                aVar11 = aVar7;
                                zB5 = mVar3.B(aVar11);
                                objQ17 = mVar3.q();
                                if (zB5) {
                                    objQ17 = new ux1.g(aVar11, 14);
                                    mVar3.K(objQ17);
                                } else {
                                    objQ17 = new ux1.g(aVar11, 14);
                                    mVar3.K(objQ17);
                                }
                                l72.r1.c(strQ112, strQ113, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                                if (zBooleanValue) {
                                    mVar3.C(-43373787);
                                    String strW15 = gl1.d.W(c22.x0.G8);
                                    String strW16 = gl1.d.W(c22.x0.f23740z8);
                                    z3.e eVarC5 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                    zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                    objQ18 = mVar3.q();
                                    if (zR3) {
                                        objQ18 = new ug2.h(25, sVar3, jVar2);
                                        mVar3.K(objQ18);
                                    } else {
                                        objQ18 = new ug2.h(25, sVar3, jVar2);
                                        mVar3.K(objQ18);
                                    }
                                    p2Var3.h(strW15, strW16, null, null, null, false, false, null, eVarC5, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-42740488);
                                    mVar3.f();
                                }
                                mVar3.y();
                                p3.x1 x1Var8 = p3.n.f135158a;
                            } else {
                                c2565a4 = c2565a3;
                            }
                            objQ16 = new c(p1Var15, 14);
                            mVar3.K(objQ16);
                            p3.m.a.C2565a c2565a12 = c2565a4;
                            p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                            String strQ114 = gl1.y.Q(mVar3, R.string.activity_options_title);
                            String strQ115 = gl1.y.Q(mVar3, R.string.lbl_help);
                            aVar11 = aVar7;
                            zB5 = mVar3.B(aVar11);
                            objQ17 = mVar3.q();
                            if (zB5) {
                                objQ17 = new ux1.g(aVar11, 14);
                                mVar3.K(objQ17);
                            } else {
                                objQ17 = new ux1.g(aVar11, 14);
                                mVar3.K(objQ17);
                            }
                            l72.r1.c(strQ114, strQ115, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                            if (zBooleanValue) {
                                mVar3.C(-43373787);
                                String strW17 = gl1.d.W(c22.x0.G8);
                                String strW18 = gl1.d.W(c22.x0.f23740z8);
                                z3.e eVarC6 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                objQ18 = mVar3.q();
                                if (zR3) {
                                    objQ18 = new ug2.h(25, sVar3, jVar2);
                                    mVar3.K(objQ18);
                                } else {
                                    objQ18 = new ug2.h(25, sVar3, jVar2);
                                    mVar3.K(objQ18);
                                }
                                p2Var3.h(strW17, strW18, null, null, null, false, false, null, eVarC6, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                mVar3.f();
                            } else {
                                mVar3.C(-42740488);
                                mVar3.f();
                            }
                            mVar3.y();
                            p3.x1 x1Var9 = p3.n.f135158a;
                        }
                        strH3 = sn.a.h(mVar3, i35, i36, mVar3);
                        p3.p1 p1Var16 = p1Var7;
                        zB4 = mVar3.B(p1Var16);
                        objQ16 = mVar3.q();
                        if (zB4) {
                            c2565a4 = c2565a3;
                            if (objQ16 == c2565a4) {
                            }
                            p3.m.a.C2565a c2565a13 = c2565a4;
                            p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                            String strQ116 = gl1.y.Q(mVar3, R.string.activity_options_title);
                            String strQ117 = gl1.y.Q(mVar3, R.string.lbl_help);
                            aVar11 = aVar7;
                            zB5 = mVar3.B(aVar11);
                            objQ17 = mVar3.q();
                            if (zB5) {
                                objQ17 = new ux1.g(aVar11, 14);
                                mVar3.K(objQ17);
                            } else {
                                objQ17 = new ux1.g(aVar11, 14);
                                mVar3.K(objQ17);
                            }
                            l72.r1.c(strQ116, strQ117, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                            if (zBooleanValue) {
                                mVar3.C(-43373787);
                                String strW19 = gl1.d.W(c22.x0.G8);
                                String strW110 = gl1.d.W(c22.x0.f23740z8);
                                z3.e eVarC7 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                                zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                                objQ18 = mVar3.q();
                                if (zR3) {
                                    objQ18 = new ug2.h(25, sVar3, jVar2);
                                    mVar3.K(objQ18);
                                } else {
                                    objQ18 = new ug2.h(25, sVar3, jVar2);
                                    mVar3.K(objQ18);
                                }
                                p2Var3.h(strW19, strW110, null, null, null, false, false, null, eVarC7, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                                mVar3.f();
                            } else {
                                mVar3.C(-42740488);
                                mVar3.f();
                            }
                            mVar3.y();
                            p3.x1 x1Var10 = p3.n.f135158a;
                        } else {
                            c2565a4 = c2565a3;
                        }
                        objQ16 = new c(p1Var16, 14);
                        mVar3.K(objQ16);
                        p3.m.a.C2565a c2565a14 = c2565a4;
                        p2Var3.h(strW14, strH3, null, null, null, false, false, null, null, null, (e23.a) objQ16, mVar3, 0, 0, 1020);
                        String strQ118 = gl1.y.Q(mVar3, R.string.activity_options_title);
                        String strQ119 = gl1.y.Q(mVar3, R.string.lbl_help);
                        aVar11 = aVar7;
                        zB5 = mVar3.B(aVar11);
                        objQ17 = mVar3.q();
                        if (zB5) {
                            objQ17 = new ux1.g(aVar11, 14);
                            mVar3.K(objQ17);
                        } else {
                            objQ17 = new ux1.g(aVar11, 14);
                            mVar3.K(objQ17);
                        }
                        l72.r1.c(strQ118, strQ119, (e23.a) objQ17, false, null, null, mVar3, 0, 56);
                        if (zBooleanValue) {
                            mVar3.C(-43373787);
                            String strW111 = gl1.d.W(c22.x0.G8);
                            String strW112 = gl1.d.W(c22.x0.f23740z8);
                            z3.e eVarC8 = z3.f.c(1548606569, new tr2.o(jVar2, 24), mVar3);
                            zR3 = mVar3.r(sVar3) | mVar3.B(jVar2);
                            objQ18 = mVar3.q();
                            if (zR3) {
                                objQ18 = new ug2.h(25, sVar3, jVar2);
                                mVar3.K(objQ18);
                            } else {
                                objQ18 = new ug2.h(25, sVar3, jVar2);
                                mVar3.K(objQ18);
                            }
                            p2Var3.h(strW111, strW112, null, null, null, false, false, null, eVarC8, null, (e23.a) objQ18, mVar3, 100663296, 0, 764);
                            mVar3.f();
                        } else {
                            mVar3.C(-42740488);
                            mVar3.f();
                        }
                        mVar3.y();
                        p3.x1 x1Var11 = p3.n.f135158a;
                    } else {
                        mVar4.e();
                    }
                    return Unit.INSTANCE;
                }
            }, r14), r17, 197040, 8);
            r28 = r17;
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            p3.o0 o0Var4 = o0VarE;
            o0Var4.e();
            r28 = o0Var4;
        }
        p2 p2VarI0 = r28.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new go.a(oVar, jVar, dVar, sVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, i14, i15, 2);
        }
    }

    public static final void c(Uri uri, String str, e23.a aVar, p3.m mVar, int i14) {
        Object objA;
        h4.r.a aVar2;
        boolean z14;
        boolean z15;
        int i15;
        int i16;
        boolean z16;
        p3.o0 o0VarE = mVar.E(1455649440);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(uri) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarD = u1.w.d(c2.l.A(rVarF, 0.0f, eVar.f97921f, 1), false, null, null, aVar, 15);
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
            if (uri == null) {
                o0VarE.C(-1706224916);
                if (str == null) {
                    o0VarE.C(-1706224917);
                    o0VarE.g0(false);
                    z16 = false;
                    objA = null;
                } else {
                    o0VarE.C(-1706224916);
                    wf.f.a aVar7 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar7.f184930c = str;
                    aVar7.c(xf.g.f190618c);
                    objA = aVar7.a();
                    z16 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-609229865);
                o0VarE.g0(false);
                objA = uri;
            }
            if (objA != null) {
                o0VarE.C(-1705998368);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_edit_photo);
                h4.r rVarB2 = l4.k.b(x2.q(aVar3, f14), hVar);
                f5.k.f68985a.getClass();
                Object obj = objA;
                aVar2 = aVar3;
                z15 = true;
                jf.r.a(obj, strQ, rVarB2, null, null, f5.k.a.f68987b, null, o0VarE, 1572864, 1976);
                o0VarE = o0VarE;
                z14 = false;
                o0VarE.g0(false);
            } else {
                aVar2 = aVar3;
                z14 = false;
                z15 = true;
                o0VarE.C(-1705621315);
                i7.a(n5.c.a(R.drawable.ic_dog_profile_placeholder, o0VarE, 0), gl1.y.Q(o0VarE, R.string.lbl_edit_photo), x2.q(aVar2, 40), eVar3.f77787j, o0VarE, 384, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
            if (uri == null && str == null) {
                i15 = -1495512037;
                i16 = R.string.social_group_add_a_photo;
            } else {
                i15 = -1495584887;
                i16 = R.string.lbl_change;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, z14);
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            long jA = d92.b.a(o0VarE).k().a();
            bVar.getClass();
            p3.o0 o0Var = o0VarE;
            mh.c(strJ, c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131064);
            o0VarE = o0Var;
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(uri, str, aVar, i14, 25);
        }
    }

    public static final Calendar d(String str) {
        if (d53.w.J(str)) {
            str = null;
        }
        if (str != null) {
            if (new d53.k("^\\d{4}-\\d{2}-\\d{2}$").d(str)) {
                Calendar calendar = Calendar.getInstance();
                LocalDate localDate = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDate(str);
                calendar.set(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
                return calendar;
            }
            if (new d53.k("^\\d{4}-\\d{2}$").d(str)) {
                Calendar calendar2 = Calendar.getInstance();
                List listW = d53.w.W(str, new String[]{"-"});
                calendar2.set(Integer.parseInt((String) listW.get(0)), Integer.parseInt((String) listW.get(1)) - 1, 1);
                return calendar2;
            }
        }
        return null;
    }
}
