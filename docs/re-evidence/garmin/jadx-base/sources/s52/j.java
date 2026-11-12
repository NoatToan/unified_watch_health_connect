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
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$saveBenchmarkExercise$1", f = "BenchmarkViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f157436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f157437c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$saveBenchmarkExercise$1$1", f = "BenchmarkViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f157439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f157440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157439b = hVar;
            this.f157440c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157439b, this.f157440c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157438a;
            h hVar = this.f157439b;
            if (i14 == 0) {
                r.b(obj);
                y yVar = hVar.f157410a;
                this.f157438a = 1;
                obj = yVar.h(this.f157440c, this);
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
    public j(h hVar, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f157436b = hVar;
        this.f157437c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f157436b, this.f157437c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157435a;
        if (i14 == 0) {
            r.b(obj);
            h hVar = this.f157436b;
            hVar.f157413d.m(fw.m.a.f(fw.m.f73767e, null, hVar.A4(), 1));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(hVar, this.f157437c, null);
            this.f157435a = 1;
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
