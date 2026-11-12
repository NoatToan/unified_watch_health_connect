package b7;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f16234a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f16235b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f16236c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f16237d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private b() {
    }

    public static int a(float f14) {
        if (f14 < 1.0f) {
            return -16777216;
        }
        if (f14 > 99.0f) {
            return -1;
        }
        float f15 = (f14 + 16.0f) / 116.0f;
        float f16 = f14 > 8.0f ? f15 * f15 * f15 : f14 / 903.2963f;
        float f17 = f15 * f15 * f15;
        boolean z14 = f17 > 0.008856452f;
        float f18 = z14 ? f17 : ((f15 * 116.0f) - 16.0f) / 903.2963f;
        if (!z14) {
            f17 = ((f15 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f16236c;
        return c7.d.a(f18 * fArr[0], f16 * fArr[1], f17 * fArr[2]);
    }

    public static float b(int i14) {
        float f14 = i14 / 255.0f;
        return (f14 <= 0.04045f ? f14 / 12.92f : (float) Math.pow((f14 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float c() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
