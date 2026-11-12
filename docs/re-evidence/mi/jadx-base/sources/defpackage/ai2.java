package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class ai2 implements MediaPlayer.OnErrorListener, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f1043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f1044b = null;
    public boolean c;
    public boolean d;

    public ai2(Activity activity) {
        this.f1043a = activity;
        m();
    }

    public static boolean l(SharedPreferences sharedPreferences, Context context) {
        boolean z = sharedPreferences.getBoolean("preferences_play_beep", false);
        if (!z || ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2) {
            return z;
        }
        return false;
    }

    @TargetApi(19)
    public final MediaPlayer a(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(xyi.f39588a);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                mediaPlayer.setOnErrorListener(this);
                mediaPlayer.setAudioStreamType(3);
                mediaPlayer.setLooping(false);
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                assetFileDescriptorOpenRawResourceFd.close();
                return mediaPlayer;
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
        } catch (IOException e) {
            ipe.j(e);
            mediaPlayer.release();
            return null;
        }
    }

    public synchronized void b() {
        MediaPlayer mediaPlayer;
        try {
            if (this.c && (mediaPlayer = this.f1044b) != null) {
                mediaPlayer.start();
            }
            if (this.d) {
                ((Vibrator) this.f1043a.getSystemService("vibrator")).vibrate(200L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(boolean z) {
        this.c = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MediaPlayer mediaPlayer = this.f1044b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f1044b = null;
        }
    }

    public void d(boolean z) {
        this.d = z;
    }

    public synchronized void m() {
        l(PreferenceManager.getDefaultSharedPreferences(this.f1043a), this.f1043a);
        if (this.c && this.f1044b == null) {
            this.f1043a.setVolumeControlStream(3);
            this.f1044b = a(this.f1043a);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            if (i == 100) {
                this.f1043a.finish();
            } else {
                close();
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return true;
    }
}
