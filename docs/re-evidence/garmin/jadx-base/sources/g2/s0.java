package g2;

import f5.e2;
import f5.k2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg2/s0;", "Lg2/r0;", "Lf5/b1;", "Lg2/h0;", "itemContentFactory", "Lf5/k2;", "subcomposeMeasureScope", "<init>", "(Lg2/h0;Lf5/k2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 implements r0, f5.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f75212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2 f75213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f75214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.i0<List<f5.y0>> f75215d;

    public s0(h0 h0Var, k2 k2Var) {
        this.f75212a = h0Var;
        this.f75213b = k2Var;
        this.f75214c = h0Var.f75125b.invoke();
        p1.o.a();
        this.f75215d = p1.o.a();
    }

    @Override // g6.c
    public final long A(long j8) {
        return this.f75213b.A(j8);
    }

    @Override // g6.c
    public final long D(float f14) {
        return this.f75213b.D(f14);
    }

    @Override // g6.i
    public final float H0(long j8) {
        return this.f75213b.H0(j8);
    }

    @Override // f5.b1
    public final f5.a1 H1(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super f5.v1.a, Unit> lVar) {
        return this.f75213b.H1(i14, i15, map, lVar);
    }

    @Override // f5.b1
    public final f5.a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super f5.v1.a, Unit> lVar2) {
        return this.f75213b.P(i14, i15, map, lVar, lVar2);
    }

    @Override // g6.i
    public final long Y(float f14) {
        return this.f75213b.Y(f14);
    }

    @Override // g6.c
    public final float c1(int i14) {
        return this.f75213b.c1(i14);
    }

    @Override // g6.c
    public final float d1(float f14) {
        return this.f75213b.d1(f14);
    }

    @Override // g6.c
    public final int f0(float f14) {
        return this.f75213b.f0(f14);
    }

    @Override // g6.c
    public final float g0(long j8) {
        return this.f75213b.g0(j8);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f75213b.getF75991a();
    }

    @Override // f5.x
    /* JADX INFO: renamed from: getLayoutDirection */
    public final g6.o getF69049a() {
        return this.f75213b.getF69049a();
    }

    @Override // g6.c
    public final long k1(long j8) {
        return this.f75213b.k1(j8);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f75213b.getF75992b();
    }

    @Override // g6.c
    public final float s0(float f14) {
        return this.f75213b.s0(f14);
    }

    @Override // f5.x
    public final boolean t1() {
        return this.f75213b.t1();
    }

    @Override // g6.c
    public final int v0(long j8) {
        return this.f75213b.v0(j8);
    }

    @Override // g2.r0
    public final List<f5.y0> x0(int i14) {
        p1.i0<List<f5.y0>> i0Var = this.f75215d;
        List<f5.y0> listB = i0Var.b(i14);
        if (listB != null) {
            return listB;
        }
        i0 i0Var2 = this.f75214c;
        Object key = i0Var2.getKey(i14);
        List listF0 = this.f75213b.F0(this.f75212a.a(i14, key, i0Var2.f(i14)), key);
        i0Var.i(i14, listF0);
        return listF0;
    }
}
