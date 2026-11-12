package com.garmin.garminpay.wallet.exception;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;", "errorType", "", "message", "<init>", "(Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;Ljava/lang/String;)V", "", "cause", "(Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;Ljava/lang/Throwable;)V", "(Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;Ljava/lang/String;Ljava/lang/Throwable;)V", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;", "getType", "()Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExpressCardSettingException extends RuntimeException {
    public static final int $stable = 8;
    private final a type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        GENERAL_ERROR,
        DEVICE_IS_BUSY,
        DEVICE_NOT_CONNECTED
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressCardSettingException(a aVar, String str, Throwable th3) {
        super(str, th3);
        aVar.getClass();
        str.getClass();
        th3.getClass();
        this.type = aVar;
    }

    public final a getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressCardSettingException(a aVar, Throwable th3) {
        super(th3);
        aVar.getClass();
        th3.getClass();
        this.type = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressCardSettingException(a aVar, String str) {
        super(str);
        aVar.getClass();
        str.getClass();
        this.type = aVar;
    }
}
