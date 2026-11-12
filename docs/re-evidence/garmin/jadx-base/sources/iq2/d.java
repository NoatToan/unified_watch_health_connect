package iq2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq2/d;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {
    public final c a(byte[] bArr) {
        bArr.getClass();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byte b14 = byteBufferOrder.get();
        long j8 = byteBufferOrder.getInt();
        if (j8 == 0) {
            return null;
        }
        return new c(b14, b(j8), byteBufferOrder.get(), byteBufferOrder.getShort(), byteBufferOrder.getShort(), byteBufferOrder.get(), byteBufferOrder.get(), byteBufferOrder.getShort(), byteBufferOrder.getShort());
    }

    public abstract long b(long j8);
}
