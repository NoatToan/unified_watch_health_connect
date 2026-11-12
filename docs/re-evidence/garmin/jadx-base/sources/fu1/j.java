package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfu1/j;", "Landroid/os/Parcelable;", "", "suggestedPlanTypeId", "suggestedRaceTime", "", "suggestedWorkoutPlanId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "c", "Ljava/lang/Long;", "getSuggestedWorkoutPlanId", "()Ljava/lang/Long;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedPlanTypeId")
    private final Integer suggestedPlanTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedRaceTime")
    private final Integer suggestedRaceTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedWorkoutPlanId")
    private final Long suggestedWorkoutPlanId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(Integer num, Integer num2, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getSuggestedPlanTypeId() {
        return this.suggestedPlanTypeId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSuggestedRaceTime() {
        return this.suggestedRaceTime;
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
        return p005kotlin.jvm.internal.s.g(this.suggestedPlanTypeId, jVar.suggestedPlanTypeId) && p005kotlin.jvm.internal.s.g(this.suggestedRaceTime, jVar.suggestedRaceTime) && p005kotlin.jvm.internal.s.g(this.suggestedWorkoutPlanId, jVar.suggestedWorkoutPlanId);
    }

    public final int hashCode() {
        Integer num = this.suggestedPlanTypeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.suggestedRaceTime;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.suggestedWorkoutPlanId;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.suggestedPlanTypeId;
        Integer num2 = this.suggestedRaceTime;
        return p6.b.g(com.airbnb.lottie.animation.keyframe.a.l(num, "CoachCautionDTO(suggestedPlanTypeId=", ", suggestedRaceTime=", ", suggestedWorkoutPlanId=", num2), this.suggestedWorkoutPlanId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.suggestedPlanTypeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.suggestedRaceTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Long l14 = this.suggestedWorkoutPlanId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public j(Integer num, Integer num2, Long l14) {
        this.suggestedPlanTypeId = num;
        this.suggestedRaceTime = num2;
        this.suggestedWorkoutPlanId = l14;
    }

    public j() {
        this(null, null, null, 7, null);
    }
}
