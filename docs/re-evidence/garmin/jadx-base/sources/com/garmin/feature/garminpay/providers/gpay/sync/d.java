package com.garmin.feature.garminpay.providers.gpay.sync;

import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import jn2.k;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ty1.g2;
import v.b0;
import vo2.v;
import wl2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/d;", "Lwl2/f;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.nfc.b f51365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo2.b f51366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yo2.b f51367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewFitPayCreditCardSync f51368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SettableFuture<Unit> f51369e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51370a;

        static {
            int[] iArr = new int[tl2.c.b.values().length];
            try {
                iArr[tl2.c.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tl2.c.b.FAILED_START_BY_DEVICE_BUSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tl2.c.b.FAILED_START_NOT_RECEIVE_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tl2.c.b.FAILED_FINISH_BY_DEVICE_BUSY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[tl2.c.b.FAILED_FINISH_NOT_RECEIVE_RESPONSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[tl2.c.b.IDLE_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[tl2.c.b.DISCONNECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f51370a = iArr;
        }
    }

    public d(com.garmin.device.nfc.b bVar, yo2.b bVar2, yo2.b bVar3, NewFitPayCreditCardSync newFitPayCreditCardSync, SettableFuture<Unit> settableFuture) {
        this.f51365a = bVar;
        this.f51366b = bVar2;
        this.f51367c = bVar3;
        this.f51368d = newFitPayCreditCardSync;
        this.f51369e = settableFuture;
    }

    @Override // tl2.f
    public final void b(tl2.c.b bVar) {
        bVar.getClass();
        Logger logger = NewFitPayCreditCardSync.f51340f;
        logger.debug("sendCardChanges: " + bVar);
        int i14 = a.f51370a[bVar.ordinal()];
        SettableFuture<Unit> settableFuture = this.f51369e;
        switch (i14) {
            case 1:
                logger.debug("sendAllCardChanges: finished");
                settableFuture.set(null);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                settableFuture.setException(new NewFitPayCreditCardSync.CreditCardSyncException("walletDataTransfer failed " + bVar, yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                break;
            case 6:
            case 7:
                settableFuture.setException(new NewFitPayCreditCardSync.CreditCardSyncException("walletDataTransfer aborted " + bVar, yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                break;
            default:
                settableFuture.setException(new NewFitPayCreditCardSync.CreditCardSyncException("walletDataTransfer unexpected status: " + bVar, yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                break;
        }
    }

    @Override // wl2.f
    public final void c(wl2.b bVar) {
        FluentFuture fluentFutureFrom = FluentFuture.from(Futures.immediateFuture(Boolean.TRUE));
        NewFitPayCreditCardSync newFitPayCreditCardSync = this.f51368d;
        com.garmin.device.nfc.b bVar2 = this.f51365a;
        if (bVar2 != null) {
            fluentFutureFrom = fluentFutureFrom.transformAsync(new k(new g2(20, bVar, bVar2), 8), newFitPayCreditCardSync.f51343c);
        }
        yo2.b bVar3 = this.f51366b;
        if (bVar3 != null) {
            fluentFutureFrom = fluentFutureFrom.transformAsync(new k(new v(newFitPayCreditCardSync, bVar, bVar3, 0), 9), newFitPayCreditCardSync.f51343c);
        }
        yo2.b bVar4 = this.f51367c;
        if (bVar4 != null) {
            fluentFutureFrom = fluentFutureFrom.transformAsync(new k(new v(newFitPayCreditCardSync, bVar, bVar4, 1), 10), newFitPayCreditCardSync.f51343c);
        }
        fluentFutureFrom.addListener(new b0(bVar, 12), newFitPayCreditCardSync.f51343c);
    }
}
