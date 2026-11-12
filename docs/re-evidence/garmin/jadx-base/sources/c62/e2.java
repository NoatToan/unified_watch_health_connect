package c62;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDeviceDisconnectedException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadSavedWorkout$4$1", f = "WorkoutDetailsViewModel.kt", l = {1498}, m = "invokeSuspend", v = 2)
public final class e2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0<g3<b>> f24725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f24726f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.w0<g3<b>> f24727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f24728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f24729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f24730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24731e;

        /* JADX INFO: renamed from: c62.e2$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0356a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24732a;

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
                    iArr[q52.a.FAILURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[q52.a.START_TIMEOUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f24732a = iArr;
            }
        }

        public a(androidx.lifecycle.w0<g3<b>> w0Var, b bVar, o53.b0 b0Var, long j8, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar) {
            this.f24727a = w0Var;
            this.f24728b = bVar;
            this.f24729c = b0Var;
            this.f24730d = j8;
            this.f24731e = fVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int i14 = C0356a.f24732a[((q52.a) obj).ordinal()];
            b bVar = this.f24728b;
            androidx.lifecycle.w0<g3<b>> w0Var = this.f24727a;
            if (i14 == 1 || i14 == 2) {
                g3.f35298f.getClass();
                w0Var.j(g3.a.b(bVar));
            } else {
                long j8 = this.f24730d;
                if (i14 == 3) {
                    String strF = androidx.room.a0.f(j8, "loadSavedWorkout: Device sync completed successfully for device[", "]");
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "WorkoutDetailsViewModel", strF);
                    g3.f35298f.getClass();
                    w0Var.j(g3.a.d(bVar));
                } else if (i14 != 4) {
                    if (i14 != 5) {
                        lc.u0.r();
                        return null;
                    }
                    String strF2 = androidx.room.a0.f(j8, "loadSavedWorkout: Device sync start timeout for device[", "]");
                    com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar2.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "WorkoutDetailsViewModel", strF2);
                    g3.f35298f.getClass();
                    w0Var.j(g3.a.d(bVar));
                } else if (this.f24731e.f48590d.a(j8)) {
                    w0Var.j(g3.a.a(g3.f35298f, "Device sync failed", null, null, null, 14));
                    com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar3.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "WorkoutDetailsViewModel", "loadSavedWorkout: Device sync failed for device[" + j8 + "]");
                } else {
                    w0Var.j(g3.a.a(g3.f35298f, null, new WorkoutDeviceDisconnectedException(bVar.f24684b, "Device disconnected during sync"), null, null, 13));
                    com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar4.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "WorkoutDetailsViewModel", "loadSavedWorkout: Device disconnected during sync for device[" + j8 + "]");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, long j8, androidx.lifecycle.w0<g3<b>> w0Var, b bVar, t13.d<? super e2> dVar) {
        super(2, dVar);
        this.f24723c = fVar;
        this.f24724d = j8;
        this.f24725e = w0Var;
        this.f24726f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e2 e2Var = new e2(this.f24723c, this.f24724d, this.f24725e, this.f24726f, dVar);
        e2Var.f24722b = obj;
        return e2Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f24722b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24721a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.c2 c2VarA = q52.f.a(this.f24723c.f48592f, this.f24724d);
            a aVar2 = new a(this.f24725e, this.f24726f, b0Var, this.f24724d, this.f24723c);
            this.f24722b = null;
            this.f24721a = 1;
            if (c2VarA.collect(aVar2, this) == aVar) {
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
