package u53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import u53.u;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"Lu53/v;", "Lu53/u;", "S", "", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v<S extends u<S>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f168772a;

    public static final S a(Object obj) {
        if (obj != b.f168719a) {
            obj.getClass();
            return (S) obj;
        }
        vb.h.z("Does not contain segment");
        return null;
    }

    public static final boolean b(Object obj) {
        return obj == b.f168719a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return p005kotlin.jvm.internal.s.g(this.f168772a, ((v) obj).f168772a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f168772a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SegmentOrClosed(value=" + this.f168772a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
