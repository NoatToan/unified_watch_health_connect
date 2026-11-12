package o4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo4/t1;", "Lo4/w;", "", "Lo4/d0;", "value", "<init>", "(JLkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t1 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f129007b;

    private t1(long j8) {
        super(null);
        this.f129007b = j8;
    }

    @Override // o4.w
    public final void a(float f14, long j8, d1 d1Var) {
        d1Var.c(1.0f);
        long jC = this.f129007b;
        if (f14 != 1.0f) {
            jC = d0.c(d0.e(jC) * f14, jC, 14);
        }
        d1Var.e(jC);
        if (d1Var.getF128859c() != null) {
            d1Var.g(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t1) {
            return d0.d(this.f129007b, ((t1) obj).f129007b);
        }
        return false;
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f129007b);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) d0.j(this.f129007b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ t1(long j8, p005kotlin.jvm.internal.j jVar) {
        this(j8);
    }
}
