package c2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc2/e2;", "Lh5/x0;", "Lc2/g2;", "Lg6/f;", TtmlNode.START, "top", TtmlNode.END, "bottom", "", "rtlAware", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(FFFFZLe23/l;Lkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e2 extends h5.x0<g2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22639f;

    /* JADX WARN: Multi-variable type inference failed */
    private e2(float f14, float f15, float f16, float f17, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22634a = f14;
        this.f22635b = f15;
        this.f22636c = f16;
        this.f22637d = f17;
        this.f22638e = z14;
        this.f22639f = lVar;
        boolean z15 = true;
        boolean z16 = (f14 >= 0.0f || Float.isNaN(f14)) & (f15 >= 0.0f || Float.isNaN(f15)) & (f16 >= 0.0f || Float.isNaN(f16));
        if (f17 < 0.0f && !Float.isNaN(f17)) {
            z15 = false;
        }
        if (!z16 || !z15) {
            d2.a.a("Padding must be non-negative");
        }
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new g2(this.f22634a, this.f22635b, this.f22636c, this.f22637d, this.f22638e, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        e2 e2Var = obj instanceof e2 ? (e2) obj : null;
        return e2Var != null && g6.f.c(this.f22634a, e2Var.f22634a) && g6.f.c(this.f22635b, e2Var.f22635b) && g6.f.c(this.f22636c, e2Var.f22636c) && g6.f.c(this.f22637d, e2Var.f22637d) && this.f22638e == e2Var.f22638e;
    }

    @Override // h5.x0
    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Boolean.hashCode(this.f22638e) + q6.f.d(this.f22637d, q6.f.d(this.f22636c, q6.f.d(this.f22635b, Float.hashCode(this.f22634a) * 31, 31), 31), 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22639f.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        g2 g2Var = (g2) cVar;
        g2Var.f22662a = this.f22634a;
        g2Var.f22663b = this.f22635b;
        g2Var.f22664c = this.f22636c;
        g2Var.f22665d = this.f22637d;
        g2Var.f22666e = this.f22638e;
    }

    public /* synthetic */ e2(float f14, float f15, float f16, float f17, boolean z14, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, z14, lVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e2(float f14, float f15, float f16, float f17, boolean z14, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
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
        this(f18, f19, f22, f17, z14, lVar, null);
    }
}
