package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/h0;", "Lp1/l;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 extends l {
    public /* synthetic */ h0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 16 : i14);
    }

    public final void c() {
        int i14 = this.f134763b;
        if (i14 < 0) {
            org.apache.commons.lang3.e.v("Index must be between 0 and size");
            return;
        }
        e(i14 + 1);
        int[] iArr = this.f134762a;
        int i15 = this.f134763b;
        if (i15 != 0) {
            p13.s.d(1, 0, i15, iArr, iArr);
        }
        iArr[0] = 0;
        this.f134763b++;
    }

    public final void d(int i14) {
        e(this.f134763b + 1);
        int[] iArr = this.f134762a;
        int i15 = this.f134763b;
        iArr[i15] = i14;
        this.f134763b = i15 + 1;
    }

    public final void e(int i14) {
        int[] iArr = this.f134762a;
        if (iArr.length < i14) {
            this.f134762a = Arrays.copyOf(iArr, Math.max(i14, (iArr.length * 3) / 2));
        }
    }

    public final void f(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f134763b)) {
            org.apache.commons.lang3.e.v("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f134762a;
        int i16 = iArr[i14];
        if (i14 != i15 - 1) {
            p13.s.d(i14, i14 + 1, i15, iArr, iArr);
        }
        this.f134763b--;
    }

    public final void g(int i14, int i15) {
        if (i14 < 0 || i14 >= this.f134763b) {
            org.apache.commons.lang3.e.v("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f134762a;
        int i16 = iArr[i14];
        iArr[i14] = i15;
    }

    public h0(int i14) {
        super(i14, null);
    }

    public h0() {
        this(0, 1, null);
    }
}
