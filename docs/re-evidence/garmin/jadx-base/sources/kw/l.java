package kw;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b.\u0010\u0017R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lkw/l;", "Landroid/os/Parcelable;", "", "startDate", "endDate", "", "highSystolic", "highDiastolic", "lowSystolic", "lowDiastolic", "", "numberOfMeasurements", "categoryName", "", "Lpw/a;", "measurements", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "setStartDate", "(Ljava/lang/String;)V", "b", "d", "setEndDate", "c", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "setHighSystolic", "(Ljava/lang/Double;)V", "g", "setHighDiastolic", JWKParameterNames.RSA_EXPONENT, "j", "setLowSystolic", "f", IntegerTokenConverter.CONVERTER_KEY, "setLowDiastolic", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "setNumberOfMeasurements", "(Ljava/lang/Integer;)V", "setCategoryName", "Ljava/util/List;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/util/List;", "setMeasurements", "(Ljava/util/List;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private String startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highSystolic")
    private Double highSystolic;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highDiastolic")
    private Double highDiastolic;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowSystolic")
    private Double lowSystolic;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowDiastolic")
    private Double lowDiastolic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numOfMeasurements")
    private Integer numberOfMeasurements;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categoryName")
    private String categoryName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurements")
    private List<pw.a> measurements;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(l.class, parcel, arrayList, iD, 1);
                }
            }
            return new l(string, string2, dValueOf, dValueOf2, dValueOf3, dValueOf4, numValueOf, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(String str, String str2, Double d14, Double d15, Double d16, Double d17, Integer num, String str3, List<pw.a> list) {
        this.startDate = str;
        this.endDate = str2;
        this.highSystolic = d14;
        this.highDiastolic = d15;
        this.lowSystolic = d16;
        this.lowDiastolic = d17;
        this.numberOfMeasurements = num;
        this.categoryName = str3;
        this.measurements = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.startDate, lVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, lVar.endDate) && p005kotlin.jvm.internal.s.g(this.highSystolic, lVar.highSystolic) && p005kotlin.jvm.internal.s.g(this.highDiastolic, lVar.highDiastolic) && p005kotlin.jvm.internal.s.g(this.lowSystolic, lVar.lowSystolic) && p005kotlin.jvm.internal.s.g(this.lowDiastolic, lVar.lowDiastolic) && p005kotlin.jvm.internal.s.g(this.numberOfMeasurements, lVar.numberOfMeasurements) && p005kotlin.jvm.internal.s.g(this.categoryName, lVar.categoryName) && p005kotlin.jvm.internal.s.g(this.measurements, lVar.measurements);
    }

    public final DateTime f() {
        String str = this.endDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", DateTimeZone.getDefault());
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getHighDiastolic() {
        return this.highDiastolic;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getHighSystolic() {
        return this.highSystolic;
    }

    public final int hashCode() {
        String str = this.startDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.highSystolic;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.highDiastolic;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.lowSystolic;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.lowDiastolic;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num = this.numberOfMeasurements;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.categoryName;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<pw.a> list = this.measurements;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getLowDiastolic() {
        return this.lowDiastolic;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getLowSystolic() {
        return this.lowSystolic;
    }

    public final List<pw.a> k() {
        return this.measurements;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getNumberOfMeasurements() {
        return this.numberOfMeasurements;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final DateTime q() {
        String str = this.startDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", DateTimeZone.getDefault());
        }
        return null;
    }

    public final String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        Double d14 = this.highSystolic;
        Double d15 = this.highDiastolic;
        Double d16 = this.lowSystolic;
        Double d17 = this.lowDiastolic;
        Integer num = this.numberOfMeasurements;
        String str3 = this.categoryName;
        List<pw.a> list = this.measurements;
        StringBuilder sbI = p6.b.i("BloodPressureSummaryDTO(startDate=", str, ", endDate=", str2, ", highSystolic=");
        b71.i.p(d14, d15, ", highDiastolic=", ", lowSystolic=", sbI);
        b71.i.p(d16, d17, ", lowDiastolic=", ", numberOfMeasurements=", sbI);
        p6.b.l(num, ", categoryName=", str3, ", measurements=", sbI);
        return z.c(sbI, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        Double d14 = this.highSystolic;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.highDiastolic;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.lowSystolic;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.lowDiastolic;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Integer num = this.numberOfMeasurements;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.categoryName);
        List<pw.a> list = this.measurements;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }
}
