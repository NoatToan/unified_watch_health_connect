package po;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import c2.k3;
import c2.n3;
import c2.q3;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.k0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import p3.y3;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138971a;

        static {
            int[] iArr = new int[a03.y.values().length];
            try {
                iArr[a03.y.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a03.y.FullyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a03.y.IntermediatelyExpanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a03.y.SlightlyExpanded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f138971a = iArr;
        }
    }

    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1939801152);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            c2.b0 b0Var = c2.b0.f22601a;
            g6.f.a aVar3 = g6.f.f75994b;
            c2.l.f(x2.h(aVar, 16), o0VarE);
            yq.f.b(true, true, o0VarE, 54);
            e5.t(aVar, 8, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pa0.a(i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void b(t2 t2Var, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, h4.d.b bVar, long j8, p3.m mVar, int i14, int i15) {
        int i16;
        h4.d.b bVar2;
        boolean z14;
        h4.d.b bVar3;
        p2 p2VarI0;
        h4.d.b bVar4;
        h4.d.b bVar5;
        int i17;
        o0 o0VarE = mVar.E(-1011927056);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i18 = i15 & 4;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                bVar2 = bVar;
                i16 |= o0VarE.B(bVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.l(j8)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i18 != 0) {
                        h4.d.f81522a.getClass();
                        bVar4 = h4.d.a.f81536n;
                    } else {
                        bVar4 = bVar2;
                    }
                    bVar5 = bVar4;
                } else {
                    o0VarE.e();
                    bVar5 = bVar2;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                int i19 = (i16 & 14) | 3072;
                int i24 = i16 >> 3;
                d2.f16532a.e(t2Var, rVar, bVar5, z3.f.c(594216386, new es1.a(str, j8, 3), o0VarE), o0VarE, i19 | (i24 & 112) | (i24 & 896), 0);
                bVar3 = bVar5;
            } else {
                o0VarE.e();
                bVar3 = bVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.a(t2Var, str, rVar, bVar3, j8, i14, i15);
            }
        }
        i16 |= 3072;
        bVar2 = bVar;
        if ((i14 & 24576) == 0) {
            if (o0VarE.l(j8)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i18 != 0) {
                    h4.d.f81522a.getClass();
                    bVar4 = h4.d.a.f81536n;
                } else {
                    bVar4 = bVar2;
                }
                bVar5 = bVar4;
            } else {
                if (i18 != 0) {
                    h4.d.f81522a.getClass();
                    bVar4 = h4.d.a.f81536n;
                } else {
                    bVar4 = bVar2;
                }
                bVar5 = bVar4;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            int i110 = (i16 & 14) | 3072;
            int i25 = i16 >> 3;
            d2.f16532a.e(t2Var, rVar, bVar5, z3.f.c(594216386, new es1.a(str, j8, 3), o0VarE), o0VarE, i110 | (i25 & 112) | (i25 & 896), 0);
            bVar3 = bVar5;
        } else {
            o0VarE.e();
            bVar3 = bVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.a(t2Var, str, rVar, bVar3, j8, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x032c  */
    /* JADX WARN: Code duplicated, block: B:103:0x033c  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
    /* JADX WARN: Code duplicated, block: B:81:0x025c  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:94:0x02df  */
    /* JADX WARN: Code duplicated, block: B:99:0x0318  */
    @SuppressLint({"UseOfNonLambdaOffsetOverload"})
    public static final void c(ArrayList arrayList, a03.y yVar, final a03.p pVar, final ph1.d dVar, boolean z14, c cVar, p3.m mVar, int i14) {
        o0 o0Var;
        c cVar2;
        Object next;
        Throwable th3;
        ps.x1 x1Var;
        final float fW;
        final Context context;
        Object objQ;
        p3.m.a.C2565a c2565a;
        o53.b0 b0Var;
        final e2.i0 i0VarA;
        Object objQ2;
        x3 x3Var;
        boolean z15;
        Object objQ3;
        final n1 n1Var;
        final String strQ;
        final String strQ2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        final boolean z16;
        h5.g.a.b bVar;
        c2.b0 b0Var2;
        ps.x1 x1Var2;
        o0 o0Var2;
        o53.b0 b0Var3;
        p3.m.a.C2565a c2565a2;
        boolean z17;
        boolean z18;
        final ps.x1 x1Var3;
        int i15;
        boolean z19;
        boolean z24;
        final o53.b0 b0Var4;
        boolean zR;
        Object objQ4;
        boolean z25;
        o0 o0Var3;
        ArrayList arrayList2 = arrayList;
        c cVar3 = cVar;
        o0 o0VarE = mVar.E(410295802);
        int i16 = i14 | (o0VarE.r(arrayList2) ? 4 : 2) | (o0VarE.k(yVar.ordinal()) ? 32 : 16) | (o0VarE.B(pVar) ? 256 : 128) | (o0VarE.r(dVar) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.r(cVar3) ? 131072 : 65536);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var4 = p3.n.f135158a;
            int i18 = k3.f22728a;
            float f22739d = n3.c(q3.a(o0VarE), o0VarE).getF22739d();
            final yq.c cVar4 = new yq.c(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Double elapsedDuration = ((ps.x1) next).getElapsedDuration();
                    double dDoubleValue = elapsedDuration != null ? elapsedDuration.doubleValue() : Double.MAX_VALUE;
                    Iterator it3 = it;
                    double d14 = dDoubleValue;
                    while (true) {
                        Object next2 = it3.next();
                        Double elapsedDuration2 = ((ps.x1) next2).getElapsedDuration();
                        double dDoubleValue2 = elapsedDuration2 != null ? elapsedDuration2.doubleValue() : Double.MAX_VALUE;
                        th3 = null;
                        if (Double.compare(d14, dDoubleValue2) > 0) {
                            d14 = dDoubleValue2;
                            next = next2;
                        }
                        if (!it3.hasNext()) {
                            break;
                        }
                        arrayList2 = arrayList;
                        i16 = i16;
                        i17 = i17;
                        it3 = it3;
                        cVar3 = cVar3;
                    }
                }
                x1Var = (ps.x1) next;
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                Context context2 = (Context) o0VarE.A(y3Var);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                fW = w02.b0.w(c22.b.c(context2, w02.b0.g(j92.b.f97901d.f97903b, o0VarE), 1.3f), o0VarE);
                context = (Context) o0VarE.A(y3Var);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var = (o53.b0) objQ;
                i0VarA = k0.a(i17, i17, 3, o0VarE);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.f(new ct1.c(i0VarA, 9));
                    o0VarE.K(objQ2);
                }
                x3Var = (x3) objQ2;
                if (yVar == a03.y.FullyExpanded) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(-1, o0VarE);
                }
                n1Var = (n1) objQ3;
                strQ = gl1.y.Q(o0VarE, R.string.lbl_selected);
                strQ2 = gl1.y.Q(o0VarE, R.string.lbl_not_selected);
                h4.r rVarD = x2.d(c2.l.C(u1.n.e(h4.r.S, d92.b.a(o0VarE).c().b(), m1.f128891a), 0.0f, 0.0f, 0.0f, f22739d, 7), 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var5 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                z16 = z15;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var2 = c2.b0.f22601a;
                if (z16) {
                    o0VarE.C(1334450352);
                    boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
                    v.f138985a.getClass();
                    x1Var2 = x1Var;
                    c2565a2 = c2565a;
                    b0Var3 = b0Var;
                    z17 = false;
                    z18 = true;
                    r1.c0.c(b0Var2, zBooleanValue, null, null, null, null, v.f138986b, o0VarE, 1572870, 30);
                    o0Var2 = o0VarE;
                    o0Var2.g0(false);
                } else {
                    x1Var2 = x1Var;
                    o0Var2 = o0VarE;
                    b0Var3 = b0Var;
                    c2565a2 = c2565a;
                    z17 = false;
                    z18 = true;
                    o0Var2.C(1334563006);
                    a(o0Var2, 0);
                    o0Var2.g0(false);
                }
                x1Var3 = x1Var2;
                boolean zI = o0Var2.i(r29) | o0Var2.r(r28) | o0Var2.r(r24) | o0Var2.h(z16) | o0Var2.r(arrayList2) | o0Var2.r(x1Var3);
                i15 = i16;
                if ((i15 & 7168) == 2048) {
                    z19 = z18;
                } else {
                    z19 = z17;
                }
                boolean z26 = zI | z19;
                if ((i15 & 896) == 256) {
                    z24 = z18;
                } else {
                    z24 = z17;
                }
                b0Var4 = b0Var3;
                zR = z26 | z24 | o0Var2.r(b0Var4) | o0Var2.B(i0VarA) | o0Var2.B(strQ) | o0Var2.B(strQ2);
                objQ4 = o0Var2.q();
                if (!zR || objQ4 == c2565a2) {
                    z25 = z17;
                    o0Var3 = o0Var2;
                    final ArrayList arrayList3 = arrayList2;
                    e23.l lVar = new e23.l() { // from class: po.m
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            m mVar2 = this;
                            e2.f0 f0Var = (e2.f0) obj;
                            f0Var.getClass();
                            float f14 = fW;
                            final yq.c cVar5 = cVar4;
                            boolean z27 = true;
                            z3.e eVar = new z3.e(-1022173267, true, new fx0.g(f14, cVar5, context, 4));
                            Throwable th4 = null;
                            if (z16) {
                                e2.f0.e(f0Var, null, new z3.e(72395144, true, new p003ji0.p(eVar, 1)), 3);
                            } else {
                                e2.f0.b(f0Var, null, new z3.e(-1761450901, true, new aa2.k(eVar, 7)), 3);
                            }
                            final int i19 = 0;
                            for (Object obj2 : arrayList3) {
                                int i24 = i19 + 1;
                                if (i19 < 0) {
                                    Throwable th5 = th4;
                                    p13.x.q();
                                    throw th5;
                                }
                                final ps.x1 x1Var6 = (ps.x1) obj2;
                                final float f15 = f14;
                                final ps.x1 x1Var7 = x1Var3;
                                boolean z28 = z27;
                                final ph1.d dVar2 = dVar;
                                final a03.p pVar2 = pVar;
                                final o53.b0 b0Var5 = b0Var4;
                                final e2.i0 i0Var = i0VarA;
                                final String str = strQ;
                                final String str2 = strQ2;
                                final n1 n1Var2 = n1Var;
                                e2.f0.b(f0Var, null, new z3.e(85834553, z28, new e23.q() { // from class: po.n
                                    /* JADX WARN: Code duplicated, block: B:16:0x00f9  */
                                    /* JADX WARN: Code duplicated, block: B:32:0x01b5  */
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
                                    @Override // e23.q
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        Object t2Var;
                                        n1 n1Var3;
                                        long jB;
                                        int i25;
                                        n1 n1Var4;
                                        p3.m mVar3 = (p3.m) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((e2.d) obj3).getClass();
                                        if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var8 = p3.n.f135158a;
                                            ps.x1 x1Var9 = x1Var7;
                                            final ps.x1 x1Var10 = x1Var6;
                                            final boolean zG = p005kotlin.jvm.internal.s.g(x1Var9, x1Var10);
                                            StringBuilder sb3 = new StringBuilder();
                                            if (zG) {
                                                mVar3.C(1591796038);
                                                sb3.append(gl1.y.Q(mVar3, R.string.lbl_fastest));
                                                sb3.append(",");
                                                mVar3.f();
                                            } else {
                                                mVar3.C(1591921929);
                                                mVar3.f();
                                            }
                                            int i26 = i19;
                                            sb3.append(gl1.y.P(R.string.lbl_enduro_split_index, new Object[]{String.valueOf(i26 + 1)}, mVar3));
                                            sb3.append(",");
                                            sb3.append(gl1.y.Q(mVar3, R.string.lbl_time));
                                            sb3.append(StringUtils.SPACE);
                                            Double elapsedDuration3 = x1Var10.getElapsedDuration();
                                            final yq.c cVar6 = cVar5;
                                            sb3.append(cVar6.d(elapsedDuration3));
                                            sb3.append(",");
                                            sb3.append(gl1.y.Q(mVar3, R.string.lbl_avg_speed_full));
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(cVar6.b(x1Var10.getAverageSpeed(), true));
                                            sb3.append(",");
                                            sb3.append(gl1.y.Q(mVar3, R.string.lbl_distance));
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(cVar6.a(x1Var10.getDistance(), true));
                                            d2 d2Var = d2.f16532a;
                                            h4.r.a aVar2 = h4.r.S;
                                            boolean zK = mVar3.k(i26);
                                            ph1.d dVar3 = dVar2;
                                            boolean zB = zK | mVar3.B(dVar3);
                                            a03.p pVar3 = pVar2;
                                            boolean zB2 = zB | mVar3.B(pVar3);
                                            o53.b0 b0Var6 = b0Var5;
                                            boolean zR2 = zB2 | mVar3.r(b0Var6);
                                            e2.i0 i0Var2 = i0Var;
                                            boolean zB3 = zR2 | mVar3.B(i0Var2);
                                            Object objQ5 = mVar3.q();
                                            n1 n1Var5 = n1Var2;
                                            p3.m.a aVar3 = p3.m.f135153a;
                                            if (zB3) {
                                                t2Var = new i3.t2(i26, dVar3, pVar3, b0Var6, n1Var5, i0Var2);
                                                n1Var3 = n1Var5;
                                                mVar3.K(t2Var);
                                            } else {
                                                aVar3.getClass();
                                                if (objQ5 == p3.m.a.f135155b) {
                                                    t2Var = new i3.t2(i26, dVar3, pVar3, b0Var6, n1Var5, i0Var2);
                                                    n1Var3 = n1Var5;
                                                    mVar3.K(t2Var);
                                                } else {
                                                    t2Var = objQ5;
                                                    n1Var3 = n1Var5;
                                                }
                                            }
                                            h4.r rVarD2 = u1.w.d(aVar2, false, null, null, (e23.a) t2Var, 15);
                                            if (n1Var3.getIntValue() == i26) {
                                                mVar3.C(-1155672247);
                                                d92.b.f58623a.getClass();
                                                jB = d92.b.a(mVar3).i().a().b();
                                                mVar3.f();
                                            } else if (i26 % 2 == 0) {
                                                mVar3.C(-1155602714);
                                                d92.b.f58623a.getClass();
                                                jB = d92.b.a(mVar3).c().f();
                                                mVar3.f();
                                            } else {
                                                mVar3.C(-1155550169);
                                                d92.b.f58623a.getClass();
                                                jB = d92.b.a(mVar3).c().b();
                                                mVar3.f();
                                            }
                                            h4.r rVarE = u1.n.e(rVarD2, jB, m1.f128891a);
                                            boolean zK2 = mVar3.k(i26);
                                            String str3 = str;
                                            boolean zB4 = zK2 | mVar3.B(str3);
                                            String str4 = str2;
                                            boolean zB5 = zB4 | mVar3.B(str4) | mVar3.r(sb3);
                                            Object objQ6 = mVar3.q();
                                            if (zB5) {
                                                i25 = i26;
                                                n1Var4 = n1Var3;
                                                b81.b bVar2 = new b81.b(i25, str3, str4, sb3, n1Var4);
                                                mVar3.K(bVar2);
                                                objQ6 = bVar2;
                                            } else {
                                                aVar3.getClass();
                                                if (objQ6 == p3.m.a.f135155b) {
                                                    i25 = i26;
                                                    n1Var4 = n1Var3;
                                                    b81.b bVar3 = new b81.b(i25, str3, str4, sb3, n1Var4);
                                                    mVar3.K(bVar3);
                                                    objQ6 = bVar3;
                                                } else {
                                                    i25 = i26;
                                                    n1Var4 = n1Var3;
                                                }
                                            }
                                            h4.r rVarB = p5.v.b(rVarE, (e23.l) objQ6);
                                            final float f16 = f15;
                                            final int i27 = i25;
                                            final n1 n1Var6 = n1Var4;
                                            d2Var.g(i25, 384, 0, rVarB, mVar3, z3.f.c(-1707048100, new e23.q() { // from class: po.o
                                                @Override // e23.q
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    long jB2;
                                                    final long jB3;
                                                    t2 t2Var2 = (t2) obj6;
                                                    p3.m mVar4 = (p3.m) obj7;
                                                    int iIntValue2 = ((Integer) obj8).intValue();
                                                    t2Var2.getClass();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= mVar4.B(t2Var2) ? 4 : 2;
                                                    }
                                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                        x1 x1Var11 = p3.n.f135158a;
                                                        n1 n1Var7 = n1Var6;
                                                        int intValue = n1Var7.getIntValue();
                                                        int i28 = i27;
                                                        if (intValue == i28) {
                                                            mVar4.C(-579621077);
                                                            d92.b.f58623a.getClass();
                                                            jB2 = d92.b.a(mVar4).k().f63527d;
                                                            mVar4.f();
                                                        } else {
                                                            mVar4.C(-579572593);
                                                            d92.b.f58623a.getClass();
                                                            jB2 = d92.b.a(mVar4).k().b();
                                                            mVar4.f();
                                                        }
                                                        long j8 = jB2;
                                                        if (n1Var7.getIntValue() == i28) {
                                                            mVar4.C(-480047);
                                                            d92.b.f58623a.getClass();
                                                            jB3 = d92.b.a(mVar4).f().f63508c;
                                                            mVar4.f();
                                                        } else {
                                                            mVar4.C(-431563);
                                                            d92.b.f58623a.getClass();
                                                            jB3 = d92.b.a(mVar4).f().b();
                                                            mVar4.f();
                                                        }
                                                        int i29 = iIntValue2;
                                                        d2 d2Var2 = d2.f16532a;
                                                        h4.r.a aVar4 = h4.r.S;
                                                        float f17 = 16;
                                                        g6.f.a aVar5 = g6.f.f75994b;
                                                        final float f18 = f16;
                                                        h4.r rVarA = c2.l.A(x2.u(aVar4, f18 + f17), 0.0f, f17, 1);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.a aVar6 = h4.d.a.f81537o;
                                                        final boolean z29 = zG;
                                                        z3.e eVarC = z3.f.c(-1132965558, new e23.p() { // from class: po.p
                                                            @Override // e23.p
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                p3.m mVar5 = (p3.m) obj9;
                                                                int iIntValue3 = ((Integer) obj10).intValue();
                                                                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    x1 x1Var12 = p3.n.f135158a;
                                                                    if (z29) {
                                                                        mVar5.C(1971088907);
                                                                        yq.f.a(f18, jB3, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(1971193656);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, mVar4);
                                                        int i30 = i29 & 14;
                                                        d2Var2.e(t2Var2, rVarA, aVar6, eVarC, mVar4, i30 | 3456, 0);
                                                        r.b(t2Var2, String.valueOf(i28 + 1), t2Var2.a(r.e(), 0.5f, true), null, j8, mVar4, i30, 4);
                                                        ps.x1 x1Var12 = x1Var10;
                                                        Double elapsedDuration4 = x1Var12.getElapsedDuration();
                                                        yq.c cVar7 = cVar6;
                                                        String strC = cVar7.c(elapsedDuration4);
                                                        h4.r rVarA2 = t2Var2.a(r.e(), 1.0f, true);
                                                        h4.g.a aVar7 = h4.d.a.f81538p;
                                                        int i34 = i30 | 3072;
                                                        r.b(t2Var2, strC, rVarA2, aVar7, j8, mVar4, i34, 0);
                                                        r.b(t2Var2, cVar7.b(x1Var12.getAverageSpeed(), false), t2Var2.a(r.e(), 1.0f, true), aVar7, j8, mVar4, i34, 0);
                                                        r.b(t2Var2, cVar7.a(x1Var12.getDistance(), false), t2Var2.a(r.e(), 1.0f, true), aVar7, j8, mVar4, i34, 0);
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, mVar3));
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                                z27 = z28;
                                th4 = null;
                                f14 = f15;
                                i19 = i24;
                                mVar2 = this;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(lVar);
                    objQ4 = lVar;
                } else {
                    o0Var3 = o0Var2;
                    z25 = z17;
                }
                o0Var = o0Var3;
                e2.c.b(null, i0VarA, null, null, null, null, false, null, (e23.l) objQ4, o0Var, 0, 509);
                if (z14) {
                    o0Var.C(1341420423);
                    cVar2 = cVar;
                    cr.s.a(cVar2, o0Var, (i15 >> 15) & 14);
                    o0Var.g0(z25);
                } else {
                    cVar2 = cVar;
                    o0Var.C(1341473278);
                    o0Var.g0(z25);
                }
                o0Var.g0(true);
            } else {
                next = null;
            }
            th3 = null;
            x1Var = (ps.x1) next;
            y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
            Context context3 = (Context) o0VarE.A(y3Var2);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            fW = w02.b0.w(c22.b.c(context3, w02.b0.g(j92.b.f97901d.f97903b, o0VarE), 1.3f), o0VarE);
            context = (Context) o0VarE.A(y3Var2);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var = (o53.b0) objQ;
            i0VarA = k0.a(i17, i17, 3, o0VarE);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.f(new ct1.c(i0VarA, 9));
                o0VarE.K(objQ2);
            }
            x3Var = (x3) objQ2;
            if (yVar == a03.y.FullyExpanded) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(-1, o0VarE);
            }
            n1Var = (n1) objQ3;
            strQ = gl1.y.Q(o0VarE, R.string.lbl_selected);
            strQ2 = gl1.y.Q(o0VarE, R.string.lbl_not_selected);
            h4.r rVarD2 = x2.d(c2.l.C(u1.n.e(h4.r.S, d92.b.a(o0VarE).c().b(), m1.f128891a), 0.0f, 0.0f, 0.0f, f22739d, 7), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var6 = p3.n.f135158a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD2, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            z16 = z15;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0Var2 = c2.b0.f22601a;
            if (z16) {
                o0VarE.C(1334450352);
                boolean zBooleanValue2 = ((Boolean) x3Var.getF182175a()).booleanValue();
                v.f138985a.getClass();
                x1Var2 = x1Var;
                c2565a2 = c2565a;
                b0Var3 = b0Var;
                z17 = false;
                z18 = true;
                r1.c0.c(b0Var2, zBooleanValue2, null, null, null, null, v.f138986b, o0VarE, 1572870, 30);
                o0Var2 = o0VarE;
                o0Var2.g0(false);
            } else {
                x1Var2 = x1Var;
                o0Var2 = o0VarE;
                b0Var3 = b0Var;
                c2565a2 = c2565a;
                z17 = false;
                z18 = true;
                o0Var2.C(1334563006);
                a(o0Var2, 0);
                o0Var2.g0(false);
            }
            x1Var3 = x1Var2;
            boolean zI2 = o0Var2.i(r29) | o0Var2.r(r28) | o0Var2.r(r24) | o0Var2.h(z16) | o0Var2.r(arrayList2) | o0Var2.r(x1Var3);
            i15 = i16;
            if ((i15 & 7168) == 2048) {
                z19 = z18;
            } else {
                z19 = z17;
            }
            boolean z27 = zI2 | z19;
            if ((i15 & 896) == 256) {
                z24 = z18;
            } else {
                z24 = z17;
            }
            b0Var4 = b0Var3;
            zR = z27 | z24 | o0Var2.r(b0Var4) | o0Var2.B(i0VarA) | o0Var2.B(strQ) | o0Var2.B(strQ2);
            objQ4 = o0Var2.q();
            if (zR) {
                z25 = z17;
                o0Var3 = o0Var2;
                final ArrayList arrayList4 = arrayList2;
                e23.l lVar2 = new e23.l() { // from class: po.m
                    @Override // e23.l
                    public final Object invoke(Object obj) throws Throwable {
                        m mVar2 = this;
                        e2.f0 f0Var = (e2.f0) obj;
                        f0Var.getClass();
                        float f14 = fW;
                        final yq.c cVar5 = cVar4;
                        boolean z28 = true;
                        z3.e eVar = new z3.e(-1022173267, true, new fx0.g(f14, cVar5, context, 4));
                        Throwable th4 = null;
                        if (z16) {
                            e2.f0.e(f0Var, null, new z3.e(72395144, true, new p003ji0.p(eVar, 1)), 3);
                        } else {
                            e2.f0.b(f0Var, null, new z3.e(-1761450901, true, new aa2.k(eVar, 7)), 3);
                        }
                        final int i19 = 0;
                        for (Object obj2 : arrayList4) {
                            int i24 = i19 + 1;
                            if (i19 < 0) {
                                Throwable th5 = th4;
                                p13.x.q();
                                throw th5;
                            }
                            final ps.x1 x1Var7 = (ps.x1) obj2;
                            final float f15 = f14;
                            final ps.x1 x1Var8 = x1Var3;
                            boolean z29 = z28;
                            final ph1.d dVar2 = dVar;
                            final a03.p pVar2 = pVar;
                            final o53.b0 b0Var5 = b0Var4;
                            final e2.i0 i0Var = i0VarA;
                            final String str = strQ;
                            final String str2 = strQ2;
                            final n1 n1Var2 = n1Var;
                            e2.f0.b(f0Var, null, new z3.e(85834553, z29, new e23.q() { // from class: po.n
                                /* JADX WARN: Code duplicated, block: B:16:0x00f9  */
                                /* JADX WARN: Code duplicated, block: B:32:0x01b5  */
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
                                @Override // e23.q
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    Object t2Var;
                                    n1 n1Var3;
                                    long jB;
                                    int i25;
                                    n1 n1Var4;
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((e2.d) obj3).getClass();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var9 = p3.n.f135158a;
                                        ps.x1 x1Var10 = x1Var8;
                                        final ps.x1 x1Var11 = x1Var7;
                                        final boolean zG = p005kotlin.jvm.internal.s.g(x1Var10, x1Var11);
                                        StringBuilder sb3 = new StringBuilder();
                                        if (zG) {
                                            mVar3.C(1591796038);
                                            sb3.append(gl1.y.Q(mVar3, R.string.lbl_fastest));
                                            sb3.append(",");
                                            mVar3.f();
                                        } else {
                                            mVar3.C(1591921929);
                                            mVar3.f();
                                        }
                                        int i26 = i19;
                                        sb3.append(gl1.y.P(R.string.lbl_enduro_split_index, new Object[]{String.valueOf(i26 + 1)}, mVar3));
                                        sb3.append(",");
                                        sb3.append(gl1.y.Q(mVar3, R.string.lbl_time));
                                        sb3.append(StringUtils.SPACE);
                                        Double elapsedDuration3 = x1Var11.getElapsedDuration();
                                        final yq.c cVar6 = cVar5;
                                        sb3.append(cVar6.d(elapsedDuration3));
                                        sb3.append(",");
                                        sb3.append(gl1.y.Q(mVar3, R.string.lbl_avg_speed_full));
                                        sb3.append(StringUtils.SPACE);
                                        sb3.append(cVar6.b(x1Var11.getAverageSpeed(), true));
                                        sb3.append(",");
                                        sb3.append(gl1.y.Q(mVar3, R.string.lbl_distance));
                                        sb3.append(StringUtils.SPACE);
                                        sb3.append(cVar6.a(x1Var11.getDistance(), true));
                                        d2 d2Var = d2.f16532a;
                                        h4.r.a aVar2 = h4.r.S;
                                        boolean zK = mVar3.k(i26);
                                        ph1.d dVar3 = dVar2;
                                        boolean zB = zK | mVar3.B(dVar3);
                                        a03.p pVar3 = pVar2;
                                        boolean zB2 = zB | mVar3.B(pVar3);
                                        o53.b0 b0Var6 = b0Var5;
                                        boolean zR2 = zB2 | mVar3.r(b0Var6);
                                        e2.i0 i0Var2 = i0Var;
                                        boolean zB3 = zR2 | mVar3.B(i0Var2);
                                        Object objQ5 = mVar3.q();
                                        n1 n1Var5 = n1Var2;
                                        p3.m.a aVar3 = p3.m.f135153a;
                                        if (zB3) {
                                            t2Var = new i3.t2(i26, dVar3, pVar3, b0Var6, n1Var5, i0Var2);
                                            n1Var3 = n1Var5;
                                            mVar3.K(t2Var);
                                        } else {
                                            aVar3.getClass();
                                            if (objQ5 == p3.m.a.f135155b) {
                                                t2Var = new i3.t2(i26, dVar3, pVar3, b0Var6, n1Var5, i0Var2);
                                                n1Var3 = n1Var5;
                                                mVar3.K(t2Var);
                                            } else {
                                                t2Var = objQ5;
                                                n1Var3 = n1Var5;
                                            }
                                        }
                                        h4.r rVarD3 = u1.w.d(aVar2, false, null, null, (e23.a) t2Var, 15);
                                        if (n1Var3.getIntValue() == i26) {
                                            mVar3.C(-1155672247);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar3).i().a().b();
                                            mVar3.f();
                                        } else if (i26 % 2 == 0) {
                                            mVar3.C(-1155602714);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar3).c().f();
                                            mVar3.f();
                                        } else {
                                            mVar3.C(-1155550169);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar3).c().b();
                                            mVar3.f();
                                        }
                                        h4.r rVarE = u1.n.e(rVarD3, jB, m1.f128891a);
                                        boolean zK2 = mVar3.k(i26);
                                        String str3 = str;
                                        boolean zB4 = zK2 | mVar3.B(str3);
                                        String str4 = str2;
                                        boolean zB5 = zB4 | mVar3.B(str4) | mVar3.r(sb3);
                                        Object objQ6 = mVar3.q();
                                        if (zB5) {
                                            i25 = i26;
                                            n1Var4 = n1Var3;
                                            b81.b bVar3 = new b81.b(i25, str3, str4, sb3, n1Var4);
                                            mVar3.K(bVar3);
                                            objQ6 = bVar3;
                                        } else {
                                            aVar3.getClass();
                                            if (objQ6 == p3.m.a.f135155b) {
                                                i25 = i26;
                                                n1Var4 = n1Var3;
                                                b81.b bVar4 = new b81.b(i25, str3, str4, sb3, n1Var4);
                                                mVar3.K(bVar4);
                                                objQ6 = bVar4;
                                            } else {
                                                i25 = i26;
                                                n1Var4 = n1Var3;
                                            }
                                        }
                                        h4.r rVarB = p5.v.b(rVarE, (e23.l) objQ6);
                                        final float f16 = f15;
                                        final int i27 = i25;
                                        final n1 n1Var6 = n1Var4;
                                        d2Var.g(i25, 384, 0, rVarB, mVar3, z3.f.c(-1707048100, new e23.q() { // from class: po.o
                                            @Override // e23.q
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                long jB2;
                                                final long jB3;
                                                t2 t2Var2 = (t2) obj6;
                                                p3.m mVar4 = (p3.m) obj7;
                                                int iIntValue2 = ((Integer) obj8).intValue();
                                                t2Var2.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= mVar4.B(t2Var2) ? 4 : 2;
                                                }
                                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    x1 x1Var12 = p3.n.f135158a;
                                                    n1 n1Var7 = n1Var6;
                                                    int intValue = n1Var7.getIntValue();
                                                    int i28 = i27;
                                                    if (intValue == i28) {
                                                        mVar4.C(-579621077);
                                                        d92.b.f58623a.getClass();
                                                        jB2 = d92.b.a(mVar4).k().f63527d;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(-579572593);
                                                        d92.b.f58623a.getClass();
                                                        jB2 = d92.b.a(mVar4).k().b();
                                                        mVar4.f();
                                                    }
                                                    long j8 = jB2;
                                                    if (n1Var7.getIntValue() == i28) {
                                                        mVar4.C(-480047);
                                                        d92.b.f58623a.getClass();
                                                        jB3 = d92.b.a(mVar4).f().f63508c;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(-431563);
                                                        d92.b.f58623a.getClass();
                                                        jB3 = d92.b.a(mVar4).f().b();
                                                        mVar4.f();
                                                    }
                                                    int i29 = iIntValue2;
                                                    d2 d2Var2 = d2.f16532a;
                                                    h4.r.a aVar4 = h4.r.S;
                                                    float f17 = 16;
                                                    g6.f.a aVar5 = g6.f.f75994b;
                                                    final float f18 = f16;
                                                    h4.r rVarA = c2.l.A(x2.u(aVar4, f18 + f17), 0.0f, f17, 1);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.a aVar6 = h4.d.a.f81537o;
                                                    final boolean z210 = zG;
                                                    z3.e eVarC = z3.f.c(-1132965558, new e23.p() { // from class: po.p
                                                        @Override // e23.p
                                                        public final Object invoke(Object obj9, Object obj10) {
                                                            p3.m mVar5 = (p3.m) obj9;
                                                            int iIntValue3 = ((Integer) obj10).intValue();
                                                            if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                x1 x1Var13 = p3.n.f135158a;
                                                                if (z210) {
                                                                    mVar5.C(1971088907);
                                                                    yq.f.a(f18, jB3, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(1971193656);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, mVar4);
                                                    int i30 = i29 & 14;
                                                    d2Var2.e(t2Var2, rVarA, aVar6, eVarC, mVar4, i30 | 3456, 0);
                                                    r.b(t2Var2, String.valueOf(i28 + 1), t2Var2.a(r.e(), 0.5f, true), null, j8, mVar4, i30, 4);
                                                    ps.x1 x1Var13 = x1Var11;
                                                    Double elapsedDuration4 = x1Var13.getElapsedDuration();
                                                    yq.c cVar7 = cVar6;
                                                    String strC = cVar7.c(elapsedDuration4);
                                                    h4.r rVarA2 = t2Var2.a(r.e(), 1.0f, true);
                                                    h4.g.a aVar7 = h4.d.a.f81538p;
                                                    int i34 = i30 | 3072;
                                                    r.b(t2Var2, strC, rVarA2, aVar7, j8, mVar4, i34, 0);
                                                    r.b(t2Var2, cVar7.b(x1Var13.getAverageSpeed(), false), t2Var2.a(r.e(), 1.0f, true), aVar7, j8, mVar4, i34, 0);
                                                    r.b(t2Var2, cVar7.a(x1Var13.getDistance(), false), t2Var2.a(r.e(), 1.0f, true), aVar7, j8, mVar4, i34, 0);
                                                } else {
                                                    mVar4.e();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, mVar3));
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            z28 = z29;
                            th4 = null;
                            f14 = f15;
                            i19 = i24;
                            mVar2 = this;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var3.K(lVar2);
                objQ4 = lVar2;
            } else {
                z25 = z17;
                o0Var3 = o0Var2;
                final ArrayList arrayList5 = arrayList2;
                e23.l lVar3 = new e23.l() { // from class: po.m
                    @Override // e23.l
                    public final Object invoke(Object obj) throws Throwable {
                        m mVar2 = this;
                        e2.f0 f0Var = (e2.f0) obj;
                        f0Var.getClass();
                        float f14 = fW;
                        final yq.c cVar5 = cVar4;
                        boolean z28 = true;
                        z3.e eVar = new z3.e(-1022173267, true, new fx0.g(f14, cVar5, context, 4));
                        Throwable th4 = null;
                        if (z16) {
                            e2.f0.e(f0Var, null, new z3.e(72395144, true, new p003ji0.p(eVar, 1)), 3);
                        } else {
                            e2.f0.b(f0Var, null, new z3.e(-1761450901, true, new aa2.k(eVar, 7)), 3);
                        }
                        final int i19 = 0;
                        for (Object obj2 : arrayList5) {
                            int i24 = i19 + 1;
                            if (i19 < 0) {
                                Throwable th5 = th4;
                                p13.x.q();
                                throw th5;
                            }
                            final ps.x1 x1Var7 = (ps.x1) obj2;
                            final float f15 = f14;
                            final ps.x1 x1Var8 = x1Var3;
                            boolean z29 = z28;
                            final ph1.d dVar2 = dVar;
                            final a03.p pVar2 = pVar;
                            final o53.b0 b0Var5 = b0Var4;
                            final e2.i0 i0Var = i0VarA;
                            final String str = strQ;
                            final String str2 = strQ2;
                            final n1 n1Var2 = n1Var;
                            e2.f0.b(f0Var, null, new z3.e(85834553, z29, new e23.q() { // from class: po.n
                                /* JADX WARN: Code duplicated, block: B:16:0x00f9  */
                                /* JADX WARN: Code duplicated, block: B:32:0x01b5  */
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
                                @Override // e23.q
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    Object t2Var;
                                    n1 n1Var3;
                                    long jB;
                                    int i25;
                                    n1 n1Var4;
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((e2.d) obj3).getClass();
                                    if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var9 = p3.n.f135158a;
                                        ps.x1 x1Var10 = x1Var8;
                                        final ps.x1 x1Var11 = x1Var7;
                                        final boolean zG = p005kotlin.jvm.internal.s.g(x1Var10, x1Var11);
                                        StringBuilder sb3 = new StringBuilder();
                                        if (zG) {
                                            mVar3.C(1591796038);
                                            sb3.append(gl1.y.Q(mVar3, R.string.lbl_fastest));
                                            sb3.append(",");
                                            mVar3.f();
                                        } else {
                                            mVar3.C(1591921929);
                                            mVar3.f();
                                        }
                                        int i26 = i19;
                                        sb3.append(gl1.y.P(R.string.lbl_enduro_split_index, new Object[]{String.valueOf(i26 + 1)}, mVar3));
                                        sb3.append(",");
                                        sb3.append(gl1.y.Q(mVar3, R.string.lbl_time));
                                        sb3.append(StringUtils.SPACE);
                                        Double elapsedDuration3 = x1Var11.getElapsedDuration();
                                        final yq.c cVar6 = cVar5;
                                        sb3.append(cVar6.d(elapsedDuration3));
                                        sb3.append(",");
                                        sb3.append(gl1.y.Q(mVar3, R.string.lbl_avg_speed_full));
                                        sb3.append(StringUtils.SPACE);
                                        sb3.append(cVar6.b(x1Var11.getAverageSpeed(), true));
                                        sb3.append(",");
                                        sb3.append(gl1.y.Q(mVar3, R.string.lbl_distance));
                                        sb3.append(StringUtils.SPACE);
                                        sb3.append(cVar6.a(x1Var11.getDistance(), true));
                                        d2 d2Var = d2.f16532a;
                                        h4.r.a aVar2 = h4.r.S;
                                        boolean zK = mVar3.k(i26);
                                        ph1.d dVar3 = dVar2;
                                        boolean zB = zK | mVar3.B(dVar3);
                                        a03.p pVar3 = pVar2;
                                        boolean zB2 = zB | mVar3.B(pVar3);
                                        o53.b0 b0Var6 = b0Var5;
                                        boolean zR2 = zB2 | mVar3.r(b0Var6);
                                        e2.i0 i0Var2 = i0Var;
                                        boolean zB3 = zR2 | mVar3.B(i0Var2);
                                        Object objQ5 = mVar3.q();
                                        n1 n1Var5 = n1Var2;
                                        p3.m.a aVar3 = p3.m.f135153a;
                                        if (zB3) {
                                            t2Var = new i3.t2(i26, dVar3, pVar3, b0Var6, n1Var5, i0Var2);
                                            n1Var3 = n1Var5;
                                            mVar3.K(t2Var);
                                        } else {
                                            aVar3.getClass();
                                            if (objQ5 == p3.m.a.f135155b) {
                                                t2Var = new i3.t2(i26, dVar3, pVar3, b0Var6, n1Var5, i0Var2);
                                                n1Var3 = n1Var5;
                                                mVar3.K(t2Var);
                                            } else {
                                                t2Var = objQ5;
                                                n1Var3 = n1Var5;
                                            }
                                        }
                                        h4.r rVarD3 = u1.w.d(aVar2, false, null, null, (e23.a) t2Var, 15);
                                        if (n1Var3.getIntValue() == i26) {
                                            mVar3.C(-1155672247);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar3).i().a().b();
                                            mVar3.f();
                                        } else if (i26 % 2 == 0) {
                                            mVar3.C(-1155602714);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar3).c().f();
                                            mVar3.f();
                                        } else {
                                            mVar3.C(-1155550169);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar3).c().b();
                                            mVar3.f();
                                        }
                                        h4.r rVarE = u1.n.e(rVarD3, jB, m1.f128891a);
                                        boolean zK2 = mVar3.k(i26);
                                        String str3 = str;
                                        boolean zB4 = zK2 | mVar3.B(str3);
                                        String str4 = str2;
                                        boolean zB5 = zB4 | mVar3.B(str4) | mVar3.r(sb3);
                                        Object objQ6 = mVar3.q();
                                        if (zB5) {
                                            i25 = i26;
                                            n1Var4 = n1Var3;
                                            b81.b bVar4 = new b81.b(i25, str3, str4, sb3, n1Var4);
                                            mVar3.K(bVar4);
                                            objQ6 = bVar4;
                                        } else {
                                            aVar3.getClass();
                                            if (objQ6 == p3.m.a.f135155b) {
                                                i25 = i26;
                                                n1Var4 = n1Var3;
                                                b81.b bVar5 = new b81.b(i25, str3, str4, sb3, n1Var4);
                                                mVar3.K(bVar5);
                                                objQ6 = bVar5;
                                            } else {
                                                i25 = i26;
                                                n1Var4 = n1Var3;
                                            }
                                        }
                                        h4.r rVarB = p5.v.b(rVarE, (e23.l) objQ6);
                                        final float f16 = f15;
                                        final int i27 = i25;
                                        final n1 n1Var6 = n1Var4;
                                        d2Var.g(i25, 384, 0, rVarB, mVar3, z3.f.c(-1707048100, new e23.q() { // from class: po.o
                                            @Override // e23.q
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                long jB2;
                                                final long jB3;
                                                t2 t2Var2 = (t2) obj6;
                                                p3.m mVar4 = (p3.m) obj7;
                                                int iIntValue2 = ((Integer) obj8).intValue();
                                                t2Var2.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= mVar4.B(t2Var2) ? 4 : 2;
                                                }
                                                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    x1 x1Var12 = p3.n.f135158a;
                                                    n1 n1Var7 = n1Var6;
                                                    int intValue = n1Var7.getIntValue();
                                                    int i28 = i27;
                                                    if (intValue == i28) {
                                                        mVar4.C(-579621077);
                                                        d92.b.f58623a.getClass();
                                                        jB2 = d92.b.a(mVar4).k().f63527d;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(-579572593);
                                                        d92.b.f58623a.getClass();
                                                        jB2 = d92.b.a(mVar4).k().b();
                                                        mVar4.f();
                                                    }
                                                    long j8 = jB2;
                                                    if (n1Var7.getIntValue() == i28) {
                                                        mVar4.C(-480047);
                                                        d92.b.f58623a.getClass();
                                                        jB3 = d92.b.a(mVar4).f().f63508c;
                                                        mVar4.f();
                                                    } else {
                                                        mVar4.C(-431563);
                                                        d92.b.f58623a.getClass();
                                                        jB3 = d92.b.a(mVar4).f().b();
                                                        mVar4.f();
                                                    }
                                                    int i29 = iIntValue2;
                                                    d2 d2Var2 = d2.f16532a;
                                                    h4.r.a aVar4 = h4.r.S;
                                                    float f17 = 16;
                                                    g6.f.a aVar5 = g6.f.f75994b;
                                                    final float f18 = f16;
                                                    h4.r rVarA = c2.l.A(x2.u(aVar4, f18 + f17), 0.0f, f17, 1);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.a aVar6 = h4.d.a.f81537o;
                                                    final boolean z210 = zG;
                                                    z3.e eVarC = z3.f.c(-1132965558, new e23.p() { // from class: po.p
                                                        @Override // e23.p
                                                        public final Object invoke(Object obj9, Object obj10) {
                                                            p3.m mVar5 = (p3.m) obj9;
                                                            int iIntValue3 = ((Integer) obj10).intValue();
                                                            if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                x1 x1Var13 = p3.n.f135158a;
                                                                if (z210) {
                                                                    mVar5.C(1971088907);
                                                                    yq.f.a(f18, jB3, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(1971193656);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, mVar4);
                                                    int i30 = i29 & 14;
                                                    d2Var2.e(t2Var2, rVarA, aVar6, eVarC, mVar4, i30 | 3456, 0);
                                                    r.b(t2Var2, String.valueOf(i28 + 1), t2Var2.a(r.e(), 0.5f, true), null, j8, mVar4, i30, 4);
                                                    ps.x1 x1Var13 = x1Var11;
                                                    Double elapsedDuration4 = x1Var13.getElapsedDuration();
                                                    yq.c cVar7 = cVar6;
                                                    String strC = cVar7.c(elapsedDuration4);
                                                    h4.r rVarA2 = t2Var2.a(r.e(), 1.0f, true);
                                                    h4.g.a aVar7 = h4.d.a.f81538p;
                                                    int i34 = i30 | 3072;
                                                    r.b(t2Var2, strC, rVarA2, aVar7, j8, mVar4, i34, 0);
                                                    r.b(t2Var2, cVar7.b(x1Var13.getAverageSpeed(), false), t2Var2.a(r.e(), 1.0f, true), aVar7, j8, mVar4, i34, 0);
                                                    r.b(t2Var2, cVar7.a(x1Var13.getDistance(), false), t2Var2.a(r.e(), 1.0f, true), aVar7, j8, mVar4, i34, 0);
                                                } else {
                                                    mVar4.e();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, mVar3));
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            z28 = z29;
                            th4 = null;
                            f14 = f15;
                            i19 = i24;
                            mVar2 = this;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var3.K(lVar3);
                objQ4 = lVar3;
            }
            o0Var = o0Var3;
            e2.c.b(null, i0VarA, null, null, null, null, false, null, (e23.l) objQ4, o0Var, 0, 509);
            if (z14) {
                o0Var.C(1341420423);
                cVar2 = cVar;
                cr.s.a(cVar2, o0Var, (i15 >> 15) & 14);
                o0Var.g0(z25);
            } else {
                cVar2 = cVar;
                o0Var.C(1341473278);
                o0Var.g0(z25);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            cVar2 = cVar3;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(arrayList, yVar, pVar, dVar, z14, cVar2, i14, 21);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r25v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v1 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r25v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v2 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r28v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v1 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r28v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v2 ??, new type: boolean
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: boolean
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
    public static final void d(int r37, java.util.ArrayList r38, ph1.d r39, po.b r40, boolean r41, po.c r42, e23.a r43, p3.m r44, int r45) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.r.d(int, java.util.ArrayList, ph1.d, po.b, boolean, po.c, e23.a, p3.m, int):void");
    }

    @SuppressLint({"ModifierFactoryExtensionFunction"})
    public static final h4.r e() {
        g6.f.a aVar = g6.f.f75994b;
        return c2.l.z(h4.r.S, 8, 16);
    }
}
