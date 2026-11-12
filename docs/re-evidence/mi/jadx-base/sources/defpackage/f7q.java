package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class f7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o6q f17509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SocketChannel f17510b;
    public volatile AtomicBoolean c = new AtomicBoolean(false);
    public volatile AtomicBoolean d = new AtomicBoolean(false);

    public f7q(SocketChannel socketChannel) {
        this.f17510b = socketChannel;
        this.c.set(true);
    }

    public synchronized void a() {
        if (this.d.compareAndSet(false, true)) {
            this.c.set(false);
            try {
                this.f17510b.close();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.toString());
            }
            this.f17510b = null;
            this.f17509a = null;
        }
    }

    public synchronized int b(int i, int i2, byte[] bArr) {
        c7q c7qVar = new c7q(true);
        if (this.c.get() && bArr != null && bArr.length <= 102400) {
            c7qVar.l(i, i2, bArr);
            if (!c7qVar.m()) {
                return -1;
            }
            try {
                this.f17510b.write(ByteBuffer.wrap(c7qVar.c()));
                this.f17510b.write(ByteBuffer.wrap(c7qVar.a(), c7qVar.e(), c7qVar.d()));
            } catch (Exception e) {
                e.printStackTrace();
                this.c.set(false);
            }
            if (!this.c.get() && !this.d.get()) {
                o6q o6qVar = this.f17509a;
                if (o6qVar == null) {
                    a();
                } else {
                    o6qVar.i(this);
                }
            }
            return 0;
        }
        return -1;
    }

    public void c(o6q o6qVar) {
        this.f17509a = o6qVar;
    }

    public f7q(SocketChannel socketChannel, int i, int i2) {
        this.f17510b = socketChannel;
        this.c.set(true);
        p6q p6qVar = new p6q();
        p6qVar.e(i, i2, true);
        b(0, 0, p6qVar.a());
    }
}
