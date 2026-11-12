package androidx.media3.decoder;

import am.j;
import androidx.media3.common.q;
import androidx.media3.common.u;
import ia.a;
import ia.b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f8629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f8630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f8631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f8634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8636i;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i14, int i15) {
            super(j.g(i14, i15, "Buffer too small (", " < ", ")"));
            this.currentCapacity = i14;
            this.requiredCapacity = i15;
        }
    }

    static {
        u.a("media3.decoder");
    }

    public DecoderInputBuffer(int i14, int i15) {
        this.f8630c = new b();
        this.f8635h = i14;
        this.f8636i = i15;
    }

    public void c() {
        this.f92372a = 0;
        ByteBuffer byteBuffer = this.f8631d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f8634g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f8632e = false;
    }

    public final ByteBuffer d(int i14) {
        int i15 = this.f8635h;
        if (i15 == 1) {
            return ByteBuffer.allocate(i14);
        }
        if (i15 == 2) {
            return ByteBuffer.allocateDirect(i14);
        }
        ByteBuffer byteBuffer = this.f8631d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i14);
    }

    public final void e(int i14) {
        int i15 = i14 + this.f8636i;
        ByteBuffer byteBuffer = this.f8631d;
        if (byteBuffer == null) {
            this.f8631d = d(i15);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i16 = i15 + iPosition;
        if (iCapacity >= i16) {
            this.f8631d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferD = d(i16);
        byteBufferD.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferD.put(byteBuffer);
        }
        this.f8631d = byteBufferD;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.f8631d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f8634g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public DecoderInputBuffer(int i14) {
        this(i14, 0);
    }
}
