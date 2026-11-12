package o4;

import android.graphics.Path;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f128849a = a.f128850a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/f1$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f128850a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/f1$b;", "", "<init>", "(Ljava/lang/String;I)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        CounterClockwise,
        Clockwise
    }

    static void m(j jVar, f1 f1Var) {
        n4.c.f123541b.getClass();
        Path path = jVar.f128869b;
        if (!(f1Var instanceof j)) {
            org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
        } else {
            int i14 = (int) 0;
            path.addPath(((j) f1Var).f128869b, Float.intBitsToFloat(i14), Float.intBitsToFloat(i14));
        }
    }

    void a(float f14, float f15);

    void b(float f14, float f15, float f16, float f17, float f18, float f19);

    void c(float f14, float f15);

    void close();

    @o13.e
    void d(float f14, float f15, float f16, float f17);

    void e(long j8);

    default void f(float f14, float f15, float f16, float f17) {
        d(f14, f15, f16, f17);
    }

    int g();

    n4.d getBounds();

    boolean h();

    @o13.e
    void i(float f14, float f15, float f16, float f17);

    void j(int i14);

    void k(n4.e eVar, b bVar);

    void n(float f14, float f15);

    void o(float f14, float f15);

    void p(float f14, float f15, float f16, float f17, float f18, float f19);

    void q(n4.d dVar, b bVar);

    default void r(float f14, float f15, float f16, float f17) {
        i(f14, f15, f16, f17);
    }

    void reset();

    default void rewind() {
        reset();
    }

    boolean s(f1 f1Var, f1 f1Var2, int i14);
}
