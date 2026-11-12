package nl2;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.UUID;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f126520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f126521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UUID f126522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f126523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f126524h;

    private h(long j8, int i14, int i15, int i16, UUID uuid, int i17, int i18) {
        super(1, j8, i14);
        this.f126520d = i15;
        this.f126521e = i16;
        this.f126522f = uuid;
        this.f126523g = i17;
        this.f126524h = i18;
    }

    public static h a(byte[] bArr) {
        byte b14;
        int i14;
        byte b15;
        UUID uuidFromString;
        if ((bArr == null ? 0 : bArr.length) < 13 || bArr[0] != 0 || bArr[1] != 1) {
            return null;
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 2, bArr.length - 2);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            long j8 = byteBufferWrap.getLong();
            int i15 = byteBufferWrap.getShort() & 65535;
            byte b16 = byteBufferWrap.get();
            if (b16 != 0) {
                if (b16 != 3) {
                    i14 = 0;
                    b15 = 0;
                    b14 = 0;
                } else {
                    uuidFromString = UUID.fromString(String.format(Locale.US, "6A4E%04X-667B-11E3-949A-0800200C9A66", Short.valueOf(byteBufferWrap.getShort())));
                    i14 = 0;
                    b15 = 0;
                    b14 = 0;
                }
                return new h(j8, i15, b16, i14, uuidFromString, b15, b14);
            }
            int i16 = byteBufferWrap.get() & UnsignedBytes.MAX_VALUE;
            byte b17 = byteBufferWrap.position() < byteBufferWrap.limit() ? byteBufferWrap.get() : (byte) 0;
            b14 = byteBufferWrap.position() < byteBufferWrap.limit() ? byteBufferWrap.get() : (byte) 0;
            i14 = i16;
            b15 = b17;
            uuidFromString = null;
            return new h(j8, i15, b16, i14, uuidFromString, b15, b14);
        } catch (BufferUnderflowException unused) {
            LoggerFactory.getLogger("ML#RegisterResponse").error("Failed to parse RegisterResponse. Not enough data");
            return null;
        }
    }

    public static String b(int i14) {
        if (i14 == 0) {
            return "SUCCESS";
        }
        if (i14 == 1) {
            return "INVALID_SERVICE_ID";
        }
        if (i14 == 2) {
            return "PENDING_AUTH";
        }
        if (i14 != 3) {
            return i14 != 4 ? j.h(i14, "Unknown Status: ") : "REJECTED";
        }
        return "ALREADY_IN_USE";
    }

    public final String toString() {
        return "RegisterResponse: " + b(this.f126520d) + ", flags:" + this.f126523g;
    }
}
