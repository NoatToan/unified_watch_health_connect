package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Linear extends TweenEquation {
    public static final Linear INOUT = new a();

    public static class a extends Linear {
        @Override // aurelienribon.tweenengine.TweenEquation
        public float compute(float f) {
            return f;
        }

        public String toString() {
            return "Linear.INOUT";
        }
    }
}
