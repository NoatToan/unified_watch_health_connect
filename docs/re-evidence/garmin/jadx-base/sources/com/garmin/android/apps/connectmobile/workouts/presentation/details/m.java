package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.lifecycle.w0;
import c62.m2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.j0;
import r53.u1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {1399, 1421, 1423}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f48752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f48753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0<g3<c62.b>> f48754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f48755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f48756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f48757g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkout$1$device$1", f = "WorkoutDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f48758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Long f48759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, Long l14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48758a = fVar;
            this.f48759b = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48758a, this.f48759b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            rd2.j jVar = this.f48758a.f48596j.f152045a;
            long jLongValue = this.f48759b.longValue();
            jVar.getClass();
            return rd2.j.i(jLongValue, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Long l14, w0<g3<c62.b>> w0Var, f fVar, Integer num, Integer num2, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f48753c = l14;
        this.f48754d = w0Var;
        this.f48755e = fVar;
        this.f48756f = num;
        this.f48757g = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f48753c, this.f48754d, this.f48755e, this.f48756f, this.f48757g, dVar);
        mVar.f48752b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d0, code lost:
    
        if (r1 == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
    
        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.F4(r9, r7, r1, r3, r20) == r2) goto L71;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Integer num;
        Object objCollect;
        m52.k kVar;
        b0 b0Var = (b0) this.f48752b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48751a;
        w0<g3<c62.b>> w0Var = this.f48754d;
        f fVar = this.f48755e;
        Long l14 = this.f48753c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objE0 = obj;
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (l14 == null || l14.longValue() < 1) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "WorkoutDetailsViewModel", "loadWorkout: No valid unit ID found for targeted device");
            w0Var.j(g3.a.a(g3.f35298f, "No valid unit ID", null, null, null, 14));
            return Unit.INSTANCE;
        }
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar3 = new a(fVar, l14, null);
        this.f48752b = b0Var;
        this.f48751a = 1;
        objE0 = ge1.b.e0(bVar, aVar3, this);
        if (objE0 != aVar) {
        }
        return aVar;
        sd2.f fVar2 = (sd2.f) objE0;
        if (fVar2 == null) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "WorkoutDetailsViewModel", "loadWorkout: No device found for unit ID[" + l14 + "]");
            w0Var.j(g3.a.a(g3.f35298f, "No device found for unit ID[" + l14 + "]", null, null, null, 14));
            return Unit.INSTANCE;
        }
        if (!fVar.f48590d.a(l14.longValue())) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var3, "WorkoutDetailsViewModel", "loadWorkout: Handshake not completed for targeted device[" + l14 + "]");
            fVar.f5(new b.C0945b(fVar2.getProductDisplayName()));
            return Unit.INSTANCE;
        }
        String str = "loadWorkout: Start workout on targeted device[" + l14 + "]";
        i2.a aVar6 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar6.getClass();
        i2.a.b(a2Var4, "WorkoutDetailsViewModel", str);
        WorkoutDetailsDTO workoutDetailsDTO = fVar.f48605r;
        m2 m2Var = new m2((workoutDetailsDTO == null || (kVar = workoutDetailsDTO.f48044e) == null) ? null : kVar.f116765a, this.f48756f, this.f48757g);
        WorkoutDetailsDTO workoutDetailsDTO2 = fVar.f48605r;
        if (workoutDetailsDTO2 != null && g22.n.d(workoutDetailsDTO2.K0)) {
            Integer num2 = workoutDetailsDTO2.L0;
            if (num2 == null || num2.intValue() < 0) {
                num2 = null;
            }
            if (num2 != null && workoutDetailsDTO2.M() != null) {
                this.f48752b = null;
                this.f48751a = 2;
                WorkoutDetailsDTO workoutDetailsDTO3 = fVar.f48605r;
                Integer numM = workoutDetailsDTO3 != null ? workoutDetailsDTO3.M() : null;
                WorkoutDetailsDTO workoutDetailsDTO4 = fVar.f48605r;
                if (workoutDetailsDTO4 == null || (num = workoutDetailsDTO4.L0) == null || num.intValue() < 0) {
                    num = null;
                }
                if (numM == null || num == null) {
                    i2.a.f(a2Var4, "WorkoutDetailsViewModel", "loadAdaptiveCoachWorkout: Invalid workout timestamp or index. Cannot load adaptive coach workout.");
                    w0Var.j(g3.a.a(g3.f35298f, "Invalid workout timestamp or index", null, null, null, 14));
                    objCollect = Unit.INSTANCE;
                } else {
                    c62.b bVar2 = new c62.b(fVar2.getUnitID(), fVar2.getProductDisplayName(), m2Var, new z.a(numM.intValue(), num.intValue()));
                    q52.c cVar2 = fVar.f48593g;
                    int iIntValue = numM.intValue();
                    int iIntValue2 = num.intValue();
                    zd0.x xVar = cVar2.f142902c;
                    long j8 = bVar2.f24683a;
                    c2 c2Var = new c2(new q52.e(j8, iIntValue2, iIntValue, cVar2, null));
                    Long lValueOf = Long.valueOf(j8);
                    int i15 = zd0.i.f204028a;
                    objCollect = new q52.d(new c2(new j0(new u1(r53.s.f(new zd0.j(lValueOf, null)), c2Var, new zd0.v(null)), new zd0.w(null), null))).collect(new c62.c2(w0Var, bVar2), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.INSTANCE;
                    }
                }
            }
        }
        this.f48752b = null;
        this.f48751a = 3;
    }
}
