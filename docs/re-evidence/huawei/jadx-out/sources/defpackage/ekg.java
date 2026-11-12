package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ekg {
    public static String c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RecommendConstants.FILE_ID, str);
            jSONObject.put(RecommendConstants.VER, "0");
        } catch (JSONException unused) {
            LogUtil.e("Plugin_DataManager", "requestSingleBuildParam JSONException");
        }
        return jSONObject.toString();
    }

    public static String c(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : arrayList) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(RecommendConstants.FILE_ID, str);
                jSONObject2.put(RecommendConstants.VER, "0");
                jSONArray.put(jSONObject2);
            } catch (JSONException unused) {
                LogUtil.e("Plugin_DataManager", "buildRequestParam JSONException fileId");
            }
        }
        try {
            jSONObject.put(RecommendConstants.FILE_ID, jSONArray);
            jSONObject.put(RecommendConstants.IS_BATCH, "1");
        } catch (JSONException unused2) {
            LogUtil.e("Plugin_DataManager", "buildRequestParam JSONException");
        }
        return jSONObject.toString();
    }

    public static emc d(String str) {
        LogUtil.a("Plugin_DataManager", "Enter parseResult");
        emc emcVar = new emc();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Plugin_DataManager", "parseResult param result is null or empty");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull(RecommendConstants.FILE_ID)) {
                emcVar.b(jSONObject.getString(RecommendConstants.FILE_ID));
            }
            if (!jSONObject.isNull(RecommendConstants.DOWNLOAD_URL)) {
                emcVar.a(jSONObject.getString(RecommendConstants.DOWNLOAD_URL));
                return emcVar;
            }
        } catch (JSONException unused) {
            LogUtil.e("Plugin_DataManager", "parseResult JSONException");
        }
        return emcVar;
    }

    public static List<emc> a(String str) {
        LogUtil.a("Plugin_DataManager", "Enter parseResultList");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Plugin_DataManager", "parseResultList param result is null or empty");
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = !jSONObject.isNull("resultCode") ? jSONObject.getInt("resultCode") : -1;
            LogUtil.a("Plugin_DataManager", "parseResultList resultCode = ", Integer.valueOf(i));
            if (i == 0 && !jSONObject.isNull(RecommendConstants.FILE_INFOS)) {
                JSONArray jSONArray = jSONObject.getJSONArray(RecommendConstants.FILE_INFOS);
                LogUtil.a("Plugin_DataManager", "parseResultList jsonArray length = ", Integer.valueOf(jSONArray.length()));
                return d(jSONArray);
            }
        } catch (JSONException unused) {
            LogUtil.e("Plugin_DataManager", "parseResultList JSONException");
        }
        return arrayList;
    }

    private static List<emc> d(JSONArray jSONArray) {
        LogUtil.a("Plugin_DataManager", "Enter parseJsonArray");
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.j("Plugin_DataManager", "parseJsonArray jsonArray is null or no data");
            return arrayList;
        }
        LogUtil.a("Plugin_DataManager", "parseJsonArray jsonArray length() = ", Integer.valueOf(jSONArray.length()));
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    LogUtil.j("Plugin_DataManager", "parseJsonArray jsonObject is null");
                    break;
                }
                emc emcVar = new emc();
                if (!jSONObject.isNull(RecommendConstants.FILE_ID)) {
                    emcVar.b(jSONObject.getString(RecommendConstants.FILE_ID));
                }
                if (!jSONObject.isNull(RecommendConstants.DOWNLOAD_URL)) {
                    emcVar.a(jSONObject.getString(RecommendConstants.DOWNLOAD_URL));
                }
                arrayList.add(emcVar);
            } catch (JSONException unused) {
                LogUtil.e("Plugin_DataManager", "parseJsonArray JSONException");
            }
        }
        return arrayList;
    }
}
