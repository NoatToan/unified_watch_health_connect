package og2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Log2/f;", "", "Li53/c;", "Log2/j;", "charts", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "Log2/g;", "gradient", "Lo4/d0;", "defaultLineColorRes", "Log2/b;", "xAxisRange", "yAxisRange", "Log2/q0;", "yAxisLabelsRenderer", "Log2/k0;", "xAxisLabelsRenderer", "", "invertYAxis", "<init>", "(Li53/c;Log2/j;Li53/c;Lo4/d0;Log2/b;Log2/b;Log2/q0;Log2/k0;ZLkotlin/jvm/internal/j;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<i53.c<j>> f132025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f132026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<g> f132027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.d0 f132028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f132029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f132030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f132031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f132032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f132033i;

    public /* synthetic */ f(i53.c cVar, j jVar, i53.c cVar2, o4.d0 d0Var, b bVar, b bVar2, q0 q0Var, k0 k0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(cVar, jVar, (i14 & 4) != 0 ? null : cVar2, (i14 & 8) != 0 ? null : d0Var, (i14 & 16) != 0 ? null : bVar, (i14 & 32) != 0 ? null : bVar2, (i14 & 64) != 0 ? null : q0Var, (i14 & 128) != 0 ? null : k0Var, z14, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f132025a, fVar.f132025a) && p005kotlin.jvm.internal.s.g(this.f132026b, fVar.f132026b) && p005kotlin.jvm.internal.s.g(this.f132027c, fVar.f132027c) && p005kotlin.jvm.internal.s.g(this.f132028d, fVar.f132028d) && p005kotlin.jvm.internal.s.g(this.f132029e, fVar.f132029e) && p005kotlin.jvm.internal.s.g(this.f132030f, fVar.f132030f) && p005kotlin.jvm.internal.s.g(this.f132031g, fVar.f132031g) && p005kotlin.jvm.internal.s.g(this.f132032h, fVar.f132032h) && this.f132033i == fVar.f132033i;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f132025a.hashCode() * 31;
        j jVar = this.f132026b;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i53.c<g> cVar = this.f132027c;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        o4.d0 d0Var = this.f132028d;
        if (d0Var == null) {
            iHashCode = 0;
        } else {
            long j8 = d0Var.f128833a;
            o13.z.a aVar = o13.z.f128618b;
            iHashCode = Long.hashCode(j8);
        }
        int i14 = (iHashCode4 + iHashCode) * 31;
        b bVar = this.f132029e;
        int iHashCode5 = (i14 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f132030f;
        int iHashCode6 = (iHashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        q0 q0Var = this.f132031g;
        int iHashCode7 = (iHashCode6 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        k0 k0Var = this.f132032h;
        return Boolean.hashCode(this.f132033i) + ((iHashCode7 + (k0Var != null ? k0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChartData(charts=");
        sb3.append(this.f132025a);
        sb3.append(", dot=");
        sb3.append(this.f132026b);
        sb3.append(", gradient=");
        sb3.append(this.f132027c);
        sb3.append(", defaultLineColorRes=");
        sb3.append(this.f132028d);
        sb3.append(", xAxisRange=");
        sb3.append(this.f132029e);
        sb3.append(", yAxisRange=");
        sb3.append(this.f132030f);
        sb3.append(", yAxisLabelsRenderer=");
        sb3.append(this.f132031g);
        sb3.append(", xAxisLabelsRenderer=");
        sb3.append(this.f132032h);
        sb3.append(", invertYAxis=");
        return hb.a.k(sb3, this.f132033i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(i53.c<? extends i53.c<j>> cVar, j jVar, i53.c<g> cVar2, o4.d0 d0Var, b bVar, b bVar2, q0 q0Var, k0 k0Var, boolean z14) {
        cVar.getClass();
        this.f132025a = cVar;
        this.f132026b = jVar;
        this.f132027c = cVar2;
        this.f132028d = d0Var;
        this.f132029e = bVar;
        this.f132030f = bVar2;
        this.f132031g = q0Var;
        this.f132032h = k0Var;
        this.f132033i = z14;
    }

    public /* synthetic */ f(i53.c cVar, j jVar, i53.c cVar2, o4.d0 d0Var, b bVar, b bVar2, q0 q0Var, k0 k0Var, boolean z14, p005kotlin.jvm.internal.j jVar2) {
        this(cVar, jVar, cVar2, d0Var, bVar, bVar2, q0Var, k0Var, z14);
    }
}
