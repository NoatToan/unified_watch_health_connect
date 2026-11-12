package q52;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import lc.u0;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq52/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.details.LoadAdaptiveCoachWorkoutUseCase$loadAdaptiveCoach$1", f = "LoadAdaptiveCoachWorkoutUseCase.kt", l = {34, 36, 46, 53}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<j<? super q52.b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f142910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f142911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f142912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f142913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f142914f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142915a;

        static {
            int[] iArr = new int[q52.a.values().length];
            try {
                iArr[q52.a.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q52.a.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q52.a.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q52.a.START_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q52.a.FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f142915a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<q52.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f142916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f142917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f142918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f142919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f142920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f142921f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f142922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f142923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f142924c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f142925d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f142926e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f142927f;

            /* JADX INFO: renamed from: q52.e$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.details.LoadAdaptiveCoachWorkoutUseCase$loadAdaptiveCoach$1$invokeSuspend$$inlined$map$1$2", f = "LoadAdaptiveCoachWorkoutUseCase.kt", l = {67, 50}, m = "emit", v = 2)
            public static final class C2688a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f142928a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f142929b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public j f142931d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f142932e;

                public C2688a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f142928a = obj;
                    this.f142929b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, j jVar2, long j8, c cVar, int i14, int i15) {
                this.f142922a = jVar;
                this.f142923b = jVar2;
                this.f142924c = j8;
                this.f142925d = cVar;
                this.f142926e = i14;
                this.f142927f = i15;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
            /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0123, code lost:
            
                if (r12.emit(r14, r6) == r0) goto L48;
             */
            @Override // r53.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, t13.d dVar) {
                C2688a c2688a;
                int i14;
                j jVar;
                q52.b bVar;
                Object obj2;
                int i15;
                j jVar2;
                q52.b bVar2;
                if (dVar instanceof C2688a) {
                    c2688a = (C2688a) dVar;
                    int i16 = c2688a.f142929b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c2688a.f142929b = i16 - Integer.MIN_VALUE;
                    } else {
                        c2688a = new C2688a(dVar);
                    }
                } else {
                    c2688a = new C2688a(dVar);
                }
                C2688a c2688a2 = c2688a;
                Object obj3 = c2688a2.f142928a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i17 = c2688a2.f142929b;
                long j8 = this.f142924c;
                if (i17 != 0) {
                    if (i17 == 1) {
                        i15 = c2688a2.f142932e;
                        jVar2 = c2688a2.f142931d;
                        r.b(obj3);
                        obj2 = ((q) obj3).f128597a;
                    } else {
                        if (i17 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj3);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj3);
                int i18 = a.f142915a[((q52.a) obj).ordinal()];
                i14 = 0;
                jVar = this.f142922a;
                if (i18 == 1) {
                    String strF = a0.f(j8, "Sync not started on device[", "]");
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", strF);
                    bVar = q52.b.LOADING;
                } else {
                    if (i18 != 2) {
                        if (i18 == 3 || i18 == 4) {
                            String strF2 = a0.f(j8, "Sync finished on device[", "]");
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.b(a2Var2, "LoadAdaptiveCoachWorkoutUseCase", strF2);
                            o52.e eVar = this.f142925d.f142900a;
                            c2688a2.f142931d = jVar;
                            c2688a2.f142932e = 0;
                            c2688a2.f142929b = 1;
                            Object objC = eVar.C(this.f142926e, this.f142927f, this.f142924c, c2688a2);
                            if (objC != aVar) {
                                obj2 = objC;
                                i15 = 0;
                                jVar2 = jVar;
                            }
                        } else {
                            if (i18 != 5) {
                                u0.r();
                                return null;
                            }
                            String strF3 = a0.f(j8, "Sync failed on device[", "]");
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar4.getClass();
                            i2.a.b(a2Var3, "LoadAdaptiveCoachWorkoutUseCase", strF3);
                            bVar = q52.b.FAILURE;
                        }
                        return aVar;
                    }
                    String strF4 = a0.f(j8, "Sync in progress on device[", "]");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var4, "LoadAdaptiveCoachWorkoutUseCase", strF4);
                    bVar = q52.b.LOADING;
                }
                c2688a2.f142931d = null;
                c2688a2.f142932e = i14;
                c2688a2.f142929b = 2;
                StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Checked if after sync adaptive coach workout is on device[", "] isWorkoutOnDevice[", q.c(obj2));
                sbK.append("]");
                String string = sbK.toString();
                i2.a aVar6 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var5, "LoadAdaptiveCoachWorkoutUseCase", string);
                boolean z14 = obj2 instanceof q.b;
                if (!z14) {
                    Boolean bool = Boolean.FALSE;
                    if (z14) {
                        obj2 = bool;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        i2.a.b(a2Var5, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Adaptive coach workout loaded successfully on device[", "]"));
                        bVar2 = q52.b.SUCCESS;
                    } else if (z14) {
                        i2.a.b(a2Var5, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Adaptive coach workout loaded successfully on device[", "]"));
                        bVar2 = q52.b.SUCCESS;
                    } else {
                        i2.a.b(a2Var5, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Failed to load adaptive coach workout on device[", "]"));
                        bVar2 = q52.b.FAILURE;
                    }
                } else if (z14) {
                    i2.a.b(a2Var5, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Adaptive coach workout loaded successfully on device[", "]"));
                    bVar2 = q52.b.SUCCESS;
                } else {
                    i2.a.b(a2Var5, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Failed to load adaptive coach workout on device[", "]"));
                    bVar2 = q52.b.FAILURE;
                }
                q52.b bVar3 = bVar2;
                i14 = i15;
                bVar = bVar3;
                jVar = jVar2;
                c2688a2.f142931d = null;
                c2688a2.f142932e = i14;
                c2688a2.f142929b = 2;
            }
        }

        public b(r53.i iVar, j jVar, long j8, c cVar, int i14, int i15) {
            this.f142916a = iVar;
            this.f142917b = jVar;
            this.f142918c = j8;
            this.f142919d = cVar;
            this.f142920e = i14;
            this.f142921f = i15;
        }

        @Override // r53.i
        public final Object collect(j<? super q52.b> jVar, t13.d dVar) {
            Object objCollect = this.f142916a.collect(new a(jVar, this.f142917b, this.f142918c, this.f142919d, this.f142920e, this.f142921f), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j8, int i14, int i15, c cVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f142911c = j8;
        this.f142912d = i14;
        this.f142913e = i15;
        this.f142914f = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f142911c, this.f142912d, this.f142913e, this.f142914f, dVar);
        eVar.f142910b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super q52.b> jVar, t13.d<? super Unit> dVar) {
        return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r6.emit(r0, r17) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        if (r53.s.v(r6, r1, r5) == r9) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        a2 a2Var;
        boolean z14;
        Boolean bool;
        j jVar = (j) this.f142910b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142909a;
        c cVar = this.f142914f;
        long j8 = this.f142911c;
        if (i14 == 0) {
            r.b(obj);
            String strK = u0.k(v.h.w(this.f142912d, "Loading adaptive coach workout on device[", "] for workout with workoutIndex[", j8), "] and workoutTimestamp[", this.f142913e, "]");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "LoadAdaptiveCoachWorkoutUseCase", strK);
            q52.b bVar = q52.b.LOADING;
            this.f142910b = jVar;
            this.f142909a = 1;
            if (jVar.emit(bVar, this) == aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            objC = ((q) obj).f128597a;
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Checked if adaptive coach workout is already on device[", "] isWorkoutOnDevice[", q.c(objC));
            sbK.append("]");
            String string = sbK.toString();
            i2.a aVar3 = i2.f36769a;
            a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", string);
            z14 = objC instanceof q.b;
            if (!z14) {
                bool = Boolean.FALSE;
                if (z14) {
                    objC = bool;
                }
                if (((Boolean) objC).booleanValue()) {
                    i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Adaptive coach workout already on device[", "]"));
                    q52.b bVar2 = q52.b.SUCCESS;
                    this.f142910b = null;
                    this.f142909a = 3;
                }
            }
            i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Trigger device sync for adaptive coach workout on device[", "]"));
            cVar.f142901b.B(j8, "LoadAdaptiveCoachWorkoutUseCase");
            i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", am.j.i(j8, "]", new StringBuilder("Waiting for sync to finish on device[")));
            b bVar3 = new b(f.a(cVar.f142903d, j8), jVar, this.f142911c, this.f142914f, this.f142913e, this.f142912d);
            this.f142910b = null;
            this.f142909a = 4;
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        o52.e eVar = cVar.f142900a;
        this.f142910b = jVar;
        this.f142909a = 2;
        objC = eVar.C(this.f142913e, this.f142912d, this.f142911c, this);
        if (objC != aVar) {
            StringBuilder sbK2 = com.airbnb.lottie.animation.keyframe.a.k(j8, "Checked if adaptive coach workout is already on device[", "] isWorkoutOnDevice[", q.c(objC));
            sbK2.append("]");
            String string2 = sbK2.toString();
            i2.a aVar4 = i2.f36769a;
            a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", string2);
            z14 = objC instanceof q.b;
            if (!z14) {
                bool = Boolean.FALSE;
                if (z14) {
                    objC = bool;
                }
                if (((Boolean) objC).booleanValue()) {
                    i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Adaptive coach workout already on device[", "]"));
                    q52.b bVar4 = q52.b.SUCCESS;
                    this.f142910b = null;
                    this.f142909a = 3;
                }
            }
            i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", a0.f(j8, "Trigger device sync for adaptive coach workout on device[", "]"));
            cVar.f142901b.B(j8, "LoadAdaptiveCoachWorkoutUseCase");
            i2.a.b(a2Var, "LoadAdaptiveCoachWorkoutUseCase", am.j.i(j8, "]", new StringBuilder("Waiting for sync to finish on device[")));
            b bVar5 = new b(f.a(cVar.f142903d, j8), jVar, this.f142911c, this.f142914f, this.f142913e, this.f142912d);
            this.f142910b = null;
            this.f142909a = 4;
        }
        return aVar;
    }
}
