package com.loc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes18.dex */
public abstract class bs {
    public bu a;
    private ByteBuffer b;

    public bs(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.b = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        this.a = new bu(this.b);
    }

    public final bs a() {
        this.a.a(this.b);
        return this;
    }
}
