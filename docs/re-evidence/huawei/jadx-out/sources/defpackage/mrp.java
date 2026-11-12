package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mrp {
    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("needNotice")) {
                return jSONObject.getBoolean("needNotice");
            }
            return false;
        } catch (JSONException unused) {
            LogUtil.e("CloudFileConfigUtils", "isNotice, exception");
            return false;
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(IntentDataRecord.SRC_PKG_NAME)) {
                return "";
            }
            return jSONObject.optString(IntentDataRecord.SRC_PKG_NAME);
        } catch (JSONException unused) {
            LogUtil.e("CloudFileConfigUtils", "getWearName, exception");
            return "";
        }
    }

    public static int b(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        try {
            String string = bundle.getString("hex_data");
            if (TextUtils.isEmpty(string)) {
                return 0;
            }
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("resourceType")) {
                return jSONObject.optInt("resourceType");
            }
        } catch (JSONException unused) {
            LogUtil.e("CloudFileConfigUtils", "getResourceType, exception");
        }
        return 0;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("autoDelete")) {
                return jSONObject.getBoolean("autoDelete");
            }
        } catch (JSONException unused) {
            LogUtil.e("CloudFileConfigUtils", "isAutoDelete, exception");
        }
        return false;
    }

    public static String c(eef eefVar) {
        if (eefVar == null) {
            return "";
        }
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (configInfoList == null || configInfoList.size() == 0) {
            LogUtil.j("CloudFileConfigUtils", "onDataReceived sampleConfigInfos empty");
            return "";
        }
        String strE = eeq.e(configInfoList.get(0).e());
        LogUtil.a("CloudFileConfigUtils", "getConfigData; hexConfigContent: ", strE);
        return strE;
    }

    public static String e(String str) {
        long j = 0;
        String strA = qrs.a(BaseApplication.b(), 0L);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("fileData")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("fileData");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has("fileSize")) {
                            j += jSONObject2.getLong("fileSize");
                        }
                    }
                    strA = qrs.a(BaseApplication.b(), j);
                    LogUtil.a("CloudFileConfigUtils", "file size is ", strA);
                    return strA;
                }
            } catch (JSONException unused) {
                LogUtil.e("CloudFileConfigUtils", "downloadFileSize, exception");
                return strA;
            }
        }
        return strA;
    }

    public static String b(int i, String str) {
        String string = BaseApplication.b().getResources().getString(R.string.IDS_notify_file_content);
        String string2 = BaseApplication.b().getResources().getString(R.string.IDS_notify_default_file);
        if (i == 1 || TextUtils.isEmpty(str)) {
            string2 = BaseApplication.b().getResources().getString(R.string.IDS_notify_sport_laguage_file);
        }
        return String.format(Locale.ROOT, string, string2, str);
    }
}
