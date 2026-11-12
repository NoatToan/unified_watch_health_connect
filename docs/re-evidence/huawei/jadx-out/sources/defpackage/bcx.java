package defpackage;

import android.os.Looper;
import android.os.Process;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class bcx {
    public static String b(String str) {
        return e("local_update_struct_data", 0, str, "json");
    }

    public static String d(String str) {
        return e("local_update_unstruct_data", 0, str, "json");
    }

    public static String e(String str) {
        return e("local_update_sync_result", 0, str, "json");
    }

    private static String e(String str, int i, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("business_id", str);
            jSONObject.put("returnCode", i);
            jSONObject.put("syncInfo", str2);
            jSONObject.put("syncInfoType", str3);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (JSONException unused) {
            bcw.d("ReportUtil", "parseReportInfo " + str + " error: JSONException");
            return "";
        }
    }

    public static String e(String str, boolean z, int i, int i2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", str);
            jSONObject.put("isSyncRecycleOn", z);
            jSONObject.put("cloudDeletedId", i);
            jSONObject.put("deleteResult", i2);
            a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("ReportUtil", "parseCloudDeleteReportInfo error: JSONException");
            string = "";
        }
        return e("local_cloud_delete", 0, string, "json");
    }

    public static String b(String str, List<Object> list) {
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("syncType", str);
            if (list == null) {
                jSONObject.put("updateDataResultList", "");
            } else {
                jSONObject.put("updateDataResultList", list.toString());
            }
            a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("ReportUtil", "parseUpdateDataResultsReportInfo error: JSONException");
        }
        return e("local_update_data_results", 0, string, "json");
    }

    public static String b(String str, String str2, String str3, String str4) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("syncType", str);
            jSONObject.put("dataType", str2);
            jSONObject.put("serviceDisconnectedTime", str3);
            jSONObject.put("traceId", str4);
            a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("ReportUtil", "parseServiceDisconnectedTimeReportInfo error: JSONException");
            string = "";
        }
        return e("local_service_disconnected_time", 5, string, "json");
    }

    public static String e(String str, String str2, int i, String str3) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", str);
            jSONObject.put("interfacesName", str2);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str3);
            a(jSONObject);
            string = jSONObject.toString();
        } catch (Exception e) {
            bcw.d("ReportUtil", "parseAppExceptionReportInfo error: " + e.getMessage());
            string = "";
        }
        return e("local_app_exception", 23, string, "json");
    }

    public static String a(String str, String str2, String str3, int i) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", str);
            jSONObject.put("interfacesName", str2);
            jSONObject.put("errorMsg", str3);
            jSONObject.put("errorCode", i);
            a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("ReportUtil", "parseAppExceptionReportInfo error: JSONException");
            string = "";
        }
        return e("sdk_inner_exception", 25, string, "json");
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("3dAppTid", String.valueOf(Process.myTid()));
            jSONObject.put("3dAppPid", String.valueOf(Process.myPid()));
            jSONObject.put("is3dAppMainTid", String.valueOf(Thread.currentThread() == Looper.getMainLooper().getThread()));
        } catch (Exception e) {
            bcw.d("ReportUtil", "appendProcessId err " + e.getMessage());
        }
    }
}
