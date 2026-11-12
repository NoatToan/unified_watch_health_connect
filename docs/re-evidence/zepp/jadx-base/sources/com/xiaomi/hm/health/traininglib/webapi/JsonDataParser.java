package com.xiaomi.hm.health.traininglib.webapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.training.api.util.Loggers;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class JsonDataParser {
    private static final String a = "Train-JsonDataParser";

    @NonNull
    public static String getDictionaryName(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return new JSONObject(str).getString("name");
        } catch (Exception e) {
            Loggers.getLogger().w(a, e);
            return "";
        }
    }

    @NonNull
    public static String[] getDictionaryNameList(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getJSONObject(i).getString("name");
                }
                return strArr;
            } catch (Exception e) {
                Loggers.getLogger().w(a, e);
            }
        }
        return new String[0];
    }

    public static long getLongByGender(@Nullable String str, boolean z) {
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return z ? jSONObject.getLong("male") : jSONObject.getLong(HMIntentHandler.NAME_FEMALE);
        } catch (Exception e) {
            Loggers.getLogger().w(a, e);
            return 0L;
        }
    }

    @NonNull
    public static String getStringByGender(@Nullable String str, boolean z) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return z ? jSONObject.getString("male") : jSONObject.getString(HMIntentHandler.NAME_FEMALE);
        } catch (Exception e) {
            Loggers.getLogger().w(a, e);
            return "";
        }
    }
}
