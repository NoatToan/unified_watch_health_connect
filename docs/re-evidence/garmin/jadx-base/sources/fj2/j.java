package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lfj2/j;", "Landroid/os/Parcelable;", "", "guid", "subCountry", "alias", "createdDate", "updatedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getGuid", "()Ljava/lang/String;", "b", "getSubCountry", "c", "getAlias", "d", "getCreatedDate", JWKParameterNames.RSA_EXPONENT, "getUpdatedDate", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guid")
    private final String guid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subCountryDTO")
    private final String subCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("alias")
    private final String alias;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    private final String createdDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedDate")
    private final String updatedDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(String str, String str2, String str3, String str4, String str5) {
        hb.a.p(str, str2, str3, str4, str5);
        this.guid = str;
        this.subCountry = str2;
        this.alias = str3;
        this.createdDate = str4;
        this.updatedDate = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.guid, jVar.guid) && s.g(this.subCountry, jVar.subCountry) && s.g(this.alias, jVar.alias) && s.g(this.createdDate, jVar.createdDate) && s.g(this.updatedDate, jVar.updatedDate);
    }

    public final int hashCode() {
        return this.updatedDate.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.guid.hashCode() * 31, 31, this.subCountry), 31, this.alias), 31, this.createdDate);
    }

    public final String toString() {
        String str = this.guid;
        String str2 = this.subCountry;
        String str3 = this.alias;
        String str4 = this.createdDate;
        String str5 = this.updatedDate;
        StringBuilder sbI = p6.b.i("SubCountryAliasDto(guid=", str, ", subCountry=", str2, ", alias=");
        sn.a.t(sbI, str3, ", createdDate=", str4, ", updatedDate=");
        return am.j.o(str5, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.guid);
        parcel.writeString(this.subCountry);
        parcel.writeString(this.alias);
        parcel.writeString(this.createdDate);
        parcel.writeString(this.updatedDate);
    }
}
