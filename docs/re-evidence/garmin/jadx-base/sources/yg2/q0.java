package yg2;

import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.f2;
import f5.z0;
import i3.ce;
import i3.e5;
import i3.fe;
import i3.h7;
import i3.k1;
import i3.l1;
import i3.mh;
import i3.o1;
import java.util.Comparator;
import java.util.Iterator;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;
import v62.e1;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public a(Object obj) {
            super(1, obj, u0.class, "onStartWorkoutStepNowClick", "onStartWorkoutStepNowClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).D4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public b(Object obj) {
            super(1, obj, u0.class, "onSkipWorkoutStepClick", "onSkipWorkoutStepClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).C4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public c(Object obj) {
            super(1, obj, u0.class, "onAddSkippedWorkoutStepClick", "onAddSkippedWorkoutStepClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).A4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public d(Object obj) {
            super(1, obj, u0.class, "onDeleteWorkoutStepClick", "onDeleteWorkoutStepClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).B4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public e(Object obj) {
            super(1, obj, u0.class, "onStartWorkoutStepNowClick", "onStartWorkoutStepNowClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).D4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public f(Object obj) {
            super(1, obj, u0.class, "onSkipWorkoutStepClick", "onSkipWorkoutStepClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).C4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public g(Object obj) {
            super(1, obj, u0.class, "onAddSkippedWorkoutStepClick", "onAddSkippedWorkoutStepClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).A4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public h(Object obj) {
            super(1, obj, u0.class, "onDeleteWorkoutStepClick", "onDeleteWorkoutStepClick(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            ((u0) this.receiver).B4(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((h0) t7).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()), Integer.valueOf(((h0) t14).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewKt$ClusterHeader$1$1$1$1$2$3$2$3$1$1", f = "WorkoutView.kt", l = {467}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f197147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f197148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f197149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i14, e2.i0 i0Var, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f197148b = i14;
            this.f197149c = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f197148b, this.f197149c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f197147a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = this.f197148b;
                if (i15 >= 0) {
                    this.f197147a = 1;
                    if (e2.i0.f(this.f197149c, i15, this) == aVar) {
                        return aVar;
                    }
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

    /* JADX WARN: Code duplicated, block: B:115:0x0212  */
    /* JADX WARN: Code duplicated, block: B:120:0x0231  */
    /* JADX WARN: Code duplicated, block: B:125:0x0250  */
    /* JADX WARN: Code duplicated, block: B:130:0x026f  */
    public static final void a(yg2.a aVar, int i14, o oVar, u0 u0Var, h0 h0Var, e2.i0 i0Var, o53.b0 b0Var, boolean z14, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i15) {
        o53.b0 b0Var2;
        boolean z15;
        e23.l<? super Integer, Unit> lVar2;
        p3.o0 o0Var;
        boolean z16;
        boolean z17;
        boolean z18;
        aVar.getClass();
        oVar.getClass();
        i0Var.getClass();
        b0Var.getClass();
        p3.o0 o0VarE = mVar.E(-1791539364);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16);
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(oVar) ? 256 : 128;
        }
        int i17 = i16 | (o0VarE.r(u0Var) ? 2048 : 1024);
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.r(h0Var) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.B(i0Var) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            b0Var2 = b0Var;
            i17 |= o0VarE.r(b0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            b0Var2 = b0Var;
        }
        if ((12582912 & i15) == 0) {
            z15 = z14;
            i17 |= o0VarE.h(z15) ? 8388608 : 4194304;
        } else {
            z15 = z14;
        }
        if ((100663296 & i15) == 0) {
            lVar2 = lVar;
            i17 |= o0VarE.r(lVar2) ? 67108864 : 33554432;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97916a;
            bVar.getClass();
            float f15 = eVar.f97916a;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar2, f14, 0.0f, f15, eVar.f97917b, 2);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            int i18 = i17;
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (i14 == 1) {
                o0VarE.C(1224098492);
                h0 h0VarA = g0.a(oVar.d(), Integer.valueOf(aVar.getStartStepIndex()));
                if (h0VarA == null) {
                    o0VarE.C(1224098491);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    z17 = false;
                    z18 = true;
                } else {
                    o0VarE.C(1224098492);
                    long jB = g0.b(h0VarA.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String(), o0VarE);
                    i0 i0Var2 = h0VarA.f197040g;
                    String str = i0Var2 != null ? i0Var2.f197053a : null;
                    nt2.e eVar2 = i0Var2 != null ? i0Var2.f197054b : null;
                    i53.c<nt2.e> cVar = i0Var2 != null ? i0Var2.f197055c : null;
                    String str2 = i0Var2 != null ? i0Var2.f197057e : null;
                    n status = h0VarA.getStatus();
                    String str3 = str2;
                    i53.c<nt2.e> cVar2 = cVar;
                    boolean z19 = h0VarA.getStatus() == n.ACTIVE;
                    int i19 = h0VarA.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                    int iG0 = p13.h0.g0(h0Var != null ? fg2.h0.f(h0Var, oVar) : null, oVar.b());
                    boolean z24 = (h0VarA.getCategory() == null || h0VarA.getExerciseName() == null) ? false : true;
                    boolean zR = o0VarE.r(u0Var);
                    Object objQ = o0VarE.q();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (zR) {
                        objQ = new a(u0Var);
                        o0VarE.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a(u0Var);
                            o0VarE.K(objQ);
                        }
                    }
                    e23.l lVar3 = (e23.l) ((k23.g) objQ);
                    boolean zR2 = o0VarE.r(u0Var);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new b(u0Var);
                        o0VarE.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new b(u0Var);
                            o0VarE.K(objQ2);
                        }
                    }
                    e23.l lVar4 = (e23.l) ((k23.g) objQ2);
                    boolean zR3 = o0VarE.r(u0Var);
                    Object objQ3 = o0VarE.q();
                    if (zR3) {
                        objQ3 = new c(u0Var);
                        o0VarE.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new c(u0Var);
                            o0VarE.K(objQ3);
                        }
                    }
                    e23.l lVar5 = (e23.l) ((k23.g) objQ3);
                    boolean zR4 = o0VarE.r(u0Var);
                    Object objQ4 = o0VarE.q();
                    if (zR4) {
                        objQ4 = new d(u0Var);
                        o0VarE.K(objQ4);
                    } else {
                        aVar4.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new d(u0Var);
                            o0VarE.K(objQ4);
                        }
                    }
                    z17 = false;
                    z18 = true;
                    t.a(jB, str, eVar2, cVar2, str3, status, true, false, z19, i19, i0Var, b0Var2, iG0, lVar2, z24, lVar3, lVar4, lVar5, (e23.l) ((k23.g) objQ4), fg2.h0.a(aVar, oVar), o0VarE, 14155776, (i18 >> 15) & 7294, 0);
                    o0Var = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(z17);
                z16 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.C(1225559336);
                z16 = true;
                u.a(z3.f.c(-824743238, new gw0.b(oVar, aVar, z15, h0Var, u0Var, i0Var, b0Var, lVar, aVar), o0Var), o0Var, 6);
                o0Var.g0(false);
                Unit unit2 = Unit.INSTANCE;
            }
            o0Var.g0(z16);
            Unit unit3 = Unit.INSTANCE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.q(aVar, i14, oVar, u0Var, h0Var, i0Var, b0Var, z14, lVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025a  */
    /* JADX WARN: Code duplicated, block: B:101:0x025e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0279  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final yg2.a aVar, final o oVar, final h0 h0Var, final u0 u0Var, final e2.i0 i0Var, final o53.b0 b0Var, boolean z14, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        p3.o0 o0Var;
        boolean z16;
        Throwable th3;
        int i17;
        mt2.c cVar;
        String strValueOf;
        p005kotlin.jvm.internal.m0 m0Var;
        h5.g.a.f fVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        lt2.a duration;
        lt2.b primaryTarget;
        aVar.getClass();
        oVar.getClass();
        i0Var.getClass();
        b0Var.getClass();
        p3.o0 o0VarE = mVar.E(-1911323483);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(h0Var) ? 256 : 128) | (o0VarE.r(u0Var) ? 2048 : 1024) | (o0VarE.B(i0Var) ? 16384 : 8192) | (o0VarE.r(b0Var) ? 131072 : 65536);
        int i19 = i15 & 64;
        if (i19 != 0) {
            i16 = i18 | 1572864;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = i18 | (o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            boolean z17 = i19 != 0 ? true : z15;
            x1 x1Var = p3.n.f135158a;
            int i24 = aVar.f196937d;
            h0 h0VarA = g0.a(oVar.d(), Integer.valueOf(aVar.getEndStepIndex()));
            if (h0VarA == null || !h0VarA.f197048o) {
                h0VarA = null;
            }
            if (h0VarA == null || (primaryTarget = h0VarA.getPrimaryTarget()) == null) {
                th3 = null;
                i17 = 1;
            } else {
                th3 = null;
                i17 = (int) primaryTarget.f114871b;
            }
            if (h0VarA == null || (duration = h0VarA.getDuration()) == null || (cVar = duration.f114866a) == null) {
                cVar = mt2.c.REPS;
            }
            final boolean z18 = z17;
            p005kotlin.jvm.internal.m0 m0Var2 = new p005kotlin.jvm.internal.m0();
            if (cVar == mt2.c.TIME) {
                o0VarE.C(-1855767457);
                if (fg2.h0.m(aVar, oVar)) {
                    o0VarE.C(-1855703287);
                    strValueOf = (String) p3.p0.c(u0Var.f197214e, o0VarE, 0).getF182175a();
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i17);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1855604273);
                    o0VarE.g0(false);
                    strValueOf = u0Var.y4().h().f3292a.u(Float.valueOf(i17));
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1855507181);
                m0Var2.f105804a = true;
                if (fg2.h0.m(aVar, oVar)) {
                    o0VarE.C(-1855418676);
                    strValueOf = gl1.y.P(R.string.value_slash_value, new Object[]{String.valueOf(i24), String.valueOf(i17)}, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1855241170);
                    o0VarE.g0(false);
                    strValueOf = String.valueOf(i17);
                }
                o0VarE.g0(false);
            }
            final String str = strValueOf;
            zf2.d dVar = (zf2.d) p3.p0.c(u0Var.f197212c, o0VarE, 0).getF182175a();
            final int i25 = dVar != null ? dVar.f204635g : R.string.lbl_sets;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar2 = j92.b.f97900c;
            float f14 = dVar2.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f14, dVar2.f97912d, 0.0f, 0.0f, 12);
            h4.r.a aVar2 = h4.r.S;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97917b;
            bVar.getClass();
            float f16 = eVar.f97916a;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, f16, f15, eVar.f97916a, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                m0Var = m0Var2;
            } else {
                m0Var = m0Var2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                h4.r rVarA = c2.l.A(u1.n.e(aVar2, d92.b.a(o0VarE).j().c(), hVarC), 0.0f, 0.0f, 3);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                l1 l1Var = l1.f88793a;
                long jB = d92.b.a(o0VarE).c().b();
                l1Var.getClass();
                o0Var = o0VarE;
                k1 k1VarA = l1.a(0, 14, jB, 0L, o0Var);
                h4.r rVarF = x2.f(aVar2, 1.0f);
                float f17 = 1;
                g6.f.a aVar4 = g6.f.f75994b;
                final p005kotlin.jvm.internal.m0 m0Var3 = m0Var;
                o1.a(c2.l.C(rVarF, f17, f17, f17, 0.0f, 8), hVarC, k1VarA, null, z3.f.c(1232021193, new e23.q() { // from class: yg2.p0
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float f18;
                        String strP;
                        h5.e0.a aVar5;
                        h5.g.a.b bVar3;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.a0) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            h4.d.f81522a.getClass();
                            h4.g.b bVar4 = h4.d.a.f81534l;
                            h4.r.a aVar6 = h4.r.S;
                            c2.j.f22691a.getClass();
                            s2 s2VarA2 = q2.a(c2.j.f22692b, bVar4, mVar2, 48);
                            int iHashCode3 = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC4 = h4.k.c(aVar6, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar7 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar3 = h5.g.a.f81810g;
                            b4.c(eVar3, s2VarA2, mVar2);
                            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                            b4.c(c1623g2, i2VarX, mVar2);
                            h5.g.a.b bVar5 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                            }
                            h5.g.a.f fVar2 = h5.g.a.f81807d;
                            b4.c(fVar2, rVarC4, mVar2);
                            u2 u2Var2 = u2.f22900a;
                            boolean z19 = z18;
                            if (z19) {
                                f18 = 0;
                                g6.f.a aVar8 = g6.f.f75994b;
                            } else {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f18 = j92.b.f97899b.f97918c;
                            }
                            h4.r rVarA2 = c2.l.A(aVar6, 0.0f, f18, 1);
                            c2.j.k kVar = c2.j.f22694d;
                            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                            int iHashCode4 = Long.hashCode(mVar2.getU());
                            i2 i2VarX2 = mVar2.x();
                            h4.r rVarC5 = h4.k.c(rVarA2, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar3, zVarA, mVar2);
                            b4.c(c1623g2, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                            }
                            b4.c(fVar2, rVarC5, mVar2);
                            c2.b0 b0Var2 = c2.b0.f22601a;
                            p005kotlin.jvm.internal.m0 m0Var4 = m0Var3;
                            boolean z24 = m0Var4.f105804a;
                            int i26 = i25;
                            String str2 = str;
                            if (z24) {
                                mVar2.C(990294653);
                                strP = gl1.y.P(i26, new Object[]{str2}, mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(990508522);
                                mVar2.f();
                                strP = str2;
                            }
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
                            d92.b.f58625c.getClass();
                            j92.e eVar4 = j92.b.f97899b;
                            mh.c(strP, c2.l.z(aVar6, eVar4.f97920e, eVar4.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                            p3.m mVar3 = mVar2;
                            mVar3.y();
                            if (z19) {
                                mVar3.C(1124084563);
                                Object objQ = mVar3.q();
                                p3.m.f135153a.getClass();
                                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar3.K(objQ);
                                }
                                p1 p1Var = (p1) objQ;
                                h4.r rVarA3 = c2.l.A(x2.d(aVar6, 1.0f), eVar4.f97918c, 0.0f, 2);
                                c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81538p, mVar3, 48);
                                int iHashCode5 = Long.hashCode(mVar3.getU());
                                i2 i2VarX3 = mVar3.x();
                                h4.r rVarC6 = h4.k.c(rVarA3, mVar3);
                                if (mVar3.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar3.z();
                                if (mVar3.getT()) {
                                    aVar5 = aVar7;
                                    mVar3.M(aVar5);
                                } else {
                                    aVar5 = aVar7;
                                    mVar3.c();
                                }
                                b4.c(eVar3, zVarA2, mVar3);
                                b4.c(c1623g2, i2VarX3, mVar3);
                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode5))) {
                                    bVar3 = bVar5;
                                    v.h.z(iHashCode5, mVar3, iHashCode5, bVar3);
                                } else {
                                    bVar3 = bVar5;
                                }
                                b4.c(fVar2, rVarC6, mVar3);
                                a aVar9 = aVar;
                                o oVar2 = oVar;
                                if (fg2.h0.o(aVar9, oVar2)) {
                                    mVar3.C(1395466608);
                                    h4.r rVarQ = x2.q(aVar6, eVar4.f97923h);
                                    z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                                    int iHashCode6 = Long.hashCode(mVar3.getU());
                                    i2 i2VarX4 = mVar3.x();
                                    h4.r rVarC7 = h4.k.c(rVarQ, mVar3);
                                    if (mVar3.F() == null) {
                                        p3.p0.l();
                                        throw null;
                                    }
                                    mVar3.z();
                                    if (mVar3.getT()) {
                                        mVar3.M(aVar5);
                                    } else {
                                        mVar3.c();
                                    }
                                    b4.c(eVar3, z0VarD2, mVar3);
                                    b4.c(c1623g2, i2VarX4, mVar3);
                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                                        v.h.z(iHashCode6, mVar3, iHashCode6, bVar3);
                                    }
                                    b4.c(fVar2, rVarC7, mVar3);
                                    c2.u uVar2 = c2.u.f22885a;
                                    y0.b(e1.a(t62.b.f162798a), "", x2.q(aVar6, j92.b.f97901d.f97905d), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e()), mVar3, 48, 56);
                                    mVar3.y();
                                    mVar3.f();
                                } else {
                                    int i27 = 0;
                                    mVar3.C(1396342637);
                                    Object objQ2 = mVar3.q();
                                    if (objQ2 == c2565a) {
                                        objQ2 = new l0(p1Var, i27);
                                        mVar3.K(objQ2);
                                    }
                                    h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(223648306, new fo.b(p1Var, aVar9, oVar2, h0Var, u0Var, b0Var, i0Var, m0Var4, i26, str2, 16), mVar3), mVar3, 1572870, 62);
                                    mVar3 = mVar3;
                                    mVar3.f();
                                }
                                mVar3.y();
                                mVar3.f();
                            } else {
                                mVar3.C(1131290141);
                                mVar3.f();
                            }
                            mVar3.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), o0Var, 196608, 24);
                o0Var.g0(true);
                o0Var.g0(true);
                z16 = z18;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var2 = u2.f22900a;
            h4.r rVarA2 = c2.l.A(u1.n.e(aVar2, d92.b.a(o0VarE).j().c(), hVarC), 0.0f, 0.0f, 3);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            l1 l1Var2 = l1.f88793a;
            long jB2 = d92.b.a(o0VarE).c().b();
            l1Var2.getClass();
            o0Var = o0VarE;
            k1 k1VarA2 = l1.a(0, 14, jB2, 0L, o0Var);
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            float f18 = 1;
            g6.f.a aVar5 = g6.f.f75994b;
            final p005kotlin.jvm.internal.m0 m0Var4 = m0Var;
            o1.a(c2.l.C(rVarF2, f18, f18, f18, 0.0f, 8), hVarC, k1VarA2, null, z3.f.c(1232021193, new e23.q() { // from class: yg2.p0
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f19;
                    String strP;
                    h5.e0.a aVar6;
                    h5.g.a.b bVar3;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.d.f81522a.getClass();
                        h4.g.b bVar4 = h4.d.a.f81534l;
                        h4.r.a aVar7 = h4.r.S;
                        c2.j.f22691a.getClass();
                        s2 s2VarA2 = q2.a(c2.j.f22692b, bVar4, mVar2, 48);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC4 = h4.k.c(aVar7, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar8 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar8);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, s2VarA2, mVar2);
                        h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                        b4.c(c1623g2, i2VarX, mVar2);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                        }
                        h5.g.a.f fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC4, mVar2);
                        u2 u2Var3 = u2.f22900a;
                        boolean z19 = z18;
                        if (z19) {
                            f19 = 0;
                            g6.f.a aVar9 = g6.f.f75994b;
                        } else {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f19 = j92.b.f97899b.f97918c;
                        }
                        h4.r rVarA3 = c2.l.A(aVar7, 0.0f, f19, 1);
                        c2.j.k kVar = c2.j.f22694d;
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC5 = h4.k.c(rVarA3, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar8);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar3, zVarA, mVar2);
                        b4.c(c1623g2, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                        }
                        b4.c(fVar2, rVarC5, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        p005kotlin.jvm.internal.m0 m0Var5 = m0Var4;
                        boolean z24 = m0Var5.f105804a;
                        int i26 = i25;
                        String str2 = str;
                        if (z24) {
                            mVar2.C(990294653);
                            strP = gl1.y.P(i26, new Object[]{str2}, mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(990508522);
                            mVar2.f();
                            strP = str2;
                        }
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
                        d92.b.f58625c.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        mh.c(strP, c2.l.z(aVar7, eVar4.f97920e, eVar4.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                        p3.m mVar3 = mVar2;
                        mVar3.y();
                        if (z19) {
                            mVar3.C(1124084563);
                            Object objQ = mVar3.q();
                            p3.m.f135153a.getClass();
                            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = p3.p0.n(Boolean.FALSE);
                                mVar3.K(objQ);
                            }
                            p1 p1Var = (p1) objQ;
                            h4.r rVarA4 = c2.l.A(x2.d(aVar7, 1.0f), eVar4.f97918c, 0.0f, 2);
                            c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81538p, mVar3, 48);
                            int iHashCode5 = Long.hashCode(mVar3.getU());
                            i2 i2VarX3 = mVar3.x();
                            h4.r rVarC6 = h4.k.c(rVarA4, mVar3);
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                aVar6 = aVar8;
                                mVar3.M(aVar6);
                            } else {
                                aVar6 = aVar8;
                                mVar3.c();
                            }
                            b4.c(eVar3, zVarA2, mVar3);
                            b4.c(c1623g2, i2VarX3, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode5))) {
                                bVar3 = bVar5;
                                v.h.z(iHashCode5, mVar3, iHashCode5, bVar3);
                            } else {
                                bVar3 = bVar5;
                            }
                            b4.c(fVar2, rVarC6, mVar3);
                            a aVar10 = aVar;
                            o oVar2 = oVar;
                            if (fg2.h0.o(aVar10, oVar2)) {
                                mVar3.C(1395466608);
                                h4.r rVarQ = x2.q(aVar7, eVar4.f97923h);
                                z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                                int iHashCode6 = Long.hashCode(mVar3.getU());
                                i2 i2VarX4 = mVar3.x();
                                h4.r rVarC7 = h4.k.c(rVarQ, mVar3);
                                if (mVar3.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar3.z();
                                if (mVar3.getT()) {
                                    mVar3.M(aVar6);
                                } else {
                                    mVar3.c();
                                }
                                b4.c(eVar3, z0VarD2, mVar3);
                                b4.c(c1623g2, i2VarX4, mVar3);
                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                                    v.h.z(iHashCode6, mVar3, iHashCode6, bVar3);
                                }
                                b4.c(fVar2, rVarC7, mVar3);
                                c2.u uVar3 = c2.u.f22885a;
                                y0.b(e1.a(t62.b.f162798a), "", x2.q(aVar7, j92.b.f97901d.f97905d), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e()), mVar3, 48, 56);
                                mVar3.y();
                                mVar3.f();
                            } else {
                                int i27 = 0;
                                mVar3.C(1396342637);
                                Object objQ2 = mVar3.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new l0(p1Var, i27);
                                    mVar3.K(objQ2);
                                }
                                h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(223648306, new fo.b(p1Var, aVar10, oVar2, h0Var, u0Var, b0Var, i0Var, m0Var5, i26, str2, 16), mVar3), mVar3, 1572870, 62);
                                mVar3 = mVar3;
                                mVar3.f();
                            }
                            mVar3.y();
                            mVar3.f();
                        } else {
                            mVar3.C(1131290141);
                            mVar3.f();
                        }
                        mVar3.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0Var, 196608, 24);
            o0Var.g0(true);
            o0Var.g0(true);
            z16 = z18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.q(aVar, oVar, h0Var, u0Var, i0Var, b0Var, z16, i14, i15);
        }
    }

    public static final void c(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final void d(yg2.a aVar, o oVar, h0 h0Var, u0 u0Var, e2.i0 i0Var, o53.b0 b0Var, e23.l lVar, p3.m mVar, int i14) {
        boolean z14;
        oVar.getClass();
        i0Var.getClass();
        b0Var.getClass();
        p3.o0 o0VarE = mVar.E(-579050991);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(h0Var) ? 256 : 128) | (o0VarE.r(u0Var) ? 2048 : 1024) | (o0VarE.B(i0Var) ? 16384 : 8192) | (o0VarE.r(b0Var) ? 131072 : 65536) | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            c2.b0 b0Var2 = c2.b0.f22601a;
            int endStepIndex = (aVar.getEndStepIndex() - aVar.getStartStepIndex()) + 1;
            if (endStepIndex > 1) {
                o0VarE.C(-230187773);
                h4.r rVarE = u1.n.e(aVar2, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                z14 = true;
                b(aVar, oVar, h0Var, u0Var, i0Var, b0Var, false, o0VarE, i15 & 524286, 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(-229722649);
                o0VarE.g0(false);
            }
            int i16 = i15 << 3;
            a(aVar, endStepIndex, oVar, u0Var, h0Var, i0Var, b0Var, true, lVar, o0VarE, (i15 & 14) | (i16 & 896) | (i15 & 7168) | (57344 & (i15 << 6)) | (458752 & i16) | (3670016 & i16) | 12582912 | (i16 & 234881024));
            o0VarE = o0VarE;
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xx1.c(aVar, oVar, h0Var, u0Var, i0Var, b0Var, lVar, i14, 2);
        }
    }

    public static final void e(final h0 h0Var, final h0 h0Var2, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        final int i15;
        int i16;
        int i17;
        int i18;
        p3.o0 o0VarE = mVar.E(642136385);
        int i19 = (o0VarE.r(h0Var) ? 4 : 2) | i14 | (o0VarE.r(h0Var2) ? 32 : 16);
        final int i24 = 0;
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (h0Var2 == null || h0Var.getSkipFinalRest() == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(h0Var, h0Var2, i14, i24) { // from class: yg2.k0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f197070a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ h0 f197071b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ h0 f197072c;

                        {
                            this.f197070a = i24;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i25 = this.f197070a;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i25) {
                                case 0:
                                    q0.e(this.f197071b, this.f197072c, mVar2, p3.p0.t(1));
                                    break;
                                default:
                                    q0.e(this.f197071b, this.f197072c, mVar2, p3.p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar, f14, eVar.f97918c, f15, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (h0Var.getSkipFinalRest().booleanValue()) {
                i16 = -1923942372;
                i17 = R.string.lbl_on;
            } else {
                i16 = -1923941187;
                i17 = R.string.lbl_off;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false);
            mt2.l lVar = h0Var2.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
            lVar.getClass();
            switch (v.a.f197223a[lVar.ordinal()]) {
                case 1:
                    i18 = R.string.workout_step_type_interval;
                    break;
                case 2:
                    i18 = R.string.workout_step_type_rest;
                    break;
                case 3:
                    i18 = R.string.workout_step_type_warmup;
                    break;
                case 4:
                    i18 = R.string.workout_step_type_cooldown;
                    break;
                case 5:
                    i18 = R.string.workout_step_type_recovery;
                    break;
                case 6:
                    i18 = R.string.workout_step_type_other;
                    break;
                default:
                    lc.u0.r();
                    return;
            }
            String strG = e5.g(gl1.y.P(R.string.lbl_workout_skip_last_step, new Object[]{gl1.y.Q(o0VarE, i18)}, o0VarE), ": ", strJ);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            i15 = 1;
            mh.c(strG, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new e23.p(h0Var, h0Var2, i14, i15) { // from class: yg2.k0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f197070a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f197071b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h0 f197072c;

                {
                    this.f197070a = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i25 = this.f197070a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i25) {
                        case 0:
                            q0.e(this.f197071b, this.f197072c, mVar2, p3.p0.t(1));
                            break;
                        default:
                            q0.e(this.f197071b, this.f197072c, mVar2, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
    /* JADX WARN: Code duplicated, block: B:105:0x0245  */
    /* JADX WARN: Code duplicated, block: B:108:0x025e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0264  */
    /* JADX WARN: Code duplicated, block: B:113:0x0290  */
    /* JADX WARN: Code duplicated, block: B:114:0x0292  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x0394  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:130:0x03db  */
    /* JADX WARN: Code duplicated, block: B:132:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x0401  */
    /* JADX WARN: Code duplicated, block: B:141:0x042e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0432  */
    /* JADX WARN: Code duplicated, block: B:94:0x0209  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Code duplicated, block: B:97:0x0216  */
    public static final void f(final h4.r rVar, final u0 u0Var, final bg2.j jVar, final lc.y yVar, final boolean z14, final o oVar, final h0 h0Var, final j0 j0Var, final ag2.e eVar, final h21.m mVar, final lg2.r rVar2, final boolean z15, final e23.a aVar, final e23.l lVar, final e23.a aVar2, final boolean z16, p3.m mVar2, final int i14) throws Throwable {
        p3.o0 o0Var;
        String str;
        h5.g.a.f fVar;
        h4.r.a aVar3;
        j92.b bVar;
        j92.e eVar2;
        c2.j.k kVar;
        h4.g.a aVar4;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        c2.b0 b0Var;
        e2.i0 i0VarA;
        Object objQ;
        o53.b0 b0Var2;
        float f14;
        boolean z17;
        String str2;
        boolean zB;
        Object objQ2;
        float f15;
        Throwable th3;
        e2.i0 i0Var;
        fe feVar;
        h4.r.a aVar5;
        int i15;
        c2.z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        jVar.getClass();
        yVar.getClass();
        oVar.getClass();
        rVar2.getClass();
        lVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar2.E(-85233002);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(u0Var) ? 32 : 16) | (o0VarE.r(jVar) ? 256 : 128) | (o0VarE.r(yVar) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.r(oVar) ? 131072 : 65536) | (o0VarE.r(h0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(j0Var) ? 8388608 : 4194304) | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 67108864 : 33554432) | (o0VarE.r(mVar) ? 536870912 : 268435456);
        int i17 = (o0VarE.B(rVar2) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.h(z16) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar2 = (fe) objQ3;
            String strQ = gl1.y.Q(o0VarE, R.string.txt_no_internet_connection);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_close);
            p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
            p3.l0.e(new r0((androidx.lifecycle.n0) o0VarE.A(s9.j.f158018a), aVar2, m0Var, null), Unit.INSTANCE, o0VarE);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                str = strQ2;
            } else {
                str = strQ2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(aVar3, eVar2.f97917b, 0.0f, 2);
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                aVar4 = h4.d.a.f81536n;
                zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                i0VarA = e2.k0.a(0, 0, 3, o0VarE);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var2 = (o53.b0) objQ;
                h4.r rVarA2 = b0Var.a(aVar3, 1.0f, true);
                bVar.getClass();
                if (z15) {
                    f14 = eVar2.f97918c;
                } else {
                    f14 = eVar2.f97920e;
                }
                l2 l2VarC = c2.l.c(0.0f, f14, 1);
                boolean zR = o0VarE.r(oVar) | o0VarE.r(h0Var) | o0VarE.r(u0Var) | o0VarE.B(i0VarA) | o0VarE.r(b0Var2);
                if ((i16 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zR2 = z17 | zR | o0VarE.r(jVar) | o0VarE.r(yVar) | o0VarE.B(strQ);
                str2 = str;
                zB = zR2 | o0VarE.B(str2);
                objQ2 = o0VarE.q();
                if (!zB || objQ2 == c2565a) {
                    f15 = 1.0f;
                    th3 = null;
                    o0Var = o0VarE;
                    i0Var = i0VarA;
                    objQ2 = new f2(oVar, h0Var, u0Var, i0Var, b0Var2, z14, jVar, yVar, feVar2, strQ, str2);
                    feVar = feVar2;
                    o0Var.K(objQ2);
                } else {
                    feVar = feVar2;
                    i0Var = i0VarA;
                    f15 = 1.0f;
                    th3 = null;
                    o0Var = o0VarE;
                }
                e2.c.b(rVarA2, i0Var, l2VarC, null, null, null, false, null, (e23.l) objQ2, o0Var, 0, 504);
                if (z15 || eVar == null) {
                    aVar5 = aVar3;
                    i15 = 0;
                    o0Var.C(814536);
                    o0Var.g0(false);
                } else {
                    o0Var.C(170666);
                    bVar.getClass();
                    aVar5 = aVar3;
                    int i18 = i17 << 3;
                    lg2.q.a(c2.l.C(aVar3, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), eVar, j0Var, aVar, lVar, rVar2, mVar, !z16, true, false, null, o0Var, ((i16 >> 21) & 112) | 100663296 | ((i16 >> 15) & 896) | (i18 & 7168) | (i18 & 57344) | (458752 & (i17 << 15)) | ((i16 >> 9) & 3670016), 0, 1536);
                    i15 = 0;
                    o0Var.g0(false);
                }
                p3.l0.e(new t0(m0Var, oVar, h0Var, i0Var, null), Boolean.valueOf(r19.f105804a), o0Var);
                o0Var.g0(true);
                h4.r rVarD = x2.d(aVar5, f15);
                zVarA2 = c2.y.a(kVar, aVar4, o0Var, i15);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarD, o0Var);
                if (cVar != null) {
                    p3.p0.l();
                    throw th3;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(eVar3, zVarA2, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0Var);
                c2.l.f(b0Var.a(aVar5, f15, true), o0Var);
                yg2.f.f196976a.getClass();
                ce.b(feVar, null, yg2.f.f196978c, o0Var, 390, 2);
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar2 = j92.b.f97899b;
            h4.r rVarA3 = c2.l.A(aVar3, eVar2.f97917b, 0.0f, 2);
            c2.j.f22691a.getClass();
            kVar = c2.j.f22694d;
            aVar4 = h4.d.a.f81536n;
            zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA3, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0Var = c2.b0.f22601a;
            i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var2 = (o53.b0) objQ;
            h4.r rVarA4 = b0Var.a(aVar3, 1.0f, true);
            bVar.getClass();
            if (z15) {
                f14 = eVar2.f97918c;
            } else {
                f14 = eVar2.f97920e;
            }
            l2 l2VarC2 = c2.l.c(0.0f, f14, 1);
            boolean zR3 = o0VarE.r(oVar) | o0VarE.r(h0Var) | o0VarE.r(u0Var) | o0VarE.B(i0VarA) | o0VarE.r(b0Var2);
            if ((i16 & 57344) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zR4 = z17 | zR3 | o0VarE.r(jVar) | o0VarE.r(yVar) | o0VarE.B(strQ);
            str2 = str;
            zB = zR4 | o0VarE.B(str2);
            objQ2 = o0VarE.q();
            if (zB) {
                f15 = 1.0f;
                th3 = null;
                o0Var = o0VarE;
                i0Var = i0VarA;
                objQ2 = new f2(oVar, h0Var, u0Var, i0Var, b0Var2, z14, jVar, yVar, feVar2, strQ, str2);
                feVar = feVar2;
                o0Var.K(objQ2);
            } else {
                f15 = 1.0f;
                th3 = null;
                o0Var = o0VarE;
                i0Var = i0VarA;
                objQ2 = new f2(oVar, h0Var, u0Var, i0Var, b0Var2, z14, jVar, yVar, feVar2, strQ, str2);
                feVar = feVar2;
                o0Var.K(objQ2);
            }
            e2.c.b(rVarA4, i0Var, l2VarC2, null, null, null, false, null, (e23.l) objQ2, o0Var, 0, 504);
            if (z15) {
                aVar5 = aVar3;
                i15 = 0;
                o0Var.C(814536);
                o0Var.g0(false);
            } else {
                aVar5 = aVar3;
                i15 = 0;
                o0Var.C(814536);
                o0Var.g0(false);
            }
            p3.l0.e(new t0(m0Var, oVar, h0Var, i0Var, null), Boolean.valueOf(r19.f105804a), o0Var);
            o0Var.g0(true);
            h4.r rVarD2 = x2.d(aVar5, f15);
            zVarA2 = c2.y.a(kVar, aVar4, o0Var, i15);
            iHashCode2 = Long.hashCode(o0Var.U);
            i2VarA1 = o0Var.a0();
            rVarC2 = h4.k.c(rVarD2, o0Var);
            if (cVar != null) {
                p3.p0.l();
                throw th3;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar6);
            } else {
                o0Var.c();
            }
            b4.c(eVar3, zVarA2, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0Var);
            c2.l.f(b0Var.a(aVar5, f15, true), o0Var);
            yg2.f.f196976a.getClass();
            ce.b(feVar, null, yg2.f.f196978c, o0Var, 390, 2);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(u0Var, jVar, yVar, z14, oVar, h0Var, j0Var, eVar, mVar, rVar2, z15, aVar, lVar, aVar2, z16, i14) { // from class: yg2.n0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u0 f197095b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bg2.j f197096c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ lc.y f197097d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f197098e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ o f197099f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ h0 f197100g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ j0 f197101h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ ag2.e f197102i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ h21.m f197103j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ lg2.r f197104k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f197105l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e23.a f197106m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ e23.l f197107n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e23.a f197108o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ boolean f197109p;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    q0.f(this.f197094a, this.f197095b, this.f197096c, this.f197097d, this.f197098e, this.f197099f, this.f197100g, this.f197101h, this.f197102i, this.f197103j, this.f197104k, this.f197105l, this.f197106m, this.f197107n, this.f197108o, this.f197109p, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void g(e2.f0 f0Var, yg2.a aVar, o oVar, h0 h0Var, u0 u0Var, e2.i0 i0Var, o53.b0 b0Var, e23.l<? super Integer, Unit> lVar) {
        f0Var.getClass();
        aVar.getClass();
        oVar.getClass();
        i0Var.getClass();
        b0Var.getClass();
        int endStepIndex = (aVar.getEndStepIndex() - aVar.getStartStepIndex()) + 1;
        if (endStepIndex > 1) {
            e2.f0.e(f0Var, null, new z3.e(-747870513, true, new aa2.q(aVar, oVar, h0Var, u0Var, i0Var, b0Var, 15)), 3);
        }
        e2.f0.b(f0Var, null, new z3.e(-280151850, true, new pp.c(aVar, endStepIndex, oVar, u0Var, h0Var, i0Var, b0Var, lVar)), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o13.l] */
    public static final void h(o oVar, int i14, bg2.j jVar, lc.y yVar) {
        h0 next;
        i0 i0Var;
        nt2.e eVar;
        oVar.getClass();
        jVar.getClass();
        yVar.getClass();
        Iterator<h0> it = oVar.d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != i14);
        h0 h0Var = next;
        if (h0Var == null || h0Var.getCategory() == null || h0Var.getExerciseName() == null || (i0Var = h0Var.f197040g) == null || (eVar = i0Var.f197054b) == null) {
            return;
        }
        String str = eVar.f127844a;
        String category = h0Var.getCategory();
        String exerciseName = h0Var.getExerciseName();
        category.getClass();
        exerciseName.getClass();
        Object value = ((bg2.i) jVar.f17890a.getValue()).f17889a.getValue();
        value.getClass();
        ((bg2.a) value).a("en-US", category, exerciseName).q0(new bg2.l(str, yVar));
    }
}
