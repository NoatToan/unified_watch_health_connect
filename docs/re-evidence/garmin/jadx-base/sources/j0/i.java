package j0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f95920d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f95921e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f95922f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f95925c;

    public i(int i14, int i15, byte[] bArr) {
        this(i14, i15, -1L, bArr);
    }

    public static i a(long j8, ByteOrder byteOrder) {
        return b(new long[]{j8}, byteOrder);
    }

    public static i b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f95922f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j8 : jArr) {
            byteBufferWrap.putInt((int) j8);
        }
        return new i(4, jArr.length, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(f95921e[this.f95923a]);
        sb3.append(", data length:");
        return am.j.q(sb3, this.f95925c.length, ")");
    }

    public i(int i14, int i15, long j8, byte[] bArr) {
        this.f95923a = i14;
        this.f95924b = i15;
        this.f95925c = bArr;
    }
}
