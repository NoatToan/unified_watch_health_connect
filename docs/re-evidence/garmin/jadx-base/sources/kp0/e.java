package kp0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljp0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.data.repo.HydrationRepository$getHydrationSettings$result$1", f = "HydrationRepository.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements l<t13.d<? super a0<jp0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f105993b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f105993b = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f105993b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<jp0.b>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105992a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ip0.a aVar2 = this.f105993b.f106008a;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        i0<a0<jp0.b>> i0VarD = aVar2.d(fz0.d.b(dateTimeNow));
        this.f105992a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
