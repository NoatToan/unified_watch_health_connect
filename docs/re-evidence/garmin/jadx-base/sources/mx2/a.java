package mx2;

import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmx2/a;", "", "", "exists", "", "samdId", "<init>", "(ZLjava/lang/String;)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2301a f121449c = new C2301a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f121450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121451b;

    public /* synthetic */ a(boolean z14, String str, int i14, j jVar) {
        this(z14, (i14 & 2) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f121450a == aVar.f121450a && s.g(this.f121451b, aVar.f121451b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z14 = this.f121450a;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        String str = this.f121451b;
        return i14 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AccountStatus(exists=" + this.f121450a + ", samdId=" + this.f121451b + ")";
    }

    /* JADX INFO: renamed from: mx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx2/a$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C2301a {
        public /* synthetic */ C2301a(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(b bVar) {
            bVar.getClass();
            try {
                JSONObject jSONObject = new JSONObject(bVar.f121452a);
                if (jSONObject.getBoolean("exists")) {
                    return new a(true, jSONObject.getJSONObject("account").getString("samdId"));
                }
                return new a(false, null, 2, 0 == true ? 1 : 0);
            } catch (Throwable th3) {
                ge1.b.L("AccountStatus").error("fromGHSJson", th3);
                throw th3;
            }
        }

        private C2301a() {
        }
    }

    public a(boolean z14, String str) {
        this.f121450a = z14;
        this.f121451b = str;
    }
}
