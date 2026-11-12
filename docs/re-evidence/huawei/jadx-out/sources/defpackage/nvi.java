package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.hwversionmgr.selfupdate.appupdate.UpdateBase;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class nvi {
    protected static void a(HwVersionManager hwVersionManager) {
        String strD = hwVersionManager != null ? hwVersionManager.d() : null;
        LogUtil.a("UpdateServiceUtil", "deleteUpdateApk: path = ", strD);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        File file = new File(strD);
        if (file.exists()) {
            try {
                if (file.delete()) {
                    LogUtil.a("UpdateServiceUtil", "deleteUpdateApk delete success");
                }
            } catch (Exception unused) {
                LogUtil.e("UpdateServiceUtil", "deleteUpdateApk: Exception");
            }
        }
    }

    public static boolean a(int i, HwVersionManager hwVersionManager) {
        String strD;
        LogUtil.a("UpdateServiceUtil", "enter isNewVersionFileExist() reportType:", Integer.valueOf(i));
        if ((i != 2 && i != 0) || hwVersionManager == null) {
            strD = "";
        } else {
            strD = hwVersionManager.d();
        }
        if ((i == 3 || i == 1) && hwVersionManager != null) {
            strD = hwVersionManager.g("");
        }
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e("UpdateServiceUtil", "isNewVersionFileExist() error, file path is empty...");
            return false;
        }
        boolean zExists = new File(strD).exists();
        LogUtil.a("UpdateServiceUtil", "isNewVersionFileExist: storagePath = ", strD, " isExist = ", Boolean.valueOf(zExists));
        return zExists;
    }

    public static boolean e(HwVersionManager hwVersionManager) throws Throwable {
        LogUtil.a("UpdateServiceUtil", "checkAppSha256 manager ", hwVersionManager);
        if (hwVersionManager == null) {
            return false;
        }
        num numVarB = nuw.b();
        if (numVarB == null) {
            ReleaseLogUtil.e("UpdateServiceUtil", "checkAppSha256 applicationInfo is null");
            a(hwVersionManager);
            return false;
        }
        String strH = numVarB.h();
        String strK = CommonUtil.k(hwVersionManager.d());
        if (strH == null) {
            ReleaseLogUtil.e("UpdateServiceUtil", "checkAppSha256 srcSha256 is null");
            a(hwVersionManager);
            return false;
        }
        if (!TextUtils.equals(strH, strK)) {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_UPDATE_FAILED_85070026.value(), -1);
            ReleaseLogUtil.e("UpdateServiceUtil", "checkAppSha256 verify srcSha256 failed");
            a(hwVersionManager);
            return false;
        }
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_UPDATE_FAILED_85070026.value(), CommonUtils.j("0"));
        return true;
    }

    public static boolean b(int i, String str) {
        String strG;
        LogUtil.a("UpdateServiceUtil", "enter isScaleNewVersionFileExist reportType:", Integer.valueOf(i));
        if (i != 5 && i != 4) {
            strG = "";
        } else {
            strG = nuu.a().g(str);
        }
        LogUtil.a("UpdateServiceUtil", "isScaleNewVersionFileExist(): strAw70StorePath = ", strG);
        if (TextUtils.isEmpty(strG)) {
            LogUtil.e("UpdateServiceUtil", "isScaleNewVersionFileExist() error, file path is empty...");
            return false;
        }
        boolean zExists = new File(strG).exists();
        LogUtil.a("UpdateServiceUtil", "isScaleNewVersionFileExist isExist = ", Boolean.valueOf(zExists));
        return zExists;
    }

    public static void a(Context context, HwVersionManager hwVersionManager, UpdateBase updateBase) {
        if (hwVersionManager == null) {
            LogUtil.a("UpdateServiceUtil", "install versionManager is null");
            return;
        }
        String strD = hwVersionManager.d();
        LogUtil.a("UpdateServiceUtil", "install: storagePath = ", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e("UpdateServiceUtil", "install() error, file path is empty...");
            a(40, 47);
        } else if (!e(context, strD)) {
            LogUtil.e("UpdateServiceUtil", "install() error, is not the same signatures...");
            a(22, 47);
        } else {
            a(27, 0);
            if (updateBase != null) {
                updateBase.e(strD, null);
            }
        }
    }

    public static void a(int i, int i2) {
        b(i, i2, "", "", 0);
    }

    public static void b(int i, int i2, String str, String str2, int i3) {
        LogUtil.a("UpdateServiceUtil", "broadcastCheckState: state = ", Integer.valueOf(i), ", result = ", Integer.valueOf(i2), ",content = ", str);
        Intent intent = new Intent("action_app_check_new_version_state");
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("state", i);
        intent.putExtra("result", i2);
        intent.putExtra("content", str);
        intent.putExtra("minAppCode", i3);
        if (TextUtils.equals(str2, "true")) {
            intent.putExtra("isForced", true);
        } else {
            intent.putExtra("isForced", false);
        }
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void c(int i, int i2, String str, String str2, int i3) {
        LogUtil.a("UpdateServiceUtil", "broadcastCheckStateApp: state = ", Integer.valueOf(i), ", result = ", Integer.valueOf(i2), ",content = ", str);
        Intent intent = new Intent("action_app_check_new_version_state");
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("state", i);
        intent.putExtra("result", i2);
        intent.putExtra("content", str);
        intent.putExtra("minAppCode", i3);
        intent.putExtra("key_check_type", "type_check_app");
        if (TextUtils.equals(str2, "true")) {
            intent.putExtra("isForced", true);
        } else {
            intent.putExtra("isForced", false);
        }
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void e() {
        Intent intent = new Intent("action_ota_check_new_version_state");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static boolean e(Context context, String str) {
        return CommonUtil.r(context, str);
    }

    public static void e(int i) {
        d(new d(i).c("").e(0).b("").d("").c(0));
    }

    public static void d(d dVar) {
        b(dVar, "");
    }

    public static void b(d dVar, String str) {
        if (dVar == null) {
            LogUtil.e("UpdateServiceUtil", "broadcastAutoCheckResult null info");
            return;
        }
        int i = dVar.j;
        String str2 = dVar.f43806a;
        int i2 = dVar.i;
        String str3 = dVar.f43807b;
        int i3 = dVar.d;
        LogUtil.a("UpdateServiceUtil", "broadcastAutoCheckResult: result=", Integer.valueOf(i), " name=", str2, " size=", Integer.valueOf(i2), " isForced=", str3, " appMinCode=", Integer.valueOf(i3), " changelog=", dVar.f43808c);
        Intent intent = new Intent("action_band_auto_check_new_version_result");
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("result", dVar.j);
        intent.putExtra("name", dVar.f43806a);
        intent.putExtra("size", dVar.i);
        intent.putExtra("changelog", dVar.f43808c);
        intent.putExtra("minAppCode", dVar.d);
        intent.putExtra("uniqueId", str);
        if (dVar.e != null) {
            intent.putExtra("productId", dVar.e);
        }
        if (TextUtils.equals(dVar.f43807b, "true")) {
            intent.putExtra("isForced", true);
        } else {
            intent.putExtra("isForced", false);
        }
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void a(String str, String str2, UpdateBase updateBase, AppCheckNewVersionHandler appCheckNewVersionHandler, String str3) {
        LogUtil.a("UpdateServiceUtil", "scaleBandCheckNewVersion version:", str2, ",productId:", CommonUtil.n(str), ",macAddress:", CommonUtil.n(str3));
        a(10, -1);
        if (appCheckNewVersionHandler != null) {
            appCheckNewVersionHandler.setIsScale(true);
            if (updateBase != null) {
                updateBase.d(str, str2, appCheckNewVersionHandler, str3);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f43806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f43807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f43808c;
        int d;
        String e;
        int i;
        int j;

        public d(int i) {
            this.j = i;
        }

        public d c(String str) {
            this.f43806a = str;
            return this;
        }

        public d e(int i) {
            this.i = i;
            return this;
        }

        public d b(String str) {
            this.f43808c = str;
            return this;
        }

        public d d(String str) {
            this.f43807b = str;
            return this;
        }

        public d c(int i) {
            this.d = i;
            return this;
        }

        public d e(String str) {
            this.e = str;
            return this;
        }
    }
}
