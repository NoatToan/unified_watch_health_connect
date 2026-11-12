package com.huawei.openalliance.ad.download.ag;

import android.content.Context;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.mz;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.ds;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class f {
    static <T> void d(Context context, AppDownloadTask appDownloadTask, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            String strB = bk.b(appDownloadTask);
            if (hw.a()) {
                hw.a("ApDnApi", "appDownload=%s", strB);
            }
            jSONObject.put("content", strB);
            ContentRecord contentRecordS = appDownloadTask.S();
            if (contentRecordS == null) {
                return;
            }
            a(context, jSONObject, appDownloadTask, contentRecordS);
            na.a(context).a("reserveDownloadApp", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            a(remoteCallResultCallback, "startDownload JSONException", "reserveDownloadApp");
        }
    }

    static <T> void c(Context context, AppDownloadTask appDownloadTask, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", bk.b(appDownloadTask));
            AppInfo appInfoA = a(appDownloadTask);
            if (appInfoA != null) {
                jSONObject.put(MapKeyNames.APP_INFO, bk.b(appInfoA));
            }
            na.a(context).a("cancelDownloadApp", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            a(remoteCallResultCallback, "cancelDownload JSONException", "cancelDownloadApp");
        }
    }

    public static <T> void b(Context context, boolean z, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MapKeyNames.HAS_INSTALL_PERMISSION, z);
            na.a(context).a("reportInstallPermission", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            hw.c("ApDnApi", "reportInstallPermission JSONException");
        }
    }

    static <T> void b(Context context, AppDownloadTask appDownloadTask, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", bk.b(appDownloadTask));
            AppInfo appInfoA = a(appDownloadTask);
            if (appInfoA != null) {
                jSONObject.put(MapKeyNames.APP_INFO, bk.b(appInfoA));
            }
            na.a(context).a("pauseDownloadApp", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            a(remoteCallResultCallback, "pauseDownload JSONException", "pauseDownloadApp");
        }
    }

    private static <T> void a(RemoteCallResultCallback<T> remoteCallResultCallback, String str, String str2) {
        hw.c("ApDnApi", str);
        if (remoteCallResultCallback != null) {
            CallResult<T> callResult = new CallResult<>();
            callResult.setCode(-1);
            callResult.setMsg(str);
            remoteCallResultCallback.onRemoteCallResult(str2, callResult);
        }
    }

    public static <T> void a(Context context, boolean z, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MapKeyNames.AUTO_OPEN, z);
            mz.a(context).a("setAutoOpen", jSONObject.toString(), cls);
        } catch (JSONException unused) {
            hw.c("ApDnApi", "setAutoOpenApp JSONException");
        }
    }

    public static <T> void a(Context context, boolean z, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MapKeyNames.REMOTE_SHARED_PREF_KEY, "AutoOpenForbidden");
            jSONObject.put(MapKeyNames.REMOTE_SHARED_PREF_VALUE, z);
            na.a(context).a("remoteSharedPrefSet", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            hw.c("ApDnApi", "setAutoOpenForbidden JSONException");
        }
    }

    public static <T> void a(Context context, boolean z, int i, String str, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MapKeyNames.FULL_SCREEN_NOTIFY, z);
            jSONObject.put(MapKeyNames.ACTIVATE_NOTIFY_STYLE, i);
            jSONObject.put(MapKeyNames.PARAM_KEY, str);
            na.a(context).a("reportFullScreenNotify", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            hw.c("ApDnApi", "reportFullScreenNotify JSONException");
        }
    }

    private static void a(Context context, JSONObject jSONObject, AppDownloadTask appDownloadTask, ContentRecord contentRecord) throws JSONException {
        String strC = contentRecord.c(context);
        jSONObject.put(MapKeyNames.PARAM_FROM_SERVER, strC);
        if (hw.a()) {
            hw.a("ApDnApi", "pfs:%s", ds.a(strC));
        }
        String strB = bk.b(contentRecord.a(context));
        jSONObject.put(MapKeyNames.THIRD_MONITORS, strB);
        if (hw.a()) {
            hw.a("ApDnApi", "monitors=%s", ds.a(strB));
        }
        String strB2 = bk.b(contentRecord);
        jSONObject.put(MapKeyNames.CONTENT_RECORD, strB2);
        hw.b("ApDnApi", "content:" + ds.a(strB2));
        AppInfo appInfoB = appDownloadTask.B();
        String uniqueId = (appInfoB == null || appInfoB.getUniqueId() == null) ? "" : appInfoB.getUniqueId();
        jSONObject.put("unique_id", uniqueId);
        hw.a("ApDnApi", "unique_id:" + uniqueId);
    }

    static <T> void a(Context context, AppDownloadTask appDownloadTask, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            String strB = bk.b(appDownloadTask);
            if (hw.a()) {
                hw.a("ApDnApi", "appDownload=%s", strB);
            }
            jSONObject.put("content", strB);
            ContentRecord contentRecordS = appDownloadTask.S();
            if (contentRecordS != null) {
                a(context, jSONObject, appDownloadTask, contentRecordS);
                na.a(context).a("startFatDownloadApp", jSONObject.toString(), remoteCallResultCallback, cls);
                return;
            }
            hw.b("ApDnApi", "contentRecord is empty");
            AppInfo appInfoA = a(appDownloadTask);
            if (appInfoA != null) {
                jSONObject.put(MapKeyNames.APP_INFO, bk.b(appInfoA));
            }
            na.a(context).a("resumeDownloadApp", jSONObject.toString(), remoteCallResultCallback, cls);
        } catch (JSONException unused) {
            a(remoteCallResultCallback, "startDownload JSONException", "startFatDownloadApp");
        }
    }

    public static <T> void a(Context context, int i, String str, String str2, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MapKeyNames.AG_PROTOCOL_STATUS, i);
            jSONObject.put(MapKeyNames.AG_DOWNLOAD_PACKAGE, str);
            jSONObject.put(MapKeyNames.AG_ACTION_NAME, str2);
            mz.a(context).a("syncAgProtocolStatus", jSONObject.toString(), cls);
        } catch (JSONException unused) {
            hw.c("ApDnApi", "syncAgProcolAgreeStatus JSONException");
        }
    }

    static <T> T a(Context context, AppInfo appInfo, Class<T> cls) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", bk.b(appInfo));
            return mz.a(context).a("getDownloadStatus", jSONObject.toString(), cls).getData();
        } catch (JSONException unused) {
            hw.c("ApDnApi", "queryTask JSONException");
            return null;
        }
    }

    private static AppInfo a(AppDownloadTask appDownloadTask) {
        if (appDownloadTask == null || appDownloadTask.B() == null) {
            return null;
        }
        AppInfo appInfo = new AppInfo();
        appInfo.a(appDownloadTask.B().getPackageName());
        appInfo.q(appDownloadTask.B().b(appDownloadTask.F()));
        appInfo.H(appDownloadTask.H());
        appInfo.r(appDownloadTask.B().a());
        return appInfo;
    }
}
