package f5;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {
    long B(long j8);

    long F(long j8);

    default void G(c0 c0Var, float[] fArr) {
        e5.a.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    long W(long j8);

    default long X(c0 c0Var, long j8) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long a();

    long b0(c0 c0Var, long j8);

    c0 c0();

    default long f(long j8) {
        n4.c.f123541b.getClass();
        return n4.c.f123543d;
    }

    default void i0(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    boolean isAttached();

    n4.d j0(c0 c0Var, boolean z14);

    default long o(long j8) {
        n4.c.f123541b.getClass();
        return n4.c.f123543d;
    }

    c0 y();
}
