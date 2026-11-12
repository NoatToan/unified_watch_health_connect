package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lps/s1;", "Landroid/os/Parcelable;", "", "factor", "", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "", "unitId", "unitKey", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "getFactor", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getUnitId", "()Ljava/lang/Integer;", "d", "getUnitKey", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s1 implements Parcelable {
    public static final Parcelable.Creator<s1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("factor")
    private final Double factor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.TIME_ZONE)
    private final String timeZone;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final Integer unitId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitKey")
    private final String unitKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s1> {
        @Override // android.os.Parcelable.Creator
        public final s1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s1(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final s1[] newArray(int i14) {
            return new s1[i14];
        }
    }

    public /* synthetic */ s1(Double d14, String str, Integer num, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return p005kotlin.jvm.internal.s.g(this.factor, s1Var.factor) && p005kotlin.jvm.internal.s.g(this.timeZone, s1Var.timeZone) && p005kotlin.jvm.internal.s.g(this.unitId, s1Var.unitId) && p005kotlin.jvm.internal.s.g(this.unitKey, s1Var.unitKey);
    }

    public final int hashCode() {
        Double d14 = this.factor;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.timeZone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.unitId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.unitKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TimezoneUnitDTO(factor=" + this.factor + ", timeZone=" + this.timeZone + ", unitId=" + this.unitId + ", unitKey=" + this.unitKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.factor;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.timeZone);
        Integer num = this.unitId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.unitKey);
    }

    public s1(Double d14, String str, Integer num, String str2) {
        this.factor = d14;
        this.timeZone = str;
        this.unitId = num;
        this.unitKey = str2;
    }

    public s1() {
        this(null, null, null, null, 15, null);
    }
}
