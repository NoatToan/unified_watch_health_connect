package com.huami.mifit.sportlib.tts;

import android.content.Context;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.ConfigUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class RunningPlayer {
    private static RunningPlayer g;
    private b e;
    private final String a = "RunningPlayer";
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private int f = 1;

    private RunningPlayer(Context context) {
        if (b()) {
            this.e = new c(context);
        } else {
            this.e = new e(context);
        }
    }

    private boolean a() {
        boolean zIsVoicePlayEnable = ConfigUtils.isVoicePlayEnable(this.f);
        LogKit.w2f("RunningPlayer", "playCommand:isPause=" + this.b + ";isPhoneRing=" + this.c + ";voicePlayEnable=" + zIsVoicePlayEnable);
        return (this.b || this.c || !zIsVoicePlayEnable) ? false : true;
    }

    private boolean b() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINA.getLanguage()) || Locale.getDefault().getLanguage().equals(Locale.TAIWAN.getLanguage());
    }

    public static synchronized void destroy() {
        RunningPlayer runningPlayer = g;
        if (runningPlayer == null) {
            return;
        }
        try {
            runningPlayer.e.a();
            g.e.b();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        g = null;
    }

    public static synchronized RunningPlayer getInstance() {
        return g;
    }

    public static synchronized void init(Context context) {
        g = new RunningPlayer(context);
    }

    public static synchronized void initIfNeed(Context context) {
        if (g == null) {
            g = new RunningPlayer(context);
        }
    }

    public void cancel() {
        try {
            if (this.e.c()) {
                this.e.a();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void exit() {
        cancel();
        pause(true);
    }

    public boolean isMergePauseAndStop() {
        return this.d;
    }

    public void pause(boolean z) {
        this.b = z;
    }

    public void playDistance(DistanceVoiceInfo distanceVoiceInfo) {
        if (a()) {
            this.e.f(distanceVoiceInfo);
        }
    }

    public void playGPSLost() {
        if (a()) {
            this.e.g();
        }
    }

    public void playGPSRegained() {
        if (a()) {
            this.e.h();
        }
    }

    public void playHRWarn(int i) {
        if (a()) {
            this.e.i(i);
        }
    }

    public void playPaceWarn(int i) {
        if (a()) {
            this.e.j(i);
        }
    }

    public void playPause(int i) {
        if (a() && !isMergePauseAndStop()) {
            this.e.k(i);
        }
        pause(true);
    }

    public void playResume(int i) {
        pause(false);
        if (a()) {
            this.e.l(i);
        }
    }

    public void playSpeedWarn(SpeedVoiceInfo speedVoiceInfo) {
        if (a()) {
            this.e.m(speedVoiceInfo);
        }
    }

    public void playStart() {
        pause(false);
        if (a()) {
            this.e.n();
        }
    }

    public void playStop() {
        pause(false);
        cancel();
        if (a()) {
            this.e.o();
        }
        pause(true);
    }

    public void setForceSpeaker(Context context, boolean z) {
        setForceSpeaker(context, 1.0f, 1.0f, z);
    }

    public void setMergePauseAndStop(boolean z) {
        this.d = z;
    }

    public void setSportType(int i) {
        this.f = i;
    }

    public void updatePhoneRinging(boolean z) {
        this.c = z;
        if (z) {
            cancel();
        }
    }

    public void setForceSpeaker(Context context, float f, boolean z) {
        setForceSpeaker(context, 1.0f, f, z);
    }

    public void setForceSpeaker(Context context, float f, float f2, boolean z) {
        this.e = new e(context, f, f2, z);
    }
}
