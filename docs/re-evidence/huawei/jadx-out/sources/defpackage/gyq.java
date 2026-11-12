package defpackage;

import android.media.MediaPlayer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class gyq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36240b = new Object();
    private static gyq d;
    private MediaPlayer e;

    private gyq() {
    }

    public static gyq e() {
        gyq gyqVar;
        synchronized (f36240b) {
            if (d == null) {
                d = new gyq();
            }
            gyqVar = d;
        }
        return gyqVar;
    }

    public boolean a(int i) {
        return e(i, (IBaseResponseCallback) null);
    }

    private boolean e(final int i, final IBaseResponseCallback iBaseResponseCallback) {
        lsy.a(new Runnable() { // from class: gyq.2
            @Override // java.lang.Runnable
            public void run() {
                gyq.this.e = MediaPlayer.create(BaseApplication.b(), i);
                if (gyq.this.e != null) {
                    try {
                        gyq.this.e.start();
                    } catch (IllegalStateException e) {
                        LogUtil.j("Track_VoicePlayManager", "playVoice IllegalStateException ", e.getMessage());
                    }
                    gyq.this.e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: gyq.2.1
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            LogUtil.a("Track_VoicePlayManager", "playVoice onCompletion ");
                            if (gyq.this.e != null) {
                                gyq.this.e.stop();
                                gyq.this.e.reset();
                                gyq.this.e.release();
                            }
                            gyq.this.e = null;
                            if (iBaseResponseCallback != null) {
                                iBaseResponseCallback.onResponse(0, new Object());
                            }
                        }
                    });
                    return;
                }
                LogUtil.j("Track_VoicePlayManager", "playVoice fail");
            }
        });
        return true;
    }
}
