package vr1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import gs1.t;
import gs1.z;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$1$1", f = "StressReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qr1.d f179512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f179513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qr1.d dVar, n82.f fVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f179512a = dVar;
            this.f179513b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f179512a, this.f179513b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f179512a.y4(this.f179513b.f124961b.a() == o82.g.f130850c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$1$1$1", f = "StressReportsScreen.kt", l = {163}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f179515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f179516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u82.f<t> f179517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ qr1.d f179518e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$1$1$1$3", f = "StressReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u82.f<t> f179519a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qr1.d f179520b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u82.f<t> fVar, qr1.d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f179519a = fVar;
                this.f179520b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179519a, this.f179520b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                z userDailySummary;
                gs1.l payload;
                Integer averageStressLevel;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                t tVarA = this.f179519a.a();
                int iIntValue = (tVarA == null || (userDailySummary = tVarA.getUserDailySummary()) == null || (payload = userDailySummary.getPayload()) == null || (averageStressLevel = payload.getAverageStressLevel()) == null) ? 0 : averageStressLevel.intValue();
                qr1.d dVar = this.f179520b;
                dVar.x4(iIntValue);
                dVar.y4(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: vr1.m$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3350b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f179521a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f179522b;

            /* JADX INFO: renamed from: vr1.m$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f179523a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f179524b;

                /* JADX INFO: renamed from: vr1.m$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "StressReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C3351a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f179525a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f179526b;

                    public C3351a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f179525a = obj;
                        this.f179526b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f179523a = jVar;
                    this.f179524b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3351a c3351a;
                    if (dVar instanceof C3351a) {
                        c3351a = (C3351a) dVar;
                        int i14 = c3351a.f179526b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3351a.f179526b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3351a = new C3351a(dVar);
                        }
                    } else {
                        c3351a = new C3351a(dVar);
                    }
                    Object obj2 = c3351a.f179525a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3351a.f179526b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f179524b)) {
                            c3351a.f179526b = 1;
                            if (this.f179523a.emit(obj, c3351a) == aVar) {
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

            public C3350b(r53.i iVar, o82.a aVar) {
                this.f179521a = iVar;
                this.f179522b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f179521a.collect(new a(jVar, this.f179522b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n82.f fVar, o82.a aVar, u82.f<t> fVar2, qr1.d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f179515b = fVar;
            this.f179516c = aVar;
            this.f179517d = fVar2;
            this.f179518e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f179515b, this.f179516c, this.f179517d, this.f179518e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179514a;
            if (i14 == 0) {
                r.b(obj);
                C3350b c3350b = new C3350b(p0.s(new d52.p(this.f179515b, 19)), this.f179516c);
                a aVar2 = new a(this.f179517d, this.f179518e, null);
                this.f179514a = 1;
                if (r53.s.k(c3350b, aVar2, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$2$1$1", f = "StressReportsScreen.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f179529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f179530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u82.f<List<kr1.a>> f179531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ qr1.d f179532e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$2$1$1$3", f = "StressReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u82.f<List<kr1.a>> f179533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qr1.d f179534b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u82.f<List<kr1.a>> fVar, qr1.d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f179533a = fVar;
                this.f179534b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179533a, this.f179534b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Integer numA;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                List<kr1.a> listA = this.f179533a.a();
                this.f179534b.x4((listA == null || (numA = kr1.b.a(listA)) == null) ? 0 : numA.intValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f179535a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f179536b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f179537a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f179538b;

                /* JADX INFO: renamed from: vr1.m$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$2$1$1$invokeSuspend$$inlined$filter$1$2", f = "StressReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C3352a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f179539a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f179540b;

                    public C3352a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f179539a = obj;
                        this.f179540b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f179537a = jVar;
                    this.f179538b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3352a c3352a;
                    if (dVar instanceof C3352a) {
                        c3352a = (C3352a) dVar;
                        int i14 = c3352a.f179540b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3352a.f179540b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3352a = new C3352a(dVar);
                        }
                    } else {
                        c3352a = new C3352a(dVar);
                    }
                    Object obj2 = c3352a.f179539a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3352a.f179540b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f179538b)) {
                            c3352a.f179540b = 1;
                            if (this.f179537a.emit(obj, c3352a) == aVar) {
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
                this.f179535a = iVar;
                this.f179536b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f179535a.collect(new a(jVar, this.f179536b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n82.f fVar, o82.a aVar, u82.f<List<kr1.a>> fVar2, qr1.d dVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f179529b = fVar;
            this.f179530c = aVar;
            this.f179531d = fVar2;
            this.f179532e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f179529b, this.f179530c, this.f179531d, this.f179532e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179528a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f179529b, 20)), this.f179530c);
                a aVar2 = new a(this.f179531d, this.f179532e, null);
                this.f179528a = 1;
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$3$1$1", f = "StressReportsScreen.kt", l = {212}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f179543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f179544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u82.f<List<kr1.c>> f179545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ qr1.d f179546e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$3$1$1$3", f = "StressReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u82.f<List<kr1.c>> f179547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qr1.d f179548b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u82.f<List<kr1.c>> fVar, qr1.d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f179547a = fVar;
                this.f179548b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179547a, this.f179548b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Integer numA;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                List<kr1.c> listA = this.f179547a.a();
                this.f179548b.x4((listA == null || (numA = g8.i.A(listA)) == null) ? 0 : numA.intValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f179549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f179550b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f179551a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f179552b;

                /* JADX INFO: renamed from: vr1.m$d$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsScreenKt$StressSummaryScreen$3$1$2$3$1$1$invokeSuspend$$inlined$filter$1$2", f = "StressReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C3353a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f179553a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f179554b;

                    public C3353a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f179553a = obj;
                        this.f179554b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f179551a = jVar;
                    this.f179552b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3353a c3353a;
                    if (dVar instanceof C3353a) {
                        c3353a = (C3353a) dVar;
                        int i14 = c3353a.f179554b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3353a.f179554b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3353a = new C3353a(dVar);
                        }
                    } else {
                        c3353a = new C3353a(dVar);
                    }
                    Object obj2 = c3353a.f179553a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3353a.f179554b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f179552b)) {
                            c3353a.f179554b = 1;
                            if (this.f179551a.emit(obj, c3353a) == aVar) {
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
                this.f179549a = iVar;
                this.f179550b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f179549a.collect(new a(jVar, this.f179550b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n82.f fVar, o82.a aVar, u82.f<List<kr1.c>> fVar2, qr1.d dVar, t13.d<? super d> dVar2) {
            super(2, dVar2);
            this.f179543b = fVar;
            this.f179544c = aVar;
            this.f179545d = fVar2;
            this.f179546e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f179543b, this.f179544c, this.f179545d, this.f179546e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179542a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f179543b, 21)), this.f179544c);
                a aVar2 = new a(this.f179545d, this.f179546e, null);
                this.f179542a = 1;
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

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179556a;

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
            f179556a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(qr1.d dVar, boolean z14, e23.a<Unit> aVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-545662101);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(dVar.f146912h, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new vd1.c(17);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            o oVarB = g22.k.z(dateTimeNow).b();
            o.INSTANCE.getClass();
            o oVarA = o.Companion.a(0);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new n82.f.a(((qr1.c) p1VarC.getF182175a()).f146897b, null, ((qr1.c) p1VarC.getF182175a()).f146896a, 2, null);
                o0VarE.K(objQ2);
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ2, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                o0VarE.K(objQ3);
            }
            i53.f fVar = (i53.f) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new yd1.a(context);
                o0VarE.K(objQ4);
            }
            yd1.a aVar3 = (yd1.a) objQ4;
            o82.g gVarA = fVarA.f124961b.a();
            boolean zB = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(dVar))) | o0VarE.B(fVarA);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = new a(dVar, fVarA, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, gVarA, o0VarE);
            o0Var = o0VarE;
            z02.d.a(((qr1.c) p1VarC.getF182175a()).f146899d, z3.f.c(49269936, new ug2.p(z14, aVar, lVar, p1VarC, aVar2), o0VarE), null, null, null, z3.f.c(1794389940, new dd1.d(fVar, fVarA, oVarA, oVarB, aVar3, p1VarC, p1Var, dVar, 29), o0VarE), o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(dVar, z14, aVar, lVar, aVar2, i14);
        }
    }
}
