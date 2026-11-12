package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Bounce extends TweenEquation {
    public static final Bounce IN = new a();
    public static final Bounce OUT = new b();
    public static final Bounce INOUT = new c();

    public static class a extends Bounce {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return 1.0f - Bounce.OUT.compute(1.0f - f);
        }

        public String toString() {
            return "Bounce.IN";
        }
    }

    public static class b extends Bounce {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            double d = f;
            if (d < 0.36363636363636365d) {
                return 7.5625f * f * f;
            }
            if (d < 0.7272727272727273d) {
                float f2 = f - 0.54545456f;
                return (7.5625f * f2 * f2) + 0.75f;
            }
            if (d < 0.9090909090909091d) {
                float f3 = f - 0.8181818f;
                return (7.5625f * f3 * f3) + 0.9375f;
            }
            float f4 = f - 0.95454544f;
            return (7.5625f * f4 * f4) + 0.984375f;
        }

        public String toString() {
            return "Bounce.OUT";
        }
    }

    public static class c extends Bounce {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return f < 0.5f ? Bounce.IN.compute(f * 2.0f) * 0.5f : (Bounce.OUT.compute((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }

        public String toString() {
            return "Bounce.INOUT";
        }
    }
}
