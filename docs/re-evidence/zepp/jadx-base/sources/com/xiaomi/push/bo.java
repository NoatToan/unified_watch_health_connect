package com.xiaomi.push;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public final class bo extends bi {
    public bo() {
        a("PING", (String) null);
        a("0");
        a(0);
    }

    @Override // com.xiaomi.push.bi
    public int c() {
        if (m3598a().length == 0) {
            return 0;
        }
        return super.c();
    }

    @Override // com.xiaomi.push.bi
    public ByteBuffer c(ByteBuffer byteBuffer) {
        return m3598a().length == 0 ? byteBuffer : super.c(byteBuffer);
    }
}
