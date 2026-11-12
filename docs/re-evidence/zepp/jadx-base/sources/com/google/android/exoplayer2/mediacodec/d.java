package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.IntArrayQueue;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
final class d extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;

    @Nullable
    @GuardedBy("lock")
    private MediaFormat h;

    @Nullable
    @GuardedBy("lock")
    private MediaFormat i;

    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CodecException j;

    @GuardedBy("lock")
    private long k;

    @GuardedBy("lock")
    private boolean l;

    @Nullable
    @GuardedBy("lock")
    private IllegalStateException m;
    private final Object a = new Object();

    @GuardedBy("lock")
    private final IntArrayQueue d = new IntArrayQueue();

    @GuardedBy("lock")
    private final IntArrayQueue e = new IntArrayQueue();

    @GuardedBy("lock")
    private final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();

    @GuardedBy("lock")
    private final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    public d(HandlerThread callbackThread) {
        this.b = callbackThread;
    }

    @GuardedBy("lock")
    private void b(MediaFormat mediaFormat) {
        this.e.add(-2);
        this.g.add(mediaFormat);
    }

    @GuardedBy("lock")
    private void f() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    @GuardedBy("lock")
    private boolean i() {
        return this.k > 0 || this.l;
    }

    @GuardedBy("lock")
    private void k() {
        l();
        m();
    }

    @GuardedBy("lock")
    private void l() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    @GuardedBy("lock")
    private void m() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(Runnable onFlushCompleted) {
        synchronized (this.a) {
            o(onFlushCompleted);
        }
    }

    @GuardedBy("lock")
    private void o(Runnable onFlushCompleted) {
        if (this.l) {
            return;
        }
        long j = this.k - 1;
        this.k = j;
        if (j > 0) {
            return;
        }
        if (j < 0) {
            p(new IllegalStateException());
            return;
        }
        f();
        try {
            onFlushCompleted.run();
        } catch (IllegalStateException e) {
            p(e);
        } catch (Exception e2) {
            p(new IllegalStateException(e2));
        }
    }

    private void p(IllegalStateException e) {
        synchronized (this.a) {
            this.m = e;
        }
    }

    public int c() {
        synchronized (this.a) {
            int iRemove = -1;
            if (i()) {
                return -1;
            }
            k();
            if (!this.d.isEmpty()) {
                iRemove = this.d.remove();
            }
            return iRemove;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            if (i()) {
                return -1;
            }
            k();
            if (this.e.isEmpty()) {
                return -1;
            }
            int iRemove = this.e.remove();
            if (iRemove >= 0) {
                Assertions.checkStateNotNull(this.h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iRemove == -2) {
                this.h = this.g.remove();
            }
            return iRemove;
        }
    }

    public void e(final Runnable onFlushCompleted) {
        synchronized (this.a) {
            this.k++;
            ((Handler) Util.castNonNull(this.c)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(onFlushCompleted);
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec codec) {
        Assertions.checkState(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        codec.setCallback(this, handler);
        this.c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(@NonNull MediaCodec codec, @NonNull MediaCodec.CodecException e) {
        synchronized (this.a) {
            this.j = e;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(@NonNull MediaCodec codec, int index) {
        synchronized (this.a) {
            this.d.add(index);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(@NonNull MediaCodec codec, int index, @NonNull MediaCodec.BufferInfo info) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.i = null;
            }
            this.e.add(index);
            this.f.add(info);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(@NonNull MediaCodec codec, @NonNull MediaFormat format) {
        synchronized (this.a) {
            b(format);
            this.i = null;
        }
    }

    public void q() {
        synchronized (this.a) {
            this.l = true;
            this.b.quit();
            f();
        }
    }
}
