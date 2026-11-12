package tb;

import bb.o;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class a implements tb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f163509a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f163510b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f163511c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.b f163512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f163513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f163514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f163515g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f163516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f163517b;

        private b(int i14, long j8) {
            this.f163516a = i14;
            this.f163517b = j8;
        }
    }

    public final long a(o oVar, int i14) {
        byte[] bArr = this.f163509a;
        oVar.readFully(bArr, 0, i14);
        long j8 = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            j8 = (j8 << 8) | ((long) (bArr[i15] & UnsignedBytes.MAX_VALUE));
        }
        return j8;
    }
}
