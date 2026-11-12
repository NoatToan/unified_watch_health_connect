package com.xiaomi.hm.health.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.android.internal.telephony.ITelephony;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.utils.HMPhoneUtil;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class HMPhoneUtil {
    private static final String a = "HMPhoneUtil";
    private static int b = -1;
    private static MediaPlayer c;

    private static boolean b(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return false;
            }
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            Method declaredMethod = TelecomManager.class.getDeclaredMethod("endCall", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(telecomManager, new Object[0])).booleanValue();
        } catch (Exception e) {
            HMLog.i(a, "endCallInternal:" + e.getMessage(), new Object[0]);
            return false;
        }
    }

    private static ITelephony c(Context context) throws Exception {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            HMLog.info(a, new Function0() { // from class: fc3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMPhoneUtil.d();
                }
            });
            return null;
        }
        Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getITelephony", null);
        declaredMethod.setAccessible(true);
        return (ITelephony) declaredMethod.invoke(telephonyManager, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d() {
        return "TelephonyManager is null.";
    }

    public static void endCall(Context context) {
        boolean zEndCall;
        if (Build.VERSION.SDK_INT >= 28) {
            zEndCall = b(context);
            HMLog.i(a, "P or higher invoke TelecomManager endCall", new Object[0]);
        } else {
            try {
                ITelephony iTelephonyC = c(context);
                if (iTelephonyC != null) {
                    HMLog.i(a, "endCall", new Object[0]);
                    zEndCall = iTelephonyC.endCall();
                } else {
                    HMLog.i(a, "iTelephony is null", new Object[0]);
                    zEndCall = false;
                }
            } catch (Exception e) {
                HMLog.i(a, "endCall:" + e.getMessage(), new Object[0]);
            }
        }
        HMLog.d(a, "endCall ret:" + zEndCall, new Object[0]);
    }

    public static boolean isUseMifitSmsNotify() {
        return HMDeviceConfig.hasFeatureG3Device();
    }

    public static synchronized void startRing(Context context, boolean z) {
        HMLog.i(a, "startRing:" + z + " and media player: " + c, new Object[0]);
        MediaPlayer mediaPlayer = c;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            HMLog.i(a, "startRing return as mediaPlay", new Object[0]);
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        b = audioManager.getStreamVolume(3);
        audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
        if (z) {
            try {
                Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(context, 1);
                Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                c = MediaPlayer.create(context, uri);
                HMLog.i(a, "TYPE_RINGTONE:" + actualDefaultRingtoneUri + "; mediaPlayer is: " + c + "; default ringtone uri: " + uri, new Object[0]);
            } catch (Exception e) {
                HMLog.i(a, "startRing Exception:" + e.getMessage(), new Object[0]);
            }
        }
        if (!z || c == null) {
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd("findphone.mp3");
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            c = mediaPlayer2;
            mediaPlayer2.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            c.prepare();
        }
        c.setLooping(true);
        c.start();
    }

    public static synchronized void stopRing(Context context) {
        HMLog.i(a, "stopRing and previous volume: " + b + "; and media player is: " + c, new Object[0]);
        if (b != -1) {
            ((AudioManager) context.getSystemService("audio")).setStreamVolume(3, b, 0);
            b = -1;
        }
        MediaPlayer mediaPlayer = c;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            c.release();
            c = null;
        }
    }
}
