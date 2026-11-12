package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public final class Equalizer {
    public static final float BAND_NOT_PRESENT = Float.NEGATIVE_INFINITY;
    public static final Equalizer PASS_THRU_EQ = new Equalizer();
    private static final int b = 32;
    private final float[] a;

    public static abstract class EQFunction {
        public float getBand(int i) {
            return 0.0f;
        }
    }

    public Equalizer() {
        this.a = new float[32];
    }

    private float c(float f) {
        if (f == Float.NEGATIVE_INFINITY) {
            return f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < -1.0f) {
            return -1.0f;
        }
        return f;
    }

    public float a(float f) {
        if (f == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return (float) Math.pow(2.0d, f);
    }

    public float[] b() {
        float[] fArr = new float[32];
        for (int i = 0; i < 32; i++) {
            fArr[i] = a(this.a[i]);
        }
        return fArr;
    }

    public float getBand(int i) {
        if (i < 0 || i >= 32) {
            return 0.0f;
        }
        return this.a[i];
    }

    public int getBandCount() {
        return this.a.length;
    }

    public void reset() {
        for (int i = 0; i < 32; i++) {
            this.a[i] = 0.0f;
        }
    }

    public float setBand(int i, float f) {
        if (i < 0 || i >= 32) {
            return 0.0f;
        }
        float[] fArr = this.a;
        float f2 = fArr[i];
        fArr[i] = c(f);
        return f2;
    }

    public void setFrom(float[] fArr) {
        reset();
        int length = fArr.length <= 32 ? fArr.length : 32;
        for (int i = 0; i < length; i++) {
            this.a[i] = c(fArr[i]);
        }
    }

    public Equalizer(float[] fArr) {
        this.a = new float[32];
        setFrom(fArr);
    }

    public void setFrom(EQFunction eQFunction) {
        reset();
        for (int i = 0; i < 32; i++) {
            this.a[i] = c(eQFunction.getBand(i));
        }
    }

    public Equalizer(EQFunction eQFunction) {
        this.a = new float[32];
        setFrom(eQFunction);
    }

    public void setFrom(Equalizer equalizer) {
        if (equalizer != this) {
            setFrom(equalizer.a);
        }
    }
}
