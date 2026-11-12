package com.garmin.garminpay.wallet;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/garminpay/wallet/PasscodeVerifyFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "responseStatus", "", "<init>", "(I)V", "getResponseStatus", "()I", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PasscodeVerifyFailedException extends Exception {
    public static final int $stable = 8;
    private final int responseStatus;

    public PasscodeVerifyFailedException(int i14) {
        super("Failed to verify whether passcode matches on device");
        this.responseStatus = i14;
    }

    public final int getResponseStatus() {
        return this.responseStatus;
    }
}
