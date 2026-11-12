package j52;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lj52/m;", "Landroid/os/Parcelable;", "", "weekNum", "", "lowWeightGoalInGrams", "highWeightGoalInGrams", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "setWeekNum", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "setLowWeightGoalInGrams", "(Ljava/lang/Double;)V", "c", "setHighWeightGoalInGrams", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weekNum")
    private Integer weekNum;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowWeightGoalInGrams")
    private Double lowWeightGoalInGrams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highWeightGoalInGrams")
    private Double highWeightGoalInGrams;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(Integer num, Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getHighWeightGoalInGrams() {
        return this.highWeightGoalInGrams;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getLowWeightGoalInGrams() {
        return this.lowWeightGoalInGrams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.weekNum, mVar.weekNum) && s.g(this.lowWeightGoalInGrams, mVar.lowWeightGoalInGrams) && s.g(this.highWeightGoalInGrams, mVar.highWeightGoalInGrams);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getWeekNum() {
        return this.weekNum;
    }

    public final int hashCode() {
        Integer num = this.weekNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.lowWeightGoalInGrams;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.highWeightGoalInGrams;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.weekNum;
        Double d14 = this.lowWeightGoalInGrams;
        return b71.i.g(u0.m("WeightGoalRangeDTO(weekNum=", num, ", lowWeightGoalInGrams=", d14, ", highWeightGoalInGrams="), this.highWeightGoalInGrams, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.weekNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.lowWeightGoalInGrams;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.highWeightGoalInGrams;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
    }

    public m(Integer num, Double d14, Double d15) {
        this.weekNum = num;
        this.lowWeightGoalInGrams = d14;
        this.highWeightGoalInGrams = d15;
    }

    public m() {
        this(null, null, null, 7, null);
    }
}
