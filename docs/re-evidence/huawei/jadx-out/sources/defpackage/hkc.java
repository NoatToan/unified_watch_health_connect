package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hkc {
    public static int c(Context context) {
        if (context == null) {
            LogUtil.e("Suggestion_LongViewSystemHelper", "getSystemBrightness context == null");
            return 0;
        }
        try {
            if (Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode") == 0) {
                return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            }
            return 127;
        } catch (Settings.SettingNotFoundException unused) {
            LogUtil.e("Suggestion_LongViewSystemHelper", "getSystemBrightness SettingNotFoundException");
            return 0;
        }
    }
}
