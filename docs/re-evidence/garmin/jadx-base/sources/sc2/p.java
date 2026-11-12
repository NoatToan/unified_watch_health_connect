package sc2;

import ch.qos.logback.core.joran.action.Action;
import java.io.Serializable;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsc2/p;", "Ljava/io/Serializable;", "", "audience", "userId", "", Action.SCOPE_ATTRIBUTE, "", "accessTokenExpireDateUTC", "", "hasMFAClaim", "customerManagedStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;JZLjava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f158556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f158557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f158558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f158559f;

    static {
        new a(null);
    }

    public p(String str, String str2, Set<String> set, long j8, boolean z14, String str3) {
        str.getClass();
        str2.getClass();
        set.getClass();
        str3.getClass();
        this.f158554a = str;
        this.f158555b = str2;
        this.f158556c = set;
        this.f158557d = j8;
        this.f158558e = z14;
        this.f158559f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f158554a.equals(pVar.f158554a) && this.f158555b.equals(pVar.f158555b) && this.f158556c.equals(pVar.f158556c) && this.f158557d == pVar.f158557d && this.f158558e == pVar.f158558e && this.f158559f.equals(pVar.f158559f);
    }

    public final int hashCode() {
        return this.f158559f.hashCode() + q6.f.g(q6.f.e((this.f158556c.hashCode() + wr.g.j(this.f158554a.hashCode() * 31, 31, this.f158555b)) * 31, 31, this.f158557d), 31, this.f158558e);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("OAuth2ITTokenInfo(audience='", this.f158554a, "', userId=", this.f158555b, ", scope='");
        sbI.append(this.f158556c);
        sbI.append("', accessTokenExpireDateUTC=");
        sbI.append(this.f158557d);
        sbI.append(", hasMFAClaim=");
        sbI.append(this.f158558e);
        sbI.append(", customerManagedStatus='");
        sbI.append(this.f158559f);
        sbI.append("')");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsc2/p$a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
