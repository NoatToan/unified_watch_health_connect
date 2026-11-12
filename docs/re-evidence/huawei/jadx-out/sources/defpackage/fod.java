package defpackage;

import android.content.Context;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fod {
    private static JSONObject f() {
        return null;
    }

    public static JSONObject d(List<Integer> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("marketingApiArgs", a(list));
            jSONObject.put("section16_9Series_01Args", c());
            jSONObject.put("section1_1List_01Args", j());
            jSONObject.put("section1_1Card_01Args", g());
            jSONObject.put("section4_5Card_01Args", f());
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "getExtraArgs JSONException");
            return jSONObject;
        }
    }

    private static JSONObject a(List<Integer> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CloudParamKeys.CLIENT_TYPE, b());
            jSONObject.put("clientVersion", e(BaseApplication.getContext()));
            jSONObject.put("language", pjn.b(null));
            jSONObject.put("countryCode", LoginInit.getInstance(BaseApplication.getContext()).getCountryCode(null));
            jSONObject.put(BleConstants.LIMIT, "500");
            jSONObject.put("page", 1);
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("positionIds", jSONArray);
            String strD = d();
            LogUtil.a("ArgsUtil", "marketing url: ", strD);
            jSONObject.put("url", strD);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "getMarketingApiArgs JSONException");
            return jSONObject;
        }
    }

    private static JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageStart", 0);
            jSONObject.put(IAchieveDBMgr.PARAM_PAGE_SIZE, 50);
            jSONObject.put("lang", e());
            jSONObject.put("my", 1);
            String strA = a();
            LogUtil.a("ArgsUtil", "course url: ", strA);
            jSONObject.put("url", strA);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "getSection1_1List_01Args JSONException");
            return jSONObject;
        }
    }

    private static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("courseCategory", 137);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "getSection16_9Series_01Args JSONException");
            return jSONObject;
        }
    }

    private static JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("courseCategory", 0);
            jSONObject.put("pageNum", 0);
            jSONObject.put("lang", e());
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "getSection1_1Card_01Args JSONException");
            return jSONObject;
        }
    }

    private static String b() {
        if (qrs.ah(BaseApplication.getContext())) {
            return "5";
        }
        if (SystemInfo.d()) {
            return "1";
        }
        if (SystemInfo.c()) {
            return SystemInfo.j() ? "2" : "1";
        }
        return "3";
    }

    public static String e(Context context) {
        String strA = CommonUtil.a(context);
        return strA.contains(Constants.LINK) ? strA.substring(0, strA.indexOf(Constants.LINK)) : strA;
    }

    private static String e() {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        if (locale == null) {
            LogUtil.j("ArgsUtil", "acquireLanguagePostFix(), locale == null");
            return null;
        }
        return pjn.b(locale);
    }

    private static String a() {
        return GRSManager.c(com.huawei.haf.application.BaseApplication.b()).getUrl("sportSuggestUrl");
    }

    private static String d() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("marketingUrl");
    }
}
