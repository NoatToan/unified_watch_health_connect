package l42;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Ll42/b;", "Landroid/os/Parcelable;", "Ll42/c;", "latestWeight", "", "maxWeight", "minWeight", "", "numberOfWeightEntries", "", "summaryDate", "<init>", "(Ll42/c;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;)V", "a", "Ll42/c;", "f", "()Ll42/c;", "setLatestWeight", "(Ll42/c;)V", "b", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "setMaxWeight", "(Ljava/lang/Double;)V", "c", IntegerTokenConverter.CONVERTER_KEY, "setMinWeight", "d", "I", "j", "()I", "setNumberOfWeightEntries", "(I)V", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "setSummaryDate", "(Ljava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f109915f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestWeight")
    private c latestWeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWeight")
    private Double maxWeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minWeight")
    private Double minWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numOfWeightEntries")
    private int numberOfWeightEntries;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summaryDate")
    private String summaryDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b((c) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(c cVar, Double d14, Double d15, int i14, String str) {
        str.getClass();
        this.latestWeight = cVar;
        this.maxWeight = d14;
        this.minWeight = d15;
        this.numberOfWeightEntries = i14;
        this.summaryDate = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getLatestWeight() {
        return this.latestWeight;
    }

    public final DateTime d() {
        return g22.k.p(this.summaryDate, "yyyy-MM-dd", DateTimeZone.getDefault());
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
        return s.g(this.latestWeight, bVar.latestWeight) && s.g(this.maxWeight, bVar.maxWeight) && s.g(this.minWeight, bVar.minWeight) && this.numberOfWeightEntries == bVar.numberOfWeightEntries && s.g(this.summaryDate, bVar.summaryDate);
    }

    public final c f() {
        return this.latestWeight;
    }

    public final LocalDate g() {
        return g22.k.w(this.summaryDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getMaxWeight() {
        return this.maxWeight;
    }

    public final int hashCode() {
        c cVar = this.latestWeight;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        Double d14 = this.maxWeight;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.minWeight;
        return this.summaryDate.hashCode() + q2.d(this.numberOfWeightEntries, (iHashCode2 + (d15 != null ? d15.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getMinWeight() {
        return this.minWeight;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getNumberOfWeightEntries() {
        return this.numberOfWeightEntries;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSummaryDate() {
        return this.summaryDate;
    }

    public final String toString() {
        c cVar = this.latestWeight;
        Double d14 = this.maxWeight;
        Double d15 = this.minWeight;
        int i14 = this.numberOfWeightEntries;
        String str = this.summaryDate;
        StringBuilder sb3 = new StringBuilder("DailyWeightSummary(latestWeight=");
        sb3.append(cVar);
        sb3.append(", maxWeight=");
        sb3.append(d14);
        sb3.append(", minWeight=");
        sb3.append(d15);
        sb3.append(", numberOfWeightEntries=");
        sb3.append(i14);
        sb3.append(", summaryDate=");
        return am.j.o(str, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.latestWeight, i14);
        Double d14 = this.maxWeight;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.minWeight;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeInt(this.numberOfWeightEntries);
        parcel.writeString(this.summaryDate);
    }
}
