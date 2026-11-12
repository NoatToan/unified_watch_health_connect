package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.common.MRnCrossModuleConst;

/* JADX INFO: loaded from: classes4.dex */
public class lhh {
    public static final String d = "lhh";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f25077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25078b;
    public final Context c;

    public lhh(Context context) {
        this.f25077a = PreferenceManager.getDefaultSharedPreferences(context);
        this.f25078b = context.getPackageName();
        this.c = context;
    }

    public String a() {
        String string = this.f25077a.getString(MRnCrossModuleConst.DevSettingRnDebugListActivity.RN_DEBUG_SERVER_HOST_KEY, null);
        if (!TextUtils.isEmpty(string)) {
            return (String) sk1.c(string);
        }
        String strH = ia1.h(this.c);
        if (strH.equals("localhost")) {
            cm8.C(d, "You seem to be running on device. Run '" + ia1.a(this.c) + "' to forward the debug server's port to the device.");
        }
        return strH;
    }

    public String b() {
        return ia1.e(this.c);
    }

    public String c() {
        return this.f25078b;
    }

    public void d(String str) {
        this.f25077a.edit().putString(MRnCrossModuleConst.DevSettingRnDebugListActivity.RN_DEBUG_SERVER_HOST_KEY, str).apply();
    }
}
