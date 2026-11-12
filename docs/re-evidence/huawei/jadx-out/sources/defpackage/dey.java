package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public class dey {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f31719c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31721b;
    private int d;
    private int e;
    private int j;

    public static int d() {
        return 36;
    }

    private dey() {
    }

    public dey(byte[] bArr) {
        if (bArr == null || bArr.length != d()) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.e = byteBufferWrap.getInt();
        this.j = byteBufferWrap.getInt();
        this.f31720a = byteBufferWrap.getInt();
        this.d = byteBufferWrap.getInt();
        this.f31721b = byteBufferWrap.getInt();
    }

    public int c() {
        return this.e;
    }

    public int h() {
        return this.f31720a;
    }

    public int a() {
        return this.f31721b;
    }

    public static int e() {
        return f31719c.d();
    }

    public byte[] b() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(d());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(this.e);
        byteBufferAllocate.putInt(this.j);
        byteBufferAllocate.putInt(this.f31720a);
        byteBufferAllocate.putInt(this.d);
        byteBufferAllocate.putInt(this.f31721b);
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }

    public String toString() {
        return "MsgHeader{mBusinessType=" + this.e + ", mVersion=" + this.j + ", mTotalLength=" + this.f31720a + ", mBusinessHeadLength=" + this.d + ", mMessageId=" + this.f31721b + '}';
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f31725c;
        private int d;
        private int e;

        public c d(int i) {
            this.e = i;
            return this;
        }

        public c b(int i) {
            this.f31725c = i;
            return this;
        }

        public c a(int i) {
            this.d = i;
            return this;
        }

        public c c(int i) {
            this.f31724b = i;
            return this;
        }

        public c e(int i) {
            this.f31723a = i;
            return this;
        }

        public dey a() {
            dey deyVar = new dey();
            deyVar.e = this.e;
            deyVar.j = this.f31725c;
            deyVar.f31720a = dey.d() + this.d + this.f31724b;
            deyVar.d = this.d;
            deyVar.f31721b = this.f31723a;
            return deyVar;
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31722c;

        private b() {
            this.f31722c = 0;
        }

        protected int d() {
            int i;
            synchronized (this) {
                int i2 = this.f31722c + 1;
                this.f31722c = i2;
                i = i2 % 1000000;
                this.f31722c = i;
            }
            return i;
        }
    }
}
