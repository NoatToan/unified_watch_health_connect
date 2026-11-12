package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr1/e2;", "", "", "scale", "Lo4/z1;", "transformOrigin", "Ls1/f0;", "animationSpec", "<init>", "(FJLs1/f0;Lkotlin/jvm/internal/j;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f149077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.f0<Float> f149079c;

    private e2(float f14, long j8, s1.f0<Float> f0Var) {
        this.f149077a = f14;
        this.f149078b = j8;
        this.f149079c = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return Float.compare(this.f149077a, e2Var.f149077a) == 0 && o4.z1.b(this.f149078b, e2Var.f149078b) && p005kotlin.jvm.internal.s.g(this.f149079c, e2Var.f149079c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f149077a) * 31;
        o4.z1.a aVar = o4.z1.f129046b;
        return this.f149079c.hashCode() + q6.f.e(iHashCode, 31, this.f149078b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f149077a + ", transformOrigin=" + ((Object) o4.z1.c(this.f149078b)) + ", animationSpec=" + this.f149079c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ e2(float f14, long j8, s1.f0 f0Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, j8, f0Var);
    }
}
