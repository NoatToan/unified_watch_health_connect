package zf0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfg0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$createEventWithEventCreatorFlowType$2", f = "EventRepo.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super c83.a0<fg0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg0.k f204362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg0.c f204363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, fg0.k kVar, gg0.c cVar, t13.d<? super f> dVar2) {
        super(1, dVar2);
        this.f204361b = dVar;
        this.f204362c = kVar;
        this.f204363d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f204361b, this.f204362c, this.f204363d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fg0.k>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204360a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<fg0.k>> i0VarA = this.f204361b.f204344a.A(this.f204362c, this.f204363d);
        this.f204360a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
