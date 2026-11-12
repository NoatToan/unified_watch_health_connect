package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import c62.m2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$startWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {1584}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2 f48827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f48828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f48829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f fVar, long j8, m2 m2Var, z zVar, String str, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f48825b = fVar;
        this.f48826c = j8;
        this.f48827d = m2Var;
        this.f48828e = zVar;
        this.f48829f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f48825b, this.f48826c, this.f48827d, this.f48828e, this.f48829f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48824a;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f48825b;
            rt1.m mVar = fVar.f48590d;
            long j8 = this.f48826c;
            if (mVar.a(j8)) {
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                d.u uVar = new d.u(j8, this.f48827d, this.f48828e);
                this.f48824a = 1;
                if (v52.d.d(wVar, uVar, this) == aVar) {
                    return aVar;
                }
            } else {
                fVar.f5(new b.C0945b(this.f48829f));
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
