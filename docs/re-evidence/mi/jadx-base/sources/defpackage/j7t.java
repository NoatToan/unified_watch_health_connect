package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m7t f22511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f22512b;

    public j7t(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.f22512b = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        this.f22511a = new m7t(this.f22512b);
    }

    public final j7t a() {
        this.f22511a.c(this.f22512b);
        return this;
    }
}
