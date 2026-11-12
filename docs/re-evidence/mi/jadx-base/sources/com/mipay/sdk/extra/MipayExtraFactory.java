package com.mipay.sdk.extra;

import com.mipay.sdk.IMipayAccountProvider;
import com.mipay.sdk.app.AccountProviderHolder;

/* JADX INFO: loaded from: classes.dex */
public class MipayExtraFactory {
    public static final int MIPAY_EXTRA_REQUEST_CODE = 10000;
    public static final int MIPAY_EXTRA_REQUEST_CODE_PARTNER_IDENTITY_VERIFY = 10001;
    private static final String TAG = "MipayExtra_Factory";

    private MipayExtraFactory() {
    }

    public static IMipayExtra get(IMipayAccountProvider iMipayAccountProvider) {
        boolean z = iMipayAccountProvider != null && iMipayAccountProvider.isUseSystem();
        StringBuilder sb = new StringBuilder();
        sb.append("get mipay extra, accountProvider is null: ");
        sb.append(iMipayAccountProvider == null);
        sb.append(", canUseSystemAccount: ");
        sb.append(z);
        AccountProviderHolder.put(iMipayAccountProvider);
        return z ? new ExtraProxy() : new MipayExtraWebImpl();
    }

    public static void release() {
        AccountProviderHolder.put(null);
    }
}
