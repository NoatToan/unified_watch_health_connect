package com.mipay.sdk.extra;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.mipay.sdk.SdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class ExtraUtils extends SdkUtils {
    private static final String TAG = "MipayExtra_Utils";

    public static boolean isBindCardAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mipay://walletapp?id=mipay.bindCard"));
        intent.setPackage("com.mipay.wallet");
        try {
            return SdkUtils.canLaunchIntent(context, intent) && context.getPackageManager().getPackageInfo("com.mipay.wallet", 0).versionCode >= 18008;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isVerifyIdentityAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mipay://walletapp?id=mipay.partnerVerifyIdentity"));
        intent.setPackage("com.mipay.wallet");
        try {
            return SdkUtils.canLaunchIntent(context, intent) && context.getPackageManager().getPackageInfo("com.mipay.wallet", 0).versionCode >= 1001007;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
