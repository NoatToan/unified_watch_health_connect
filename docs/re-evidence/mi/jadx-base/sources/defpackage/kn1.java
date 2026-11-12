package defpackage;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class kn1 implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f24011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f24012b = new a(this, Looper.getMainLooper());
    public boolean c;
    public String d;
    public ewc e;
    public boolean f;
    public boolean g;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<kn1> f24013a;

        public a(kn1 kn1Var, Looper looper) {
            super(looper);
            this.f24013a = new WeakReference<>(kn1Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ewc ewcVar;
            super.handleMessage(message);
            kn1 kn1Var = this.f24013a.get();
            if (kn1Var == null || (ewcVar = kn1Var.e) == null) {
                return;
            }
            String strF = kn1Var.f();
            switch (message.what) {
                case 0:
                    ewcVar.onInit(strF);
                    break;
                case 1:
                    ewcVar.onPlayed(strF);
                    break;
                case 2:
                    ewcVar.onPaused(strF);
                    break;
                case 3:
                    ewcVar.onFinished(strF);
                    break;
                case 4:
                    ewcVar.onProgress(strF, kn1Var.k(), kn1Var.e());
                    break;
                case 5:
                    ewcVar.onError(strF, (String) message.obj);
                    removeCallbacksAndMessages(null);
                    break;
                case 6:
                    ewcVar.onReset((String) message.obj);
                    break;
                case 7:
                    ewcVar.onStopped((String) message.obj);
                    break;
            }
        }
    }

    public final long e() {
        if (g()) {
            return this.f24011a.getDuration();
        }
        return 0L;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f24011a != null && this.c;
    }

    public void h() {
        try {
            MediaPlayer mediaPlayer = this.f24011a;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
                this.g = true;
                this.f24012b.sendEmptyMessage(2);
            }
        } catch (IllegalStateException e) {
            Logger.e(AIApiConstants.AudioPlayer.NAME, "do pause ", e);
        }
    }

    public final void i(String str) {
        n(str);
    }

    public void j(String str, ewc ewcVar) {
        ewc ewcVar2;
        if (!FileUtils.isExists(str)) {
            Logger.e(AIApiConstants.AudioPlayer.NAME, "%s is not exits", str, new Object[0]);
            return;
        }
        if (this.f24011a == null) {
            this.f24011a = new MediaPlayer();
        }
        if (!TextUtils.equals(str, this.d) && (ewcVar2 = this.e) != null) {
            ewcVar2.onReset(this.d);
            q();
        }
        this.e = ewcVar;
        if (g() && this.f24011a.isPlaying()) {
            h();
        } else if (this.g && TextUtils.equals(str, this.d)) {
            p();
        } else {
            i(str);
        }
    }

    public final long k() {
        if (this.f) {
            return e();
        }
        if (this.f24011a == null) {
            return 0L;
        }
        if (g() && this.f24011a.isPlaying()) {
            this.f24012b.sendEmptyMessageDelayed(4, 500L);
        }
        return this.f24011a.getCurrentPosition();
    }

    public void l() {
        MediaPlayer mediaPlayer = this.f24011a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f24011a = null;
            this.c = false;
            this.f24012b.removeCallbacksAndMessages(null);
        }
    }

    public long m(long j) {
        try {
            MediaPlayer mediaPlayer = this.f24011a;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo((int) j);
            }
        } catch (IllegalStateException e) {
            Logger.e(AIApiConstants.AudioPlayer.NAME, "do seekTo ", e);
        }
        return j;
    }

    public final void n(String str) {
        if (!FileUtils.isExists(str)) {
            throw new IllegalArgumentException("path is not exists:" + str);
        }
        this.d = str;
        this.f24012b.removeCallbacksAndMessages(null);
        this.f24012b.obtainMessage(0, this.d).sendToTarget();
        o(this.f24011a, str);
        this.f = false;
    }

    public final void o(MediaPlayer mediaPlayer, String str) {
        mediaPlayer.reset();
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        try {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(2).build();
            mediaPlayer.setDataSource(str);
            mediaPlayer.setAudioAttributes(audioAttributesBuild);
            mediaPlayer.prepare();
        } catch (Exception e) {
            Logger.e(AIApiConstants.AudioPlayer.NAME, "setDataSource error ", e);
            mediaPlayer.release();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f24012b.removeMessages(4);
        this.f24012b.sendEmptyMessage(3);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = String.format(Locale.US, "AudioPlayer Error what: %d, extra: %d, path:%s", Integer.valueOf(i), Integer.valueOf(i2), this.d);
        Logger.e(AIApiConstants.AudioPlayer.NAME, str);
        this.c = false;
        this.f24011a.release();
        this.f24011a = null;
        this.f24012b.obtainMessage(5, str).sendToTarget();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.c = true;
        p();
    }

    public final void p() {
        try {
            this.f24011a.start();
            this.g = false;
            this.f24012b.sendEmptyMessage(1);
            this.f24012b.sendEmptyMessage(4);
        } catch (IllegalStateException e) {
            Logger.e(AIApiConstants.AudioPlayer.NAME, "do start ", e);
        }
    }

    public void q() {
        try {
            if (this.f24011a == null || !g()) {
                return;
            }
            this.f24011a.stop();
            this.c = false;
            this.f24012b.sendEmptyMessage(7);
            this.d = null;
        } catch (IllegalStateException e) {
            Logger.e(AIApiConstants.AudioPlayer.NAME, "do stop ", e);
        }
    }
}
