package s92;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Ls92/d;", "", "", "consentTypeId", "consentLocale", "consentVersion", "", "clientIndicator", "managedUserProfileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "a", "Ljava/lang/String;", "getConsentTypeId", "()Ljava/lang/String;", "setConsentTypeId", "(Ljava/lang/String;)V", "b", "getConsentLocale", "setConsentLocale", "c", "getConsentVersion", "setConsentVersion", "d", "Z", "getClientIndicator", "()Z", "setClientIndicator", "(Z)V", JWKParameterNames.RSA_EXPONENT, "getManagedUserProfileId", "setManagedUserProfileId", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class d {

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
    @SerializedName("clientIndicator")
    private boolean clientIndicator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("childUserProfileId")
    private String managedUserProfileId;

    public d(String str, String str2, String str3, boolean z14, String str4) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.consentTypeId = str;
        this.consentLocale = str2;
        this.consentVersion = str3;
        this.clientIndicator = z14;
        this.managedUserProfileId = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.consentTypeId, dVar.consentTypeId) && s.g(this.consentLocale, dVar.consentLocale) && s.g(this.consentVersion, dVar.consentVersion) && this.clientIndicator == dVar.clientIndicator && s.g(this.managedUserProfileId, dVar.managedUserProfileId);
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(wr.g.j(this.consentTypeId.hashCode() * 31, 31, this.consentLocale), 31, this.consentVersion), 31, this.clientIndicator);
        String str = this.managedUserProfileId;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.consentTypeId;
        String str2 = this.consentLocale;
        String str3 = this.consentVersion;
        boolean z14 = this.clientIndicator;
        String str4 = this.managedUserProfileId;
        StringBuilder sbI = p6.b.i("ConsentRevokeDeleteBody(consentTypeId=", str, ", consentLocale=", str2, ", consentVersion=");
        v.h.C(str3, ", clientIndicator=", ", managedUserProfileId=", sbI, z14);
        return am.j.o(str4, ")", sbI);
    }

    public /* synthetic */ d(String str, String str2, String str3, boolean z14, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, z14, (i14 & 16) != 0 ? null : str4);
    }
}
