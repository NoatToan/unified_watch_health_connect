package com.garmin.feature.garminpay.providers.felica.exception.server;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/exception/server/NeedDeleteException;", "Lcom/garmin/feature/garminpay/providers/felica/exception/server/FNValidateException;", "resultCode", "", "resultMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NeedDeleteException extends FNValidateException {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedDeleteException(String str, String str2) {
        super("SP’s Business Reason Error. (Need to execute “Delete a card” use case.)", str, str2);
        str.getClass();
    }
}
