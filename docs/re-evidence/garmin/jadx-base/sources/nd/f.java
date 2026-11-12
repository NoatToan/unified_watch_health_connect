package nd;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lnd/f;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f125388a;

    public static final void a(String str, Bundle bundle, List list) {
        str.getClass();
        list.getClass();
        bundle.putParcelableArrayList(str, gl1.d.Z(list));
    }

    public static final void b(String str, Bundle bundle, Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    public static final void c(String str, Bundle bundle, List list) {
        str.getClass();
        list.getClass();
        bundle.putStringArrayList(str, gl1.d.Z(list));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return s.g(this.f125388a, ((f) obj).f125388a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125388a.hashCode();
    }

    public final String toString() {
        return "SavedStateWriter(source=" + this.f125388a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
