package com.garmin.feature.garminpay.providers.gpay.snowball.exception;

import com.airbnb.lottie.animation.keyframe.a;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/CardRefundFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cardName", "", "userId", "refundId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardName", "()Ljava/lang/String;", "getUserId", "getRefundId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CardRefundFailedException extends Exception {
    public static final int $stable = 8;
    private final String cardName;
    private final String refundId;
    private final String userId;

    public CardRefundFailedException(String str, String str2, String str3) {
        a.y(str, str2, str3);
        this.cardName = str;
        this.userId = str2;
        this.refundId = str3;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getRefundId() {
        return this.refundId;
    }

    public final String getUserId() {
        return this.userId;
    }
}
