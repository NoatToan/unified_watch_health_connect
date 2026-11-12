package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lfo2/k0;", "Landroid/os/Parcelable;", "", "addressId", "cardHolderStreet1", "cardHolderStreet2", "cardHolderCity", "cardHolderState", "cardHolderPostalCode", "cardHolderCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setAddressId", "(Ljava/lang/String;)V", "getCardHolderStreet1", "setCardHolderStreet1", "c", "getCardHolderStreet2", "setCardHolderStreet2", "d", "getCardHolderCity", "setCardHolderCity", JWKParameterNames.RSA_EXPONENT, "getCardHolderState", "setCardHolderState", "f", "getCardHolderPostalCode", "setCardHolderPostalCode", "g", "getCardHolderCountry", "setCardHolderCountry", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressId")
    private String addressId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("street1")
    private String cardHolderStreet1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("street2")
    private String cardHolderStreet2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("city")
    private String cardHolderCity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private String cardHolderState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postalCode")
    private String cardHolderPostalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private String cardHolderCountry;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k0> {
        @Override // android.os.Parcelable.Creator
        public final k0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k0[] newArray(int i14) {
            return new k0[i14];
        }
    }

    public /* synthetic */ k0(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.addressId, k0Var.addressId) && p005kotlin.jvm.internal.s.g(this.cardHolderStreet1, k0Var.cardHolderStreet1) && p005kotlin.jvm.internal.s.g(this.cardHolderStreet2, k0Var.cardHolderStreet2) && p005kotlin.jvm.internal.s.g(this.cardHolderCity, k0Var.cardHolderCity) && p005kotlin.jvm.internal.s.g(this.cardHolderState, k0Var.cardHolderState) && p005kotlin.jvm.internal.s.g(this.cardHolderPostalCode, k0Var.cardHolderPostalCode) && p005kotlin.jvm.internal.s.g(this.cardHolderCountry, k0Var.cardHolderCountry);
    }

    public final int hashCode() {
        String str = this.addressId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardHolderStreet1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardHolderStreet2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardHolderCity;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardHolderState;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardHolderPostalCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardHolderCountry;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.addressId;
        String str2 = this.cardHolderStreet1;
        String str3 = this.cardHolderStreet2;
        String str4 = this.cardHolderCity;
        String str5 = this.cardHolderState;
        String str6 = this.cardHolderPostalCode;
        String str7 = this.cardHolderCountry;
        StringBuilder sbI = p6.b.i("UserAddress(addressId=", str, ", cardHolderStreet1=", str2, ", cardHolderStreet2=");
        sn.a.t(sbI, str3, ", cardHolderCity=", str4, ", cardHolderState=");
        sn.a.t(sbI, str5, ", cardHolderPostalCode=", str6, ", cardHolderCountry=");
        return am.j.o(str7, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.addressId);
        parcel.writeString(this.cardHolderStreet1);
        parcel.writeString(this.cardHolderStreet2);
        parcel.writeString(this.cardHolderCity);
        parcel.writeString(this.cardHolderState);
        parcel.writeString(this.cardHolderPostalCode);
        parcel.writeString(this.cardHolderCountry);
    }

    public k0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.addressId = str;
        this.cardHolderStreet1 = str2;
        this.cardHolderStreet2 = str3;
        this.cardHolderCity = str4;
        this.cardHolderState = str5;
        this.cardHolderPostalCode = str6;
        this.cardHolderCountry = str7;
    }

    public k0() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
