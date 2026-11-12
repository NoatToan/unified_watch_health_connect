package com.mipay.sdk.app;

import com.mipay.sdk.IMipayAccountProvider;

/* JADX INFO: loaded from: classes.dex */
public class AccountProviderHolder {
    private static IMipayAccountProvider sInstance;

    public static IMipayAccountProvider get() {
        return sInstance;
    }

    public static void put(IMipayAccountProvider iMipayAccountProvider) {
        sInstance = iMipayAccountProvider;
    }
}
