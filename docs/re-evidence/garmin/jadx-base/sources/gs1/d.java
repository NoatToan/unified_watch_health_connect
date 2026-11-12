package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\n\bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgs1/d;", "Landroid/os/Parcelable;", "Lgs1/d$c;", "payload", "<init>", "(Lgs1/d$c;)V", "a", "Lgs1/d$c;", "b", "()Lgs1/d$c;", "c", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final c payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getPayload() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.payload, ((d) obj).payload);
    }

    public final int hashCode() {
        c cVar = this.payload;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "AllDayHeartRateDTO(payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        c cVar = this.payload;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
    }

    public d(c cVar) {
        this.payload = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgs1/d$b;", "", "Lorg/joda/time/DateTime;", "dateTime", "", "heartRate", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;)V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f78713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f78714b;

        public /* synthetic */ b(DateTime dateTime, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f78713a, bVar.f78713a) && p005kotlin.jvm.internal.s.g(this.f78714b, bVar.f78714b);
        }

        public final int hashCode() {
            DateTime dateTime = this.f78713a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            Integer num = this.f78714b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "HeartRateValue(dateTime=" + this.f78713a + ", heartRate=" + this.f78714b + ")";
        }

        public b(DateTime dateTime, Integer num) {
            this.f78713a = dateTime;
            this.f78714b = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\n\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR$\u0010\f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Lgs1/d$c;", "Landroid/os/Parcelable;", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "", "maxHeartRate", "minHeartRate", "restingHeartRate", "", "", "heartRateValues", "abnormalHRValuesArray", "abnormalHrThresholdValue", "lowAbnormalHrThresholdValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "b", "getStartTimestampGMT", "c", "getEndTimestampGMT", "d", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "f", "j", "g", "Ljava/util/List;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("calendarDate")
        private final String calendarDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("startTimestampGMT")
        private final String startTimestampGMT;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("endTimestampGMT")
        private final String endTimestampGMT;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("maxHeartRate")
        private final Integer maxHeartRate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("minHeartRate")
        private final Integer minHeartRate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingHeartRate")
        private final Integer restingHeartRate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("heartRateValues")
        private final List<List<Long>> heartRateValues;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("abnormalHRValuesArray")
        private final List<List<Long>> abnormalHRValuesArray;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("abnormalHrThresholdValue")
        private final Integer abnormalHrThresholdValue;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @SerializedName("lowAbnormalHrThresholdValue")
        private final Integer lowAbnormalHrThresholdValue;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList f78725k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ArrayList f78726l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DateTime f78727m;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i14 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        int i16 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i16);
                        for (int i17 = 0; i17 != i16; i17++) {
                            arrayList4.add(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                        }
                        arrayList3.add(arrayList4);
                    }
                    arrayList = arrayList3;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i18 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i18);
                    for (int i19 = 0; i19 != i18; i19++) {
                        int i24 = parcel.readInt();
                        ArrayList arrayList6 = new ArrayList(i24);
                        for (int i25 = 0; i25 != i24; i25++) {
                            arrayList6.add(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                        }
                        arrayList5.add(arrayList6);
                    }
                    arrayList2 = arrayList5;
                }
                return new c(string, string2, string3, numValueOf, numValueOf2, numValueOf3, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public /* synthetic */ c(String str, String str2, String str3, Integer num, Integer num2, Integer num3, List list, List list2, Integer num4, Integer num5, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : list2, (i14 & 256) != 0 ? null : num4, (i14 & 512) != 0 ? null : num5);
        }

        public final List<b> b() {
            if (this.f78726l == null) {
                List<List<Long>> list = this.abnormalHRValuesArray;
                ArrayList arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = (List) it.next();
                        j0 j0Var = j0.f23099a;
                        Long l14 = (Long) list2.get(0);
                        j0Var.getClass();
                        DateTime dateTimeB = j0.B(l14);
                        Long l15 = (Long) list2.get(1);
                        arrayList2.add(new b(dateTimeB, l15 != null ? Integer.valueOf((int) l15.longValue()) : null));
                    }
                    arrayList = arrayList2;
                }
                this.f78726l = arrayList;
            }
            return this.f78726l;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getAbnormalHrThresholdValue() {
            return this.abnormalHrThresholdValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.calendarDate, cVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.startTimestampGMT, cVar.startTimestampGMT) && p005kotlin.jvm.internal.s.g(this.endTimestampGMT, cVar.endTimestampGMT) && p005kotlin.jvm.internal.s.g(this.maxHeartRate, cVar.maxHeartRate) && p005kotlin.jvm.internal.s.g(this.minHeartRate, cVar.minHeartRate) && p005kotlin.jvm.internal.s.g(this.restingHeartRate, cVar.restingHeartRate) && p005kotlin.jvm.internal.s.g(this.heartRateValues, cVar.heartRateValues) && p005kotlin.jvm.internal.s.g(this.abnormalHRValuesArray, cVar.abnormalHRValuesArray) && p005kotlin.jvm.internal.s.g(this.abnormalHrThresholdValue, cVar.abnormalHrThresholdValue) && p005kotlin.jvm.internal.s.g(this.lowAbnormalHrThresholdValue, cVar.lowAbnormalHrThresholdValue);
        }

        public final List<b> f() {
            if (this.f78725k == null) {
                List<List<Long>> list = this.heartRateValues;
                ArrayList arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = (List) it.next();
                        j0 j0Var = j0.f23099a;
                        Long l14 = (Long) list2.get(0);
                        j0Var.getClass();
                        DateTime dateTimeB = j0.B(l14);
                        Long l15 = (Long) h0.e0(1, list2);
                        arrayList2.add(new b(dateTimeB, l15 != null ? Integer.valueOf((int) l15.longValue()) : null));
                    }
                    arrayList = arrayList2;
                }
                this.f78725k = arrayList;
            }
            return this.f78725k;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getLowAbnormalHrThresholdValue() {
            return this.lowAbnormalHrThresholdValue;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Integer getMaxHeartRate() {
            return this.maxHeartRate;
        }

        public final int hashCode() {
            String str = this.calendarDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.startTimestampGMT;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endTimestampGMT;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.maxHeartRate;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minHeartRate;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.restingHeartRate;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<List<Long>> list = this.heartRateValues;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<List<Long>> list2 = this.abnormalHRValuesArray;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num4 = this.abnormalHrThresholdValue;
            int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.lowAbnormalHrThresholdValue;
            return iHashCode9 + (num5 != null ? num5.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getMinHeartRate() {
            return this.minHeartRate;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getRestingHeartRate() {
            return this.restingHeartRate;
        }

        public final DateTime k() {
            if (this.f78727m == null) {
                this.f78727m = j0.N(this.startTimestampGMT, true);
            }
            return this.f78727m;
        }

        public final String toString() {
            String str = this.calendarDate;
            String str2 = this.startTimestampGMT;
            String str3 = this.endTimestampGMT;
            Integer num = this.maxHeartRate;
            Integer num2 = this.minHeartRate;
            Integer num3 = this.restingHeartRate;
            List<List<Long>> list = this.heartRateValues;
            List<List<Long>> list2 = this.abnormalHRValuesArray;
            Integer num4 = this.abnormalHrThresholdValue;
            Integer num5 = this.lowAbnormalHrThresholdValue;
            StringBuilder sbI = p6.b.i("Payload(calendarDate=", str, ", startTimestampGMT=", str2, ", endTimestampGMT=");
            fb1.c.u(num, str3, ", maxHeartRate=", ", minHeartRate=", sbI);
            j20.x.m(sbI, num2, ", restingHeartRate=", num3, ", heartRateValues=");
            n23.j.z(sbI, list, ", abnormalHRValuesArray=", list2, ", abnormalHrThresholdValue=");
            return b71.i.h(sbI, num4, ", lowAbnormalHrThresholdValue=", num5, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.calendarDate);
            parcel.writeString(this.startTimestampGMT);
            parcel.writeString(this.endTimestampGMT);
            Integer num = this.maxHeartRate;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Integer num2 = this.minHeartRate;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            Integer num3 = this.restingHeartRate;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num3);
            }
            List<List<Long>> list = this.heartRateValues;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO = u0.o(parcel, list, 1);
                while (itO.hasNext()) {
                    Iterator itE = kg.f.e((List) itO.next(), parcel);
                    while (itE.hasNext()) {
                        Long l14 = (Long) itE.next();
                        if (l14 == null) {
                            parcel.writeInt(0);
                        } else {
                            sn.a.n(parcel, 1, l14);
                        }
                    }
                }
            }
            List<List<Long>> list2 = this.abnormalHRValuesArray;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO2 = u0.o(parcel, list2, 1);
                while (itO2.hasNext()) {
                    Iterator itE2 = kg.f.e((List) itO2.next(), parcel);
                    while (itE2.hasNext()) {
                        Long l15 = (Long) itE2.next();
                        if (l15 == null) {
                            parcel.writeInt(0);
                        } else {
                            sn.a.n(parcel, 1, l15);
                        }
                    }
                }
            }
            Integer num4 = this.abnormalHrThresholdValue;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num4);
            }
            Integer num5 = this.lowAbnormalHrThresholdValue;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num5);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, String str3, Integer num, Integer num2, Integer num3, List<? extends List<Long>> list, List<? extends List<Long>> list2, Integer num4, Integer num5) {
            this.calendarDate = str;
            this.startTimestampGMT = str2;
            this.endTimestampGMT = str3;
            this.maxHeartRate = num;
            this.minHeartRate = num2;
            this.restingHeartRate = num3;
            this.heartRateValues = list;
            this.abnormalHRValuesArray = list2;
            this.abnormalHrThresholdValue = num4;
            this.lowAbnormalHrThresholdValue = num5;
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
    }
}
