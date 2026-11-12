package q42;

import i3.mc;
import java.util.List;
import o53.m0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$1$1", f = "WeightReportsScreen.kt", l = {112, 113}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f142693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<f0> f142694c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, x3<f0> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f142693b = mcVar;
            this.f142694c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f142693b, this.f142694c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r5.f142693b.g(r5) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142692a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (this.f142694c.getF182175a().f142640f) {
                    this.f142692a = 1;
                    if (m0.b(100L, this) != aVar) {
                        this.f142692a = 2;
                    }
                    return aVar;
                }
                return Unit.INSTANCE;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                this.f142692a = 2;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$2$1$1", f = "WeightReportsScreen.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f142696b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f142696b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f142696b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142695a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f142695a = 1;
                if (this.f142696b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$3$2$1$2", f = "WeightReportsScreen.kt", l = {167}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f142698b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f142698b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f142698b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142697a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f142697a = 1;
                if (this.f142698b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$1$1$1", f = "WeightReportsScreen.kt", l = {224}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f142700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f142701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f142702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<l42.a> f142703e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$1$1$1$3", f = "WeightReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f142704a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<l42.a> f142705b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, u82.f<l42.a> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f142704a = yVar;
                this.f142705b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f142704a, this.f142705b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                List listB;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                l42.a aVarA = this.f142705b.a();
                List<l42.c> listB2 = aVarA != null ? aVarA.b() : null;
                p2 p2Var = this.f142704a.f142749e;
                do {
                    value = p2Var.getValue();
                    if (listB2 == null || (listB = i53.a.e(listB2)) == null) {
                        listB = j53.l.b();
                    }
                } while (!p2Var.b(value, listB));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f142706a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f142707b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f142708a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f142709b;

                /* JADX INFO: renamed from: q42.x$d$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "WeightReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2682a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f142710a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f142711b;

                    public C2682a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f142710a = obj;
                        this.f142711b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f142708a = jVar;
                    this.f142709b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2682a c2682a;
                    if (dVar instanceof C2682a) {
                        c2682a = (C2682a) dVar;
                        int i14 = c2682a.f142711b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2682a.f142711b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2682a = new C2682a(dVar);
                        }
                    } else {
                        c2682a = new C2682a(dVar);
                    }
                    Object obj2 = c2682a.f142710a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2682a.f142711b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        if (p005kotlin.jvm.internal.s.g((o82.a) obj, this.f142709b)) {
                            c2682a.f142711b = 1;
                            if (this.f142708a.emit(obj, c2682a) == aVar) {
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

            public b(r53.i iVar, o82.a aVar) {
                this.f142706a = iVar;
                this.f142707b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f142706a.collect(new a(jVar, this.f142707b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n82.f fVar, o82.a aVar, y yVar, u82.f<l42.a> fVar2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f142700b = fVar;
            this.f142701c = aVar;
            this.f142702d = yVar;
            this.f142703e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f142700b, this.f142701c, this.f142702d, this.f142703e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142699a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f142700b, 11)), this.f142701c);
                a aVar2 = new a(this.f142702d, this.f142703e, null);
                this.f142699a = 1;
                if (r53.s.k(bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$2$1$1", f = "WeightReportsScreen.kt", l = {255}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f142714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f142715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f142716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<q42.g> f142717e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$2$1$1$3", f = "WeightReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f142718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<q42.g> f142719b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, u82.f<q42.g> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f142718a = yVar;
                this.f142719b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f142718a, this.f142719b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                q42.g gVarA = this.f142719b.a();
                p2 p2Var = this.f142718a.f142751g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, gVarA));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f142720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f142721b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f142722a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f142723b;

                /* JADX INFO: renamed from: q42.x$e$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$2$1$1$invokeSuspend$$inlined$filter$1$2", f = "WeightReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2683a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f142724a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f142725b;

                    public C2683a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f142724a = obj;
                        this.f142725b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f142722a = jVar;
                    this.f142723b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2683a c2683a;
                    if (dVar instanceof C2683a) {
                        c2683a = (C2683a) dVar;
                        int i14 = c2683a.f142725b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2683a.f142725b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2683a = new C2683a(dVar);
                        }
                    } else {
                        c2683a = new C2683a(dVar);
                    }
                    Object obj2 = c2683a.f142724a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2683a.f142725b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        if (p005kotlin.jvm.internal.s.g((o82.a) obj, this.f142723b)) {
                            c2683a.f142725b = 1;
                            if (this.f142722a.emit(obj, c2683a) == aVar) {
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

            public b(r53.i iVar, o82.a aVar) {
                this.f142720a = iVar;
                this.f142721b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f142720a.collect(new a(jVar, this.f142721b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n82.f fVar, o82.a aVar, y yVar, u82.f<q42.g> fVar2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f142714b = fVar;
            this.f142715c = aVar;
            this.f142716d = yVar;
            this.f142717e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f142714b, this.f142715c, this.f142716d, this.f142717e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142713a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f142714b, 12)), this.f142715c);
                a aVar2 = new a(this.f142716d, this.f142717e, null);
                this.f142713a = 1;
                if (r53.s.k(bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$3$1$1", f = "WeightReportsScreen.kt", l = {280}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f142728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f142729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f142730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<g0> f142731e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$3$1$1$3", f = "WeightReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f142732a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<g0> f142733b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, u82.f<g0> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f142732a = yVar;
                this.f142733b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f142732a, this.f142733b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                g0 g0VarA = this.f142733b.a();
                p2 p2Var = this.f142732a.f142753i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, g0VarA));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f142734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f142735b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f142736a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f142737b;

                /* JADX INFO: renamed from: q42.x$f$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$4$1$3$3$1$1$invokeSuspend$$inlined$filter$1$2", f = "WeightReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2684a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f142738a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f142739b;

                    public C2684a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f142738a = obj;
                        this.f142739b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f142736a = jVar;
                    this.f142737b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2684a c2684a;
                    if (dVar instanceof C2684a) {
                        c2684a = (C2684a) dVar;
                        int i14 = c2684a.f142739b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2684a.f142739b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2684a = new C2684a(dVar);
                        }
                    } else {
                        c2684a = new C2684a(dVar);
                    }
                    Object obj2 = c2684a.f142738a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2684a.f142739b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        if (p005kotlin.jvm.internal.s.g((o82.a) obj, this.f142737b)) {
                            c2684a.f142739b = 1;
                            if (this.f142736a.emit(obj, c2684a) == aVar) {
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

            public b(r53.i iVar, o82.a aVar) {
                this.f142734a = iVar;
                this.f142735b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f142734a.collect(new a(jVar, this.f142735b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(n82.f fVar, o82.a aVar, y yVar, u82.f<g0> fVar2, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f142728b = fVar;
            this.f142729c = aVar;
            this.f142730d = yVar;
            this.f142731e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f142728b, this.f142729c, this.f142730d, this.f142731e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142727a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f142728b, 13)), this.f142729c);
                a aVar2 = new a(this.f142730d, this.f142731e, null);
                this.f142727a = 1;
                if (r53.s.k(bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsScreenKt$WeightReportsScreen$1$5$1$1", f = "WeightReportsScreen.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f142742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mc mcVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f142742b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f142742b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142741a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f142741a = 1;
                if (this.f142742b.d(this) == aVar) {
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

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142743a;

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
            f142743a = iArr;
        }
    }

    public static final void a(y yVar, d0 d0Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        yVar.getClass();
        d0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(81416568);
        int i15 = (o0VarE.r(yVar) ? 4 : 2) | i14 | (o0VarE.r(d0Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-1614674642, new r(yVar, aVar2, aVar, d0Var), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(yVar, d0Var, aVar, aVar2, i14);
        }
    }
}
