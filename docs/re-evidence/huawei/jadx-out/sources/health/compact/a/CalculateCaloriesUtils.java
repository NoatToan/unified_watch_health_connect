package health.compact.a;

/* JADX INFO: loaded from: classes2.dex */
public class CalculateCaloriesUtils {
    public static double a(float f, float f2, float f3) {
        return f * 0.0167f * f3 * f2;
    }

    public static double c(double d, float f) {
        return d * ((double) f);
    }

    public static double c(float f, float f2, float f3) {
        return (((f * 3.5f) * f3) * f2) / 200.0f;
    }

    public static double d(float f, float f2, float f3) {
        return f * 0.0167f * f3 * f2;
    }

    public static double e(double d, float f) {
        return d * 2.5999999046325684d * ((double) f);
    }

    private CalculateCaloriesUtils() {
    }

    public static double d(double d, float f) {
        return c(d, f) * 0.5d;
    }

    public static double b(double d, float f) {
        return c(d, f) * 0.75d;
    }
}
