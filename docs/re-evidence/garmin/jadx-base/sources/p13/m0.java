package p13;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp13/m0;", "T", "", "", FirebaseAnalytics.Param.INDEX, "value", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f134951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f134952b;

    public m0(int i14, T t7) {
        this.f134951a = i14;
        this.f134952b = t7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f134951a == m0Var.f134951a && p005kotlin.jvm.internal.s.g(this.f134952b, m0Var.f134952b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f134951a) * 31;
        T t7 = this.f134952b;
        return iHashCode + (t7 == null ? 0 : t7.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IndexedValue(index=");
        sb3.append(this.f134951a);
        sb3.append(", value=");
        return wr.g.p(sb3, this.f134952b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
