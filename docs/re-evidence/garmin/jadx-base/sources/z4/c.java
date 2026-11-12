package z4;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lz4/c;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f202307b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202308c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202309d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202310a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f202310a == ((c) obj).f202310a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202310a);
    }

    public final String toString() {
        int i14 = f202308c;
        int i15 = this.f202310a;
        if (i15 == i14) {
            return "KeyUp";
        }
        if (i15 == f202309d) {
            return "KeyDown";
        }
        return i15 == 0 ? "Unknown" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz4/c$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
