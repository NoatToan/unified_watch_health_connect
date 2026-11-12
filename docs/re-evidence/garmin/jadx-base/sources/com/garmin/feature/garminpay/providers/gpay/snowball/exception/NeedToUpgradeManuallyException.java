package com.garmin.feature.garminpay.providers.gpay.snowball.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/NeedToUpgradeManuallyException;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/ProviderErrorCodeException;", "url", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NeedToUpgradeManuallyException extends ProviderErrorCodeException {
    public static final int $stable = 8;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedToUpgradeManuallyException(String str, String str2) {
        super("02-2101", str2);
        str.getClass();
        str2.getClass();
        this.url = str;
    }

    public final String getUrl() {
        return this.url;
    }
}
