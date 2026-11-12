package na1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import g22.k;
import kg.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lna1/a;", "Landroid/os/Parcelable;", "", "duration", "power", "", "activityId", "", "_activityDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "b", "g", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "Ljava/lang/String;", "get_activityDate", "()Ljava/lang/String;", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2412a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Integer duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("power")
    private final Integer power;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDate")
    private final String _activityDate;

    /* JADX INFO: renamed from: na1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2412a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Integer num, Integer num2, Long l14, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : str);
    }

    public final LocalDate b() {
        return k.w(this._activityDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.duration, aVar.duration) && s.g(this.power, aVar.power) && s.g(this.activityId, aVar.activityId) && s.g(this._activityDate, aVar._activityDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getPower() {
        return this.power;
    }

    public final int hashCode() {
        Integer num = this.duration;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.power;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.activityId;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this._activityDate;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.duration;
        Integer num2 = this.power;
        Long l14 = this.activityId;
        String str = this._activityDate;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "PowerCurveEntryDTO(duration=", ", power=", ", activityId=", num2);
        sbL.append(l14);
        sbL.append(", _activityDate=");
        sbL.append(str);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Integer num2 = this.power;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this._activityDate);
    }

    public a(Integer num, Integer num2, Long l14, String str) {
        this.duration = num;
        this.power = num2;
        this.activityId = l14;
        this._activityDate = str;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
