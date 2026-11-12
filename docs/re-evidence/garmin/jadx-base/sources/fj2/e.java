package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lfj2/e;", "Landroid/os/Parcelable;", "", "guid", "Lfj2/k;", "subCountryDTO", "districtCode", "district", "wards", "<init>", "(Ljava/lang/String;Lfj2/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getGuid", "()Ljava/lang/String;", "b", "Lfj2/k;", "getSubCountryDTO", "()Lfj2/k;", "c", "d", JWKParameterNames.RSA_EXPONENT, "getWards", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guid")
    private final String guid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCountryDTO")
    private final k subCountryDTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("districtCode")
    private final String districtCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("district")
    private final String district;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wards")
    private final String wards;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readString(), k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(String str, k kVar, String str2, String str3, String str4) {
        str.getClass();
        kVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.guid = str;
        this.subCountryDTO = kVar;
        this.districtCode = str2;
        this.district = str3;
        this.wards = str4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDistrictCode() {
        return this.districtCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.guid, eVar.guid) && s.g(this.subCountryDTO, eVar.subCountryDTO) && s.g(this.districtCode, eVar.districtCode) && s.g(this.district, eVar.district) && s.g(this.wards, eVar.wards);
    }

    public final int hashCode() {
        return this.wards.hashCode() + wr.g.j(wr.g.j((this.subCountryDTO.hashCode() + (this.guid.hashCode() * 31)) * 31, 31, this.districtCode), 31, this.district);
    }

    public final String toString() {
        String str = this.guid;
        k kVar = this.subCountryDTO;
        String str2 = this.districtCode;
        String str3 = this.district;
        String str4 = this.wards;
        StringBuilder sb3 = new StringBuilder("DistrictDto(guid=");
        sb3.append(str);
        sb3.append(", subCountryDTO=");
        sb3.append(kVar);
        sb3.append(", districtCode=");
        sn.a.t(sb3, str2, ", district=", str3, ", wards=");
        return am.j.o(str4, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.guid);
        this.subCountryDTO.writeToParcel(parcel, i14);
        parcel.writeString(this.districtCode);
        parcel.writeString(this.district);
        parcel.writeString(this.wards);
    }
}
