package pk2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$populateQueue$1", f = "AgentQueueHelper.kt", l = {181}, m = "invokeSuspend")
public final class j extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f138413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ok2.y f138414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, ok2.y yVar, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f138413b = bVar;
        this.f138414c = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f138413b, this.f138414c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138412a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f138412a = 1;
            if (this.f138413b.i(this.f138414c, this) == aVar) {
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
