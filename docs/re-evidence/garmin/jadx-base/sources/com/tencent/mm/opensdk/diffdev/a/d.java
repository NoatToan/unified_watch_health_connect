package com.tencent.mm.opensdk.diffdev.a;

import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(WalletConstants.ERROR_CODE_INVALID_PARAMETERS),
    UUID_CONFIRM(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f54840a;

    d(int i14) {
        this.f54840a = i14;
    }

    public int a() {
        return this.f54840a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f54840a;
    }
}
