package ok2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onDeviceAdded$1", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f132754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f132754a = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f132754a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g.b bVar = g.f132677s;
        g gVar = this.f132754a;
        for (pk2.a0 a0Var : gVar.z()) {
            try {
                a0Var.i(gVar.f132682a);
            } catch (Exception e4) {
                gVar.f132688g.warn(a0Var.A() + " failed onDeviceAdded: " + e4.getMessage());
            }
        }
        return Unit.INSTANCE;
    }
}
