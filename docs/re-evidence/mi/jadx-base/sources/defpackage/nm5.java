package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class nm5 extends phh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f28062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phh.a f28063b;

    public nm5(short s, byte[] bArr, int i, int i2) {
        this(s, new phh.a(bArr, i, i2));
    }

    @Override // defpackage.phh
    public String c() {
        return "data";
    }

    @Override // defpackage.phh
    public byte[] f() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(h() + 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort(this.f28062a);
        g(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public void g(ByteBuffer byteBuffer) {
        phh.a aVar = this.f28063b;
        byteBuffer.put(aVar.f30394a, aVar.f30395b, h());
    }

    public int h() {
        return this.f28063b.a();
    }

    public short i() {
        return this.f28062a;
    }

    public String toString() {
        return "DataPacket{sequence=" + ((int) this.f28062a) + ", size=" + this.f28063b.a() + AbstractJsonLexerKt.END_OBJ;
    }

    public nm5(short s, phh.a aVar) {
        this.f28062a = s;
        this.f28063b = aVar;
    }
}
