package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.GRSManager;
import health.compact.a.HEXUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class lqn {
    public static JsonObject b(String str) {
        JsonObject jsonObject = null;
        try {
            JsonElement jsonElement = new JsonParser().parse(str);
            if (jsonElement != null && !jsonElement.isJsonNull()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null) {
                    try {
                        if (!asJsonObject.isJsonNull()) {
                            JsonElement jsonElement2 = asJsonObject.get("resultCode");
                            JsonElement jsonElement3 = asJsonObject.get("resultInfo");
                            if (jsonElement2 != null && !jsonElement2.isJsonNull() && jsonElement3 != null && !jsonElement3.isJsonNull()) {
                                String asString = jsonElement2.getAsString();
                                String asString2 = jsonElement3.getAsString();
                                if (!TextUtils.isEmpty(asString) && !TextUtils.isEmpty(asString2)) {
                                    if ("0".equals(asString) && "Success".equals(asString2)) {
                                        return asJsonObject;
                                    }
                                    LogUtil.j("HagWeatherParseUtils", "parsonJsonToResponseElement weather info error:", asString2);
                                    return null;
                                }
                                LogUtil.j("HagWeatherParseUtils", "parsonJsonToResponseElement resultCode is null or resultInfo is null");
                                return null;
                            }
                            LogUtil.j("HagWeatherParseUtils", "parsonJsonToResponseElement resultCodeRoot or resultInfoRoot is null");
                            return asJsonObject;
                        }
                    } catch (JsonParseException unused) {
                        jsonObject = asJsonObject;
                        LogUtil.e("HagWeatherParseUtils", "parsonJsonToResponseElement JsonParseException");
                        return jsonObject;
                    } catch (IllegalStateException unused2) {
                        jsonObject = asJsonObject;
                        LogUtil.e("HagWeatherParseUtils", "parsonJsonToResponseElement IllegalStateException");
                        return jsonObject;
                    }
                }
                LogUtil.j("HagWeatherParseUtils", "parsonJsonToResponseElement root is null");
                return null;
            }
            LogUtil.j("HagWeatherParseUtils", "parsonJsonToResponseElement element is null");
            return null;
        } catch (JsonParseException unused3) {
        } catch (IllegalStateException unused4) {
        }
    }

    public static JsonObject d(String str) {
        JsonObject jsonObjectB = b(str);
        if (jsonObjectB == null) {
            LogUtil.j("HagWeatherParseUtils", "parsonJsonToDataElement root is null");
            return null;
        }
        JsonElement jsonElement = jsonObjectB.get("data");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("HagWeatherParseUtils", "parsonJsonToDataElement dataElement is null");
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject != null && !asJsonObject.isJsonNull() && asJsonObject.isJsonObject()) {
            return asJsonObject;
        }
        LogUtil.j("HagWeatherParseUtils", "parsonJsonToDataElement dataElement is null or is not object");
        return null;
    }

    public static int e(JsonElement jsonElement) {
        int asInt = (jsonElement == null || jsonElement.isJsonNull()) ? -99 : jsonElement.getAsInt();
        LogUtil.a("HagWeatherParseUtils", "parseTemperature() tempValue:", Integer.valueOf(asInt));
        return asInt;
    }

    public static JsonArray c(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("dailys");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("HagWeatherParseUtils", "dailiesRoot is null");
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject == null || asJsonObject.isJsonNull() || !asJsonObject.isJsonObject()) {
            LogUtil.j("HagWeatherParseUtils", "dailies is null or is not object");
            return null;
        }
        JsonElement jsonElement2 = asJsonObject.get("dailyWeathers");
        if (jsonElement2 == null || jsonElement2.isJsonNull()) {
            LogUtil.j("HagWeatherParseUtils", "dailyWeathersRoot is null");
            return null;
        }
        JsonArray asJsonArray = jsonElement2.getAsJsonArray();
        if (asJsonArray.size() >= 1 && asJsonArray.isJsonArray() && !asJsonArray.isJsonNull()) {
            return asJsonArray;
        }
        LogUtil.j("HagWeatherParseUtils", "dailyWeathersList is less 1");
        return null;
    }

    public static int a(String str) {
        if ("New".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("WaxingCrescent".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("First".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("WaxingGibbous".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("Full".equalsIgnoreCase(str)) {
            return 5;
        }
        if ("WaningGibbous".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("Last".equalsIgnoreCase(str)) {
            return 7;
        }
        return "WaningCrescent".equalsIgnoreCase(str) ? 8 : 0;
    }

    public static boolean e(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(new Date()).equals(simpleDateFormat.format(new Date(j)));
    }

    public static String d() {
        return GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
    }

    public static String e(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return HEXUtils.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.e("HagWeatherParseUtils", "sha512 NoSuchAlgorithmException");
            return "";
        }
    }
}
