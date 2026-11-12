package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Ltw1/d;", "Landroid/os/Parcelable;", "", "levelKey", "levelName", "", "avgWorkoutHoursPerWeek", "workoutsPerWeekMin", "workoutsPerWeekMax", "<init>", "(Ljava/lang/String;Ljava/lang/String;III)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "getLevelName", "c", "I", "()I", "g", JWKParameterNames.RSA_EXPONENT, "f", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelKey")
    private final String levelKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelName")
    private final String levelName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgWorkoutHoursPerWeek")
    private final int avgWorkoutHoursPerWeek;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutsPerWeekMin")
    private final int workoutsPerWeekMin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutsPerWeekMax")
    private final int workoutsPerWeekMax;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public d(String str, String str2, int i14, int i15, int i16) {
        str.getClass();
        this.levelKey = str;
        this.levelName = str2;
        this.avgWorkoutHoursPerWeek = i14;
        this.workoutsPerWeekMin = i15;
        this.workoutsPerWeekMax = i16;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvgWorkoutHoursPerWeek() {
        return this.avgWorkoutHoursPerWeek;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLevelKey() {
        return this.levelKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.levelKey, dVar.levelKey) && p005kotlin.jvm.internal.s.g(this.levelName, dVar.levelName) && this.avgWorkoutHoursPerWeek == dVar.avgWorkoutHoursPerWeek && this.workoutsPerWeekMin == dVar.workoutsPerWeekMin && this.workoutsPerWeekMax == dVar.workoutsPerWeekMax;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWorkoutsPerWeekMax() {
        return this.workoutsPerWeekMax;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getWorkoutsPerWeekMin() {
        return this.workoutsPerWeekMin;
    }

    public final int hashCode() {
        int iHashCode = this.levelKey.hashCode() * 31;
        String str = this.levelName;
        return Integer.hashCode(this.workoutsPerWeekMax) + q2.d(this.workoutsPerWeekMin, q2.d(this.avgWorkoutHoursPerWeek, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        String str = this.levelKey;
        String str2 = this.levelName;
        int i14 = this.avgWorkoutHoursPerWeek;
        int i15 = this.workoutsPerWeekMin;
        int i16 = this.workoutsPerWeekMax;
        StringBuilder sbI = p6.b.i("LevelDTO(levelKey=", str, ", levelName=", str2, ", avgWorkoutHoursPerWeek=");
        e0.m(i14, i15, ", workoutsPerWeekMin=", ", workoutsPerWeekMax=", sbI);
        return am.j.q(sbI, i16, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.levelKey);
        parcel.writeString(this.levelName);
        parcel.writeInt(this.avgWorkoutHoursPerWeek);
        parcel.writeInt(this.workoutsPerWeekMin);
        parcel.writeInt(this.workoutsPerWeekMax);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltw1/d$a;", "", "<init>", "()V", "", "ADVANCED_LEVEL_KEY", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, String str2, int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(str, (i17 & 2) != 0 ? null : str2, i14, i15, i16);
    }
}
