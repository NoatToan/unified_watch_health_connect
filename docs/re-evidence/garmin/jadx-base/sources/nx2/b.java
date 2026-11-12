package nx2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnx2/b;", "", "", "authCode", "", "deviceId", "<init>", "(Ljava/lang/String;J)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f128275b;

    static {
        new a(null);
    }

    public b(String str, long j8) {
        str.getClass();
        this.f128274a = str;
        this.f128275b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f128274a.equals(bVar.f128274a) && this.f128275b == bVar.f128275b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f128275b) + (this.f128274a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f128275b, "CreateEmbeddedHealthTokenRequest(authCode=", this.f128274a, ", deviceId=");
        sbJ.append(")");
        return sbJ.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnx2/b$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
