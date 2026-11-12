package com.xiaomi.wearable.spp;

import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.utils.ByteUtil;
import defpackage.m7o;
import defpackage.mr2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0896b f14443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14444b;
    public byte c;
    public byte d;
    public byte[] e;
    public byte[] f;
    public final int g = 16702650;
    public final byte h = -17;

    public static class a {
        public int c;
        public byte e;
        public byte[] g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14445a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14446b = 1;
        public int d = 2;
        public byte f = 0;

        public b a() {
            C0896b c0896b = new C0896b();
            c0896b.f14447a = this.c;
            c0896b.f14448b = this.f14445a;
            c0896b.c = this.f14446b;
            b bVar = new b();
            bVar.f14443a = c0896b;
            bVar.f = this.g;
            bVar.f14444b = this.d;
            bVar.c = this.e;
            bVar.d = this.f;
            return bVar;
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public a c(byte b2) {
            this.f = b2;
            return this;
        }

        public a d(int i) {
            this.f14446b = i;
            return this;
        }

        public a e(boolean z) {
            if (z) {
                this.f14445a = 1;
            } else {
                this.f14445a = 0;
            }
            return this;
        }

        public a f(int i) {
            this.d = i;
            return this;
        }

        public a g(byte b2) {
            this.e = b2;
            return this;
        }

        public a h(byte[] bArr) {
            this.g = bArr;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.spp.b$b, reason: collision with other inner class name */
    public static class C0896b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14448b;
        public int c;
        public int d;

        public boolean f() {
            int i = this.f14447a;
            return i >= 0 && i <= 15 && this.d == 0;
        }

        public void g(short s) {
            this.f14447a = s & 15;
            this.f14448b = (s >> 14) & 1;
            this.c = (s >> 15) & 1;
            this.d = s & 16368;
        }

        public byte[] h() {
            byte[] bArrD = m7o.d(this.f14447a | (this.f14448b << 14) | (this.c << 15));
            byte[] bArr = {bArrD[3], bArrD[2]};
            CoreExtKt.logger.d("SppPacket", "header toBytes:" + ByteUtil.bytesToHexString(bArr));
            return bArr;
        }

        public String toString() {
            return "SppHeader{mChannelType=" + this.f14447a + ", mNeedResponseFlag=" + this.f14448b + ", mFlag=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public b(byte[] bArr) {
        this.e = bArr;
    }

    public final boolean e(int i, int i2) {
        return i + (-8) >= i2;
    }

    public final boolean f(byte b2) {
        return b2 == -17;
    }

    public final boolean g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        return Integer.parseInt(m7o.a(new byte[]{bArr[2], bArr[1], bArr[0]}), 16) == 16702650;
    }

    public final boolean h(int i) {
        return i >= 3;
    }

    public final int i() {
        if (this.e.length <= 3) {
            return -1;
        }
        int i = 1;
        while (true) {
            byte[] bArr = this.e;
            if (i >= bArr.length) {
                return -1;
            }
            if (ByteUtil.byteToInt(bArr[i]) == 186) {
                return i;
            }
            i++;
        }
    }

    public int j() {
        return this.f14443a.f14447a;
    }

    public int k() {
        return this.d;
    }

    public int l() {
        return this.f14444b;
    }

    public byte m() {
        return this.c;
    }

    public byte[] n() {
        return this.f;
    }

    public byte[] o() {
        return this.e;
    }

    public final boolean p(int i) {
        return i >= 11;
    }

    public void q(byte[] bArr) {
        byte[] bArr2 = this.e;
        if (bArr2 != null && bArr2.length > 0) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            this.e = bArr3;
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, this.e, bArr2.length, bArr.length);
            return;
        }
        byte[] bArr4 = new byte[bArr.length];
        this.e = bArr4;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        CoreExtKt.logger.i("SppPacket", "merge: origin dataLen:0,new dataLen:" + bArr.length + ":" + ByteUtil.bytesToHexString(bArr, 0, 100));
    }

    public boolean r() {
        return this.f14443a.f14448b == 1;
    }

    public final void s(int i, int i2) {
        int i3 = i - i2;
        byte[] bArr = new byte[i3];
        System.arraycopy(this.e, i2, bArr, 0, i3);
        this.e = bArr;
    }

    public ParseResult t() {
        int length = this.e.length;
        CoreExtKt.logger.i("SppPacket", "parseData: " + length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(this.e).order(ByteOrder.LITTLE_ENDIAN);
        if (!p(length)) {
            return ParseResult.INCOMPLETE;
        }
        if (!g(byteBufferOrder)) {
            mr2.e("SppPacket", "packet preamble not found");
            int i = i();
            CoreExtKt.logger.i("SppPacket", "packet findHead position: " + i);
            if (i == -1) {
                this.e = new byte[0];
            } else {
                s(length, i);
            }
            return ParseResult.RETRY;
        }
        C0896b c0896b = new C0896b();
        this.f14443a = c0896b;
        c0896b.g(byteBufferOrder.getShort());
        if (!this.f14443a.f()) {
            CoreExtKt.logger.i("SppPacket", "parseData: header invalid" + this.f14443a);
            s(length, 3);
            return ParseResult.RETRY;
        }
        short s = byteBufferOrder.getShort();
        CoreExtKt.logger.i("SppPacket", "parseData,packetDataLen:" + length + " dataLen:" + ((int) s));
        if (!h(s)) {
            CoreExtKt.logger.i("SppPacket", "parseData: payload data invalid");
            s(length, 3);
            return ParseResult.RETRY;
        }
        if (!e(length, s)) {
            CoreExtKt.logger.i("SppPacket", "parseData: packet not incomplete");
            return ParseResult.INCOMPLETE;
        }
        CoreExtKt.logger.i("SppPacket", "parseData: packet data len valid");
        this.f14444b = byteBufferOrder.get() & 255;
        this.c = byteBufferOrder.get();
        this.d = byteBufferOrder.get();
        byte[] bArr = new byte[s - 3];
        byteBufferOrder.get(bArr);
        if (!f(byteBufferOrder.get())) {
            CoreExtKt.logger.i("SppPacket", "parseData: packet end invalid");
            s(length, 3);
            return ParseResult.RETRY;
        }
        CoreExtKt.logger.i("SppPacket", "parseData: packet end valid");
        u();
        this.f = bArr;
        w(byteBufferOrder);
        return ParseResult.SUCCESS;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SppPacket{");
        sb.append(this.f14443a.toString());
        sb.append(",mOpCode=");
        sb.append(this.f14444b);
        sb.append(", mOpCodeSN=");
        sb.append((int) this.c);
        sb.append(", mDataType=");
        sb.append((int) this.d);
        sb.append(", mPayLoadLen=");
        byte[] bArr = this.f;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(", mPacketLen=");
        byte[] bArr2 = this.e;
        sb.append(bArr2 != null ? bArr2.length : 0);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final void u() {
    }

    public void v() {
        this.e = null;
    }

    public final void w(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            this.e = null;
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.e = bArr;
        byteBuffer.get(bArr);
    }

    public byte[] x() {
        byte[] bArr = this.f;
        int length = bArr != null ? bArr.length + 3 : 3;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + 8).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(new byte[]{-70, -36, -2});
        byteBufferOrder.put(this.f14443a.h());
        byteBufferOrder.putShort((short) (length & 65535));
        byteBufferOrder.put(m7o.d(this.f14444b)[3]);
        byteBufferOrder.put(this.c);
        byteBufferOrder.put(this.d);
        byte[] bArr2 = this.f;
        if (bArr2 != null) {
            byteBufferOrder.put(bArr2);
        }
        byteBufferOrder.put((byte) -17);
        return byteBufferOrder.array();
    }

    public b() {
    }
}
