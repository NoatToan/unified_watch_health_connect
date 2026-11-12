package com.garmin.feature.garminpay.providers.gpay.sync;

import aq2.h;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import lc.u0;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;
import vo2.y;
import xo2.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<V> implements AsyncCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture<Map<UUID, com.garmin.device.nfc.b>> f51371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayCreditCardSync f51372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture<mn2.a> f51373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f51374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p<UUID, yo2.b> f51375e;

    public e(ListenableFuture<Map<UUID, com.garmin.device.nfc.b>> listenableFuture, NewFitPayCreditCardSync newFitPayCreditCardSync, ListenableFuture<mn2.a> listenableFuture2, g gVar, p<UUID, yo2.b> pVar) {
        this.f51371a = listenableFuture;
        this.f51372b = newFitPayCreditCardSync;
        this.f51373c = listenableFuture2;
        this.f51374d = gVar;
        this.f51375e = pVar;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public final ListenableFuture<Unit> call() throws ExecutionException, InterruptedException, NewFitPayCreditCardSync.CreditCardSyncException {
        yo2.d creditCardInfo;
        Map<UUID, com.garmin.device.nfc.b> map = this.f51371a.get();
        mn2.a aVar = this.f51373c.get();
        aVar.getClass();
        NewFitPayCreditCardSync newFitPayCreditCardSync = this.f51372b;
        newFitPayCreditCardSync.f51344d = aVar;
        if (map == null) {
            NewFitPayCreditCardSync.f51340f.error("syncCreditCard: will not sync, Garmin device call failed");
            throw new NewFitPayCreditCardSync.CreditCardSyncException("syncCreditCard: will not sync, Garmin device call failed", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
        }
        Logger logger = NewFitPayCreditCardSync.f51340f;
        p<UUID, yo2.b> pVar = this.f51375e;
        yo2.b bVar = pVar.f128595b;
        String cardState = bVar != null ? bVar.getCardState() : null;
        com.garmin.device.nfc.b bVar2 = map.get(pVar.f128594a);
        String strG = e0.g("handleCardSync: ", (bVar == null || (creditCardInfo = bVar.getCreditCardInfo()) == null) ? null : creditCardInfo.getPan(), ", cloud state '", cardState, "' -> ");
        boolean z14 = bVar2 != null;
        y yVar = this.f51374d.f191808b;
        switch (yVar == null ? -1 : NewFitPayCreditCardSync.b.f51346a[yVar.ordinal()]) {
            case -1:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                ListenableFuture<Unit> listenableFutureImmediateFuture = Futures.immediateFuture(Unit.INSTANCE);
                listenableFutureImmediateFuture.getClass();
                return listenableFutureImmediateFuture;
            case 0:
            default:
                u0.r();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (!z14) {
                    logger.debug(strG.concat(": card is not available on the watch, adding card"));
                    if (bVar != null) {
                        return newFitPayCreditCardSync.b(null, null, bVar);
                    }
                    ListenableFuture<Unit> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException("CreditCard must not be null", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                    listenableFutureImmediateFailedFuture.getClass();
                    return listenableFutureImmediateFailedFuture;
                }
                logger.debug(strG.concat(": card is available on the watch, updating card"));
                bVar2.getClass();
                if (bVar == null) {
                    ListenableFuture<Unit> listenableFutureImmediateFailedFuture2 = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException("CreditCard must not be null", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                    listenableFutureImmediateFailedFuture2.getClass();
                    return listenableFutureImmediateFailedFuture2;
                }
                byte[] bArrB = bVar.b();
                if (bArrB == null) {
                    logger.error("handleCardOnWatch: failed to hash card");
                    ListenableFuture<Unit> listenableFutureImmediateFailedFuture3 = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException(fb1.c.n("failed to compute creditcard hash, for ", bVar.getCreditCardId()), yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                    listenableFutureImmediateFailedFuture3.getClass();
                    return listenableFutureImmediateFailedFuture3;
                }
                String strA = h.a(bArrB);
                byte[] bArr = bVar2.f50856i;
                String strA2 = h.a(bArr);
                if (!Arrays.equals(bArrB, bArr)) {
                    logger.debug(e0.g("handleCardOnWatch updating credit card, fitPayCardHash [", strA, "] != garminDeviceCardHash [", strA2, "]"));
                    return newFitPayCreditCardSync.b(null, bVar, null);
                }
                com.airbnb.lottie.animation.keyframe.a.u("handleCardOnWatch: no update necessary, metadata hash match [", strA, "]", logger);
                ListenableFuture<Unit> listenableFutureImmediateFuture2 = Futures.immediateFuture(Unit.INSTANCE);
                listenableFutureImmediateFuture2.getClass();
                return listenableFutureImmediateFuture2;
            case 6:
                return newFitPayCreditCardSync.b(bVar2, null, null);
        }
    }
}
