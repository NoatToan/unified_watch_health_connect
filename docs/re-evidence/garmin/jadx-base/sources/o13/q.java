package o13;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lo13/q;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "a", "b", "value", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f128596b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f128597a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo13/q$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f128598a;

        public b(Throwable th3) {
            th3.getClass();
            this.f128598a = th3;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f128598a.equals(((b) obj).f128598a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f128598a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f128598a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        new a(null);
    }

    private /* synthetic */ q(Object obj) {
        this.f128597a = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f128598a;
        }
        return null;
    }

    public static String c(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return p005kotlin.jvm.internal.s.g(this.f128597a, ((q) obj).f128597a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f128597a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return c(this.f128597a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo13/q$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
