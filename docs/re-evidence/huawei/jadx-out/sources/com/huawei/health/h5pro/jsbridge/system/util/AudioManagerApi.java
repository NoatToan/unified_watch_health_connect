package com.huawei.health.h5pro.jsbridge.system.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
final class AudioManagerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f6948b;
    private AudioManager d;

    public enum AudioTypeEnum {
        AUDIO_TYPE_MUSIC(3),
        AUDIO_TYPE_RING(2),
        AUDIO_TYPE_SYSTEM(1),
        AUDIO_TYPE_ALARM(4),
        AUDIO_TYPE_NOTIFICATION(5),
        AUDIO_TYPE_VOICE_CALL(0);

        private final int audioType;

        AudioTypeEnum(int i) {
            this.audioType = i;
        }
    }

    public interface AudioVolumeListener {
        void onFailure(int i, String str);

        void onSuccess(int i, int i2, int i3);
    }

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioVolumeListener f6949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTypeEnum f6950b;

        public a(AudioTypeEnum audioTypeEnum, AudioVolumeListener audioVolumeListener) {
            this.f6950b = audioTypeEnum;
            this.f6949a = audioVolumeListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (!TextUtils.equals(action, Constants.VOLUME_CHANGED_ACTION)) {
                LogUtil.w("H5PRO_AudioManagerApi", com.huawei.health.h5pro.core.a.a("onReceive: action -> ", action));
                return;
            }
            int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
            AudioTypeEnum audioTypeEnum = this.f6950b;
            if (audioTypeEnum == null || intExtra != audioTypeEnum.audioType) {
                LogUtil.w("H5PRO_AudioManagerApi", "onReceive: audioType -> " + intExtra);
            } else {
                AudioVolumeListener audioVolumeListener = this.f6949a;
                if (audioVolumeListener != null) {
                    AudioManagerApi.this.d(this.f6950b, audioVolumeListener);
                }
            }
        }
    }

    public AudioManagerApi(Context context) {
        this.d = null;
        this.f6947a = context;
        AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
        this.d = audioManager;
        if (audioManager == null) {
            this.d = (AudioManager) context.getSystemService("audio");
        }
    }

    private AudioTypeEnum c(String str) {
        try {
            return AudioTypeEnum.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AudioTypeEnum audioTypeEnum, AudioVolumeListener audioVolumeListener) {
        AudioManager audioManager = this.d;
        if (audioManager == null) {
            LogUtil.w("H5PRO_AudioManagerApi", "mAudioManager is null");
        } else {
            audioVolumeListener.onSuccess(audioManager.getStreamVolume(audioTypeEnum.audioType), this.d.getStreamMaxVolume(audioTypeEnum.audioType), Build.VERSION.SDK_INT >= 28 ? this.d.getStreamMinVolume(audioTypeEnum.audioType) : 0);
        }
    }

    public void b(String str, AudioVolumeListener audioVolumeListener) {
        d();
        AudioTypeEnum audioTypeEnumC = c(str);
        if (audioTypeEnumC == null) {
            Locale locale = Locale.ENGLISH;
            audioVolumeListener.onFailure(-1, "registerAudioVolumeChangeListener: Invalid parameter '" + str + "'");
            return;
        }
        if (this.f6947a == null) {
            LogUtil.w("H5PRO_AudioManagerApi", "registerAudioVolumeChangeListener: mContext is null");
            return;
        }
        d(audioTypeEnumC, audioVolumeListener);
        a aVar = new a(audioTypeEnumC, audioVolumeListener);
        this.f6948b = aVar;
        this.f6947a.registerReceiver(aVar, new IntentFilter(Constants.VOLUME_CHANGED_ACTION));
    }

    public void d() {
        a aVar;
        Context context = this.f6947a;
        if (context != null && (aVar = this.f6948b) != null) {
            context.unregisterReceiver(aVar);
        }
        this.f6948b = null;
    }

    public void d(String str, int i, AudioVolumeListener audioVolumeListener) {
        AudioTypeEnum audioTypeEnumC = c(str);
        if (audioTypeEnumC != null) {
            this.d.setStreamVolume(audioTypeEnumC.audioType, Math.min(i, this.d.getStreamMaxVolume(audioTypeEnumC.audioType)), 0);
            d(audioTypeEnumC, audioVolumeListener);
            return;
        }
        Locale locale = Locale.ENGLISH;
        audioVolumeListener.onFailure(-1, "setAudioVolume: Invalid parameter '" + str + "'");
    }

    public void d(String str, AudioVolumeListener audioVolumeListener) {
        AudioTypeEnum audioTypeEnumC = c(str);
        if (audioTypeEnumC != null) {
            d(audioTypeEnumC, audioVolumeListener);
            return;
        }
        Locale locale = Locale.ENGLISH;
        audioVolumeListener.onFailure(-1, "getAudioVolume: Invalid parameter '" + str + "'");
    }
}
