package uw1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.network.TrainingPlansRepo$skipDeloadWeek$2", f = "TrainingPlansRepo.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f173021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j8, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f173021b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f173021b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173020a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVarA = b.a.a(b.f172999a);
        this.f173020a = 1;
        Object objE = aVarA.e(this.f173021b, this);
        return objE == aVar ? aVar : objE;
    }
}
