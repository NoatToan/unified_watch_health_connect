package c33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24229a;

    public h(Object obj) {
        this.f24229a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f24229a, ((h) obj).f24229a);
    }

    public final int hashCode() {
        Object obj = this.f24229a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return wr.g.p(new StringBuilder("KmConstantValue(value="), this.f24229a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
