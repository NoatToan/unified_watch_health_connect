package v43;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f175697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f175698b;

    public a(T t7, T t14) {
        this.f175697a = t7;
        this.f175698b = t14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f175697a, aVar.f175697a) && s.g(this.f175698b, aVar.f175698b);
    }

    public final int hashCode() {
        T t7 = this.f175697a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        T t14 = this.f175698b;
        return iHashCode + (t14 != null ? t14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ApproximationBounds(lower=");
        sb3.append(this.f175697a);
        sb3.append(", upper=");
        return g.p(sb3, this.f175698b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
