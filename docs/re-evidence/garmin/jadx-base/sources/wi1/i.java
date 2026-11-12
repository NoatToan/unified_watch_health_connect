package wi1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b!\u0010\u0016¨\u0006\""}, d2 = {"Lwi1/i;", "Landroid/os/Parcelable;", "", "userProfilePk", "", "distance", "", "unitKey", "pushes", "pushLength", "<init>", "(Ljava/lang/Integer;DLjava/lang/String;Ljava/lang/Integer;D)V", "a", "Ljava/lang/Integer;", "getUserProfilePk", "()Ljava/lang/Integer;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/lang/Integer;)V", "b", "D", "()D", "j", "(D)V", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUnitKey", "(Ljava/lang/String;)V", "d", "f", "m", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.OCT_KEY_VALUE, "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private Integer userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private double distance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitKey")
    private String unitKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushes")
    private Integer pushes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushLength")
    private double pushLength;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer num;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                num = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            double d14 = parcel.readDouble();
            Integer numValueOf2 = num;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new i(numValueOf, d14, string, numValueOf2, parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(Integer num, double d14, String str, Integer num2, double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? Double.NaN : d14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? Double.NaN : d15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getPushLength() {
        return this.pushLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.userProfilePk, iVar.userProfilePk) && Double.compare(this.distance, iVar.distance) == 0 && s.g(this.unitKey, iVar.unitKey) && s.g(this.pushes, iVar.pushes) && Double.compare(this.pushLength, iVar.pushLength) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getPushes() {
        return this.pushes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnitKey() {
        return this.unitKey;
    }

    public final boolean h() {
        return this.userProfilePk == null && Double.isNaN(this.distance) && this.unitKey == null && this.pushes == null && Double.isNaN(this.pushLength);
    }

    public final int hashCode() {
        Integer num = this.userProfilePk;
        int iB = org.apache.commons.lang3.e.b((num == null ? 0 : num.hashCode()) * 31, 31, this.distance);
        String str = this.unitKey;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.pushes;
        return Double.hashCode(this.pushLength) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return s.g(this.unitKey, "foot");
    }

    public final void j(double d14) {
        this.distance = d14;
    }

    public final void k(double d14) {
        this.pushLength = d14;
    }

    public final void m(Integer num) {
        this.pushes = num;
    }

    public final void o(int i14) {
        this.unitKey = i14 == 0 ? "foot" : "meter";
    }

    public final void q(Integer num) {
        this.userProfilePk = num;
    }

    public final String toString() {
        Integer num = this.userProfilePk;
        double d14 = this.distance;
        String str = this.unitKey;
        Integer num2 = this.pushes;
        double d15 = this.pushLength;
        StringBuilder sb3 = new StringBuilder("PushLengthDTO(userProfilePk=");
        sb3.append(num);
        sb3.append(", distance=");
        sb3.append(d14);
        sb3.append(", unitKey=");
        sb3.append(str);
        sb3.append(", pushes=");
        sb3.append(num2);
        return am.j.r(sb3, ", pushLength=", d15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.userProfilePk;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeDouble(this.distance);
        parcel.writeString(this.unitKey);
        Integer num2 = this.pushes;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeDouble(this.pushLength);
    }

    public i(Integer num, double d14, String str, Integer num2, double d15) {
        this.userProfilePk = num;
        this.distance = d14;
        this.unitKey = str;
        this.pushes = num2;
        this.pushLength = d15;
    }

    public i() {
        this(null, 0.0d, null, null, 0.0d, 31, null);
    }
}
