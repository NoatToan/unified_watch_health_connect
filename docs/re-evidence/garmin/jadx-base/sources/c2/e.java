package c2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc2/e;", "Lh5/c0;", "Lh4/r$c;", "Lf5/a;", "alignmentLine", "Lg6/f;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "<init>", "(Lf5/a;FFLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f5.a f22625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22627c;

    private e(f5.a aVar, float f14, float f15) {
        this.f22625a = aVar;
        this.f22626b = f14;
        this.f22627c = f15;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        long j14;
        long jC;
        final f5.a aVar = this.f22625a;
        final float f14 = this.f22626b;
        float f15 = this.f22627c;
        boolean z14 = aVar instanceof f5.p;
        if (z14) {
            j14 = j8;
            jC = g6.a.c(0, 0, 0, 0, 11, j14);
        } else {
            j14 = j8;
            jC = g6.a.c(0, 0, 0, 0, 14, j14);
        }
        final f5.v1 v1VarQ = y0Var.Q(jC);
        int iE = v1VarQ.E(aVar);
        if (iE == Integer.MIN_VALUE) {
            iE = 0;
        }
        int i14 = z14 ? v1VarQ.f69145b : v1VarQ.f69144a;
        int i15 = (z14 ? g6.a.i(j14) : g6.a.j(j14)) - i14;
        final int iE2 = j23.t.e((!Float.isNaN(f14) ? b1Var.f0(f14) : 0) - iE, 0, i15);
        final int iE3 = j23.t.e(((!Float.isNaN(f15) ? b1Var.f0(f15) : 0) - i14) + iE, 0, i15 - iE2);
        int iMax = v1VarQ.f69144a;
        if (!z14) {
            iMax = Math.max(iMax + iE2 + iE3, g6.a.l(j14));
        }
        final int i16 = iMax;
        int iMax2 = v1VarQ.f69145b;
        if (z14) {
            iMax2 = Math.max(iMax2 + iE2 + iE3, g6.a.k(j14));
        }
        final int i17 = iMax2;
        return f5.b1.h0(b1Var, i16, i17, new e23.l() { // from class: c2.b
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18;
                f5.v1.a aVar2 = (f5.v1.a) obj;
                boolean z15 = aVar instanceof f5.p;
                float f16 = f14;
                int i19 = iE2;
                int i24 = iE3;
                f5.v1 v1Var = v1VarQ;
                if (z15) {
                    i18 = 0;
                } else {
                    g6.f.f75994b.getClass();
                    i18 = !g6.f.c(f16, g6.f.f75996d) ? i19 : (i16 - i24) - v1Var.f69144a;
                }
                if (z15) {
                    g6.f.f75994b.getClass();
                    if (g6.f.c(f16, g6.f.f75996d)) {
                        i19 = (i17 - i24) - v1Var.f69145b;
                    }
                } else {
                    i19 = 0;
                }
                f5.v1.a.B(aVar2, v1Var, i18, i19);
                return Unit.INSTANCE;
            }
        });
    }

    public /* synthetic */ e(f5.a aVar, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(aVar, f14, f15);
    }
}
