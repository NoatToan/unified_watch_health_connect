package uw1;

import c83.a0;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tw1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltw1/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.network.TrainingPlansRepo$rescheduleWorkout$2", f = "TrainingPlansRepo.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements l<t13.d<? super a0<r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f173017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f173018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f173019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j8, long j14, String str, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f173017b = j8;
        this.f173018c = j14;
        this.f173019d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f173017b, this.f173018c, this.f173019d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<r>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173016a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVarA = b.a.a(b.f172999a);
        this.f173016a = 1;
        Object objI = aVarA.i(this.f173017b, this.f173018c, this.f173019d, "application/x-www-form-urlencoded", this);
        return objI == aVar ? aVar : objI;
    }
}
