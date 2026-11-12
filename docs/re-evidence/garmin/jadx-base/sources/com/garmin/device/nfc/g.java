package com.garmin.device.nfc;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import hk0.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import lc.u0;
import o62.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f50865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final it2.d f50866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final it2.e f50867d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f50871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Thread f50872i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f50874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f50875l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f50868e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<c> f50869f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<k, d> f50870g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f50873j = new HandlerThread("NfcServiceDispatcher_HandlerThread");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedBlockingQueue<i> f50876m = new LinkedBlockingQueue<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f50877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f50878b;

        public a(int i14, i iVar) {
            this.f50877a = i14;
            this.f50878b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (g.this.f50869f) {
                try {
                    c cVar = g.this.f50869f.get(this.f50877a);
                    if (cVar == null) {
                        return;
                    }
                    f fVar = cVar.f50881a;
                    g.this.f50869f.remove(this.f50877a);
                    if (fVar != null) {
                        g.this.f50865b.debug("Transaction " + this.f50877a + " timed out");
                        fVar.b(this.f50878b.b());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public class b implements f {
        public b() {
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(i iVar) {
            g.this.f50865b.info("onResponse: [type: " + iVar.f().toString() + "]");
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            g.this.f50865b.info("onFailedToReceiveResponse: " + i14);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f50881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f50882b;

        public c(g gVar, f fVar, Runnable runnable) {
            this.f50881a = fVar;
            this.f50882b = runnable;
        }
    }

    public interface d {
        void a(i iVar, b0 b0Var);
    }

    public interface e {
        void a(i iVar);
    }

    public interface f extends e {
        void b(int i14);
    }

    public g(String str, InputStream inputStream, OutputStream outputStream, com.garmin.device.nfc.f fVar) {
        d aVar;
        String str2 = "PAY#NFC#ServiceDispatcher@" + Long.toHexString(hashCode()) + " [" + str + "]";
        this.f50864a = str2;
        this.f50865b = LoggerFactory.getLogger(str2);
        this.f50866c = new it2.d(inputStream, 65536);
        this.f50867d = new it2.e(outputStream);
        for (k kVar : k.values()) {
            ((l) fVar).getClass();
            str.getClass();
            kVar.getClass();
            int i14 = l.a.f84076a[kVar.ordinal()];
            if (i14 == 1) {
                aVar = new com.garmin.device.nfc.a();
            } else {
                if (i14 != 2) {
                    u0.r();
                    throw null;
                }
                aVar = new in2.d(str);
            }
            this.f50870g.put(kVar, aVar);
        }
        this.f50873j.start();
        this.f50875l = new Handler(this.f50873j.getLooper());
    }

    public final d a(i iVar) {
        try {
            int iB = iVar.b();
            k.f50919b.getClass();
            for (k kVar : k.values()) {
                if (kVar.f50923a == iB) {
                    Objects.requireNonNull(kVar);
                    d dVar = this.f50870g.get(kVar);
                    Objects.requireNonNull(dVar);
                    return dVar;
                }
            }
            kVar = null;
            Objects.requireNonNull(kVar);
            d dVar2 = this.f50870g.get(kVar);
            Objects.requireNonNull(dVar2);
            return dVar2;
        } catch (Throwable unused) {
            return new d() { // from class: pl2.n
                @Override // com.garmin.device.nfc.g.d
                public final void a(com.garmin.device.nfc.i iVar2, b0 b0Var) {
                    this.f138594a.f50865b.warn("Received message from device: " + iVar2);
                }
            };
        }
    }

    public final void b(byte b14) {
        this.f50865b.info("sendProtocolError");
        c(new i(NfcCommandHandler.b.PROTOCOL_ERROR, b14), new b(), 0L);
    }

    public final int c(i iVar, f fVar, long j8) {
        int i14;
        a aVar;
        this.f50865b.info("writeMessage");
        if (!this.f50871h.isAlive() || !this.f50872i.isAlive()) {
            this.f50865b.warn("The writer or reader thread is dead, ");
            fVar.b(iVar.b());
            return -1;
        }
        synchronized (this.f50869f) {
            try {
                i14 = this.f50874k;
                this.f50874k = i14 + 1;
                this.f50865b.info("Sending message: [type:" + iVar.f().toString() + ", transactionId: " + i14 + "]");
                if (this.f50874k > 127) {
                    this.f50874k = 0;
                }
                if (j8 > 0) {
                    aVar = new a(i14, iVar);
                    this.f50875l.postDelayed(aVar, j8);
                } else {
                    aVar = null;
                }
                iVar.e(i14, i.a.COMPANION_APPLICATION);
                this.f50869f.put(i14, new c(this, fVar, aVar));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f50865b.debug("writeDataPointMessage - " + iVar);
        this.f50876m.offer(iVar);
        return i14;
    }
}
