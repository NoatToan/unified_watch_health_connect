package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006 "}, d2 = {"Lfj2/h;", "Landroid/os/Parcelable;", "", "phoneNumberId", NotificationConstants.KEY_DATA_MIME_TYPE, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "areaCode", "phoneNumber", "extension", "carrier", "", "primary", "isoCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "getType", "c", "d", JWKParameterNames.RSA_EXPONENT, "g", "f", "getExtension", "getCarrier", "Z", "getPrimary", "()Z", IntegerTokenConverter.CONVERTER_KEY, "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumberId")
    private final String phoneNumberId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("areaCode")
    private final String areaCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extension")
    private final String extension;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("carrier")
    private final String carrier;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primary")
    private final boolean primary;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isoCountryCode")
    private final String isoCountryCode;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z14, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? true : z14, (i14 & 256) != 0 ? null : str8);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.phoneNumberId, hVar.phoneNumberId) && s.g(this.type, hVar.type) && s.g(this.countryCode, hVar.countryCode) && s.g(this.areaCode, hVar.areaCode) && s.g(this.phoneNumber, hVar.phoneNumber) && s.g(this.extension, hVar.extension) && s.g(this.carrier, hVar.carrier) && this.primary == hVar.primary && s.g(this.isoCountryCode, hVar.isoCountryCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public final int hashCode() {
        String str = this.phoneNumberId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.areaCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extension;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.carrier;
        int iG = q6.f.g((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.primary);
        String str8 = this.isoCountryCode;
        return iG + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.phoneNumberId;
        String str2 = this.type;
        String str3 = this.countryCode;
        String str4 = this.areaCode;
        String str5 = this.phoneNumber;
        String str6 = this.extension;
        String str7 = this.carrier;
        boolean z14 = this.primary;
        String str8 = this.isoCountryCode;
        StringBuilder sbI = p6.b.i("PhoneNumberDto(phoneNumberId=", str, ", type=", str2, ", countryCode=");
        sn.a.t(sbI, str3, ", areaCode=", str4, ", phoneNumber=");
        sn.a.t(sbI, str5, ", extension=", str6, ", carrier=");
        v.h.C(str7, ", primary=", ", isoCountryCode=", sbI, z14);
        return am.j.o(str8, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.phoneNumberId);
        parcel.writeString(this.type);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.extension);
        parcel.writeString(this.carrier);
        parcel.writeInt(this.primary ? 1 : 0);
        parcel.writeString(this.isoCountryCode);
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z14, String str8) {
        this.phoneNumberId = str;
        this.type = str2;
        this.countryCode = str3;
        this.areaCode = str4;
        this.phoneNumber = str5;
        this.extension = str6;
        this.carrier = str7;
        this.primary = z14;
        this.isoCountryCode = str8;
    }

    public h() {
        this(null, null, null, null, null, null, null, false, null, 511, null);
    }
}
