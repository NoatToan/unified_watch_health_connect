package dv2;

import am.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldv2/a;", "", "", "deviceId", RemoteConfigConstants.RequestFieldKey.APP_ID, "deviceMacAddress", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "appType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f61432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f61433e;

    public a(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.f61429a = str;
        this.f61430b = str2;
        this.f61431c = str3;
        this.f61432d = str4;
        this.f61433e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f61429a.equals(aVar.f61429a) && s.g(this.f61430b, aVar.f61430b) && s.g(this.f61431c, aVar.f61431c) && s.g(this.f61432d, aVar.f61432d) && s.g(this.f61433e, aVar.f61433e);
    }

    public final int hashCode() {
        int iHashCode = this.f61429a.hashCode() * 31;
        String str = this.f61430b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61431c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61432d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61433e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = b.i("CIQOptions(deviceId=", this.f61429a, ", appId=", this.f61430b, ", deviceMacAddress=");
        sn.a.t(sbI, this.f61431c, ", appVersion=", this.f61432d, ", appType=");
        return j.o(this.f61433e, ")", sbI);
    }
}
