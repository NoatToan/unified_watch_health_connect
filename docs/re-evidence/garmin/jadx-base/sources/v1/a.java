package v1;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lv1/a;", "", "", "representation", "<init>", "(Ljava/lang/String;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3245a f174655b = new C3245a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f174656c = new a("text/*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f174657d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174658a;

    static {
        new a("text/plain");
        new a("text/html");
        new a("image/*");
        f174657d = new a("*/*");
    }

    public a(String str) {
        this.f174658a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return s.g(this.f174658a, ((a) obj).f174658a);
    }

    public final int hashCode() {
        return this.f174658a.hashCode();
    }

    public final String toString() {
        return j.o(this.f174658a, "')", new StringBuilder("MediaType(representation='"));
    }

    /* JADX INFO: renamed from: v1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv1/a$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C3245a {
        public /* synthetic */ C3245a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3245a() {
        }
    }
}
