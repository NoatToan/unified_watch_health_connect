package tn2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltn2/e1;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e1 {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltn2/e1$a;", "", "", "", "value", "<init>", "([B)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f165550a;

        public a(byte... bArr) {
            bArr.getClass();
            this.f165550a = bArr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Arrays.equals(this.f165550a, ((a) obj).f165550a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f165550a);
        }

        public final String toString() {
            String string = Arrays.toString(this.f165550a);
            string.getClass();
            return string;
        }
    }

    public abstract int a(ByteBuffer byteBuffer);

    public final LinkedHashMap b(byte[] bArr) {
        byte b14;
        bArr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.remaining() > 0) {
            ArrayList arrayList = new ArrayList();
            byte b15 = byteBufferOrder.get();
            arrayList.add(Byte.valueOf(b15));
            if (((byte) (b15 & Ascii.US)) == 31) {
                do {
                    b14 = byteBufferOrder.get();
                    arrayList.add(Byte.valueOf(b14));
                } while (((byte) (b14 & UnsignedBytes.MAX_POWER_OF_TWO)) != 0);
            }
            byte[] bArrV0 = p13.h0.V0(arrayList);
            a aVar = new a(Arrays.copyOf(bArrV0, bArrV0.length));
            byte[] bArr2 = new byte[a(byteBufferOrder)];
            byteBufferOrder.get(bArr2);
            linkedHashMap.put(aVar, bArr2);
        }
        return linkedHashMap;
    }
}
