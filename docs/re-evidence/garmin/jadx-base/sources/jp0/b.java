package jp0;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.hydration.model.HydrationContainersAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b\u001b\u0010'\"\u0004\b0\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u00102R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00103¨\u00064"}, d2 = {"Ljp0/b;", "Landroid/os/Parcelable;", "", "userId", "", "calendarDate", "lastEntryTimestampLocal", "", "valueInML", "goalInML", "sweatLossInML", "activityIntakeInML", "baseGoalInML", "hydrationMeasurementUnit", "", "hydrationAutoGoalEnabled", "", "Lop0/a;", "hydrationContainers", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "a", "Ljava/lang/Integer;", "getUserId", "()Ljava/lang/Integer;", "setUserId", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "setCalendarDate", "(Ljava/lang/String;)V", "c", "getLastEntryTimestampLocal", "o", "d", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/Double;)V", JWKParameterNames.RSA_EXPONENT, "f", "m", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "g", JWKParameterNames.OCT_KEY_VALUE, "h", "Ljava/lang/Boolean;", "Ljava/util/List;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private Integer userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastEntryTimestampLocal")
    private String lastEntryTimestampLocal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valueInML")
    private Double valueInML;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalInML")
    private Double goalInML;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sweatLossInML")
    private Double sweatLossInML;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityIntakeInML")
    private Double activityIntakeInML;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseGoalInML")
    private Double baseGoalInML;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationMeasurementUnit")
    private String hydrationMeasurementUnit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationAutoGoalEnabled")
    private Boolean hydrationAutoGoalEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationContainers")
    @JsonAdapter(HydrationContainersAdapterFactory.class)
    private List<op0.a> hydrationContainers;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string3 = parcel.readString();
            int iD = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                while (iD != i14) {
                    iD = u0.d(b.class, parcel, arrayList, iD, 1);
                }
            }
            return new b(numValueOf, string, string2, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, string3, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Integer num, String str, String str2, Double d14, Double d15, Double d16, Double d17, Double d18, String str3, Boolean bool, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : d15, (i14 & 32) != 0 ? null : d16, (i14 & 64) != 0 ? null : d17, (i14 & 128) != 0 ? null : d18, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : bool, (i14 & 1024) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getActivityIntakeInML() {
        return this.activityIntakeInML;
    }

    public final LocalDate d() {
        String str = this.calendarDate;
        if (str != null) {
            return k.w(str, "yyyy-MM-dd");
        }
        return null;
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
        return s.g(this.userId, bVar.userId) && s.g(this.calendarDate, bVar.calendarDate) && s.g(this.lastEntryTimestampLocal, bVar.lastEntryTimestampLocal) && s.g(this.valueInML, bVar.valueInML) && s.g(this.goalInML, bVar.goalInML) && s.g(this.sweatLossInML, bVar.sweatLossInML) && s.g(this.activityIntakeInML, bVar.activityIntakeInML) && s.g(this.baseGoalInML, bVar.baseGoalInML) && s.g(this.hydrationMeasurementUnit, bVar.hydrationMeasurementUnit) && s.g(this.hydrationAutoGoalEnabled, bVar.hydrationAutoGoalEnabled) && s.g(this.hydrationContainers, bVar.hydrationContainers);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getGoalInML() {
        return this.goalInML;
    }

    public final op0.c g() {
        return new op0.c(this.hydrationMeasurementUnit, this.baseGoalInML, this.hydrationAutoGoalEnabled, this.hydrationContainers);
    }

    public final DateTime h() {
        String str = this.lastEntryTimestampLocal;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    public final int hashCode() {
        Integer num = this.userId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.calendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastEntryTimestampLocal;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.valueInML;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.goalInML;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.sweatLossInML;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.activityIntakeInML;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.baseGoalInML;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        String str3 = this.hydrationMeasurementUnit;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hydrationAutoGoalEnabled;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<op0.a> list = this.hydrationContainers;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getSweatLossInML() {
        return this.sweatLossInML;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getValueInML() {
        return this.valueInML;
    }

    public final void k(Double d14) {
        this.activityIntakeInML = d14;
    }

    public final void m(Double d14) {
        this.goalInML = d14;
    }

    public final void o(String str) {
        this.lastEntryTimestampLocal = str;
    }

    public final void q(Double d14) {
        this.sweatLossInML = d14;
    }

    public final void r(Double d14) {
        this.valueInML = d14;
    }

    public final String toString() {
        Integer num = this.userId;
        String str = this.calendarDate;
        String str2 = this.lastEntryTimestampLocal;
        Double d14 = this.valueInML;
        Double d15 = this.goalInML;
        Double d16 = this.sweatLossInML;
        Double d17 = this.activityIntakeInML;
        Double d18 = this.baseGoalInML;
        String str3 = this.hydrationMeasurementUnit;
        Boolean bool = this.hydrationAutoGoalEnabled;
        List<op0.a> list = this.hydrationContainers;
        StringBuilder sbF = l2.f("HydrationDataDTO(userId=", num, ", calendarDate=", str, ", lastEntryTimestampLocal=");
        i.x(sbF, str2, ", valueInML=", d14, ", goalInML=");
        i.p(d15, d16, ", sweatLossInML=", ", activityIntakeInML=", sbF);
        i.p(d17, d18, ", baseGoalInML=", ", hydrationMeasurementUnit=", sbF);
        i.w(sbF, str3, ", hydrationAutoGoalEnabled=", bool, ", hydrationContainers=");
        return z.c(sbF, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.userId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.calendarDate);
        parcel.writeString(this.lastEntryTimestampLocal);
        Double d14 = this.valueInML;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.goalInML;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.sweatLossInML;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.activityIntakeInML;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.baseGoalInML;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        parcel.writeString(this.hydrationMeasurementUnit);
        Boolean bool = this.hydrationAutoGoalEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<op0.a> list = this.hydrationContainers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    public b(Integer num, String str, String str2, Double d14, Double d15, Double d16, Double d17, Double d18, String str3, Boolean bool, List<op0.a> list) {
        this.userId = num;
        this.calendarDate = str;
        this.lastEntryTimestampLocal = str2;
        this.valueInML = d14;
        this.goalInML = d15;
        this.sweatLossInML = d16;
        this.activityIntakeInML = d17;
        this.baseGoalInML = d18;
        this.hydrationMeasurementUnit = str3;
        this.hydrationAutoGoalEnabled = bool;
        this.hydrationContainers = list;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
