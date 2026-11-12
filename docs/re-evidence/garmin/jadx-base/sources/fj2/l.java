package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u0011"}, d2 = {"Lfj2/l;", "Landroid/os/Parcelable;", "", "guid", "districtCode", "wardCode", "ward", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getGuid", "()Ljava/lang/String;", "b", "getDistrictCode", "c", "d", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guid")
    private final String guid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("districtCode")
    private final String districtCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wardCode")
    private final String wardCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ward")
    private final String ward;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.guid = str;
        this.districtCode = str2;
        this.wardCode = str3;
        this.ward = str4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWard() {
        return this.ward;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWardCode() {
        return this.wardCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.guid, lVar.guid) && s.g(this.districtCode, lVar.districtCode) && s.g(this.wardCode, lVar.wardCode) && s.g(this.ward, lVar.ward);
    }

    public final int hashCode() {
        return this.ward.hashCode() + wr.g.j(wr.g.j(this.guid.hashCode() * 31, 31, this.districtCode), 31, this.wardCode);
    }

    public final String toString() {
        String str = this.guid;
        String str2 = this.districtCode;
        return e5.h(p6.b.i("WardDto(guid=", str, ", districtCode=", str2, ", wardCode="), this.wardCode, ", ward=", this.ward, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.guid);
        parcel.writeString(this.districtCode);
        parcel.writeString(this.wardCode);
        parcel.writeString(this.ward);
    }
}
