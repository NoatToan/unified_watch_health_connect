package to;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lto/b;", "", "", "typeId", "", "typeKey", "parentTypeId", "", "isHidden", "restricted", "trimmable", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getTypeId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getParentTypeId", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "getRestricted", "f", "getTrimmable", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private final Long typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    private final String typeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentTypeId")
    private final Long parentTypeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isHidden")
    private final Boolean isHidden;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restricted")
    private final Boolean restricted;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trimmable")
    private final Boolean trimmable;

    public b(Long l14, String str, Long l15, Boolean bool, Boolean bool2, Boolean bool3) {
        this.typeId = l14;
        this.typeKey = str;
        this.parentTypeId = l15;
        this.isHidden = bool;
        this.restricted = bool2;
        this.trimmable = bool3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTypeKey() {
        return this.typeKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.typeId, bVar.typeId) && s.g(this.typeKey, bVar.typeKey) && s.g(this.parentTypeId, bVar.parentTypeId) && s.g(this.isHidden, bVar.isHidden) && s.g(this.restricted, bVar.restricted) && s.g(this.trimmable, bVar.trimmable);
    }

    public final int hashCode() {
        Long l14 = this.typeId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.typeKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.parentTypeId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.isHidden;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.restricted;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.trimmable;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.typeId;
        String str = this.typeKey;
        Long l15 = this.parentTypeId;
        Boolean bool = this.isHidden;
        Boolean bool2 = this.restricted;
        Boolean bool3 = this.trimmable;
        StringBuilder sbJ = b71.i.j("ActivityTypeDTO(typeId=", ", typeKey=", str, l14, ", parentTypeId=");
        sbJ.append(l15);
        sbJ.append(", isHidden=");
        sbJ.append(bool);
        sbJ.append(", restricted=");
        sbJ.append(bool2);
        sbJ.append(", trimmable=");
        sbJ.append(bool3);
        sbJ.append(")");
        return sbJ.toString();
    }
}
