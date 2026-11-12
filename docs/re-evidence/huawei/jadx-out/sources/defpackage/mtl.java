package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mtl {
    public static String a() {
        if (!mtk.b()) {
            LogUtil.j("ContactExtraDataUtils", "has no hicall permission.");
            return "";
        }
        return d(mts.a(BaseApplication.getContext()));
    }

    public static String c() {
        return a(mua.b());
    }

    public static String b() {
        if (!mtk.c()) {
            LogUtil.j("ContactExtraDataUtils", "not supported contacts config.");
            return "";
        }
        if (!mtk.d()) {
            LogUtil.j("ContactExtraDataUtils", "have no contacts permissions.");
            return "";
        }
        return d(mtp.e(BaseApplication.getContext()));
    }

    private static String d(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            LogUtil.j("ContactExtraDataUtils", "toJsonString: jsonObject is null or empty.");
            return "";
        }
        return jSONObject.toString();
    }

    private static String a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.j("ContactExtraDataUtils", "toJsonString: jsonArray is null or empty.");
            return "";
        }
        return jSONArray.toString();
    }
}
