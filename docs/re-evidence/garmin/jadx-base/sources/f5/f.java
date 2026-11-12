package f5;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/f;", "", "Lf5/b1;", "Lh5/d0;", "coordinator", "Lf5/e;", "approachNode", "<init>", "(Lh5/d0;Lf5/e;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements c, b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5.d0 f68931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f68932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68933c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/f$a", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<f5.a, Integer> f68936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.l<e2, Unit> f68937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<v1.a, Unit> f68938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f68939f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super v1.a, Unit> lVar2, f fVar) {
            this.f68938e = lVar2;
            this.f68939f = fVar;
            this.f68934a = i14;
            this.f68935b = i15;
            this.f68936c = map;
            this.f68937d = lVar;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public final int getF81749c() {
            return this.f68935b;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public final int getF81748b() {
            return this.f68934a;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f68936c;
        }

        @Override // f5.a1
        public final void q() {
            this.f68938e.invoke(this.f68939f.f68931a.f81866l);
        }

        @Override // f5.a1
        public final e23.l<e2, Unit> r() {
            return this.f68937d;
        }
    }

    public f(h5.d0 d0Var, e eVar) {
        this.f68931a = d0Var;
        this.f68932b = eVar;
    }

    @Override // g6.c
    public final long A(long j8) {
        return this.f68931a.A(j8);
    }

    @Override // g6.c
    public final long D(float f14) {
        return this.f68931a.D(f14);
    }

    @Override // g6.i
    public final float H0(long j8) {
        return this.f68931a.H0(j8);
    }

    @Override // f5.b1
    public final a1 H1(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super v1.a, Unit> lVar) {
        return this.f68931a.P(i14, i15, map, null, lVar);
    }

    @Override // f5.b1
    public final a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super v1.a, Unit> lVar2) {
        if (!((i14 & (-16777216)) == 0 && ((-16777216) & i15) == 0)) {
            e5.a.b("Size(" + i14 + " x " + i15 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i14, i15, map, lVar, lVar2, this);
    }

    @Override // g6.i
    public final long Y(float f14) {
        return this.f68931a.Y(f14);
    }

    @Override // g6.c
    public final float c1(int i14) {
        return this.f68931a.c1(i14);
    }

    @Override // g6.c
    public final float d1(float f14) {
        return this.f68931a.d1(f14);
    }

    @Override // g6.c
    public final int f0(float f14) {
        return this.f68931a.f0(f14);
    }

    @Override // g6.c
    public final float g0(long j8) {
        return this.f68931a.g0(j8);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f68931a.getF75991a();
    }

    @Override // f5.x
    /* JADX INFO: renamed from: getLayoutDirection */
    public final g6.o getF68910b() {
        return this.f68931a.f81711p.B;
    }

    @Override // g6.c
    public final long k1(long j8) {
        return this.f68931a.k1(j8);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f68931a.getF75992b();
    }

    @Override // g6.c
    public final float s0(float f14) {
        return this.f68931a.getF75991a() * f14;
    }

    @Override // f5.x
    public final boolean t1() {
        return false;
    }

    @Override // g6.c
    public final int v0(long j8) {
        return this.f68931a.v0(j8);
    }
}
