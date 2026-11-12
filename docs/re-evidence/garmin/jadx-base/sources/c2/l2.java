package c2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/l2;", "Lc2/h2;", "Lg6/f;", TtmlNode.START, "top", TtmlNode.END, "bottom", "<init>", "(FFFFLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22739d;

    private l2(float f14, float f15, float f16, float f17) {
        this.f22736a = f14;
        this.f22737b = f15;
        this.f22738c = f16;
        this.f22739d = f17;
        if (!((f14 >= 0.0f) & (f15 >= 0.0f) & (f16 >= 0.0f)) || !(f17 >= 0.0f)) {
            d2.a.a("Padding must be non-negative");
        }
    }

    @Override // c2.h2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF22739d() {
        return this.f22739d;
    }

    @Override // c2.h2
    public final float b(g6.o oVar) {
        return oVar == g6.o.Ltr ? this.f22736a : this.f22738c;
    }

    @Override // c2.h2
    public final float c(g6.o oVar) {
        return oVar == g6.o.Ltr ? this.f22738c : this.f22736a;
    }

    @Override // c2.h2
    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getF22737b() {
        return this.f22737b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return g6.f.c(this.f22736a, l2Var.f22736a) && g6.f.c(this.f22737b, l2Var.f22737b) && g6.f.c(this.f22738c, l2Var.f22738c) && g6.f.c(this.f22739d, l2Var.f22739d);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f22739d) + q6.f.d(this.f22738c, q6.f.d(this.f22737b, Float.hashCode(this.f22736a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaddingValues(start=");
        tn.k.l(this.f22736a, ", top=", sb3);
        tn.k.l(this.f22737b, ", end=", sb3);
        tn.k.l(this.f22738c, ", bottom=", sb3);
        sb3.append((Object) g6.f.d(this.f22739d));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ l2(float f14, float f15, float f16, float f17, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l2(float f14, float f15, float f16, float f17, int i14, p005kotlin.jvm.internal.j jVar) {
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
        this(f18, f19, f22, f17, null);
    }
}
