package j12;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj12/b;", "Landroid/os/Parcelable;", "", "totalActivities", "", "totalDistance", "<init>", "(ID)V", "a", "I", "b", "()I", "setTotalActivities", "(I)V", "D", "d", "()D", "setTotalDistance", "(D)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalActivities")
    private int totalActivities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDistance")
    private double totalDistance;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, double d14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0.0d : d14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalActivities() {
        return this.totalActivities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getTotalDistance() {
        return this.totalDistance;
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
        return this.totalActivities == bVar.totalActivities && Double.compare(this.totalDistance, bVar.totalDistance) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.totalDistance) + (Integer.hashCode(this.totalActivities) * 31);
    }

    public final String toString() {
        return "ActivitiesGoalDTO(totalActivities=" + this.totalActivities + ", totalDistance=" + this.totalDistance + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.totalActivities);
        parcel.writeDouble(this.totalDistance);
    }

    public b(int i14, double d14) {
        this.totalActivities = i14;
        this.totalDistance = d14;
    }

    public b() {
        this(0, 0.0d, 3, null);
    }
}
