package tn2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/a;", "Ltn2/e1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e1 {
    @Override // tn2.e1
    public final int a(ByteBuffer byteBuffer) {
        byte b14 = byteBuffer.get();
        if (((byte) (b14 & UnsignedBytes.MAX_POWER_OF_TWO)) != -128) {
            return b14;
        }
        byte b15 = (byte) (b14 & Ascii.DEL);
        int i14 = 1;
        int i15 = 0;
        if (1 <= b15) {
            while (true) {
                i15 = (i15 << 8) | (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
                if (i14 == b15) {
                    break;
                }
                i14++;
            }
        }
        return i15;
    }
}
