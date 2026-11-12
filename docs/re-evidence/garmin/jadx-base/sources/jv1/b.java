package jv1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljv1/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "Ljv1/a0;", "sport", "Ljv1/c;", "adaptiveCoachingWorkoutType", "<init>", "(Ljava/lang/Integer;Ljv1/a0;Ljv1/c;)V", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "b", "Ljv1/a0;", "d", "()Ljv1/a0;", "c", "Ljv1/c;", "()Ljv1/c;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Integer userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private final a0 sport;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adaptiveCoachingWorkoutType")
    private final c adaptiveCoachingWorkoutType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : a0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Integer num, a0 a0Var, c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : a0Var, (i14 & 4) != 0 ? null : cVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getAdaptiveCoachingWorkoutType() {
        return this.adaptiveCoachingWorkoutType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a0 getSport() {
        return this.sport;
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
        return p005kotlin.jvm.internal.s.g(this.userProfilePk, bVar.userProfilePk) && this.sport == bVar.sport && this.adaptiveCoachingWorkoutType == bVar.adaptiveCoachingWorkoutType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getUserProfilePk() {
        return this.userProfilePk;
    }

    public final int hashCode() {
        Integer num = this.userProfilePk;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        a0 a0Var = this.sport;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        c cVar = this.adaptiveCoachingWorkoutType;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdaptiveCoachingWorkoutDTO(userProfilePk=" + this.userProfilePk + ", sport=" + this.sport + ", adaptiveCoachingWorkoutType=" + this.adaptiveCoachingWorkoutType + ")";
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
        a0 a0Var = this.sport;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var.writeToParcel(parcel, i14);
        }
        c cVar = this.adaptiveCoachingWorkoutType;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
    }

    public b(Integer num, a0 a0Var, c cVar) {
        this.userProfilePk = num;
        this.sport = a0Var;
        this.adaptiveCoachingWorkoutType = cVar;
    }

    public b() {
        this(null, null, null, 7, null);
    }
}
