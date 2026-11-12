package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lps/q0;", "Landroid/os/Parcelable;", "", "category", "exerciseName", "", "probability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "c", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String exerciseName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("probability")
    private final Double probability;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q0> {
        @Override // android.os.Parcelable.Creator
        public final q0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q0(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final q0[] newArray(int i14) {
            return new q0[i14];
        }
    }

    public /* synthetic */ q0(String str, String str2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : d14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p005kotlin.jvm.internal.s.g(this.category, q0Var.category) && p005kotlin.jvm.internal.s.g(this.exerciseName, q0Var.exerciseName) && p005kotlin.jvm.internal.s.g(this.probability, q0Var.probability);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getProbability() {
        return this.probability;
    }

    public final int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.exerciseName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.probability;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.category;
        String str2 = this.exerciseName;
        return b71.i.g(p6.b.i("ExerciseDTO(category=", str, ", exerciseName=", str2, ", probability="), this.probability, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.category);
        parcel.writeString(this.exerciseName);
        Double d14 = this.probability;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    public q0(String str, String str2, Double d14) {
        this.category = str;
        this.exerciseName = str2;
        this.probability = d14;
    }

    public q0() {
        this(null, null, null, 7, null);
    }
}
