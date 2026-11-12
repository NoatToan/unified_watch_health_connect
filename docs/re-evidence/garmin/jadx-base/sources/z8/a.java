package z8;

import am.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz8/a;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "<init>", "(Ljava/lang/String;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202962a;

    public a(String str) {
        str.getClass();
        this.f202962a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f202962a.equals(((a) obj).f202962a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f202962a.hashCode();
    }

    public final String toString() {
        return j.o(this.f202962a, "')", new StringBuilder("DataOrigin(packageName='"));
    }
}
