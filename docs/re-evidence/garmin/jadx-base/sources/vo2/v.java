package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import ml2.d0;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayCreditCardSync f179214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wl2.b f179215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo2.b f179216d;

    public /* synthetic */ v(NewFitPayCreditCardSync newFitPayCreditCardSync, wl2.b bVar, yo2.b bVar2, int i14) {
        this.f179213a = i14;
        this.f179214b = newFitPayCreditCardSync;
        this.f179215c = bVar;
        this.f179216d = bVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f179213a;
        final yo2.b bVar = this.f179216d;
        final wl2.b bVar2 = this.f179215c;
        NewFitPayCreditCardSync newFitPayCreditCardSync = this.f179214b;
        switch (i14) {
            case 0:
                Logger logger = NewFitPayCreditCardSync.f51340f;
                newFitPayCreditCardSync.getClass();
                Logger logger2 = NewFitPayCreditCardSync.f51340f;
                com.garmin.device.nfc.h[] hVarArrD = bVar.d();
                if (hVarArrD == null) {
                    logger2.warn("updateCreditCard: invalid metadata tlv");
                    ListenableFuture listenableFutureImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
                    listenableFutureImmediateFuture.getClass();
                    return listenableFutureImmediateFuture;
                }
                final ListenableFuture<com.garmin.device.nfc.h[]> listenableFutureA = newFitPayCreditCardSync.a(bVar);
                logger2.debug("updateCreditCard: send card metadata");
                final ListenableFuture<Boolean> listenableFutureN = bVar2.n(hVarArrD, 20000L);
                ListenableFuture listenableFutureCallAsync = Futures.whenAllComplete(listenableFutureN, listenableFutureA).callAsync(new AsyncCallable() { // from class: vo2.t
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.util.concurrent.AsyncCallable
                    public final ListenableFuture call() {
                        Logger logger3 = NewFitPayCreditCardSync.f51340f;
                        com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) listenableFutureA.get();
                        Boolean bool = (Boolean) listenableFutureN.get();
                        if (!(bool != null ? bool.booleanValue() : false)) {
                            logger3.warn("updateCreditCard: Failed to send card metadata");
                            return Futures.immediateFuture(Boolean.FALSE);
                        }
                        if (hVarArr == null) {
                            logger3.warn("updateCreditCard: Failed to download card image or generate image tlvs");
                            return Futures.immediateFuture(Boolean.TRUE);
                        }
                        UUID uuidFromString = UUID.fromString(bVar.getCreditCardId());
                        uuidFromString.getClass();
                        byte[] bArrArray = ByteBuffer.allocate(16).putLong(uuidFromString.getMostSignificantBits()).putLong(uuidFromString.getLeastSignificantBits()).array();
                        bArrArray.getClass();
                        com.garmin.device.nfc.h hVarI = com.garmin.device.nfc.h.i(bArrArray);
                        int length = hVarArr.length;
                        Object[] objArrCopyOf = Arrays.copyOf(hVarArr, length + 1);
                        objArrCopyOf[length] = hVarI;
                        logger3.debug("updateCreditCard: send card image");
                        return bVar2.n((com.garmin.device.nfc.h[]) objArrCopyOf, 20000L);
                    }
                }, newFitPayCreditCardSync.f51343c);
                listenableFutureCallAsync.getClass();
                return listenableFutureCallAsync;
            default:
                Logger logger3 = NewFitPayCreditCardSync.f51340f;
                ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(newFitPayCreditCardSync.a(bVar), new d0(1, bVar, bVar2), newFitPayCreditCardSync.f51343c);
                listenableFutureTransformAsync.getClass();
                return listenableFutureTransformAsync;
        }
    }
}
