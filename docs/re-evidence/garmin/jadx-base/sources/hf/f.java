package hf;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB!\b\u0002\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lhf/f;", "", "", "Lhf/f$c;", "data", "<init>", "(Ljava/util/Map;)V", "c", "a", "b", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f83558b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c<?>, Object> f83559a;

    static {
        new b(null);
        f83558b = new a().a();
    }

    private f(Map<c<?>, ? extends Object> map) {
        this.f83559a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f83559a, ((f) obj).f83559a);
    }

    public final int hashCode() {
        return this.f83559a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f83559a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhf/f$c;", "T", "", "default", "<init>", "(Ljava/lang/Object;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f83561b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f83562a;

        static {
            new a(null);
        }

        public c(T t7) {
            this.f83562a = t7;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhf/f$c$a;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhf/f$b;", "", "<init>", "()V", "Lhf/f;", "EMPTY", "Lhf/f;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ f(Map map, p005kotlin.jvm.internal.j jVar) {
        this(map);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lhf/f$a;", "", "<init>", "()V", "", "Lhf/f$c;", "map", "(Ljava/util/Map;)V", "Lhf/f;", "extras", "(Lhf/f;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f83560a;

        public a(f fVar) {
            this.f83560a = u0.n(fVar.f83559a);
        }

        public final f a() {
            return new f(dg.b.b(this.f83560a), null);
        }

        public final void b(c cVar, Object obj) {
            LinkedHashMap linkedHashMap = this.f83560a;
            if (obj != null) {
                linkedHashMap.put(cVar, obj);
            } else {
                linkedHashMap.remove(cVar);
            }
        }

        public a(Map<c<?>, ? extends Object> map) {
            this.f83560a = u0.n(map);
        }

        public a() {
            this.f83560a = new LinkedHashMap();
        }
    }
}
