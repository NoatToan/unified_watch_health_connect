package j12;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.roomorama.caldroid.CaldroidFragment;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eBO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b#\u0010\u001eR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001e¨\u0006("}, d2 = {"Lj12/e;", "Landroid/os/Parcelable;", "", CaldroidFragment.MONTH, "", "totalRunningActivities", "", "totalRunningDistance", "totalCyclingActivities", "totalCyclingDistance", "totalSwimmingActivities", "totalSwimmingDistance", "<init>", "(Ljava/lang/String;IDIDID)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setMonth", "(Ljava/lang/String;)V", "I", "getTotalRunningActivities", "()I", "setTotalRunningActivities", "(I)V", "c", "D", "f", "()D", "setTotalRunningDistance", "(D)V", "d", "getTotalCyclingActivities", "setTotalCyclingActivities", JWKParameterNames.RSA_EXPONENT, "setTotalCyclingDistance", "getTotalSwimmingActivities", "setTotalSwimmingActivities", "g", "setTotalSwimmingDistance", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(CaldroidFragment.MONTH)
    private String month;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalRunningActivities")
    private int totalRunningActivities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalRunningDistance")
    private double totalRunningDistance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCyclingActivities")
    private int totalCyclingActivities;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCyclingDistance")
    private double totalCyclingDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSwimmingActivities")
    private int totalSwimmingActivities;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSwimmingDistance")
    private double totalSwimmingDistance;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ e(String str, int i14, double d14, int i15, double d15, int i16, double d16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? 0.0d : d14, (i17 & 8) != 0 ? 0 : i15, (i17 & 16) != 0 ? 0.0d : d15, (i17 & 32) != 0 ? 0 : i16, (i17 & 64) != 0 ? 0.0d : d16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getTotalCyclingDistance() {
        return this.totalCyclingDistance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.month, eVar.month) && this.totalRunningActivities == eVar.totalRunningActivities && Double.compare(this.totalRunningDistance, eVar.totalRunningDistance) == 0 && this.totalCyclingActivities == eVar.totalCyclingActivities && Double.compare(this.totalCyclingDistance, eVar.totalCyclingDistance) == 0 && this.totalSwimmingActivities == eVar.totalSwimmingActivities && Double.compare(this.totalSwimmingDistance, eVar.totalSwimmingDistance) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getTotalRunningDistance() {
        return this.totalRunningDistance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getTotalSwimmingDistance() {
        return this.totalSwimmingDistance;
    }

    public final int hashCode() {
        String str = this.month;
        return Double.hashCode(this.totalSwimmingDistance) + q2.d(this.totalSwimmingActivities, org.apache.commons.lang3.e.b(q2.d(this.totalCyclingActivities, org.apache.commons.lang3.e.b(q2.d(this.totalRunningActivities, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.totalRunningDistance), 31), 31, this.totalCyclingDistance), 31);
    }

    public final String toString() {
        String str = this.month;
        int i14 = this.totalRunningActivities;
        double d14 = this.totalRunningDistance;
        int i15 = this.totalCyclingActivities;
        double d15 = this.totalCyclingDistance;
        int i16 = this.totalSwimmingActivities;
        double d16 = this.totalSwimmingDistance;
        StringBuilder sbK = androidx.core.view.j.k(i14, "PastMonthsStatisticsDTO(month=", str, ", totalRunningActivities=", ", totalRunningDistance=");
        sbK.append(d14);
        sbK.append(", totalCyclingActivities=");
        sbK.append(i15);
        am.j.x(sbK, ", totalCyclingDistance=", d15, ", totalSwimmingActivities=");
        sbK.append(i16);
        sbK.append(", totalSwimmingDistance=");
        sbK.append(d16);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.month);
        parcel.writeInt(this.totalRunningActivities);
        parcel.writeDouble(this.totalRunningDistance);
        parcel.writeInt(this.totalCyclingActivities);
        parcel.writeDouble(this.totalCyclingDistance);
        parcel.writeInt(this.totalSwimmingActivities);
        parcel.writeDouble(this.totalSwimmingDistance);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj12/e$a;", "", "<init>", "()V", "", "MONTH_FORMAT", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(String str, int i14, double d14, int i15, double d15, int i16, double d16) {
        this.month = str;
        this.totalRunningActivities = i14;
        this.totalRunningDistance = d14;
        this.totalCyclingActivities = i15;
        this.totalCyclingDistance = d15;
        this.totalSwimmingActivities = i16;
        this.totalSwimmingDistance = d16;
    }

    public e() {
        this(null, 0, 0.0d, 0, 0.0d, 0, 0.0d, 127, null);
    }
}
