package com.garmin.feature.garminpay.providers.gpay.sync;

import androidx.media3.exoplayer.n;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.device.nfc.h;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import iz1.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import lc.u0;
import mn2.k;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vo2.y;
import zn2.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewFitPayCreditCardSync;", "", "Lzn2/t;", "deviceServiceProvider", "", "allowCache", "<init>", "(Lzn2/t;Z)V", "a", "CreditCardSyncException", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewFitPayCreditCardSync {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f51340f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListeningScheduledExecutorService f51343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mn2.a f51344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f51345e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewFitPayCreditCardSync$CreditCardSyncException;", "Lcom/garmin/feature/garminpay/providers/gpay/NewFitPayException;", "", "message", "Lyo2/a$b;", "resultFlag", "<init>", "(Ljava/lang/String;Lyo2/a$b;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lyo2/a$b;", "getResultFlag", "()Lyo2/a$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditCardSyncException extends NewFitPayException {
        public static final int $stable = 8;
        private final String message;
        private final yo2.a.b resultFlag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditCardSyncException(String str, yo2.a.b bVar) {
            super(str, null, null, 6, null);
            str.getClass();
            bVar.getClass();
            this.message = str;
            this.resultFlag = bVar;
        }

        @Override // com.garmin.feature.garminpay.providers.gpay.NewFitPayException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public final yo2.a.b getResultFlag() {
            return this.resultFlag;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51346a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.CREDITCARD_PROVISION_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.CREDITCARD_ACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.CREDITCARD_REACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.CREDITCARD_DEACTIVATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y.CREDITCARD_METADATA_UPDATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y.CREDITCARD_DELETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[y.APDU_PACKAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[y.CREDITCARD_CREATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[y.RESET_DEFAULT_CREDITCARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[y.SET_DEFAULT_CREDITCARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[y.CREDITCARD_PROVISION_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[y.CREDENTIAL_CREATED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[y.CREDENTIAL_ACTIVATED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[y.CREDENTIAL_DELETED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[y.CREDENTIAL_DELETE_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[y.CREDENTIAL_METADATA_UPDATED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f51346a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f51340f = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayCreditCardSync");
    }

    public NewFitPayCreditCardSync(t tVar, boolean z14) {
        tVar.getClass();
        this.f51341a = tVar;
        this.f51342b = z14;
        this.f51343c = MoreExecutors.listeningDecorator(Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setNameFormat("NewFitPayCreditCardSync-%d").build()));
        this.f51344d = new mn2.a.c(SyslogConstants.LOG_LOCAL4, 100);
        ln2.e.f113687a.getClass();
        this.f51345e = (k) ln2.e.a().b(k.class);
    }

    public final ListenableFuture<h[]> a(yo2.b bVar) {
        mn2.a aVar = this.f51344d;
        if (aVar instanceof mn2.a.C2276a) {
            ListenableFuture<h[]> listenableFutureImmediateFuture = Futures.immediateFuture(new h[0]);
            listenableFutureImmediateFuture.getClass();
            return listenableFutureImmediateFuture;
        }
        if (aVar instanceof mn2.a.b) {
            ij0.a.f93807a.getClass();
            ListenableFuture<h[]> listenableFutureImmediateFuture2 = Futures.immediateFuture(ij0.a.f93808b);
            listenableFutureImmediateFuture2.getClass();
            return listenableFutureImmediateFuture2;
        }
        if (!(aVar instanceof mn2.a.c)) {
            u0.r();
            return null;
        }
        mn2.a.c cVar = (mn2.a.c) aVar;
        p pVar = new p(Integer.valueOf(cVar.f119778a), Integer.valueOf(cVar.f119779b));
        String strO = yo2.b.o(bVar, pVar, 1);
        if (strO == null) {
            ListenableFuture<h[]> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new CreditCardSyncException("requestImageTlvs: failed to construct fitpay image url", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
            listenableFutureImmediateFailedFuture.getClass();
            return listenableFutureImmediateFailedFuture;
        }
        ListeningScheduledExecutorService listeningScheduledExecutorService = this.f51343c;
        listeningScheduledExecutorService.getClass();
        kn2.a aVar2 = new kn2.a(strO, this.f51341a, listeningScheduledExecutorService, pVar);
        com.airbnb.lottie.animation.keyframe.a.w("execute: ", aVar2.f105686e, kn2.a.f105681g);
        ms2.d dVar = aVar2.f105683b;
        long unitId = dVar.getF205818d().getUnitId();
        int productNumber = dVar.getF205818d().getProductNumber();
        p<Integer, Integer> pVar2 = aVar2.f105685d;
        kn2.c cVar2 = new kn2.c(aVar2.f105687f, unitId, productNumber, true, pVar2.f128594a.intValue(), pVar2.f128595b.intValue(), aVar2.f105682a);
        ListeningScheduledExecutorService listeningScheduledExecutorService2 = aVar2.f105684c;
        Future futureSubmit = listeningScheduledExecutorService2.submit((Callable) cVar2);
        futureSubmit.getClass();
        ListenableFuture<h[]> listenableFutureTransform = Futures.transform((ListenableFuture) futureSubmit, new n(new f(aVar2, 27), 5), listeningScheduledExecutorService2);
        listenableFutureTransform.getClass();
        return listenableFutureTransform;
    }

    public final SettableFuture b(com.garmin.device.nfc.b bVar, yo2.b bVar2, yo2.b bVar3) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.f51341a.f205816b.u(new d(bVar, bVar2, bVar3, this, settableFutureCreate));
        settableFutureCreate.getClass();
        return settableFutureCreate;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewFitPayCreditCardSync$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "DEVICE_WALLET_STATE_TIMEOUT_SECS", "J", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
