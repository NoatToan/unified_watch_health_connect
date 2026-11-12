package w5;

import android.graphics.Typeface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/n0;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    public static Typeface a(String str, f0 f0Var, int i14) {
        b0.f182070b.getClass();
        if (i14 == 0) {
            f0.f182097b.getClass();
            if (p005kotlin.jvm.internal.s.g(f0Var, f0.f182102g) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), f0Var.f182107a, i14 == b0.f182071c);
    }
}
