package defpackage;

import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class mlx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f41901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SocketChannel f41903c;
    private final LinkedList<ByteBuffer> d;
    private long e;
    private final AtomicBoolean f;
    private long g;
    private final int h;
    private final String i;
    private long j;

    public mlx(SocketChannel socketChannel, String str, int i, boolean z) {
        this.f = new AtomicBoolean(false);
        this.d = new LinkedList<>();
        this.f41902b = z;
        this.f41903c = socketChannel;
        this.i = str;
        this.h = i;
        this.e = -1L;
        this.f41901a = -1L;
        this.j = 0L;
        this.g = 0L;
    }

    public mlx(boolean z) {
        this(null, "", -1, z);
    }

    public String f() {
        return this.i;
    }

    public int g() {
        return this.h;
    }

    public SocketChannel j() {
        return this.f41903c;
    }

    public void m() {
        this.f.set(true);
    }

    public boolean i() {
        return this.f.get();
    }

    public boolean o() {
        return this.f41902b;
    }

    public void e(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            LogUtil.d("DistributionNetworkTcpConduit", "appendWrite buffer is null");
            return;
        }
        synchronized (this.d) {
            this.d.add(byteBuffer);
        }
    }

    public boolean k() {
        boolean zIsEmpty;
        synchronized (this.d) {
            zIsEmpty = this.d.isEmpty();
        }
        return !zIsEmpty;
    }

    public int n() throws IOException {
        int iWrite;
        synchronized (this.d) {
            iWrite = 0;
            while (!this.d.isEmpty()) {
                ByteBuffer first = this.d.getFirst();
                iWrite += j().write(first);
                if (first.hasRemaining()) {
                    break;
                }
                this.d.removeFirst();
            }
        }
        return iWrite;
    }

    public long c() {
        return this.e;
    }

    public void e(long j) {
        this.e = j;
    }

    public long d() {
        return this.f41901a;
    }

    public void d(long j) {
        this.f41901a = j;
    }

    public long h() {
        return this.j;
    }

    public void c(long j) {
        this.j = j;
    }

    public long a() {
        return this.g;
    }

    public void b(long j) {
        this.g = j;
    }

    public long e() {
        if (d() < 0) {
            return 0L;
        }
        return d() + 1;
    }

    public long b() {
        if (c() < 0) {
            return 0L;
        }
        return c() + 1;
    }
}
