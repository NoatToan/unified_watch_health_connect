package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/l0;", "Lm63/n1;", "", "bufferWithData", "<init>", "([I)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 extends n1<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f116975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116976b;

    public l0(int[] iArr) {
        iArr.getClass();
        this.f116975a = iArr;
        this.f116976b = iArr.length;
        b(10);
    }

    @Override // m63.n1
    public final int[] a() {
        return Arrays.copyOf(this.f116975a, this.f116976b);
    }

    @Override // m63.n1
    public final void b(int i14) {
        int[] iArr = this.f116975a;
        if (iArr.length < i14) {
            int length = iArr.length * 2;
            if (i14 < length) {
                i14 = length;
            }
            this.f116975a = Arrays.copyOf(iArr, i14);
        }
    }

    @Override // m63.n1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF117035b() {
        return this.f116976b;
    }
}
