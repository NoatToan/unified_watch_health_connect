package s92;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Ls92/h;", "", "", "consentTypeId", "consentLocale", "consentVersion", "managedUserProfileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getConsentTypeId", "()Ljava/lang/String;", "setConsentTypeId", "(Ljava/lang/String;)V", "b", "getConsentLocale", "setConsentLocale", "c", "getConsentVersion", "setConsentVersion", "d", "getManagedUserProfileId", "setManagedUserProfileId", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    private String consentTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentLocale")
    private String consentLocale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentVersion")
    private String consentVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("childUserProfileId")
    private String managedUserProfileId;

    public h(String str, String str2, String str3, String str4) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.consentTypeId = str;
        this.consentLocale = str2;
        this.consentVersion = str3;
        this.managedUserProfileId = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.consentTypeId, hVar.consentTypeId) && s.g(this.consentLocale, hVar.consentLocale) && s.g(this.consentVersion, hVar.consentVersion) && s.g(this.managedUserProfileId, hVar.managedUserProfileId);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.consentTypeId.hashCode() * 31, 31, this.consentLocale), 31, this.consentVersion);
        String str = this.managedUserProfileId;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.consentTypeId;
        String str2 = this.consentLocale;
        return e5.h(p6.b.i("ConsentUpdateBody(consentTypeId=", str, ", consentLocale=", str2, ", consentVersion="), this.consentVersion, ", managedUserProfileId=", this.managedUserProfileId, ")");
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, (i14 & 8) != 0 ? null : str4);
    }
}
