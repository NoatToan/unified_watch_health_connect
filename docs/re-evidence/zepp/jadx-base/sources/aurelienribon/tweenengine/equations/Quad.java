package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Quad extends TweenEquation {
    public static final Quad IN = new a();
    public static final Quad OUT = new b();
    public static final Quad INOUT = new c();

    public static class a extends Quad {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return f * f;
        }

        public String toString() {
            return "Quad.IN";
        }
    }

    public static class b extends Quad {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return (-f) * (f - 2.0f);
        }

        public String toString() {
            return "Quad.OUT";
        }
    }

    public static class c extends Quad {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * (-0.5f);
        }

        public String toString() {
            return "Quad.INOUT";
        }
    }
}
