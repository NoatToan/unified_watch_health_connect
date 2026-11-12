package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lqd {
    public static lqp a(String str) {
        lqp lqpVar = new lqp();
        lqpVar.d(-1.0d);
        lqpVar.a(0);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AtmosphereInfoParseUtils", "weather info is empty");
            return lqpVar;
        }
        LogUtil.a("AtmosphereInfoParseUtils", "response:", str);
        try {
            JsonObject jsonObjectD = lqn.d(str);
            if (jsonObjectD != null) {
                lqp lqpVarB = b(lqpVar, jsonObjectD);
                LogUtil.a("AtmosphereInfoParseUtils", "getAtmosphereInfo atmosphereInfo is :", lqpVarB.toString());
                return lqpVarB;
            }
        } catch (JsonParseException unused) {
            LogUtil.e("AtmosphereInfoParseUtils", "getDataWeather() JsonParseException json parse error");
        }
        return lqpVar;
    }

    private static lqp b(lqp lqpVar, JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject == null || asJsonObject.isJsonNull() || !asJsonObject.isJsonObject()) {
            LogUtil.j("parseDataRootJson data is null", new Object[0]);
            return lqpVar;
        }
        return a(lqpVar, asJsonObject);
    }

    private static lqp a(lqp lqpVar, JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("condition");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("conditionRoot is null", new Object[0]);
            return lqpVar;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject == null || asJsonObject.isJsonNull() || !asJsonObject.isJsonObject()) {
            LogUtil.j("condition is null", new Object[0]);
            return lqpVar;
        }
        JsonElement jsonElement2 = asJsonObject.get("pressure");
        if (jsonElement2 == null || jsonElement2.isJsonNull()) {
            LogUtil.j("pressureIdRoot is null", new Object[0]);
            return lqpVar;
        }
        lqpVar.d(jsonElement2.getAsFloat());
        lqpVar.a(1);
        return lqpVar;
    }
}
