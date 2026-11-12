package o4;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128889a;

        static {
            int[] iArr = new int[f1.b.values().length];
            try {
                iArr[f1.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f1.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f128889a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final j a() {
        return new j(null, 1, 0 == true ? 1 : 0);
    }

    public static final Path.Direction b(f1.b bVar) {
        int i14 = a.f128889a[bVar.ordinal()];
        if (i14 == 1) {
            return Path.Direction.CCW;
        }
        if (i14 == 2) {
            return Path.Direction.CW;
        }
        lc.u0.r();
        return null;
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
