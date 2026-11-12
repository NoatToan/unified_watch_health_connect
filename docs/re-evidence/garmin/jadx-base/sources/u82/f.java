package u82;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0006\u0007\bB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lu82/f;", "T", "", "data", "<init>", "(Ljava/lang/Object;)V", "b", "c", "a", "Lu82/f$a;", "Lu82/f$b;", "Lu82/f$c;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f169493a;

    private f(T t7) {
        this.f169493a = t7;
    }

    public T a() {
        return this.f169493a;
    }

    public /* synthetic */ f(Object obj, j jVar) {
        this(obj);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu82/f$b;", "T", "Lu82/f;", "data", "<init>", "(Ljava/lang/Object;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> extends f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f169496b;

        public /* synthetic */ b(Object obj, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : obj);
        }

        @Override // u82.f
        public final T a() {
            return this.f169496b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f169496b, ((b) obj).f169496b);
        }

        public final int hashCode() {
            T t7 = this.f169496b;
            if (t7 == null) {
                return 0;
            }
            return t7.hashCode();
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("Loading(data=", ")", this.f169496b);
        }

        public b(T t7) {
            super(t7, null);
            this.f169496b = t7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            j jVar = null;
            this(jVar, 1, jVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu82/f$c;", "T", "Lu82/f;", "data", "<init>", "(Ljava/lang/Object;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c<T> extends f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f169497b;

        public /* synthetic */ c(Object obj, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : obj);
        }

        @Override // u82.f
        public final T a() {
            return this.f169497b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f169497b, ((c) obj).f169497b);
        }

        public final int hashCode() {
            T t7 = this.f169497b;
            if (t7 == null) {
                return 0;
            }
            return t7.hashCode();
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("Success(data=", ")", this.f169497b);
        }

        public c(T t7) {
            super(t7, null);
            this.f169497b = t7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            j jVar = null;
            this(jVar, 1, jVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu82/f$a;", "T", "Lu82/f;", "data", "Ly82/a;", "failure", "<init>", "(Ljava/lang/Object;Ly82/a;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a<T> extends f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f169494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y82.a f169495c;

        public /* synthetic */ a(Object obj, y82.a aVar, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : obj, (i14 & 2) != 0 ? null : aVar);
        }

        @Override // u82.f
        public final T a() {
            return this.f169494b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f169494b, aVar.f169494b) && s.g(this.f169495c, aVar.f169495c);
        }

        public final int hashCode() {
            T t7 = this.f169494b;
            int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
            y82.a aVar = this.f169495c;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "Failure(data=" + this.f169494b + ", failure=" + this.f169495c + ")";
        }

        public a(T t7, y82.a aVar) {
            super(t7, null);
            this.f169494b = t7;
            this.f169495c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
