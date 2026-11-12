package sn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0014"}, d2 = {"Lsn/g;", "Landroid/os/Parcelable;", "", "summaryType", "", "minValue", "maxValue", "avgValue", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "getSummaryType", "()Ljava/lang/String;", "b", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "c", "d", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summaryType")
    private final String summaryType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minValue")
    private final Double minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxValue")
    private final Double maxValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgValue")
    private final Double avgValue;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ g(String str, Double d14, Double d15, Double d16, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getMaxValue() {
        return this.maxValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.summaryType, gVar.summaryType) && s.g(this.minValue, gVar.minValue) && s.g(this.maxValue, gVar.maxValue) && s.g(this.avgValue, gVar.avgValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMinValue() {
        return this.minValue;
    }

    public final boolean g() {
        return u.q(this.summaryType, "HEART_RATE", true);
    }

    public final boolean h() {
        return u.q(this.summaryType, "RESPIRATION", true);
    }

    public final int hashCode() {
        String str = this.summaryType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.minValue;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.maxValue;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.avgValue;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final boolean i() {
        return u.q(this.summaryType, "RMSSD_HRV", true);
    }

    public final boolean j() {
        return u.q(this.summaryType, "SDRR_HRV", true);
    }

    public final boolean k() {
        return u.q(this.summaryType, "SPO2", true);
    }

    public final boolean m() {
        return u.q(this.summaryType, "STRESS", true);
    }

    public final String toString() {
        String str = this.summaryType;
        Double d14 = this.minValue;
        Double d15 = this.maxValue;
        Double d16 = this.avgValue;
        StringBuilder sb3 = new StringBuilder("SummaryTypeDTO(summaryType=");
        sb3.append(str);
        sb3.append(", minValue=");
        sb3.append(d14);
        sb3.append(", maxValue=");
        return sn.a.f(d15, d16, ", avgValue=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.summaryType);
        Double d14 = this.minValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.maxValue;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.avgValue;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lsn/g$a;", "", "<init>", "()V", "", "HEART_RATE", "Ljava/lang/String;", "RESPIRATION", "STRESS", "SPO2", "RMSSD_HRV", "SDRR_HRV", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public g(String str, Double d14, Double d15, Double d16) {
        this.summaryType = str;
        this.minValue = d14;
        this.maxValue = d15;
        this.avgValue = d16;
    }

    public g() {
        this(null, null, null, null, 15, null);
    }
}
