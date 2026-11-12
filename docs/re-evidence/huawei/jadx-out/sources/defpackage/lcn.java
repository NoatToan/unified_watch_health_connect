package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthkit.context.OutOfBandData;
import com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class lcn {
    private static int a(OutOfBandData outOfBandData, Context context, int i, boolean z) {
        LogUtil.a("AppAuthUtil", "enter h5 engine");
        if (!(outOfBandData instanceof H5ProAppInfo)) {
            ReleaseLogUtil.a("HiH_AppAuthUtil", "invalid app type");
            return 2;
        }
        H5ProAppInfo h5ProAppInfo = (H5ProAppInfo) outOfBandData;
        boolean zJ = SharedPreferenceManager.j(context, "THIRD_H5_KIT_AUTH_KEY");
        if (dmz.e() && !zJ) {
            ReleaseLogUtil.d("HiH_AppAuthUtil", "is beta, test or third version and close auth");
            return 0;
        }
        if (ddv.b().isSuperTrustedMiniProgram(h5ProAppInfo.getPkgName(), h5ProAppInfo.getCertPrint())) {
            ReleaseLogUtil.d("HiH_AppAuthUtil", "default allowed h5 app");
            return 0;
        }
        if ((i == 101204 || i == 101201) && lep.a(h5ProAppInfo)) {
            ReleaseLogUtil.d("HiH_AppAuthUtil", "device control permission allows the trustlist to be used");
            return 0;
        }
        int iC = ldd.e(context).c(h5ProAppInfo.getAccessToken(), h5ProAppInfo.getAppId(), i, z);
        ReleaseLogUtil.d("HiH_AppAuthUtil", "validateH5AppResult: sampleType = ", Integer.valueOf(i), ", isRead = ", Boolean.valueOf(z), ", auth result = ", Integer.valueOf(iC));
        if (iC == 0) {
            return 8;
        }
        return iC;
    }

    public static int e(Context context, OutOfBandData outOfBandData, AppStatusHelper appStatusHelper, int i, int i2) throws RemoteException {
        if (lep.d(context) || lep.e(context)) {
            return a(context, outOfBandData, appStatusHelper, i, i2);
        }
        if (lep.a(context)) {
            return a(context, outOfBandData, i, i2);
        }
        ReleaseLogUtil.a("HiH_AppAuthUtil", "checkAuthPermission, unmatched app type, param invalid");
        return 2;
    }

    private static int a(Context context, OutOfBandData outOfBandData, AppStatusHelper appStatusHelper, int i, int i2) {
        int iA = a(outOfBandData, context, i, i2 == 1);
        if (iA == 8) {
            return b(outOfBandData, appStatusHelper, i, i2);
        }
        ReleaseLogUtil.d("HiH_AppAuthUtil", "H5 auth result: ", Integer.valueOf(iA));
        return iA;
    }

    public static int a(Context context, OutOfBandData outOfBandData, int i, int i2) throws RemoteException {
        return new lbk(context, i, i2).e(outOfBandData);
    }

    public static Set<String> d() {
        HashSet hashSet = new HashSet();
        hashSet.add("deleteSample");
        hashSet.add("deleteSamples");
        hashSet.add("saveSample");
        hashSet.add("saveSamples");
        hashSet.add("sendDeviceCommand");
        hashSet.add("getSwitch");
        hashSet.add("pushMsgToWearable");
        hashSet.add("writeToWearable");
        hashSet.add("sendDeviceControlinstruction");
        return hashSet;
    }

    private static int b(OutOfBandData outOfBandData, AppStatusHelper appStatusHelper, int i, int i2) {
        if (!(outOfBandData instanceof H5ProAppInfo)) {
            ReleaseLogUtil.e("HiH_AppAuthUtil", "invalid app type");
            return 2;
        }
        return appStatusHelper.a(((H5ProAppInfo) outOfBandData).getAppId(), i2, i);
    }

    public static boolean b(OutOfBandData outOfBandData, Context context, AppStatusHelper appStatusHelper) {
        if (lep.d(context) || lep.e(context)) {
            return a(context, outOfBandData, appStatusHelper, 101201, 1) == 0;
        }
        return lep.a(context);
    }
}
