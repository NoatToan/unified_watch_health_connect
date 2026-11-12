package xw1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u001c\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lxw1/g;", "", "", "coachKey", "firstName", "lastName", "tagLine", "hdpiUrl", "xhdpiUrl", "xxhdpiUrl", "xxxhdpiUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setCoachKey", "(Ljava/lang/String;)V", "b", "setFirstName", "c", "setLastName", "d", "setTagLine", JWKParameterNames.RSA_EXPONENT, "getHdpiUrl", "setHdpiUrl", "f", "setXhdpiUrl", "g", "getXxhdpiUrl", "setXxhdpiUrl", "h", "getXxxhdpiUrl", "setXxxhdpiUrl", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coachKey")
    private String coachKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tagLine")
    private String tagLine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hdpiUrl")
    private String hdpiUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("xhdpiUrl")
    private String xhdpiUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("xxhdpiUrl")
    private String xxhdpiUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("xxxhdpiUrl")
    private String xxxhdpiUrl;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.coachKey = str;
        this.firstName = str2;
        this.lastName = str3;
        this.tagLine = str4;
        this.hdpiUrl = str5;
        this.xhdpiUrl = str6;
        this.xxhdpiUrl = str7;
        this.xxxhdpiUrl = str8;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCoachKey() {
        return this.coachKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTagLine() {
        return this.tagLine;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getXhdpiUrl() {
        return this.xhdpiUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.coachKey, gVar.coachKey) && s.g(this.firstName, gVar.firstName) && s.g(this.lastName, gVar.lastName) && s.g(this.tagLine, gVar.tagLine) && s.g(this.hdpiUrl, gVar.hdpiUrl) && s.g(this.xhdpiUrl, gVar.xhdpiUrl) && s.g(this.xxhdpiUrl, gVar.xxhdpiUrl) && s.g(this.xxxhdpiUrl, gVar.xxxhdpiUrl);
    }

    public final int hashCode() {
        String str = this.coachKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tagLine;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hdpiUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.xhdpiUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.xxhdpiUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.xxxhdpiUrl;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.coachKey;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.tagLine;
        String str5 = this.hdpiUrl;
        String str6 = this.xhdpiUrl;
        String str7 = this.xxhdpiUrl;
        String str8 = this.xxxhdpiUrl;
        StringBuilder sbI = p6.b.i("CoachModel(coachKey=", str, ", firstName=", str2, ", lastName=");
        sn.a.t(sbI, str3, ", tagLine=", str4, ", hdpiUrl=");
        sn.a.t(sbI, str5, ", xhdpiUrl=", str6, ", xxhdpiUrl=");
        return e5.h(sbI, str7, ", xxxhdpiUrl=", str8, ")");
    }
}
