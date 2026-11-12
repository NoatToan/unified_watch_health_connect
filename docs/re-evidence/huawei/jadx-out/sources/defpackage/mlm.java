package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.utils.Constants;
import health.compact.a.CloudUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mlm {
    public static void b(final lzj lzjVar, final int i) {
        ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", "enter modifyCloudSwitchAndSync retryCount = ", Integer.valueOf(i));
        if (i < 0) {
            ReleaseLogUtil.e("R_HwNotificationAppSwitchManager", "modifyCloudSwitchAndSync retryCount < 0");
            d(e(), lzjVar);
        } else {
            HashMap map = new HashMap();
            map.put("deviceType", "notificationMonitor");
            fdy.d(new fda("com.huawei.health_common_config", map), "message_notification_switch", 1, new DownloadCallback<File>() { // from class: mlm.1
                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onFinish(File file) {
                    LogUtil.a("HwNotificationAppSwitchManager", "downloadAppPackageNameConfig success, result: ", file.toString());
                    mlm.d((Map<String, String>) mlm.e(file), lzjVar);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onProgress(long j, long j2, boolean z, String str) {
                    LogUtil.a("HwNotificationAppSwitchManager", "downloadAppPackageNameConfig onProgress, already: ", Long.valueOf(j), ", total: " + j2, ", fileId: ", str);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFail(int i2, Throwable th) {
                    ReleaseLogUtil.a("R_HwNotificationAppSwitchManager", "downloadAppPackageNameConfig failed,", th.getMessage());
                    mlm.b(lzjVar, i - 1);
                }
            });
        }
    }

    public static void d(final Map<String, String> map, final lzj lzjVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mlm.3
            @Override // java.lang.Runnable
            public void run() {
                if (CloudUtils.a()) {
                    mjn.b();
                }
                String str = (String) map.get(lzjVar.f());
                if (str == null) {
                    ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", lzjVar.f(), " is not top100Application ");
                } else {
                    mlm.c(str, String.valueOf(lzjVar.e()));
                }
            }
        });
    }

    public static void c(final String str, final String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500035");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: mlm.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                mlm.d(obj, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, String str, String str2) {
        List list = (List) obj;
        if (!njy.b(obj, HiSampleConfig.class) || njy.e(list)) {
            return;
        }
        a(d((List<HiSampleConfig>) list), str, str2);
    }

    private static void a(String str, String str2, String str3) {
        lzh lzhVar = (lzh) HiJsonUtil.d(str, lzh.class);
        if (lzhVar == null || lzhVar.b() == null || lzhVar.b().length == 0) {
            ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", "updateSwitchSetting switchInfo is null");
            return;
        }
        try {
            String[] strArrB = lzhVar.b();
            int i = Integer.parseInt(str2) - 1;
            if (i <= strArrB.length) {
                strArrB[i] = str3;
                lzhVar.b(strArrB);
                d(lzhVar);
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.e("R_HwNotificationAppSwitchManager", "get reallyIndex throw NumberFormatException ");
        }
    }

    private static String d(List<HiSampleConfig> list) {
        String configData = "";
        for (HiSampleConfig hiSampleConfig : list) {
            if (hiSampleConfig != null && !TextUtils.isEmpty(hiSampleConfig.getConfigData())) {
                configData = hiSampleConfig.getConfigData();
            }
        }
        return configData;
    }

    public static void d(lzh lzhVar) {
        if (lzhVar == null) {
            LogUtil.a("HwNotificationAppSwitchManager", "uploadAppStatus switchInfo is null ");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        lzhVar.b(String.valueOf(jCurrentTimeMillis));
        lzhVar.d(BaseApplication.getContext().getPackageName());
        LogUtil.a("HwNotificationAppSwitchManager", "uploadAppStatus data: ", HiJsonUtil.d(lzhVar));
        qhq.d("9005", "900500035", HiJsonUtil.d(lzhVar), new HiDataOperateListener() { // from class: mlm.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", "saveSwitchSampleConfig switchStatus errorCode: ", Integer.valueOf(i), ", object: ", obj);
            }
        }, jCurrentTimeMillis);
        SharedPreferenceManager.c("modifiedTimeId", "modifiedTime", jCurrentTimeMillis);
    }

    public static Map<String, String> e() {
        HashMap map = new HashMap();
        LogUtil.a("HwNotificationAppSwitchManager", "getDefaultPath");
        String strD = fdy.d("com.huawei.health_common_config", "message_notification_switch", "json");
        if (TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.e("R_HwNotificationAppSwitchManager", "DefaultFilePath is null");
            return map;
        }
        LogUtil.a("HwNotificationAppSwitchManager", "DefaultPath :", strD);
        File file = new File(strD);
        return file.exists() ? e(file) : map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> e(File file) {
        HashMap map = new HashMap();
        String strE = phw.e(file);
        if (TextUtils.isEmpty(strE) || Constants.NULL.equalsIgnoreCase(strE)) {
            ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", "parseLegalHolidayInfo jsonResult is empty");
            return map;
        }
        try {
            JSONArray jSONArray = new JSONObject(strE).getJSONArray("package_mappings");
            if (jSONArray.length() == 0) {
                ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", "packageMappingsArray length is 0");
                return map;
            }
            d(jSONArray, map);
            return map;
        } catch (JSONException e) {
            ReleaseLogUtil.e("R_HwNotificationAppSwitchManager", "parseAppPackageName e: ", ExceptionUtils.c(e));
            return map;
        }
    }

    private static void d(JSONArray jSONArray, Map<String, String> map) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null && !jSONObject.isNull("appid") && !jSONObject.isNull(OsType.ANDROID)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(OsType.ANDROID);
                String string = jSONObject.getString("appid");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    map.put((String) jSONArray2.get(i2), string);
                }
            }
        }
    }
}
