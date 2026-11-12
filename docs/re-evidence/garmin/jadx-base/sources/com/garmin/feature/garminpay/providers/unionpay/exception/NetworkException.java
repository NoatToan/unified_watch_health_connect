package com.garmin.feature.garminpay.providers.unionpay.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;", "source", "", "message", "<init>", "(Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;Ljava/lang/String;)V", "", "cause", "(Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;Ljava/lang/Throwable;)V", "(Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;", "getSource", "()Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NetworkException extends Exception {
    public static final int $stable = 8;
    private final a source;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        CONNECT,
        CARD_IMAGE
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(a aVar, String str, Throwable th3) {
        super(str, th3);
        aVar.getClass();
        str.getClass();
        th3.getClass();
        this.source = aVar;
    }

    public final a getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(a aVar, Throwable th3) {
        super(th3);
        aVar.getClass();
        th3.getClass();
        this.source = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(a aVar, String str) {
        super(str);
        aVar.getClass();
        str.getClass();
        this.source = aVar;
    }
}
