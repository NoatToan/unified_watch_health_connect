package com.xiaomi.mi_connect_service.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AudioUtil {
    private static final String ACTION_MI_PLAYER_TOGGLE_PAUSE = "com.miui.player.musicservicecommand.togglepause";
    private static final long CHECK_AUDIO_DURATION = 200;
    private static final int MAGIC_NUMBER_RETRY_OPEN_MUSIC = 5;
    private static final String MI_PLAYER_SERVICE = "com.miui.player.service.MediaPlaybackService";
    private static final String PACKAGE_MI_PLAYER = "com.miui.player";
    private static List<Integer> sCallModes = Arrays.asList(2, 3, 1);
    private static final String TAG = AudioUtil.class.getSimpleName();

    public static class ControlHandle {
        public List<MediaController> controllers;

        public ControlHandle(List<MediaController> list) {
            this.controllers = list;
        }
    }

    public static boolean checkIsSpeakerOn(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn();
    }

    @RequiresApi(api = 21)
    public static ControlHandle getCurrentSessions(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            for (MediaController mediaController : ((MediaSessionManager) context.getSystemService("media_session")).getActiveSessions(null)) {
                PlaybackState playbackState = mediaController.getPlaybackState();
                if (playbackState != null && playbackState.getState() == 3) {
                    arrayList.add(mediaController);
                    StringBuilder sb = new StringBuilder();
                    sb.append("current sessions include:");
                    sb.append(mediaController.getPackageName());
                }
            }
        } catch (Exception e) {
            LogUtil.e(TAG, e.getMessage(), e);
        }
        return new ControlHandle(arrayList);
    }

    public static boolean isCalling(Context context) {
        return sCallModes.contains(Integer.valueOf(((AudioManager) context.getSystemService("audio")).getMode()));
    }

    public static boolean isMusicOn(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isMusicActive();
    }

    @RequiresApi(api = 21)
    public static void resumeControllers(Context context, ControlHandle controlHandle) {
        if (controlHandle == null || controlHandle.controllers == null) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                LogUtil.e(TAG, e.getMessage(), e);
            }
            if (!isMusicOn(context)) {
                for (MediaController mediaController : controlHandle.controllers) {
                    try {
                        if (mediaController.getPlaybackState().getState() == 2) {
                            mediaController.getTransportControls().play();
                        }
                    } catch (Exception e2) {
                        LogUtil.e(TAG, e2.getMessage(), e2);
                    }
                }
                return;
            }
        }
    }

    public static void resumeMiPlayer(Context context) {
        if (isMusicOn(context)) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                    LogUtil.e(TAG, e.getMessage(), e);
                }
                if (!isMusicOn(context)) {
                    LogUtil.v(TAG, "!isMusicOn()", new Object[0]);
                    Intent intent = new Intent(ACTION_MI_PLAYER_TOGGLE_PAUSE);
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setComponent(new ComponentName("com.miui.player", MI_PLAYER_SERVICE));
                    context.startService(intent);
                    return;
                }
                LogUtil.v(TAG, "isMusicOn()", new Object[0]);
            }
        }
    }
}
