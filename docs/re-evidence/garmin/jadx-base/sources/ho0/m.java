package ho0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import e23.p;
import et1.z0;
import gs1.t;
import i3.e9;
import i3.mc;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$1$2$1$1$1", f = "HeartRateReportsScreen.kt", l = {156}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f84734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84734b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84734b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84733a;
            if (i14 == 0) {
                r.b(obj);
                this.f84733a = 1;
                if (this.f84734b.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$1$1$1", f = "HeartRateReportsScreen.kt", l = {221}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f84736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f84737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qo0.a f84738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<t> f84739e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$1$1$1$3", f = "HeartRateReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qo0.a f84740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<t> f84741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qo0.a aVar, u82.f<t> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f84740a = aVar;
                this.f84741b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f84740a, this.f84741b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object value2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                t tVarA = this.f84741b.a();
                gs1.d allDayHeartRateDTO = tVarA != null ? tVarA.getAllDayHeartRateDTO() : null;
                qo0.a aVar2 = this.f84740a;
                p2 p2Var = aVar2.f145923h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, allDayHeartRateDTO));
                p2 p2Var2 = aVar2.f145920e;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, qo0.d.a((qo0.d) value2, false, false, false, false, null, o82.g.f130850c, null, false, 223)));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: ho0.m$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1679b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f84742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f84743b;

            /* JADX INFO: renamed from: ho0.m$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f84744a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f84745b;

                /* JADX INFO: renamed from: ho0.m$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "HeartRateReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C1680a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f84746a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f84747b;

                    public C1680a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f84746a = obj;
                        this.f84747b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f84744a = jVar;
                    this.f84745b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1680a c1680a;
                    if (dVar instanceof C1680a) {
                        c1680a = (C1680a) dVar;
                        int i14 = c1680a.f84747b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1680a.f84747b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1680a = new C1680a(dVar);
                        }
                    } else {
                        c1680a = new C1680a(dVar);
                    }
                    Object obj2 = c1680a.f84746a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1680a.f84747b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f84745b)) {
                            c1680a.f84747b = 1;
                            if (this.f84744a.emit(obj, c1680a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C1679b(r53.i iVar, o82.a aVar) {
                this.f84742a = iVar;
                this.f84743b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f84742a.collect(new a(jVar, this.f84743b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n82.f fVar, o82.a aVar, qo0.a aVar2, u82.f<t> fVar2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f84736b = fVar;
            this.f84737c = aVar;
            this.f84738d = aVar2;
            this.f84739e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f84736b, this.f84737c, this.f84738d, this.f84739e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84735a;
            if (i14 == 0) {
                r.b(obj);
                C1679b c1679b = new C1679b(p0.s(new d52.p(this.f84736b, 3)), this.f84737c);
                a aVar2 = new a(this.f84738d, this.f84739e, null);
                this.f84735a = 1;
                if (r53.s.k(c1679b, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$2$1$1", f = "HeartRateReportsScreen.kt", l = {247}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f84750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f84751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qo0.a f84752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<co0.c> f84753e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$2$1$1$3", f = "HeartRateReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qo0.a f84754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<co0.c> f84755b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qo0.a aVar, u82.f<co0.c> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f84754a = aVar;
                this.f84755b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f84754a, this.f84755b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                co0.c cVarA = this.f84755b.a();
                p2 p2Var = this.f84754a.f145925j;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, cVarA));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f84756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f84757b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f84758a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f84759b;

                /* JADX INFO: renamed from: ho0.m$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$2$1$1$invokeSuspend$$inlined$filter$1$2", f = "HeartRateReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C1681a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f84760a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f84761b;

                    public C1681a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f84760a = obj;
                        this.f84761b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f84758a = jVar;
                    this.f84759b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1681a c1681a;
                    if (dVar instanceof C1681a) {
                        c1681a = (C1681a) dVar;
                        int i14 = c1681a.f84761b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1681a.f84761b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1681a = new C1681a(dVar);
                        }
                    } else {
                        c1681a = new C1681a(dVar);
                    }
                    Object obj2 = c1681a.f84760a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1681a.f84761b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f84759b)) {
                            c1681a.f84761b = 1;
                            if (this.f84758a.emit(obj, c1681a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar, o82.a aVar) {
                this.f84756a = iVar;
                this.f84757b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f84756a.collect(new a(jVar, this.f84757b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n82.f fVar, o82.a aVar, qo0.a aVar2, u82.f<co0.c> fVar2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f84750b = fVar;
            this.f84751c = aVar;
            this.f84752d = aVar2;
            this.f84753e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f84750b, this.f84751c, this.f84752d, this.f84753e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84749a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f84750b, 4)), this.f84751c);
                a aVar2 = new a(this.f84752d, this.f84753e, null);
                this.f84749a = 1;
                if (r53.s.k(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$3$1$1", f = "HeartRateReportsScreen.kt", l = {272}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f84764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f84765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qo0.a f84766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<co0.c> f84767e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$3$1$1$3", f = "HeartRateReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qo0.a f84768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<co0.c> f84769b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qo0.a aVar, u82.f<co0.c> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f84768a = aVar;
                this.f84769b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f84768a, this.f84769b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                co0.c cVarA = this.f84769b.a();
                p2 p2Var = this.f84768a.f145925j;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, cVarA));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f84770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f84771b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f84772a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f84773b;

                /* JADX INFO: renamed from: ho0.m$d$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$2$1$2$3$1$1$invokeSuspend$$inlined$filter$1$2", f = "HeartRateReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C1682a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f84774a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f84775b;

                    public C1682a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f84774a = obj;
                        this.f84775b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f84772a = jVar;
                    this.f84773b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1682a c1682a;
                    if (dVar instanceof C1682a) {
                        c1682a = (C1682a) dVar;
                        int i14 = c1682a.f84775b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1682a.f84775b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1682a = new C1682a(dVar);
                        }
                    } else {
                        c1682a = new C1682a(dVar);
                    }
                    Object obj2 = c1682a.f84774a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1682a.f84775b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f84773b)) {
                            c1682a.f84775b = 1;
                            if (this.f84772a.emit(obj, c1682a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar, o82.a aVar) {
                this.f84770a = iVar;
                this.f84771b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f84770a.collect(new a(jVar, this.f84771b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n82.f fVar, o82.a aVar, qo0.a aVar2, u82.f<co0.c> fVar2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f84764b = fVar;
            this.f84765c = aVar;
            this.f84766d = aVar2;
            this.f84767e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f84764b, this.f84765c, this.f84766d, this.f84767e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84763a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f84764b, 5)), this.f84765c);
                a aVar2 = new a(this.f84766d, this.f84767e, null);
                this.f84763a = 1;
                if (r53.s.k(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsScreenKt$HeartRateReportsScreen$1$3$1$1", f = "HeartRateReportsScreen.kt", l = {300}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f84778b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f84778b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f84778b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84777a;
            if (i14 == 0) {
                r.b(obj);
                this.f84777a = 1;
                if (this.f84778b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84779a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f84779a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(qo0.a aVar, yb0.a aVar2, e23.l<? super sd2.f, Unit> lVar, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.l<? super co0.f, Unit> lVar2, p3.m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(654535194);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(aVar.f145921f, o0VarE);
            p1 p1VarC2 = s9.c.c(aVar.f145924i, o0VarE);
            p1 p1VarC3 = s9.c.c(aVar.f145926k, o0VarE);
            p1 p1VarC4 = s9.c.c(aVar.f145922g, o0VarE);
            mc mcVarF = e9.f(false, null, o0VarE, 0, 3);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ha0.a(21);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new n82.f.a(((qo0.d) p1VarC.getF182175a()).f145952f, null, ((qo0.d) p1VarC.getF182175a()).f145951e, 2, null);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(-1748051676, new z0(mcVarF, b0Var, aVar, p1VarC, aVar2, aVar4, p1VarC2, p1VarC3, context, lVar, aVar3, p1Var, n82.j.a((n82.f.a) objQ3, null, o0VarE, 2), p1VarC4, lVar2), o0Var), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j((Object) aVar, (u1) aVar2, (e23.l) lVar, (e23.a) aVar3, (e23.a) aVar4, (o13.h) lVar2, i14, 2);
        }
    }
}
