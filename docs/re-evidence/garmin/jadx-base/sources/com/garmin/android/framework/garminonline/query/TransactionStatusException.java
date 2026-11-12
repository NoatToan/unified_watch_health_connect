package com.garmin.android.framework.garminonline.query;

import v.e0;

/* JADX INFO: loaded from: classes8.dex */
public class TransactionStatusException extends QueryException {
    private final int mTransactionStatus;

    public TransactionStatusException(int i14) {
        super(e0.f(i14, "Bad transaction status [", "]"), getErrorCode(i14));
        this.mTransactionStatus = i14;
    }

    public static int getErrorCode(int i14) {
        if (i14 == 10) {
            return 103;
        }
        if (i14 == 20) {
            return 102;
        }
        if (i14 != 50) {
            return i14 != 999 ? 100 : 105;
        }
        return 104;
    }

    public int getTransactionStatus() {
        return this.mTransactionStatus;
    }
}
