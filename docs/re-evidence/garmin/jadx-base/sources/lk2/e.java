package lk2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager$cleanupPreviousTransferStatus$1", f = "FileTransferManager.kt", l = {510}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.a f113193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f113194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.device.filetransfer.a aVar, UUID uuid, int i14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f113193b = aVar;
        this.f113194c = uuid;
        this.f113195d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f113193b, this.f113194c, this.f113195d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113192a;
        if (i14 == 0) {
            o13.r.b(obj);
            Integer num = new Integer(this.f113195d);
            this.f113192a = 1;
            if (this.f113193b.f(this.f113194c, num, this) == aVar) {
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
