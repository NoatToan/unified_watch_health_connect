package f2;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import f5.a1;
import f5.e2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lf2/z;", "Lf2/y;", "Lf5/a1;", "Lf2/c0;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lo53/b0;", "coroutineScope", "Lg6/c;", "density", "slotsPerLine", "Lkotlin/Function1;", "", "Lo13/p;", "Lg6/a;", "prefetchInfoRetriever", "lineIndexProvider", "Lf2/a0;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lf2/c0;IZFLf5/a1;FZLo53/b0;Lg6/c;ILe23/l;Le23/l;Ljava/util/List;IIIZLy1/b2;II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z implements y, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f68324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f68327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f68328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f68329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o53.b0 f68331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g6.c f68332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f68333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e23.l<Integer, List<o13.p<Integer, g6.a>>> f68334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e23.l<Integer, Integer> f68335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<a0> f68336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f68337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f68338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f68339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f68340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f68341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f68342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f68343t;

    /* JADX WARN: Multi-variable type inference failed */
    public z(c0 c0Var, int i14, boolean z14, float f14, a1 a1Var, float f15, boolean z15, o53.b0 b0Var, g6.c cVar, int i15, e23.l<? super Integer, ? extends List<o13.p<Integer, g6.a>>> lVar, e23.l<? super Integer, Integer> lVar2, List<a0> list, int i16, int i17, int i18, boolean z16, b2 b2Var, int i19, int i24) {
        this.f68324a = c0Var;
        this.f68325b = i14;
        this.f68326c = z14;
        this.f68327d = f14;
        this.f68328e = a1Var;
        this.f68329f = f15;
        this.f68330g = z15;
        this.f68331h = b0Var;
        this.f68332i = cVar;
        this.f68333j = i15;
        this.f68334k = lVar;
        this.f68335l = lVar2;
        this.f68336m = list;
        this.f68337n = i16;
        this.f68338o = i17;
        this.f68339p = i18;
        this.f68340q = z16;
        this.f68341r = b2Var;
        this.f68342s = i19;
        this.f68343t = i24;
    }

    @Override // f2.y
    public final long a() {
        a1 a1Var = this.f68328e;
        long f68911a = (((long) a1Var.getF68911a()) << 32) | (((long) a1Var.getF68912b()) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return f68911a;
    }

    @Override // f2.y
    public final int b() {
        return -this.f68337n;
    }

    @Override // f2.y
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF68342s() {
        return this.f68342s;
    }

    @Override // f2.y
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF68339p() {
        return this.f68339p;
    }

    @Override // f2.y
    public final List<a0> e() {
        return this.f68336m;
    }

    @Override // f2.y
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF68337n() {
        return this.f68337n;
    }

    @Override // f2.y
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF68338o() {
        return this.f68338o;
    }

    @Override // f5.a1
    /* JADX INFO: renamed from: getHeight */
    public final int getF68912b() {
        return this.f68328e.getF68912b();
    }

    @Override // f2.y
    /* JADX INFO: renamed from: getOrientation, reason: from getter */
    public final b2 getF68341r() {
        return this.f68341r;
    }

    @Override // f5.a1
    /* JADX INFO: renamed from: getWidth */
    public final int getF68911a() {
        return this.f68328e.getF68911a();
    }

    @Override // f2.y
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF68343t() {
        return this.f68343t;
    }

    public final z i(int i14, boolean z14) {
        c0 c0Var;
        int i15;
        char c14;
        int i16;
        if (this.f68330g) {
            return null;
        }
        List<a0> list = this.f68336m;
        if (list.isEmpty() || (c0Var = this.f68324a) == null) {
            return null;
        }
        int i17 = c0Var.f68186h;
        int i18 = this.f68325b - i14;
        if (i18 < 0 || i18 >= i17) {
            return null;
        }
        a0 a0Var = (a0) p13.h0.b0(list);
        a0 a0Var2 = (a0) p13.h0.m0(list);
        if (a0Var.f68172y || a0Var2.f68172y) {
            return null;
        }
        int i19 = this.f68338o;
        int i24 = this.f68337n;
        b2 b2Var = this.f68341r;
        if (i14 < 0) {
            if (Math.min((z1.e.a(a0Var, b2Var) + a0Var.f68164q) - i24, (z1.e.a(a0Var2, b2Var) + a0Var2.f68164q) - i19) <= (-i14)) {
                return null;
            }
        } else if (Math.min(i24 - z1.e.a(a0Var, b2Var), i19 - z1.e.a(a0Var2, b2Var)) <= i14) {
            return null;
        }
        int size = list.size();
        int i25 = 0;
        while (i25 < size) {
            a0 a0Var3 = list.get(i25);
            boolean z15 = a0Var3.f68150c;
            if (a0Var3.f68172y) {
                i15 = i25;
            } else {
                long j8 = a0Var3.f68169v;
                g6.k.a aVar = g6.k.f76003b;
                long j14 = 4294967295L;
                int i26 = i25;
                char c15 = ' ';
                a0Var3.f68169v = (((long) (z15 ? (int) (j8 >> 32) : ((int) (j8 >> 32)) + i14)) << 32) | (((long) (z15 ? ((int) (j8 & 4294967295L)) + i14 : (int) (j8 & 4294967295L))) & 4294967295L);
                if (z14) {
                    int size2 = a0Var3.f68156i.size();
                    int i27 = 0;
                    while (i27 < size2) {
                        g2.v vVarA = a0Var3.f68159l.a(i27, a0Var3.f68149b);
                        if (vVarA != null) {
                            long j15 = vVarA.f75263l;
                            if (z15) {
                                c14 = c15;
                                i16 = (int) (j15 >> c14);
                            } else {
                                c14 = c15;
                                i16 = ((int) (j15 >> c14)) + i14;
                            }
                            vVarA.f75263l = (((long) i16) << c14) | (((long) (z15 ? ((int) (j15 & j14)) + i14 : (int) (j15 & j14))) & j14);
                        } else {
                            j14 = j14;
                        }
                        i27++;
                        i26 = i26;
                        j14 = j14;
                        c15 = ' ';
                    }
                }
                i15 = i26;
            }
            i25 = i15 + 1;
        }
        return new z(this.f68324a, i18, this.f68326c || i14 > 0, i14, this.f68328e, this.f68329f, this.f68330g, this.f68331h, this.f68332i, this.f68333j, this.f68334k, this.f68335l, this.f68336m, this.f68337n, this.f68338o, this.f68339p, this.f68340q, this.f68341r, this.f68342s, this.f68343t);
    }

    @Override // f5.a1
    public final Map<f5.a, Integer> p() {
        return this.f68328e.p();
    }

    @Override // f5.a1
    public final void q() {
        this.f68328e.q();
    }

    @Override // f5.a1
    public final e23.l<e2, Unit> r() {
        return this.f68328e.r();
    }
}
