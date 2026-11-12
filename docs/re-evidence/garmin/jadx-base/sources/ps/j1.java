package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lps/j1;", "Landroid/os/Parcelable;", "", "duration", "", "power", "", "activityDate", "", "activityId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "b", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j1 implements Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Integer duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("power")
    private final Double power;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDate")
    private final String activityDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j1> {
        @Override // android.os.Parcelable.Creator
        public final j1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j1(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final j1[] newArray(int i14) {
            return new j1[i14];
        }
    }

    public j1(Integer num, Double d14, String str, Long l14) {
        this.duration = num;
        this.power = d14;
        this.activityDate = str;
        this.activityId = l14;
    }

    public static j1 b(j1 j1Var, Double d14) {
        return new j1(j1Var.duration, d14, j1Var.activityDate, j1Var.activityId);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityDate() {
        return this.activityDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return p005kotlin.jvm.internal.s.g(this.duration, j1Var.duration) && p005kotlin.jvm.internal.s.g(this.power, j1Var.power) && p005kotlin.jvm.internal.s.g(this.activityDate, j1Var.activityDate) && p005kotlin.jvm.internal.s.g(this.activityId, j1Var.activityId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getPower() {
        return this.power;
    }

    public final int hashCode() {
        Integer num = this.duration;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.power;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.activityDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.activityId;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.duration;
        Double d14 = this.power;
        String str = this.activityDate;
        Long l14 = this.activityId;
        StringBuilder sbM = lc.u0.m("PowerCurveEntryDTO(duration=", num, ", power=", d14, ", activityDate=");
        sbM.append(str);
        sbM.append(", activityId=");
        sbM.append(l14);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.power;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.activityDate);
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }
}
