package nc2;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnc2/e;", "", "", "token", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125379b;

    public e(String str, String str2) {
        this.f125378a = str;
        this.f125379b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f125378a, eVar.f125378a) && s.g(this.f125379b, eVar.f125379b);
    }

    public final int hashCode() {
        String str = this.f125378a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f125379b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.g("IntegrityTokenResult(token=", this.f125378a, ", error=", this.f125379b, ")");
    }
}
