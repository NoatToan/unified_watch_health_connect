package ml2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lml2/b0;", "", "<init>", "()V", "a", "b", "Lml2/b0$a;", "Lml2/b0$b;", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lml2/b0$a;", "Lml2/b0;", "Lml2/o;", "page", "<init>", "(Lml2/o;)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f119304a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(null);
            oVar.getClass();
            this.f119304a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f119304a, ((a) obj).f119304a);
        }

        public final int hashCode() {
            return this.f119304a.hashCode();
        }

        public final String toString() {
            return "Success(page=" + this.f119304a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lml2/b0$b;", "Lml2/b0;", "", "pageNumber", "<init>", "(B)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f119305a;

        public b(byte b14) {
            super(null);
            this.f119305a = b14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f119305a == ((b) obj).f119305a;
        }

        public final int hashCode() {
            return Byte.hashCode(this.f119305a);
        }

        public final String toString() {
            return v.e0.f(this.f119305a, "Unsupported(pageNumber=", ")");
        }
    }

    public /* synthetic */ b0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private b0() {
    }
}
