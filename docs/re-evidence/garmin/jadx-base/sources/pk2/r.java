package pk2;

import java.io.File;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$queueUploadItems$6", f = "AgentQueueHelper.kt", l = {}, m = "invokeSuspend")
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f138475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<lk2.a> f138476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, List<lk2.a> list, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f138475a = bVar;
        this.f138476b = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f138475a, this.f138476b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        cl2.h hVar = cl2.h.f27950a;
        long f92746j = this.f138475a.f138359b.getF92746j();
        hVar.getClass();
        Logger logger = cl2.h.f27951b;
        List<lk2.a> list = this.f138476b;
        list.getClass();
        for (lk2.a aVar2 : list) {
            cl2.h.f27950a.getClass();
            File fileA = cl2.h.a(cl2.h.f27953d + "/sink/" + f92746j, aVar2.f113152a, aVar2.f113153b);
            try {
                if (!fileA.delete()) {
                    logger.debug("Did not delete file " + fileA.getName());
                }
            } catch (Exception e4) {
                logger.warn("deleteFiles failure", (Throwable) e4);
            }
        }
        return Unit.INSTANCE;
    }
}
