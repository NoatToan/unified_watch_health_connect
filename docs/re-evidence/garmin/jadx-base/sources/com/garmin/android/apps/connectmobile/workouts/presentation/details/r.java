package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.lifecycle.w0;
import c62.f2;
import c62.k2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$saveAndSendWorkoutToTargetedDevice$1", f = "WorkoutDetailsViewModel.kt", l = {1649, 1656, 1660}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f48794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f48797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f48798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0<g3<Long>> f48799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Long f48800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f fVar, w0<g3<Long>> w0Var, Long l14, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f48798e = fVar;
        this.f48799f = w0Var;
        this.f48800g = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f48798e, this.f48799f, this.f48800g, dVar);
        rVar.f48797d = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e4 A[PHI: r1 r3
      0x00e4: PHI (r1v12 int) = (r1v7 int), (r1v7 int), (r1v19 int) binds: [B:38:0x00cf, B:40:0x00e1, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r3v11 java.lang.Long) = (r3v9 java.lang.Long), (r3v9 java.lang.Long), (r3v21 java.lang.Long) binds: [B:38:0x00cf, B:40:0x00e1, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (r3 == r2) goto L50;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objL4;
        int i14;
        Long l14;
        int i15;
        Long l15;
        WorkoutDetailsDTO workoutDetailsDTO;
        m52.k kVar;
        w0 w0VarC5;
        Object objB4;
        b0 b0Var = (b0) this.f48797d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f48796c;
        w0<g3<Long>> w0Var = this.f48799f;
        f fVar = this.f48798e;
        if (i16 == 0) {
            o13.r.b(obj);
            WorkoutDetailsDTO workoutDetailsDTO2 = fVar.f48605r;
            if (workoutDetailsDTO2 == null) {
                w0Var.j(g3.a.a(g3.f35298f, "Null workout DTO", null, null, null, 14));
                return Unit.INSTANCE;
            }
            int i17 = (workoutDetailsDTO2.Z() == null || fVar.E) ? 1 : 0;
            Long lS4 = this.f48800g;
            if (lS4 == null) {
                lS4 = fVar.S4();
            }
            if (lS4 == null || lS4.longValue() < 1) {
                w0Var.j(g3.a.a(g3.f35298f, "No valid unit ID", null, null, null, 14));
                return Unit.INSTANCE;
            }
            g3.f35298f.getClass();
            w0Var.j(g3.a.b(lS4));
            this.f48797d = b0Var;
            this.f48794a = lS4;
            this.f48795b = i17;
            this.f48796c = 1;
            objL4 = fVar.L4(this);
            if (objL4 != aVar) {
                i14 = i17;
                l14 = lS4;
            }
            return aVar;
        }
        if (i16 == 1) {
            i14 = this.f48795b;
            l14 = this.f48794a;
            o13.r.b(obj);
            objL4 = ((o13.q) obj).f128597a;
        } else {
            if (i16 == 2) {
                i14 = this.f48795b;
                l14 = this.f48794a;
                o13.r.b(obj);
                Long l16 = l14;
                i15 = i14;
                l15 = l16;
                workoutDetailsDTO = fVar.f48605r;
                if (workoutDetailsDTO != null) {
                    kVar = workoutDetailsDTO.f48044e;
                } else {
                    kVar = null;
                }
                if (kVar == m52.k.f116758r) {
                    long jLongValue = l15.longValue();
                    this.f48797d = null;
                    this.f48794a = l15;
                    this.f48795b = i15;
                    this.f48796c = 3;
                    objB4 = f.B4(fVar, jLongValue, this);
                } else {
                    w0VarC5 = fVar.c5(l15.longValue(), false);
                }
                w0Var.n(k2.a(w0VarC5, new f2(0, l15)), new f.p(new androidx.lifecycle.k(w0Var, 2)));
                return Unit.INSTANCE;
            }
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l15 = this.f48794a;
            o13.r.b(obj);
            objB4 = obj;
        }
        w0VarC5 = fVar.c5(l15.longValue(), ((Boolean) objB4).booleanValue());
        w0Var.n(k2.a(w0VarC5, new f2(0, l15)), new f.p(new androidx.lifecycle.k(w0Var, 2)));
        return Unit.INSTANCE;
        Throwable thB = o13.q.b(objL4);
        if (thB != null) {
            String strN = fb1.c.n("saveAndSendWorkoutToTargetedDevice: Error saving workout: ", thB.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "WorkoutDetailsViewModel", strN);
            w0Var.j(g3.a.a(g3.f35298f, thB.getMessage(), null, null, null, 14));
            return Unit.INSTANCE;
        }
        if (i14 != 0) {
            q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
            d.k kVar2 = d.k.f48530a;
            this.f48797d = null;
            this.f48794a = l14;
            this.f48795b = i14;
            this.f48796c = 2;
            if (v52.d.d(wVar, kVar2, this) != aVar) {
                Long l17 = l14;
                i15 = i14;
                l15 = l17;
                workoutDetailsDTO = fVar.f48605r;
                if (workoutDetailsDTO != null) {
                    kVar = workoutDetailsDTO.f48044e;
                } else {
                    kVar = null;
                }
                if (kVar == m52.k.f116758r) {
                    long jLongValue2 = l15.longValue();
                    this.f48797d = null;
                    this.f48794a = l15;
                    this.f48795b = i15;
                    this.f48796c = 3;
                    objB4 = f.B4(fVar, jLongValue2, this);
                } else {
                    w0VarC5 = fVar.c5(l15.longValue(), false);
                }
            }
            return aVar;
        }
        Long l18 = l14;
        i15 = i14;
        l15 = l18;
        workoutDetailsDTO = fVar.f48605r;
        if (workoutDetailsDTO != null) {
            kVar = workoutDetailsDTO.f48044e;
        } else {
            kVar = null;
        }
        if (kVar == m52.k.f116758r) {
            long jLongValue3 = l15.longValue();
            this.f48797d = null;
            this.f48794a = l15;
            this.f48795b = i15;
            this.f48796c = 3;
            objB4 = f.B4(fVar, jLongValue3, this);
        } else {
            w0VarC5 = fVar.c5(l15.longValue(), false);
        }
        w0Var.n(k2.a(w0VarC5, new f2(0, l15)), new f.p(new androidx.lifecycle.k(w0Var, 2)));
        return Unit.INSTANCE;
    }
}
