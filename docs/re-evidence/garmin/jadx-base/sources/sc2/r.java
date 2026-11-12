package sc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"Lsc2/r;", "", "value", "", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158564a;

    private /* synthetic */ r(String str) {
        this.f158564a = str;
    }

    public static final /* synthetic */ r a(String str) {
        return new r(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return s.g(this.f158564a, ((r) obj).f158564a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f158564a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return am.j.m("ServerResponseBody(value=", this.f158564a, ")");
    }
}
