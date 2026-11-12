package p3;

/* JADX INFO: loaded from: classes.dex */
public interface m1 extends p1<Float>, x3<Float> {
    default void g(float f14) {
        i(f14);
    }

    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p3.x3
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }

    void i(float f14);

    @Override // p3.p1
    /* bridge */ /* synthetic */ default void setValue(Float f14) {
        g(f14.floatValue());
    }
}
