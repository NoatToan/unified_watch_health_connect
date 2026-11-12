package p40;

import am.j1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.b1;
import i3.c1;
import i3.e5;
import i3.h1;
import i3.mh;
import java.util.Locale;
import o4.m1;
import o72.a3;
import o72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.components.planner.EditCoursePointKt$EditCoursePoint$1$1", f = "EditCoursePoint.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Float, Unit> f135730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f135731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Float, Unit> lVar, n1 n1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f135730a = lVar;
            this.f135731b = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f135730a, this.f135731b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n1 n1Var = this.f135731b;
            if (n1Var.getIntValue() > 0) {
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float intValue = eVar.f97923h + n1Var.getIntValue();
                bVar.getClass();
                this.f135730a.invoke(new Float(intValue + eVar.f97923h));
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f135733b;

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
            f135732a = iArr;
            int[] iArr2 = new int[b82.t0.a.values().length];
            try {
                iArr2[b82.t0.a.ON_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b82.t0.a.ON_FOCUS_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f135733b = iArr2;
        }
    }

    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(751694119);
        int i15 = 2;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ov1.o(aVar, 24);
                o0VarE.K(objQ);
            }
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            c1 c1Var = c1.f87691a;
            long jE = d92.b.a(o0VarE).k().e();
            c1Var.getClass();
            b1 b1VarC = c1.c(0L, jE, 0L, o0VarE, 13);
            i.f135676a.getClass();
            h1.c((e23.a) objQ, rVarC2, false, null, b1VarC, null, null, null, i.f135682g, o0VarE, C.ENCODING_PCM_32BIT, 492);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(aVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x038e  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0210  */
    /* JADX WARN: Code duplicated, block: B:83:0x029f  */
    /* JADX WARN: Code duplicated, block: B:93:0x030d  */
    public static final void b(q40.b bVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        int i16;
        boolean z14;
        p3.o0 o0VarE = mVar.E(74834365);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar4, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar4, 1.0f);
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
            int i17 = i15;
            if (o0VarE.T) {
                o0VarE.M(aVar5);
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
            h4.r rVarC3 = uVar.c(aVar4, h4.d.a.f81527e);
            bVar3.getClass();
            mh.c(upperCase, c2.l.C(rVarC3, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_help);
            fVar2.getClass();
            x0 x0VarA = x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            h4.r rVarC4 = uVar.c(aVar4, h4.d.a.f81529g);
            bVar3.getClass();
            h4.r rVarC5 = c2.l.C(rVarC4, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
            boolean z15 = (i17 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (z15) {
                objQ = new ov1.o(aVar, 25);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ov1.o(aVar, 25);
                    o0VarE.K(objQ);
                }
            }
            mh.c(strQ, u1.w.d(rVarC5, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            boolean z16 = bVar.f142585l;
            Integer num = bVar.f142583j;
            Integer num2 = bVar.f142582i;
            if (z16) {
                o0Var.C(664423504);
                if (num2 == null) {
                    o0Var.C(664453822);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ2 = gl1.y.Q(o0Var, R.string.add_rest_break);
                    String strQ3 = gl1.y.Q(o0Var, R.string.add_rest_break_description);
                    i.f135676a.getClass();
                    z3.e eVar3 = i.f135678c;
                    i16 = i17;
                    boolean z17 = (i16 & 896) == 256;
                    Object objQ2 = o0Var.q();
                    if (z17) {
                        objQ2 = new ov1.o(aVar2, 26);
                        o0Var.K(objQ2);
                    } else {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ov1.o(aVar2, 26);
                            o0Var.K(objQ2);
                        }
                    }
                    p2Var.h(strQ2, strQ3, null, null, null, false, false, null, eVar3, null, (e23.a) objQ2, o0Var, 100663296, 0, 764);
                    o0Var = o0Var;
                    o0Var.g0(false);
                    z14 = false;
                } else {
                    o0Var.C(665270796);
                    l72.p2 p2Var2 = l72.p2.f111205a;
                    String strQ4 = gl1.y.Q(o0Var, R.string.rest_break);
                    l3.a aVar7 = l3.f23124b;
                    long jIntValue = ((long) num2.intValue()) * 1000;
                    aVar7.getClass();
                    String strB1 = l3.a.b1(jIntValue);
                    i.f135676a.getClass();
                    z3.e eVar4 = i.f135679d;
                    boolean z18 = (i17 & 896) == 256;
                    Object objQ3 = o0Var.q();
                    if (z18) {
                        objQ3 = new ov1.o(aVar2, 27);
                        o0Var.K(objQ3);
                    } else {
                        aVar6.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ov1.o(aVar2, 27);
                            o0Var.K(objQ3);
                        }
                    }
                    i16 = i17;
                    z14 = false;
                    p2Var2.h(strQ4, strB1, null, null, null, false, false, null, eVar4, null, (e23.a) objQ3, o0Var, 100663296, 0, 764);
                    o0Var = o0Var;
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
            } else {
                i16 = i17;
                z14 = false;
                o0Var.C(666083151);
                o0Var.g0(false);
            }
            if (bVar.f142586m) {
                o0Var.C(666184645);
                if (num == null) {
                    o0Var.C(666216699);
                    l72.p2 p2Var3 = l72.p2.f111205a;
                    String strQ5 = gl1.y.Q(o0Var, R.string.add_cutoff_time);
                    String strQ6 = gl1.y.Q(o0Var, R.string.add_cutoff_time_description);
                    i.f135676a.getClass();
                    z3.e eVar5 = i.f135680e;
                    boolean z19 = (i16 & 7168) == 2048 ? true : z14;
                    Object objQ4 = o0Var.q();
                    if (z19) {
                        objQ4 = new ov1.o(aVar3, 28);
                        o0Var.K(objQ4);
                    } else {
                        aVar6.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ov1.o(aVar3, 28);
                            o0Var.K(objQ4);
                        }
                    }
                    p3.o0 o0Var2 = o0Var;
                    p2Var3.h(strQ5, strQ6, null, null, null, false, false, null, eVar5, null, (e23.a) objQ4, o0Var2, 100663296, 0, 764);
                    o0Var = o0Var2;
                    o0Var.g0(z14);
                } else {
                    o0Var.C(667036742);
                    l72.p2 p2Var4 = l72.p2.f111205a;
                    String strQ7 = gl1.y.Q(o0Var, R.string.cutoff_time);
                    l3.a aVar8 = l3.f23124b;
                    long jIntValue2 = ((long) num.intValue()) * 1000;
                    aVar8.getClass();
                    String strB2 = l3.a.b1(jIntValue2);
                    i.f135676a.getClass();
                    z3.e eVar6 = i.f135681f;
                    boolean z24 = (i16 & 7168) == 2048 ? true : z14;
                    Object objQ5 = o0Var.q();
                    if (z24) {
                        objQ5 = new ov1.o(aVar3, 29);
                        o0Var.K(objQ5);
                    } else {
                        aVar6.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ov1.o(aVar3, 29);
                            o0Var.K(objQ5);
                        }
                    }
                    p3.o0 o0Var3 = o0Var;
                    p2Var4.h(strQ7, strB2, null, null, null, false, false, null, eVar6, null, (e23.a) objQ5, o0Var3, 100663296, 0, 764);
                    o0Var = o0Var3;
                    o0Var.g0(z14);
                }
                o0Var.g0(z14);
            } else {
                o0Var.C(667854863);
                o0Var.g0(z14);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(bVar, aVar, aVar2, aVar3, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:106:0x0330  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:110:0x0377  */
    /* JADX WARN: Code duplicated, block: B:112:0x037f  */
    /* JADX WARN: Code duplicated, block: B:117:0x039d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0416  */
    /* JADX WARN: Code duplicated, block: B:123:0x0418  */
    /* JADX WARN: Code duplicated, block: B:126:0x041f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0427  */
    /* JADX WARN: Code duplicated, block: B:130:0x042a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0476  */
    /* JADX WARN: Code duplicated, block: B:83:0x023e  */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:91:0x029d  */
    /* JADX WARN: Code duplicated, block: B:94:0x02af  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v17, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v19, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v11, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v30 */
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
    public static final void c(q40.b bVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super q40.b, Unit> lVar, e23.l<? super q40.b, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar3;
        ?? r14;
        int i16;
        h5.g.a.f fVar;
        j92.f fVar2;
        x0 x0Var;
        boolean z14;
        int i17;
        p3.m.a aVar4;
        p3.m.a aVar5;
        ?? r15;
        Object objQ;
        p3.o0 o0Var;
        ?? r16;
        ?? r17;
        ?? r18;
        boolean z15;
        Object objQ2;
        p3.o0 o0Var2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        ?? r19;
        Object objQ3;
        p3.o0 o0VarE = mVar.E(2076664929);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.courses.model.f fVar3 = bVar.f142580g;
            boolean z16 = fVar3 == com.garmin.android.apps.connectmobile.courses.model.f.COURSE_START;
            boolean z17 = fVar3 == com.garmin.android.apps.connectmobile.courses.model.f.COURSE_FINISH;
            h4.r.a aVar6 = h4.r.S;
            boolean z18 = z17;
            h4.r rVarF = x2.f(aVar6, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(rVarF, eVar.f97918c, f14);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i15;
            } else {
                i16 = i15;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                String upperCase = gl1.y.Q(o0VarE, R.string.lbl_details).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97933j;
                x0 x0VarF = d92.c.f(x0Var, o0VarE);
                h4.r rVarC3 = uVar.c(aVar6, h4.d.a.f81527e);
                bVar2.getClass();
                z14 = z16;
                i17 = i16;
                mh.c(upperCase, c2.l.C(rVarC3, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0VarE.g0(true);
                aVar4 = p3.m.f135153a;
                if (!z14 || z18) {
                    aVar5 = aVar4;
                    r15 = 0;
                    o0VarE.C(1218232590);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_name);
                    String str = bVar.f142575b;
                    objQ = o0VarE.q();
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(2);
                        o0VarE.K(objQ);
                    }
                    p2Var.h(strQ, str, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 196608, 6, 988);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    Object objH = q2.h(o0VarE, 1216976563, aVar4);
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objH == c2565a) {
                        objH = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objH);
                    }
                    p1 p1Var = (p1) objH;
                    b82.t0 t0Var = b82.t0.f16792a;
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_name);
                    String str2 = bVar.f142575b;
                    x5.v.f188954b.getClass();
                    int i18 = x5.v.f188955c;
                    boolean zR = ((i17 & 7168) == 2048) | o0VarE.r(bVar);
                    Object objQ4 = o0VarE.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new p0(lVar, bVar, 1);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar3 = (e23.l) objQ4;
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new i3(p1Var, 18);
                        o0VarE.K(objQ5);
                    }
                    e23.l lVar4 = (e23.l) objQ5;
                    z3.e eVarC = z3.f.c(1104859334, new oo0.f(p1Var, bVar), o0VarE);
                    aVar5 = aVar4;
                    t0Var.i(null, strQ2, str2, 15, false, lVar3, lVar4, i18, 0, eVarC, o0VarE, 819489792, TsExtractor.TS_STREAM_TYPE_AIT);
                    o0Var = o0VarE;
                    r15 = 0;
                    o0Var.g0(false);
                }
                r16 = l72.p2.f111205a;
                String strQ3 = gl1.y.Q(o0Var, R.string.common_type);
                String strT = gl1.d.T(bVar.f142580g.a(), o0Var, r15);
                if (!z14 || z18) {
                    r17 = r15;
                } else {
                    r17 = 1;
                }
                int i19 = (o0Var.h(z14) ? 1 : 0) | (o0Var.h(z18) ? 1 : 0);
                if ((57344 & i17) == 16384) {
                    r18 = 1;
                } else {
                    r18 = r15;
                }
                z15 = ((i19 | r18) == true ? 1 : 0) | (o0Var.r(bVar) ? 1 : 0);
                objQ2 = o0Var.q();
                if (z15 == 0) {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f21.e0(z14, z18, lVar2, bVar);
                        o0Var.K(objQ2);
                    }
                } else {
                    objQ2 = new f21.e0(z14, z18, lVar2, bVar);
                    o0Var.K(objQ2);
                }
                o0Var2 = o0Var;
                r16.h(strQ3, strT, null, null, null, r17, false, null, null, null, (e23.a) objQ2, o0Var2, 0, 0, 988);
                if (bVar.f142581h != null) {
                    o0Var2.C(1218812662);
                    aVar3 = aVar2;
                    r16.h(gl1.y.Q(o0Var2, R.string.activity_summary_activity_notes), bVar.f142581h, null, null, null, false, false, null, z3.f.c(283169154, new r(aVar3, 1), o0Var2), null, null, o0Var2, 100663296, 0, 1788);
                    ?? r24 = o0Var2;
                    r24.g0(r15);
                    r14 = r24;
                } else {
                    aVar3 = aVar2;
                    o0Var2.C(1219557065);
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(u1.n.e(x2.f(aVar6, 1.0f), p6.b.b(o0Var2), m1.f128891a), 16);
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var2, r15);
                    iHashCode = Long.hashCode(o0Var2.U);
                    i2VarA0 = o0Var2.a0();
                    rVarC = h4.k.c(rVarY, o0Var2);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.T) {
                        o0Var2.M(aVar7);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(eVar2, zVarA, o0Var2);
                    b4.c(c1623g, i2VarA0, o0Var2);
                    if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0Var2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ4 = gl1.y.Q(o0Var2, R.string.activity_summary_activity_notes);
                    fVar2.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0Var2), o0Var2, 0, 0, 131070);
                    String strQ5 = gl1.y.Q(o0Var2, R.string.mct_add_a_note);
                    fVar2.getClass();
                    x0 x0VarA = x0.a(x0Var, d92.b.a(o0Var2).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    if ((i17 & 112) == 32) {
                        r19 = 1;
                    } else {
                        r19 = r15;
                    }
                    objQ3 = o0Var2.q();
                    if (r19 == 0) {
                        aVar5.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ov1.o(aVar, 23);
                            o0Var2.K(objQ3);
                        }
                    } else {
                        objQ3 = new ov1.o(aVar, 23);
                        o0Var2.K(objQ3);
                    }
                    mh.c(strQ5, u1.w.d(aVar6, false, null, null, (e23.a) objQ3, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var2, 0, 0, 131068);
                    ?? r25 = o0Var2;
                    r25.g0(true);
                    r25.g0(r15);
                    r14 = r25;
                }
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            String upperCase2 = gl1.y.Q(o0VarE, R.string.lbl_details).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97933j;
            x0 x0VarF2 = d92.c.f(x0Var, o0VarE);
            h4.r rVarC4 = uVar2.c(aVar6, h4.d.a.f81527e);
            bVar2.getClass();
            z14 = z16;
            i17 = i16;
            mh.c(upperCase2, c2.l.C(rVarC4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
            aVar4 = p3.m.f135153a;
            if (z14) {
                aVar5 = aVar4;
                r15 = 0;
                o0VarE.C(1218232590);
                l72.p2 p2Var2 = l72.p2.f111205a;
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_name);
                String str3 = bVar.f142575b;
                objQ = o0VarE.q();
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(2);
                    o0VarE.K(objQ);
                }
                p2Var2.h(strQ6, str3, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 196608, 6, 988);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                aVar5 = aVar4;
                r15 = 0;
                o0VarE.C(1218232590);
                l72.p2 p2Var3 = l72.p2.f111205a;
                String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_name);
                String str4 = bVar.f142575b;
                objQ = o0VarE.q();
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(2);
                    o0VarE.K(objQ);
                }
                p2Var3.h(strQ7, str4, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 196608, 6, 988);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            r16 = l72.p2.f111205a;
            String strQ8 = gl1.y.Q(o0Var, R.string.common_type);
            String strT2 = gl1.d.T(bVar.f142580g.a(), o0Var, r15);
            if (z14) {
                r17 = r15;
            } else {
                r17 = r15;
            }
            int i110 = (o0Var.h(z14) ? 1 : 0) | (o0Var.h(z18) ? 1 : 0);
            if ((57344 & i17) == 16384) {
                r18 = 1;
            } else {
                r18 = r15;
            }
            z15 = ((i110 | r18) == true ? 1 : 0) | (o0Var.r(bVar) ? 1 : 0);
            objQ2 = o0Var.q();
            if (z15 == 0) {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f21.e0(z14, z18, lVar2, bVar);
                    o0Var.K(objQ2);
                }
            } else {
                objQ2 = new f21.e0(z14, z18, lVar2, bVar);
                o0Var.K(objQ2);
            }
            o0Var2 = o0Var;
            r16.h(strQ8, strT2, null, null, null, r17, false, null, null, null, (e23.a) objQ2, o0Var2, 0, 0, 988);
            if (bVar.f142581h != null) {
                o0Var2.C(1218812662);
                aVar3 = aVar2;
                r16.h(gl1.y.Q(o0Var2, R.string.activity_summary_activity_notes), bVar.f142581h, null, null, null, false, false, null, z3.f.c(283169154, new r(aVar3, 1), o0Var2), null, null, o0Var2, 100663296, 0, 1788);
                ?? r26 = o0Var2;
                r26.g0(r15);
                r14 = r26;
            } else {
                aVar3 = aVar2;
                o0Var2.C(1219557065);
                g6.f.a aVar9 = g6.f.f75994b;
                h4.r rVarY2 = c2.l.y(u1.n.e(x2.f(aVar6, 1.0f), p6.b.b(o0Var2), m1.f128891a), 16);
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var2, r15);
                iHashCode = Long.hashCode(o0Var2.U);
                i2VarA0 = o0Var2.a0();
                rVarC = h4.k.c(rVarY2, o0Var2);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar7);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar2, zVarA, o0Var2);
                b4.c(c1623g, i2VarA0, o0Var2);
                if (o0Var2.T) {
                    v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0Var2);
                c2.b0 b0Var2 = c2.b0.f22601a;
                String strQ9 = gl1.y.Q(o0Var2, R.string.activity_summary_activity_notes);
                fVar2.getClass();
                mh.c(strQ9, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0Var2), o0Var2, 0, 0, 131070);
                String strQ10 = gl1.y.Q(o0Var2, R.string.mct_add_a_note);
                fVar2.getClass();
                x0 x0VarA2 = x0.a(x0Var, d92.b.a(o0Var2).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                if ((i17 & 112) == 32) {
                    r19 = 1;
                } else {
                    r19 = r15;
                }
                objQ3 = o0Var2.q();
                if (r19 == 0) {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ov1.o(aVar, 23);
                        o0Var2.K(objQ3);
                    }
                } else {
                    objQ3 = new ov1.o(aVar, 23);
                    o0Var2.K(objQ3);
                }
                mh.c(strQ10, u1.w.d(aVar6, false, null, null, (e23.a) objQ3, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0Var2, 0, 0, 131068);
                ?? r27 = o0Var2;
                r27.g0(true);
                r27.g0(r15);
                r14 = r27;
            }
        } else {
            p3.o0 o0Var3 = o0VarE;
            aVar3 = aVar2;
            o0Var3.e();
            r14 = o0Var3;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(bVar, aVar, aVar3, lVar, lVar2, i14);
        }
    }

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
    public static final void d(h4.r rVar, q40.b bVar, e23.l<? super q40.b, Unit> lVar, e23.l<? super q40.b, Unit> lVar2, e23.l<? super q40.b, Unit> lVar3, e23.l<? super q40.b, Unit> lVar4, e23.l<? super Float, Unit> lVar5, p3.m mVar, int i14) {
        q40.b bVar2;
        e23.l<? super q40.b, Unit> lVar6;
        p3.m.a.C2565a c2565a;
        boolean z14;
        e23.l<? super q40.b, Unit> lVar7;
        int i15;
        o53.b0 b0Var;
        boolean z15;
        p3.o0 o0Var;
        boolean z16;
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        boolean z17;
        rVar.getClass();
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        p3.o0 o0VarE = mVar.E(1192562505);
        int i16 = (o0VarE.r(bVar) ? 32 : 16) | i14;
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(lVar4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var6 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var7 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = p3.p0.n(u0.CUTOFF_TIME);
                o0VarE.K(objQ5);
            }
            p1 p1Var8 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                objQ6 = p3.p0.n(0);
                o0VarE.K(objQ6);
            }
            p1 p1Var9 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a2) {
                objQ7 = p3.p0.n(0);
                o0VarE.K(objQ7);
            }
            p1 p1Var10 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a2) {
                objQ8 = p3.p0.n(0);
                o0VarE.K(objQ8);
            }
            p1 p1Var11 = (p1) objQ8;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a2) {
                objQ9 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ9);
            }
            o53.b0 b0Var2 = (o53.b0) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a2) {
                objQ10 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ10;
            com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar.f142580g;
            boolean z18 = fVar == com.garmin.android.apps.connectmobile.courses.model.f.COURSE_START;
            boolean z19 = fVar == com.garmin.android.apps.connectmobile.courses.model.f.COURSE_FINISH;
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            boolean z24 = z19;
            boolean z25 = (i16 & 3670016) == 1048576;
            Object objQ11 = o0VarE.q();
            if (z25 || objQ11 == c2565a2) {
                objQ11 = new a(lVar5, n1Var, null);
                o0VarE.K(objQ11);
            }
            p3.l0.e((e23.p) objQ11, numValueOf, o0VarE);
            h4.r rVarE = u1.n.e(rVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            if (z18 || z24) {
                c2565a = c2565a2;
                o0VarE.C(-1960357905);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1960907597);
                h4.r.a aVar2 = h4.r.S;
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar = j92.b.f97899b;
                c2.l.f(x2.h(aVar2, eVar.f97918c), o0VarE);
                l72.f0.a aVar3 = l72.f0.a.f111000a;
                String strQ = gl1.y.Q(o0VarE, R.string.update_location);
                bVar4.getClass();
                float f14 = eVar.f97920e;
                bVar4.getClass();
                h4.r rVarZ = c2.l.z(aVar2, f14, eVar.f97918c);
                Object objQ12 = o0VarE.q();
                if (objQ12 == c2565a2) {
                    objQ12 = new a3(n1Var, 1);
                    o0VarE.K(objQ12);
                }
                h4.r rVarF = f5.g0.f(rVarZ, (e23.l) objQ12);
                boolean zR = ((458752 & i16) == 131072) | o0VarE.r(bVar);
                Object objQ13 = o0VarE.q();
                if (zR || objQ13 == c2565a2) {
                    z17 = false;
                    objQ13 = new o0(null == true ? 1 : 0, lVar4, bVar);
                    o0VarE.K(objQ13);
                } else {
                    z17 = false;
                }
                c2565a = c2565a2;
                aVar3.j(strQ, rVarF, false, (e23.a) objQ13, o0VarE, 0, 4);
                o0VarE.g0(z17);
            }
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF2 = x2.f(aVar4, 1.0f);
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            float f16 = eVar2.f97920e;
            org.apache.commons.lang3.e.j(bVar5);
            h4.r rVarB = c2.l.B(rVarF2, f16, f15, f16, f16);
            bVar5.getClass();
            c2.t0.a(rVarB, c2.j.i(eVar2.f97918c), null, null, 0, 0, z3.f.c(-1840901554, new o(bVar, 1), o0VarE), o0VarE, 1572864, 60);
            Object objQ14 = o0VarE.q();
            if (objQ14 == c2565a) {
                objQ14 = new k0(p1Var4, 5);
                o0VarE.K(objQ14);
            }
            e23.a aVar5 = (e23.a) objQ14;
            Object objQ15 = o0VarE.q();
            if (objQ15 == c2565a) {
                objQ15 = new k0(p1Var4, 6);
                o0VarE.K(objQ15);
            }
            e23.a aVar6 = (e23.a) objQ15;
            int i17 = i16 & 896;
            boolean z26 = i17 == 256;
            Object objQ16 = o0VarE.q();
            if (z26 || objQ16 == c2565a) {
                objQ16 = new na0.l(lVar, 23);
                o0VarE.K(objQ16);
            }
            e23.l lVar8 = (e23.l) objQ16;
            boolean zR2 = ((57344 & i16) == 16384) | o0VarE.r(bVar);
            Object objQ17 = o0VarE.q();
            if (zR2 || objQ17 == c2565a) {
                objQ17 = new p0(lVar3, bVar, 0);
                o0VarE.K(objQ17);
            }
            int i18 = (i16 >> 3) & 14;
            int i19 = i16;
            c(bVar, aVar5, aVar6, lVar8, (e23.l) objQ17, o0VarE, i18 | 432);
            tn.k.n(bVar5, aVar4, f16, o0VarE);
            if (bVar.f142586m || bVar.f142585l) {
                o0VarE.C(-1959129158);
                boolean zR3 = o0VarE.r(context);
                Object objQ18 = o0VarE.q();
                if (zR3 || objQ18 == c2565a) {
                    objQ18 = new o72.f(context, 25);
                    o0VarE.K(objQ18);
                }
                e23.a aVar7 = (e23.a) objQ18;
                Object objQ19 = o0VarE.q();
                if (objQ19 == c2565a) {
                    objQ19 = new j1(p1Var6, p1Var8, 29);
                    o0VarE.K(objQ19);
                }
                e23.a aVar8 = (e23.a) objQ19;
                Object objQ20 = o0VarE.q();
                if (objQ20 == c2565a) {
                    z14 = false;
                    objQ20 = new q0(p1Var6, p1Var8, 0);
                    o0VarE.K(objQ20);
                } else {
                    z14 = false;
                }
                b(bVar, aVar7, aVar8, (e23.a) objQ20, o0VarE, i18 | 3456);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1958586193);
                o0VarE.g0(false);
            }
            if (bVar.f142584k) {
                o0VarE.C(-1958549737);
                bVar5.getClass();
                c2.l.f(x2.h(aVar4, f16), o0VarE);
                Object objQ21 = o0VarE.q();
                if (objQ21 == c2565a) {
                    objQ21 = new k0(p1Var7, 7);
                    o0VarE.K(objQ21);
                }
                a((e23.a) objQ21, o0VarE, 6);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1958403665);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0VarE.C(-335718663);
                String str = bVar.f142581h;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_name);
                Object objQ22 = o0VarE.q();
                if (objQ22 == c2565a) {
                    p1Var3 = p1Var5;
                    objQ22 = new k0(p1Var3, 8);
                    o0VarE.K(objQ22);
                } else {
                    p1Var3 = p1Var5;
                }
                e23.a aVar9 = (e23.a) objQ22;
                i15 = i17;
                boolean zR4 = o0VarE.r(bVar) | (i15 == 256);
                Object objQ23 = o0VarE.q();
                if (zR4 || objQ23 == c2565a) {
                    lVar7 = lVar;
                    z15 = true;
                    objQ23 = new p(bVar, lVar7, p1Var3, 1);
                    o0VarE.K(objQ23);
                } else {
                    lVar7 = lVar;
                    z15 = true;
                }
                b0Var = b0Var2;
                u.d(str, strQ2, b0Var, aVar9, (e23.l) objQ23, o0VarE, 3072);
                o0VarE.g0(false);
            } else {
                lVar7 = lVar;
                i15 = i17;
                b0Var = b0Var2;
                z15 = true;
                o0VarE.C(-334611591);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(-334545344);
                String str2 = bVar.f142581h;
                String strQ3 = gl1.y.Q(o0VarE, R.string.activity_summary_activity_notes);
                Object objQ24 = o0VarE.q();
                if (objQ24 == c2565a) {
                    p1Var2 = p1Var4;
                    objQ24 = new k0(p1Var2, 9);
                    o0VarE.K(objQ24);
                } else {
                    p1Var2 = p1Var4;
                }
                e23.a aVar10 = (e23.a) objQ24;
                boolean zR5 = o0VarE.r(bVar) | (i15 == 256 ? z15 : false);
                Object objQ25 = o0VarE.q();
                if (zR5 || objQ25 == c2565a) {
                    objQ25 = new p(bVar, lVar7, p1Var2, 2);
                    o0VarE.K(objQ25);
                }
                u.d(str2, strQ3, b0Var, aVar10, (e23.l) objQ25, o0VarE, 3072);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-333414247);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0Var.C(-333242507);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_duration);
                String strQ5 = gl1.y.Q(o0Var, R.string.lbl_done);
                String strQ6 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                z3.e eVarC = z3.f.c(-423228686, new q(r15, p1Var9, p1Var10, p1Var11, 1), o0Var);
                boolean zR6 = o0Var.r(bVar) | (i15 == 256 ? z15 : false);
                Object objQ26 = o0Var.q();
                if (zR6 || objQ26 == c2565a) {
                    bVar2 = bVar;
                    e23.l<? super q40.b, Unit> lVar9 = lVar7;
                    p1Var = p1Var6;
                    z16 = z15;
                    s sVar = new s(bVar2, lVar9, p1Var8, p1Var11, p1Var10, p1Var9, p1Var, 1);
                    o0Var.K(sVar);
                    objQ26 = sVar;
                } else {
                    bVar2 = bVar;
                    p1Var = p1Var6;
                    z16 = z15;
                }
                e23.a<Unit> aVar11 = (e23.a) objQ26;
                Object objQ27 = o0Var.q();
                if (objQ27 == c2565a) {
                    objQ27 = new k0(p1Var, 2);
                    o0Var.K(objQ27);
                }
                p3.o0 o0Var2 = o0Var;
                c1Var.a(true, strQ4, null, eVarC, null, strQ5, false, false, aVar11, strQ6, (e23.a) objQ27, o0Var2, 3078, 6, 212);
                o0VarE = o0Var2;
                o0VarE.g0(false);
            } else {
                bVar2 = bVar;
                z16 = z15;
                o0VarE = o0Var;
                o0VarE.C(-329234951);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                o0VarE.C(-329118887);
                g82.c cVar = g82.c.f76436a;
                String strQ7 = gl1.y.Q(o0VarE, R.string.remove_course_point);
                String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_remove);
                String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                i.f135676a.getClass();
                z3.e eVar3 = i.f135677b;
                boolean zR7 = o0VarE.r(bVar2) | ((i19 & 7168) == 2048 ? z16 : false);
                Object objQ28 = o0VarE.q();
                if (zR7 || objQ28 == c2565a) {
                    lVar6 = lVar2;
                    objQ28 = new nw0.p(lVar6, 18, bVar2, p1Var7);
                    o0VarE.K(objQ28);
                } else {
                    lVar6 = lVar2;
                }
                e23.a<Unit> aVar12 = (e23.a) objQ28;
                Object objQ29 = o0VarE.q();
                if (objQ29 == c2565a) {
                    objQ29 = new k0(p1Var7, 3);
                    o0VarE.K(objQ29);
                }
                e23.a<Unit> aVar13 = (e23.a) objQ29;
                Object objQ30 = o0VarE.q();
                if (objQ30 == c2565a) {
                    objQ30 = new k0(p1Var7, 4);
                    o0VarE.K(objQ30);
                }
                cVar.b(null, strQ7, eVar3, strQ8, aVar12, strQ9, aVar13, false, (e23.a) objQ30, o0VarE, 102236544, 129);
                o0VarE.g0(false);
            } else {
                lVar6 = lVar2;
                o0VarE.C(-328251879);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            bVar2 = bVar;
            lVar6 = lVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(rVar, bVar2, lVar, lVar6, lVar3, lVar4, lVar5, i14, 15);
        }
    }
}
