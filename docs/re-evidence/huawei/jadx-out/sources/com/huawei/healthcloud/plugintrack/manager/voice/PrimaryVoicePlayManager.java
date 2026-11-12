package com.huawei.healthcloud.plugintrack.manager.voice;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class PrimaryVoicePlayManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10485c;
    private Map<String, VoicePlayInterface> d = new HashMap();

    public PrimaryVoicePlayManager(Context context) {
        this.f10485c = context;
    }

    public void d(int i, String str) {
        VoicePlayInterface voicePlayer;
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "createVoicePlayer,type:", Integer.valueOf(i), " name:", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_PrimaryVoicePlayManager", "voice player name not define.");
            str = "defaultPlayer";
        }
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.resetPlayer();
            LogUtil.j("Track_PrimaryVoicePlayManager", "voice player has exist.", str);
        } else {
            if (i == 1) {
                voicePlayer = new BackAudioPlayer(this.f10485c);
            } else {
                voicePlayer = new VoicePlayer(this.f10485c);
            }
            this.d.put(str, voicePlayer);
        }
    }

    public void c() {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "release voice player");
        Iterator<VoicePlayInterface> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    public void a(String str, Intent intent) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "insertVoice player name:", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.insertVoice(intent);
        }
    }

    public void c(String str) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "resetVoicePlayer() enter,", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.resetPlayer();
        }
    }

    public void j(String str) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "stopVoice() enter", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.stopPlay();
        }
    }

    public void d(String str, String str2) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "startPlay() enter,", str, " audio url:", str2);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.startPlay(str2);
        }
    }

    public void b(String str) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "pausePlay() enter,", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.pausePlay();
        }
    }

    public void a(String str) {
        LogUtil.a("Track_PrimaryVoicePlayManager", "continuePlay() enter,", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.continuePlay();
        }
    }

    public void d(String str) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "muteVolume() enter,", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.muteVolume();
        }
    }

    public void e(String str) {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "resumeVolume() enter,", str);
        VoicePlayInterface voicePlayInterface = this.d.get(str);
        if (voicePlayInterface != null) {
            voicePlayInterface.resumeVolume();
        }
    }

    public void a() {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "dealWithPhoneCalling");
        for (VoicePlayInterface voicePlayInterface : this.d.values()) {
            if (voicePlayInterface.getType() == 1) {
                voicePlayInterface.muteVolume();
            } else if (voicePlayInterface.getType() == 0) {
                voicePlayInterface.stopPlay();
                voicePlayInterface.resetPlayer();
            }
        }
    }

    public void d() {
        ReleaseLogUtil.d("Track_PrimaryVoicePlayManager", "dealWithPhoneHangUp");
        for (VoicePlayInterface voicePlayInterface : this.d.values()) {
            if (voicePlayInterface.getType() == 1) {
                voicePlayInterface.resumeVolume();
            }
        }
    }
}
