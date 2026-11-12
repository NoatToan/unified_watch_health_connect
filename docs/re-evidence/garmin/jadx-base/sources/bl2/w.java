package bl2;

import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer$doExecuteWithRetry$9", f = "ReadActiveTransfer.kt", l = {221, 222}, m = "invokeSuspend")
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r rVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f18738b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f18738b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18737a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f18737a = 1;
            if (m0.b(300L, this) != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        r rVar = this.f18738b;
        wk2.d f205154d = rVar.f18603d.getF205154d();
        this.f18737a = 2;
        Object objK = rVar.k(f205154d, "agentReset", this);
        return objK == aVar ? aVar : objK;
    }
}
