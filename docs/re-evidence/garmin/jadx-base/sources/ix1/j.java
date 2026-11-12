package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lix1/j;", "Landroid/os/Parcelable;", "", "order", "", "benchmark", "category", "exerciseName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "I", "getOrder", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "f", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("order")
    private final int order;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmark")
    private final String benchmark;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseName")
    private final String exerciseName;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(int i14, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.order = i14;
        this.benchmark = str;
        this.category = str2;
        this.exerciseName = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBenchmark() {
        return this.benchmark;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategory() {
        return this.category;
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
        return this.order == jVar.order && s.g(this.benchmark, jVar.benchmark) && s.g(this.category, jVar.category) && s.g(this.exerciseName, jVar.exerciseName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int hashCode() {
        return this.exerciseName.hashCode() + wr.g.j(wr.g.j(Integer.hashCode(this.order) * 31, 31, this.benchmark), 31, this.category);
    }

    public final String toString() {
        int i14 = this.order;
        String str = this.benchmark;
        return e5.h(wr.g.r(i14, "StrengthTrainingPlanSecondaryExerciseDTO(order=", ", benchmark=", str, ", category="), this.category, ", exerciseName=", this.exerciseName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.order);
        parcel.writeString(this.benchmark);
        parcel.writeString(this.category);
        parcel.writeString(this.exerciseName);
    }
}
