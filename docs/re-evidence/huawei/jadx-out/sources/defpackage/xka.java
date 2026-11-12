package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xka {
    public static boolean c() throws Throwable {
        String strE = e("webCashSwitch");
        LogUtil.b("R_SwitchConfig", "isClosedWebCash status: ", strE);
        return "CLOSE".equals(strE);
    }

    public static String e(String str) throws Throwable {
        String strD = fdy.d("com.huawei.health_common_config", "SwitchConfig", "json");
        LogUtil.b("R_SwitchConfig", "filePath = ", strD);
        if (TextUtils.isEmpty(strD)) {
            return "";
        }
        String strQ = CommonUtil.q(strD);
        if (TextUtils.isEmpty(strQ)) {
            LogUtil.e("commonConfigStr isEmpty", new Object[0]);
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(strQ);
            int iE = CommonUtil.e(BaseApplication.getContext());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    LogUtil.e("object == null", new Object[0]);
                } else {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 != null) {
                                int iOptInt = jSONObjectOptJSONObject2.optInt("minVersion");
                                int iOptInt2 = jSONObjectOptJSONObject2.optInt("maxVersion");
                                if (iOptInt2 == 0) {
                                    iOptInt2 = Integer.MAX_VALUE;
                                }
                                String strOptString = jSONObjectOptJSONObject2.optString("status");
                                LogUtil.b("R_SwitchConfig", "currentVer: ", Integer.valueOf(iE), " minVer: ", Integer.valueOf(iOptInt), " maxVer: ", Integer.valueOf(iOptInt2), " status: ", strOptString);
                                if (iE >= iOptInt && iE <= iOptInt2 && "CLOSE".equals(strOptString)) {
                                    return strOptString;
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            ReleaseLogUtil.b("R_SwitchConfig", "the exception msg is: ", ExceptionUtils.c(e));
        }
        return "";
    }

    public static void e() {
        HashMap map = new HashMap();
        map.put("configType", "SwitchConfig");
        fdy.d(new fda("com.huawei.health_common_config", map), "SwitchConfig", 1, (DownloadCallback<File>) new DownloadCallback() { // from class: xka.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFinish(Object obj) {
                LogUtil.b("R_SwitchConfig", "preDownloadConfig success, result: ", obj.toString());
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
                LogUtil.b("R_SwitchConfig", "preDownloadConfig onProgress, already: ", Long.valueOf(j), ", total: " + j2, ", fileId: ", str);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.d("R_SwitchConfig", "preDownloadConfig failed, e: ", th.getMessage());
            }
        });
    }
}
