package s52;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import l52.y;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$updateBenchmarkExercise$1", f = "BenchmarkViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f157442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f157443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f157444d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$updateBenchmarkExercise$1$1", f = "BenchmarkViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f157446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f157447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f157448d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, long j8, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157446b = hVar;
            this.f157447c = j8;
            this.f157448d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157446b, this.f157447c, this.f157448d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157445a;
            h hVar = this.f157446b;
            if (i14 == 0) {
                r.b(obj);
                y yVar = hVar.f157410a;
                this.f157445a = 1;
                obj = yVar.M(this.f157447c, this.f157448d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((v2) obj) instanceof v2.b) {
                hVar.z4();
            }
            hVar.f157412c = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, long j8, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f157442b = hVar;
        this.f157443c = j8;
        this.f157444d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f157442b, this.f157443c, this.f157444d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157441a;
        if (i14 == 0) {
            r.b(obj);
            h hVar = this.f157442b;
            hVar.f157413d.m(fw.m.a.f(fw.m.f73767e, null, hVar.A4(), 1));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f157442b, this.f157443c, this.f157444d, null);
            this.f157441a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
