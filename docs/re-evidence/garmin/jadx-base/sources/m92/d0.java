package m92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o4.g1;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm92/d0;", "", "Lg6/f;", "strokeWidth", "Lm92/m;", TtmlNode.ATTR_TTS_COLOR, "Li53/c;", "Lm92/h0$e$a;", "values", "", "indicatePoints", "dotRadius", "Lo4/d0;", "dotColor", "Lm92/e0;", "lineMode", "gaps", "Lo4/g1;", "pathEffect", "<init>", "(FLm92/m;Li53/c;ZFLo4/d0;Lm92/e0;ZLo4/g1;Lkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f117279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f117280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<h0.e.a> f117281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f117282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f117283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.d0 f117284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f117285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f117286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1 f117287i;

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(float f14, m mVar, i53.c cVar, boolean z14, float f15, o4.d0 d0Var, e0 e0Var, boolean z15, g1 g1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        float f16;
        boolean z16 = (i14 & 8) != 0 ? false : z14;
        if ((i14 & 16) != 0) {
            g6.f.a aVar = g6.f.f75994b;
            f16 = 0;
        } else {
            f16 = f15;
        }
        this(f14, mVar, cVar, z16, f16, (i14 & 32) != 0 ? null : d0Var, (i14 & 64) != 0 ? e0.LINEAR : e0Var, (i14 & 128) != 0 ? false : z15, (i14 & 256) != 0 ? null : g1Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return g6.f.c(this.f117279a, d0Var.f117279a) && p005kotlin.jvm.internal.s.g(this.f117280b, d0Var.f117280b) && p005kotlin.jvm.internal.s.g(this.f117281c, d0Var.f117281c) && this.f117282d == d0Var.f117282d && g6.f.c(this.f117283e, d0Var.f117283e) && p005kotlin.jvm.internal.s.g(this.f117284f, d0Var.f117284f) && this.f117285g == d0Var.f117285g && this.f117286h == d0Var.f117286h && p005kotlin.jvm.internal.s.g(this.f117287i, d0Var.f117287i);
    }

    public final int hashCode() {
        int iHashCode;
        g6.f.a aVar = g6.f.f75994b;
        int iD = q6.f.d(this.f117283e, q6.f.g(l2.a(this.f117281c, (this.f117280b.hashCode() + (Float.hashCode(this.f117279a) * 31)) * 31, 31), 31, this.f117282d), 31);
        o4.d0 d0Var = this.f117284f;
        if (d0Var == null) {
            iHashCode = 0;
        } else {
            long j8 = d0Var.f128833a;
            o13.z.a aVar2 = o13.z.f128618b;
            iHashCode = Long.hashCode(j8);
        }
        int iG = q6.f.g((this.f117285g.hashCode() + ((iD + iHashCode) * 31)) * 31, 31, this.f117286h);
        g1 g1Var = this.f117287i;
        return iG + (g1Var != null ? g1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LineDataSet(strokeWidth=" + g6.f.d(this.f117279a) + ", color=" + this.f117280b + ", values=" + this.f117281c + ", indicatePoints=" + this.f117282d + ", dotRadius=" + g6.f.d(this.f117283e) + ", dotColor=" + this.f117284f + ", lineMode=" + this.f117285g + ", gaps=" + this.f117286h + ", pathEffect=" + this.f117287i + ")";
    }

    private d0(float f14, m mVar, i53.c<h0.e.a> cVar, boolean z14, float f15, o4.d0 d0Var, e0 e0Var, boolean z15, g1 g1Var) {
        mVar.getClass();
        cVar.getClass();
        e0Var.getClass();
        this.f117279a = f14;
        this.f117280b = mVar;
        this.f117281c = cVar;
        this.f117282d = z14;
        this.f117283e = f15;
        this.f117284f = d0Var;
        this.f117285g = e0Var;
        this.f117286h = z15;
        this.f117287i = g1Var;
    }

    public /* synthetic */ d0(float f14, m mVar, i53.c cVar, boolean z14, float f15, o4.d0 d0Var, e0 e0Var, boolean z15, g1 g1Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, mVar, cVar, z14, f15, d0Var, e0Var, z15, g1Var);
    }
}
