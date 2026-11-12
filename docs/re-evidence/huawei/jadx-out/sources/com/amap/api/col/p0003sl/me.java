package com.amap.api.col.p0003sl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    mg f3189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f3190b;

    me(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.f3190b = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        this.f3189a = new mg(this.f3190b);
    }

    public final me a() {
        this.f3189a.a(this.f3190b);
        return this;
    }
}
