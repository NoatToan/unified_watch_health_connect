package z0;

import android.net.Uri;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f200625a;

    public g(Uri uri) {
        if (uri != null) {
            this.f200625a = uri;
        } else {
            j20.x.l("Null outputUri");
            throw null;
        }
    }

    @Override // z0.t
    public final Uri a() {
        return this.f200625a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f200625a.equals(((t) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f200625a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.f200625a + StringSubstitutor.DEFAULT_VAR_END;
    }
}
