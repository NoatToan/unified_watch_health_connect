package com.xiaomi.ai.domain.mobileapp.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import defpackage.aqe;
import defpackage.j4b;
import defpackage.n08;
import defpackage.qpe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class EnvParser {
    private static final String EVAL_DEVICE_ID = "EVAL-DEVICE-ID";
    private static final String ROBOT_DEVICE_PREFIX = "robot_";
    private static final qpe LOGGER = aqe.f(EnvParser.class);
    private static final Pattern CLIENT_VERSION_PAT = Pattern.compile("Build/([0-9]+)");

    public static String parseAppName(n08 n08Var) {
        return n08Var != null ? n08Var.getAppName() : "";
    }

    public static int parseClientVersion(n08 n08Var) {
        if (n08Var == null) {
            return 0;
        }
        String deviceId = n08Var.getDeviceId();
        if (deviceId != null && (deviceId.equals(EVAL_DEVICE_ID) || deviceId.startsWith(ROBOT_DEVICE_PREFIX))) {
            return Integer.MAX_VALUE;
        }
        String userAgent = n08Var.getUserAgent();
        if (userAgent == null) {
            return 0;
        }
        Matcher matcher = CLIENT_VERSION_PAT.matcher(userAgent);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }

    public static JsonObject parseContextJS(n08 n08Var) {
        JSONObject jSONObjectJ = n08Var != null ? n08Var.getContext().j() : null;
        if (jSONObjectJ != null) {
            return j4b.a().parse(jSONObjectJ.toString()).getAsJsonObject();
        }
        return null;
    }

    public static Pair<String, Integer> parseForegroundAppAndVersion(JsonObject jsonObject) {
        JsonObject asJsonObject;
        if (jsonObject != null && (asJsonObject = jsonObject.getAsJsonObject("forceground_app")) != null) {
            try {
                return Pair.of(asJsonObject.get("pkg_name").getAsString(), Integer.valueOf(asJsonObject.get("version_code").getAsInt()));
            } catch (Exception e) {
                LOGGER.warn("parser foreground error,  context:" + jsonObject.toString(), (Throwable) e);
            }
        }
        return null;
    }

    public static Pair<JsonArray, String> parseLatestAppArrJS(n08 n08Var) {
        JsonObject contextJS = parseContextJS(n08Var);
        JsonObject asJsonObject = contextJS != null ? contextJS.getAsJsonObject("last_answer") : null;
        if (asJsonObject != null) {
            return Pair.of(asJsonObject.getAsJsonArray("apps"), "");
        }
        return null;
    }
}
