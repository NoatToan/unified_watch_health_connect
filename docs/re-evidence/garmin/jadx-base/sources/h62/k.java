package h62;

import a03.h0;
import androidx.lifecycle.v1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import g02.s0;
import g2.m1;
import gl1.y;
import gt1.t;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.c1;
import l72.f0;
import l72.j0;
import l72.n0;
import o13.r;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.d2;
import u1.y0;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListScreenKt$WorkoutListScreen$1$1", f = "WorkoutListScreen.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f82239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zc.d<WorkoutDTO> f82240c;

        /* JADX INFO: renamed from: h62.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1628a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f82241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zc.d<WorkoutDTO> f82242b;

            public C1628a(m mVar, zc.d<WorkoutDTO> dVar) {
                this.f82241a = mVar;
                this.f82242b = dVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                m mVar = this.f82241a;
                mVar.getClass();
                ge1.b.T(v1.a(mVar), null, null, new n(mVar, null), 3);
                this.f82242b.e();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, zc.d<WorkoutDTO> dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f82239b = mVar;
            this.f82240c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f82239b, this.f82240c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to h62.k$a for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f82238a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
            Le:
                r6 = 0
                return r6
            L10:
                o13.r.b(r6)
                goto L2d
            L14:
                o13.r.b(r6)
                h62.m r6 = r5.f82239b
                r53.a2 r1 = r6.f82256h
                h62.k$a$a r3 = new h62.k$a$a
                zc.d<com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO> r4 = r5.f82240c
                r3.<init>(r6, r4)
                r5.f82238a = r2
                r53.d2<T> r6 = r1.f150526a
                java.lang.Object r6 = r6.collect(r3, r5)
                if (r6 != r0) goto L2d
                return r0
            L2d:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: h62.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListScreenKt$WorkoutListScreen$2$1", f = "WorkoutListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f82243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zc.d<WorkoutDTO> f82244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f82245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, zc.d<WorkoutDTO> dVar, m mVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f82243a = lVar;
            this.f82244b = dVar;
            this.f82245c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f82243a, this.f82244b, this.f82245c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!this.f82243a.f82248c.isEmpty()) {
                zc.d<WorkoutDTO> dVar = this.f82244b;
                if (dVar.b() == 0) {
                    m mVar = this.f82245c;
                    mVar.getClass();
                    ge1.b.T(v1.a(mVar), null, null, new p(mVar, null), 3);
                    dVar.e();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-281844018);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p004k6.c.a(aVar3, null, z3.f.c(326986199, new at1.f(aVar, aVar2, 18), o0VarE), o0VarE, 390, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ds.g(aVar, aVar2, aVar3, i14, 1);
        }
    }

    public static final void b(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2017228607);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, null, y.P(R.string.workout_delete_workout_name, new Object[]{str}, o0VarE), null, null, y.Q(o0VarE, R.string.lbl_delete), false, false, aVar, y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, (i15 << 21) & 234881024, 6, 219);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(str, aVar, aVar2, i14, 2);
        }
    }

    public static final void c(boolean z14, boolean z15, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1670322466);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (z15) {
                o0VarE.C(914689845);
                d(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(914743816);
                int i16 = i15 & 14;
                int i17 = i15 >> 3;
                e(z14, aVar, aVar2, o0VarE, (i17 & 896) | i16 | (i17 & 112));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(z14, z15, aVar, aVar2, i14, 0);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1507286358);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22696f, aVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            t4.d dVarA = n5.c.a(2131233734, o0VarE, 0);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            y0.a(dVarA, null, c2.l.C(aVar, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13), null, null, 0.0f, null, o0VarE, 48, 120);
            String strQ = y.Q(o0VarE, R.string.workout_scheduling_list_empty_message);
            bVar2.getClass();
            h4.r rVarY = c2.l.y(aVar, eVar.f97922g);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h51.a(i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:57:0x01df  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x020c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0221  */
    /* JADX WARN: Code duplicated, block: B:72:0x0271  */
    /* JADX WARN: Code duplicated, block: B:74:0x029b  */
    /* JADX WARN: Code duplicated, block: B:76:0x029f  */
    public static final void e(boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        int i15;
        int i16;
        j92.b bVar;
        j92.e eVar;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        o0 o0VarE = mVar.E(232448269);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA3 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                h4.r rVarA = c2.b0.f22601a.a(aVar3, 1.0f, true);
                zVarA = c2.y.a(c2.j.f22696f, h4.d.a.f81537o, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                i15 = i17;
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                y0.a(n5.c.a(2131232243, o0VarE, 0), null, null, null, null, 0.0f, null, o0VarE, 48, 124);
                if (z14) {
                    i16 = R.string.msg_empty_workouts_list;
                } else {
                    i16 = R.string.beta_empty_workouts_list_msg;
                }
                String strQ = y.Q(o0VarE, i16);
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57755e;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                mh.c(strQ, c2.l.y(aVar3, eVar.f97921f), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                bVar.getClass();
                h4.r rVarY = c2.l.y(aVar3, eVar.f97920e);
                zVarA2 = c2.y.a(kVar, aVar4, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (z14) {
                    o0VarE.C(-677191050);
                    f0 f0Var = f0.f110999a;
                    String strQ2 = y.Q(o0VarE, R.string.workout_lbl_create_workout);
                    h4.r rVarF = x2.f(aVar3, 1.0f);
                    bVar.getClass();
                    f0Var.i(strQ2, c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), false, aVar2, o0VarE, (i15 << 3) & 7168, 4);
                    o0VarE = o0VarE;
                    f0Var.d(((i15 << 9) & 57344) | 384, 9, aVar, x2.f(aVar3, 1.0f), y.Q(o0VarE, R.string.workout_lbl_find_workout), o0VarE, null, false);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-676627718);
                    f0.f110999a.d(((i15 << 6) & 57344) | 384, 9, aVar2, x2.f(aVar3, 1.0f), y.Q(o0VarE, R.string.workout_lbl_create_workout), o0VarE, null, false);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            h4.r rVarA2 = c2.b0.f22601a.a(aVar3, 1.0f, true);
            zVarA = c2.y.a(c2.j.f22696f, h4.d.a.f81537o, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            i15 = i17;
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            y0.a(n5.c.a(2131232243, o0VarE, 0), null, null, null, null, 0.0f, null, o0VarE, 48, 124);
            if (z14) {
                i16 = R.string.msg_empty_workouts_list;
            } else {
                i16 = R.string.beta_empty_workouts_list_msg;
            }
            String strQ3 = y.Q(o0VarE, i16);
            d6.h.f57752b.getClass();
            int i19 = d6.h.f57755e;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0VarE);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            mh.c(strQ3, c2.l.y(aVar3, eVar.f97921f), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            bVar.getClass();
            h4.r rVarY2 = c2.l.y(aVar3, eVar.f97920e);
            zVarA2 = c2.y.a(kVar, aVar4, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarY2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (z14) {
                o0VarE.C(-677191050);
                f0 f0Var2 = f0.f110999a;
                String strQ4 = y.Q(o0VarE, R.string.workout_lbl_create_workout);
                h4.r rVarF2 = x2.f(aVar3, 1.0f);
                bVar.getClass();
                f0Var2.i(strQ4, c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), false, aVar2, o0VarE, (i15 << 3) & 7168, 4);
                o0VarE = o0VarE;
                f0Var2.d(((i15 << 9) & 57344) | 384, 9, aVar, x2.f(aVar3, 1.0f), y.Q(o0VarE, R.string.workout_lbl_find_workout), o0VarE, null, false);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-676627718);
                f0.f110999a.d(((i15 << 6) & 57344) | 384, 9, aVar2, x2.f(aVar3, 1.0f), y.Q(o0VarE, R.string.workout_lbl_create_workout), o0VarE, null, false);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(z14, aVar, aVar2, i14, 0);
        }
    }

    public static final void f(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1346245105);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22696f, aVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            y0.a(n5.c.a(2131232244, o0VarE, 0), null, null, null, null, 0.0f, null, o0VarE, 48, 124);
            String strQ = y.Q(o0VarE, R.string.msg_workouts_unknown_error);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97918c);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h51.a(i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final m mVar, final boolean z14, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final e23.l<? super WorkoutDTO, Unit> lVar, p3.m mVar2, final int i14) {
        o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        mVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar2.E(-701705460);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            l lVar2 = (l) o53.f0.G(mVar.f82252d, o0VarE).getF182175a();
            if (lVar2 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(mVar, z14, aVar, aVar2, aVar3, lVar, i14, i16) { // from class: h62.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f82213a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m f82214b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f82215c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.a f82216d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.a f82217e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.a f82218f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.l f82219g;

                    {
                        this.f82213a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f82213a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                k.g(this.f82214b, this.f82215c, this.f82216d, this.f82217e, this.f82218f, this.f82219g, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                k.g(this.f82214b, this.f82215c, this.f82216d, this.f82217e, this.f82218f, this.f82219g, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                zc.d dVarA = zc.g.a(mVar.f82262n, o0VarE);
                Unit unit = Unit.INSTANCE;
                boolean zR = o0VarE.r(mVar) | o0VarE.r(dVarA);
                Object objQ = o0VarE.q();
                p3.m.a aVar4 = p3.m.f135153a;
                if (zR) {
                    objQ = new a(mVar, dVarA, null);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(mVar, dVarA, null);
                        o0VarE.K(objQ);
                    }
                }
                l0.e((e23.p) objQ, unit, o0VarE);
                List<m52.k> list = lVar2.f82248c;
                Integer numValueOf = Integer.valueOf(dVarA.b());
                boolean zR2 = o0VarE.r(lVar2) | o0VarE.r(dVarA) | o0VarE.r(mVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new b(lVar2, dVarA, mVar, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(lVar2, dVarA, mVar, null);
                        o0VarE.K(objQ2);
                    }
                }
                l0.f(list, numValueOf, (e23.p) objQ2, o0VarE);
                if ((!(dVarA.d().f196385a instanceof z0.b) || dVarA.b() != 0) && !lVar2.f82246a) {
                    z15 = false;
                }
                o0Var = o0VarE;
                s0.a(null, z15, z3.f.c(2030842070, new e11.n(dVarA, mVar, lVar2, z14, aVar, aVar2, aVar3, lVar, 4), o0VarE), o0Var, 384, 1);
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(mVar, z14, aVar, aVar2, aVar3, lVar, i14, i17) { // from class: h62.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f82213a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f82214b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f82215c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.a f82216d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f82217e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f82218f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f82219g;

                {
                    this.f82213a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f82213a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            k.g(this.f82214b, this.f82215c, this.f82216d, this.f82217e, this.f82218f, this.f82219g, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            k.g(this.f82214b, this.f82215c, this.f82216d, this.f82217e, this.f82218f, this.f82219g, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void h(String str, u4.d dVar, long j8, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        u4.d dVar2;
        int i16;
        long j14;
        int i17;
        u4.d dVar3;
        long j15;
        long j16;
        o0 o0VarE = mVar.E(-1758891183);
        int i18 = i14 | (o0VarE.B(str) ? 4 : 2);
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 = i18 | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i16 = i18 | (o0VarE.B(dVar2) ? 32 : 16);
        }
        int i24 = i15 & 4;
        if (i24 != 0) {
            i17 = i16 | 384;
            j14 = j8;
        } else {
            j14 = j8;
            i17 = i16 | (o0VarE.l(j14) ? 256 : 128);
        }
        int i25 = (o0VarE.r(aVar) ? 2048 : 1024) | i17;
        if (o0VarE.n(i25 & 1, (i25 & 1171) != 1170)) {
            u4.d dVar4 = i19 != 0 ? null : dVar2;
            if (i24 != 0) {
                d0.f128823b.getClass();
                j16 = d0.f128832k;
            } else {
                j16 = j14;
            }
            x1 x1Var = p3.n.f135158a;
            l72.p2.f111205a.g(str, null, null, null, z3.f.c(-1830315290, new a3.l0(dVar4, str, j16, 5), o0VarE), false, false, aVar, o0VarE, (i25 & 14) | 24576 | ((i25 << 15) & 234881024), 238);
            dVar3 = dVar4;
            j15 = j16;
        } else {
            o0VarE.e();
            dVar3 = dVar2;
            j15 = j14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.h(str, dVar3, j15, aVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    public static final void i(i53.c<? extends m52.k> cVar, i53.c<? extends m52.k> cVar2, e23.p<? super m52.k, ? super Boolean, Unit> pVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1258165810);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(cVar2) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new d2(0);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d2(0);
                    o0VarE.K(objQ);
                }
            }
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarB = a2.b(aVar3, (d2) objQ, false);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar.f97917b, 7);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            c2.l.f(c2.l.C(aVar3, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), o0VarE);
            j0 j0Var = new j0(y.Q(o0VarE, R.string.lbl_all_workouts), null, null, false, cVar2.isEmpty(), 14, null);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new h0(aVar, 27);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new h0(aVar, 27);
                    o0VarE.K(objQ2);
                }
            }
            n0.a(null, j0Var, 0L, (e23.l) objQ2, o0VarE, 0, 5);
            o0VarE.C(339208153);
            for (m52.k kVar : cVar) {
                j0 j0Var2 = new j0(y.Q(o0VarE, kVar.f116769e), null, null, false, cVar2.contains(kVar), 14, null);
                boolean zK = ((i15 & 896) == 256) | o0VarE.k(kVar.ordinal());
                Object objQ3 = o0VarE.q();
                if (zK) {
                    objQ3 = new m1(14, pVar, kVar);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new m1(14, pVar, kVar);
                        o0VarE.K(objQ3);
                    }
                }
                n0.a(null, j0Var2, 0L, (e23.l) objQ3, o0VarE, 0, 5);
            }
            o0VarE.g0(false);
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar5, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), o0VarE);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(cVar, cVar2, pVar, aVar, i14, 11);
        }
    }
}
