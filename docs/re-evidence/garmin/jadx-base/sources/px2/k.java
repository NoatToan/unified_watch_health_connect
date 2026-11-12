package px2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIGarminHealth;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.protoimpl.GarminHealthServiceHandler$handleMsg$data$1$1", f = "GarminHealthServiceHandler.kt", l = {272}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f141820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dt2.k f141821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f141822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, dt2.k kVar, AtomicBoolean atomicBoolean, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f141820b = fVar;
        this.f141821c = kVar;
        this.f141822d = atomicBoolean;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f141820b, this.f141821c, this.f141822d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141819a;
        f fVar = this.f141820b;
        try {
            if (i14 == 0) {
                r.b(obj);
                fVar.f141794b.debug("handleMsg -> sending pending 'GDIGarminHealth.FileTransferResponse'");
                GDIGarminHealth.Service.Builder fileXferResponse = GDIGarminHealth.Service.newBuilder().setFileXferResponse(GDIGarminHealth.FileTransferResponse.newBuilder().setIsPending(true));
                fileXferResponse.getClass();
                dt2.k kVar = this.f141821c;
                this.f141819a = 1;
                if (a.c(fileXferResponse, kVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (ProtobufException e4) {
            fVar.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse' pending", (Throwable) e4);
            this.f141822d.set(false);
        }
        return Unit.INSTANCE;
    }
}
