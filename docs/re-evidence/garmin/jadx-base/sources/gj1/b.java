package gj1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lgj1/b;", "Landroid/os/Parcelable;", "", "deviceId", "", "displayName", "imageUrl", "", "primaryTrainingCapable", "primaryWearableDevice", "lhaBackupCapable", "", "weight", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "getImageUrl", "d", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "setPrimaryTrainingCapable", "(Ljava/lang/Boolean;)V", JWKParameterNames.RSA_EXPONENT, "g", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryTrainingCapable")
    private Boolean primaryTrainingCapable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryWearableDevice")
    private Boolean primaryWearableDevice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lhaBackupCapable")
    private final Boolean lhaBackupCapable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private final Integer weight;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            Boolean bool;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                bool = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                bool = null;
            }
            String string = parcel.readString();
            Boolean bool2 = bool;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = bool2;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = bool2;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = bool2;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(lValueOf, string, string2, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? bool2 : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : bool2, (i14 & 32) != 0 ? null : bool3, (i14 & 64) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getLhaBackupCapable() {
        return this.lhaBackupCapable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.deviceId, bVar.deviceId) && s.g(this.displayName, bVar.displayName) && s.g(this.imageUrl, bVar.imageUrl) && s.g(this.primaryTrainingCapable, bVar.primaryTrainingCapable) && s.g(this.primaryWearableDevice, bVar.primaryWearableDevice) && s.g(this.lhaBackupCapable, bVar.lhaBackupCapable) && s.g(this.weight, bVar.weight);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getPrimaryTrainingCapable() {
        return this.primaryTrainingCapable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getPrimaryWearableDevice() {
        return this.primaryWearableDevice;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    public final int hashCode() {
        Long l14 = this.deviceId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.primaryTrainingCapable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.primaryWearableDevice;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.lhaBackupCapable;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.weight;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final void i(Boolean bool) {
        this.primaryWearableDevice = bool;
    }

    public final String toString() {
        Long l14 = this.deviceId;
        String str = this.displayName;
        String str2 = this.imageUrl;
        Boolean bool = this.primaryTrainingCapable;
        Boolean bool2 = this.primaryWearableDevice;
        Boolean bool3 = this.lhaBackupCapable;
        Integer num = this.weight;
        StringBuilder sbJ = b71.i.j("DeviceWeightDTO(deviceId=", ", displayName=", str, l14, ", imageUrl=");
        b71.i.w(sbJ, str2, ", primaryTrainingCapable=", bool, ", primaryWearableDevice=");
        b71.i.o(bool2, bool3, ", lhaBackupCapable=", ", weight=", sbJ);
        return f3.i(sbJ, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.imageUrl);
        Boolean bool = this.primaryTrainingCapable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.primaryWearableDevice;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.lhaBackupCapable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool3);
        }
        Integer num = this.weight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public b(Long l14, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
        this.deviceId = l14;
        this.displayName = str;
        this.imageUrl = str2;
        this.primaryTrainingCapable = bool;
        this.primaryWearableDevice = bool2;
        this.lhaBackupCapable = bool3;
        this.weight = num;
    }

    public b() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
