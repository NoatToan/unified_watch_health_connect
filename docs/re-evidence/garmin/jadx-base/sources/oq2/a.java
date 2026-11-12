package oq2;

import am.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Loq2/a;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "urlScheme", "playStoreLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "getUrlScheme", "c", "getPlayStoreLink", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
    private final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("urlScheme")
    private final String urlScheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("playStoreLink")
    private final String playStoreLink;

    public a(String str, String str2, String str3) {
        this.packageName = str;
        this.urlScheme = str2;
        this.playStoreLink = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrlScheme() {
        return this.urlScheme;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlayStoreLink() {
        return this.playStoreLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.packageName, aVar.packageName) && s.g(this.urlScheme, aVar.urlScheme) && s.g(this.playStoreLink, aVar.playStoreLink);
    }

    public final int hashCode() {
        String str = this.packageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.urlScheme;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.playStoreLink;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return j.o(this.playStoreLink, ")", p6.b.i("RabbitAppInfo(packageName=", this.packageName, ", urlScheme=", this.urlScheme, ", playStoreLink="));
    }
}
