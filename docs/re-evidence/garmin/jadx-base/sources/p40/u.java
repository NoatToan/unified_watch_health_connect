package p40;

import am.j1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.Locale;
import kotlin.t1;
import l72.c1;
import l72.p2;
import o4.m1;
import o72.h3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.components.planner.CoursePointDetailKt$EditTextSheet$3$1$1", f = "CoursePointDetail.kt", l = {519}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f135760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f135761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f135761b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f135761b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f135760a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f135760a = 1;
                if (this.f135761b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135762a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.REST_BREAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.CUTOFF_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f135762a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0275  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
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
    public static final void a(q40.b bVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar6;
        p3.o0 o0Var;
        ?? r14;
        p3.o0 o0Var2;
        p3.o0 o0Var3;
        p3.o0 o0Var4;
        boolean z15;
        p3.o0 o0Var5;
        p3.o0 o0Var6;
        z14 = z14;
        p3.o0 o0VarE = mVar.E(-1554103816);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar7 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar7, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            int i16 = i15;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-1669607902);
            Integer num = bVar.f142582i;
            Integer num2 = bVar.f142583j;
            if (num == null && num2 == null && !z14) {
                o0VarE.g0(false);
                o0Var6 = o0VarE;
                aVar6 = aVar4;
            } else {
                h4.r rVarF = x2.f(aVar7, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                bVar3.getClass();
                h4.r rVarZ = c2.l.z(rVarF, eVar2.f97918c, f14);
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                String upperCase = gl1.y.Q(o0VarE, R.string.course_planning_help_title).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97933j;
                x0 x0VarF = d92.c.f(x0Var, o0VarE);
                h4.r rVarC3 = uVar.c(aVar7, h4.d.a.f81527e);
                bVar3.getClass();
                mh.c(upperCase, c2.l.C(rVarC3, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_help);
                fVar2.getClass();
                x0 x0VarA = x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                h4.r rVarC4 = uVar.c(aVar7, h4.d.a.f81529g);
                bVar3.getClass();
                h4.r rVarC5 = c2.l.C(rVarC4, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
                boolean z16 = (i16 & 896) == 256;
                Object objQ = o0VarE.q();
                int i17 = 12;
                if (z16) {
                    objQ = new ov1.o(aVar, 12);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ov1.o(aVar, 12);
                        o0VarE.K(objQ);
                    }
                }
                mh.c(strQ, u1.w.d(rVarC5, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
                p3.o0 o0Var7 = o0VarE;
                o0Var7.g0(true);
                if (bVar.f142585l) {
                    o0Var7.C(-1668554740);
                    if (num == null && z14) {
                        o0Var7.C(-1668516300);
                        p2.f111205a.h(gl1.y.Q(o0Var7, R.string.add_rest_break), gl1.y.Q(o0Var7, R.string.add_rest_break_description), null, null, null, false, false, null, z3.f.c(997269960, new ll1.g(aVar2, 29), o0Var7), null, null, o0Var7, 100663296, 0, 1788);
                        p3.o0 o0Var8 = o0Var7;
                        z15 = false;
                        o0Var8.g0(false);
                        o0Var5 = o0Var8;
                    } else {
                        z15 = false;
                        z15 = false;
                        if (num != null) {
                            o0Var7.C(-1667636334);
                            p2 p2Var = p2.f111205a;
                            String strQ2 = gl1.y.Q(o0Var7, R.string.rest_break);
                            l3.a aVar9 = l3.f23124b;
                            long jIntValue = ((long) num.intValue()) * 1000;
                            aVar9.getClass();
                            p2Var.h(strQ2, l3.a.b1(jIntValue), null, null, null, false, false, null, z3.f.c(-549112143, new a42.e(z14, aVar3, i17), o0Var7), null, null, o0Var7, 100663296, 0, 1788);
                            p3.o0 o0Var9 = o0Var7;
                            o0Var9.g0(false);
                            o0Var5 = o0Var9;
                        } else {
                            o0Var7.C(-1666711852);
                            o0Var7.g0(false);
                            o0Var5 = o0Var7;
                        }
                    }
                    o0Var5.g0(z15);
                    r14 = z15;
                    o0Var2 = o0Var5;
                } else {
                    z14 = z14;
                    r14 = 0;
                    o0Var7.C(-1666701932);
                    o0Var7.g0(false);
                    o0Var2 = o0Var7;
                }
                if (bVar.f142586m) {
                    o0Var2.C(-1666594207);
                    if (num2 == null && z14) {
                        o0Var2.C(-1666554031);
                        aVar6 = aVar4;
                        p3.o0 o0Var10 = o0Var2;
                        p2.f111205a.h(gl1.y.Q(o0Var2, R.string.add_cutoff_time), gl1.y.Q(o0Var2, R.string.add_cutoff_time_description), null, null, null, false, false, null, z3.f.c(-1042193527, new r(aVar6, r14), o0Var2), null, null, o0Var10, 100663296, 0, 1788);
                        p3.o0 o0Var11 = o0Var10;
                        o0Var11.g0(r14);
                        o0Var4 = o0Var11;
                    } else {
                        aVar6 = aVar4;
                        if (num2 != null) {
                            o0Var2.C(-1665669074);
                            p2 p2Var2 = p2.f111205a;
                            String strQ3 = gl1.y.Q(o0Var2, R.string.cutoff_time);
                            l3.a aVar10 = l3.f23124b;
                            long jIntValue2 = ((long) num2.intValue()) * 1000;
                            aVar10.getClass();
                            p3.o0 o0Var12 = o0Var2;
                            p2Var2.h(strQ3, l3.a.b1(jIntValue2), null, null, null, false, false, null, z3.f.c(1706391666, new a42.e(z14, aVar5, 13), o0Var2), null, null, o0Var12, 100663296, 0, 1788);
                            p3.o0 o0Var13 = o0Var12;
                            o0Var13.g0(r14);
                            o0Var4 = o0Var13;
                        } else {
                            o0Var2.C(-1664740748);
                            o0Var2.g0(r14);
                            o0Var4 = o0Var2;
                        }
                    }
                    o0Var4.g0(r14);
                    o0Var3 = o0Var4;
                } else {
                    aVar6 = aVar4;
                    o0Var2.C(-1664730828);
                    o0Var2.g0(r14);
                    o0Var3 = o0Var2;
                }
                o0Var3.g0(r14);
                o0Var6 = o0Var3;
            }
            o0Var6.g0(true);
            o0Var = o0Var6;
        } else {
            p3.o0 o0Var14 = o0VarE;
            aVar6 = aVar4;
            o0Var14.e();
            o0Var = o0Var14;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(bVar, z14, aVar, aVar2, aVar3, aVar6, aVar5, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, q40.b bVar, boolean z14, e23.l<? super q40.b, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        char c14;
        int i16;
        Object obj;
        p3.o0 o0Var;
        p1 p1Var;
        q40.b bVar2;
        int i17;
        boolean z15;
        String strJ;
        String strJ2;
        p1 p1Var2;
        boolean z16;
        q40.b bVar3 = bVar;
        rVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(46486187);
        int i18 = (o0VarE.r(bVar3) ? 32 : 16) | i14;
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i18 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        int i19 = i18;
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var5 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(u0.CUTOFF_TIME);
                o0VarE.K(objQ4);
            }
            p1 p1Var6 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n(0);
                o0VarE.K(objQ5);
            }
            p1 p1Var7 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p3.p0.n(0);
                o0VarE.K(objQ6);
            }
            p1 p1Var8 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p3.p0.n(0);
                o0VarE.K(objQ7);
            }
            p1 p1Var9 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ8);
            }
            o53.b0 b0Var = (o53.b0) objQ8;
            h4.r rVarE = u1.n.e(rVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j jVar = c2.j.f22691a;
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            bVar4.getClass();
            float f15 = eVar.f97920e;
            bVar4.getClass();
            float f16 = eVar.f97920e;
            bVar4.getClass();
            h4.r rVarC2 = c2.l.C(rVarF, f16, f15, eVar.f97920e, 0.0f, 8);
            bVar4.getClass();
            c2.t0.a(rVarC2, c2.j.i(eVar.f97918c), null, null, 0, 0, z3.f.c(-1356947664, new o(bVar3, 0), o0VarE), o0VarE, 1572864, 60);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new om0.h(p1Var3, 19);
                o0VarE.K(objQ9);
            }
            e23.a aVar2 = (e23.a) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new om0.h(p1Var3, 14);
                o0VarE.K(objQ10);
            }
            int i24 = i19 >> 3;
            int i25 = i24 & 14;
            int i26 = i24 & 112;
            e(bVar3, z14, aVar2, (e23.a) objQ10, o0VarE, i25 | 3456 | i26);
            if (bVar3.f142586m || bVar3.f142585l) {
                o0VarE.C(-1278687703);
                boolean zR = o0VarE.r(context);
                Object objQ11 = o0VarE.q();
                int i27 = 24;
                if (zR || objQ11 == c2565a) {
                    objQ11 = new o72.f(context, i27);
                    o0VarE.K(objQ11);
                }
                e23.a aVar3 = (e23.a) objQ11;
                Object objQ12 = o0VarE.q();
                if (objQ12 == c2565a) {
                    objQ12 = new j1(p1Var4, p1Var6, 21);
                    o0VarE.K(objQ12);
                }
                e23.a aVar4 = (e23.a) objQ12;
                Object objQ13 = o0VarE.q();
                if (objQ13 == c2565a) {
                    objQ13 = new j1(p1Var6, p1Var5, 22);
                    o0VarE.K(objQ13);
                }
                e23.a aVar5 = (e23.a) objQ13;
                Object objQ14 = o0VarE.q();
                if (objQ14 == c2565a) {
                    objQ14 = new j1(p1Var4, p1Var6, 23);
                    o0VarE.K(objQ14);
                }
                e23.a aVar6 = (e23.a) objQ14;
                Object objQ15 = o0VarE.q();
                if (objQ15 == c2565a) {
                    objQ15 = new j1(p1Var6, p1Var5, 24);
                    o0VarE.K(objQ15);
                }
                i15 = 2048;
                c14 = 16;
                bVar3 = bVar;
                a(bVar3, z14, aVar3, aVar4, aVar5, aVar6, (e23.a) objQ15, o0VarE, 1797120 | i25 | i26);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1277761299);
                o0VarE.g0(false);
                i15 = 2048;
                c14 = 16;
            }
            o0VarE.g0(true);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(1893401214);
                String str = bVar3.f142581h;
                String strQ = gl1.y.Q(o0VarE, R.string.activity_summary_activity_notes);
                Object objQ16 = o0VarE.q();
                if (objQ16 == r7) {
                    objQ16 = new om0.h(p1Var3, 15);
                    o0VarE.K(objQ16);
                }
                e23.a aVar7 = (e23.a) objQ16;
                boolean zR2 = o0VarE.r(bVar3) | ((r28 & 7168) == i15);
                Object objQ17 = o0VarE.q();
                if (zR2 || objQ17 == c2565a) {
                    z16 = false;
                    objQ17 = new p(bVar3, lVar, p1Var3, 0);
                    o0VarE.K(objQ17);
                } else {
                    z16 = false;
                }
                i16 = i19;
                obj = r7;
                p3.o0 o0Var2 = o0VarE;
                d(str, strQ, b0Var, aVar7, (e23.l) objQ17, o0Var2, 3072);
                o0Var = o0Var2;
                o0Var.g0(z16);
            } else {
                i16 = r28;
                obj = r7;
                o0Var = o0VarE;
                o0Var.C(1894532311);
                o0Var.g0(false);
            }
            if (((Boolean) r8.getF182175a()).booleanValue()) {
                o0Var.C(1894691651);
                c1 c1Var = c1.f110940a;
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_duration);
                String strQ3 = gl1.y.Q(o0Var, R.string.lbl_done);
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                z3.e eVarC = z3.f.c(-883008907, new q(p1Var6, p1Var7, p1Var8, p1Var9, 0), o0Var);
                boolean zR3 = o0Var.r(bVar3) | ((i16 & 7168) == i15);
                Object objQ18 = o0Var.q();
                if (zR3 || objQ18 == obj) {
                    p1Var = p1Var6;
                    bVar2 = bVar;
                    s sVar = new s(bVar2, lVar, p1Var, p1Var9, p1Var8, p1Var7, p1Var4, 0);
                    o0Var.K(sVar);
                    objQ18 = sVar;
                } else {
                    p1Var = p1Var6;
                    bVar2 = bVar3;
                }
                e23.a<Unit> aVar8 = (e23.a) objQ18;
                Object objQ19 = o0Var.q();
                if (objQ19 == obj) {
                    objQ19 = new om0.h(p1Var4, c14);
                    o0Var.K(objQ19);
                }
                e23.a<Unit> aVar9 = (e23.a) objQ19;
                p3.o0 o0Var3 = o0Var;
                i17 = R.string.lbl_cancel;
                c1Var.a(true, strQ2, null, eVarC, null, strQ3, false, false, aVar8, strQ4, aVar9, o0Var3, 3078, 6, 212);
                o0Var = o0Var3;
                o0Var.g0(false);
            } else {
                i16 = i16;
                obj = obj;
                p1Var = p1Var6;
                bVar2 = bVar3;
                i17 = R.string.lbl_cancel;
                o0Var.C(1898314807);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0Var.C(1898452478);
                u0 u0Var = (u0) p1Var.getF182175a();
                int[] iArr = b.f135762a;
                int i28 = iArr[u0Var.ordinal()];
                if (i28 == 1) {
                    z15 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1723808026, R.string.delete_rest_break, o0Var, false);
                } else {
                    if (i28 != 2) {
                        throw kg.f.h(o0Var, 1723805990, false);
                    }
                    z15 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1723810971, R.string.delete_cutoff_time, o0Var, false);
                }
                String str2 = strJ;
                int i29 = iArr[((u0) p1Var.getF182175a()).ordinal()];
                if (i29 == 1) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1723815778, R.string.delete_rest_break_message, o0Var, z15);
                } else {
                    if (i29 != 2) {
                        throw kg.f.h(o0Var, 1723813750, z15);
                    }
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1723818979, R.string.delete_cutoff_time_message, o0Var, z15);
                }
                g82.c cVar = g82.c.f76436a;
                String strQ5 = gl1.y.Q(o0Var, R.string.lbl_delete);
                String strQ6 = gl1.y.Q(o0Var, i17);
                z3.e eVarC2 = z3.f.c(-488717794, new h3(strJ2, 4), o0Var);
                boolean zR4 = o0Var.r(bVar2) | ((i16 & 7168) == 2048);
                Object objQ20 = o0Var.q();
                if (zR4 || objQ20 == obj) {
                    p1 p1Var10 = p1Var;
                    p1Var2 = p1Var5;
                    ok0.d dVar = new ok0.d(bVar2, lVar, p1Var2, p1Var10, 5);
                    o0Var.K(dVar);
                    objQ20 = dVar;
                } else {
                    p1Var2 = p1Var5;
                }
                e23.a<Unit> aVar10 = (e23.a) objQ20;
                Object objQ21 = o0Var.q();
                if (objQ21 == obj) {
                    objQ21 = new om0.h(p1Var2, 17);
                    o0Var.K(objQ21);
                }
                e23.a<Unit> aVar11 = (e23.a) objQ21;
                Object objQ22 = o0Var.q();
                if (objQ22 == obj) {
                    objQ22 = new om0.h(p1Var2, 18);
                    o0Var.K(objQ22);
                }
                p3.o0 o0Var4 = o0Var;
                cVar.b(null, str2, eVarC2, strQ5, aVar10, strQ6, aVar11, false, (e23.a) objQ22, o0Var4, 102236544, 129);
                o0VarE = o0Var4;
                o0VarE.g0(false);
            } else {
                o0VarE = o0Var;
                o0VarE.C(1901736215);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(rVar, bVar, z14, lVar, i14, 12);
        }
    }

    public static final void c(h4.r rVar, String str, String str2, String str3, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i14) {
        String str4;
        String str5;
        String str6;
        p3.o0 o0VarE = mVar.E(-319051499);
        int i15 = i14 | 3504;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarH = ds.e0.h(0, 99);
            i53.c cVarH2 = ds.e0.h(0, 59);
            r82.k.c(rVar, i53.a.a(new r82.p(cVarH, 0, null, null, z3.f.c(-1870614177, new e(9), o0VarE), 0.0f, false, false, null, null, lVar, 1006, null), new r82.p(cVarH2, 0, null, null, z3.f.c(-1792493088, new e(10), o0VarE), 0.0f, false, false, null, null, lVar2, 1006, null), new r82.p(cVarH2, 0, null, null, z3.f.c(-1714371999, new e(11), o0VarE), 0.0f, false, false, null, null, lVar3, 1006, null)), o0VarE, 6, 0);
            str4 = ":";
            str5 = ":";
            str6 = "";
        } else {
            o0VarE.e();
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(rVar, str4, str5, str6, lVar, lVar2, lVar3, i14, 0);
        }
    }

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
    public static final void d(String str, String str2, o53.b0 b0Var, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        str2.getClass();
        b0Var.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1049653677);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(b0Var) ? 256 : 128) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = 3;
            mc mcVarF = e9.f(false, null, o0VarE, 0, 3);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(str);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            l72.w wVar = l72.w.f111301a;
            z3.e eVarC = z3.f.c(-1408245315, new ao1.j(str2, aVar, i16), o0VarE);
            z3.e eVarC2 = z3.f.c(319945110, new bt1.k(lVar, p1Var, 9), o0VarE);
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new eu.b(b0Var, mcVarF, aVar, 6);
                o0VarE.K(objQ2);
            }
            wVar.c(eVarC, eVarC2, (e23.a) objQ2, mcVarF, null, null, z3.f.c(134811307, new o72.b(8, qVar, p1Var), o0VarE), o0VarE, 1572918, 48);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e(str, str2, b0Var, (e23.a) aVar, (e23.l) lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01c5  */
    public static final void e(q40.b bVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1470064081);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (bVar.f142581h != null) {
                o0VarE.C(1102716556);
                p2.f111205a.h(gl1.y.Q(o0VarE, R.string.activity_summary_activity_notes), bVar.f142581h, null, null, null, false, false, null, z3.f.c(-1122250585, new a42.e(z14, aVar2, 14), o0VarE), null, null, o0VarE, 100663296, 0, 1788);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                if (z14) {
                    o0Var.C(1103565243);
                    h4.r.a aVar3 = h4.r.S;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(u1.n.e(x2.f(aVar3, 1.0f), am.j.c(d92.b.f58623a, o0Var), m1.f128891a), 16);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                    int iHashCode = Long.hashCode(o0Var.U);
                    i2 i2VarA0 = o0Var.a0();
                    h4.r rVarC = h4.k.c(rVarY, o0Var);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (o0Var.f135177b == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar5);
                    } else {
                        o0Var.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0Var);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0Var);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0Var);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ = gl1.y.Q(o0Var, R.string.activity_summary_activity_notes);
                    j92.f fVar = d92.b.f58624b;
                    fVar.getClass();
                    int i16 = i15;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0Var), o0Var, 0, 0, 131070);
                    String strQ2 = gl1.y.Q(o0Var, R.string.mct_add_a_note);
                    fVar.getClass();
                    x0 x0VarA = x0.a(j92.f.f97933j, hb.a.e(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    boolean z15 = (i16 & 896) == 256;
                    Object objQ = o0Var.q();
                    if (z15) {
                        objQ = new ov1.o(aVar, 13);
                        o0Var.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ov1.o(aVar, 13);
                            o0Var.K(objQ);
                        }
                    }
                    mh.c(strQ2, u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var, 0, 0, 131068);
                    o0Var = o0Var;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1104203347);
                    o0Var.g0(false);
                }
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i((Object) bVar, z14, (e23.a) aVar, (e23.a) aVar2, i14, 11);
        }
    }

    public static final void f(h4.r rVar, String str, String str2, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        String str3;
        String str4;
        p3.o0 o0VarE = mVar.E(1510424636);
        int i15 = i14 | 432;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarH = ds.e0.h(0, 59);
            r82.k.c(rVar, i53.a.a(new r82.p(cVarH, 0, null, null, z3.f.c(900340870, new e(7), o0VarE), 0.0f, false, false, null, null, lVar, 1006, null), new r82.p(cVarH, 0, null, null, z3.f.c(1548568327, new e(8), o0VarE), 0.0f, false, false, null, null, lVar2, 1006, null)), o0VarE, 6, 0);
            str3 = "min";
            str4 = "sec";
        } else {
            o0VarE.e();
            str3 = str;
            str4 = str2;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) rVar, (Object) str3, (Object) str4, (o13.h) lVar, (o13.h) lVar2, i14, 7);
        }
    }
}
