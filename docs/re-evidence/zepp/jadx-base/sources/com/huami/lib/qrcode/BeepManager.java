package com.huami.lib.qrcode;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.huami.lib.qrcode.BeepManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class BeepManager {
    private static final String d = "BeepManager";
    private static final float e = 0.1f;
    private static final long f = 200;
    private final Context a;
    private boolean b = true;
    private boolean c = false;

    public BeepManager(Activity activity) {
        activity.setVolumeControlStream(3);
        this.a = activity.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(MediaPlayer mediaPlayer, int i, int i2) {
        Log.w(d, "Failed to beep " + i + ", " + i2);
        mediaPlayer.stop();
        mediaPlayer.release();
        return true;
    }

    public boolean isBeepEnabled() {
        return this.b;
    }

    public boolean isVibrateEnabled() {
        return this.c;
    }

    public void playBeepSound() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ws
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                BeepManager.c(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: xs
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return BeepManager.d(mediaPlayer2, i, i2);
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                if (assetFileDescriptorOpenRawResourceFd != null) {
                    try {
                        assetFileDescriptorOpenRawResourceFd.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            Log.w(d, e2);
            mediaPlayer.release();
        }
    }

    public synchronized void playBeepSoundAndVibrate() {
        if (this.b) {
            playBeepSound();
        }
        if (this.c) {
            Vibrator vibrator = (Vibrator) this.a.getSystemService("vibrator");
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
            } else {
                vibrator.vibrate(200L);
            }
        }
    }

    public void setBeepEnabled(boolean z) {
        this.b = z;
    }

    public void setVibrateEnabled(boolean z) {
        this.c = z;
    }
}
