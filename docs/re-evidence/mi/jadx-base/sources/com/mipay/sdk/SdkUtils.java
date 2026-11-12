package com.mipay.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public class SdkUtils {
    protected static final String ACTION_MIPAY_COUNTER = "com.xiaomi.action.MIPAY_PAY_ORDER";
    protected static final String ACTION_MIPAY_COUNTER_SERVICE = "com.xiaomi.action.MIPAY";
    protected static final String ACTION_MIPAY_INSTALLMENT = "com.xiaomi.action.MIPAY_CREDIT_INSTALLMENT";
    protected static final String ACTION_MIPAY_WALLET = "com.xiaomi.action.VIEW_MIPAY_WALLET";
    public static final String MODULE_TAG = "MipaySdk";
    public static final String PACKAGE_AIRSTAR_FINANCIAL = "com.xiaomi.jr";
    public static final String PACKAGE_MIPAY_WALLET = "com.mipay.wallet";
    public static final String PACKAGE_MIPAY_WALLET_TV = "com.mipay.wallet.tv";

    public static boolean canLaunchIntent(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 0) != null;
    }

    public static Intent getCounterIntent() {
        Intent mipayCounterIntent = getMipayCounterIntent();
        mipayCounterIntent.setPackage("com.mipay.wallet");
        return mipayCounterIntent;
    }

    private static Intent getCreditInstallmentIntent() {
        return new Intent(ACTION_MIPAY_INSTALLMENT);
    }

    public static Intent getFinancialCounterIntent() {
        Intent mipayCounterIntent = getMipayCounterIntent();
        mipayCounterIntent.setPackage(PACKAGE_AIRSTAR_FINANCIAL);
        return mipayCounterIntent;
    }

    public static Intent getFinancialInstallmentIntent() {
        Intent installmentIntent = getInstallmentIntent();
        installmentIntent.setPackage(PACKAGE_AIRSTAR_FINANCIAL);
        return installmentIntent;
    }

    public static Intent getInstallmentIntent() {
        Intent creditInstallmentIntent = getCreditInstallmentIntent();
        creditInstallmentIntent.setPackage("com.mipay.wallet");
        return creditInstallmentIntent;
    }

    private static Intent getMipayCounterIntent() {
        return new Intent(ACTION_MIPAY_COUNTER);
    }

    public static Intent getTVCounterIntent() {
        Intent mipayCounterIntent = getMipayCounterIntent();
        mipayCounterIntent.setPackage(PACKAGE_MIPAY_WALLET_TV);
        return mipayCounterIntent;
    }

    public static boolean isFinancialCounterAvailable(Context context) {
        return canLaunchIntent(context, getFinancialCounterIntent());
    }

    public static boolean isFinancialInstallmentAvailable(Context context) {
        return canLaunchIntent(context, getFinancialInstallmentIntent());
    }

    public static boolean isMipayWalletInstalled(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.mipay.wallet", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isMipayWalletTVInstalled(Context context) {
        try {
            context.getPackageManager().getPackageInfo(PACKAGE_MIPAY_WALLET_TV, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isNativeCounterAvailable(Context context) {
        return canLaunchIntent(context, getCounterIntent());
    }

    public static boolean isNativeInstallmentAvailable(Context context) {
        return canLaunchIntent(context, getInstallmentIntent());
    }

    public static boolean isTVCounterAvailable(Context context) {
        return canLaunchIntent(context, getTVCounterIntent());
    }
}
