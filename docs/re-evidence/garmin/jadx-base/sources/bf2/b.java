package bf2;

import c22.t;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbf2/b;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "icon", "<init>", "(Ljava/lang/String;I)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17826b;

    public b(String str, int i14) {
        str.getClass();
        this.f17825a = str;
        this.f17826b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17825a.equals(bVar.f17825a) && this.f17826b == bVar.f17826b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17826b) + (this.f17825a.hashCode() * 31);
    }

    public final String toString() {
        return t.e(this.f17826b, "SocialLoginAppItem(appId=", this.f17825a, ", icon=", ")");
    }
}
