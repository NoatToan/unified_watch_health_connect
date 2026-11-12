package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class igh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37590c;
    private List<b> d = new ArrayList();

    protected igh(d dVar) {
        this.f37590c = dVar.e;
        this.f37589b = dVar.f37592c.size();
        this.d.addAll(dVar.f37592c);
    }

    public int b() {
        return (this.d.size() * 8) + 8;
    }

    public byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(this.f37590c);
        byteBufferAllocate.putInt(this.f37589b);
        for (b bVar : this.d) {
            byteBufferAllocate.putInt(bVar.f37591a);
            byteBufferAllocate.putInt(bVar.e);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37591a;
        private int e;

        public b(int i, int i2) {
            this.f37591a = i;
            this.e = i2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<b> f37592c = new ArrayList();
        private int e;

        public d a(int i) {
            this.e = i;
            return this;
        }

        public d e(b bVar) {
            if (bVar != null) {
                this.f37592c.add(bVar);
            }
            return this;
        }

        public igh e() {
            return new igh(this);
        }
    }
}
