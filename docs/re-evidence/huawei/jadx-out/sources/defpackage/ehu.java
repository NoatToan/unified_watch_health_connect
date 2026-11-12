package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ehu {
    public static ffw a(int i, String str, String str2) {
        return b(i, fdy.d(str, str2, (String) null) + File.separator + "heart_rate_control_configuration" + File.separator + "heart_rate_control_course.json");
    }

    public static fgf d(int i, String str, String str2) {
        return a(i, fdy.d(str, str2, (String) null) + File.separator + "heart_rate_control_configuration" + File.separator + "heart_rate_control_config.json");
    }

    public static ffw b(int i, String str) throws Throwable {
        LogUtil.a("HeartRateControlConfigParser", "loadHeartRateControlInfo");
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HeartRateControlConfigParser", "loadHeartRateControlInfo tempPathList == null");
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.j("HeartRateControlConfigParser", "loadHeartRateControlInfo file not exists");
            return null;
        }
        JSONObject jSONObjectC = EzPluginManager.c(new File(str));
        if (jSONObjectC == null) {
            LogUtil.j("HeartRateControlConfigParser", "jsonObject is null");
            return null;
        }
        ffw ffwVar = (ffw) new Gson().fromJson(jSONObjectC.toString(), new TypeToken<ffw>() { // from class: com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigParser$1
        }.getType());
        if (ffwVar == null) {
            LogUtil.j("HeartRateControlConfigParser", "heartRateControlInfo is null");
            return ffwVar;
        }
        ehx.b(i, ffwVar);
        return ffwVar;
    }

    public static fgf a(int i, String str) throws Throwable {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HeartRateControlConfigParser", "loadHeartRateControlInfo tempPathList == null");
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.j("HeartRateControlConfigParser", "loadHeartRateControlInfo file not exists");
            return null;
        }
        JSONObject jSONObjectC = EzPluginManager.c(new File(str));
        if (jSONObjectC == null) {
            return null;
        }
        fgf fgfVar = (fgf) new Gson().fromJson(jSONObjectC.toString(), new TypeToken<fgf>() { // from class: com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigParser$2
        }.getType());
        if (fgfVar == null) {
            LogUtil.j("HeartRateControlConfigParser", "speedControlConfigInfo is null");
            return fgfVar;
        }
        ehx.c(i, fgfVar);
        return fgfVar;
    }
}
