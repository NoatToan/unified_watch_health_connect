package nr;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/y0;", "Lnr/w0;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y0 extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(String str) {
        super(null);
        str.getClass();
        this.f127594a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && p005kotlin.jvm.internal.s.g(this.f127594a, ((y0) obj).f127594a);
    }

    public final int hashCode() {
        return this.f127594a.hashCode();
    }

    public final String toString() {
        return am.j.m("ByAppId(appId=", this.f127594a, ")");
    }
}
