package wf;

import ch.qos.logback.core.CoreConstants;
import o53.l1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lwf/b;", "Lwf/n;", "job", "Lo53/l1;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f184893a;

    private /* synthetic */ b(l1 l1Var) {
        this.f184893a = l1Var;
    }

    public static final /* synthetic */ b c(l1 l1Var) {
        return new b(l1Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return p005kotlin.jvm.internal.s.g(this.f184893a, ((b) obj).f184893a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f184893a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f184893a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
