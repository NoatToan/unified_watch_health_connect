package ohos.stage.ability.adapter;

import android.content.res.Configuration;
import ohos.ace.adapter.ALog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class StageConfiguration {
    private static final String COLOR_MODE_DARK = "dark";
    private static final String COLOR_MODE_KEY = "ohos.system.colorMode";
    private static final String COLOR_MODE_LIGHT = "light";
    private static final String DENSITY_KEY = "ohos.application.densitydpi";
    private static final String DEVICE_TYPE = "const.build.characteristics";
    private static final String DEVICE_TYPE_PHONE = "Phone";
    private static final String DEVICE_TYPE_TABLET = "Tablet";
    private static final String EMPTY_VALUE = "";
    private static final String LANGUAGE_MODE_KEY = "ohos.system.language";
    private static final String LOG_TAG = "StageConfiguration";
    private static final String ORI_MODE_KEY = "ohos.application.direction";
    private static final String ORI_MODE_LANDSCAPE = "horizontal";
    private static final String ORI_MODE_PORTRAIT = "vertical";
    private static final String SYSTEM_FONT_SIZE_SCALE = "system.font.size.scale";
    private static float fontscale = 1.0f;

    private static void setFontScale(float f, JSONObject jSONObject) {
        try {
            if (Float.compare(f, fontscale) != 0) {
                fontscale = f;
                jSONObject.put(SYSTEM_FONT_SIZE_SCALE, String.valueOf(f));
            }
        } catch (JSONException unused) {
            ALog.w(LOG_TAG, "Same Backup FontScale");
        }
    }

    public static JSONObject convertConfiguration(Configuration configuration, double d) {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = configuration.uiMode & 48;
            if (i == 16) {
                jSONObject.put(COLOR_MODE_KEY, "light");
            } else if (i == 32) {
                jSONObject.put(COLOR_MODE_KEY, COLOR_MODE_DARK);
            } else {
                jSONObject.put(COLOR_MODE_KEY, "");
            }
            int i2 = configuration.orientation;
            if (i2 == 1) {
                jSONObject.put(ORI_MODE_KEY, ORI_MODE_PORTRAIT);
            } else if (i2 == 2) {
                jSONObject.put(ORI_MODE_KEY, ORI_MODE_LANDSCAPE);
            } else {
                jSONObject.put(ORI_MODE_KEY, "");
            }
            jSONObject.put(DENSITY_KEY, String.valueOf(configuration.densityDpi));
            jSONObject.put(LANGUAGE_MODE_KEY, configuration.locale);
            int i3 = configuration.smallestScreenWidthDp;
            if (i3 == 0) {
                if (d <= 6.9d && d >= 0.0d) {
                    jSONObject.put(DEVICE_TYPE, "Phone");
                } else if (d > 6.9d) {
                    jSONObject.put(DEVICE_TYPE, DEVICE_TYPE_TABLET);
                }
            } else if (i3 >= 600) {
                jSONObject.put(DEVICE_TYPE, DEVICE_TYPE_TABLET);
            } else {
                jSONObject.put(DEVICE_TYPE, "Phone");
            }
            setFontScale(configuration.fontScale, jSONObject);
            ALog.i(LOG_TAG, "convertConfiguration json:" + jSONObject.toString());
            return jSONObject;
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "convertConfiguration parse Configuration failed");
            return jSONObject;
        }
    }
}
