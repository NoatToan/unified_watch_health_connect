package ns2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lns2/c;", "", "<init>", "()V", "b", "a", "Lns2/c$a;", "Lns2/c$b;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns2/c$a;", "Lns2/c;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127825b;

        public a(String str, String str2) {
            super(null);
            this.f127824a = str;
            this.f127825b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f127824a, aVar.f127824a) && s.g(this.f127825b, aVar.f127825b);
        }

        public final int hashCode() {
            String str = this.f127824a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f127825b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return e0.g("Error(title=", this.f127824a, ", message=", this.f127825b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns2/c$b;", "Lns2/c;", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f127826a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ c(j jVar) {
        this();
    }

    private c() {
    }
}
