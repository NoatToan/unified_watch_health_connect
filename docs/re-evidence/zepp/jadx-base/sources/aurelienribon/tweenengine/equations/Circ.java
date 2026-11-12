package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Circ extends TweenEquation {
    public static final Circ IN = new a();
    public static final Circ OUT = new b();
    public static final Circ INOUT = new c();

    public static class a extends Circ {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return ((float) (-Math.sqrt(1.0f - (f * f)))) - 1.0f;
        }

        public String toString() {
            return "Circ.IN";
        }
    }

    public static class b extends Circ {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt(1.0f - (f2 * f2));
        }

        public String toString() {
            return "Circ.OUT";
        }
    }

    public static class c extends Circ {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return (((float) Math.sqrt(1.0f - (f2 * f2))) - 1.0f) * (-0.5f);
            }
            float f3 = f2 - 2.0f;
            return (((float) Math.sqrt(1.0f - (f3 * f3))) + 1.0f) * 0.5f;
        }

        public String toString() {
            return "Circ.INOUT";
        }
    }
}
