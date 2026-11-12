package c2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc2/g2;", "Lh5/c0;", "Lh4/r$c;", "Lg6/f;", TtmlNode.START, "top", TtmlNode.END, "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22666e;

    /* JADX WARN: Illegal instructions before constructor call */
    public g2(float f14, float f15, float f16, float f17, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        float f18 = f14;
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        float f19 = f15;
        if ((i14 & 4) != 0) {
            f16 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
        }
        float f22 = f16;
        if ((i14 & 8) != 0) {
            f17 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        }
        this(f18, f19, f22, f17, z14, null);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        int iF0 = b1Var.f0(this.f22664c) + b1Var.f0(this.f22662a);
        int iF1 = b1Var.f0(this.f22665d) + b1Var.f0(this.f22663b);
        f5.v1 v1VarQ = y0Var.Q(g6.b.i(-iF0, -iF1, j8));
        return f5.b1.h0(b1Var, g6.b.g(v1VarQ.f69144a + iF0, j8), g6.b.f(v1VarQ.f69145b + iF1, j8), new bp.h(6, this, v1VarQ));
    }

    private g2(float f14, float f15, float f16, float f17, boolean z14) {
        this.f22662a = f14;
        this.f22663b = f15;
        this.f22664c = f16;
        this.f22665d = f17;
        this.f22666e = z14;
    }

    public /* synthetic */ g2(float f14, float f15, float f16, float f17, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, z14);
    }
}
