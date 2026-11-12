package s5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Ls5/p0;", "", "Ls5/c;", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "Ls5/c$d;", "Ls5/y;", "placeholders", "", "maxLines", "", "softWrap", "Ld6/p;", "overflow", "Lg6/c;", "density", "Lg6/o;", "layoutDirection", "Lw5/p$b;", "resourceLoader", "Lw5/q$b;", "fontFamilyResolver", "Lg6/a;", "constraints", "<init>", "(Ls5/c;Ls5/x0;Ljava/util/List;IZILg6/c;Lg6/o;Lw5/p$b;Lw5/q$b;J)V", "(Ls5/c;Ls5/x0;Ljava/util/List;IZILg6/c;Lg6/o;Lw5/p$b;JLkotlin/jvm/internal/j;)V", "(Ls5/c;Ls5/x0;Ljava/util/List;IZILg6/c;Lg6/o;Lw5/q$b;JLkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f157265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f157266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c.d<y>> f157267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f157268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f157269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f157270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g6.c f157271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g6.o f157272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5.q.b f157273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f157274j;

    private p0(c cVar, x0 x0Var, List<c.d<y>> list, int i14, boolean z14, int i15, g6.c cVar2, g6.o oVar, w5.p.b bVar, long j8) {
        this(cVar, x0Var, list, i14, z14, i15, cVar2, oVar, bVar, w5.n.a(bVar), j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f157265a, p0Var.f157265a) || !p005kotlin.jvm.internal.s.g(this.f157266b, p0Var.f157266b) || !p005kotlin.jvm.internal.s.g(this.f157267c, p0Var.f157267c) || this.f157268d != p0Var.f157268d || this.f157269e != p0Var.f157269e) {
            return false;
        }
        int i14 = p0Var.f157270f;
        d6.p.a aVar = d6.p.f57793b;
        return this.f157270f == i14 && p005kotlin.jvm.internal.s.g(this.f157271g, p0Var.f157271g) && this.f157272h == p0Var.f157272h && p005kotlin.jvm.internal.s.g(this.f157273i, p0Var.f157273i) && g6.a.d(this.f157274j, p0Var.f157274j);
    }

    public final int hashCode() {
        int iG = q6.f.g((lc.u0.b(v.e0.b(this.f157265a.hashCode() * 31, 31, this.f157266b), 31, this.f157267c) + this.f157268d) * 31, 31, this.f157269e);
        d6.p.a aVar = d6.p.f57793b;
        int iHashCode = (this.f157273i.hashCode() + ((this.f157272h.hashCode() + ((this.f157271g.hashCode() + q2.d(this.f157270f, iG, 31)) * 31)) * 31)) * 31;
        g6.a.C1525a c1525a = g6.a.f75987b;
        return Long.hashCode(this.f157274j) + iHashCode;
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f157265a) + ", style=" + this.f157266b + ", placeholders=" + this.f157267c + ", maxLines=" + this.f157268d + ", softWrap=" + this.f157269e + ", overflow=" + ((Object) d6.p.a(this.f157270f)) + ", density=" + this.f157271g + ", layoutDirection=" + this.f157272h + ", fontFamilyResolver=" + this.f157273i + ", constraints=" + ((Object) g6.a.n(this.f157274j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ p0(c cVar, x0 x0Var, List list, int i14, boolean z14, int i15, g6.c cVar2, g6.o oVar, w5.q.b bVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, (List<c.d<y>>) list, i14, z14, i15, cVar2, oVar, bVar, j8);
    }

    private p0(c cVar, x0 x0Var, List<c.d<y>> list, int i14, boolean z14, int i15, g6.c cVar2, g6.o oVar, w5.p.b bVar, w5.q.b bVar2, long j8) {
        this.f157265a = cVar;
        this.f157266b = x0Var;
        this.f157267c = list;
        this.f157268d = i14;
        this.f157269e = z14;
        this.f157270f = i15;
        this.f157271g = cVar2;
        this.f157272h = oVar;
        this.f157273i = bVar2;
        this.f157274j = j8;
    }

    @o13.e
    public /* synthetic */ p0(c cVar, x0 x0Var, List list, int i14, boolean z14, int i15, g6.c cVar2, g6.o oVar, w5.p.b bVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, (List<c.d<y>>) list, i14, z14, i15, cVar2, oVar, bVar, j8);
    }

    private p0(c cVar, x0 x0Var, List<c.d<y>> list, int i14, boolean z14, int i15, g6.c cVar2, g6.o oVar, w5.q.b bVar, long j8) {
        this(cVar, x0Var, list, i14, z14, i15, cVar2, oVar, (w5.p.b) null, bVar, j8);
    }
}
