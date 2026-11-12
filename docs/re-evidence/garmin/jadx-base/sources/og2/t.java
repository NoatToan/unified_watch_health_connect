package og2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o4.g1;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Log2/t;", "", "Lg6/f;", "strokeWidth", "Log2/d;", TtmlNode.ATTR_TTS_COLOR, "Li53/c;", "Log2/j;", "values", "", "indicatePoints", "dotRadius", "dotColor", "Log2/u;", "lineMode", "Lo4/g1;", "pathEffect", "Log2/b;", "xRange", "yRange", "<init>", "(FLog2/d;Li53/c;ZFLog2/d;Log2/u;Lo4/g1;Log2/b;Log2/b;Lkotlin/jvm/internal/j;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f132090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f132091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<j> f132092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f132093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f132094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f132095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f132096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f132097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f132098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f132099j;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(float f14, d dVar, i53.c cVar, boolean z14, float f15, d dVar2, u uVar, g1 g1Var, b bVar, b bVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        float f16;
        boolean z15 = (i14 & 8) != 0 ? false : z14;
        if ((i14 & 16) != 0) {
            g6.f.a aVar = g6.f.f75994b;
            f16 = 0;
        } else {
            f16 = f15;
        }
        this(f14, dVar, cVar, z15, f16, (i14 & 32) != 0 ? null : dVar2, (i14 & 64) != 0 ? u.LINEAR : uVar, (i14 & 128) != 0 ? null : g1Var, (i14 & 256) != 0 ? null : bVar, (i14 & 512) != 0 ? null : bVar2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return g6.f.c(this.f132090a, tVar.f132090a) && p005kotlin.jvm.internal.s.g(this.f132091b, tVar.f132091b) && p005kotlin.jvm.internal.s.g(this.f132092c, tVar.f132092c) && this.f132093d == tVar.f132093d && g6.f.c(this.f132094e, tVar.f132094e) && p005kotlin.jvm.internal.s.g(this.f132095f, tVar.f132095f) && this.f132096g == tVar.f132096g && p005kotlin.jvm.internal.s.g(this.f132097h, tVar.f132097h) && p005kotlin.jvm.internal.s.g(this.f132098i, tVar.f132098i) && p005kotlin.jvm.internal.s.g(this.f132099j, tVar.f132099j);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        int iD = q6.f.d(this.f132094e, q6.f.g(l2.a(this.f132092c, (this.f132091b.hashCode() + (Float.hashCode(this.f132090a) * 31)) * 31, 31), 31, this.f132093d), 31);
        d dVar = this.f132095f;
        int iHashCode = (this.f132096g.hashCode() + ((iD + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        g1 g1Var = this.f132097h;
        int iHashCode2 = (iHashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        b bVar = this.f132098i;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f132099j;
        return iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public final String toString() {
        return "LineDataSet(strokeWidth=" + g6.f.d(this.f132090a) + ", color=" + this.f132091b + ", values=" + this.f132092c + ", indicatePoints=" + this.f132093d + ", dotRadius=" + g6.f.d(this.f132094e) + ", dotColor=" + this.f132095f + ", lineMode=" + this.f132096g + ", pathEffect=" + this.f132097h + ", xRange=" + this.f132098i + ", yRange=" + this.f132099j + ")";
    }

    private t(float f14, d dVar, i53.c<j> cVar, boolean z14, float f15, d dVar2, u uVar, g1 g1Var, b bVar, b bVar2) {
        dVar.getClass();
        cVar.getClass();
        uVar.getClass();
        this.f132090a = f14;
        this.f132091b = dVar;
        this.f132092c = cVar;
        this.f132093d = z14;
        this.f132094e = f15;
        this.f132095f = dVar2;
        this.f132096g = uVar;
        this.f132097h = g1Var;
        this.f132098i = bVar;
        this.f132099j = bVar2;
    }

    public /* synthetic */ t(float f14, d dVar, i53.c cVar, boolean z14, float f15, d dVar2, u uVar, g1 g1Var, b bVar, b bVar2, p005kotlin.jvm.internal.j jVar) {
        this(f14, dVar, cVar, z14, f15, dVar2, uVar, g1Var, bVar, bVar2);
    }
}
