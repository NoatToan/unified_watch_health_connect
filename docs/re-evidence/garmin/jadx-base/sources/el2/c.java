package el2;

import com.garmin.proto.generated.GDIGarminConnect;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.gc.device.ConnectTransferService$handleCheckDownloadQueueRequest$2", f = "ConnectTransferService.kt", l = {259}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f64561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIGarminConnect.CheckDownloadQueueRequest f64562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, GDIGarminConnect.CheckDownloadQueueRequest checkDownloadQueueRequest, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f64561b = aVar;
        this.f64562c = checkDownloadQueueRequest;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f64561b, this.f64562c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64560a;
        a aVar2 = this.f64561b;
        try {
            if (i14 == 0) {
                r.b(obj);
                e eVar = aVar2.f64539b;
                rs2.c cVar = aVar2.f64542e;
                if (cVar == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                boolean forceBetaSoftwareUpdateCheck = this.f64562c.getForceBetaSoftwareUpdateCheck();
                this.f64560a = 1;
                if (eVar.g(cVar, forceBetaSoftwareUpdateCheck, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            Logger logger = aVar2.f64541d;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.error("Failed refreshDownloadList", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
