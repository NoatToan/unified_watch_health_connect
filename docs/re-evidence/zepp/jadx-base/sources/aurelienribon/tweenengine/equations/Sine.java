package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Sine extends TweenEquation {
    private static final float a = 3.1415927f;
    public static final Sine IN = new a();
    public static final Sine OUT = new b();
    public static final Sine INOUT = new c();

    public static class a extends Sine {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return ((float) (-Math.cos(f * 1.5707964f))) + 1.0f;
        }

        public String toString() {
            return "Sine.IN";
        }
    }

    public static class b extends Sine {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return (float) Math.sin(f * 1.5707964f);
        }

        public String toString() {
            return "Sine.OUT";
        }
    }

    public static class c extends Sine {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            return (((float) Math.cos(f * 3.1415927f)) - 1.0f) * (-0.5f);
        }

        public String toString() {
            return "Sine.INOUT";
        }
    }
}
