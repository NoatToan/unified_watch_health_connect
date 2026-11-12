package q10;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lq10/c;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "internalVersionNumber", "<init>", "(Ljava/lang/String;J)V", "a", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "b", "J", "getInternalVersionNumber", "()J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    private final String appId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("internalVersionNumber")
    private final long internalVersionNumber;

    public c(String str, long j8) {
        str.getClass();
        this.appId = str;
        this.internalVersionNumber = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.appId, cVar.appId) && this.internalVersionNumber == cVar.internalVersionNumber;
    }

    public final int hashCode() {
        return Long.hashCode(this.internalVersionNumber) + (this.appId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.internalVersionNumber, "AppsUpdatesDTO(appId=", this.appId, ", internalVersionNumber=");
        sbJ.append(")");
        return sbJ.toString();
    }
}
