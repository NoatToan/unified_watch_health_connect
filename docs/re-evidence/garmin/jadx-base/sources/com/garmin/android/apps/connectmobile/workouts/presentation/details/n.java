package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.lifecycle.v1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkoutToDevice$1", f = "WorkoutDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f48760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f48761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f48762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f48763d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkoutToDevice$1$1", f = "WorkoutDetailsViewModel.kt", l = {2049}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f48765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer f48767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f48768e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, long j8, Integer num, Integer num2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48765b = fVar;
            this.f48766c = j8;
            this.f48767d = num;
            this.f48768e = num2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48765b, this.f48766c, this.f48767d, this.f48768e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48764a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends d>> wVar = this.f48765b.f48598k0;
                d.g gVar = new d.g(this.f48766c, this.f48767d, this.f48768e);
                this.f48764a = 1;
                if (v52.d.d(wVar, gVar, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f fVar, long j8, Integer num, Integer num2, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f48760a = fVar;
        this.f48761b = j8;
        this.f48762c = num;
        this.f48763d = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f48760a, this.f48761b, this.f48762c, this.f48763d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(v1.a(this.f48760a), null, null, new a(this.f48760a, this.f48761b, this.f48762c, this.f48763d, null), 3);
        return Unit.INSTANCE;
    }
}
