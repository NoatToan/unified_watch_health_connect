package jn2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.nfc.NfcCommandHandler;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.impl.PayDevice$sendNotification$2", f = "PayDevice.kt", l = {704}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f99678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hs2.f f99679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, hs2.f fVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f99678b = mVar;
        this.f99679c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f99678b, this.f99679c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99677a;
        if (i14 == 0) {
            o13.r.b(obj);
            StringBuilder sb3 = new StringBuilder("sendNotification(");
            hs2.f fVar = this.f99679c;
            sb3.append(fVar);
            sb3.append(")");
            String string = sb3.toString();
            ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
            rl2.c cVarC = this.f99678b.c(string, false);
            if (cVarC == null) {
                return Unit.INSTANCE;
            }
            com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(NfcCommandHandler.b.NOTIFICATION_FROM_MOBILE_TO_DEVICE, new byte[]{fVar.f85452a});
            tl2.i iVar2 = cVarC.f50805f;
            tl2.g gVar = tl2.i.f165328k;
            ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(iVar2.d(iVar, AbstractComponentTracker.LINGERING_TIMEOUT, 0), new k(new p40.h(16), 6), cVarC.f50804e);
            listenableFutureTransformAsync.getClass();
            this.f99677a = 1;
            if (t53.c.b(listenableFutureTransformAsync, this) == aVar) {
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
