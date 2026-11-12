package pk2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$doPopulateQueue$4", f = "AgentQueueHelper.kt", l = {271}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f138410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ok2.y f138411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, ok2.y yVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f138410b = bVar;
        this.f138411c = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f138410b, this.f138411c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138409a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f138409a = 1;
            if (b.b(this.f138410b, this.f138411c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
