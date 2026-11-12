package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Back extends TweenEquation {
    public float param_s = 1.70158f;
    public static final Back IN = new a();
    public static final Back OUT = new b();
    public static final Back INOUT = new c();

    public static class a extends Back {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = this.param_s;
            return f * f * (((1.0f + f2) * f) - f2);
        }

        public String toString() {
            return "Back.IN";
        }
    }

    public static class b extends Back {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = this.param_s;
            float f3 = f - 1.0f;
            return (f3 * f3 * (((f2 + 1.0f) * f3) + f2)) + 1.0f;
        }

        public String toString() {
            return "Back.OUT";
        }
    }

    public static class c extends Back {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = this.param_s;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                float f4 = f2 * 1.525f;
                return f3 * f3 * (((1.0f + f4) * f3) - f4) * 0.5f;
            }
            float f5 = f3 - 2.0f;
            float f6 = f2 * 1.525f;
            return ((f5 * f5 * (((1.0f + f6) * f5) + f6)) + 2.0f) * 0.5f;
        }

        public String toString() {
            return "Back.INOUT";
        }
    }

    public Back s(float f) {
        this.param_s = f;
        return this;
    }
}
