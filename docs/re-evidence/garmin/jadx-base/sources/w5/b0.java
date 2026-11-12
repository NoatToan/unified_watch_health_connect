package w5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lw5/b0;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f182070b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f182071c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f182072a;

    @o13.e
    private /* synthetic */ b0(int i14) {
        this.f182072a = i14;
    }

    public static final /* synthetic */ b0 a(int i14) {
        return new b0(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this.f182072a == ((b0) obj).f182072a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f182072a);
    }

    public final String toString() {
        int i14 = this.f182072a;
        if (i14 == 0) {
            return "Normal";
        }
        return i14 == f182071c ? "Italic" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/b0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
