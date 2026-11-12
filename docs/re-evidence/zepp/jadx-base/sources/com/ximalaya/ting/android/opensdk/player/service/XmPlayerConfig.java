package com.ximalaya.ting.android.opensdk.player.service;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.FloatRange;
import com.ximalaya.ting.android.opensdk.constants.PreferenceConstantsInOpenSdk;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.util.BaseUtil;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerConfig {
    private static final int PREFERENCE_MODE = 4;
    public static boolean monitorNetWorkChangeAndTryPlay = true;
    private static boolean noHandleAudioFocus = false;
    private static XmPlayerConfig sInstance;
    private static byte[] sLock = new byte[0];
    private Context mAppCtx;
    private SharedPreferences mPreferences;
    private float volume = 0.0f;

    private XmPlayerConfig(Context context) {
        this.mAppCtx = context.getApplicationContext();
        init();
    }

    @TargetApi(9)
    private void apply(SharedPreferences.Editor editor) {
        if (editor.commit() && BaseUtil.isMainProcess(this.mAppCtx)) {
            XmPlayerManager.getInstance(this.mAppCtx).notifiyConfigChange();
        }
    }

    public static XmPlayerConfig getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new XmPlayerConfig(context);
                }
            }
        }
        return sInstance;
    }

    private void init() {
        this.mPreferences = this.mAppCtx.getSharedPreferences(PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_XMPLAYER_CONFIG, 4);
    }

    public static boolean isNoHandleAudioFocus() {
        return noHandleAudioFocus;
    }

    public static void setNoHandleAudioFocus(boolean z) {
        noHandleAudioFocus = z;
    }

    public String getDefaultNotificationNickName() {
        return this.mPreferences.getString(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_NOTIFICATION_NICK_NAME, "喜马拉雅");
    }

    public String getDefualtNotificationInfo() {
        return this.mPreferences.getString(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_NOTIFICATION_INFO_NAME, "随时随地 听我想听");
    }

    public boolean getIsUseSystemPlayer() {
        return isUseSystemPlayer();
    }

    public float getReceviceDuckVolume() {
        float f = this.volume;
        if (f != 0.0f) {
            return f;
        }
        float f2 = this.mPreferences.getFloat(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_RECEVICE_AUDIO_FOCUS_TYPE_DUCK_VOLUME, 0.3f);
        this.volume = f2;
        return f2;
    }

    public boolean isBreakpointResume() {
        if (this.mPreferences.contains(PreferenceConstantsInOpenSdk.OPENSDK_KEY_BREAKPOINT_RESUME)) {
            return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_BREAKPOINT_RESUME, false);
        }
        return true;
    }

    public boolean isSDKHandleAudioFocus() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_HANDLE_AUDIO_FOCUS, true);
    }

    public boolean isSDKHandleHeadsetPlugAudioFocus() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_HANDLE_HEADSET_PLUG_AUDIO_FOCUS, true);
    }

    public boolean isSDKHandlePhoneComeAudioFocus() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_HANDLE_PHONECOME_AUDIO_FOCUS, true);
    }

    public boolean isUsePreventHijack() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_USE_PREVENT_HIJACK, false);
    }

    public boolean isUseRadioHighBitrate() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_USE_RADIO_HIGH_BITRATE, false);
    }

    public boolean isUseSystemLockScreen() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_USE_SYSTEM_LOCK_SCREEN, true);
    }

    public boolean isUseSystemPlayer() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_USE_SYSTEM_PLAYER, false);
    }

    public boolean isUseTrackHighBitrate() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_USE_TRACK_HIGH_BITRATE, false);
    }

    public void onConfigChange() {
        this.mPreferences = this.mAppCtx.getSharedPreferences(PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_XMPLAYER_CONFIG, 4);
    }

    public void release() {
        synchronized (sLock) {
            sInstance = null;
        }
    }

    public void setBreakpointResume(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_BREAKPOINT_RESUME, z));
    }

    public void setDefualtNotificationNickNameAndInfo(String str, String str2) {
        apply(this.mPreferences.edit().putString(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_NOTIFICATION_NICK_NAME, str));
        apply(this.mPreferences.edit().putString(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_NOTIFICATION_INFO_NAME, str2));
    }

    public void setNotifactionOnNoSet(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_USE_NOTIFICATION_STRATEGY, z));
    }

    public void setReceviceDuckVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        apply(this.mPreferences.edit().putFloat(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_RECEVICE_AUDIO_FOCUS_TYPE_DUCK_VOLUME, f));
    }

    public void setSDKHandleAudioFocus(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_HANDLE_AUDIO_FOCUS, z));
    }

    public void setSDKHandleHeadsetPlugAudioFocus(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_HANDLE_HEADSET_PLUG_AUDIO_FOCUS, z));
    }

    public void setSDKHandlePhoneComeAudioFocus(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_HANDLE_PHONECOME_AUDIO_FOCUS, z));
    }

    public void setUseRadioHighBitrate(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_USE_RADIO_HIGH_BITRATE, z));
    }

    public void setUseSystemLockScreen(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_USE_SYSTEM_LOCK_SCREEN, z));
    }

    public void setUseSystemPlayer(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_USE_SYSTEM_PLAYER, z));
    }

    public void setUseTrackHighBitrate(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_USE_TRACK_HIGH_BITRATE, z));
    }

    public boolean useNotifactionOnNoSet() {
        return this.mPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_USE_NOTIFICATION_STRATEGY, true);
    }

    public void usePreventHijack(boolean z) {
        apply(this.mPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_USE_PREVENT_HIJACK, z));
    }
}
