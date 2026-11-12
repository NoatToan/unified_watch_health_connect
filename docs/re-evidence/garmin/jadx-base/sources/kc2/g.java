package kc2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lkc2/g;", "Landroid/os/Parcelable;", "", "unitId", "", ModelSourceWrapper.TYPE, "productNumber", "softwareVersion", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "J", "getUnitId", "()J", "setUnitId", "(J)V", "b", "Ljava/lang/String;", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "c", "getProductNumber", "setProductNumber", "d", "getSoftwareVersion", "setSoftwareVersion", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UnitID")
    private long unitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Model")
    private String model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SoftwarePartNumber")
    private String productNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SoftwareVersion")
    private String softwareVersion;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(long j8, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.unitId = j8;
        this.model = str;
        this.productNumber = str2;
        this.softwareVersion = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.unitId == gVar.unitId && s.g(this.model, gVar.model) && s.g(this.productNumber, gVar.productNumber) && s.g(this.softwareVersion, gVar.softwareVersion);
    }

    public final int hashCode() {
        return this.softwareVersion.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.unitId) * 31, 31, this.model), 31, this.productNumber);
    }

    public final String toString() {
        long j8 = this.unitId;
        String str = this.model;
        String str2 = this.productNumber;
        String str3 = this.softwareVersion;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "UnitInfo(unitId=", ", model=", str);
        sn.a.t(sbK, ", productNumber=", str2, ", softwareVersion=", str3);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.unitId);
        parcel.writeString(this.model);
        parcel.writeString(this.productNumber);
        parcel.writeString(this.softwareVersion);
    }
}
