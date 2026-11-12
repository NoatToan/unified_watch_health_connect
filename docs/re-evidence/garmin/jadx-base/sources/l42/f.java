package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b#\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006&"}, d2 = {"Ll42/f;", "Landroid/os/Parcelable;", "Ll42/g;", "weightAverageDto", "", "endDate", "startDate", "", "minWeight", "maxWeight", "weightDelta", "<init>", "(Ll42/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ll42/g;", "g", "()Ll42/g;", "setWeightAverageDto", "(Ll42/g;)V", "b", "Ljava/lang/String;", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "c", "getStartDate", "setStartDate", "d", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "setMinWeight", "(Ljava/lang/Double;)V", JWKParameterNames.RSA_EXPONENT, "setMaxWeight", "h", "setWeightDelta", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f109941g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageWeight")
    private g weightAverageDto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private String startDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minWeight")
    private Double minWeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWeight")
    private Double maxWeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightDelta")
    private Double weightDelta;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f((g) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(g gVar, String str, String str2, Double d14, Double d15, Double d16) {
        gVar.getClass();
        str.getClass();
        str2.getClass();
        this.weightAverageDto = gVar;
        this.endDate = str;
        this.startDate = str2;
        this.minWeight = d14;
        this.maxWeight = d15;
        this.weightDelta = d16;
    }

    public final DateTime b() {
        return g22.k.p(this.endDate, "yyyy-MM-dd", DateTimeZone.getDefault());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getMaxWeight() {
        return this.maxWeight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.weightAverageDto, fVar.weightAverageDto) && s.g(this.endDate, fVar.endDate) && s.g(this.startDate, fVar.startDate) && s.g(this.minWeight, fVar.minWeight) && s.g(this.maxWeight, fVar.maxWeight) && s.g(this.weightDelta, fVar.weightDelta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMinWeight() {
        return this.minWeight;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getWeightAverageDto() {
        return this.weightAverageDto;
    }

    public final DateTime getStartDate() {
        return g22.k.p(this.startDate, "yyyy-MM-dd", DateTimeZone.getDefault());
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getWeightDelta() {
        return this.weightDelta;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.weightAverageDto.hashCode() * 31, 31, this.endDate), 31, this.startDate);
        Double d14 = this.minWeight;
        int iHashCode = (iJ + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.maxWeight;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.weightDelta;
        return iHashCode2 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        g gVar = this.weightAverageDto;
        String str = this.endDate;
        String str2 = this.startDate;
        Double d14 = this.minWeight;
        Double d15 = this.maxWeight;
        Double d16 = this.weightDelta;
        StringBuilder sb3 = new StringBuilder("WeeklyWeightSummary(weightAverageDto=");
        sb3.append(gVar);
        sb3.append(", endDate=");
        sb3.append(str);
        sb3.append(", startDate=");
        b71.i.x(sb3, str2, ", minWeight=", d14, ", maxWeight=");
        return sn.a.f(d15, d16, ", weightDelta=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.weightAverageDto, i14);
        parcel.writeString(this.endDate);
        parcel.writeString(this.startDate);
        Double d14 = this.minWeight;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.maxWeight;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.weightDelta;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }
}
