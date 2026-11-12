package com.mipay.sdk;

import android.content.Context;
import com.mipay.sdk.app.AccountProviderHolder;
import com.mipay.sdk.util.MipayWebSdkUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MipayFactory {
    private static final String ACTION_MIPAY_COUNTER = "com.xiaomi.action.MIPAY_PAY_ORDER";
    private static final String ACTION_MIPAY_INSTALLMENT = "com.xiaomi.action.MIPAY_CREDIT_INSTALLMENT";
    private static final String PACKAGE_MIPAY_WALLET = "com.mipay.wallet";
    private static final String TAG = "MipayWeb";

    public static IMipay get(Context context) {
        return get(context, null);
    }

    public static ICreditInstallment getInstallment(Context context) {
        return getInstallment(context, null);
    }

    public static void onAccountChanged() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MipayWebImpl.URL_ONLINE);
        arrayList.add(MipayWebImpl.URL_STAGING);
        MipayWebSdkUtils.clearAllCookies(arrayList);
    }

    public static void release() {
        AccountProviderHolder.put(null);
    }

    public static IMipay get(Context context, IMipayAccountProvider iMipayAccountProvider) {
        return get(context, iMipayAccountProvider, false);
    }

    public static ICreditInstallment getInstallment(Context context, IMipayAccountProvider iMipayAccountProvider) {
        return getInstallment(context, iMipayAccountProvider, false);
    }

    public static IMipay get(Context context, IMipayAccountProvider iMipayAccountProvider, boolean z) {
        AccountProviderHolder.put(iMipayAccountProvider);
        StringBuilder sb = new StringBuilder();
        sb.append("get accountProvider is null: ");
        boolean z2 = false;
        sb.append(iMipayAccountProvider == null);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(", useH5: ");
        sb.append(z);
        if (z) {
            return new MipayWebImpl();
        }
        if (iMipayAccountProvider != null && iMipayAccountProvider.isUseSystem()) {
            z2 = true;
        }
        boolean zIsNativeCounterAvailable = SdkUtils.isNativeCounterAvailable(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("launch counter, native counter available: ");
        sb2.append(zIsNativeCounterAvailable);
        sb2.append(", useSystem param: ");
        sb2.append(z2);
        if (!zIsNativeCounterAvailable || !z2) {
            return new MipayWebImpl();
        }
        if (context == null) {
            return new MipayWebImpl();
        }
        return new MipayAppImpl(context);
    }

    public static ICreditInstallment getInstallment(Context context, IMipayAccountProvider iMipayAccountProvider, boolean z) {
        AccountProviderHolder.put(iMipayAccountProvider);
        StringBuilder sb = new StringBuilder();
        sb.append("getInstallment accountProvider is null: ");
        boolean z2 = false;
        sb.append(iMipayAccountProvider == null);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(", useH5: ");
        sb.append(z);
        if (z) {
            return new InstallmentWebImpl();
        }
        if (iMipayAccountProvider != null && iMipayAccountProvider.isUseSystem()) {
            z2 = true;
        }
        boolean zIsNativeInstallmentAvailable = SdkUtils.isNativeInstallmentAvailable(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("launch installment, native credit installment available: ");
        sb2.append(zIsNativeInstallmentAvailable);
        sb2.append(", useSystem param: ");
        sb2.append(z2);
        if (!zIsNativeInstallmentAvailable || !z2) {
            return new InstallmentWebImpl();
        }
        if (context == null) {
            return new InstallmentWebImpl();
        }
        return new InstallmentAppImpl(context);
    }
}
