package x4;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lx4/a;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3509a f188647b = new C3509a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f188648c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f188649d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188650a;

    private /* synthetic */ a(int i14) {
        this.f188650a = i14;
    }

    public static final /* synthetic */ a a(int i14) {
        return new a(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f188650a == ((a) obj).f188650a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188650a);
    }

    public final String toString() {
        int i14 = f188648c;
        int i15 = this.f188650a;
        if (i15 == i14) {
            return "Touch";
        }
        return i15 == f188649d ? "Keyboard" : "Error";
    }

    /* JADX INFO: renamed from: x4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/a$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3509a {
        public /* synthetic */ C3509a(j jVar) {
            this();
        }

        private C3509a() {
        }
    }
}
