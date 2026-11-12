package y92;

import com.garmin.device.nfc.NfcCommandHandler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$isWalletSetUp$2", f = "NfcDevicePasscodeRepository.kt", l = {414}, m = "invokeSuspend", v = 1)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f195352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f fVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f195352c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f195352c, dVar);
        nVar.f195351b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195350a;
        boolean z14 = false;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = this.f195352c;
                rl2.c cVar = fVar.f195310e.get();
                if (cVar != null) {
                    Logger logger = NfcCommandHandler.f50799g;
                    ListenableFuture<Collection<com.garmin.device.nfc.b>> listenableFutureD = cVar.d(p13.w.c(com.garmin.device.nfc.h.b.f50885b));
                    if (listenableFutureD.isDone()) {
                        try {
                            obj = listenableFutureD.get();
                        } catch (ExecutionException e4) {
                            Throwable cause = e4.getCause();
                            if (cause == null) {
                                throw e4;
                            }
                            throw cause;
                        }
                    } else {
                        this.f195351b = listenableFutureD;
                        this.f195350a = 1;
                        o53.k kVar = new o53.k(u13.f.b(this), 1);
                        kVar.q();
                        listenableFutureD.addListener(new g(kVar, listenableFutureD), Executors.newSingleThreadScheduledExecutor());
                        kVar.r(new h(listenableFutureD));
                        obj = kVar.p();
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    x92.a aVar2 = x92.a.f189663a;
                    String str = "NFC service not found for device unit id " + fVar.f195306a;
                    aVar2.getClass();
                    x92.a.b("DevicePasscodeRepository", str);
                }
                return Boolean.valueOf(z14);
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Collection collection = (Collection) obj;
            x92.a aVar3 = x92.a.f189663a;
            String str2 = "Get Wallet State: cardsCount=" + (collection != null ? new Integer(collection.size()) : null);
            aVar3.getClass();
            x92.a.a("DevicePasscodeRepository", str2);
            if (collection != null && (!collection.isEmpty())) {
                z14 = true;
            }
            return Boolean.valueOf(z14);
        } catch (Exception e14) {
            x92.a.f189663a.getClass();
            x92.a.b("DevicePasscodeRepository", "Failed to get wallet state " + e14);
            return Boolean.FALSE;
        }
    }
}
