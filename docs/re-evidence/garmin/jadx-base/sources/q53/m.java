package q53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lq53/m;", "T", "", "c", "a", "b", "holder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f142998b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f142999c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f143000a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq53/m$a;", "Lq53/m$c;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f143001a;

        public a(Throwable th3) {
            this.f143001a = th3;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return p005kotlin.jvm.internal.s.g(this.f143001a, ((a) obj).f143001a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th3 = this.f143001a;
            if (th3 != null) {
                return th3.hashCode();
            }
            return 0;
        }

        @Override // q53.m.c
        public final String toString() {
            return "Closed(" + this.f143001a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq53/m$c;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ m(Object obj) {
        this.f143000a = obj;
    }

    public static final /* synthetic */ m a(Object obj) {
        return new m(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return p005kotlin.jvm.internal.s.g(this.f143000a, ((m) obj).f143000a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f143000a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f143000a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq53/m$b;", "", "<init>", "()V", "Lq53/m$c;", "failed", "Lq53/m$c;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(Throwable th3) {
            a aVar = new a(th3);
            b bVar = m.f142998b;
            return aVar;
        }

        private b() {
        }
    }
}
