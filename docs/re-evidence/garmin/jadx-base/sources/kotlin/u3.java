package kotlin;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li5/u3;", "", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91590b;

    public u3(String str, Object obj) {
        this.f91589a = str;
        this.f91590b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return s.g(this.f91589a, u3Var.f91589a) && s.g(this.f91590b, u3Var.f91590b);
    }

    public final int hashCode() {
        int iHashCode = this.f91589a.hashCode() * 31;
        Object obj = this.f91590b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ValueElement(name=");
        sb3.append(this.f91589a);
        sb3.append(", value=");
        return g.p(sb3, this.f91590b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
