package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dxn {
    public static void e(String str, String str2, Context context, String str3) {
        LogUtil.a("OtaUpdateUtil", "setDeviceCurrentVersion,version：", str2, ",tag:", str);
        if (context == null) {
            LogUtil.j("OtaUpdateUtil", "setDeviceCurrentVersion context is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_current_version" + str3, str2, storageParams);
    }

    public static void b(String str, String str2, Context context, String str3) {
        LogUtil.a("OtaUpdateUtil", "setWeightDeviceNewVersion,version：", str2, ",tag:", str);
        if (context == null) {
            LogUtil.j("OtaUpdateUtil", "setWeightDeviceNewVersion context is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_new_version" + str3, str2, storageParams);
    }

    public static boolean c(Context context, String str) {
        String strD = d(context, str);
        LogUtil.a("OtaUpdateUtil", "haveWeightDeviceNewVersion currentVersion: ", strD);
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        String strA = a(context, str);
        LogUtil.a("OtaUpdateUtil", "haveWeightDeviceNewVersion newVersion: ", strA);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return !strD.equals(strA);
    }

    public static String d(Context context, String str) {
        if (context == null) {
            LogUtil.j("OtaUpdateUtil", "getDeviceCurrentVersion context is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_current_version" + str);
        LogUtil.a("OtaUpdateUtil", "getDeviceCurrentVersion,version :", strE);
        return strE;
    }

    public static String a(Context context, String str) {
        if (context == null) {
            LogUtil.j("OtaUpdateUtil", "getWeightDeviceNewVersion context is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_new_version" + str);
        LogUtil.a("OtaUpdateUtil", "getWeightDeviceNewVersion,version :", strE);
        return strE;
    }

    public static void b(Context context, boolean z, String str) {
        String str2 = "is_new_honor" + nio.e(str);
        LogUtil.a("OtaUpdateUtil", "setNewWeightHonor,isNewHonor ", Boolean.valueOf(z), " newHonorKey ", str2);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), str2, "" + z, storageParams);
    }

    public static boolean e(Context context, String str) {
        String str2 = "is_new_honor" + nio.e(str);
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), str2);
        boolean z = Boolean.parseBoolean(strE);
        LogUtil.a("OtaUpdateUtil", "isNewWeightHonor,isNewHonor ", strE, " newHonorKey ", str2);
        return z;
    }

    public static void c(String str, Context context, final eby ebyVar, String str2) {
        if (ebyVar == null) {
            LogUtil.j(str, "getDeviceOtaStatus mWiFiDevice is null");
            return;
        }
        if (dyk.a().b(ebyVar, str2)) {
            LogUtil.j(str, "getDeviceOtaStatus is sub devices");
            return;
        }
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        wifiDeviceServiceInfoReq.setDevId(ebyVar.a().c());
        wifiDeviceServiceInfoReq.setSid("devOtaInfo");
        lqo.b(context).d(wifiDeviceServiceInfoReq, new ICloudOperationResult() { // from class: dxo
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str3, boolean z) {
                dxn.d(ebyVar, (WifiDeviceServiceInfoRsp) obj, str3, z);
            }
        });
    }

    static /* synthetic */ void d(eby ebyVar, WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str, boolean z) {
        if (z) {
            c(wifiDeviceServiceInfoRsp, ebyVar);
        } else {
            dyg.d(false, "OtaUpdateUtil", "getDeviceOtaStatus isSuccess:", Boolean.valueOf(z), "|response:", wifiDeviceServiceInfoRsp);
        }
    }

    private static void c(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, eby ebyVar) {
        Iterator<DeviceServiceInfo> it;
        boolean z = false;
        if (wifiDeviceServiceInfoRsp == null || !njy.b(wifiDeviceServiceInfoRsp.getDeviceServiceInfo())) {
            dyg.d(false, "OtaUpdateUtil", "getDeviceOtaStatus response is empty");
            return;
        }
        if (ebyVar == null || ebyVar.a() == null) {
            LogUtil.j("OtaUpdateUtil", "setStatusInfo mWiFiDevice is null or deviceInfo is null");
            return;
        }
        Iterator<DeviceServiceInfo> it2 = wifiDeviceServiceInfoRsp.getDeviceServiceInfo().iterator();
        while (it2.hasNext()) {
            DeviceServiceInfo next = it2.next();
            dyg.a(z, "OtaUpdateUtil", "getDeviceOtaStatus device service info:", wifiDeviceServiceInfoRsp.getDeviceServiceInfo());
            Map<String, String> data = next.getData();
            Map<String, String> mapA = new DeviceCloudSharePreferencesManager(BaseApplication.getContext()).a(ebyVar.a().c());
            if (data == null || mapA == null) {
                it = it2;
                LogUtil.j("OtaUpdateUtil", "serviceInfoCloud = null or serviceInfoSp = null");
            } else {
                String str = data.get("fwCurVer");
                String str2 = data.get("fwNewVer");
                String str3 = mapA.get("fwCurVer");
                String str4 = mapA.get("fwNewVer");
                it = it2;
                LogUtil.a("OtaUpdateUtil", "curVersionCloud=", str, ", newVersionCloud=", str2, ", curVersionSp=", str3, ", newVersionSp=", str4);
                if (CommonUtil.e(str2, str3) < 0) {
                    LogUtil.j("OtaUpdateUtil", "newVersionCloud is smaller than newVersionSp, do not save");
                } else {
                    if (CommonUtil.e(str, str2) == 0) {
                        data.put("fwCurVer", str3);
                        data.put("fwNewVer", str4);
                    }
                    data.put("key_is_exist_new_version", mapA.get("key_is_exist_new_version"));
                    eas.b().a(ebyVar.e(), data);
                }
            }
            it2 = it;
            z = false;
        }
    }
}
