package x1;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lx1/k;", "", "Lx1/k$a;", "initialStatus", "<init>", "(Lx1/k$a;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f188365a;

    public k(a aVar) {
        this.f188365a = p0.n(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return s.g((a) ((k) obj).f188365a.getF182175a(), (a) this.f188365a.getF182175a());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return ((a) this.f188365a.getF182175a()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((a) this.f188365a.getF182175a()) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lx1/k$a;", "", "<init>", "()V", "b", "a", "Lx1/k$a$a;", "Lx1/k$a$b;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: x1.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx1/k$a$a;", "Lx1/k$a;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3505a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3505a f188366a = new C3505a();

            private C3505a() {
                super(null);
            }

            public final String toString() {
                return "Closed";
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx1/k$a$b;", "Lx1/k$a;", "Ln4/c;", MapboxMap.QFE_OFFSET, "<init>", "(JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f188367a;

            private b(long j8) {
                super(null);
                this.f188367a = j8;
                if ((j8 & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                b2.e.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return n4.c.d(this.f188367a, ((b) obj).f188367a);
            }

            public final int hashCode() {
                n4.c.a aVar = n4.c.f123541b;
                return Long.hashCode(this.f188367a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) n4.c.l(this.f188367a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public /* synthetic */ b(long j8, p005kotlin.jvm.internal.j jVar) {
                this(j8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ k(a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? a.C3505a.f188366a : aVar);
    }
}
