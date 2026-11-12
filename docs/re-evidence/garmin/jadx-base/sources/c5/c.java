package c5;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc5/c;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f24451b = new long[2];

    public final void a(long j8) {
        if (b(j8)) {
            return;
        }
        int i14 = this.f24450a;
        long[] jArrCopyOf = this.f24451b;
        if (i14 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i14 + 1, jArrCopyOf.length * 2));
            this.f24451b = jArrCopyOf;
        }
        jArrCopyOf[i14] = j8;
        if (i14 >= this.f24450a) {
            this.f24450a = i14 + 1;
        }
    }

    public final boolean b(long j8) {
        int i14 = this.f24450a;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f24451b[i15] == j8) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j8) {
        int i14 = this.f24450a;
        int i15 = 0;
        while (i15 < i14) {
            if (j8 == this.f24451b[i15]) {
                int i16 = this.f24450a - 1;
                while (i15 < i16) {
                    long[] jArr = this.f24451b;
                    int i17 = i15 + 1;
                    jArr[i15] = jArr[i17];
                    i15 = i17;
                }
                this.f24450a--;
                return;
            }
            i15++;
        }
    }
}
