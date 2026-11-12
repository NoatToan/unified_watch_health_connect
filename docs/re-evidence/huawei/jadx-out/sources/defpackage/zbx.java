package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, d2 = {"mod", "", "a", "b", "", "differenceModulo", "c", "getProgressionLastElement", "start", TtmlNode.END, "step", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class zbx {
    private static final int e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long d(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    private static final int a(int i, int i2, int i3) {
        return e(e(i, i3) - e(i2, i3), i3);
    }

    private static final long c(long j, long j2, long j3) {
        return d(d(j, j3) - d(j2, j3), j3);
    }

    public static final int c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - a(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + a(i, i2, -i3);
            }
        }
        return i2;
    }

    public static final long a(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j < j2) {
                return j2 - c(j2, j, j3);
            }
        } else {
            if (j3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                return j2 + c(j, j2, -j3);
            }
        }
        return j2;
    }
}
