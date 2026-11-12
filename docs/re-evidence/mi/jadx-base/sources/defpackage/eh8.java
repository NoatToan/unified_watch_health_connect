package defpackage;

import androidx.annotation.RequiresApi;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class eh8 {
    public static final Charset e = StandardCharsets.US_ASCII;
    public static final String[] f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] h = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16642b;
    public final long c;
    public final byte[] d;

    public eh8(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public static eh8 a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new eh8(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(e);
        return new eh8(1, bytes.length, bytes);
    }

    public static eh8 b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d : dArr) {
            byteBufferWrap.putDouble(d);
        }
        return new eh8(12, dArr.length, byteBufferWrap.array());
    }

    public static eh8 c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putInt(i);
        }
        return new eh8(9, iArr.length, byteBufferWrap.array());
    }

    public static eh8 d(bse[] bseVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g[10] * bseVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (bse bseVar : bseVarArr) {
            byteBufferWrap.putInt((int) bseVar.b());
            byteBufferWrap.putInt((int) bseVar.a());
        }
        return new eh8(10, bseVarArr.length, byteBufferWrap.array());
    }

    public static eh8 e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(e);
        return new eh8(2, bytes.length, bytes);
    }

    public static eh8 f(long j, ByteOrder byteOrder) {
        return g(new long[]{j}, byteOrder);
    }

    public static eh8 g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new eh8(4, jArr.length, byteBufferWrap.array());
    }

    public static eh8 h(bse[] bseVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g[5] * bseVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (bse bseVar : bseVarArr) {
            byteBufferWrap.putInt((int) bseVar.b());
            byteBufferWrap.putInt((int) bseVar.a());
        }
        return new eh8(5, bseVarArr.length, byteBufferWrap.array());
    }

    public static eh8 i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new eh8(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return g[this.f16641a] * this.f16642b;
    }

    public String toString() {
        return "(" + f[this.f16641a] + ", data length:" + this.d.length + ")";
    }

    public eh8(int i, int i2, long j, byte[] bArr) {
        this.f16641a = i;
        this.f16642b = i2;
        this.c = j;
        this.d = bArr;
    }
}
