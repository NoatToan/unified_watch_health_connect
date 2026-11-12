package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Expo extends TweenEquation {
    public static final Expo IN = new a();
    public static final Expo OUT = new b();
    public static final Expo INOUT = new c();

    public static class a extends Expo {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f - 1.0f) * 10.0f);
        }

        public String toString() {
            return "Expo.IN";
        }
    }

    public static class b extends Expo {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return 1.0f + (-((float) Math.pow(2.0d, f * (-10.0f))));
        }

        public String toString() {
            return "Expo.OUT";
        }
    }

    public static class c extends Expo {
        @Override // aurelienribon.tweenengine.TweenEquation
        public final float compute(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f * 2.0f;
            return (f2 < 1.0f ? (float) Math.pow(2.0d, (f2 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (f2 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }

        public String toString() {
            return "Expo.INOUT";
        }
    }
}
