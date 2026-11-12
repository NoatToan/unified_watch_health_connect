package com.garmin.feature.garminpay.providers.gpay.snowball.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/CardBalanceExceededException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "maxBalance", "", "message", "", "<init>", "(DLjava/lang/String;)V", "getMaxBalance", "()D", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CardBalanceExceededException extends Exception {
    public static final int $stable = 8;
    private final double maxBalance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBalanceExceededException(double d14, String str) {
        super(str);
        str.getClass();
        this.maxBalance = d14;
    }

    public final double getMaxBalance() {
        return this.maxBalance;
    }
}
