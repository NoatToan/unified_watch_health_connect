package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Cubic extends TweenEquation {
    public static final Cubic IN = new a();
    public static final Cubic OUT = new b();
    public static final Cubic INOUT = new c();

    public static class a extends Cubic {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return f * f * f;
        }

        public String toString() {
            return "Cubic.IN";
        }
    }

    public static class b extends Cubic {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2) + 1.0f;
        }

        public String toString() {
            return "Cubic.OUT";
        }
    }

    public static class c extends Cubic {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2 * f2;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * f3) + 2.0f) * 0.5f;
        }

        public String toString() {
            return "Cubic.INOUT";
        }
    }
}
