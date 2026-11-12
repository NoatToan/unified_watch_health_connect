package v52;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public interface c<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lv52/c$b;", "Lv52/c;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f175759a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -616887666;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: v52.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv52/c$c;", "T", "Lv52/c;", "data", "<init>", "(Ljava/lang/Object;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3278c<T> implements c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f175760a;

        public C3278c(T t7) {
            this.f175760a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3278c) && s.g(this.f175760a, ((C3278c) obj).f175760a);
        }

        public final int hashCode() {
            T t7 = this.f175760a;
            if (t7 == null) {
                return 0;
            }
            return t7.hashCode();
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("Success(data=", ")", this.f175760a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv52/c$a;", "Lv52/c;", "", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f175758a;

        public /* synthetic */ a(Throwable th3, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : th3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f175758a, ((a) obj).f175758a);
        }

        public final int hashCode() {
            Throwable th3 = this.f175758a;
            if (th3 == null) {
                return 0;
            }
            return th3.hashCode();
        }

        public final String toString() {
            return "Failed(exception=" + this.f175758a + ")";
        }

        public a(Throwable th3) {
            this.f175758a = th3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
