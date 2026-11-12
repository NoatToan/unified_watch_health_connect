package kp0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljp0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.data.repo.HydrationRepository$logHydration$2", f = "HydrationRepository.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements l<t13.d<? super a0<jp0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f105999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jp0.d f106000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, jp0.d dVar, t13.d<? super g> dVar2) {
        super(1, dVar2);
        this.f105999b = jVar;
        this.f106000c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f105999b, this.f106000c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<jp0.b>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105998a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<jp0.b>> i0VarB = this.f105999b.f106008a.b(this.f106000c);
        this.f105998a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
