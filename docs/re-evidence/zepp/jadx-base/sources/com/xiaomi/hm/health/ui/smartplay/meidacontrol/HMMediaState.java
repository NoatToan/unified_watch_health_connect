package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

/* JADX INFO: loaded from: classes22.dex */
public enum HMMediaState {
    STOPPED,
    PAUSED,
    PLAYING,
    BUFFERING,
    NOTIFICATION_DISABLE,
    DISABLE;

    public static HMMediaState fromState(int state) {
        HMMediaState hMMediaState = PAUSED;
        if (MediaUtil.useMediaSession()) {
            if (state == 1) {
                return STOPPED;
            }
            if (state != 3) {
                return state != 6 ? hMMediaState : BUFFERING;
            }
            return PLAYING;
        }
        if (state == 1) {
            return STOPPED;
        }
        if (state != 3) {
            return state != 8 ? hMMediaState : BUFFERING;
        }
        return PLAYING;
    }
}
