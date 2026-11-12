package qw;

import b63.o;
import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import i3.mc;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$1$1$1$1", f = "BloodPressureReportsScreen.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f148195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148195b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148195b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148194a;
            if (i14 == 0) {
                r.b(obj);
                this.f148194a = 1;
                if (this.f148195b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$1$1$1", f = "BloodPressureReportsScreen.kt", l = {251}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f148197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f148198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qw.g f148199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<kw.p> f148200e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$1$1$1$3", f = "BloodPressureReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qw.g f148201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<kw.p> f148202b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qw.g gVar, u82.f<kw.p> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f148201a = gVar;
                this.f148202b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f148201a, this.f148202b, dVar);
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
                r.b(obj);
                kw.p pVarA = this.f148202b.a();
                List<pw.a> listB2 = pVarA != null ? pVarA.f106894a.b() : null;
                p2 p2Var = this.f148201a.f148250e;
                do {
                    value = p2Var.getValue();
                    if (listB2 == null || (listB = i53.a.e(listB2)) == null) {
                        listB = j53.l.b();
                    }
                } while (!p2Var.b(value, listB));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: qw.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2790b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f148203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f148204b;

            /* JADX INFO: renamed from: qw.f$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f148205a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f148206b;

                /* JADX INFO: renamed from: qw.f$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "BloodPressureReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2791a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f148207a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f148208b;

                    public C2791a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f148207a = obj;
                        this.f148208b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f148205a = jVar;
                    this.f148206b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2791a c2791a;
                    if (dVar instanceof C2791a) {
                        c2791a = (C2791a) dVar;
                        int i14 = c2791a.f148208b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2791a.f148208b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2791a = new C2791a(dVar);
                        }
                    } else {
                        c2791a = new C2791a(dVar);
                    }
                    Object obj2 = c2791a.f148207a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2791a.f148208b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f148206b)) {
                            c2791a.f148208b = 1;
                            if (this.f148205a.emit(obj, c2791a) == aVar) {
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

            public C2790b(r53.i iVar, o82.a aVar) {
                this.f148203a = iVar;
                this.f148204b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f148203a.collect(new a(jVar, this.f148204b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n82.f fVar, o82.a aVar, qw.g gVar, u82.f<kw.p> fVar2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f148197b = fVar;
            this.f148198c = aVar;
            this.f148199d = gVar;
            this.f148200e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f148197b, this.f148198c, this.f148199d, this.f148200e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148196a;
            if (i14 == 0) {
                r.b(obj);
                C2790b c2790b = new C2790b(p0.s(new d52.p(this.f148197b, 14)), this.f148198c);
                a aVar2 = new a(this.f148199d, this.f148200e, null);
                this.f148196a = 1;
                if (r53.s.k(c2790b, aVar2, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$2$1$1", f = "BloodPressureReportsScreen.kt", l = {277}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f148211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f148212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qw.g f148213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<kw.i> f148214e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$2$1$1$3", f = "BloodPressureReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qw.g f148215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<kw.i> f148216b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qw.g gVar, u82.f<kw.i> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f148215a = gVar;
                this.f148216b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f148215a, this.f148216b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                kw.h hVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                kw.i iVarA = this.f148216b.a();
                this.f148215a.z4((iVarA == null || (hVar = iVarA.f106859a) == null) ? null : hVar.d());
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f148217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f148218b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f148219a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f148220b;

                /* JADX INFO: renamed from: qw.f$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$2$1$1$invokeSuspend$$inlined$filter$1$2", f = "BloodPressureReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2792a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f148221a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f148222b;

                    public C2792a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f148221a = obj;
                        this.f148222b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f148219a = jVar;
                    this.f148220b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2792a c2792a;
                    if (dVar instanceof C2792a) {
                        c2792a = (C2792a) dVar;
                        int i14 = c2792a.f148222b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2792a.f148222b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2792a = new C2792a(dVar);
                        }
                    } else {
                        c2792a = new C2792a(dVar);
                    }
                    Object obj2 = c2792a.f148221a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2792a.f148222b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f148220b)) {
                            c2792a.f148222b = 1;
                            if (this.f148219a.emit(obj, c2792a) == aVar) {
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
                this.f148217a = iVar;
                this.f148218b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f148217a.collect(new a(jVar, this.f148218b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n82.f fVar, o82.a aVar, qw.g gVar, u82.f<kw.i> fVar2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f148211b = fVar;
            this.f148212c = aVar;
            this.f148213d = gVar;
            this.f148214e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f148211b, this.f148212c, this.f148213d, this.f148214e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148210a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f148211b, 15)), this.f148212c);
                a aVar2 = new a(this.f148213d, this.f148214e, null);
                this.f148210a = 1;
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$3$1$1", f = "BloodPressureReportsScreen.kt", l = {300}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f148225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f148226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qw.g f148227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<kw.i> f148228e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$3$1$1$3", f = "BloodPressureReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qw.g f148229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<kw.i> f148230b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qw.g gVar, u82.f<kw.i> fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f148229a = gVar;
                this.f148230b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f148229a, this.f148230b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                kw.h hVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                kw.i iVarA = this.f148230b.a();
                this.f148229a.z4((iVarA == null || (hVar = iVarA.f106859a) == null) ? null : hVar.d());
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f148231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f148232b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f148233a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f148234b;

                /* JADX INFO: renamed from: qw.f$d$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$2$1$2$3$1$1$invokeSuspend$$inlined$filter$1$2", f = "BloodPressureReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2793a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f148235a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f148236b;

                    public C2793a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f148235a = obj;
                        this.f148236b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f148233a = jVar;
                    this.f148234b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2793a c2793a;
                    if (dVar instanceof C2793a) {
                        c2793a = (C2793a) dVar;
                        int i14 = c2793a.f148236b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2793a.f148236b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2793a = new C2793a(dVar);
                        }
                    } else {
                        c2793a = new C2793a(dVar);
                    }
                    Object obj2 = c2793a.f148235a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2793a.f148236b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f148234b)) {
                            c2793a.f148236b = 1;
                            if (this.f148233a.emit(obj, c2793a) == aVar) {
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
                this.f148231a = iVar;
                this.f148232b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f148231a.collect(new a(jVar, this.f148232b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n82.f fVar, o82.a aVar, qw.g gVar, u82.f<kw.i> fVar2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f148225b = fVar;
            this.f148226c = aVar;
            this.f148227d = gVar;
            this.f148228e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f148225b, this.f148226c, this.f148227d, this.f148228e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148224a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f148225b, 16)), this.f148226c);
                a aVar2 = new a(this.f148227d, this.f148228e, null);
                this.f148224a = 1;
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$3$1$1", f = "BloodPressureReportsScreen.kt", l = {328}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f148239b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f148239b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f148239b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148238a;
            if (i14 == 0) {
                r.b(obj);
                this.f148238a = 1;
                if (this.f148239b.d(this) == aVar) {
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

    /* JADX INFO: renamed from: qw.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsScreenKt$BloodPressureReportsScreen$1$6$1", f = "BloodPressureReportsScreen.kt", l = {346}, m = "invokeSuspend", v = 2)
    public static final class C2794f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<l> f148241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.g f148242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n82.f f148243d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2794f(x3<l> x3Var, o82.g gVar, n82.f fVar, t13.d<? super C2794f> dVar) {
            super(2, dVar);
            this.f148241b = x3Var;
            this.f148242c = gVar;
            this.f148243d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2794f(this.f148241b, this.f148242c, this.f148243d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2794f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148240a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = this.f148241b.getF182175a().f148284a;
                if (oVar != null) {
                    o82.g gVar = o82.g.f130850c;
                    o82.g gVar2 = this.f148242c;
                    n82.f fVar = this.f148243d;
                    if (gVar2 == gVar) {
                        this.f148240a = 1;
                        if (fVar.a(oVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        fVar.e(gVar, oVar);
                    }
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

    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148244a;

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
            f148244a = iArr;
        }
    }

    public static final void a(qw.g gVar, e23.a<Unit> aVar, m mVar, int i14) {
        gVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1895097736);
        int i15 = (o0VarE.r(gVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(1941811134, new qw.a(gVar, aVar), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qw.a(gVar, aVar, i14);
        }
    }
}
