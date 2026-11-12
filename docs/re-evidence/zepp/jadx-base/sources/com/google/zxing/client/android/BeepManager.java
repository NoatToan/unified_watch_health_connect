package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class BeepManager {
    private static final String d = "BeepManager";
    private static final float e = 0.1f;
    private static final long f = 200;
    private final Context a;
    private boolean b = true;
    private boolean c = false;

    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    public class b implements MediaPlayer.OnErrorListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.w(BeepManager.d, "Failed to beep " + i + ", " + i2);
            mediaPlayer.stop();
            mediaPlayer.release();
            return true;
        }
    }

    public BeepManager(Activity activity) {
        activity.setVolumeControlStream(3);
        this.a = activity.getApplicationContext();
    }

    public boolean isBeepEnabled() {
        return this.b;
    }

    public boolean isVibrateEnabled() {
        return this.c;
    }

    public MediaPlayer playBeepSound() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new a());
        mediaPlayer.setOnErrorListener(new b());
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException e2) {
            Log.w(d, e2);
            mediaPlayer.release();
            return null;
        }
    }

    public synchronized void playBeepSoundAndVibrate() {
        if (this.b) {
            playBeepSound();
        }
        if (this.c) {
            ((Vibrator) this.a.getSystemService("vibrator")).vibrate(200L);
        }
    }

    public void setBeepEnabled(boolean z) {
        this.b = z;
    }

    public void setVibrateEnabled(boolean z) {
        this.c = z;
    }
}
