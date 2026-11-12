package f4;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf4/i;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "array", "<init>", "([J)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.l0 f68748a;

    public i(long[] jArr) {
        p1.l0 l0Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            l0Var = new p1.l0(jArrCopyOf.length);
            int i14 = l0Var.f134838b;
            if (i14 < 0) {
                org.apache.commons.lang3.e.v("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i14;
                long[] jArr2 = l0Var.f134837a;
                if (jArr2.length < length) {
                    l0Var.f134837a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = l0Var.f134837a;
                int i15 = l0Var.f134838b;
                if (i14 != i15) {
                    p13.s.g(jArr3, jArr3, jArrCopyOf.length + i14, i14, i15);
                }
                p13.s.g(jArrCopyOf, jArr3, i14, 0, jArrCopyOf.length);
                l0Var.f134838b += jArrCopyOf.length;
            }
        } else {
            l0Var = new p1.l0(0, 1, null);
        }
        this.f68748a = l0Var;
    }
}
