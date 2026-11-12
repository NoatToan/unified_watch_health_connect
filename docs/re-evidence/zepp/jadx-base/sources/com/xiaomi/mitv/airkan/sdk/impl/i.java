package com.xiaomi.mitv.airkan.sdk.impl;

import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.mitv.airkan.sdk.util.Logger;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
final class i {
    private static final int a = 2050;
    private static final int b = 1100;
    private static int c = 5;
    private static final byte[] d = {17, HMDisplaySetting.TYPE_HAWK_SWK, HMDisplaySetting.TYPE_VENICE, 0};
    private static final byte[] e = {17, HMDisplaySetting.TYPE_HAWK_SWK, HMDisplaySetting.TYPE_VENICE, 17};
    private static final byte[] f = {17, HMDisplaySetting.TYPE_HAWK_SWK, HMDisplaySetting.TYPE_VENICE, HMDisplaySetting.TYPE_HAWK_SWK};

    public static ByteBuffer a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(26);
        j jVar = new j(0, 0, 10);
        Logger.d(jVar.toString(), new Object[0]);
        byteBufferAllocate.put(jVar.a());
        byteBufferAllocate.put(new byte[]{0, 0, 0, 0, 5, 0, 4, 76, 8, 2});
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer b(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 16);
        byteBufferAllocate.put(new j(a, 1100, bArr.length).a());
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer c() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.put(new j(a, 1100, 4).a());
        byteBufferAllocate.put(d);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.put(new j(a, 1100, 4).a());
        byteBufferAllocate.put(e);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer e() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.put(new j(a, 1100, 4).a());
        byteBufferAllocate.put(f);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
