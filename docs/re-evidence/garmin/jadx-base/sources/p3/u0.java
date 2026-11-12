package p3;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/u0;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f135319a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f135320b;

    public final int a(int i14) {
        int i15 = this.f135320b - 1;
        return i15 >= 0 ? this.f135319a[i15] : i14;
    }

    public final int b() {
        int[] iArr = this.f135319a;
        int i14 = this.f135320b - 1;
        this.f135320b = i14;
        return iArr[i14];
    }

    public final void c(int i14) {
        int[] iArrCopyOf = this.f135319a;
        if (this.f135320b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f135319a = iArrCopyOf;
        }
        int i15 = this.f135320b;
        this.f135320b = i15 + 1;
        iArrCopyOf[i15] = i14;
    }
}
