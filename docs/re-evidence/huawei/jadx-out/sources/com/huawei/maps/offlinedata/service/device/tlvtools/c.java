package com.huawei.maps.offlinedata.service.device.tlvtools;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17966b;
    private int d;
    private long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f17965a = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f17967c = null;
    private List e = null;

    public c() {
        if (e()) {
            return;
        }
        this.f = Thread.currentThread().getId();
    }

    private void a() {
        if (!e() && Thread.currentThread().getId() != this.f) {
            throw new RuntimeException("TlvByteCommandUtil no support multi thread. please invoke one thread");
        }
    }

    public static boolean e() {
        return true;
    }

    private byte[] f(int i, int i2) {
        byte[] bArrE = a.e(i);
        byte[] bArrF = a.f(i2);
        byte[] bArrA = a.a(bArrF.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + bArrA.length + bArrF.length);
        byteBufferAllocate.put(bArrE).put(bArrA).put(bArrF);
        return byteBufferAllocate.array();
    }

    private byte[] g(int i, int i2) {
        a();
        byte[] bArrE = a.e(i);
        byte[] bArr = {(byte) i2};
        byte[] bArrA = a.a(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + bArrA.length + 1);
        byteBufferAllocate.put(bArrE).put(bArrA).put(bArr);
        return byteBufferAllocate.array();
    }

    public c b(byte[] bArr) {
        a();
        List list = this.e;
        if (list == null) {
            if (!e()) {
                throw new RuntimeException("need invoke beginCreateList before invoke addStructToList");
            }
        } else if (bArr != null && bArr.length != 0) {
            list.add(bArr);
        }
        return this;
    }

    public byte[] c() {
        a();
        List list = this.e;
        int length = 0;
        if (list == null) {
            if (e()) {
                return new byte[]{(byte) (this.d + 128), 0};
            }
            throw new RuntimeException("need invoke endCreateList before invoke addStructToList");
        }
        if (list.isEmpty()) {
            return new byte[]{(byte) (this.d + 128), 0};
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArrE = a.e(this.d + 128);
        byte[] bArrA = a.a(length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrE.length + bArrA.length);
        byteBufferAllocate.put(bArrE).put(bArrA);
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put((byte[]) it2.next());
        }
        this.e.clear();
        this.e = null;
        return byteBufferAllocate.array();
    }

    public byte[] d() {
        a();
        List list = this.f17967c;
        int length = 0;
        if (list == null) {
            if (e()) {
                return new byte[]{(byte) (this.f17966b + 128), 0};
            }
            throw new RuntimeException("need invoke beginCreateStruct before invoke endCreateStruct " + this.f17966b);
        }
        if (list.isEmpty()) {
            return new byte[]{(byte) (this.f17966b + 128), 0};
        }
        Iterator it = this.f17967c.iterator();
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArrE = a.e(this.f17966b + 128);
        byte[] bArrA = a.a(length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrE.length + bArrA.length);
        byteBufferAllocate.put(bArrE).put(bArrA);
        Iterator it2 = this.f17967c.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put((byte[]) it2.next());
        }
        this.f17967c.clear();
        this.f17967c = null;
        return byteBufferAllocate.array();
    }

    private byte[] e(int i, int i2) {
        a();
        byte[] bArrE = a.e(i);
        byte[] bArrC = a.c(i2);
        byte[] bArrA = a.a(bArrC.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + bArrA.length + bArrC.length);
        byteBufferAllocate.put(bArrE).put(bArrA).put(bArrC);
        return byteBufferAllocate.array();
    }

    public c a(int i) {
        a();
        if (this.e != null) {
            if (!e()) {
                throw new RuntimeException("no continue invoke beginCreateList need invoke endCreateList at list finish");
            }
        } else {
            if (i > 0 && i < 128) {
                this.e = new LinkedList();
                this.d = i;
                return this;
            }
            if (!e()) {
                throw new RuntimeException("beginCreateList is wrong : " + i);
            }
        }
        return this;
    }

    public c b(int i) {
        a();
        if (this.f17967c != null) {
            if (!e()) {
                throw new RuntimeException("no continue invoke beginCreateStruct, need invoke endCreateStruct at struct finish");
            }
        } else {
            if (i > 0 && i < 128) {
                this.f17967c = new LinkedList();
                this.f17966b = i;
                return this;
            }
            if (!e()) {
                throw new RuntimeException("createStructType is wrong : " + i);
            }
        }
        return this;
    }

    public c a(int i, int i2) {
        a();
        this.f17967c.add(g(i, i2));
        return this;
    }

    public c a(int i, String str) {
        a();
        this.f17965a.add(b(i, str));
        return this;
    }

    public c a(int i, long j) {
        a();
        this.f17967c.add(b(i, j));
        return this;
    }

    public c a(byte[] bArr) {
        a();
        if (bArr != null) {
            this.f17965a.add(bArr);
        }
        return this;
    }

    public c b(int i, int i2) {
        a();
        this.f17965a.add(e(i, i2));
        return this;
    }

    public c c(int i, int i2) {
        a();
        this.f17965a.add(f(i, i2));
        return this;
    }

    public c d(int i, int i2) {
        a();
        this.f17965a.add(g(i, i2));
        return this;
    }

    private byte[] b(int i, String str) {
        a();
        byte[] bArrE = a.e(i);
        byte[] bArrC = a.c(str);
        byte[] bArrA = a.a(bArrC.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + bArrA.length + bArrC.length);
        byteBufferAllocate.put(bArrE).put(bArrA).put(bArrC);
        return byteBufferAllocate.array();
    }

    private byte[] b(int i, long j) {
        byte[] bArrE = a.e(i);
        byte[] bArrA = a.a(j);
        byte[] bArrA2 = a.a(bArrA.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + bArrA2.length + bArrA.length);
        byteBufferAllocate.put(bArrE).put(bArrA2).put(bArrA);
        return byteBufferAllocate.array();
    }

    public byte[] b() {
        a();
        Iterator it = this.f17965a.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it2 = this.f17965a.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put((byte[]) it2.next());
        }
        this.f17965a.clear();
        return byteBufferAllocate.array();
    }
}
