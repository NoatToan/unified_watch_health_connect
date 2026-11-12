package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lfj2/k;", "Landroid/os/Parcelable;", "", "guid", "Lfj2/d;", "countryDTO", "subCountryCode", "subCountryName", "", "Lfj2/j;", "aliases", "Lfj2/e;", "districtDtos", "<init>", "(Ljava/lang/String;Lfj2/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getGuid", "()Ljava/lang/String;", "b", "Lfj2/d;", "getCountryDTO", "()Lfj2/d;", "c", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "getAliases", "()Ljava/util/List;", "f", "getDistrictDtos", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guid")
    private final String guid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryDTO")
    private final d countryDTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCountryCode")
    private final String subCountryCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCountryName")
    private final String subCountryName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aliases")
    private final List<j> aliases;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("districtDtos")
    private final List<e> districtDtos;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(j.CREATOR, parcel, arrayList, iA, 1);
            }
            int i15 = parcel.readInt();
            int iA2 = 0;
            ArrayList arrayList2 = new ArrayList(i15);
            while (iA2 != i15) {
                iA2 = kg.f.a(e.CREATOR, parcel, arrayList2, iA2, 1);
            }
            return new k(string, dVarCreateFromParcel, string2, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(String str, d dVar, String str2, String str3, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? j0.f134944a : list, (i14 & 32) != 0 ? j0.f134944a : list2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubCountryCode() {
        return this.subCountryCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubCountryName() {
        return this.subCountryName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.guid, kVar.guid) && s.g(this.countryDTO, kVar.countryDTO) && s.g(this.subCountryCode, kVar.subCountryCode) && s.g(this.subCountryName, kVar.subCountryName) && s.g(this.aliases, kVar.aliases) && s.g(this.districtDtos, kVar.districtDtos);
    }

    public final int hashCode() {
        int iHashCode = this.guid.hashCode() * 31;
        d dVar = this.countryDTO;
        return this.districtDtos.hashCode() + u0.b(wr.g.j(wr.g.j((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.subCountryCode), 31, this.subCountryName), 31, this.aliases);
    }

    public final String toString() {
        String str = this.guid;
        d dVar = this.countryDTO;
        String str2 = this.subCountryCode;
        String str3 = this.subCountryName;
        List<j> list = this.aliases;
        List<e> list2 = this.districtDtos;
        StringBuilder sb3 = new StringBuilder("SubCountryDto(guid=");
        sb3.append(str);
        sb3.append(", countryDTO=");
        sb3.append(dVar);
        sb3.append(", subCountryCode=");
        sn.a.t(sb3, str2, ", subCountryName=", str3, ", aliases=");
        return n23.j.j(sb3, list, ", districtDtos=", list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.guid);
        d dVar = this.countryDTO;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.subCountryCode);
        parcel.writeString(this.subCountryName);
        Iterator itE = kg.f.e(this.aliases, parcel);
        while (itE.hasNext()) {
            ((j) itE.next()).writeToParcel(parcel, i14);
        }
        Iterator itE2 = kg.f.e(this.districtDtos, parcel);
        while (itE2.hasNext()) {
            ((e) itE2.next()).writeToParcel(parcel, i14);
        }
    }

    public k(String str, d dVar, String str2, String str3, List<j> list, List<e> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.guid = str;
        this.countryDTO = dVar;
        this.subCountryCode = str2;
        this.subCountryName = str3;
        this.aliases = list;
        this.districtDtos = list2;
    }

    public k() {
        this(null, null, null, null, null, null, 63, null);
    }
}
