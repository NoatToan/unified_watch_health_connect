package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/l0;", "Lp1/u;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l0 extends u {
    public /* synthetic */ l0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 16 : i14);
    }

    public final void a(long j8) {
        int i14 = this.f134838b + 1;
        long[] jArr = this.f134837a;
        if (jArr.length < i14) {
            this.f134837a = Arrays.copyOf(jArr, Math.max(i14, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f134837a;
        int i15 = this.f134838b;
        jArr2[i15] = j8;
        this.f134838b = i15 + 1;
    }

    public l0(int i14) {
        super(i14, null);
    }

    public l0() {
        this(0, 1, null);
    }
}
