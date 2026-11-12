package rf;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;

/* JADX INFO: loaded from: classes7.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf/b$a;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public rf.a f152364a;
    }

    c a(C2864b c2864b);

    void b(long j8);

    void c(long j8);

    void clear();

    long e();

    void f(C2864b c2864b, c cVar);

    long getMaxSize();

    long getSize();

    /* JADX INFO: renamed from: rf.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrf/b$b;", "", "", Action.KEY_ATTRIBUTE, "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2864b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f152365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f152366b;

        /* JADX WARN: Illegal instructions before constructor call */
        public C2864b(String str, Map map, int i14, j jVar) {
            if ((i14 & 2) != 0) {
                map = k0.f134949a;
                map.getClass();
            }
            this(str, map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2864b)) {
                return false;
            }
            C2864b c2864b = (C2864b) obj;
            return s.g(this.f152365a, c2864b.f152365a) && s.g(this.f152366b, c2864b.f152366b);
        }

        public final int hashCode() {
            return this.f152366b.hashCode() + (this.f152365a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.f152365a + ", extras=" + this.f152366b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C2864b(String str) {
            this(str, null, 2, null);
        }

        public C2864b(String str, Map<String, String> map) {
            this.f152365a = str;
            this.f152366b = dg.b.b(map);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrf/b$c;", "", "Lhf/h;", "image", "", "", "extras", "<init>", "(Lhf/h;Ljava/util/Map;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hf.h f152367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f152368b;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(hf.h hVar, Map map, int i14, j jVar) {
            if ((i14 & 2) != 0) {
                map = k0.f134949a;
                map.getClass();
            }
            this(hVar, map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f152367a, cVar.f152367a) && s.g(this.f152368b, cVar.f152368b);
        }

        public final int hashCode() {
            return this.f152368b.hashCode() + (this.f152367a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(image=" + this.f152367a + ", extras=" + this.f152368b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public c(hf.h hVar) {
            this(hVar, null, 2, null);
        }

        public c(hf.h hVar, Map<String, ? extends Object> map) {
            this.f152367a = hVar;
            this.f152368b = dg.b.b(map);
        }
    }
}
