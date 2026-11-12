package ho;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import l72.c3;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84671a;

        static {
            int[] iArr = new int[eo.e.values().length];
            try {
                iArr[eo.e.MINIMUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eo.e.MAXIMUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84671a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x0130  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
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
    public static final void a(h4.r rVar, double d14, Double d15, Double d16, jo.a aVar, jo.a aVar2, e23.q qVar, p3.m mVar, int i14) {
        ?? r14;
        Object obj;
        Object obj2;
        Double d17;
        double dDoubleValue;
        Double d18;
        double dDoubleValue2;
        double d19;
        double d24;
        Object obj3;
        p1 p1Var;
        p1 p1Var2;
        Object obj4;
        ?? r15;
        Object obj5;
        rVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-1896758649);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.m(0.0d) ? 32 : 16) | (o0VarE.m(d14) ? 256 : 128) | (o0VarE.B(d15) ? 2048 : 1024) | (o0VarE.B(d16) ? 16384 : 8192) | (o0VarE.B(aVar) ? 131072 : 65536) | (o0VarE.B(aVar2) ? 1048576 : 524288) | (o0VarE.r(qVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                obj = objQ;
                c2 c2VarN = p0.n(d15);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    obj = objQ;
                    c2 c2VarN2 = p0.n(d15);
                    o0VarE.K(c2VarN2);
                    obj = c2VarN2;
                }
            }
            obj = objQ;
            p1 p1Var3 = (p1) obj;
            boolean z15 = (57344 & i15) == 16384;
            Object objQ2 = o0VarE.q();
            if (z15) {
                obj2 = objQ2;
                c2 c2VarN3 = p0.n(d16);
                o0VarE.K(c2VarN3);
                obj2 = c2VarN3;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj2 = objQ2;
                    c2 c2VarN4 = p0.n(d16);
                    o0VarE.K(c2VarN4);
                    obj2 = c2VarN4;
                }
            }
            obj2 = objQ2;
            p1 p1Var4 = (p1) obj2;
            int i16 = 458752 & i15;
            int i17 = 3670016 & i15;
            boolean zB = o0VarE.B((Double) p1Var3.getF182175a()) | o0VarE.B((Double) p1Var4.getF182175a()) | (i16 == 131072) | (i17 == 1048576);
            Object objQ3 = o0VarE.q();
            if (zB) {
                obj3 = objQ3;
                d17 = (Double) p1Var3.getF182175a();
                if (d17 != null) {
                    dDoubleValue = d17.doubleValue();
                    if (dDoubleValue < 0.0d) {
                        dDoubleValue = 0.0d;
                    }
                } else {
                    dDoubleValue = 0.0d;
                }
                d18 = (Double) p1Var4.getF182175a();
                if (d18 != null) {
                    dDoubleValue2 = d18.doubleValue();
                    if (dDoubleValue2 > d14) {
                        dDoubleValue2 = d14;
                    }
                } else {
                    dDoubleValue2 = d14;
                }
                if (aVar != null) {
                    d19 = dDoubleValue2;
                } else {
                    d19 = dDoubleValue;
                }
                if (aVar2 != null) {
                    d24 = dDoubleValue;
                } else {
                    d24 = dDoubleValue2;
                }
                c2 c2VarN5 = p0.n(new j23.d(d19, d24));
                o0VarE.K(c2VarN5);
                obj3 = c2VarN5;
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    obj3 = objQ3;
                    d17 = (Double) p1Var3.getF182175a();
                    if (d17 != null) {
                        dDoubleValue = d17.doubleValue();
                        if (dDoubleValue < 0.0d) {
                            dDoubleValue = 0.0d;
                        }
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    d18 = (Double) p1Var4.getF182175a();
                    if (d18 != null) {
                        dDoubleValue2 = d18.doubleValue();
                        if (dDoubleValue2 > d14) {
                            dDoubleValue2 = d14;
                        }
                    } else {
                        dDoubleValue2 = d14;
                    }
                    if (aVar != null) {
                        d19 = dDoubleValue2;
                    } else {
                        d19 = dDoubleValue;
                    }
                    if (aVar2 != null) {
                        d24 = dDoubleValue;
                    } else {
                        d24 = dDoubleValue2;
                    }
                    c2 c2VarN6 = p0.n(new j23.d(d19, d24));
                    o0VarE.K(c2VarN6);
                    obj3 = c2VarN6;
                }
            }
            obj3 = objQ3;
            p1 p1Var5 = (p1) obj3;
            Object objQ4 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            Object obj6 = objQ4;
            if (objQ4 == c2565a) {
                c2 c2VarN7 = p0.n(null);
                o0VarE.K(c2VarN7);
                obj6 = c2VarN7;
            }
            p1 p1Var6 = (p1) obj6;
            Double d25 = (Double) p1Var3.getF182175a();
            Double d26 = (Double) p1Var4.getF182175a();
            eo.e eVar = (eo.e) p1Var6.getF182175a();
            boolean zB2 = ((i15 & 29360128) == 8388608) | o0VarE.B(p1Var3) | o0VarE.B(p1Var4);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new r(qVar, p1Var3, p1Var4, p1Var6, null);
                p1Var = p1Var3;
                p1Var2 = p1Var4;
                o0VarE.K(objQ5);
            } else {
                p1Var = p1Var3;
                p1Var2 = p1Var4;
            }
            l0.g(d25, d26, eVar, (e23.p) objQ5, o0VarE);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            p1 p1Var7 = p1Var;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c3 c3Var = c3.f110949a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarF = x2.f(aVar5, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
            j23.e eVar2 = new j23.e((float) ((Number) ((j23.f) p1Var5.getF182175a()).getStart()).doubleValue(), (float) ((Number) ((j23.f) p1Var5.getF182175a()).b()).doubleValue());
            j23.e eVar3 = new j23.e((float) 0.0d, (float) d14);
            boolean zB3 = o0VarE.B(p1Var7) | ((i15 & 112) == 32) | o0VarE.B(p1Var2);
            int i18 = i15 & 896;
            boolean z16 = zB3 | (i18 == 256);
            Object objQ6 = o0VarE.q();
            Object obj7 = objQ6;
            if (z16 || objQ6 == c2565a) {
                ba2.a aVar6 = new ba2.a(d14, p1Var7, p1Var2);
                o0VarE.K(aVar6);
                obj7 = aVar6;
            }
            e23.l<? super j23.f<Float>, Unit> lVar = (e23.l) obj7;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                ha0.a aVar7 = new ha0.a(18);
                o0VarE.K(aVar7);
                obj4 = aVar7;
            } else {
                obj4 = objQ7;
            }
            e23.a<Unit> aVar8 = (e23.a) obj4;
            p1 p1Var8 = p1Var2;
            c3Var.b(eVar2, lVar, rVarC2, false, eVar3, 0, null, null, aVar8, o0VarE, 100663296, 232);
            ?? r16 = o0VarE;
            h4.r rVarF2 = x2.f(aVar5, 1.0f);
            Double d27 = (Double) p1Var7.getF182175a();
            Double d28 = (Double) p1Var8.getF182175a();
            String strValueOf = String.valueOf((int) 0.0d);
            String string = context.getString(R.string.lbl_string_with_positive_sign_end, String.valueOf((int) d14));
            boolean zB4 = r16.B(p1Var7) | r16.B(p1Var8);
            Object objQ8 = r16.q();
            if (zB4 || objQ8 == c2565a) {
                r15 = 1;
                k kVar2 = new k(p1Var6, p1Var7, p1Var8, 1);
                r16.K(kVar2);
                obj5 = kVar2;
            } else {
                r15 = 1;
                obj5 = objQ8;
            }
            e23.q qVar2 = (e23.q) obj5;
            int i19 = (r16.r(context) ? 1 : 0) | (i18 == 256 ? r15 : 0);
            Object objQ9 = r16.q();
            Object obj8 = objQ9;
            if (i19 != 0 || objQ9 == c2565a) {
                l lVar2 = new l(context, d14, r15);
                r16.K(lVar2);
                obj8 = lVar2;
            }
            go.e.a(rVarF2, d27, d28, strValueOf, string, aVar, aVar2, qVar2, (e23.p) obj8, r16, i16 | 6 | i17);
            r16.g0(r15);
            r14 = r16;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar, d14, d15, d16, aVar, aVar2, qVar, i14, 1);
        }
    }
}
