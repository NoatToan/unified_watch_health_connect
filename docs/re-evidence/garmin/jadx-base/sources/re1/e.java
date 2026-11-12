package re1;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqe1/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.data.repository.RunningEconomyRepositoryImpl$getRunningEconomyRanges$2", f = "RunningEconomyRepositoryImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<qe1.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152201a;

    public e(t13.d<? super e> dVar) {
        super(1, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<qe1.i>> dVar) {
        return new e(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152201a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<qe1.i>> i0VarA = ((pe1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, pe1.a.class, new c83.h.a[0], null, null, null, 120)).a();
        this.f152201a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
