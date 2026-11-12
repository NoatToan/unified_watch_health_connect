package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.mz;
import com.huawei.operation.OpAnalyticsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f20668a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f20669b = new AtomicBoolean(true);

    public List<App> b(Context context) {
        try {
            CallResult<String> callResultA = mz.a(context).a("queryUninstalledAppInfo", null, String.class);
            if (callResultA == null) {
                hw.c("AppRestoreUtils", "get error with result");
                return null;
            }
            if (b(callResultA)) {
                return a(callResultA);
            }
            return null;
        } catch (Throwable unused) {
            hw.c("AppRestoreUtils", "get info failed");
            return null;
        }
    }

    public boolean a(Context context) {
        String str;
        hw.a("AppRestoreUtils", "isRemoteSupport:%s", this.f20669b);
        if (!this.f20669b.get()) {
            return false;
        }
        if (!ab.o(context) && !ab.n(context)) {
            str = "device not phone or pad, not support";
        } else {
            if (com.huawei.openalliance.ad.cc.b(context)) {
                return true;
            }
            str = "device not support";
        }
        hw.a("AppRestoreUtils", str);
        return false;
    }

    public int a(Context context, AppDownloadTask appDownloadTask) {
        if (context != null && appDownloadTask != null) {
            try {
                AppInfo appInfoB = appDownloadTask.B();
                if (appInfoB == null) {
                    return -1;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appInfo", bk.a(appInfoB));
                jSONObject.put("slotId", appDownloadTask.M());
                jSONObject.put("appTaskInfo", appDownloadTask.N());
                CallResult callResultA = mz.a(context).a("restoreAppByPackageName", jSONObject.toString(), String.class);
                if (callResultA == null || !b(callResultA)) {
                    return -1;
                }
                String str = (String) callResultA.getData();
                if (!"0".equals(str) && !OpAnalyticsConstants.SSL_FAIL_CODE.equals(str)) {
                    if (OpAnalyticsConstants.WATCH_FAIL_CODE.equals(str)) {
                        return -2;
                    }
                }
                return 0;
            } catch (Throwable unused) {
                hw.c("AppRestoreUtils", "call remote occurs exception");
            }
        }
        return -1;
    }

    private <T> boolean b(CallResult<T> callResult) {
        int code = callResult.getCode();
        hw.a("AppRestoreUtils", "call rs result code:%s", Integer.valueOf(code));
        boolean z = code == 200;
        if (z) {
            this.f20669b.set(!"-100".equals(callResult.getData()));
            hw.a("AppRestoreUtils", "updated isRemoteSupport:%s", Boolean.valueOf(this.f20669b.get()));
        }
        return z;
    }

    private List<App> a(CallResult<String> callResult) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        String data = callResult.getData();
        if (TextUtils.isEmpty(data) || (jSONArrayOptJSONArray = new JSONObject(data).optJSONArray("result_list")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            App app = new App();
            app.b(jSONObject.optString("packageName"));
            app.a(jSONObject.optString("versionName"));
            arrayList.add(app);
        }
        return arrayList;
    }

    public static m a() {
        return f20668a;
    }

    private m() {
    }
}
