package aurelienribon.tweenengine;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TweenEquation {
    public abstract float compute(float f);

    public boolean isValueOf(String str) {
        return str.equals(toString());
    }
}
