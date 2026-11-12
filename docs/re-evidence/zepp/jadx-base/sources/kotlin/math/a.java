package kotlin.math;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a {

    @NotNull
    public static final a a = new a();

    @JvmField
    public static final double b = Math.log(2.0d);

    @JvmField
    public static final double c;

    @JvmField
    public static final double d;

    @JvmField
    public static final double e;

    @JvmField
    public static final double f;

    @JvmField
    public static final double g;

    static {
        double dUlp = Math.ulp(1.0d);
        c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        e = dSqrt2;
        double d2 = 1;
        f = d2 / dSqrt;
        g = d2 / dSqrt2;
    }

    private a() {
    }
}
