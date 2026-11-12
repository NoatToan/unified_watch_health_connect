package y4;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ly4/c;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f194377b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f194378c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f194379d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f194380e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194381a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f194381a == ((c) obj).f194381a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f194381a);
    }

    public final String toString() {
        int i14 = f194378c;
        int i15 = this.f194381a;
        if (i15 == i14) {
            return "Press";
        }
        if (i15 == f194379d) {
            return "Release";
        }
        return i15 == f194380e ? "Move" : "Unknown";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly4/c$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
