package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class g extends InputStream {
    private Iterator<ByteBuffer> a;
    private ByteBuffer b;
    private int c = 0;
    private int d;
    private int e;
    private boolean f;
    private byte[] g;
    private int h;
    private long i;

    public g(Iterable<ByteBuffer> iterable) {
        this.a = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.c++;
        }
        this.d = -1;
        if (a()) {
            return;
        }
        this.b = Internal.EMPTY_BYTE_BUFFER;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    private boolean a() {
        this.d++;
        if (!this.a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.a.next();
        this.b = next;
        this.e = next.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        } else {
            this.f = false;
            this.i = UnsafeUtil.i(this.b);
            this.g = null;
        }
        return true;
    }

    private void b(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            int i = this.g[this.e + this.h] & 255;
            b(1);
            return i;
        }
        int iY = UnsafeUtil.y(((long) this.e) + this.i) & 255;
        b(1);
        return iY;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == this.c) {
            return -1;
        }
        int iLimit = this.b.limit();
        int i3 = this.e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            b(i2);
        } else {
            int iPosition = this.b.position();
            this.b.position(this.e);
            this.b.get(bArr, i, i2);
            this.b.position(iPosition);
            b(i2);
        }
        return i2;
    }
}
