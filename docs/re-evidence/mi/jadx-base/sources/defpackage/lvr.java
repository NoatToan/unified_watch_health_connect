package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class lvr {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("#[0-9a-fA-F]{6}").matcher(str).matches();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public static void b(Activity activity, String str) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("transition_background_color");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = null;
            } else if (TextUtils.equals(queryParameter, "light")) {
                queryParameter = "#FFFFFF";
            } else if (TextUtils.equals(queryParameter, ColorSchemeHelper.SCHEME_DARK)) {
                queryParameter = "#000000";
            } else if (!a(queryParameter)) {
                queryParameter = null;
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            activity.getWindow().setNavigationBarColor(Color.parseColor(queryParameter));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
