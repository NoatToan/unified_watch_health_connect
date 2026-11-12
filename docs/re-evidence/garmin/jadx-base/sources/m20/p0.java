package m20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0011\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lm20/p0;", "Landroid/os/Parcelable;", "", "phoneNumber", "phoneUuid", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "internationalFormat", "", "valid", "canReceiveText", "lastValidCheckDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "f", "c", "getCountryCode", "getInternationalFormat", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "getLastValidCheckDate", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneUuid")
    private final String phoneUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("internationalFormat")
    private final String internationalFormat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valid")
    private final Boolean valid;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("canReceiveText")
    private final Boolean canReceiveText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastValidCheckDate")
    private final String lastValidCheckDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        public final p0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new p0(string, string2, string3, string4, boolValueOf, boolValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final p0[] newArray(int i14) {
            return new p0[i14];
        }
    }

    public /* synthetic */ p0(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : bool2, (i14 & 64) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCanReceiveText() {
        return this.canReceiveText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p005kotlin.jvm.internal.s.g(this.phoneNumber, p0Var.phoneNumber) && p005kotlin.jvm.internal.s.g(this.phoneUuid, p0Var.phoneUuid) && p005kotlin.jvm.internal.s.g(this.countryCode, p0Var.countryCode) && p005kotlin.jvm.internal.s.g(this.internationalFormat, p0Var.internationalFormat) && p005kotlin.jvm.internal.s.g(this.valid, p0Var.valid) && p005kotlin.jvm.internal.s.g(this.canReceiveText, p0Var.canReceiveText) && p005kotlin.jvm.internal.s.g(this.lastValidCheckDate, p0Var.lastValidCheckDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPhoneUuid() {
        return this.phoneUuid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getValid() {
        return this.valid;
    }

    public final int hashCode() {
        String str = this.phoneNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneUuid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.internationalFormat;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.valid;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canReceiveText;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.lastValidCheckDate;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.phoneNumber;
        String str2 = this.phoneUuid;
        String str3 = this.countryCode;
        String str4 = this.internationalFormat;
        Boolean bool = this.valid;
        Boolean bool2 = this.canReceiveText;
        String str5 = this.lastValidCheckDate;
        StringBuilder sbI = p6.b.i("PhoneNumberValidateResponseDTO(phoneNumber=", str, ", phoneUuid=", str2, ", countryCode=");
        sn.a.t(sbI, str3, ", internationalFormat=", str4, ", valid=");
        b71.i.o(bool, bool2, ", canReceiveText=", ", lastValidCheckDate=", sbI);
        return am.j.o(str5, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.phoneUuid);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.internationalFormat);
        Boolean bool = this.valid;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.canReceiveText;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        parcel.writeString(this.lastValidCheckDate);
    }

    public p0(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5) {
        this.phoneNumber = str;
        this.phoneUuid = str2;
        this.countryCode = str3;
        this.internationalFormat = str4;
        this.valid = bool;
        this.canReceiveText = bool2;
        this.lastValidCheckDate = str5;
    }

    public p0() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
