package com.huawei.hms.findnetwork.sdk;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f13199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13200b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13201c;

    public byte[] a() {
        ByteBuffer byteBuffer = this.f13199a;
        return byteBuffer == null ? new byte[0] : byteBuffer.array();
    }

    public int b() {
        return this.f13201c;
    }

    public AtomicBoolean c() {
        return this.f13200b;
    }

    public void a(boolean z) {
        this.f13200b.set(z);
    }

    public void a(byte[] bArr) {
        this.f13199a = ByteBuffer.wrap(bArr);
    }

    public void a(int i) {
        this.f13201c = i;
    }
}
