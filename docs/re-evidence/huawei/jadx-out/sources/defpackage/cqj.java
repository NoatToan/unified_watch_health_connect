package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cqj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31256a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31258c;
    private long i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<byte[]> f31257b = new LinkedList();
    private List<byte[]> e = null;
    private List<byte[]> d = null;

    public cqj() {
        if (cop.h()) {
            return;
        }
        this.i = Thread.currentThread().getId();
    }

    private void c() {
        if (!cop.h() && Thread.currentThread().getId() != this.i) {
            throw new RuntimeException("TlvByteCommandUtil no support multi thread. please invoke one thread");
        }
    }

    public cqj a(int i) {
        c();
        if (this.d != null) {
            if (!cop.h()) {
                throw new RuntimeException("no continue invoke beginCreateList need invoke endCreateList at list finish");
            }
        } else if (i <= 0 || i >= 128) {
            if (!cop.h()) {
                throw new RuntimeException("beginCreateList is wrong : " + i);
            }
        } else {
            this.d = new LinkedList();
            this.f31258c = i;
            return this;
        }
        return this;
    }

    public byte[] d() {
        c();
        List<byte[]> list = this.d;
        int length = 0;
        if (list == null) {
            if (cop.h()) {
                return new byte[]{(byte) (this.f31258c + 128), 0};
            }
            throw new RuntimeException("need invoke endCreateList before invoke addStructToList");
        }
        if (list.isEmpty()) {
            return new byte[]{(byte) (this.f31258c + 128), 0};
        }
        Iterator<byte[]> it = this.d.iterator();
        while (it.hasNext()) {
            length += it.next().length;
        }
        byte[] bArrF = cph.f(this.f31258c + 128);
        byte[] bArrE = cph.e(length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrF.length + bArrE.length);
        byteBufferAllocate.put(bArrF).put(bArrE);
        Iterator<byte[]> it2 = this.d.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(it2.next());
        }
        this.d.clear();
        this.d = null;
        return byteBufferAllocate.array();
    }

    public cqj b(byte[] bArr) {
        c();
        List<byte[]> list = this.d;
        if (list == null) {
            if (!cop.h()) {
                throw new RuntimeException("need invoke beginCreateList before invoke addStructToList");
            }
        } else if (bArr != null && bArr.length != 0) {
            list.add(bArr);
        }
        return this;
    }

    public cqj d(int i) {
        c();
        if (this.e != null) {
            if (!cop.h()) {
                throw new RuntimeException("no continue invoke beginCreateStruct, need invoke endCreateStruct at struct finish");
            }
        } else if (i <= 0 || i >= 128) {
            if (!cop.h()) {
                throw new RuntimeException("createStructType is wrong : " + i);
            }
        } else {
            this.e = new LinkedList();
            this.f31256a = i;
            return this;
        }
        return this;
    }

    public byte[] b() {
        c();
        List<byte[]> list = this.e;
        int length = 0;
        if (list == null) {
            if (cop.h()) {
                return new byte[]{(byte) (this.f31256a + 128), 0};
            }
            throw new RuntimeException("need invoke beginCreateStruct before invoke endCreateStruct " + this.f31256a);
        }
        if (list.isEmpty()) {
            return new byte[]{(byte) (this.f31256a + 128), 0};
        }
        Iterator<byte[]> it = this.e.iterator();
        while (it.hasNext()) {
            length += it.next().length;
        }
        byte[] bArrF = cph.f(this.f31256a + 128);
        byte[] bArrE = cph.e(length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrF.length + bArrE.length);
        byteBufferAllocate.put(bArrF).put(bArrE);
        Iterator<byte[]> it2 = this.e.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(it2.next());
        }
        this.e.clear();
        this.e = null;
        return byteBufferAllocate.array();
    }

    public cqj e(int i, int i2) {
        c();
        this.f31257b.add(0, new byte[]{(byte) i, (byte) i2});
        return this;
    }

    private byte[] l(int i, int i2) {
        byte[] bArrF = cph.f(i);
        byte[] bArrG = cph.g(i2);
        byte[] bArrE = cph.e(bArrG.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE.length + bArrG.length);
        byteBufferAllocate.put(bArrF).put(bArrE).put(bArrG);
        return byteBufferAllocate.array();
    }

    public cqj j(int i, int i2) {
        c();
        this.f31257b.add(l(i, i2));
        return this;
    }

    public cqj d(int i, int i2) {
        c();
        this.e.add(l(i, i2));
        return this;
    }

    public cqj b(int i, int i2) {
        c();
        this.f31257b.add(h(i, i2));
        return this;
    }

    private byte[] m(int i, int i2) {
        c();
        byte[] bArrF = cph.f(i);
        byte[] bArr = {(byte) i2};
        byte[] bArrE = cph.e(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE.length + 1);
        byteBufferAllocate.put(bArrF).put(bArrE).put(bArr);
        return byteBufferAllocate.array();
    }

    public cqj g(int i, int i2) {
        c();
        this.f31257b.add(m(i, i2));
        return this;
    }

    public cqj c(int i, int i2) {
        c();
        this.e.add(m(i, i2));
        return this;
    }

    private byte[] f(int i, int i2) {
        c();
        byte[] bArrF = cph.f(i);
        byte[] bArrA = cph.a(i2);
        byte[] bArrE = cph.e(bArrA.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE.length + bArrA.length);
        byteBufferAllocate.put(bArrF).put(bArrE).put(bArrA);
        return byteBufferAllocate.array();
    }

    public cqj i(int i, int i2) {
        c();
        this.f31257b.add(f(i, i2));
        return this;
    }

    public cqj a(int i, int i2) {
        c();
        this.e.add(f(i, i2));
        return this;
    }

    private byte[] d(int i, String str) {
        c();
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE2.length + bArrE.length);
        byteBufferAllocate.put(bArrF).put(bArrE2).put(bArrE);
        return byteBufferAllocate.array();
    }

    public cqj b(int i, String str) {
        c();
        this.f31257b.add(d(i, str));
        return this;
    }

    public cqj e(int i, String str) {
        c();
        this.e.add(d(i, str));
        return this;
    }

    private byte[] d(int i, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return b(i);
        }
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArr.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE.length + bArr.length);
        byteBufferAllocate.put(bArrF).put(bArrE).put(bArr);
        return byteBufferAllocate.array();
    }

    public cqj e(int i, byte[] bArr) {
        c();
        this.f31257b.add(d(i, bArr));
        return this;
    }

    public cqj a(int i, byte[] bArr) {
        c();
        this.e.add(d(i, bArr));
        return this;
    }

    private byte[] b(int i) {
        return new byte[]{(byte) i, 0};
    }

    public cqj c(int i) {
        c();
        this.f31257b.add(b(i));
        return this;
    }

    private byte[] h(int i, int i2) {
        byte[] bArrF = cph.f(i);
        byte[] bArrF2 = cph.f(i2);
        byte[] bArrE = cph.e(bArrF2.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE.length + bArrF2.length);
        byteBufferAllocate.put(bArrF).put(bArrE).put(bArrF2);
        return byteBufferAllocate.array();
    }

    private byte[] d(int i, long j) {
        byte[] bArrF = cph.f(i);
        byte[] bArrD = cph.d(j);
        byte[] bArrE = cph.e(bArrD.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrE.length + bArrD.length);
        byteBufferAllocate.put(bArrF).put(bArrE).put(bArrD);
        return byteBufferAllocate.array();
    }

    public cqj e(int i, long j) {
        c();
        this.f31257b.add(d(i, j));
        return this;
    }

    public cqj b(int i, long j) {
        c();
        this.e.add(d(i, j));
        return this;
    }

    public cqj a(byte[] bArr) {
        c();
        if (bArr != null) {
            this.f31257b.add(bArr);
        }
        return this;
    }

    public cqj e(byte[] bArr) {
        c();
        if (bArr != null) {
            this.e.add(bArr);
        }
        return this;
    }

    public byte[] e() {
        c();
        Iterator<byte[]> it = this.f31257b.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator<byte[]> it2 = this.f31257b.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(it2.next());
        }
        this.f31257b.clear();
        return byteBufferAllocate.array();
    }
}
