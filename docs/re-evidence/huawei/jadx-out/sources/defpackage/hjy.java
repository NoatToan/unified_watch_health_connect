package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hjy {
    public static int a() {
        return 5894;
    }

    public static boolean e(boolean z) {
        Context context = BaseApplication.getContext();
        boolean z2 = false;
        if (context == null) {
            LogUtil.j("Suggestion_LongCoachSoundHelper", "isMuteAudioFocus() context is null.");
            return false;
        }
        if (context.getSystemService("audio") instanceof AudioManager) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (!z ? audioManager.abandonAudioFocus(null) == 1 : audioManager.requestAudioFocus(null, 3, 1) == 1) {
                z2 = true;
            }
        }
        LogUtil.a("Suggestion_LongCoachSoundHelper", "isMuteAudioFocus() pauseMusic bMute=", Boolean.valueOf(z), " result=", Boolean.valueOf(z2));
        return z2;
    }
}
