package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class i7q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o6q f20867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SocketChannel f20868b;
    public Handler c;
    public p6q d;
    public volatile AtomicBoolean e = new AtomicBoolean(false);
    public volatile AtomicBoolean f = new AtomicBoolean(false);
    public volatile AtomicBoolean g = new AtomicBoolean(false);

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c7q f20869a;

        public a(c7q c7qVar) {
            this.f20869a = c7qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i7q.this.f.set(false);
            while (i7q.this.e.get() && !i7q.this.f.get() && this.f20869a.m()) {
                try {
                    i7q.this.f20868b.write(ByteBuffer.wrap(this.f20869a.c()));
                    i7q.this.f20868b.write(ByteBuffer.wrap(this.f20869a.a(), this.f20869a.e(), this.f20869a.d()));
                } catch (Exception e) {
                    e.printStackTrace();
                    i7q.this.e.set(false);
                }
            }
            if (i7q.this.f20867a != null) {
                i7q.this.f20867a.n();
            }
            if (i7q.this.e.get() || i7q.this.g.get()) {
                return;
            }
            if (i7q.this.f20867a == null) {
                i7q.this.j();
            } else {
                i7q.this.f20867a.k(i7q.this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i7q.this.f20867a = null;
            i7q.this.c.getLooper().quit();
            i7q.this.c = null;
        }
    }

    public i7q(SocketChannel socketChannel) {
        this.f20868b = socketChannel;
    }

    public void i() {
        this.f.set(true);
    }

    public synchronized void j() {
        if (this.g.compareAndSet(false, true)) {
            this.e.set(false);
            this.f.set(false);
            try {
                this.f20868b.close();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.toString());
            }
            this.f20868b = null;
            try {
                this.c.post(new b());
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception: ");
                sb2.append(e2.toString());
            }
        }
    }

    public synchronized int k(int i, int i2, byte[] bArr) {
        c7q c7qVar = new c7q(true);
        if (this.e.get() && bArr != null && bArr.length <= 1048576) {
            c7qVar.l(i, i2, bArr);
            this.c.post(new a(c7qVar));
            return 0;
        }
        return -1;
    }

    public void l(o6q o6qVar) {
        this.f20867a = o6qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.c = new Handler(Looper.myLooper());
        this.e.set(true);
        p6q p6qVar = this.d;
        if (p6qVar != null) {
            k(0, 0, p6qVar.a());
            this.d = null;
        }
        Looper.loop();
    }

    public i7q(SocketChannel socketChannel, int i, int i2) {
        this.f20868b = socketChannel;
        p6q p6qVar = new p6q();
        this.d = p6qVar;
        p6qVar.e(i, i2, false);
    }
}
