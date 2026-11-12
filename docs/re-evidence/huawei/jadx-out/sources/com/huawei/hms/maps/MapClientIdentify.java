package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.internal.ICreator;
import com.huawei.hms.maps.internal.IMapClientIdentity;
import com.huawei.hms.maps.utils.AgcCoreUtil;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class MapClientIdentify {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f14126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f14127c;
    private static String d;
    private static long e;
    private static String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IMapClientIdentity f14128a;

    public boolean regestIdentity(Context context, ICreator iCreator) {
        LogM.d("MapClientIdentify", "sdk start regestIdentity to provider ");
        if (this.f14128a != null) {
            LogM.d("MapClientIdentify", "already invoked.");
            return true;
        }
        if (iCreator == null) {
            LogM.d("MapClientIdentify", "creator is null.");
            return false;
        }
        String packageName = context.getApplicationContext().getPackageName();
        String appName = getAppName(context, packageName);
        if ("".equals(d)) {
            LogM.e("MapClientIdentify", "AppId is null. Please check if agconnect-services.json file is is added in app project.");
        }
        maq maqVarD = new maq().b(d).f(packageName).c(appName).e(getInstalledAppHash(context, packageName)).a(f14127c).a(e).g(getPackageCode(context)).d(f);
        try {
            IMapClientIdentity iMapClientIdentityNewMapClientIdentity = iCreator.newMapClientIdentity(ObjectWrapper.wrap(com.huawei.hms.maps.internal.mab.e(context)));
            this.f14128a = iMapClientIdentityNewMapClientIdentity;
            iMapClientIdentityNewMapClientIdentity.regestToProvierIdentity(maqVarD);
            LogM.d("MapClientIdentify", "Identity param regestToProvier success");
            return true;
        } catch (RemoteException unused) {
            LogM.e("MapClientIdentify", "regestIdentity RemoteException");
            return false;
        }
    }

    public static void setMapAuthStartTime(long j) {
        e = j;
    }

    public static void setCountryCode(String str) {
        f = str;
    }

    public static void setAppId(String str) {
        d = str;
    }

    public static void setAppContext(Context context) {
        f14126b = context;
    }

    public static void setApiKey(String str) {
        f14127c = str;
    }

    public static void initApiKey(Context context) {
        if (TextUtils.isEmpty(f14127c)) {
            f14127c = AgcCoreUtil.getString(context, AgConnectInfo.AgConnectKey.API_KEY);
        }
    }

    public static String getPackageCode(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            LogM.e("MapClientIdentify", "getPackageCode failed NameNotFoundException ");
            str = "";
        }
        LogM.d("MapClientIdentify", "app version = " + str);
        return String.valueOf(str);
    }

    public static long getMapAuthStartTime() {
        return e;
    }

    public static String getInstalledAppHash(Context context, String str) {
        byte[] installedAPPSignature = getInstalledAPPSignature(context, str);
        return (installedAPPSignature == null || installedAPPSignature.length <= 0) ? "" : b(installedAPPSignature);
    }

    public static byte[] getInstalledAPPSignature(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            LogM.e("HiPkgSignManager", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            LogM.e("HiPkgSignManager", "PackageManager.NameNotFoundException : ");
        }
        return new byte[0];
    }

    public static String getCountryCode() {
        return f;
    }

    public static String getAppName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            LogM.e("MapClientIdentify", "In getAppName, Failed to get app name.");
            return "";
        }
    }

    public static String getAppId() {
        return d;
    }

    public static Context getAppContext() {
        return f14126b;
    }

    public static String getApiKey() {
        return f14127c;
    }

    private static String b(byte[] bArr) {
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException unused) {
            LogM.e("MapClientIdentify", "NoSuchAlgorithmException");
            return "";
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & 255;
            stringBuffer.append(i2 < 16 ? "0" + Integer.toHexString(bArr[i] & 255) : Integer.toHexString(i2));
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }
}
