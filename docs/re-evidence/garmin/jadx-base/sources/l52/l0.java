package l52;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lww1/h0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getFbtWorkoutCompatibleActivities$2", f = "WorkoutsRepositoryImpl.kt", l = {335}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.l<t13.d<? super c83.a0<ww1.h0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110302a;

    public l0(t13.d<? super l0> dVar) {
        super(1, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l0(dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ww1.h0>> dVar) {
        return new l0(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110302a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        z.f110389c.getClass();
        o53.i0<c83.a0<ww1.h0>> i0VarX = ((x) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, x.class, new c83.h.a[0], null, null, null, 88)).x();
        this.f110302a = 1;
        Object objAwait = i0VarX.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
