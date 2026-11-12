package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lfj2/d;", "Landroid/os/Parcelable;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "countryName", "ecomCatalog", "defaultLocale", "", "callingCode", "", "Lfj2/k;", "subCountries", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "f", "c", "getEcomCatalog", "getDefaultLocale", JWKParameterNames.RSA_EXPONENT, "I", "()I", "Ljava/util/List;", "g", "()Ljava/util/List;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryName")
    private final String countryName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ecomCatalog")
    private final String ecomCatalog;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultLocale")
    private final String defaultLocale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("callingCode")
    private final int callingCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCountries")
    private final List<k> subCountries;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(k.CREATOR, parcel, arrayList, iA, 1);
            }
            return new d(string, string2, string3, string4, i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, String str2, String str3, String str4, int i14, List list, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? "" : str4, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? j0.f134944a : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCallingCode() {
        return this.callingCode;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.countryCode, dVar.countryCode) && s.g(this.countryName, dVar.countryName) && s.g(this.ecomCatalog, dVar.ecomCatalog) && s.g(this.defaultLocale, dVar.defaultLocale) && this.callingCode == dVar.callingCode && s.g(this.subCountries, dVar.subCountries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    public final List<k> g() {
        return this.subCountries;
    }

    public final int hashCode() {
        return this.subCountries.hashCode() + q2.d(this.callingCode, wr.g.j(wr.g.j(wr.g.j(this.countryCode.hashCode() * 31, 31, this.countryName), 31, this.ecomCatalog), 31, this.defaultLocale), 31);
    }

    public final String toString() {
        String str = this.countryCode;
        String str2 = this.countryName;
        String str3 = this.ecomCatalog;
        String str4 = this.defaultLocale;
        int i14 = this.callingCode;
        List<k> list = this.subCountries;
        StringBuilder sbI = p6.b.i("CountryDto(countryCode=", str, ", countryName=", str2, ", ecomCatalog=");
        sn.a.t(sbI, str3, ", defaultLocale=", str4, ", callingCode=");
        sbI.append(i14);
        sbI.append(", subCountries=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countryName);
        parcel.writeString(this.ecomCatalog);
        parcel.writeString(this.defaultLocale);
        parcel.writeInt(this.callingCode);
        Iterator itE = kg.f.e(this.subCountries, parcel);
        while (itE.hasNext()) {
            ((k) itE.next()).writeToParcel(parcel, i14);
        }
    }

    public d(String str, String str2, String str3, String str4, int i14, List<k> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.countryCode = str;
        this.countryName = str2;
        this.ecomCatalog = str3;
        this.defaultLocale = str4;
        this.callingCode = i14;
        this.subCountries = list;
    }

    public d() {
        this(null, null, null, null, 0, null, 63, null);
    }
}
