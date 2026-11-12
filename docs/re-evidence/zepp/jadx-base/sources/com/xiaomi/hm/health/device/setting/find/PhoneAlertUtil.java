package com.xiaomi.hm.health.device.setting.find;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.provider.Settings;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes18.dex */
public class PhoneAlertUtil {
    private static final String a = "HMPhoneUtil";
    private static int b = -1;
    private static MediaPlayer c;
    private static Vibrator d;

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
