package vh;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lvh/k;", "", "T", "<init>", "()V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "Lvh/k$a;", "Lvh/k$b;", "Lvh/k$c;", "Lvh/k$d;", "Lvh/k$e;", "Lvh/k$f;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class k<T> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/k$b;", "", "T", "Lvh/k;", "value", "<init>", "(Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class b<T> extends k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f178337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t7) {
            super(null);
            t7.getClass();
            this.f178337a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f178337a, ((b) obj).f178337a);
        }

        public final int hashCode() {
            return this.f178337a.hashCode();
        }

        public final String toString() {
            return wr.g.p(new StringBuilder("Element(value="), this.f178337a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvh/k$c;", "Lvh/k;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f178338a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/k$d;", "", "T", "Lvh/k;", "operand", "<init>", "(Lvh/k;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class d<T> extends k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k<T> f178339a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(k<? extends T> kVar) {
            super(null);
            kVar.getClass();
            this.f178339a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f178339a, ((d) obj).f178339a);
        }

        public final int hashCode() {
            return this.f178339a.hashCode();
        }

        public final String toString() {
            return "Not(operand=" + this.f178339a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvh/k$f;", "Lvh/k;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f178341a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ k(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private k() {
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\b\"\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lvh/k$a;", "", "T", "Lvh/k;", "", "operands", "<init>", "(Ljava/util/Set;)V", "", "([Lvh/k;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class a<T> extends k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<k<T>> f178336a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Set<? extends k<? extends T>> set) {
            super(null);
            set.getClass();
            this.f178336a = set;
            if (set.isEmpty()) {
                vb.h.z("Apollo: cannot create a 'And' condition from an empty list");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f178336a, ((a) obj).f178336a);
        }

        public final int hashCode() {
            return this.f178336a.hashCode();
        }

        public final String toString() {
            return "And(operands=" + this.f178336a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(k<? extends T>... kVarArr) {
            this(p13.u.m0(kVarArr));
            kVarArr.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\b\"\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lvh/k$e;", "", "T", "Lvh/k;", "", "operands", "<init>", "(Ljava/util/Set;)V", "", "([Lvh/k;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class e<T> extends k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<k<T>> f178340a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Set<? extends k<? extends T>> set) {
            super(null);
            set.getClass();
            this.f178340a = set;
            if (set.isEmpty()) {
                vb.h.z("Apollo: cannot create a 'Or' condition from an empty list");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.f178340a, ((e) obj).f178340a);
        }

        public final int hashCode() {
            return this.f178340a.hashCode();
        }

        public final String toString() {
            return p13.h0.k0(this.f178340a, " | ", null, null, null, 62);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(k<? extends T>... kVarArr) {
            this(p13.u.m0(kVarArr));
            kVarArr.getClass();
        }
    }
}
