package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Elastic extends TweenEquation {
    private static final float a = 3.1415927f;
    public float param_a;
    public float param_p;
    public boolean setA = false;
    public boolean setP = false;
    public static final Elastic IN = new a();
    public static final Elastic OUT = new b();
    public static final Elastic INOUT = new c();

    public static class a extends Elastic {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float fAsin;
            float f2 = this.param_a;
            float f3 = this.param_p;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            if (!this.setP) {
                f3 = 0.3f;
            }
            if (!this.setA || f2 < 1.0f) {
                fAsin = f3 / 4.0f;
                f2 = 1.0f;
            } else {
                fAsin = (f3 / 6.2831855f) * ((float) Math.asin(1.0f / f2));
            }
            float f4 = f - 1.0f;
            return -(f2 * ((float) Math.pow(2.0d, 10.0f * f4)) * ((float) Math.sin(((f4 - fAsin) * 6.2831855f) / f3)));
        }

        public String toString() {
            return "Elastic.IN";
        }
    }

    public static class b extends Elastic {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float fAsin;
            float f2 = this.param_a;
            float f3 = this.param_p;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            if (!this.setP) {
                f3 = 0.3f;
            }
            if (!this.setA || f2 < 1.0f) {
                fAsin = f3 / 4.0f;
                f2 = 1.0f;
            } else {
                fAsin = (f3 / 6.2831855f) * ((float) Math.asin(1.0f / f2));
            }
            return (f2 * ((float) Math.pow(2.0d, (-10.0f) * f)) * ((float) Math.sin(((f - fAsin) * 6.2831855f) / f3))) + 1.0f;
        }

        public String toString() {
            return "Elastic.OUT";
        }
    }

    public static class c extends Elastic {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float fAsin;
            float f2 = this.param_a;
            float f3 = this.param_p;
            if (f == 0.0f) {
                return 0.0f;
            }
            float f4 = f * 2.0f;
            if (f4 == 2.0f) {
                return 1.0f;
            }
            if (!this.setP) {
                f3 = 0.45000002f;
            }
            if (!this.setA || f2 < 1.0f) {
                fAsin = f3 / 4.0f;
                f2 = 1.0f;
            } else {
                fAsin = (f3 / 6.2831855f) * ((float) Math.asin(1.0f / f2));
            }
            if (f4 < 1.0f) {
                float f5 = f4 - 1.0f;
                return f2 * ((float) Math.pow(2.0d, 10.0f * f5)) * ((float) Math.sin(((f5 - fAsin) * 6.2831855f) / f3)) * (-0.5f);
            }
            float f6 = f4 - 1.0f;
            return (f2 * ((float) Math.pow(2.0d, (-10.0f) * f6)) * ((float) Math.sin(((f6 - fAsin) * 6.2831855f) / f3)) * 0.5f) + 1.0f;
        }

        public String toString() {
            return "Elastic.INOUT";
        }
    }

    public Elastic a(float f) {
        this.param_a = f;
        this.setA = true;
        return this;
    }

    public Elastic p(float f) {
        this.param_p = f;
        this.setP = true;
        return this;
    }
}
