package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/m0;", "Lc2/k3;", "Lg6/f;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22747e;

    private m0(float f14, float f15, float f16, float f17) {
        this.f22744b = f14;
        this.f22745c = f15;
        this.f22746d = f16;
        this.f22747e = f17;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return cVar.f0(this.f22745c);
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return cVar.f0(this.f22744b);
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return cVar.f0(this.f22747e);
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return cVar.f0(this.f22746d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return g6.f.c(this.f22744b, m0Var.f22744b) && g6.f.c(this.f22745c, m0Var.f22745c) && g6.f.c(this.f22746d, m0Var.f22746d) && g6.f.c(this.f22747e, m0Var.f22747e);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f22747e) + q6.f.d(this.f22746d, q6.f.d(this.f22745c, Float.hashCode(this.f22744b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Insets(left=");
        tn.k.l(this.f22744b, ", top=", sb3);
        tn.k.l(this.f22745c, ", right=", sb3);
        tn.k.l(this.f22746d, ", bottom=", sb3);
        sb3.append((Object) g6.f.d(this.f22747e));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ m0(float f14, float f15, float f16, float f17, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17);
    }
}
