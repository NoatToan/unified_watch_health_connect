package c62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc62/p;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/f;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends com.garmin.android.apps.connectmobile.workouts.presentation.details.f {
    public final LinkedHashMap K0 = new LinkedHashMap();
    public final r53.j<v52.c<o>> L0;
    public final o2<v52.c<o>> M0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel$2", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24827a;

        /* JADX INFO: renamed from: c62.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0357a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f24829a;

            /* JADX INFO: renamed from: c62.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel$2$1", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {35, 38}, m = "emit", v = 2)
            public static final class C0358a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public p f24830a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public com.garmin.android.apps.connectmobile.workouts.presentation.details.e f24831b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f24832c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ C0357a<T> f24833d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f24834e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0358a(C0357a<? super T> c0357a, t13.d<? super C0358a> dVar) {
                    super(dVar);
                    this.f24833d = c0357a;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f24832c = obj;
                    this.f24834e |= Integer.MIN_VALUE;
                    return this.f24833d.emit(null, this);
                }
            }

            public C0357a(p pVar) {
                this.f24829a = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
            
                if (r8.emit((v52.c<c62.o>) r7, r0) == r1) goto L32;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e> cVar, t13.d<? super Unit> dVar) {
                C0358a c0358a;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar;
                p pVar;
                if (dVar instanceof C0358a) {
                    c0358a = (C0358a) dVar;
                    int i14 = c0358a.f24834e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0358a.f24834e = i14 - Integer.MIN_VALUE;
                    } else {
                        c0358a = new C0358a(this, dVar);
                    }
                } else {
                    c0358a = new C0358a(this, dVar);
                }
                Object obj = c0358a.f24832c;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0358a.f24834e;
                p pVar2 = this.f24829a;
                if (i15 != 0) {
                    if (i15 == 1) {
                        eVar = c0358a.f24831b;
                        pVar = c0358a.f24830a;
                        o13.r.b(obj);
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                if ((cVar instanceof v52.c.b) || (cVar instanceof v52.c.a)) {
                    r53.j<v52.c<o>> jVar = pVar2.L0;
                    c0358a.f24830a = null;
                    c0358a.f24831b = null;
                    c0358a.f24834e = 2;
                } else {
                    if (!(cVar instanceof v52.c.C3278c)) {
                        lc.u0.r();
                        return null;
                    }
                    eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) ((v52.c.C3278c) cVar).f175760a;
                    WorkoutDetailsDTO f48577a = eVar.getF48577a();
                    c0358a.f24830a = pVar2;
                    c0358a.f24831b = eVar;
                    c0358a.f24834e = 1;
                    if (p.h5(pVar2, f48577a, c0358a) != aVar) {
                        pVar = pVar2;
                    }
                }
                return aVar;
                cVar = new v52.c.C3278c<>(new o(eVar.getF48577a(), pVar.K0));
                r53.j<v52.c<o>> jVar2 = pVar2.L0;
                c0358a.f24830a = null;
                c0358a.f24831b = null;
                c0358a.f24834e = 2;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f24827a;
            if (i14 == 0) {
                o13.r.b(obj);
                p pVar = p.this;
                o2<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> o2Var = pVar.Z;
                C0357a c0357a = new C0357a(pVar);
                this.f24827a = 1;
                if (o2Var.collect(c0357a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel$fetchFBTWorkoutDetails$1", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24835a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f24837c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel$fetchFBTWorkoutDetails$1$1", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {62, 63, 63, 69, 70}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WorkoutDetailsDTO f24838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24839b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f24840c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f24841d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f24840c = pVar;
                this.f24841d = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f24840c, this.f24841d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005d A[PHI: r11
              0x005d: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x005a, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:27:0x006a  */
            /* JADX WARN: Code duplicated, block: B:31:0x0079 A[PHI: r1
              0x0079: PHI (r1v5 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
              (r1v4 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
              (r1v7 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
             binds: [B:29:0x0076, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
            
                if (v52.d.a(r11, r3, r10) == r0) goto L33;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                WorkoutDetailsDTO workoutDetailsDTO;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f24839b;
                p pVar = this.f24840c;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j<v52.c<o>> jVar = pVar.L0;
                    v52.c.b bVar = v52.c.b.f175759a;
                    this.f24839b = 1;
                    if (jVar.emit(bVar, this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 == 2) {
                        o13.r.b(obj);
                        this.f24839b = 3;
                        obj = ((o53.i0) obj).await(this);
                        if (obj != aVar) {
                            workoutDetailsDTO = (WorkoutDetailsDTO) obj;
                            pVar.f48605r = workoutDetailsDTO;
                            if (pVar.C <= 0) {
                                pVar.C = workoutDetailsDTO.Y;
                            }
                            this.f24838a = workoutDetailsDTO;
                            this.f24839b = 4;
                            if (p.h5(pVar, workoutDetailsDTO, this) != aVar) {
                                r53.j<v52.c<o>> jVar2 = pVar.L0;
                                o oVar = new o(workoutDetailsDTO, pVar.K0);
                                this.f24838a = null;
                                this.f24839b = 5;
                            }
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        o13.r.b(obj);
                        workoutDetailsDTO = (WorkoutDetailsDTO) obj;
                        pVar.f48605r = workoutDetailsDTO;
                        if (pVar.C <= 0) {
                            pVar.C = workoutDetailsDTO.Y;
                        }
                        this.f24838a = workoutDetailsDTO;
                        this.f24839b = 4;
                        if (p.h5(pVar, workoutDetailsDTO, this) != aVar) {
                            r53.j<v52.c<o>> jVar3 = pVar.L0;
                            o oVar2 = new o(workoutDetailsDTO, pVar.K0);
                            this.f24838a = null;
                            this.f24839b = 5;
                        }
                        return aVar;
                    }
                    if (i14 == 4) {
                        workoutDetailsDTO = this.f24838a;
                        o13.r.b(obj);
                        r53.j<v52.c<o>> jVar4 = pVar.L0;
                        o oVar3 = new o(workoutDetailsDTO, pVar.K0);
                        this.f24838a = null;
                        this.f24839b = 5;
                    } else {
                        if (i14 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                }
                return Unit.INSTANCE;
                l52.y yVar = pVar.f48588b;
                this.f24839b = 2;
                obj = yVar.n(this.f24841d);
                if (obj != aVar) {
                    this.f24839b = 3;
                    obj = ((o53.i0) obj).await(this);
                    if (obj != aVar) {
                        workoutDetailsDTO = (WorkoutDetailsDTO) obj;
                        pVar.f48605r = workoutDetailsDTO;
                        if (pVar.C <= 0) {
                            pVar.C = workoutDetailsDTO.Y;
                        }
                        this.f24838a = workoutDetailsDTO;
                        this.f24839b = 4;
                        if (p.h5(pVar, workoutDetailsDTO, this) != aVar) {
                            r53.j<v52.c<o>> jVar5 = pVar.L0;
                            o oVar4 = new o(workoutDetailsDTO, pVar.K0);
                            this.f24838a = null;
                            this.f24839b = 5;
                        }
                    }
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f24837c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new b(this.f24837c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f24835a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(p.this, this.f24837c, null);
                this.f24835a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel$fetchWorkoutDetails$1", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24842a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f24844c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel$fetchWorkoutDetails$1$1", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {46, 47, 47, 53, 54}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WorkoutDetailsDTO f24845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24846b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f24847c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f24848d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, long j8, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f24847c = pVar;
                this.f24848d = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f24847c, this.f24848d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0061 A[PHI: r11
              0x0061: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x005e, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:27:0x006e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:28:0x0070  */
            /* JADX WARN: Code duplicated, block: B:29:0x0073  */
            /* JADX WARN: Code duplicated, block: B:34:0x0082 A[PHI: r1
              0x0082: PHI (r1v5 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
              (r1v4 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
              (r1v7 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
             binds: [B:32:0x007f, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
            
                if (v52.d.a(r11, r3, r10) == r0) goto L36;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                WorkoutDetailsDTO workoutDetailsDTO;
                long j8;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f24846b;
                p pVar = this.f24847c;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j<v52.c<o>> jVar = pVar.L0;
                    v52.c.b bVar = v52.c.b.f175759a;
                    this.f24846b = 1;
                    if (jVar.emit(bVar, this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 == 2) {
                        o13.r.b(obj);
                        this.f24846b = 3;
                        obj = ((o53.i0) obj).await(this);
                        if (obj != aVar) {
                            workoutDetailsDTO = (WorkoutDetailsDTO) obj;
                            pVar.f48605r = workoutDetailsDTO;
                            if (pVar.C <= 0) {
                                if (workoutDetailsDTO != null) {
                                    j8 = workoutDetailsDTO.Y;
                                } else {
                                    j8 = -1;
                                }
                                pVar.C = j8;
                            }
                            this.f24845a = workoutDetailsDTO;
                            this.f24846b = 4;
                            if (p.h5(pVar, workoutDetailsDTO, this) != aVar) {
                                r53.j<v52.c<o>> jVar2 = pVar.L0;
                                o oVar = new o(workoutDetailsDTO, pVar.K0);
                                this.f24845a = null;
                                this.f24846b = 5;
                            }
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        o13.r.b(obj);
                        workoutDetailsDTO = (WorkoutDetailsDTO) obj;
                        pVar.f48605r = workoutDetailsDTO;
                        if (pVar.C <= 0) {
                            if (workoutDetailsDTO != null) {
                                j8 = workoutDetailsDTO.Y;
                            } else {
                                j8 = -1;
                            }
                            pVar.C = j8;
                        }
                        this.f24845a = workoutDetailsDTO;
                        this.f24846b = 4;
                        if (p.h5(pVar, workoutDetailsDTO, this) != aVar) {
                            r53.j<v52.c<o>> jVar3 = pVar.L0;
                            o oVar2 = new o(workoutDetailsDTO, pVar.K0);
                            this.f24845a = null;
                            this.f24846b = 5;
                        }
                        return aVar;
                    }
                    if (i14 == 4) {
                        workoutDetailsDTO = this.f24845a;
                        o13.r.b(obj);
                        r53.j<v52.c<o>> jVar4 = pVar.L0;
                        o oVar3 = new o(workoutDetailsDTO, pVar.K0);
                        this.f24845a = null;
                        this.f24846b = 5;
                    } else {
                        if (i14 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                }
                return Unit.INSTANCE;
                l52.y yVar = pVar.f48588b;
                String strValueOf = String.valueOf(this.f24848d);
                this.f24846b = 2;
                obj = yVar.q(strValueOf);
                if (obj != aVar) {
                    this.f24846b = 3;
                    obj = ((o53.i0) obj).await(this);
                    if (obj != aVar) {
                        workoutDetailsDTO = (WorkoutDetailsDTO) obj;
                        pVar.f48605r = workoutDetailsDTO;
                        if (pVar.C <= 0) {
                            if (workoutDetailsDTO != null) {
                                j8 = workoutDetailsDTO.Y;
                            } else {
                                j8 = -1;
                            }
                            pVar.C = j8;
                        }
                        this.f24845a = workoutDetailsDTO;
                        this.f24846b = 4;
                        if (p.h5(pVar, workoutDetailsDTO, this) != aVar) {
                            r53.j<v52.c<o>> jVar5 = pVar.L0;
                            o oVar4 = new o(workoutDetailsDTO, pVar.K0);
                            this.f24845a = null;
                            this.f24846b = 5;
                        }
                    }
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f24844c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new c(this.f24844c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f24842a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(p.this, this.f24844c, null);
                this.f24842a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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

    public p() {
        p2 p2VarA = q2.a(v52.c.b.f175759a);
        o13.p pVar = new o13.p(p2VarA, p2VarA);
        r53.j<v52.c<o>> jVar = (r53.j) pVar.f128594a;
        o2<v52.c<o>> o2Var = (o2) pVar.f128595b;
        this.L0 = jVar;
        this.M0 = o2Var;
        w9.a aVarA = androidx.lifecycle.v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new a(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007e -> B:25:0x0082). Please report as a decompilation issue!!! */
    public static final Object h5(p pVar, WorkoutDetailsDTO workoutDetailsDTO, v13.c cVar) {
        q qVar;
        Iterator<com.garmin.android.apps.connectmobile.workouts.data.model.h0> it;
        m52.k kVar;
        WorkoutDetailsDTO workoutDetailsDTO2;
        com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var;
        LinkedHashMap linkedHashMap = pVar.K0;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f24860f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f24860f = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(pVar, cVar);
            }
        } else {
            qVar = new q(pVar, cVar);
        }
        Object obj = qVar.f24858d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f24860f;
        if (i15 == 0) {
            o13.r.b(obj);
            it = workoutDetailsDTO.Q0.iterator();
            while (it.hasNext()) {
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 next = it.next();
                kVar = next.f48193h;
                if (!k52.g.f(kVar) && !linkedHashMap.containsKey(new Integer(next.f48193h.f116766b))) {
                    am.x0 x0VarC = k52.g.c(kVar);
                    boolean zG = p005kotlin.jvm.internal.s.g(workoutDetailsDTO.I0, Boolean.TRUE);
                    qVar.f24855a = workoutDetailsDTO;
                    qVar.f24856b = it;
                    qVar.f24857c = next;
                    qVar.f24860f = 1;
                    Object objP4 = pVar.P4(x0VarC, zG, qVar);
                    if (objP4 == obj2) {
                        return obj2;
                    }
                    workoutDetailsDTO2 = workoutDetailsDTO;
                    h0Var = next;
                    obj = objP4;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h0Var = qVar.f24857c;
        it = qVar.f24856b;
        workoutDetailsDTO2 = qVar.f24855a;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj;
        if (cVar2 != null) {
            linkedHashMap.put(new Integer(h0Var.f48193h.f116766b), cVar2);
        }
        workoutDetailsDTO = workoutDetailsDTO2;
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.workouts.data.model.h0 next2 = it.next();
            kVar = next2.f48193h;
            if (!k52.g.f(kVar)) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.f
    public final void M4(String str) {
        str.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new b(str, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.f
    public final void N4(long j8, Long l14) {
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new c(j8, null), 3);
    }
}
