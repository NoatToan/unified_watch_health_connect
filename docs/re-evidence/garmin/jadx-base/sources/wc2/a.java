package wc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lwc2/a;", "T", "", "<init>", "()V", "b", "a", "Lwc2/a$a;", "Lwc2/a$b;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwc2/a$b;", "T", "Lwc2/a;", "data", "", "responseCode", "<init>", "(Ljava/lang/Object;I)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b<T> extends a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f184316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f184317b;

        public b(T t7, int i14) {
            super(null);
            this.f184316a = t7;
            this.f184317b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f184316a, bVar.f184316a) && this.f184317b == bVar.f184317b;
        }

        public final int hashCode() {
            T t7 = this.f184316a;
            return Integer.hashCode(this.f184317b) + ((t7 == null ? 0 : t7.hashCode()) * 31);
        }

        public final String toString() {
            return "Success(data=" + this.f184316a + ", responseCode=" + this.f184317b + ")";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }

    /* JADX INFO: renamed from: wc2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwc2/a$a;", "Lwc2/a;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "responseCode", "", "errorResponse", "retryAfter", "<init>", "(Ljava/lang/Exception;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3415a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f184312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f184313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f184314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f184315d;

        public /* synthetic */ C3415a(Exception exc, Integer num, String str, Integer num2, int i14, j jVar) {
            this(exc, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3415a)) {
                return false;
            }
            C3415a c3415a = (C3415a) obj;
            return s.g(this.f184312a, c3415a.f184312a) && s.g(this.f184313b, c3415a.f184313b) && s.g(this.f184314c, c3415a.f184314c) && s.g(this.f184315d, c3415a.f184315d);
        }

        public final int hashCode() {
            int iHashCode = this.f184312a.hashCode() * 31;
            Integer num = this.f184313b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f184314c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.f184315d;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "Error(exception=" + this.f184312a + ", responseCode=" + this.f184313b + ", errorResponse=" + this.f184314c + ", retryAfter=" + this.f184315d + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C3415a(Exception exc, Integer num) {
            this(exc, num, null, null, 12, null);
            exc.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C3415a(Exception exc, Integer num, String str) {
            this(exc, num, str, null, 8, null);
            exc.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C3415a(Exception exc) {
            this(exc, null, null, null, 14, null);
            exc.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3415a(Exception exc, Integer num, String str, Integer num2) {
            super(null);
            exc.getClass();
            this.f184312a = exc;
            this.f184313b = num;
            this.f184314c = str;
            this.f184315d = num2;
        }
    }
}
