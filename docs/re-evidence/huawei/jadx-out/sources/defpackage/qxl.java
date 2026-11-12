package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hms.network.embedded.j;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class qxl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<lzj> f46935b = new CopyOnWriteArrayList();

    public void b(final int i, final NotificationCallback<Boolean> notificationCallback) {
        ReleaseLogUtil.d("R_ConfigManager", "enter downloadAppPackageNameConfig retryCount = ", Integer.valueOf(i));
        if (i < 0) {
            ReleaseLogUtil.e("R_ConfigManager", "downloadAppPackageNameConfig retryCount < 0");
            c(notificationCallback);
        } else {
            HashMap map = new HashMap();
            map.put("deviceType", "notificationMonitor");
            fdy.d(new fda("com.huawei.health_common_config", map), "message_notification_switch", 1, new DownloadCallback<File>() { // from class: qxl.1
                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onFinish(File file) {
                    LogUtil.a(j.h, "downloadAppPackageNameConfig success, result: ", file.toString());
                    qxl.e(file, notificationCallback);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onProgress(long j, long j2, boolean z, String str) {
                    LogUtil.a(j.h, "downloadAppPackageNameConfig onProgress, already: ", Long.valueOf(j), ", total: " + j2, ", fileId: ", str);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFail(int i2, Throwable th) {
                    ReleaseLogUtil.a("R_ConfigManager", "downloadAppPackageNameConfig failed,", th.getMessage());
                    qxl.this.b(i - 1, notificationCallback);
                }
            });
        }
    }

    private static void c(NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a(j.h, "getDefaultPath");
        String strD = fdy.d("com.huawei.health_common_config", "message_notification_switch", "json");
        if (TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.e("R_ConfigManager", "DefaultFilePath is null");
            if (notificationCallback != null) {
                notificationCallback.onError(NotificationResult.GENERAL_ERROR, "DefaultFilePath is null");
                return;
            }
            return;
        }
        LogUtil.a(j.h, "DefaultPath :", strD);
        File file = new File(strD);
        if (file.exists()) {
            e(file, notificationCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(File file, NotificationCallback<Boolean> notificationCallback) {
        String strE = phw.e(file);
        ReleaseLogUtil.d("R_ConfigManager", "parseAppPackageName jsonResult is,", strE);
        if (TextUtils.isEmpty(strE) || Constants.NULL.equalsIgnoreCase(strE)) {
            ReleaseLogUtil.d("R_ConfigManager", "parseLegalHolidayInfo jsonResult is empty");
            if (notificationCallback != null) {
                notificationCallback.onError(NotificationResult.GENERAL_ERROR, "parseLegalHolidayInfo jsonResult is empty");
                return;
            }
            return;
        }
        try {
            JSONArray jSONArray = new JSONObject(strE).getJSONArray("package_mappings");
            if (jSONArray.length() == 0) {
                ReleaseLogUtil.d("R_ConfigManager", "packageMappingsArray length is 0");
                if (notificationCallback != null) {
                    notificationCallback.onError(NotificationResult.GENERAL_ERROR, "packageMappingsArray length is 0");
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && !jSONObject.isNull("appid") && !jSONObject.isNull(OsType.ANDROID)) {
                    lzj lzjVar = new lzj();
                    lzjVar.e(e(jSONObject.getJSONArray(OsType.ANDROID)));
                    lzjVar.d(jSONObject.getString("appid"));
                    arrayList.add(lzjVar);
                }
            }
            f46935b.clear();
            f46935b.addAll(arrayList);
            LogUtil.a(j.h, "parseAppPackageName appNameList size = ", Integer.valueOf(f46935b.size()));
            if (notificationCallback != null) {
                notificationCallback.onSuccess(true);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.e("R_ConfigManager", "parseAppPackageName e: ", ExceptionUtils.c(e));
            if (notificationCallback != null) {
                notificationCallback.onError(NotificationResult.GENERAL_ERROR, e.getMessage());
            }
        }
    }

    private static String e(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() >= 1) {
            return jSONArray.toString().replace("[", "").replace("]", "").replace("\"", "");
        }
        LogUtil.a(j.h, "array is null");
        return "";
    }

    public List<lzj> c() {
        ArrayList arrayList;
        synchronized (this) {
            if (njy.e(f46935b)) {
                c(null);
            }
            arrayList = new ArrayList(f46935b);
        }
        return arrayList;
    }

    public boolean d(String str) {
        LogUtil.a(j.h, "isTop100Application enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(j.h, "isTop100Application appInfo is null");
            return false;
        }
        if (njy.e(f46935b)) {
            LogUtil.j(j.h, "isTop100Application appNameList is null");
            return false;
        }
        Iterator<lzj> it = f46935b.iterator();
        while (it.hasNext()) {
            if (it.next().f().contains(str)) {
                LogUtil.a(j.h, "isTop100Application appName is ： ", str);
                return true;
            }
        }
        return false;
    }
}
