package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Ls5/k0;", "Ls5/c$a;", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157233a;

    private /* synthetic */ k0(String str) {
        this.f157233a = str;
    }

    public static final /* synthetic */ k0 a(String str) {
        return new k0(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return p005kotlin.jvm.internal.s.g(this.f157233a, ((k0) obj).f157233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f157233a.hashCode();
    }

    public final String toString() {
        return o2.c.c(CoreConstants.RIGHT_PARENTHESIS_CHAR, "StringAnnotation(value=", this.f157233a);
    }
}
