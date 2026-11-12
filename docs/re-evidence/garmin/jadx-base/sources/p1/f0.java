package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/f0;", "Lp1/f;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f0 extends f {
    public f0(int i14) {
        long[] jArr;
        super(null);
        if (i14 < 0) {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
        int iE = g1.e(i14);
        int iMax = iE > 0 ? Math.max(7, g1.d(iE)) : 0;
        this.f134719c = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134717a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134718b = new float[iMax];
    }

    public f0() {
        this(0, 1, null);
    }

    public /* synthetic */ f0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }
}
