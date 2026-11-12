package rm1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrm1/g;", "Landroid/os/Parcelable;", "", "userProfilePk", "", "calendarDate", "", "avgDeviationCelsius", "avgDeviationFahrenheit", "avg7DayDeviationCelsius", "avg7DayDeviationFahrenheit", "", "calibrationDays", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f153559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f153561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f153562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f153563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f153564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f153565g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Long lValueOf;
            Double d14;
            Double d15;
            Integer numValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                d14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                d14 = null;
            }
            String string = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                Double d16 = dValueOf4;
                numValueOf = d14;
                d15 = d16;
            } else {
                d15 = dValueOf4;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new g(lValueOf, string, dValueOf, dValueOf2, dValueOf3, d15, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(Long l14, String str, Double d14, Double d15, Double d16, Double d17, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : num);
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
        return s.g(this.f153559a, gVar.f153559a) && s.g(this.f153560b, gVar.f153560b) && s.g(this.f153561c, gVar.f153561c) && s.g(this.f153562d, gVar.f153562d) && s.g(this.f153563e, gVar.f153563e) && s.g(this.f153564f, gVar.f153564f) && s.g(this.f153565g, gVar.f153565g);
    }

    public final int hashCode() {
        Long l14 = this.f153559a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f153560b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.f153561c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f153562d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f153563e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f153564f;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num = this.f153565g;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("SkinTempSummary(userProfilePk=", ", calendarDate=", this.f153560b, this.f153559a, ", avgDeviationCelsius=");
        b71.i.p(this.f153561c, this.f153562d, ", avgDeviationFahrenheit=", ", avg7DayDeviationCelsius=", sbJ);
        b71.i.p(this.f153563e, this.f153564f, ", avg7DayDeviationFahrenheit=", ", calibrationDays=", sbJ);
        return f3.i(sbJ, this.f153565g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f153559a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f153560b);
        Double d14 = this.f153561c;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f153562d;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f153563e;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.f153564f;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Integer num = this.f153565g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public g(Long l14, String str, Double d14, Double d15, Double d16, Double d17, Integer num) {
        this.f153559a = l14;
        this.f153560b = str;
        this.f153561c = d14;
        this.f153562d = d15;
        this.f153563e = d16;
        this.f153564f = d17;
        this.f153565g = num;
    }

    public g() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
