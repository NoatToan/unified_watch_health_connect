package com.huawei.updatesdk.sdk.foundation.https;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f29889b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<byte[]> f29890a = new ArrayDeque(0);

    public byte[] b() {
        byte[] bArrPoll;
        synchronized (this.f29890a) {
            bArrPoll = this.f29890a.poll();
        }
        return bArrPoll == null ? new byte[65536] : bArrPoll;
    }

    public void b(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.f29890a) {
                a(bArr);
            }
        }
    }

    private void a(byte[] bArr) {
        if (this.f29890a.size() >= 32 || this.f29890a.offer(bArr)) {
            return;
        }
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("ByteArrayPool", "releaseBytes false");
    }

    public static a a() {
        return f29889b;
    }

    private a() {
    }
}
