package u1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu1/m;", "Lh5/x0;", "Lu1/o;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lo4/w;", "brush", "", "alpha", "Lo4/r1;", "shape", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(JLo4/w;FLo4/r1;Le23/l;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m extends h5.x0<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f167610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.w f167611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f167612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.r1 f167613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<m2, Unit> f167614e;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(long j8, o4.w wVar, float f14, o4.r1 r1Var, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j8 = o4.d0.f128832k;
        }
        this(j8, (i14 & 2) != 0 ? null : wVar, f14, r1Var, lVar, null);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o(this.f167610a, this.f167611b, this.f167612c, this.f167613d, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && o4.d0.d(this.f167610a, mVar.f167610a) && p005kotlin.jvm.internal.s.g(this.f167611b, mVar.f167611b) && this.f167612c == mVar.f167612c && p005kotlin.jvm.internal.s.g(this.f167613d, mVar.f167613d);
    }

    @Override // h5.x0
    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        int iHashCode = Long.hashCode(this.f167610a) * 31;
        o4.w wVar = this.f167611b;
        return this.f167613d.hashCode() + q6.f.d(this.f167612c, (iHashCode + (wVar != null ? wVar.hashCode() : 0)) * 31, 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        this.f167614e.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        o oVar = (o) cVar;
        oVar.f167637a = this.f167610a;
        oVar.f167638b = this.f167611b;
        oVar.f167639c = this.f167612c;
        o4.r1 r1Var = oVar.f167640d;
        o4.r1 r1Var2 = this.f167613d;
        if (!p005kotlin.jvm.internal.s.g(r1Var, r1Var2)) {
            oVar.f167640d = r1Var2;
            h5.k.g(oVar).U();
        }
        h5.t.a(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(long j8, o4.w wVar, float f14, o4.r1 r1Var, e23.l<? super m2, Unit> lVar) {
        this.f167610a = j8;
        this.f167611b = wVar;
        this.f167612c = f14;
        this.f167613d = r1Var;
        this.f167614e = lVar;
    }

    public /* synthetic */ m(long j8, o4.w wVar, float f14, o4.r1 r1Var, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, wVar, f14, r1Var, lVar);
    }
}
