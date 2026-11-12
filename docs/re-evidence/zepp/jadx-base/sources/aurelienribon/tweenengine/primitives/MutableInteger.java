package aurelienribon.tweenengine.primitives;

import aurelienribon.tweenengine.TweenAccessor;

/* JADX INFO: loaded from: classes2.dex */
public class MutableInteger extends Number implements TweenAccessor<MutableInteger> {
    private int a;

    public MutableInteger(int i) {
        this.a = i;
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
        return this.a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.a;
    }

    public void setValue(int i) {
        this.a = i;
    }

    @Override // aurelienribon.tweenengine.TweenAccessor
    public int getValues(MutableInteger mutableInteger, int i, float[] fArr) {
        fArr[0] = mutableInteger.a;
        return 1;
    }

    @Override // aurelienribon.tweenengine.TweenAccessor
    public void setValues(MutableInteger mutableInteger, int i, float[] fArr) {
        mutableInteger.a = (int) fArr[0];
    }
}
