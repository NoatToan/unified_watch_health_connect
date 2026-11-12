package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.common.MRnCrossModuleConst;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class rr5 {
    public static boolean a() {
        return PreferenceManager.getDefaultSharedPreferences(MiJiaEnvironment.getAppContext()).getBoolean("rn_debug_enable_v2", false);
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str + ":8081";
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(MiJiaEnvironment.getAppContext()).edit();
        editorEdit.putString(MRnCrossModuleConst.DevSettingRnDebugListActivity.RN_DEBUG_SERVER_HOST_KEY, str);
        editorEdit.apply();
    }

    public static void c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(a7j.f720a, str);
            jSONObject.put(a7j.f721b, str2);
            jSONObject.put(a7j.c, true);
            jSONObject.put(a7j.d, "");
            jSONObject.put(a7j.e, false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        euk.c(jSONObject);
    }

    public static void d(boolean z) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(MiJiaEnvironment.getAppContext()).edit();
        editorEdit.putBoolean("rn_debug_enable_v2", z);
        editorEdit.apply();
    }
}
