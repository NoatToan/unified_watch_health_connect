package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class euk {
    public static JSONObject a(String str) {
        JSONObject jSONObjectB;
        if (TextUtils.isEmpty(str) || (jSONObjectB = b()) == null) {
            return null;
        }
        String strOptString = jSONObjectB.optString(a7j.f721b);
        boolean zOptBoolean = jSONObjectB.optBoolean(a7j.c);
        if (str.equals(strOptString) && zOptBoolean) {
            return jSONObjectB;
        }
        return null;
    }

    public static JSONObject b() {
        try {
            return new JSONObject(PreferenceManager.getDefaultSharedPreferences(MiJiaEnvironment.getAppContext()).getString("native_debug_plugin_info", ""));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void c(JSONObject jSONObject) {
        if (jSONObject == null) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "RnDebugFileUtil", "rn debug list data is null");
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(MiJiaEnvironment.getAppContext()).edit();
        editorEdit.putString("native_debug_plugin_info", jSONObject.toString());
        editorEdit.apply();
    }
}
