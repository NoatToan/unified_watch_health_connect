package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Li3/pi;", "", "a", "value", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f89345b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89346c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89347a;

    public final boolean equals(Object obj) {
        if (obj instanceof pi) {
            return this.f89347a == ((pi) obj).f89347a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89347a);
    }

    public final String toString() {
        int i14 = this.f89347a;
        if (i14 == 0) {
            return "Horizontal";
        }
        return i14 == f89346c ? "Vertical" : "Unknown";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/pi$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
