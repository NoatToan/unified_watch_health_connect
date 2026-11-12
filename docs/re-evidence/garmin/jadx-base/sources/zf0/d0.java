package zf0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$updateOwnerEventAsync$2", f = "EventRepo.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f204351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.k f204352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(d dVar, long j8, fg0.k kVar, t13.d<? super d0> dVar2) {
        super(1, dVar2);
        this.f204350b = dVar;
        this.f204351c = j8;
        this.f204352d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d0(this.f204350b, this.f204351c, this.f204352d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204349a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarP = this.f204350b.f204344a.p(this.f204351c, this.f204352d);
        this.f204349a = 1;
        Object objAwait = i0VarP.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
