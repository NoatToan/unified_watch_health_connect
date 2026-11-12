package fq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0014"}, d2 = {"Lfq/b;", "Landroid/os/Parcelable;", "", "exerciseKey", "", "primaryMuscles", "secondaryMuscles", "equipmentKeys", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getPrimaryMuscles", "()Ljava/util/List;", "c", "getSecondaryMuscles", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseKey")
    private final String exerciseKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private final List<String> primaryMuscles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryMuscles")
    private final List<String> secondaryMuscles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("equipmentKeys")
    private final List<String> equipmentKeys;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, List<String> list, List<String> list2, List<String> list3) {
        str.getClass();
        this.exerciseKey = str;
        this.primaryMuscles = list;
        this.secondaryMuscles = list2;
        this.equipmentKeys = list3;
    }

    public final List<String> b() {
        return this.equipmentKeys;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExerciseKey() {
        return this.exerciseKey;
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
        return s.g(this.exerciseKey, bVar.exerciseKey) && s.g(this.primaryMuscles, bVar.primaryMuscles) && s.g(this.secondaryMuscles, bVar.secondaryMuscles) && s.g(this.equipmentKeys, bVar.equipmentKeys);
    }

    public final int hashCode() {
        int iHashCode = this.exerciseKey.hashCode() * 31;
        List<String> list = this.primaryMuscles;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.secondaryMuscles;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.equipmentKeys;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.exerciseKey;
        List<String> list = this.primaryMuscles;
        return j.j(l2.g("ExercisesInCategoryDto(exerciseKey=", str, ", primaryMuscles=", list, ", secondaryMuscles="), this.secondaryMuscles, ", equipmentKeys=", this.equipmentKeys, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.exerciseKey);
        parcel.writeStringList(this.primaryMuscles);
        parcel.writeStringList(this.secondaryMuscles);
        parcel.writeStringList(this.equipmentKeys);
    }
}
