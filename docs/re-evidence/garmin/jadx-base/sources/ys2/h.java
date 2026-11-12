package ys2;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.write.SendFileToDeviceTask$launchFileTransferCancelRequest$1", f = "SendFileToDeviceTask.kt", l = {247}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f199223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f199223b = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f199223b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199222a;
        o oVar = this.f199223b;
        try {
            if (i14 == 0) {
                r.b(obj);
                this.f199222a = 1;
                if (oVar.f199244a.b(5022, new byte[0], this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            oVar.f199251h.warn("Error cancelling FileSenderTask", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
