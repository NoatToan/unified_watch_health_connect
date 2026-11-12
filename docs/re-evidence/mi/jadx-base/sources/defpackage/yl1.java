package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(23)
public final class yl1 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f40281b;
    public Handler c;

    @GuardedBy("lock")
    public MediaFormat h;

    @GuardedBy("lock")
    public MediaFormat i;

    @GuardedBy("lock")
    public MediaCodec.CodecException j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("lock")
    public long f40282k;

    @GuardedBy("lock")
    public boolean l;

    @GuardedBy("lock")
    public IllegalStateException m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40280a = new Object();

    @GuardedBy("lock")
    public final fcd d = new fcd();

    @GuardedBy("lock")
    public final fcd e = new fcd();

    @GuardedBy("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();

    @GuardedBy("lock")
    public final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    public yl1(HandlerThread handlerThread) {
        this.f40281b = handlerThread;
    }

    @GuardedBy("lock")
    public final void b(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f40280a) {
            try {
                int iE = -1;
                if (i()) {
                    return -1;
                }
                k();
                if (!this.d.d()) {
                    iE = this.d.e();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f40280a) {
            try {
                if (i()) {
                    return -1;
                }
                k();
                if (this.e.d()) {
                    return -1;
                }
                int iE = this.e.e();
                if (iE >= 0) {
                    rk1.i(this.h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.h = this.g.remove();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(final Runnable runnable) {
        synchronized (this.f40280a) {
            this.f40282k++;
            ((Handler) wlq.j(this.c)).post(new Runnable() { // from class: xl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39224a.j(runnable);
                }
            });
        }
    }

    @GuardedBy("lock")
    public final void f() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f40280a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        rk1.g(this.c == null);
        this.f40281b.start();
        Handler handler = new Handler(this.f40281b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    @GuardedBy("lock")
    public final boolean i() {
        return this.f40282k > 0 || this.l;
    }

    @GuardedBy("lock")
    public final void k() {
        l();
        m();
    }

    @GuardedBy("lock")
    public final void l() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    @GuardedBy("lock")
    public final void m() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void j(Runnable runnable) {
        synchronized (this.f40280a) {
            o(runnable);
        }
    }

    @GuardedBy("lock")
    public final void o(Runnable runnable) {
        if (this.l) {
            return;
        }
        long j = this.f40282k - 1;
        this.f40282k = j;
        if (j > 0) {
            return;
        }
        if (j < 0) {
            p(new IllegalStateException());
            return;
        }
        f();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            p(e);
        } catch (Exception e2) {
            p(new IllegalStateException(e2));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f40280a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f40280a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f40280a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f40280a) {
            b(mediaFormat);
            this.i = null;
        }
    }

    public final void p(IllegalStateException illegalStateException) {
        synchronized (this.f40280a) {
            this.m = illegalStateException;
        }
    }

    public void q() {
        synchronized (this.f40280a) {
            this.l = true;
            this.f40281b.quit();
            f();
        }
    }
}
