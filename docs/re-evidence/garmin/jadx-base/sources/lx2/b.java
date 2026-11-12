package lx2;

import ch.qos.logback.core.joran.action.Action;
import com.google.maps.android.BuildConfig;
import d53.w;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Llx2/b;", "", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f115277c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115279b;

    public b(String str, String str2) {
        str.getClass();
        this.f115278a = str;
        this.f115279b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f115278a.equals(bVar.f115278a) && s.g(this.f115279b, bVar.f115279b);
    }

    public final int hashCode() {
        int iHashCode = this.f115278a.hashCode() * 31;
        String str = this.f115279b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("GCUserPreference(key=", this.f115278a, ", value=", this.f115279b, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llx2/b$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(c cVar) {
            try {
                JSONObject jSONObject = new JSONObject(cVar.f115280a);
                String strOptString = jSONObject.optString("value");
                if (strOptString != null && (w.J(strOptString) || strOptString.equalsIgnoreCase(BuildConfig.TRAVIS))) {
                    strOptString = null;
                }
                String string = jSONObject.getString(Action.KEY_ATTRIBUTE);
                string.getClass();
                return new b(string, strOptString);
            } catch (Throwable th3) {
                ge1.b.L("GCUserPreference").error("fromGCJson", th3);
                throw th3;
            }
        }

        private a() {
        }
    }
}
