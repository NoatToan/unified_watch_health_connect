package bl2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer$updatePriority$1", f = "AbstractActiveTransfer.kt", l = {338}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f18670b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f18670b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        lk2.b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18669a;
        b bVar = this.f18670b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                int iA = bVar.f18603d.getF205155e().a();
                lk2.b0 b0Var2 = bVar.f18608i;
                if ((b0Var2 == null || b0Var2.getPriority() != iA) && (b0Var = bVar.f18608i) != null) {
                    this.f18669a = 1;
                    if (b0Var.a(iA, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            bVar.d().warn("Failed to update priority " + bVar.f18603d.getId(), (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
