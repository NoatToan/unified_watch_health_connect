package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lps/g1;", "Landroid/os/Parcelable;", "", "totalIntervals", "", "totalTime", "minHR", "avgHR", "maxHR", "totalDistance", "longestDistance", "avgVelocity", "maxVelocity", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Integer;", "b", "Ljava/lang/Double;", "m", "()Ljava/lang/Double;", "c", IntegerTokenConverter.CONVERTER_KEY, "d", JWKParameterNames.RSA_EXPONENT, "g", "f", "j", "h", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g1 implements Parcelable {
    public static final Parcelable.Creator<g1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalIntervals")
    private final Integer totalIntervals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalTime")
    private final Double totalTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minHR")
    private final Double minHR;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgHR")
    private final Double avgHR;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxHR")
    private final Double maxHR;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDistance")
    private final Double totalDistance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestDistance")
    private final Double longestDistance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgVelocity")
    private final Double avgVelocity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxVelocity")
    private final Double maxVelocity;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g1> {
        @Override // android.os.Parcelable.Creator
        public final g1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g1(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g1[] newArray(int i14) {
            return new g1[i14];
        }
    }

    public /* synthetic */ g1(Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17, (i14 & 32) != 0 ? null : d18, (i14 & 64) != 0 ? null : d19, (i14 & 128) != 0 ? null : d24, (i14 & 256) != 0 ? null : d25);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAvgHR() {
        return this.avgHR;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAvgVelocity() {
        return this.avgVelocity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return p005kotlin.jvm.internal.s.g(this.totalIntervals, g1Var.totalIntervals) && p005kotlin.jvm.internal.s.g(this.totalTime, g1Var.totalTime) && p005kotlin.jvm.internal.s.g(this.minHR, g1Var.minHR) && p005kotlin.jvm.internal.s.g(this.avgHR, g1Var.avgHR) && p005kotlin.jvm.internal.s.g(this.maxHR, g1Var.maxHR) && p005kotlin.jvm.internal.s.g(this.totalDistance, g1Var.totalDistance) && p005kotlin.jvm.internal.s.g(this.longestDistance, g1Var.longestDistance) && p005kotlin.jvm.internal.s.g(this.avgVelocity, g1Var.avgVelocity) && p005kotlin.jvm.internal.s.g(this.maxVelocity, g1Var.maxVelocity);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getLongestDistance() {
        return this.longestDistance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getMaxHR() {
        return this.maxHR;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getMaxVelocity() {
        return this.maxVelocity;
    }

    public final int hashCode() {
        Integer num = this.totalIntervals;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.totalTime;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.minHR;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.avgHR;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.maxHR;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.totalDistance;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.longestDistance;
        int iHashCode7 = (iHashCode6 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.avgVelocity;
        int iHashCode8 = (iHashCode7 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.maxVelocity;
        return iHashCode8 + (d25 != null ? d25.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getMinHR() {
        return this.minHR;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getTotalIntervals() {
        return this.totalIntervals;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getTotalTime() {
        return this.totalTime;
    }

    public final String toString() {
        Integer num = this.totalIntervals;
        Double d14 = this.totalTime;
        Double d15 = this.minHR;
        Double d16 = this.avgHR;
        Double d17 = this.maxHR;
        Double d18 = this.totalDistance;
        Double d19 = this.longestDistance;
        Double d24 = this.avgVelocity;
        Double d25 = this.maxVelocity;
        StringBuilder sbM = lc.u0.m("PoolApneaIntervalSummary(totalIntervals=", num, ", totalTime=", d14, ", minHR=");
        b71.i.p(d15, d16, ", avgHR=", ", maxHR=", sbM);
        b71.i.p(d17, d18, ", totalDistance=", ", longestDistance=", sbM);
        b71.i.p(d19, d24, ", avgVelocity=", ", maxVelocity=", sbM);
        return b71.i.g(sbM, d25, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.totalIntervals;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.totalTime;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.minHR;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.avgHR;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.maxHR;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.totalDistance;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.longestDistance;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.avgVelocity;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.maxVelocity;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
    }

    public g1(Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25) {
        this.totalIntervals = num;
        this.totalTime = d14;
        this.minHR = d15;
        this.avgHR = d16;
        this.maxHR = d17;
        this.totalDistance = d18;
        this.longestDistance = d19;
        this.avgVelocity = d24;
        this.maxVelocity = d25;
    }

    public g1() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
