package sf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf.a f158756a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lsf/b$a;", "", "<init>", "()V", "Lsf/b;", "DEFAULT", "Lsf/b;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f158757a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f158757a;
        f158756a = new tf.a();
    }

    C2996b a(p pVar);

    c b(p pVar, p pVar2);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0012¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lsf/b$c;", "", "Lsf/p;", "response", "<init>", "(Lsf/p;)V", "()V", "a", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f158760a;

        static {
            new a(null);
            new c();
        }

        private c() {
            this.f158760a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return s.g(this.f158760a, ((c) obj).f158760a);
            }
            return false;
        }

        public final int hashCode() {
            p pVar = this.f158760a;
            if (pVar != null) {
                return pVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "WriteResult(response=" + this.f158760a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf/b$c$a;", "", "<init>", "()V", "Lsf/b$c;", "DISABLED", "Lsf/b$c;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }

        public c(p pVar) {
            this.f158760a = pVar;
        }
    }

    /* JADX INFO: renamed from: sf.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lsf/b$b;", "", "Lsf/n;", "request", "<init>", "(Lsf/n;)V", "Lsf/p;", "response", "(Lsf/p;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2996b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f158758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f158759b;

        public C2996b(n nVar) {
            this.f158758a = nVar;
            this.f158759b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2996b)) {
                return false;
            }
            C2996b c2996b = (C2996b) obj;
            return s.g(this.f158758a, c2996b.f158758a) && s.g(this.f158759b, c2996b.f158759b);
        }

        public final int hashCode() {
            n nVar = this.f158758a;
            int iHashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
            p pVar = this.f158759b;
            return iHashCode + (pVar != null ? pVar.hashCode() : 0);
        }

        public final String toString() {
            return "ReadResult(request=" + this.f158758a + ", response=" + this.f158759b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C2996b(p pVar) {
            this.f158758a = null;
            this.f158759b = pVar;
        }
    }
}
