package aurelienribon.tweenengine.primitives;

import aurelienribon.tweenengine.TweenAccessor;

/* JADX INFO: loaded from: classes2.dex */
public class MutableFloat extends Number implements TweenAccessor<MutableFloat> {
    private float a;

    public MutableFloat(float f) {
        this.a = f;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.a;
    }

    public void setValue(float f) {
        this.a = f;
    }

    @Override // aurelienribon.tweenengine.TweenAccessor
    public int getValues(MutableFloat mutableFloat, int i, float[] fArr) {
        fArr[0] = mutableFloat.a;
        return 1;
    }

    @Override // aurelienribon.tweenengine.TweenAccessor
    public void setValues(MutableFloat mutableFloat, int i, float[] fArr) {
        mutableFloat.a = fArr[0];
    }
}
