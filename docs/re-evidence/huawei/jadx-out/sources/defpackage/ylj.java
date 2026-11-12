package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.p2p.IdentityInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ylj {
    private static StringBuilder a(int i, int i2, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        StringBuilder sb = new StringBuilder();
        String strD = eeq.d(1);
        String strD2 = eeq.d(i2);
        String strD3 = eeq.d(strD2.length() / 2);
        sb.append(strD);
        sb.append(strD3);
        sb.append(strD2);
        String strD4 = eeq.d(2);
        String strE = eeq.e(i);
        String strD5 = eeq.d(strE.length() / 2);
        sb.append(strD4);
        sb.append(strD5);
        sb.append(strE);
        String strD6 = eeq.d(3);
        String strA = eeq.a(identityInfo.getPackageName());
        String strB = eeq.b(strA.length() / 2);
        sb.append(strD6);
        sb.append(strB);
        sb.append(strA);
        String strD7 = eeq.d(4);
        String strA2 = eeq.a(identityInfo2.getPackageName());
        String strB2 = eeq.b(strA2.length() / 2);
        sb.append(strD7);
        sb.append(strB2);
        sb.append(strA2);
        LogUtil.d("WearEngine_P2pCommandUtil", "getGeneralTlv is:", sb.toString());
        if (i2 == 2) {
            String strD8 = eeq.d(5);
            String strA3 = eeq.a(identityInfo.getFingerPrint());
            String strB3 = eeq.b(strA3.length() / 2);
            sb.append(strD8);
            sb.append(strB3);
            sb.append(strA3);
            String strD9 = eeq.d(6);
            String strA4 = eeq.a(identityInfo2.getFingerPrint());
            String strB4 = eeq.b(strA4.length() / 2);
            sb.append(strD9);
            sb.append(strB4);
            sb.append(strA4);
        }
        return sb;
    }

    private static String c(int i, int i2, IdentityInfo identityInfo, IdentityInfo identityInfo2, byte[] bArr) {
        StringBuilder sbA = a(i, i2, identityInfo, identityInfo2);
        if (bArr != null && bArr.length > 0) {
            String strD = eeq.d(7);
            String strB = eeq.b(bArr.length);
            String strE = eeq.e(bArr);
            sbA.append(strD);
            sbA.append(strB);
            sbA.append(strE);
            LogUtil.a("WearEngine_P2pCommandUtil", "getCommandTlv messageBody is:", sbA.toString());
        }
        return sbA.toString();
    }

    private static String b(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, int i2) {
        return a(i, identityInfo, identityInfo2, eeq.c(i2));
    }

    private static String c(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, long j) {
        return a(i, identityInfo, identityInfo2, eeq.e(eeq.e(j)));
    }

    private static String a(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, String str) {
        StringBuilder sbA = a(i, 3, identityInfo, identityInfo2);
        String strD = eeq.d(8);
        String strD2 = eeq.d(str.length() / 2);
        sbA.append(strD);
        sbA.append(strD2);
        sbA.append(str);
        LogUtil.d("WearEngine_P2pCommandUtil", "getResponseTlv result is:", sbA.toString());
        return sbA.toString();
    }

    public static int e(IdentityInfo identityInfo, IdentityInfo identityInfo2, yjl yjlVar, int i) {
        if (identityInfo == null || TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo.getFingerPrint())) {
            LogUtil.e("WearEngine_P2pCommandUtil", "handleStarLogic srcInfo is empty");
            return 203;
        }
        if (identityInfo2 == null || TextUtils.isEmpty(identityInfo2.getPackageName()) || TextUtils.isEmpty(identityInfo2.getFingerPrint())) {
            LogUtil.e("WearEngine_P2pCommandUtil", "handleStarLogic destInfo is empty");
            return 203;
        }
        if (yjlVar == null) {
            LogUtil.e("WearEngine_P2pCommandUtil", "handleStarLogic startPayload is empty");
            return 203;
        }
        if (yjlVar.e() != 5 || yjlVar.b() == null) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "parsePingPayload payload is invalid");
            return 203;
        }
        yjh yjhVarB = yjlVar.b();
        if (yjhVarB.e() != 3) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "handleStarLogic entryType is not support");
            return a.D;
        }
        if (TextUtils.isEmpty(yjhVarB.a())) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "handleStarLogic startOptions is empty");
            return 203;
        }
        if (i != 205) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "handleStarLogic target app is not installed");
            return i;
        }
        if (a(identityInfo2) && b(identityInfo, identityInfo2)) {
            return b(identityInfo2, yjhVarB);
        }
        return 203;
    }

    private static int b(IdentityInfo identityInfo, yjh yjhVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(identityInfo.getPackageName(), yjhVar.a());
            ComponentName componentNameStartForegroundService = BaseApplication.getContext().startForegroundService(intent);
            ReleaseLogUtil.d("WearEngine_P2pCommandUtil", "startFgService result: ", Boolean.valueOf(componentNameStartForegroundService != null));
            return componentNameStartForegroundService == null ? 201 : 202;
        } catch (Exception e) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "startFgService Exception: ", ExceptionUtils.c(e));
            return 201;
        }
    }

    private static boolean a(IdentityInfo identityInfo) {
        String strA = HsfSignValidator.a(BaseApplication.getContext(), identityInfo.getPackageName());
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "Failed to obtain the fp of the app to be started.");
            return false;
        }
        if (strA.equalsIgnoreCase(identityInfo.getFingerPrint())) {
            return true;
        }
        ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "fp is not equal");
        return false;
    }

    private static boolean b(IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        List<IdentityInfo> listA = a(BaseApplication.getContext(), identityInfo2.getPackageName());
        String packageName = identityInfo.getPackageName();
        if (coq.d(listA)) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "allowRemoteAppList is null for：", cpl.e(packageName));
            return false;
        }
        for (IdentityInfo identityInfo3 : listA) {
            if (identityInfo3 != null && identityInfo3.getPackageName().equals(packageName) && identityInfo3.getFingerPrint().equals(identityInfo.getFingerPrint())) {
                return true;
            }
        }
        ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "allowRemoteAppList is not exist watch app");
        return false;
    }

    private static List<IdentityInfo> a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.e("WearEngine_P2pCommandUtil", "getAppInfo pm is null");
            return null;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return c(applicationInfo.metaData.getString("WearEngineRemoteAppInfoList"));
            }
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "getAppInfo failed");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "getAppInfo exception");
            return null;
        }
    }

    private static List<IdentityInfo> c(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "app metaData is empty");
            return arrayList;
        }
        String[] strArrSplit = str.split(",\\s*");
        if (strArrSplit.length > 65535) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "app metaData is too large");
            return arrayList;
        }
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("#", 2);
            if (strArrSplit2.length == 2) {
                arrayList.add(new IdentityInfo(strArrSplit2[0].trim(), strArrSplit2[1].trim()));
            }
        }
        return arrayList;
    }

    public static DeviceCommand c(int i, int i2, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("WearEngine_P2pCommandUtil", "DeviceCommand srcPkgName or destPkgName is null");
            return null;
        }
        return e(eeq.c(c(i, i2, new IdentityInfo(str, ""), new IdentityInfo(str2, ""), null)));
    }

    public static DeviceCommand b(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, byte[] bArr) {
        if (identityInfo == null || identityInfo2 == null) {
            LogUtil.j("WearEngine_P2pCommandUtil", "getSendCommand pkgInfo is null");
            return null;
        }
        if (TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            LogUtil.j("WearEngine_P2pCommandUtil", "getSendCommand srcPkgName or destPkgName is null");
            return null;
        }
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("WearEngine_P2pCommandUtil", "getSendCommand data is valid");
            return null;
        }
        return e(eeq.c(c(i, 2, identityInfo, identityInfo2, bArr)));
    }

    public static DeviceCommand a(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, int i2) {
        if (c(identityInfo, identityInfo2)) {
            return null;
        }
        String strB = b(i, identityInfo, identityInfo2, i2);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("WearEngine_P2pCommandUtil", "getCommonResponseCmd responseTlv is null");
            return null;
        }
        byte[] bArrC = eeq.c(strB);
        if (bArrC == null) {
            LogUtil.e("WearEngine_P2pCommandUtil", "getCommonResponseCmd command is null");
            return null;
        }
        return e(bArrC);
    }

    public static DeviceCommand e(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, long j) {
        if (c(identityInfo, identityInfo2)) {
            return null;
        }
        String strC = c(i, identityInfo, identityInfo2, j);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.e("WearEngine_P2pCommandUtil", "getAppVersionResponseCmd responseTlv is null");
            return null;
        }
        byte[] bArrC = eeq.c(strC);
        if (bArrC == null) {
            LogUtil.e("WearEngine_P2pCommandUtil", "getAppVersionResponseCmd command is null");
            return null;
        }
        return e(bArrC);
    }

    private static boolean c(IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        if (identityInfo == null || identityInfo2 == null) {
            LogUtil.j("WearEngine_P2pCommandUtil", "srcInfo or destInfo is null");
            return true;
        }
        if (!TextUtils.isEmpty(identityInfo.getPackageName()) && !TextUtils.isEmpty(identityInfo2.getPackageName())) {
            return false;
        }
        LogUtil.j("WearEngine_P2pCommandUtil", "srcPkgName or destPkgName is null");
        return true;
    }

    private static DeviceCommand e(byte[] bArr) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(52);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataLength(bArr.length);
        deviceCommand.setDataContent(bArr);
        return deviceCommand;
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 255;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 204;
        }
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null) {
            LogUtil.e("WearEngine_P2pCommandUtil", "getPackageManager is null");
            return 204;
        }
        try {
            return packageManager.getPackageInfo(str, 16384) != null ? 205 : 204;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("WearEngine_P2pCommandUtil", "package that are installed is null");
            return 204;
        }
    }

    public static void e(String str) {
        LogUtil.a("WearEngine_P2pCommandUtil", "begin to send broadcast to " + str);
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.huawei.wearengine.ping");
        intent.addFlags(536870912);
        BaseApplication.getContext().sendBroadcast(intent, "com.huawei.wearengine.permission.DEFAULT");
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WearEngine_P2pCommandUtil", "targetAppPkgName is empty in getAppVersion.");
            return -1L;
        }
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null) {
            LogUtil.e("WearEngine_P2pCommandUtil", "pm is null in getAppVersion.");
            return -1L;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "AppNotFound in getAppVersion.");
                return -1L;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("WearEngine_P2pCommandUtil", "NameNotFound in getAppVersion.");
            return -1L;
        }
    }
}
