package tc2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltc2/c;", "", "", "rawServerJson", "Ltc2/a;", "digitalAgeOfConsent", "minimumAgeOfUse", "legalAdultAge", "country", "", "dateOfBirthUTC", "<init>", "(Ljava/lang/String;Ltc2/a;Ltc2/a;Ltc2/a;Ljava/lang/String;Ljava/lang/Long;)V", "b", "Ltc2/a;", "a", "()Ltc2/a;", "c", "getMinimumAgeOfUse", "d", "getLegalAdultAge", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "f", "Ljava/lang/Long;", "getDateOfBirthUTC", "()Ljava/lang/Long;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient String f163844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("digitalAgeOfConsent")
    private final a digitalAgeOfConsent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minimumAgeOfUse")
    private final a minimumAgeOfUse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legalAdultAge")
    private final a legalAdultAge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("country")
    private final String country;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateOfBirth")
    private final Long dateOfBirthUTC;

    public c(String str, a aVar, a aVar2, a aVar3, String str2, Long l14) {
        this.f163844a = str;
        this.digitalAgeOfConsent = aVar;
        this.minimumAgeOfUse = aVar2;
        this.legalAdultAge = aVar3;
        this.country = str2;
        this.dateOfBirthUTC = l14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDigitalAgeOfConsent() {
        return this.digitalAgeOfConsent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f163844a, cVar.f163844a) && s.g(this.digitalAgeOfConsent, cVar.digitalAgeOfConsent) && s.g(this.minimumAgeOfUse, cVar.minimumAgeOfUse) && s.g(this.legalAdultAge, cVar.legalAdultAge) && s.g(this.country, cVar.country) && s.g(this.dateOfBirthUTC, cVar.dateOfBirthUTC);
    }

    public final int hashCode() {
        String str = this.f163844a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.digitalAgeOfConsent;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.minimumAgeOfUse;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.legalAdultAge;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str2 = this.country;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.dateOfBirthUTC;
        return iHashCode5 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        a aVar = this.digitalAgeOfConsent;
        a aVar2 = this.minimumAgeOfUse;
        a aVar3 = this.legalAdultAge;
        String str = this.country;
        Long l14 = this.dateOfBirthUTC;
        StringBuilder sb3 = new StringBuilder("AgeStatusResponse(digitalAgeOfConsent=");
        sb3.append(aVar);
        sb3.append(", minimumAgeOfUse=");
        sb3.append(aVar2);
        sb3.append(", legalAdultAge=");
        sb3.append(aVar3);
        sb3.append(", country=");
        sb3.append(str);
        sb3.append(", dateOfBirthUTC=");
        return p6.b.g(sb3, l14, ")");
    }

    public /* synthetic */ c(String str, a aVar, a aVar2, a aVar3, String str2, Long l14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, aVar, aVar2, aVar3, str2, l14);
    }
}
