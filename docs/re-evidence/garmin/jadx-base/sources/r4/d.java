package r4;

import android.graphics.Matrix;
import android.graphics.Outline;
import o4.d0;
import o4.e0;
import o4.n1;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f150167a = a.f150168a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr4/d$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f150168a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2824a f150169b = C2824a.f150170a;

        /* JADX INFO: renamed from: r4.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C2824a extends w implements e23.l<q4.f, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2824a f150170a = new C2824a();

            public C2824a() {
                super(1);
            }

            @Override // e23.l
            public final Unit invoke(q4.f fVar) {
                d0.f128823b.getClass();
                q4.f.A0(fVar, d0.f128831j, 0L, 0L, 0.0f, null, null, 126);
                return Unit.INSTANCE;
            }
        }

        private a() {
        }
    }

    float A();

    float B();

    float C();

    void D(long j8);

    float E();

    float F();

    void G(y yVar);

    long H();

    float I();

    Matrix J();

    int K();

    void L(int i14, int i15, long j8);

    long M();

    int N();

    void O(int i14);

    float a();

    n1 b();

    void c(float f14);

    void d(e0 e0Var);

    e0 e();

    default boolean f() {
        return true;
    }

    void g(boolean z14);

    void h(float f14);

    void i(float f14);

    void j(float f14);

    void k(float f14);

    void l(int i14);

    void m(long j8);

    void n(long j8);

    void o(Outline outline, long j8);

    float p();

    void q(float f14);

    float r();

    void s(float f14);

    void t(n1 n1Var);

    float u();

    void v(float f14);

    void w(float f14);

    void x(float f14);

    void y(g6.c cVar, g6.o oVar, c cVar2, c.b bVar);

    void z();
}
