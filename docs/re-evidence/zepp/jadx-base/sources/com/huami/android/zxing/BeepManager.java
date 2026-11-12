package com.huami.android.zxing;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import com.huami.android.qrcode.R;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class BeepManager implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, Closeable {
    private static final String e = BeepManager.class.getSimpleName();
    private static final float f = 0.1f;
    private static final long g = 200;
    private final Activity a;
    private boolean c;
    private boolean d = true;
    private MediaPlayer b = null;

    public BeepManager(Activity activity) {
        this.a = activity;
        updatePrefs();
    }

    private MediaPlayer a(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(R.raw.beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                return mediaPlayer;
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException e2) {
            Log.w(e, e2);
            mediaPlayer.release();
            return null;
        }
    }

    private static boolean b(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.b = null;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            if (i == 100) {
                this.a.finish();
            } else {
                mediaPlayer.release();
                this.b = null;
                updatePrefs();
            }
        } catch (Throwable th) {
            throw th;
        }
        return true;
    }

    public synchronized void playBeepSoundAndVibrate() {
        MediaPlayer mediaPlayer;
        if (this.c && (mediaPlayer = this.b) != null) {
            mediaPlayer.start();
        }
        if (this.d) {
            ((Vibrator) this.a.getSystemService("vibrator")).vibrate(200L);
        }
    }

    public synchronized void updatePrefs() {
        boolean zB = b(this.a);
        this.c = zB;
        if (zB && this.b == null) {
            this.a.setVolumeControlStream(3);
            this.b = a(this.a);
        }
    }
}
