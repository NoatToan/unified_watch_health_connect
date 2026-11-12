package g2;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lg2/s1;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lp3/p1;", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.p1<Unit> f75216a;

    public static p3.p1 a() {
        Unit unit = Unit.INSTANCE;
        p3.t1 t1Var = p3.t1.f135313a;
        t1Var.getClass();
        return new p3.c2(unit, t1Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            return p005kotlin.jvm.internal.s.g(this.f75216a, ((s1) obj).f75216a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f75216a.hashCode();
    }

    public final String toString() {
        return "ObservableScopeInvalidator(state=" + this.f75216a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
