package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class bem extends phh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f4128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4129b;

    public bem(byte b2, byte[] bArr) {
        this.f4128a = b2;
        this.f4129b = bArr;
    }

    @Override // defpackage.phh
    public String c() {
        return "single_cmd";
    }

    @Override // defpackage.phh
    public byte[] f() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.f4129b.length + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put(this.f4128a);
        byteBufferOrder.put(this.f4129b);
        return byteBufferOrder.array();
    }

    public byte[] g() {
        return this.f4129b;
    }

    public byte h() {
        return this.f4128a;
    }
}
