package pa;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import fa.z;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public class b implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque<C2592b> f136669g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f136670h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f136671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f136672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f136673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f136674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fa.f f136675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f136676f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            b bVar = b.this;
            ArrayDeque<C2592b> arrayDeque = b.f136669g;
            bVar.getClass();
            int i14 = message.what;
            C2592b c2592b = null;
            if (i14 == 1) {
                C2592b c2592b2 = (C2592b) message.obj;
                try {
                    bVar.f136671a.queueInputBuffer(c2592b2.f136678a, 0, c2592b2.f136679b, c2592b2.f136681d, c2592b2.f136682e);
                } catch (RuntimeException e4) {
                    AtomicReference<RuntimeException> atomicReference = bVar.f136674d;
                    while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                    }
                }
                c2592b = c2592b2;
            } else if (i14 == 2) {
                C2592b c2592b3 = (C2592b) message.obj;
                int i15 = c2592b3.f136678a;
                MediaCodec.CryptoInfo cryptoInfo = c2592b3.f136680c;
                long j8 = c2592b3.f136681d;
                int i16 = c2592b3.f136682e;
                try {
                    synchronized (b.f136670h) {
                        bVar.f136671a.queueSecureInputBuffer(i15, 0, cryptoInfo, j8, i16);
                    }
                } catch (RuntimeException e14) {
                    AtomicReference<RuntimeException> atomicReference2 = bVar.f136674d;
                    while (!atomicReference2.compareAndSet(null, e14) && atomicReference2.get() == null) {
                    }
                }
                c2592b = c2592b3;
            } else if (i14 == 3) {
                bVar.f136675e.a();
            } else if (i14 != 4) {
                AtomicReference<RuntimeException> atomicReference3 = bVar.f136674d;
                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i14));
                while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                }
            } else {
                try {
                    bVar.f136671a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e15) {
                    AtomicReference<RuntimeException> atomicReference4 = bVar.f136674d;
                    while (!atomicReference4.compareAndSet(null, e15) && atomicReference4.get() == null) {
                    }
                }
            }
            if (c2592b != null) {
                ArrayDeque<C2592b> arrayDeque2 = b.f136669g;
                synchronized (arrayDeque2) {
                    arrayDeque2.add(c2592b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: pa.b$b, reason: collision with other inner class name */
    public static class C2592b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f136679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f136680c = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f136681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f136682e;
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, fa.f fVar) {
        this.f136671a = mediaCodec;
        this.f136672b = handlerThread;
        this.f136675e = fVar;
        this.f136674d = new AtomicReference<>();
    }

    public static C2592b d() {
        ArrayDeque<C2592b> arrayDeque = f136669g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C2592b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pa.g
    public final void a(int i14, int i15, int i16, long j8) {
        c();
        C2592b c2592bD = d();
        c2592bD.f136678a = i14;
        c2592bD.f136679b = i15;
        c2592bD.f136681d = j8;
        c2592bD.f136682e = i16;
        a aVar = this.f136673c;
        int i17 = z.f70071a;
        aVar.obtainMessage(1, c2592bD).sendToTarget();
    }

    @Override // pa.g
    public final void b(int i14, ia.b bVar, long j8, int i15) {
        c();
        C2592b c2592bD = d();
        c2592bD.f136678a = i14;
        c2592bD.f136679b = 0;
        c2592bD.f136681d = j8;
        c2592bD.f136682e = i15;
        MediaCodec.CryptoInfo cryptoInfo = c2592bD.f136680c;
        cryptoInfo.numSubSamples = bVar.f92378f;
        int[] iArr = bVar.f92376d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = bVar.f92377e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = bVar.f92374b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = bVar.f92373a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = bVar.f92375c;
        if (z.f70071a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f92379g, bVar.f92380h));
        }
        this.f136673c.obtainMessage(2, c2592bD).sendToTarget();
    }

    @Override // pa.g
    public final void c() {
        RuntimeException andSet = this.f136674d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // pa.g
    public final void flush() {
        if (this.f136676f) {
            try {
                a aVar = this.f136673c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                fa.f fVar = this.f136675e;
                synchronized (fVar) {
                    fVar.f70013b = false;
                }
                a aVar2 = this.f136673c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (fVar) {
                    while (!fVar.f70013b) {
                        fVar.wait();
                    }
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                l2.p(e4);
            }
        }
    }

    @Override // pa.g
    public final void setParameters(Bundle bundle) {
        c();
        a aVar = this.f136673c;
        int i14 = z.f70071a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // pa.g
    public final void shutdown() {
        if (this.f136676f) {
            flush();
            this.f136672b.quit();
        }
        this.f136676f = false;
    }

    @Override // pa.g
    public final void start() {
        if (this.f136676f) {
            return;
        }
        HandlerThread handlerThread = this.f136672b;
        handlerThread.start();
        this.f136673c = new a(handlerThread.getLooper());
        this.f136676f = true;
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new fa.f());
    }
}
