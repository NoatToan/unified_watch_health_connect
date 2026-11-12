package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class h7q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o6q f19784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g7q f19785b;
    public SocketChannel c;
    public ByteBuffer d;
    public volatile AtomicBoolean e;
    public volatile AtomicBoolean f;

    public h7q(SocketChannel socketChannel, l7q l7qVar) {
        this.f19784a = null;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.c = socketChannel;
        this.f19785b = new g7q(l7qVar, socketChannel, this);
        this.d = ByteBuffer.allocate(102432);
    }

    public synchronized void a() {
        if (this.f.compareAndSet(false, true)) {
            this.e.set(false);
            try {
                this.c.close();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.toString());
            }
            this.f19785b = null;
            this.c = null;
            this.d = null;
            this.f19784a = null;
        }
    }

    public void b(o6q o6qVar) {
        this.f19784a = o6qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        this.e.set(this.c != null);
        do {
            try {
                if (!this.e.get()) {
                    break;
                }
                this.d.clear();
                this.d.limit(16);
                while (this.e.get() && this.c.read(this.d) > 0) {
                }
                int i = this.d.array()[this.d.arrayOffset() + 7] & 31;
                this.d.limit(i);
                while (this.e.get() && this.c.read(this.d) > 0) {
                }
                this.d.flip();
                byte[] bArr2 = new byte[i];
                System.arraycopy(this.d.array(), this.d.arrayOffset(), bArr2, 0, i);
                if (!this.e.get() || !this.f19785b.c(bArr2)) {
                    break;
                    break;
                }
                this.d.clear();
                int iA = this.f19785b.a();
                this.d.limit(iA);
                while (this.e.get() && this.c.read(this.d) > 0) {
                }
                this.d.flip();
                bArr = new byte[iA];
                System.arraycopy(this.d.array(), this.d.arrayOffset(), bArr, 0, iA);
                if (!this.e.get()) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (this.f19785b.b(bArr));
        if (this.f.get() || this.f.get()) {
            return;
        }
        o6q o6qVar = this.f19784a;
        if (o6qVar == null) {
            a();
        } else {
            o6qVar.j(this);
        }
    }

    public h7q(SocketChannel socketChannel, l7q l7qVar, boolean z) {
        this.f19784a = null;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.c = socketChannel;
        g7q g7qVar = new g7q(l7qVar, socketChannel, this);
        this.f19785b = g7qVar;
        g7qVar.g(z);
        this.d = ByteBuffer.allocate(102432);
    }
}
