package rk0;

import am.h1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c2.n3;
import c2.t2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f72.n1;
import i3.e5;
import i3.fe;
import i3.mh;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import o4.m1;
import o53.c2;
import o72.z2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import u1.a2;
import v62.fa;
import v62.k6;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153088a;

        static {
            int[] iArr = new int[gg1.o0.values().length];
            try {
                iArr[gg1.o0.STATUTE_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg1.o0.STATUTE_UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg1.o0.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f153088a = iArr;
        }
    }

    public static final void a(h4.r rVar, final f0 f0Var, gg1.o0 o0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(173205885);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(f0Var) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(o0Var.ordinal()) ? 256 : 128;
        }
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            c2.b0 b0Var = c2.b0.f22601a;
            l72.x0 x0Var = l72.x0.f111346a;
            z3.e eVarC = z3.f.c(1468036236, new o72.b(24, o0Var, f0Var), o0VarE);
            int i18 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(null, eVarC, o0VarE, i18, 1);
            x0Var.e(null, z3.f.c(75171907, new e23.q() { // from class: rk0.r
                /* JADX WARN: Code duplicated, block: B:49:0x0144  */
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
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strP1;
                    int i19 = i16;
                    f0 f0Var2 = f0Var;
                    t2 t2Var = (t2) obj;
                    switch (i19) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                                Integer num = f0Var2.f153118r;
                                String str = integerInstance.format(Integer.valueOf(num != null ? num.intValue() : 0));
                                str.getClass();
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_activites);
                                int i24 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                                x0Var2.a(i24, 124, null, t2Var, null, null, str, strQ, null, null, mVar2);
                                Long l14 = f0Var2.f153116p;
                                if (l14 == null) {
                                    strP1 = NumberFormat.getIntegerInstance().format(0L);
                                } else {
                                    if (l14.longValue() <= 0) {
                                        l14 = null;
                                    }
                                    if (l14 != null) {
                                        long jLongValue = l14.longValue();
                                        l3.f23124b.getClass();
                                        strP1 = l3.a.p1(jLongValue);
                                    } else {
                                        strP1 = NumberFormat.getIntegerInstance().format(0L);
                                    }
                                }
                                String str2 = strP1;
                                str2.getClass();
                                x0Var2.a(i24, 124, null, t2Var, null, null, str2, gl1.y.Q(mVar2, R.string.hours_of_use), null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                int i25 = iIntValue2;
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                                Long l15 = f0Var2.f153119t;
                                String str3 = integerInstance2.format(l15 != null ? l15.longValue() : 0L);
                                str3.getClass();
                                String strQ2 = gl1.y.Q(mVar3, R.string.days_of_use);
                                int i26 = (i25 & 14) | (l72.x0.f111348c << 24);
                                x0Var3.a(i26, 124, null, t2Var, null, null, str3, strQ2, null, null, mVar3);
                                pi0.e eVar = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                                b63.o oVar = f0Var2.f153110j;
                                if (oVar == null) {
                                    mVar3.C(-407281790);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-407281789);
                                    x0Var3.a(i26, 124, null, t2Var, null, null, eVar.d(g22.l.h(oVar), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), gl1.y.Q(mVar3, R.string.lbl_gear_first_use), null, null, mVar3);
                                    mVar3.f();
                                }
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i18, 1);
            x0Var.e(null, z3.f.c(198075844, new e23.q() { // from class: rk0.r
                /* JADX WARN: Code duplicated, block: B:49:0x0144  */
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
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strP1;
                    int i19 = i17;
                    f0 f0Var2 = f0Var;
                    t2 t2Var = (t2) obj;
                    switch (i19) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                                Integer num = f0Var2.f153118r;
                                String str = integerInstance.format(Integer.valueOf(num != null ? num.intValue() : 0));
                                str.getClass();
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_activites);
                                int i24 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                                x0Var2.a(i24, 124, null, t2Var, null, null, str, strQ, null, null, mVar2);
                                Long l14 = f0Var2.f153116p;
                                if (l14 == null) {
                                    strP1 = NumberFormat.getIntegerInstance().format(0L);
                                } else {
                                    if (l14.longValue() <= 0) {
                                        l14 = null;
                                    }
                                    if (l14 != null) {
                                        long jLongValue = l14.longValue();
                                        l3.f23124b.getClass();
                                        strP1 = l3.a.p1(jLongValue);
                                    } else {
                                        strP1 = NumberFormat.getIntegerInstance().format(0L);
                                    }
                                }
                                String str2 = strP1;
                                str2.getClass();
                                x0Var2.a(i24, 124, null, t2Var, null, null, str2, gl1.y.Q(mVar2, R.string.hours_of_use), null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                int i25 = iIntValue2;
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                                Long l15 = f0Var2.f153119t;
                                String str3 = integerInstance2.format(l15 != null ? l15.longValue() : 0L);
                                str3.getClass();
                                String strQ2 = gl1.y.Q(mVar3, R.string.days_of_use);
                                int i26 = (i25 & 14) | (l72.x0.f111348c << 24);
                                x0Var3.a(i26, 124, null, t2Var, null, null, str3, strQ2, null, null, mVar3);
                                pi0.e eVar = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                                b63.o oVar = f0Var2.f153110j;
                                if (oVar == null) {
                                    mVar3.C(-407281790);
                                    mVar3.f();
                                } else {
                                    mVar3.C(-407281789);
                                    x0Var3.a(i26, 124, null, t2Var, null, null, eVar.d(g22.l.h(oVar), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), gl1.y.Q(mVar3, R.string.lbl_gear_first_use), null, null, mVar3);
                                    mVar3.f();
                                }
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i18, 1);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(rVar, (Object) f0Var, (Object) o0Var, i14, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    public static final void b(final h0 h0Var, final bv.d dVar, final e23.l lVar, final e23.l lVar2, final e23.l lVar3, final e23.p pVar, final e23.p pVar2, final e23.l lVar4, final Long l14, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        ?? r14;
        e23.a aVar;
        Object zVar;
        g0 g0Var;
        h0Var.getClass();
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        pVar2.getClass();
        lVar4.getClass();
        p3.o0 o0VarE = mVar.E(1945137908);
        int i15 = i14 | (o0VarE.r(h0Var) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536) | (o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar4) ? 8388608 : 4194304) | (o0VarE.B(l14) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = p3.p0.c(h0Var.f153150e, o0VarE, 0);
            final g0 g0Var2 = (g0) p1VarC.getF182175a();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            int i16 = i15 & 896;
            boolean zR = (i16 == 256) | o0VarE.r(g0Var2);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                r14 = 0;
                final Object[] objArr = 0 == true ? 1 : 0;
                objQ2 = new e23.a() { // from class: rk0.s
                    @Override // e23.a
                    public final Object invoke() {
                        List list;
                        switch (objArr) {
                            case 0:
                                lVar.invoke(g0Var2.f153132e);
                                break;
                            case 1:
                                lVar.invoke(g0Var2.f153132e);
                                break;
                            case 2:
                                lVar.invoke(g0Var2.f153132e);
                                break;
                            case 3:
                                lVar.invoke(g0Var2.f153132e);
                                break;
                            default:
                                jk0.x xVar = g0Var2.f153129b;
                                if (xVar == null || (list = xVar.f99371w) == null) {
                                    list = p13.j0.f134944a;
                                }
                                lVar.invoke(list);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                r14 = 0;
            }
            c.w.a(r14, 1, (e23.a) objQ2, o0VarE, r14);
            o0 o0Var2 = g0Var2.f153132e;
            boolean zR2 = (i16 == 256) | o0VarE.r(g0Var2);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new b0(g0Var2, lVar, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, o0Var2, o0VarE);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.f(new z2(p1VarC, context, 17));
                o0VarE.K(objQ4);
            }
            x3 x3Var = (x3) objQ4;
            if (g0Var2.f153135h) {
                o0VarE.C(-94112430);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
                String strQ2 = gl1.y.Q(o0VarE, R.string.msg_data_no_longer_available);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean zR3 = (i16 == 256) | o0VarE.r(g0Var2);
                Object objQ5 = o0VarE.q();
                if (zR3 || objQ5 == c2565a) {
                    final int i17 = 1;
                    objQ5 = new e23.a() { // from class: rk0.s
                        @Override // e23.a
                        public final Object invoke() {
                            List list;
                            switch (i17) {
                                case 0:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 1:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 2:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 3:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                default:
                                    jk0.x xVar = g0Var2.f153129b;
                                    if (xVar == null || (list = xVar.f99371w) == null) {
                                        list = p13.j0.f134944a;
                                    }
                                    lVar.invoke(list);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ5);
                }
                e23.a<Unit> aVar2 = (e23.a) objQ5;
                boolean zR4 = (i16 == 256) | o0VarE.r(g0Var2);
                Object objQ6 = o0VarE.q();
                if (zR4 || objQ6 == c2565a) {
                    final int i18 = 2;
                    objQ6 = new e23.a() { // from class: rk0.s
                        @Override // e23.a
                        public final Object invoke() {
                            List list;
                            switch (i18) {
                                case 0:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 1:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 2:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 3:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                default:
                                    jk0.x xVar = g0Var2.f153129b;
                                    if (xVar == null || (list = xVar.f99371w) == null) {
                                        list = p13.j0.f134944a;
                                    }
                                    lVar.invoke(list);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ6);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar2, null, (e23.a) objQ6, o0VarE, 0, 0, 729);
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i19 = 1;
                pVar3 = new e23.p(h0Var, dVar, lVar, lVar2, lVar3, pVar, pVar2, lVar4, l14, i14, i19) { // from class: rk0.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f153271a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h0 f153272b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ bv.d f153273c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.l f153274d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.l f153275e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.l f153276f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.p f153277g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ e23.p f153278h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ e23.l f153279i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ Long f153280j;

                    {
                        this.f153271a = i19;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f153271a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(1);
                                d0.b(this.f153272b, this.f153273c, this.f153274d, this.f153275e, this.f153276f, this.f153277g, this.f153278h, this.f153279i, this.f153280j, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p3.p0.t(1);
                                d0.b(this.f153272b, this.f153273c, this.f153274d, this.f153275e, this.f153276f, this.f153277g, this.f153278h, this.f153279i, this.f153280j, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                o0VarE.C(-93685746);
                o0VarE.g0(false);
                f0 f0Var = g0Var2.f153128a;
                i53.c cVar = (i53.c) x3Var.getF182175a();
                jk0.x xVar = g0Var2.f153129b;
                boolean z14 = xVar != null;
                u0 u0Var = g0Var2.f153130c;
                u0 u0Var2 = g0Var2.f153131d;
                gg1.o0 o0VarG = dVar.g();
                if (l14 == null) {
                    o0VarE.C(-92839447);
                    o0VarE.g0(false);
                    aVar = null;
                } else {
                    o0VarE.C(-92839446);
                    boolean zR5 = o0VarE.r(h0Var) | ((i15 & 234881024) == 67108864);
                    Object objQ7 = o0VarE.q();
                    if (zR5 || objQ7 == c2565a) {
                        objQ7 = new f(3, h0Var, l14);
                        o0VarE.K(objQ7);
                    }
                    aVar = (e23.a) objQ7;
                    o0VarE.g0(false);
                }
                boolean zR6 = (i16 == 256) | o0VarE.r(g0Var2);
                Object objQ8 = o0VarE.q();
                if (zR6 || objQ8 == c2565a) {
                    final int i24 = 3;
                    objQ8 = new e23.a() { // from class: rk0.s
                        @Override // e23.a
                        public final Object invoke() {
                            List list;
                            switch (i24) {
                                case 0:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 1:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 2:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                case 3:
                                    lVar.invoke(g0Var2.f153132e);
                                    break;
                                default:
                                    jk0.x xVar2 = g0Var2.f153129b;
                                    if (xVar2 == null || (list = xVar2.f99371w) == null) {
                                        list = p13.j0.f134944a;
                                    }
                                    lVar.invoke(list);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ8);
                }
                e23.a aVar3 = (e23.a) objQ8;
                boolean zR7 = ((i15 & 29360128) == 8388608) | o0VarE.r(g0Var2);
                Object objQ9 = o0VarE.q();
                if (zR7 || objQ9 == c2565a) {
                    final int i25 = 4;
                    objQ9 = new e23.a() { // from class: rk0.s
                        @Override // e23.a
                        public final Object invoke() {
                            List list;
                            switch (i25) {
                                case 0:
                                    lVar4.invoke(g0Var2.f153132e);
                                    break;
                                case 1:
                                    lVar4.invoke(g0Var2.f153132e);
                                    break;
                                case 2:
                                    lVar4.invoke(g0Var2.f153132e);
                                    break;
                                case 3:
                                    lVar4.invoke(g0Var2.f153132e);
                                    break;
                                default:
                                    jk0.x xVar2 = g0Var2.f153129b;
                                    if (xVar2 == null || (list = xVar2.f99371w) == null) {
                                        list = p13.j0.f134944a;
                                    }
                                    lVar4.invoke(list);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ9);
                }
                e23.a aVar4 = (e23.a) objQ9;
                boolean zR8 = o0VarE.r(h0Var);
                Object objQ10 = o0VarE.q();
                if (zR8 || objQ10 == c2565a) {
                    final int i26 = 2;
                    objQ10 = new e23.a() { // from class: rk0.t
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            int i27 = i26;
                            h0 h0Var2 = h0Var;
                            switch (i27) {
                                case 0:
                                    r53.p2 p2Var = h0Var2.f153149d;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, g0.a((g0) value, null, null, null, null, null, null, false, false, 247)));
                                    return Unit.INSTANCE;
                                case 1:
                                    ReentrantLock reentrantLock = h0Var2.f153153h;
                                    reentrantLock.lock();
                                    try {
                                        c2 c2Var = h0Var2.f153152g;
                                        if (c2Var == null || !c2Var.isActive()) {
                                            r53.p2 p2Var2 = h0Var2.f153149d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new i0(h0Var2, null), 3);
                                            Unit unit = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                case 2:
                                    h0Var2.x4();
                                    return Unit.INSTANCE;
                                default:
                                    r53.p2 p2Var3 = h0Var2.f153149d;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, g0.a((g0) value3, null, null, null, null, null, null, false, false, 123)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    o0VarE.K(objQ10);
                }
                e23.a aVar5 = (e23.a) objQ10;
                boolean zR9 = o0VarE.r(h0Var);
                Object objQ11 = o0VarE.q();
                if (zR9 || objQ11 == c2565a) {
                    final int i27 = 3;
                    objQ11 = new e23.a() { // from class: rk0.t
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            int i28 = i27;
                            h0 h0Var2 = h0Var;
                            switch (i28) {
                                case 0:
                                    r53.p2 p2Var = h0Var2.f153149d;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, g0.a((g0) value, null, null, null, null, null, null, false, false, 247)));
                                    return Unit.INSTANCE;
                                case 1:
                                    ReentrantLock reentrantLock = h0Var2.f153153h;
                                    reentrantLock.lock();
                                    try {
                                        c2 c2Var = h0Var2.f153152g;
                                        if (c2Var == null || !c2Var.isActive()) {
                                            r53.p2 p2Var2 = h0Var2.f153149d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new i0(h0Var2, null), 3);
                                            Unit unit = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                case 2:
                                    h0Var2.x4();
                                    return Unit.INSTANCE;
                                default:
                                    r53.p2 p2Var3 = h0Var2.f153149d;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, g0.a((g0) value3, null, null, null, null, null, null, false, false, 123)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    o0VarE.K(objQ11);
                }
                e23.a aVar6 = (e23.a) objQ11;
                boolean zR10 = o0VarE.r(h0Var);
                Object objQ12 = o0VarE.q();
                if (zR10 || objQ12 == c2565a) {
                    final int i28 = 0;
                    objQ12 = new e23.a() { // from class: rk0.t
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            int i29 = i28;
                            h0 h0Var2 = h0Var;
                            switch (i29) {
                                case 0:
                                    r53.p2 p2Var = h0Var2.f153149d;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, g0.a((g0) value, null, null, null, null, null, null, false, false, 247)));
                                    return Unit.INSTANCE;
                                case 1:
                                    ReentrantLock reentrantLock = h0Var2.f153153h;
                                    reentrantLock.lock();
                                    try {
                                        c2 c2Var = h0Var2.f153152g;
                                        if (c2Var == null || !c2Var.isActive()) {
                                            r53.p2 p2Var2 = h0Var2.f153149d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new i0(h0Var2, null), 3);
                                            Unit unit = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                case 2:
                                    h0Var2.x4();
                                    return Unit.INSTANCE;
                                default:
                                    r53.p2 p2Var3 = h0Var2.f153149d;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, g0.a((g0) value3, null, null, null, null, null, null, false, false, 123)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    o0VarE.K(objQ12);
                }
                e23.a aVar7 = (e23.a) objQ12;
                boolean zR11 = o0VarE.r(h0Var);
                Object objQ13 = o0VarE.q();
                if (zR11 || objQ13 == c2565a) {
                    final int i29 = 0;
                    objQ13 = new e23.l() { // from class: rk0.u
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            Object value;
                            Object value2;
                            int i30 = i29;
                            h0 h0Var2 = h0Var;
                            switch (i30) {
                                case 0:
                                    jk0.p pVar4 = (jk0.p) obj;
                                    pVar4.getClass();
                                    r53.p2 p2Var = h0Var2.f153149d;
                                    ReentrantLock reentrantLock = h0Var2.f153153h;
                                    reentrantLock.lock();
                                    try {
                                        jk0.x xVar2 = ((g0) p2Var.getValue()).f153129b;
                                        c2 c2Var = h0Var2.f153152g;
                                        if ((c2Var == null || !c2Var.isActive()) && xVar2 != null) {
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new m0(h0Var2, pVar4, xVar2, null), 3);
                                            Unit unit = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                default:
                                    jk0.x xVar3 = (jk0.x) obj;
                                    xVar3.getClass();
                                    h0Var2.getClass();
                                    ReentrantLock reentrantLock2 = h0Var2.f153153h;
                                    reentrantLock2.lock();
                                    try {
                                        c2 c2Var2 = h0Var2.f153152g;
                                        if (c2Var2 == null || !c2Var2.isActive()) {
                                            r53.p2 p2Var2 = h0Var2.f153149d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new j0(h0Var2, xVar3, null), 3);
                                            Unit unit2 = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock2.unlock();
                                    }
                            }
                        }
                    };
                    o0VarE.K(objQ13);
                }
                e23.l lVar5 = (e23.l) objQ13;
                boolean zR12 = o0VarE.r(h0Var);
                Object objQ14 = o0VarE.q();
                if (zR12 || objQ14 == c2565a) {
                    final int i30 = 1;
                    objQ14 = new e23.a() { // from class: rk0.t
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            int i210 = i30;
                            h0 h0Var2 = h0Var;
                            switch (i210) {
                                case 0:
                                    r53.p2 p2Var = h0Var2.f153149d;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, g0.a((g0) value, null, null, null, null, null, null, false, false, 247)));
                                    return Unit.INSTANCE;
                                case 1:
                                    ReentrantLock reentrantLock = h0Var2.f153153h;
                                    reentrantLock.lock();
                                    try {
                                        c2 c2Var = h0Var2.f153152g;
                                        if (c2Var == null || !c2Var.isActive()) {
                                            r53.p2 p2Var2 = h0Var2.f153149d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new i0(h0Var2, null), 3);
                                            Unit unit = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                case 2:
                                    h0Var2.x4();
                                    return Unit.INSTANCE;
                                default:
                                    r53.p2 p2Var3 = h0Var2.f153149d;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, g0.a((g0) value3, null, null, null, null, null, null, false, false, 123)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    o0VarE.K(objQ14);
                }
                e23.a aVar8 = (e23.a) objQ14;
                boolean zR13 = o0VarE.r(h0Var);
                Object objQ15 = o0VarE.q();
                if (zR13 || objQ15 == c2565a) {
                    final int i34 = 1;
                    objQ15 = new e23.l() { // from class: rk0.u
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            Object value;
                            Object value2;
                            int i35 = i34;
                            h0 h0Var2 = h0Var;
                            switch (i35) {
                                case 0:
                                    jk0.p pVar4 = (jk0.p) obj;
                                    pVar4.getClass();
                                    r53.p2 p2Var = h0Var2.f153149d;
                                    ReentrantLock reentrantLock = h0Var2.f153153h;
                                    reentrantLock.lock();
                                    try {
                                        jk0.x xVar2 = ((g0) p2Var.getValue()).f153129b;
                                        c2 c2Var = h0Var2.f153152g;
                                        if ((c2Var == null || !c2Var.isActive()) && xVar2 != null) {
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new m0(h0Var2, pVar4, xVar2, null), 3);
                                            Unit unit = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                default:
                                    jk0.x xVar3 = (jk0.x) obj;
                                    xVar3.getClass();
                                    h0Var2.getClass();
                                    ReentrantLock reentrantLock2 = h0Var2.f153153h;
                                    reentrantLock2.lock();
                                    try {
                                        c2 c2Var2 = h0Var2.f153152g;
                                        if (c2Var2 == null || !c2Var2.isActive()) {
                                            r53.p2 p2Var2 = h0Var2.f153149d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g0.a((g0) value2, null, null, null, u0.InProgress, null, null, false, false, 247)));
                                            h0Var2.f153152g = ge1.b.T(v1.a(h0Var2), null, null, new j0(h0Var2, xVar3, null), 3);
                                            Unit unit2 = Unit.INSTANCE;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                        reentrantLock2.unlock();
                                    }
                            }
                        }
                    };
                    o0VarE.K(objQ15);
                }
                e23.l lVar6 = (e23.l) objQ15;
                boolean zR14 = o0VarE.r(h0Var);
                Object objQ16 = o0VarE.q();
                if (zR14 || objQ16 == c2565a) {
                    objQ16 = new r12.a(h0Var, 14);
                    o0VarE.K(objQ16);
                }
                e(f0Var, cVar, xVar, z14, u0Var, u0Var2, o0VarG, aVar3, lVar2, lVar3, pVar, pVar2, aVar4, aVar5, aVar6, aVar7, lVar5, aVar8, lVar6, aVar, (e23.p) objQ16, z3.f.c(56233636, new p21.b(feVar, 11), o0VarE), o0VarE, (i15 << 15) & 2113929216, (i15 >> 15) & 126);
                o0Var = o0VarE;
                l lVar7 = g0Var2.f153133f;
                boolean zR15 = o0Var.r(g0Var2) | o0Var.r(context) | o0Var.r(h0Var);
                Object objQ17 = o0Var.q();
                if (zR15 || objQ17 == c2565a) {
                    zVar = new z(g0Var2, context, feVar, h0Var, null);
                    g0Var = g0Var2;
                    o0Var.K(zVar);
                } else {
                    g0Var = g0Var2;
                    zVar = objQ17;
                }
                p3.l0.e((e23.p) zVar, lVar7, o0Var);
                Boolean boolValueOf = Boolean.valueOf(g0Var.f153134g);
                boolean zR16 = o0Var.r(g0Var) | o0Var.r(context) | o0Var.r(r4);
                Object objQ18 = o0Var.q();
                if (zR16 || objQ18 == c2565a) {
                    a0 a0Var = new a0(g0Var, context, feVar, h0Var, null);
                    o0Var.K(a0Var);
                    objQ18 = a0Var;
                }
                p3.l0.e((e23.p) objQ18, boolValueOf, o0Var);
            }
            p2VarI0.f135219d = pVar3;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i35 = 0;
            pVar3 = new e23.p(h0Var, dVar, lVar, lVar2, lVar3, pVar, pVar2, lVar4, l14, i14, i35) { // from class: rk0.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f153271a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f153272b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bv.d f153273c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.l f153274d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f153275e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f153276f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.p f153277g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.p f153278h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.l f153279i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Long f153280j;

                {
                    this.f153271a = i35;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f153271a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(1);
                            d0.b(this.f153272b, this.f153273c, this.f153274d, this.f153275e, this.f153276f, this.f153277g, this.f153278h, this.f153279i, this.f153280j, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p3.p0.t(1);
                            d0.b(this.f153272b, this.f153273c, this.f153274d, this.f153275e, this.f153276f, this.f153277g, this.f153278h, this.f153279i, this.f153280j, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar3;
        }
    }

    public static final void c(h4.r rVar, ArrayList arrayList, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(231382873);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(arrayList) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(-979353835);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(z3.f.c(1391540033, new g02.u0(it.next(), aVar, 2, (byte) 0), o0VarE));
            }
            o0VarE.g0(false);
            o0Var = o0VarE;
            m82.d.b(rVar2, i53.a.j(arrayList2), 0.0f, null, 0.0f, null, null, null, null, 0, false, null, o0Var, (i15 & 14) | 1572864, 0, 4028);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(rVar, (Object) arrayList, (Object) aVar, i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x042c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0433  */
    /* JADX WARN: Code duplicated, block: B:141:0x0517  */
    /* JADX WARN: Code duplicated, block: B:156:0x0579  */
    /* JADX WARN: Code duplicated, block: B:206:0x07cb  */
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
    public static final void d(boolean z14, f0 f0Var, i53.c<? extends am.x0> cVar, boolean z15, gg1.o0 o0Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super am.x0, Unit> lVar, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        e23.a<Unit> aVar5;
        gg1.o0 o0Var2;
        String str;
        boolean z16;
        int i15;
        int i16;
        String strP;
        boolean z17;
        uk0.t tVar;
        Double dB;
        int i17;
        boolean z18;
        String str2;
        boolean z19;
        String strP2;
        boolean z24;
        p3.o0 o0VarE = mVar.E(1857699462);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(f0Var) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.k(o0Var.ordinal()) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432) | (o0VarE.r(aVar4) ? 536870912 : 268435456);
        if (o0VarE.n(i18 & 1, (306783379 & i18) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar6 = h4.r.S;
            h4.r rVarD = c2.l.D(a2.b(x2.c(aVar6, 1.0f), a2.a(o0VarE), true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar7, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarE = u1.n.e(aVar6, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.z zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            o0VarE.C(-1445018322);
            c80.u uVar = f0Var.f153103c;
            String str3 = f0Var.f153107g;
            String str4 = f0Var.f153105e;
            String str5 = f0Var.f153106f;
            Boolean bool = f0Var.f153104d;
            c80.w wVar = f0Var.f153111k;
            i53.c<p0> cVar3 = f0Var.f153102b;
            p3.m.a aVar9 = p3.m.f135153a;
            if (uVar == null || str5 == null) {
                str = "";
                o0Var2 = o0Var;
                o0VarE.C(-1445088538);
                if (z14) {
                    aVar5 = aVar;
                    z16 = false;
                    o0VarE.C(-1444507536);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1444951115);
                    h4.r rVarF = x2.f(aVar6, 1.0f);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = fa.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.loading_error_message);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
                    boolean z25 = (i18 & 458752) == 131072;
                    Object objQ = o0VarE.q();
                    if (z25) {
                        aVar5 = aVar;
                        objQ = new qk0.o(aVar5, 28);
                        o0VarE.K(objQ);
                    } else {
                        aVar9.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            aVar5 = aVar;
                            objQ = new qk0.o(aVar5, 28);
                            o0VarE.K(objQ);
                        } else {
                            aVar5 = aVar;
                        }
                    }
                    b82.n.d(dVarA, strQ, strQ2, rVarF, strQ3, (e23.a) objQ, null, null, o0VarE, 3072, 192);
                    o0VarE = o0VarE;
                    z16 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-1444463888);
                o0VarE.g0(false);
                if (cVar3 == null || cVar3.isEmpty()) {
                    o0VarE.C(-1444145456);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1444403004);
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(aVar6, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                    ArrayList arrayList = new ArrayList(p13.y.r(cVar3, 10));
                    Iterator<p0> it = cVar3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getRawValue());
                    }
                    c(rVarC3, arrayList, aVar4, o0VarE, (i18 >> 21) & 896);
                    o0VarE.g0(false);
                }
                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    o0VarE.C(-1444076140);
                    pi0.e eVar2 = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    l72.s sVar = l72.s.f111232a;
                    l72.s.b bVar2 = l72.s.b.INFO;
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    bVar3.getClass();
                    h4.r rVarZ = c2.l.z(aVar10, f14, eVar3.f97918c);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = n1.a(t62.c.f162799a);
                    String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_gear_retired);
                    b63.o oVar = f0Var.f153109i;
                    if (oVar == null) {
                        o0VarE.C(-1443616845);
                        o0VarE.g0(false);
                        z24 = false;
                        strP2 = null;
                    } else {
                        o0VarE.C(-1443616844);
                        strP2 = gl1.y.P(R.string.retired_on_date, new Object[]{eVar2.d(g22.l.h(oVar), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY)}, o0VarE);
                        z24 = false;
                        o0VarE.g0(false);
                    }
                    sVar.d(rVarZ, bVar2, dVarA2, strQ4, strP2, null, null, null, o0VarE, 48, 480);
                    o0VarE = o0VarE;
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(-1443311184);
                    o0VarE.g0(false);
                }
                h4.r.a aVar11 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar4 = j92.b.f97899b;
                float f15 = eVar4.f97918c;
                float f16 = eVar4.f97918c;
                float f17 = eVar4.f97920e;
                c2.l.f(x2.h(aVar11, f15), o0VarE);
                bVar4.getClass();
                bVar4.getClass();
                h4.r rVarZ2 = c2.l.z(aVar11, f17, f16);
                Object objQ2 = o0VarE.q();
                aVar9.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    z17 = true;
                    objQ2 = new n(1);
                    o0VarE.K(objQ2);
                } else {
                    z17 = true;
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ2, rVarZ2, z17);
                c80.u uVar2 = f0Var.f153103c;
                u4.d dVar = uVar2.f25613a;
                String strL = xy2.b.l(uVar2, o0VarE);
                bVar4.getClass();
                float f18 = j92.b.f97901d.f97906e;
                uk0.r.f171870a.getClass();
                p3.o0 o0Var3 = o0VarE;
                uk0.q.a(rVarC4, dVar, strL, f18, uk0.r.b(str4, str5, str3, o0VarE), uk0.r.c(str4, str5, str3, o0VarE), o0Var3, 0, 0);
                bVar4.getClass();
                h4.r rVarA = c2.l.A(aVar11, f17, 0.0f, 2);
                String str6 = f0Var.f153108h;
                String str7 = str6 == null ? "" : str6;
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97933j;
                s5.x0 x0VarF = d92.c.f(x0Var, o0Var3);
                String strQ5 = gl1.y.Q(o0Var3, R.string.lbl_read_more);
                String strQ6 = gl1.y.Q(o0Var3, R.string.lbl_read_less);
                fVar2.getClass();
                g02.n.a(rVarA, str7, 4, x0VarF, strQ5, strQ6, s5.x0.a(x0Var, d92.b.a(o0Var3).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), null, null, (z15 && p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) ? aVar2 : null, o0Var3, 384);
                o0VarE = o0Var3;
                uk0.i.f171830a.getClass();
                b63.o oVar2 = (b63.o) uk0.i.g(o0VarE).getF182175a();
                oVar2.getClass();
                uk0.t tVar2 = uk0.t.f171871a;
                if (wVar == 0) {
                    tVar = tVar2;
                } else {
                    b63.o oVar3 = f0Var.f153113m;
                    Double d14 = f0Var.f153114n;
                    Long l14 = f0Var.f153115o;
                    Long l15 = f0Var.f153116p;
                    Double d15 = f0Var.f153117q;
                    tVar = tVar2;
                    b63.o oVar4 = f0Var.f153110j;
                    if (oVar4 != null) {
                        tVar.getClass();
                        dB = uk0.t.b(wVar, oVar3, d14, l14, l15, d15, oVar4, oVar2);
                    }
                    if (dB == null) {
                        o0VarE.C(-1441741903);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1441741902);
                        double dDoubleValue = dB.doubleValue();
                        bVar4.getClass();
                        c2.l.f(x2.h(aVar11, f17), o0VarE);
                        bVar4.getClass();
                        h4.r rVarA2 = c2.l.A(aVar11, f17, 0.0f, 2);
                        Double dValueOf = Double.valueOf(dDoubleValue);
                        i17 = ((i18 >> 12) & 14) | (i18 & 112);
                        o0Var.getClass();
                        o0VarE.C(-1073217317);
                        x1 x1Var2 = p3.n.f135158a;
                        if (wVar == 0) {
                            z18 = false;
                            o0VarE.g0(false);
                            str2 = null;
                        } else {
                            tVar.getClass();
                            String strA = uk0.t.a(wVar, f0Var.f153113m, f0Var.f153114n, f0Var.f153115o, f0Var.f153116p, f0Var.f153117q, o0Var, o0VarE, ((i17 << 18) & 3670016) | 12582912);
                            o0VarE = o0VarE;
                            z18 = false;
                            o0VarE.g0(false);
                            str2 = strA;
                        }
                        uk0.s.a(rVarA2, dValueOf, str2, o0VarE, 0, 0);
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(z18);
                    }
                    bVar4.getClass();
                    c2.l.f(x2.h(aVar11, f16), o0VarE);
                    bVar4.getClass();
                    o0Var2 = o0Var;
                    a(c2.l.y(aVar11, f17), f0Var, o0Var2, o0VarE, (i18 & 112) | ((i18 >> 6) & 896));
                    if (z15 || !p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                        z19 = false;
                        o0VarE.C(-1440402640);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1440967708);
                        String strQ7 = gl1.y.Q(o0VarE, R.string.add_photos);
                        l72.f0.a aVar12 = l72.f0.a.f111000a;
                        String strQ8 = gl1.y.Q(o0VarE, R.string.social_photo);
                        s62.a.f157643a.getClass();
                        u4.d dVarA3 = k6.a(t62.b.f162798a);
                        boolean zB = o0VarE.B(strQ7);
                        Object objQ3 = o0VarE.q();
                        if (zB || objQ3 == c2565a) {
                            objQ3 = new o60.b(strQ7, 24);
                            o0VarE.K(objQ3);
                        }
                        h4.r rVarC5 = p5.v.c((e23.l) objQ3, aVar11, false);
                        bVar4.getClass();
                        bVar4.getClass();
                        h4.r rVarF2 = x2.f(c2.l.z(rVarC5, f17, eVar4.f97921f), 1.0f);
                        boolean z26 = (i18 & 1879048192) == 536870912;
                        Object objQ4 = o0VarE.q();
                        if (z26 || objQ4 == c2565a) {
                            z19 = false;
                            objQ4 = new y(aVar4, 0);
                            o0VarE.K(objQ4);
                        } else {
                            z19 = false;
                        }
                        p3.o0 o0Var4 = o0VarE;
                        aVar12.h(0, 8, (e23.a) objQ4, rVarF2, strQ8, o0Var4, dVarA3, false);
                        o0VarE = o0Var4;
                        o0VarE.g0(z19);
                    }
                    o0VarE.g0(z19);
                    aVar5 = aVar;
                }
                dB = null;
                if (dB == null) {
                    o0VarE.C(-1441741903);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1441741902);
                    double dDoubleValue2 = dB.doubleValue();
                    bVar4.getClass();
                    c2.l.f(x2.h(aVar11, f17), o0VarE);
                    bVar4.getClass();
                    h4.r rVarA3 = c2.l.A(aVar11, f17, 0.0f, 2);
                    Double dValueOf2 = Double.valueOf(dDoubleValue2);
                    i17 = ((i18 >> 12) & 14) | (i18 & 112);
                    o0Var.getClass();
                    o0VarE.C(-1073217317);
                    x1 x1Var3 = p3.n.f135158a;
                    if (wVar == 0) {
                        z18 = false;
                        o0VarE.g0(false);
                        str2 = null;
                    } else {
                        tVar.getClass();
                        String strA2 = uk0.t.a(wVar, f0Var.f153113m, f0Var.f153114n, f0Var.f153115o, f0Var.f153116p, f0Var.f153117q, o0Var, o0VarE, ((i17 << 18) & 3670016) | 12582912);
                        o0VarE = o0VarE;
                        z18 = false;
                        o0VarE.g0(false);
                        str2 = strA2;
                    }
                    uk0.s.a(rVarA3, dValueOf2, str2, o0VarE, 0, 0);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(z18);
                }
                bVar4.getClass();
                c2.l.f(x2.h(aVar11, f16), o0VarE);
                bVar4.getClass();
                o0Var2 = o0Var;
                a(c2.l.y(aVar11, f17), f0Var, o0Var2, o0VarE, (i18 & 112) | ((i18 >> 6) & 896));
                if (z15) {
                    z19 = false;
                    o0VarE.C(-1440402640);
                    o0VarE.g0(false);
                } else {
                    z19 = false;
                    o0VarE.C(-1440402640);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z19);
                aVar5 = aVar;
            }
            o0VarE.g0(true);
            int i19 = 234881024;
            if (cVar == null || cVar.isEmpty()) {
                i15 = 0;
                if (z15 && p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                    o0VarE.C(-1864237275);
                    l72.p2 p2Var = l72.p2.f111205a;
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC6 = c2.l.C(aVar13, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    String strQ9 = gl1.y.Q(o0VarE, R.string.add_default_activities);
                    p.f153247a.getClass();
                    p3.o0 o0Var5 = o0VarE;
                    p2Var.g(strQ9, rVarC6, null, null, p.f153248b, false, false, aVar3, o0Var5, ((i18 << 3) & 234881024) | 24576, 236);
                    o0VarE = o0Var5;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1863642106);
                    o0VarE.g0(false);
                }
            } else {
                o0VarE.C(-1864736964);
                l72.p2 p2Var2 = l72.p2.f111205a;
                h4.r.a aVar14 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC7 = c2.l.C(aVar14, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                String strQ10 = gl1.y.Q(o0VarE, R.string.default_activities);
                uk0.i.f171830a.getClass();
                String strB = uk0.i.b(cVar, o0VarE, ((i18 >> 6) & 14) | 384);
                p3.o0 o0Var6 = o0VarE;
                p2Var2.h(strQ10, strB == null ? str : strB, null, rVarC7, null, false, false, null, null, null, (z15 && p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) ? aVar3 : null, o0Var6, 0, 0, 1012);
                o0VarE = o0Var6;
                i15 = 0;
                o0VarE.g0(false);
            }
            i53.d dVar2 = (i53.d) f0Var.f153122x.getValue();
            if (dVar2 == null || dVar2.isEmpty()) {
                dVar2 = null;
            }
            if (dVar2 == null) {
                o0VarE.C(-1863512186);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1863512185);
                h4.r.a aVar15 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar5 = j92.b.f97899b;
                c2.l.f(c2.l.C(aVar15, 0.0f, eVar5.f97920e, 0.0f, 0.0f, 13), o0VarE);
                bVar5.getClass();
                float f19 = eVar5.f97920e;
                bVar5.getClass();
                h4.r rVarZ3 = c2.l.z(aVar15, f19, eVar5.f97918c);
                String strQ11 = gl1.y.Q(o0VarE, R.string.tracked_activities);
                d92.b.f58624b.getClass();
                p3.o0 o0Var7 = o0VarE;
                mh.c(strQ11, rVarZ3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0Var7, 0, 0, 131068);
                o0VarE = o0Var7;
                o0VarE.C(-752832607);
                for (Map.Entry entry : dVar2.entrySet()) {
                    am.x0 x0Var2 = (am.x0) entry.getKey();
                    if (((Number) entry.getValue()).intValue() == 1) {
                        i16 = 0;
                        strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1085140387, R.string.one_activity_capitalized, o0VarE, false);
                    } else {
                        i16 = 0;
                        o0VarE.C(-1085042148);
                        String str8 = NumberFormat.getIntegerInstance().format(entry.getValue());
                        str8.getClass();
                        strP = gl1.y.P(R.string.num_activities, new Object[]{str8}, o0VarE);
                        o0VarE.g0(false);
                    }
                    String str9 = strP;
                    l72.p2 p2Var3 = l72.p2.f111205a;
                    String strT = gl1.d.T(x0Var2.f4360c, o0VarE, i16);
                    z3.e eVarC = z3.f.c(412053854, new qk0.p(x0Var2), o0VarE);
                    boolean zK = ((i18 & i19) == 67108864) | o0VarE.k(x0Var2.ordinal());
                    Object objQ5 = o0VarE.q();
                    if (zK) {
                        objQ5 = new h1(lVar, x0Var2, 3);
                        o0VarE.K(objQ5);
                    } else {
                        aVar9.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new h1(lVar, x0Var2, 3);
                            o0VarE.K(objQ5);
                        }
                    }
                    p3.o0 o0Var8 = o0VarE;
                    p2Var3.h(strT, str9, null, null, null, false, false, eVarC, null, null, (e23.a) objQ5, o0Var8, 12582912, i15, 892);
                    o0VarE = o0Var8;
                    i19 = 234881024;
                }
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            h4.r.a aVar16 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            e5.t(aVar16, j92.b.f97899b.f97921f, o0VarE, true);
            x1 x1Var4 = p3.n.f135158a;
        } else {
            aVar5 = aVar;
            o0Var2 = o0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et1.m1(z14, f0Var, cVar, z15, o0Var2, aVar5, aVar2, aVar3, lVar, aVar4, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v4, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r16v31, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r16v32, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r16v33, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r16v34, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
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
    public static final void e(f0 f0Var, final i53.c cVar, jk0.x xVar, final boolean z14, u0 u0Var, u0 u0Var2, final gg1.o0 o0Var, final e23.a aVar, final e23.l lVar, final e23.l lVar2, final e23.p pVar, final e23.p pVar2, final e23.a aVar2, final e23.a aVar3, e23.a aVar4, e23.a aVar5, final e23.l lVar3, e23.a aVar6, e23.l lVar4, final e23.a aVar7, final e23.p pVar3, final e23.p pVar4, p3.m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        e23.l lVar5;
        int i18;
        jk0.x xVar2;
        e23.a aVar8;
        e23.a aVar9;
        e23.l lVar6;
        e23.a aVar10;
        ?? r15;
        e23.l lVar7;
        ?? r14;
        boolean z15;
        final f0 f0Var2 = f0Var;
        u0 u0Var3 = u0Var;
        u0 u0Var4 = u0Var2;
        p3.o0 o0VarE = mVar.E(-1892871181);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(f0Var2) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i19 = i16;
        if ((i14 & 48) == 0) {
            i17 = i19 | (o0VarE.B(cVar) ? 32 : 16);
        } else {
            i17 = i19;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(xVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.k(u0Var3 == null ? -1 : u0Var3.ordinal()) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i17 |= o0VarE.k(u0Var4 != null ? u0Var4.ordinal() : -1) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.k(o0Var.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            lVar5 = lVar2;
            i17 |= o0VarE.r(lVar5) ? 536870912 : 268435456;
        } else {
            lVar5 = lVar2;
        }
        int i24 = i17;
        if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.r(pVar) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.r(pVar2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.r(aVar4) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i18 |= o0VarE.r(aVar5) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= o0VarE.r(aVar6) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= o0VarE.r(lVar4) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= o0VarE.r(aVar7) ? 536870912 : 268435456;
        }
        int i25 = i18;
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (i25 & 306783379) == 306783378 && (('0' | (o0VarE.r(pVar3) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ri1.b(17);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ri1.b(18);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new ri1.b(19);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new ri1.b(20);
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 48);
            u0 u0Var5 = u0.InProgress;
            boolean z16 = u0Var3 == u0Var5;
            boolean z17 = u0Var4 == u0Var5;
            uk0.r rVar = uk0.r.f171870a;
            boolean z18 = z17;
            String str = f0Var2.f153105e;
            String str2 = f0Var2.f153106f;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = f0Var2.f153107g;
            rVar.getClass();
            String strB = uk0.r.b(str, str2, str3, o0VarE);
            boolean z19 = (z16 && !z14) || z18;
            c2.n0 n0Var = n3.f22788a;
            c2.n0 n0Var2 = new c2.n0(0, 0, 0, 0);
            ?? r16 = o0VarE;
            xVar2 = xVar;
            z3.e eVarC = z3.f.c(783185848, new ck0.i(f0Var2, aVar, z14, p1Var, xVar, lVar, lVar3, p1Var2, lVar5, aVar7, p1Var3, pVar3), r16);
            f0Var2 = f0Var;
            z02.d.a(z19, eVarC, pVar4, null, n0Var2, z3.f.c(130720956, new f21.f0(aVar3, aVar2, pVar, pVar2, o0Var, cVar, strB, p1Var4, f0Var, z16, z14), r16), r16, 197040, 8);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                r16.C(-1890618417);
                ?? r17 = l72.c1.f110940a;
                String strQ = gl1.y.Q(r16, R.string.unretire_gear_to_edit);
                String strQ2 = gl1.y.Q(r16, R.string.you_must_unretire_gear);
                String strQ3 = gl1.y.Q(r16, R.string.lbl_gear_unretire);
                String strQ4 = gl1.y.Q(r16, R.string.lbl_cancel);
                boolean zB = ((i25 & 3670016) == 1048576) | r16.B(p1Var);
                Object objQ5 = r16.q();
                if (zB || objQ5 == c2565a) {
                    lVar7 = lVar3;
                    objQ5 = new ew1.v1(lVar7, p1Var, 18);
                    r16.K(objQ5);
                } else {
                    lVar7 = lVar3;
                }
                e23.a aVar11 = (e23.a) objQ5;
                boolean zB2 = r16.B(p1Var);
                Object objQ6 = r16.q();
                if (zB2 || objQ6 == c2565a) {
                    objQ6 = new w(p1Var, 1);
                    r16.K(objQ6);
                }
                r17.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar11, strQ4, (e23.a) objQ6, r16, 0, 0, 217);
                r14 = 0;
                r16.g0(false);
            } else {
                lVar7 = lVar3;
                r14 = 0;
                r16.C(-1890120433);
                r16.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                r16.C(-1890061657);
                ?? r18 = l72.c1.f110940a;
                String strQ5 = gl1.y.Q(r16, R.string.retire_gear_question);
                String strQ6 = gl1.y.Q(r16, R.string.retiring_gear_will_remove_from_collections);
                String strQ7 = gl1.y.Q(r16, R.string.lbl_gear_retire);
                String strQ8 = gl1.y.Q(r16, R.string.lbl_cancel);
                int i26 = ((i25 & 3670016) == 1048576 ? 1 : r14) | (r16.B(p1Var2) ? 1 : 0);
                Object objQ7 = r16.q();
                if (i26 != 0 || objQ7 == c2565a) {
                    objQ7 = new ew1.v1(lVar7, p1Var2, 19);
                    r16.K(objQ7);
                }
                e23.a aVar12 = (e23.a) objQ7;
                boolean zB3 = r16.B(p1Var2);
                Object objQ8 = r16.q();
                if (zB3 || objQ8 == c2565a) {
                    objQ8 = new w(p1Var2, 2);
                    r16.K(objQ8);
                }
                r18.a(false, strQ5, strQ6, null, null, strQ7, false, false, aVar12, strQ8, (e23.a) objQ8, r16, 0, 0, 217);
                r16.g0(r14);
            } else {
                r16.C(-1889555985);
                r16.g0(r14);
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                r16.C(-1889496093);
                ?? r19 = l72.c1.f110940a;
                String strP = gl1.y.P(R.string.common_delete_object, new Object[]{strB}, r16);
                String strP2 = gl1.y.P(R.string.deleting_gear_will_permanently_remove, new Object[]{strB}, r16);
                String strQ9 = gl1.y.Q(r16, R.string.lbl_delete);
                String strQ10 = gl1.y.Q(r16, R.string.lbl_cancel);
                int i27 = ((i25 & 29360128) == 8388608 ? 1 : r14) | (r16.B(p1Var3) ? 1 : 0);
                Object objQ9 = r16.q();
                if (i27 != 0 || objQ9 == c2565a) {
                    aVar9 = aVar6;
                    objQ9 = new p40.j0(aVar9, p1Var3, 4);
                    r16.K(objQ9);
                } else {
                    aVar9 = aVar6;
                }
                e23.a aVar13 = (e23.a) objQ9;
                boolean zB4 = r16.B(p1Var3);
                Object objQ10 = r16.q();
                if (zB4 || objQ10 == c2565a) {
                    objQ10 = new w(p1Var3, r14);
                    r16.K(objQ10);
                }
                r19.a(false, strP, strP2, null, null, strQ9, true, false, aVar13, strQ10, (e23.a) objQ10, r16, 1572864, 0, 153);
                r16.g0(r14);
            } else {
                aVar9 = aVar6;
                r16.C(-1888955825);
                r16.g0(r14);
            }
            u0Var4 = u0Var2;
            if (u0Var4 == u0.Failed) {
                r16.C(-1888897669);
                ?? r110 = l72.c1.f110940a;
                String strQ11 = gl1.y.Q(r16, R.string.pregnancy_something_went_wrong);
                String strQ12 = gl1.y.Q(r16, R.string.connect_iq_try_again);
                String strQ13 = gl1.y.Q(r16, R.string.lbl_ok);
                int i28 = i25 & 458752;
                ?? r24 = i28 == 131072 ? 1 : r14;
                Object objQ11 = r16.q();
                if (r24 != 0 || objQ11 == c2565a) {
                    aVar8 = aVar5;
                    objQ11 = new qk0.o(aVar8, 25);
                    r16.K(objQ11);
                } else {
                    aVar8 = aVar5;
                }
                e23.a aVar14 = (e23.a) objQ11;
                ?? r25 = i28 == 131072 ? 1 : r14;
                Object objQ12 = r16.q();
                if (r25 != 0 || objQ12 == c2565a) {
                    objQ12 = new qk0.o(aVar8, 26);
                    r16.K(objQ12);
                }
                r110.a(false, strQ11, strQ12, null, null, strQ13, false, false, aVar14, null, (e23.a) objQ12, r16, 0, 0, 729);
                r16.g0(r14);
            } else {
                aVar8 = aVar5;
                r16.C(-1888509425);
                r16.g0(r14);
            }
            String str4 = f0Var2.f153108h;
            int i29 = (r16.r(xVar2) ? 1 : 0) | ((i25 & 234881024) == 67108864 ? 1 : r14);
            Object objQ13 = r16.q();
            if (i29 != 0 || objQ13 == c2565a) {
                lVar6 = lVar4;
                z15 = true;
                objQ13 = new g(1, xVar2, lVar6);
                r16.K(objQ13);
            } else {
                lVar6 = lVar4;
                z15 = true;
            }
            uk0.o.b(p1Var4, str4, (e23.l) objQ13, r16, r14);
            Context context = (Context) r16.A(AndroidCompositionLocals_androidKt.f6042b);
            ?? r26 = (i24 & 57344) == 16384 ? z15 ? 1 : 0 : r14;
            ?? r27 = z15;
            if ((i25 & 57344) != 16384) {
                r27 = r14;
            }
            int i30 = r26 | r27 | (r16.r(context) ? 1 : 0);
            Object objQ14 = r16.q();
            if (i30 != 0 || objQ14 == c2565a) {
                u0Var3 = u0Var;
                aVar10 = aVar4;
                objQ14 = new c0(u0Var3, aVar10, context, null);
                r16.K(objQ14);
            } else {
                u0Var3 = u0Var;
                aVar10 = aVar4;
            }
            p3.l0.e((e23.p) objQ14, u0Var3, r16);
            r15 = r16;
        } else {
            xVar2 = xVar;
            aVar8 = aVar5;
            aVar9 = aVar6;
            lVar6 = lVar4;
            p3.o0 o0Var2 = o0VarE;
            aVar10 = aVar4;
            o0Var2.e();
            r15 = o0Var2;
        }
        p2 p2VarI0 = r15.i0();
        if (p2VarI0 != null) {
            final e23.a aVar15 = aVar9;
            final e23.l lVar8 = lVar6;
            final e23.a aVar16 = aVar10;
            final e23.a aVar17 = aVar8;
            final jk0.x xVar3 = xVar2;
            final u0 u0Var6 = u0Var3;
            final u0 u0Var7 = u0Var4;
            p2VarI0.f135219d = new e23.p() { // from class: rk0.x
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    d0.e(f0Var2, cVar, xVar3, z14, u0Var6, u0Var7, o0Var, aVar, lVar, lVar2, pVar, pVar2, aVar2, aVar3, aVar16, aVar17, lVar3, aVar15, lVar8, aVar7, pVar3, pVar4, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
