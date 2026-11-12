package f5;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/f1;", "Lf5/z0;", "Lf5/e1;", "measurePolicy", "<init>", "(Lf5/e1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f68941a;

    public f1(e1 e1Var) {
        this.f68941a = e1Var;
    }

    @Override // f5.z0
    public final int c(x xVar, List<? extends w> list, int i14) {
        return this.f68941a.c(xVar, h5.v0.a(xVar), i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && p005kotlin.jvm.internal.s.g(this.f68941a, ((f1) obj).f68941a);
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        return this.f68941a.f(b1Var, h5.v0.a(b1Var), j8);
    }

    @Override // f5.z0
    public final int g(x xVar, List<? extends w> list, int i14) {
        return this.f68941a.g(xVar, h5.v0.a(xVar), i14);
    }

    @Override // f5.z0
    public final int h(x xVar, List<? extends w> list, int i14) {
        return this.f68941a.h(xVar, h5.v0.a(xVar), i14);
    }

    public final int hashCode() {
        return this.f68941a.hashCode();
    }

    @Override // f5.z0
    public final int i(x xVar, List<? extends w> list, int i14) {
        return this.f68941a.i(xVar, h5.v0.a(xVar), i14);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f68941a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
