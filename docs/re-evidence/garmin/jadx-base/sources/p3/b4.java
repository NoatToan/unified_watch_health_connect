package p3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lp3/b4;", "T", "", "composer", "Lp3/m;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f135047a;

    public static final void a(m mVar, Integer num, e23.p pVar) {
        if (mVar.getT()) {
            mVar.apply(pVar, num);
        }
    }

    public static final void b(e23.l lVar, m mVar) {
        mVar.apply(new b71.n(lVar, 13, (byte) 0), Unit.INSTANCE);
    }

    public static final void c(e23.p pVar, Object obj, m mVar) {
        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), obj)) {
            mVar.K(obj);
            mVar.apply(pVar, obj);
        }
    }

    public static final void d(e23.p pVar, Object obj, m mVar) {
        boolean t7 = mVar.getT();
        if (t7 || !p005kotlin.jvm.internal.s.g(mVar.q(), obj)) {
            mVar.K(obj);
            if (t7) {
                return;
            }
            mVar.apply(pVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b4) {
            return p005kotlin.jvm.internal.s.g(this.f135047a, ((b4) obj).f135047a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f135047a.hashCode();
    }

    public final String toString() {
        return "Updater(composer=" + this.f135047a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
