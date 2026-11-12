package hk1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lhk1/q;", "", "<init>", "()V", "a", "c", "b", "d", "Lhk1/q$a;", "Lhk1/q$b;", "Lhk1/q$c;", "Lhk1/q$d;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhk1/q$a;", "Lhk1/q;", "", "token", "verifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            str.getClass();
            this.f84183a = str;
            this.f84184b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f84183a, aVar.f84183a) && p005kotlin.jvm.internal.s.g(this.f84184b, aVar.f84184b);
        }

        public final int hashCode() {
            int iHashCode = this.f84183a.hashCode() * 31;
            String str = this.f84184b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return e0.g("Oauth1(token=", this.f84183a, ", verifier=", this.f84184b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhk1/q$b;", "Lhk1/q;", "Lhk1/l;", "errorType", "", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lhk1/l;Ljava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f84185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, String str) {
            super(null);
            lVar.getClass();
            this.f84185a = lVar;
            this.f84186b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f84185a == bVar.f84185a && p005kotlin.jvm.internal.s.g(this.f84186b, bVar.f84186b);
        }

        public final int hashCode() {
            int iHashCode = this.f84185a.hashCode() * 31;
            String str = this.f84186b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Oauth2Error(errorType=" + this.f84185a + ", state=" + this.f84186b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhk1/q$c;", "Lhk1/q;", "Lhk1/a;", "authorizationCodeDTO", "<init>", "(Lhk1/a;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hk1.a f84187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(hk1.a aVar) {
            super(null);
            aVar.getClass();
            this.f84187a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f84187a, ((c) obj).f84187a);
        }

        public final int hashCode() {
            return this.f84187a.hashCode();
        }

        public final String toString() {
            return "Oauth2Success(authorizationCodeDTO=" + this.f84187a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk1/q$d;", "Lhk1/q;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f84188a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -789982563;
        }

        public final String toString() {
            return "Unsupported";
        }
    }

    public /* synthetic */ q(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private q() {
    }
}
