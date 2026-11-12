package gf0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgf0/c;", "Landroid/os/Parcelable;", "", "productName", "productId", "firmwareVersion", "partNumber", "Lcom/garmin/android/apps/connectmobile/devices/model/l;", "device", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/devices/model/l;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "getProductId", "c", "d", "getPartNumber", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/devices/model/l;", "()Lcom/garmin/android/apps/connectmobile/devices/model/l;", "g", "(Lcom/garmin/android/apps/connectmobile/devices/model/l;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productName")
    private final String productName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firmwareVersion")
    private final String firmwareVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("partNumber")
    private final String partNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private l device;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (l) parcel.readParcelable(c.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, l lVar, int i14, j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? null : lVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.productName, cVar.productName) && s.g(this.productId, cVar.productId) && s.g(this.firmwareVersion, cVar.firmwareVersion) && s.g(this.partNumber, cVar.partNumber) && s.g(this.device, cVar.device);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public final void g(l lVar) {
        this.device = lVar;
    }

    public final String getPartNumber() {
        return this.partNumber;
    }

    public final int hashCode() {
        String str = this.productName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firmwareVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        l lVar = this.device;
        return iHashCode4 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.productName;
        String str2 = this.productId;
        String str3 = this.firmwareVersion;
        String str4 = this.partNumber;
        l lVar = this.device;
        StringBuilder sbI = p6.b.i("EcgDeviceInfo(productName=", str, ", productId=", str2, ", firmwareVersion=");
        sn.a.t(sbI, str3, ", partNumber=", str4, ", device=");
        sbI.append(lVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.productName);
        parcel.writeString(this.productId);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.partNumber);
        parcel.writeParcelable(this.device, i14);
    }

    public c(String str, String str2, String str3, String str4, l lVar) {
        this.productName = str;
        this.productId = str2;
        this.firmwareVersion = str3;
        this.partNumber = str4;
        this.device = lVar;
    }
}
