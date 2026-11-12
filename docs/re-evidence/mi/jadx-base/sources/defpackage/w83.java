package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class w83 extends phh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f37711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f37712b;

    public w83(byte b2, short s) {
        this.f37711a = b2;
        this.f37712b = s;
    }

    @Override // defpackage.phh
    public String c() {
        return "cmd";
    }

    @Override // defpackage.phh
    public byte[] f() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put(this.f37711a);
        byteBufferOrder.putShort(this.f37712b);
        return byteBufferOrder.array();
    }

    public byte g() {
        return this.f37711a;
    }

    public short h() {
        return this.f37712b;
    }

    public String toString() {
        return "CMDPacket{dataType=" + ((int) this.f37711a) + "frameCount=" + ((int) this.f37712b) + AbstractJsonLexerKt.END_OBJ;
    }
}
