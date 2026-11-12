package e2;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le2/l0;", "Lh5/x0;", "Le2/m0;", "", "fraction", "Lp3/x3;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLp3/x3;Lp3/x3;Ljava/lang/String;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l0 extends x0<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f62483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3<Integer> f62484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3<Integer> f62485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f62486d;

    public /* synthetic */ l0(float f14, x3 x3Var, x3 x3Var2, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, (i14 & 2) != 0 ? null : x3Var, (i14 & 4) != 0 ? null : x3Var2, str);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new m0(this.f62483a, this.f62484b, this.f62485c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f62483a == l0Var.f62483a && p005kotlin.jvm.internal.s.g(this.f62484b, l0Var.f62484b) && p005kotlin.jvm.internal.s.g(this.f62485c, l0Var.f62485c);
    }

    @Override // h5.x0
    public final int hashCode() {
        x3<Integer> x3Var = this.f62484b;
        int iHashCode = (x3Var != null ? x3Var.hashCode() : 0) * 31;
        x3<Integer> x3Var2 = this.f62485c;
        return Float.hashCode(this.f62483a) + ((iHashCode + (x3Var2 != null ? x3Var2.hashCode() : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = this.f62486d;
        m2Var.f91342b = Float.valueOf(this.f62483a);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        m0 m0Var = (m0) cVar;
        m0Var.f62489a = this.f62483a;
        m0Var.f62490b = this.f62484b;
        m0Var.f62491c = this.f62485c;
    }

    public l0(float f14, x3<Integer> x3Var, x3<Integer> x3Var2, String str) {
        this.f62483a = f14;
        this.f62484b = x3Var;
        this.f62485c = x3Var2;
        this.f62486d = str;
    }
}
