package k2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk2/f;", "Lk2/b;", "", "", "percent", "<init>", "(F)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f102404a;

    public f(float f14) {
        this.f102404a = f14;
        if (f14 < 0.0f || f14 > 100.0f) {
            b2.e.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // k2.b
    public final float a(g6.c cVar, long j8) {
        return (this.f102404a / 100.0f) * n4.g.f(j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f102404a, ((f) obj).f102404a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f102404a);
    }

    public final String toString() {
        return e0.e(this.f102404a, "%)", new StringBuilder("CornerSize(size = "));
    }
}
