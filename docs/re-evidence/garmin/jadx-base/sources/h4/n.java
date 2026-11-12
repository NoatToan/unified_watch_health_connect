package h4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lh4/n;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f81572b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f81573c = -4.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f81574a;

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Float.compare(this.f81574a, ((n) obj).f81574a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81574a);
    }

    public final String toString() {
        float f14 = this.f81574a;
        if (f14 == -3.0f) {
            return "Normal";
        }
        return f14 == -4.0f ? "High" : "Default";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh4/n$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
