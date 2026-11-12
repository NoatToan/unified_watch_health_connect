package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
class b {
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<C0151b> k = new ArrayDeque<>();
    private static final Object l = new Object();
    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference<RuntimeException> d;
    private final ConditionVariable e;
    private final boolean f;
    private boolean g;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            b.this.f(msg);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b$b, reason: collision with other inner class name */
    public static class C0151b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        public void a(int index, int offset, int size, long presentationTimeUs, int flags) {
            this.a = index;
            this.b = offset;
            this.c = size;
            this.e = presentationTimeUs;
            this.f = flags;
        }
    }

    public b(MediaCodec codec, HandlerThread queueingThread, boolean forceQueueingSynchronizationWorkaround) {
        this(codec, queueingThread, forceQueueingSynchronizationWorkaround, new ConditionVariable());
    }

    private void b() throws InterruptedException {
        this.e.close();
        ((Handler) Util.castNonNull(this.c)).obtainMessage(2).sendToTarget();
        this.e.block();
    }

    private static void c(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo frameworkCryptoInfo) {
        frameworkCryptoInfo.numSubSamples = cryptoInfo.numSubSamples;
        frameworkCryptoInfo.numBytesOfClearData = e(cryptoInfo.numBytesOfClearData, frameworkCryptoInfo.numBytesOfClearData);
        frameworkCryptoInfo.numBytesOfEncryptedData = e(cryptoInfo.numBytesOfEncryptedData, frameworkCryptoInfo.numBytesOfEncryptedData);
        frameworkCryptoInfo.key = (byte[]) Assertions.checkNotNull(d(cryptoInfo.key, frameworkCryptoInfo.key));
        frameworkCryptoInfo.iv = (byte[]) Assertions.checkNotNull(d(cryptoInfo.iv, frameworkCryptoInfo.iv));
        frameworkCryptoInfo.mode = cryptoInfo.mode;
        if (Util.SDK_INT >= 24) {
            frameworkCryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    @Nullable
    private static byte[] d(@Nullable byte[] src, @Nullable byte[] dst) {
        if (src == null) {
            return dst;
        }
        if (dst == null || dst.length < src.length) {
            return Arrays.copyOf(src, src.length);
        }
        System.arraycopy(src, 0, dst, 0, src.length);
        return dst;
    }

    @Nullable
    private static int[] e(@Nullable int[] src, @Nullable int[] dst) {
        if (src == null) {
            return dst;
        }
        if (dst == null || dst.length < src.length) {
            return Arrays.copyOf(src, src.length);
        }
        System.arraycopy(src, 0, dst, 0, src.length);
        return dst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message msg) {
        C0151b c0151b;
        int i2 = msg.what;
        if (i2 == 0) {
            c0151b = (C0151b) msg.obj;
            g(c0151b.a, c0151b.b, c0151b.c, c0151b.e, c0151b.f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                q(new IllegalStateException(String.valueOf(msg.what)));
            } else {
                this.e.open();
            }
            c0151b = null;
        } else {
            c0151b = (C0151b) msg.obj;
            h(c0151b.a, c0151b.b, c0151b.d, c0151b.e, c0151b.f);
        }
        if (c0151b != null) {
            p(c0151b);
        }
    }

    private void g(int index, int offset, int size, long presentationTimeUs, int flag) {
        try {
            this.a.queueInputBuffer(index, offset, size, presentationTimeUs, flag);
        } catch (RuntimeException e) {
            q(e);
        }
    }

    private void h(int index, int offset, MediaCodec.CryptoInfo info, long presentationTimeUs, int flags) {
        try {
            if (!this.f) {
                this.a.queueSecureInputBuffer(index, offset, info, presentationTimeUs, flags);
                return;
            }
            synchronized (l) {
                this.a.queueSecureInputBuffer(index, offset, info, presentationTimeUs, flags);
            }
        } catch (RuntimeException e) {
            q(e);
        }
    }

    private void j() throws InterruptedException {
        ((Handler) Util.castNonNull(this.c)).removeCallbacksAndMessages(null);
        b();
        l();
    }

    private static C0151b k() {
        ArrayDeque<C0151b> arrayDeque = k;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C0151b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static boolean m() {
        String lowerCase = Ascii.toLowerCase(Util.MANUFACTURER);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    private static void p(C0151b params) {
        ArrayDeque<C0151b> arrayDeque = k;
        synchronized (arrayDeque) {
            arrayDeque.add(params);
        }
    }

    public void i() {
        if (this.g) {
            try {
                j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void n(int index, int offset, int size, long presentationTimeUs, int flags) {
        l();
        C0151b c0151bK = k();
        c0151bK.a(index, offset, size, presentationTimeUs, flags);
        ((Handler) Util.castNonNull(this.c)).obtainMessage(0, c0151bK).sendToTarget();
    }

    public void o(int index, int offset, CryptoInfo info, long presentationTimeUs, int flags) {
        l();
        C0151b c0151bK = k();
        c0151bK.a(index, offset, 0, presentationTimeUs, flags);
        c(info, c0151bK.d);
        ((Handler) Util.castNonNull(this.c)).obtainMessage(1, c0151bK).sendToTarget();
    }

    @VisibleForTesting
    public void q(RuntimeException exception) {
        this.d.set(exception);
    }

    public void r() {
        if (this.g) {
            i();
            this.b.quit();
        }
        this.g = false;
    }

    public void s() {
        if (this.g) {
            return;
        }
        this.b.start();
        this.c = new a(this.b.getLooper());
        this.g = true;
    }

    public void t() throws InterruptedException {
        b();
    }

    @VisibleForTesting
    public b(MediaCodec codec, HandlerThread handlerThread, boolean forceQueueingSynchronizationWorkaround, ConditionVariable conditionVariable) {
        this.a = codec;
        this.b = handlerThread;
        this.e = conditionVariable;
        this.d = new AtomicReference<>();
        this.f = forceQueueingSynchronizationWorkaround || m();
    }
}
