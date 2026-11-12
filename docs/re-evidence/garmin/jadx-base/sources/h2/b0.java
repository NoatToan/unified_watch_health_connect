package h2;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import f5.a1;
import f5.e2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lh2/b0;", "Lh2/v;", "Lf5/a1;", "", "Lh2/h;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Lz1/u;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lo53/b0;", "coroutineScope", "Lg6/c;", "density", "Lg6/a;", "childConstraints", "<init>", "(Ljava/util/List;IIILy1/b2;IIZILh2/h;Lh2/h;FIZLz1/u;Lf5/a1;ZLjava/util/List;Ljava/util/List;Lo53/b0;Lg6/c;JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 implements v, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f80844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f80848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f80851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f80852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f80853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f80854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f80855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f80856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f80857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z1.u f80858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a1 f80859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f80860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<h> f80861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<h> f80862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o53.b0 f80863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g6.c f80864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f80865v;

    public b0(List list, int i14, int i15, int i16, b2 b2Var, int i17, int i18, boolean z14, int i19, h hVar, h hVar2, float f14, int i24, boolean z15, z1.u uVar, a1 a1Var, boolean z16, List list2, List list3, o53.b0 b0Var, g6.c cVar, long j8, int i25, p005kotlin.jvm.internal.j jVar) {
        this(list, i14, i15, i16, b2Var, i17, i18, z14, i19, hVar, hVar2, f14, i24, z15, uVar, a1Var, z16, (i25 & 131072) != 0 ? p13.j0.f134944a : list2, (i25 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? p13.j0.f134944a : list3, b0Var, cVar, j8, null);
    }

    @Override // h2.v
    public final long a() {
        a1 a1Var = this.f80859p;
        long f68888a = (((long) a1Var.getF81748b()) << 32) | (((long) a1Var.getF81749c()) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return f68888a;
    }

    @Override // h2.v
    public final int b() {
        return -this.f80849f;
    }

    @Override // h2.v
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF80847d() {
        return this.f80847d;
    }

    @Override // h2.v
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF80845b() {
        return this.f80845b;
    }

    @Override // h2.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF80846c() {
        return this.f80846c;
    }

    @Override // h2.v
    /* JADX INFO: renamed from: f, reason: from getter */
    public final z1.u getF80858o() {
        return this.f80858o;
    }

    @Override // h2.v
    public final List<h> g() {
        return this.f80844a;
    }

    @Override // f5.a1
    /* JADX INFO: renamed from: getHeight */
    public final int getF81749c() {
        return this.f80859p.getF81749c();
    }

    @Override // h2.v
    /* JADX INFO: renamed from: getOrientation, reason: from getter */
    public final b2 getF80848e() {
        return this.f80848e;
    }

    @Override // f5.a1
    /* JADX INFO: renamed from: getWidth */
    public final int getF81748b() {
        return this.f80859p.getF81748b();
    }

    public final b0 h(int i14) {
        int i15;
        int i16;
        int i17 = this.f80845b + this.f80846c;
        if (!this.f80860q) {
            List<h> list = this.f80844a;
            if (!list.isEmpty() && this.f80853j != null && (i16 = (i15 = this.f80856m) - i14) >= 0 && i16 < i17) {
                float f14 = i17 != 0 ? i14 / i17 : 0.0f;
                float f15 = this.f80855l;
                float f16 = f15 - f14;
                if (this.f80854k != null && f16 < 0.5f && f16 > -0.5f) {
                    h hVar = (h) p13.h0.b0(list);
                    h hVar2 = (h) p13.h0.m0(list);
                    int i18 = this.f80850g;
                    int i19 = this.f80849f;
                    if (i14 >= 0 ? Math.min(i19 - hVar.f80918m, i18 - hVar2.f80918m) > i14 : Math.min((hVar.f80918m + i17) - i19, (hVar2.f80918m + i17) - i18) > (-i14)) {
                        int size = list.size();
                        for (int i24 = 0; i24 < size; i24++) {
                            list.get(i24).a(i14);
                        }
                        List<h> list2 = this.f80861r;
                        int size2 = list2.size();
                        for (int i25 = 0; i25 < size2; i25++) {
                            list2.get(i25).a(i14);
                        }
                        List<h> list3 = this.f80862s;
                        int size3 = list3.size();
                        for (int i26 = 0; i26 < size3; i26++) {
                            list3.get(i26).a(i14);
                        }
                        return new b0(this.f80844a, this.f80845b, this.f80846c, this.f80847d, this.f80848e, this.f80849f, this.f80850g, this.f80851h, this.f80852i, this.f80853j, this.f80854k, f15 - f14, i15 - i14, this.f80857n || i14 > 0, this.f80858o, this.f80859p, this.f80860q, this.f80861r, this.f80862s, this.f80863t, this.f80864u, this.f80865v, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // h2.v
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF80851h() {
        return this.f80851h;
    }

    @Override // f5.a1
    public final Map<f5.a, Integer> p() {
        return this.f80859p.p();
    }

    @Override // f5.a1
    public final void q() {
        this.f80859p.q();
    }

    @Override // f5.a1
    public final e23.l<e2, Unit> r() {
        return this.f80859p.r();
    }

    private b0(List<h> list, int i14, int i15, int i16, b2 b2Var, int i17, int i18, boolean z14, int i19, h hVar, h hVar2, float f14, int i24, boolean z15, z1.u uVar, a1 a1Var, boolean z16, List<h> list2, List<h> list3, o53.b0 b0Var, g6.c cVar, long j8) {
        this.f80844a = list;
        this.f80845b = i14;
        this.f80846c = i15;
        this.f80847d = i16;
        this.f80848e = b2Var;
        this.f80849f = i17;
        this.f80850g = i18;
        this.f80851h = z14;
        this.f80852i = i19;
        this.f80853j = hVar;
        this.f80854k = hVar2;
        this.f80855l = f14;
        this.f80856m = i24;
        this.f80857n = z15;
        this.f80858o = uVar;
        this.f80859p = a1Var;
        this.f80860q = z16;
        this.f80861r = list2;
        this.f80862s = list3;
        this.f80863t = b0Var;
        this.f80864u = cVar;
        this.f80865v = j8;
    }

    public /* synthetic */ b0(List list, int i14, int i15, int i16, b2 b2Var, int i17, int i18, boolean z14, int i19, h hVar, h hVar2, float f14, int i24, boolean z15, z1.u uVar, a1 a1Var, boolean z16, List list2, List list3, o53.b0 b0Var, g6.c cVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(list, i14, i15, i16, b2Var, i17, i18, z14, i19, hVar, hVar2, f14, i24, z15, uVar, a1Var, z16, list2, list3, b0Var, cVar, j8);
    }
}
