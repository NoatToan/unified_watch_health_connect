package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Quint extends TweenEquation {
    public static final Quint IN = new a();
    public static final Quint OUT = new b();
    public static final Quint INOUT = new c();

    public static class a extends Quint {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return f * f * f * f * f;
        }

        public String toString() {
            return "Quint.IN";
        }
    }

    public static class b extends Quint {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }

        public String toString() {
            return "Quint.OUT";
        }
    }

    public static class c extends Quint {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2 * f2 * f2 * f2;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * f3 * f3 * f3) + 2.0f) * 0.5f;
        }

        public String toString() {
            return "Quint.INOUT";
        }
    }
}
