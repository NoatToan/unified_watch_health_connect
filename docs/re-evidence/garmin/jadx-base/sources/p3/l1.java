package p3;

/* JADX INFO: loaded from: classes.dex */
public interface l1 extends p1<Double>, x3<Double> {
    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p3.x3
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    default void h(double d14) {
        u(d14);
    }

    @Override // p3.p1
    /* bridge */ /* synthetic */ default void setValue(Double d14) {
        h(d14.doubleValue());
    }

    void u(double d14);
}
