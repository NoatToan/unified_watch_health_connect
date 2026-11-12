package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.xiaomi.fitness.common.utils.RomUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(23)
public class wl1 {

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<b> h = new ArrayDeque<>();
    public static final Object i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f38077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f38078b;
    public Handler c;
    public final AtomicReference<RuntimeException> d;
    public final kb4 e;
    public final boolean f;
    public boolean g;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            wl1.this.f(message);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38081b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        public void a(int i, int i2, int i3, long j, int i4) {
            this.f38080a = i;
            this.f38081b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public wl1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new kb4());
    }

    public static void c(s45 s45Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = s45Var.f;
        cryptoInfo.numBytesOfClearData = e(s45Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(s45Var.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) rk1.e(d(s45Var.f33262b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) rk1.e(d(s45Var.f33261a, cryptoInfo.iv));
        cryptoInfo.mode = s45Var.c;
        if (wlq.f38110a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(s45Var.g, s45Var.h));
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b k() {
        ArrayDeque<b> arrayDeque = h;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean m() {
        String strE = fk1.e(wlq.c);
        return strE.contains(RomUtils.SAMSUNG) || strE.contains("motorola");
    }

    public static void p(b bVar) {
        ArrayDeque<b> arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void b() throws InterruptedException {
        this.e.c();
        ((Handler) wlq.j(this.c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    public final void f(Message message) {
        b bVar;
        int i2 = message.what;
        if (i2 == 0) {
            bVar = (b) message.obj;
            g(bVar.f38080a, bVar.f38081b, bVar.c, bVar.e, bVar.f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            h(bVar.f38080a, bVar.f38081b, bVar.d, bVar.e, bVar.f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    public final void g(int i2, int i3, int i4, long j, int i5) {
        try {
            this.f38077a.queueInputBuffer(i2, i3, i4, j, i5);
        } catch (RuntimeException e) {
            q(e);
        }
    }

    public final void h(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j, int i4) {
        try {
            if (!this.f) {
                this.f38077a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                return;
            }
            synchronized (i) {
                this.f38077a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
            }
        } catch (RuntimeException e) {
            q(e);
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

    public final void j() throws InterruptedException {
        ((Handler) wlq.j(this.c)).removeCallbacksAndMessages(null);
        b();
        l();
    }

    public final void l() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void n(int i2, int i3, int i4, long j, int i5) {
        l();
        b bVarK = k();
        bVarK.a(i2, i3, i4, j, i5);
        ((Handler) wlq.j(this.c)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void o(int i2, int i3, s45 s45Var, long j, int i4) {
        l();
        b bVarK = k();
        bVarK.a(i2, i3, 0, j, i4);
        c(s45Var, bVarK.d);
        ((Handler) wlq.j(this.c)).obtainMessage(1, bVarK).sendToTarget();
    }

    @VisibleForTesting
    public void q(RuntimeException runtimeException) {
        this.d.set(runtimeException);
    }

    public void r() {
        if (this.g) {
            i();
            this.f38078b.quit();
        }
        this.g = false;
    }

    public void s() {
        if (this.g) {
            return;
        }
        this.f38078b.start();
        this.c = new a(this.f38078b.getLooper());
        this.g = true;
    }

    public void t() throws InterruptedException {
        b();
    }

    @VisibleForTesting
    public wl1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, kb4 kb4Var) {
        this.f38077a = mediaCodec;
        this.f38078b = handlerThread;
        this.e = kb4Var;
        this.d = new AtomicReference<>();
        this.f = z || m();
    }
}
