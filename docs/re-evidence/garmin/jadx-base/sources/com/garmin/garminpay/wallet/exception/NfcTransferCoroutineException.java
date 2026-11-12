package com.garmin.garminpay.wallet.exception;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tl2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;", "failedType", "<init>", "(Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;)V", "", "message", "(Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;Ljava/lang/String;)V", "", "cause", "(Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;Ljava/lang/String;Ljava/lang/Throwable;)V", "value", "Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;", "getFailedType", "()Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NfcTransferCoroutineException extends Exception {
    public static final int $stable = 8;
    private a failedType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcTransferCoroutineException(a aVar, String str, Throwable th3) {
        super(e5.g(aVar.name(), ": ", str), th3);
        aVar.getClass();
        str.getClass();
        th3.getClass();
        this.failedType = aVar;
    }

    public final a getFailedType() {
        return this.failedType;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        BUSY_WHEN_START,
        NO_RESPONSE_WHEN_START,
        BUSY_WHEN_FINISH,
        NO_RESPONSE_WHEN_FINISH,
        IDLE_TIMEOUT,
        DEVICE_DISCONNECTED,
        NO_NFC_SERVICE;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1113a f52328a = new C1113a(null);

        /* JADX INFO: renamed from: com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/garminpay/wallet/exception/NfcTransferCoroutineException$a$a;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1113a {

            /* JADX INFO: renamed from: com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1114a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f52337a;

                static {
                    int[] iArr = new int[c.b.values().length];
                    try {
                        iArr[c.b.FAILED_START_BY_DEVICE_BUSY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[c.b.FAILED_START_NOT_RECEIVE_RESPONSE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[c.b.FAILED_FINISH_BY_DEVICE_BUSY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[c.b.FAILED_FINISH_NOT_RECEIVE_RESPONSE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[c.b.IDLE_TIMEOUT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[c.b.DISCONNECTED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f52337a = iArr;
                }
            }

            public /* synthetic */ C1113a(j jVar) {
                this();
            }

            public static a a(c.b bVar) {
                bVar.getClass();
                switch (C1114a.f52337a[bVar.ordinal()]) {
                    case 1:
                        return a.BUSY_WHEN_START;
                    case 2:
                        return a.NO_RESPONSE_WHEN_START;
                    case 3:
                        return a.BUSY_WHEN_FINISH;
                    case 4:
                        return a.NO_RESPONSE_WHEN_FINISH;
                    case 5:
                        return a.IDLE_TIMEOUT;
                    case 6:
                        return a.DEVICE_DISCONNECTED;
                    default:
                        o2.c.m(am.j.m("Cannot mapping NfcTransferStatus: ", bVar.name(), " to FailedType"));
                        return null;
                }
            }

            private C1113a() {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcTransferCoroutineException(a aVar, String str) {
        super(e5.g(aVar.name(), ": ", str));
        aVar.getClass();
        str.getClass();
        this.failedType = aVar;
    }

    public NfcTransferCoroutineException(a aVar) {
        aVar.getClass();
        this.failedType = aVar;
    }
}
