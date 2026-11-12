package y2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f5.a1;
import f5.b1;
import f5.w;
import f5.x;
import f5.y0;
import h5.c0;
import h5.c1;
import h5.h0;
import java.util.List;
import o4.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.l2;
import s5.q0;
import s5.x0;
import s5.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ly2/j;", "Lh5/m;", "Lh5/c0;", "Lh5/s;", "Lh5/u;", "Ls5/c;", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "Lw5/q$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Ls5/q0;", "", "onTextLayout", "Ld6/p;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Ls5/c$d;", "Ls5/y;", "placeholders", "Ln4/d;", "onPlaceholderLayout", "Ly2/l;", "selectionController", "Lo4/j0;", "overrideColor", "Ll2/l2;", "autoSize", "Ly2/s$a;", "onShowTranslation", "<init>", "(Ls5/c;Ls5/x0;Lw5/q$b;Le23/l;IZIILjava/util/List;Le23/l;Ly2/l;Lo4/j0;Ll2/l2;Le23/l;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends h5.m implements c0, h5.s, h5.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f194113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<? super s.a, Unit> f194114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f194115e;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(s5.c cVar, x0 x0Var, w5.q.b bVar, e23.l lVar, int i14, boolean z14, int i15, int i16, List list, e23.l lVar2, l lVar3, j0 j0Var, l2 l2Var, e23.l lVar4, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        e23.l lVar5 = (i17 & 8) != 0 ? null : lVar;
        if ((i17 & 16) != 0) {
            d6.p.f57793b.getClass();
            i18 = d6.p.f57794c;
        } else {
            i18 = i14;
        }
        this(cVar, x0Var, bVar, lVar5, i18, (i17 & 32) != 0 ? true : z14, (i17 & 64) != 0 ? Integer.MAX_VALUE : i15, (i17 & 128) != 0 ? 1 : i16, (i17 & 256) != 0 ? null : list, (i17 & 512) != 0 ? null : lVar2, (i17 & 1024) != 0 ? null : lVar3, (i17 & 2048) != 0 ? null : j0Var, (i17 & 4096) != 0 ? null : l2Var, (i17 & 8192) != 0 ? null : lVar4, null);
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(x xVar, w wVar, int i14) {
        return this.f194115e.maxIntrinsicHeight(xVar, wVar, i14);
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(x xVar, w wVar, int i14) {
        return this.f194115e.maxIntrinsicWidth(xVar, wVar, i14);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        return this.f194115e.mo5measure3p2s80s(b1Var, y0Var, j8);
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(x xVar, w wVar, int i14) {
        return this.f194115e.minIntrinsicHeight(xVar, wVar, i14);
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(x xVar, w wVar, int i14) {
        return this.f194115e.minIntrinsicWidth(xVar, wVar, i14);
    }

    @Override // h5.u
    public final void o(c1 c1Var) {
        l lVar = this.f194113c;
        if (lVar != null) {
            lVar.f194121d = p.a(lVar.f194121d, c1Var, null, 2);
            lVar.f194119b.b(lVar.f194118a);
        }
    }

    @Override // h5.s
    public final void p(h0 h0Var) throws Throwable {
        this.f194115e.p(h0Var);
    }

    private j(s5.c cVar, x0 x0Var, w5.q.b bVar, e23.l<? super q0, Unit> lVar, int i14, boolean z14, int i15, int i16, List<s5.c.d<y>> list, e23.l<? super List<n4.d>, Unit> lVar2, l lVar3, j0 j0Var, l2 l2Var, e23.l<? super s.a, Unit> lVar4) {
        this.f194113c = lVar3;
        this.f194114d = lVar4;
        s sVar = new s(cVar, x0Var, bVar, lVar, i14, z14, i15, i16, list, lVar2, lVar3, j0Var, l2Var, lVar4, null);
        U1(sVar);
        this.f194115e = sVar;
        if (this.f194113c != null) {
            return;
        }
        b2.e.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        o2.c.f();
        throw null;
    }

    public /* synthetic */ j(s5.c cVar, x0 x0Var, w5.q.b bVar, e23.l lVar, int i14, boolean z14, int i15, int i16, List list, e23.l lVar2, l lVar3, j0 j0Var, l2 l2Var, e23.l lVar4, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, bVar, lVar, i14, z14, i15, i16, list, lVar2, lVar3, j0Var, l2Var, lVar4);
    }
}
