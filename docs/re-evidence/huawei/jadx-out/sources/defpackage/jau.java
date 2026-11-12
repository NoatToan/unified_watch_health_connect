package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.manager.service.VoiceEngService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jau {
    private static final jau d = new jau();
    private List<String> e = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38320b = false;

    private jau() {
    }

    public static jau c() {
        return d;
    }

    public void j(String str) {
        if (str == null) {
            LogUtil.e("Track_VoiceCommonUtils", "moduleName is null");
            return;
        }
        this.e.add(str);
        ReleaseLogUtil.d("Track_VoiceCommonUtils", str, " start service ", Integer.valueOf(this.e.size()));
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) VoiceEngService.class);
        intent.setAction("action_voice_soundpool_enge");
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("Track_VoiceCommonUtils", "startVoiceService IllegalStateException");
        }
    }

    public void d(String str, String str2, int i) {
        if (str == null) {
            LogUtil.e("Track_VoiceCommonUtils", "moduleName is null");
            return;
        }
        this.e.add(str);
        ReleaseLogUtil.d("Track_VoiceCommonUtils", str, " start service ", str2, " current size:", Integer.valueOf(this.e.size()));
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) VoiceEngService.class);
        intent.setAction("action_voice_soundpool_enge");
        intent.putExtra("player_name_key", str2);
        intent.putExtra("player_type_key", i);
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("Track_VoiceCommonUtils", "startVoiceService IllegalStateException moduleName ", str);
        }
    }

    public void h(String str) {
        if (str == null) {
            LogUtil.a("Track_VoiceCommonUtils", "moduleName is null");
            return;
        }
        ReleaseLogUtil.d("Track_VoiceCommonUtils", str, " stop service ", Integer.valueOf(this.e.size()));
        this.e.remove(str);
        if (this.e.size() == 0) {
            iyb.e(BaseApplication.getContext(), new Intent("action_stop_service"));
        }
    }

    public void a(int i) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playSingleSourceVoice");
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", 10);
        intent.putExtra("SPEAK_PARAMETER_TYPE", 0);
        intent.putExtra("SPEAK_PARAMETER", i);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void b(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playSingleSourceVoice");
        if (!str.contains("assert") && !d(str)) {
            LogUtil.j("Track_VoiceCommonUtils", "playSingleSourceVoice file not exist");
            return;
        }
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", 10);
        intent.putExtra("SPEAK_PARAMETER_TYPE", 2);
        intent.putExtra("SPEAK_PARAMETER", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void a(int[] iArr) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playMultipleSourcesVoice");
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", 10);
        intent.putExtra("SPEAK_PARAMETER_TYPE", 1);
        intent.putExtra("SPEAK_PARAMETER", iArr);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void d(String[] strArr) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playMultipleSourcesVoice");
        if (!b(strArr)) {
            LogUtil.j("Track_VoiceCommonUtils", "playMultipleSourcesVoice file not exist");
            return;
        }
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", 10);
        intent.putExtra("SPEAK_PARAMETER_TYPE", 3);
        intent.putExtra("SPEAK_PARAMETER", strArr);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void c(String[] strArr, String str) {
        if (str == null) {
            d(strArr);
            return;
        }
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playMultipleSourcesVoice carrying parameters");
        if (!b(strArr)) {
            LogUtil.j("Track_VoiceCommonUtils", "playMultipleSourcesVoice file not exist");
            return;
        }
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", 10);
        intent.putExtra("SPEAK_PARAMETER_TYPE", 3);
        intent.putExtra("SPEAK_PARAMETER", strArr);
        intent.putExtra("SPEAK_EXTRA_MESSAGE", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void e(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playSkipNativeVoice() path: ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_VoiceCommonUtils", "playSkipNativeVoice() path is null or empty");
            return;
        }
        if (!str.contains("assert") && !d(str)) {
            LogUtil.j("Track_VoiceCommonUtils", "playSkipNativeVoice() file not exist");
            return;
        }
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", 35);
        intent.putExtra("SPEAK_PARAMETER", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void d(jbc jbcVar) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "playStateVoice");
        if (jbcVar == null) {
            LogUtil.j("Track_VoiceCommonUtils", "playStateVoice param is null");
            return;
        }
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("SPEAK_TYPE", jbcVar.aa());
        intent.putExtra("SPEAK_PARAMETER", jbcVar);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void e(String str, String str2) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "addAudioToPlayList playerName:", str);
        LogUtil.a("Track_VoiceCommonUtils", "audioPath:", str2);
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("Track_VoiceCommonUtils", "audioPath is empty");
            return;
        }
        Intent intent = new Intent("action_play_voice");
        intent.putExtra("player_name_key", str);
        intent.putExtra("param_long_audio_url", str2);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void d(String str, int i) {
        if (i == 1) {
            c(str);
            return;
        }
        if (i == 2) {
            i(str);
            return;
        }
        if (i == 5) {
            f(str);
            return;
        }
        if (i == 101) {
            a(str);
        } else if (i == 102) {
            g(str);
        } else {
            ReleaseLogUtil.e("Track_VoiceCommonUtils", "sendPlayerCommand error, playerCommand not support.", Integer.valueOf(i));
        }
    }

    public void c(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "pauseBackgroundAudio,", str);
        Intent intent = new Intent("action_pause_audio");
        intent.putExtra("player_name_key", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void i(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "resumeBackgroundAudio,", str);
        Intent intent = new Intent("action_resume_audio");
        intent.putExtra("player_name_key", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void a(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "muteBackgroundAudio,", str);
        Intent intent = new Intent("action_mute_audio_volume");
        intent.putExtra("player_name_key", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void g(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "resumeBackgroundAudioVolume,", str);
        Intent intent = new Intent("action_resume_audio_volume");
        intent.putExtra("player_name_key", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void f(String str) {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "resetPlayIdle");
        Intent intent = new Intent("ACTION_RESET_MEDIA_IDLE");
        intent.putExtra("player_name_key", str);
        iyb.e(BaseApplication.getContext(), intent);
    }

    public void b() {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "stopVoicePlay");
        iyb.e(BaseApplication.getContext(), new Intent("action_stop_voice"));
    }

    public void e() {
        ReleaseLogUtil.d("Track_VoiceCommonUtils", "resetPlayIdle");
        iyb.e(BaseApplication.getContext(), new Intent("ACTION_RESET_MEDIA_IDLE"));
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (new File(str).exists()) {
            return true;
        }
        LogUtil.j("Track_VoiceCommonUtils", "isAudioResourceExist path not exist path = ", str);
        return false;
    }

    public boolean b(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!str.contains("assert") && !d(str)) {
                return false;
            }
        }
        return true;
    }

    public void e(boolean z) {
        this.f38320b = z;
    }

    public boolean a() {
        return this.f38320b;
    }
}
