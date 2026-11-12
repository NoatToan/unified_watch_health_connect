package u53;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"Lu53/h;", "E", "", "holder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f168738a;

    public static final Object a(Object obj, E e4) {
        if (obj == null) {
            return e4;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e4);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e4);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return p005kotlin.jvm.internal.s.g(this.f168738a, ((h) obj).f168738a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f168738a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "InlineList(holder=" + this.f168738a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
