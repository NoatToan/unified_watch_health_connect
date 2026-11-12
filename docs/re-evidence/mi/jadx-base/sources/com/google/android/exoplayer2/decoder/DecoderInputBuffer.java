package com.google.android.exoplayer2.decoder;

import defpackage.s45;
import defpackage.u53;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class DecoderInputBuffer extends u53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s45 f7867b;
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final int g;
    public final int h;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Buffer too small (");
            sb.append(i);
            sb.append(" < ");
            sb.append(i2);
            sb.append(")");
            super(sb.toString());
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    public static DecoderInputBuffer x() {
        return new DecoderInputBuffer(0);
    }

    @Override // defpackage.u53
    public void h() {
        super.h();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final ByteBuffer r(int i) {
        int i2 = this.g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public void s(int i) {
        int i2 = i + this.h;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = r(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferR = r(i3);
        byteBufferR.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferR.put(byteBuffer);
        }
        this.c = byteBufferR;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean w() {
        return k(1073741824);
    }

    public void y(int i) {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f = ByteBuffer.allocate(i);
        } else {
            this.f.clear();
        }
    }

    public DecoderInputBuffer(int i, int i2) {
        this.f7867b = new s45();
        this.g = i;
        this.h = i2;
    }
}
