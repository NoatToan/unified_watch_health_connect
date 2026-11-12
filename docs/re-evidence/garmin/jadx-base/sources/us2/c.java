package us2;

import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.core.Dispatcher$close$1", f = "Dispatcher.kt", l = {}, m = "invokeSuspend")
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f172480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f172480a = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f172480a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f172480a;
        bVar.f172458a.a();
        ct2.f fVar = bVar.f172459b;
        Logger logger = fVar.f55544c;
        logger.debug("close()");
        fVar.f55546e.a();
        try {
            fVar.f55545d.close();
        } catch (IOException e4) {
            logger.debug("Exception closing CobsWriter", (Throwable) e4);
        }
        g andSet = bVar.f172467j.getAndSet(null);
        if (andSet != null) {
            andSet.close();
        }
        c0.d(bVar.f172465h, "Dispatcher closed");
        return Unit.INSTANCE;
    }
}
