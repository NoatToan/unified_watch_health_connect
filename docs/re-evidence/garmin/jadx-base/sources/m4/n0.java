package m4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lm4/n0;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f116502b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116503c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116504d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116505a;

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            return this.f116505a == ((n0) obj).f116505a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116505a);
    }

    public final String toString() {
        int i14 = f116503c;
        int i15 = this.f116505a;
        if (i15 == i14) {
            return "Always";
        }
        if (i15 == 0) {
            return "SystemDefined";
        }
        if (i15 == f116504d) {
            return "Never";
        }
        vb.h.z("Unknown Focusability");
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm4/n0$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
