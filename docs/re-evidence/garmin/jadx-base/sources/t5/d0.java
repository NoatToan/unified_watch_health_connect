package t5;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<a0> f162422a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f162423b = a(0, 0);

    public static final long a(int i14, int i15) {
        return (((long) i15) & 4294967295L) | (((long) i14) << 32);
    }

    public static final TextDirectionHeuristic b(int i14) {
        if (i14 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i14 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i14 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i14 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i14 != 4) {
            return i14 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
