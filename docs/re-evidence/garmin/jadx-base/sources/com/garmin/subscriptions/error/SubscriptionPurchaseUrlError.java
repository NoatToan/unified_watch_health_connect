package com.garmin.subscriptions.error;

import ay2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/subscriptions/error/SubscriptionPurchaseUrlError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lay2/a;", "apiErrorType", "", "message", "<init>", "(Lay2/a;Ljava/lang/String;)V", "Lay2/a;", "getApiErrorType", "()Lay2/a;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubscriptionPurchaseUrlError extends Exception {
    public static final int $stable = 8;
    private final a apiErrorType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionPurchaseUrlError(a aVar, String str) {
        super(str);
        aVar.getClass();
        this.apiErrorType = aVar;
    }

    public final a getApiErrorType() {
        return this.apiErrorType;
    }

    public /* synthetic */ SubscriptionPurchaseUrlError(a aVar, String str, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : str);
    }
}
