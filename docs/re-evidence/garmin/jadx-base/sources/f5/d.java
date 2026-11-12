package f5;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf5/d;", "", "Lf5/c;", "intrinsicMeasureScope", "Lg6/o;", "layoutDirection", "<init>", "(Lf5/c;Lg6/o;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c, b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f68909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.o f68910b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/d$a", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f68911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f68912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<f5.a, Integer> f68913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<e2, Unit> f68914d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar) {
            this.f68911a = i14;
            this.f68912b = i15;
            this.f68913c = map;
            this.f68914d = lVar;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public final int getF68912b() {
            return this.f68912b;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public final int getF68911a() {
            return this.f68911a;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f68913c;
        }

        @Override // f5.a1
        public final void q() {
        }

        @Override // f5.a1
        public final e23.l<e2, Unit> r() {
            return this.f68914d;
        }
    }

    public d(c cVar, g6.o oVar) {
        this.f68909a = cVar;
        this.f68910b = oVar;
    }

    @Override // g6.c
    public final long A(long j8) {
        return this.f68909a.A(j8);
    }

    @Override // g6.c
    public final long D(float f14) {
        return this.f68909a.D(f14);
    }

    @Override // g6.i
    public final float H0(long j8) {
        return this.f68909a.H0(j8);
    }

    @Override // f5.b1
    public final a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super v1.a, Unit> lVar2) {
        boolean z14 = false;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        if ((i14 & (-16777216)) == 0 && ((-16777216) & i15) == 0) {
            z14 = true;
        }
        if (!z14) {
            e5.a.b("Size(" + i14 + " x " + i15 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i14, i15, map, lVar);
    }

    @Override // g6.i
    public final long Y(float f14) {
        return this.f68909a.Y(f14);
    }

    @Override // g6.c
    public final float c1(int i14) {
        return this.f68909a.c1(i14);
    }

    @Override // g6.c
    public final float d1(float f14) {
        return this.f68909a.d1(f14);
    }

    @Override // g6.c
    public final int f0(float f14) {
        return this.f68909a.f0(f14);
    }

    @Override // g6.c
    public final float g0(long j8) {
        return this.f68909a.g0(j8);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f68909a.getF75991a();
    }

    @Override // f5.x
    /* JADX INFO: renamed from: getLayoutDirection, reason: from getter */
    public final g6.o getF68910b() {
        return this.f68910b;
    }

    @Override // g6.c
    public final long k1(long j8) {
        return this.f68909a.k1(j8);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f68909a.getF75992b();
    }

    @Override // g6.c
    public final float s0(float f14) {
        return this.f68909a.s0(f14);
    }

    @Override // f5.x
    public final boolean t1() {
        return this.f68909a.t1();
    }

    @Override // g6.c
    public final int v0(long j8) {
        return this.f68909a.v0(j8);
    }
}
