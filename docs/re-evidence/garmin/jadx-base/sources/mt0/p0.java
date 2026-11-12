package mt0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeDatePagerKt$AutoChallengeDatePager$1$1", f = "AutoChallengeDatePager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.x3<ot0.j> f120789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f120790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p3.x3<? extends ot0.j> x3Var, n82.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120789a = x3Var;
            this.f120790b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f120789a, this.f120790b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ot0.j f182175a = this.f120789a.getF182175a();
            if (f182175a != null) {
                this.f120790b.e(o82.g.f130851d, g22.k.t(oe2.f.w(f182175a)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeDatePagerKt$AutoChallengeDatePager$2$1$1", f = "AutoChallengeDatePager.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f120792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f120793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<o82.a, Unit> f120794d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeDatePagerKt$AutoChallengeDatePager$2$1$1$3", f = "AutoChallengeDatePager.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.l<o82.a, Unit> f120795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f120796b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e23.l<? super o82.a, Unit> lVar, o82.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120795a = lVar;
                this.f120796b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120795a, this.f120796b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f120795a.invoke(this.f120796b);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: mt0.p0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2292b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f120797a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f120798b;

            /* JADX INFO: renamed from: mt0.p0$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f120799a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f120800b;

                /* JADX INFO: renamed from: mt0.p0$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeDatePagerKt$AutoChallengeDatePager$2$1$1$invokeSuspend$$inlined$filter$1$2", f = "AutoChallengeDatePager.kt", l = {50}, m = "emit", v = 2)
                public static final class C2293a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f120801a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f120802b;

                    public C2293a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f120801a = obj;
                        this.f120802b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f120799a = jVar;
                    this.f120800b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2293a c2293a;
                    if (dVar instanceof C2293a) {
                        c2293a = (C2293a) dVar;
                        int i14 = c2293a.f120802b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2293a.f120802b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2293a = new C2293a(dVar);
                        }
                    } else {
                        c2293a = new C2293a(dVar);
                    }
                    Object obj2 = c2293a.f120801a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2293a.f120802b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        if (p005kotlin.jvm.internal.s.g((o82.a) obj, this.f120800b)) {
                            c2293a.f120802b = 1;
                            if (this.f120799a.emit(obj, c2293a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C2292b(r53.i iVar, o82.a aVar) {
                this.f120797a = iVar;
                this.f120798b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f120797a.collect(new a(jVar, this.f120798b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(n82.f fVar, o82.a aVar, e23.l<? super o82.a, Unit> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f120792b = fVar;
            this.f120793c = aVar;
            this.f120794d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f120792b, this.f120793c, this.f120794d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120791a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.c2 c2VarS = p3.p0.s(new d52.p(this.f120792b, 7));
                o82.a aVar2 = this.f120793c;
                C2292b c2292b = new C2292b(c2VarS, aVar2);
                a aVar3 = new a(this.f120794d, aVar2, null);
                this.f120791a = 1;
                if (r53.s.k(c2292b, aVar3, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pt0.g gVar, e23.l<? super o82.a, Unit> lVar, p3.m mVar, int i14) {
        gVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1648517271);
        int i15 = (o0VarE.r(gVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new o0(context);
                o0VarE.K(objQ);
            }
            o0 o0Var = (o0) objQ;
            p3.p1 p1VarC = p3.p0.c(gVar.f140677d, o0VarE, 0);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                o82.g gVar2 = o82.g.f130851d;
                ot0.j jVar = (ot0.j) p1VarC.getF182175a();
                b63.o oVarT = jVar != null ? g22.k.t(oe2.f.w(jVar)) : g22.l.d(b63.o.INSTANCE);
                b63.o oVarT2 = g22.k.t(oe2.f.w(ot0.j.FOUR_WEEKS_AGO));
                ot0.j.CURRENT_WEEK.getClass();
                LocalDate localDateWithDayOfWeek = LocalDate.now().withDayOfWeek(7);
                localDateWithDayOfWeek.getClass();
                n82.f.a aVar = new n82.f.a(gVar2, new o82.a(oVarT2, g22.k.t(localDateWithDayOfWeek)), oVarT);
                o0VarE.K(aVar);
                objQ2 = aVar;
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ2, null, o0VarE, 2);
            ot0.j jVar2 = (ot0.j) p1VarC.getF182175a();
            boolean zB = o0VarE.B(p1VarC) | o0VarE.B(fVarA);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new a(p1VarC, fVarA, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, jVar2, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            q82.a.a(c2.x2.f(aVar2, 1.0f), new n82.n(fVarA, o0Var), null, o0VarE, 6, 4);
            n82.c.a(c2.x2.f(aVar2, 1.0f), fVarA, 0, false, z3.f.c(-2117401717, new ao1.f(28, fVarA, lVar), o0VarE), o0VarE, 24582, 12);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l30.y0(gVar, lVar, i14, 27);
        }
    }
}
