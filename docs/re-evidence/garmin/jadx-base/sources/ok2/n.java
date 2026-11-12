package ok2;

import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onDeviceConnected$2", f = "CoreTransferManager.kt", l = {619}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132756b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f132756b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f132756b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132755a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f132755a = 1;
            if (m0.b(750L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f132756b.d();
        return Unit.INSTANCE;
    }
}
