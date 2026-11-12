package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import c53.c0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.g0;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgs1/q;", "Landroid/os/Parcelable;", "Lgs1/q$b;", "payload", "<init>", "(Lgs1/q$b;)V", "a", "Lgs1/q$b;", "b", "()Lgs1/q$b;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final b payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getPayload() {
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
        return (obj instanceof q) && p005kotlin.jvm.internal.s.g(this.payload, ((q) obj).payload);
    }

    public final int hashCode() {
        b bVar = this.payload;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Spo2DailyAcclimationDTO(payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.payload;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public q(b bVar) {
        this.payload = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001f\u0010/R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R0\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00101\u001a\u0004\b5\u00103\"\u0004\b6\u00107R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b8\u00103R0\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b-\u00103\"\u0004\b:\u00107R(\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103¨\u0006<"}, d2 = {"Lgs1/q$b;", "Landroid/os/Parcelable;", "", "userProfilePk", "calendarDate", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "", "latestSpo2Value", "latestSpo2ValueReadingTimeGmt", "latestSpo2ValueReadingTimeLocal", "", "averageSpo2Value", "", "Lgs1/p;", "spo2AccValueDescriptorDTOList", "", "spo2ValuesArrayInternal", "Lgs1/n;", "monitoringEnvironmentValueDescriptorDTOList", "monitoringEnvironmentValuesArray", "", "spO2SingleValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getUserProfilePk", "()Ljava/lang/String;", "b", "d", "c", "m", "getEndTimestampGMT", JWKParameterNames.RSA_EXPONENT, "getStartTimestampLocal", "f", "getEndTimestampLocal", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Double;", "()Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/util/List;", "getSpo2AccValueDescriptorDTOList", "()Ljava/util/List;", "l", "getSpo2ValuesArrayInternal", "setSpo2ValuesArrayInternal", "(Ljava/util/List;)V", "getMonitoringEnvironmentValueDescriptorDTOList", JWKParameterNames.RSA_MODULUS, "o", "getSpO2SingleValues", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("userProfilePk")
        private final String userProfilePk;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("calendarDate")
        private final String calendarDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("startTimestampGMT")
        private final String startTimestampGMT;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("endTimestampGMT")
        private final String endTimestampGMT;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("startTimestampLocal")
        private final String startTimestampLocal;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("endTimestampLocal")
        private final String endTimestampLocal;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("latestSpo2Value")
        private final Integer latestSpo2Value;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("latestSpo2ValueReadingTimeGmt")
        private final String latestSpo2ValueReadingTimeGmt;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("latestSpo2ValueReadingTimeLocal")
        private final String latestSpo2ValueReadingTimeLocal;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageSpo2Value")
        private final Double averageSpo2Value;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @SerializedName("spo2AccValueDescriptorList")
        private final List<p> spo2AccValueDescriptorDTOList;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @SerializedName("spo2ValuesArray")
        private List<? extends List<Long>> spo2ValuesArrayInternal;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @SerializedName("monitoringEnvironmentValueDescriptorList")
        private final List<n> monitoringEnvironmentValueDescriptorDTOList;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @SerializedName("monitoringEnvironmentValuesArray")
        private List<? extends List<Double>> monitoringEnvironmentValuesArray;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("spO2SingleValues")
        private final List<List<Object>> spO2SingleValues;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v3 */
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Integer numValueOf;
                Double d14;
                ?? arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                    d14 = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                    d14 = null;
                }
                String string7 = parcel.readString();
                Double d15 = d14;
                String string8 = parcel.readString();
                Double dValueOf = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
                if (parcel.readInt() == 0) {
                    arrayList = d15;
                } else {
                    int i14 = parcel.readInt();
                    arrayList = new ArrayList(i14);
                    int iA = 0;
                    while (iA != i14) {
                        iA = kg.f.a(p.CREATOR, parcel, arrayList, iA, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i15 = parcel.readInt();
                    arrayList2 = new ArrayList(i15);
                    int i16 = 0;
                    while (i16 != i15) {
                        int i17 = parcel.readInt();
                        String str = string;
                        ArrayList arrayList6 = new ArrayList(i17);
                        String str2 = string2;
                        for (int i18 = 0; i18 != i17; i18++) {
                            arrayList6.add(Long.valueOf(parcel.readLong()));
                        }
                        arrayList2.add(arrayList6);
                        i16++;
                        string = str;
                        string2 = str2;
                    }
                }
                String str3 = string;
                String str4 = string2;
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i19 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(i19);
                    int iA2 = 0;
                    while (iA2 != i19) {
                        iA2 = kg.f.a(n.CREATOR, parcel, arrayList7, iA2, 1);
                    }
                    arrayList3 = arrayList7;
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i24 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(i24);
                    int i25 = 0;
                    while (i25 != i24) {
                        int i26 = parcel.readInt();
                        int i27 = i24;
                        ArrayList arrayList9 = new ArrayList(i26);
                        String str5 = string3;
                        for (int i28 = 0; i28 != i26; i28++) {
                            arrayList9.add(Double.valueOf(parcel.readDouble()));
                        }
                        arrayList8.add(arrayList9);
                        i25++;
                        i24 = i27;
                        string3 = str5;
                    }
                    arrayList4 = arrayList8;
                }
                String str6 = string3;
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int i29 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(i29);
                    int i30 = 0;
                    while (i30 != i29) {
                        int i34 = parcel.readInt();
                        int i35 = i29;
                        ArrayList arrayList11 = new ArrayList(i34);
                        int i36 = i30;
                        for (int i37 = 0; i37 != i34; i37++) {
                            arrayList11.add(parcel.readValue(b.class.getClassLoader()));
                        }
                        arrayList10.add(arrayList11);
                        i30 = i36 + 1;
                        i29 = i35;
                    }
                    arrayList5 = arrayList10;
                }
                return new b(str3, str4, str6, string4, string5, string6, numValueOf, string7, string8, dValueOf, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Double d14, List list, List list2, List list3, List list4, List list5, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : d14, (i14 & 1024) != 0 ? null : list, (i14 & 2048) != 0 ? null : list2, (i14 & 4096) != 0 ? null : list3, (i14 & 8192) != 0 ? null : list4, (i14 & 16384) != 0 ? null : list5);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getAverageSpo2Value() {
            return this.averageSpo2Value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCalendarDate() {
            return this.calendarDate;
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
            return p005kotlin.jvm.internal.s.g(this.userProfilePk, bVar.userProfilePk) && p005kotlin.jvm.internal.s.g(this.calendarDate, bVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.startTimestampGMT, bVar.startTimestampGMT) && p005kotlin.jvm.internal.s.g(this.endTimestampGMT, bVar.endTimestampGMT) && p005kotlin.jvm.internal.s.g(this.startTimestampLocal, bVar.startTimestampLocal) && p005kotlin.jvm.internal.s.g(this.endTimestampLocal, bVar.endTimestampLocal) && p005kotlin.jvm.internal.s.g(this.latestSpo2Value, bVar.latestSpo2Value) && p005kotlin.jvm.internal.s.g(this.latestSpo2ValueReadingTimeGmt, bVar.latestSpo2ValueReadingTimeGmt) && p005kotlin.jvm.internal.s.g(this.latestSpo2ValueReadingTimeLocal, bVar.latestSpo2ValueReadingTimeLocal) && p005kotlin.jvm.internal.s.g(this.averageSpo2Value, bVar.averageSpo2Value) && p005kotlin.jvm.internal.s.g(this.spo2AccValueDescriptorDTOList, bVar.spo2AccValueDescriptorDTOList) && p005kotlin.jvm.internal.s.g(this.spo2ValuesArrayInternal, bVar.spo2ValuesArrayInternal) && p005kotlin.jvm.internal.s.g(this.monitoringEnvironmentValueDescriptorDTOList, bVar.monitoringEnvironmentValueDescriptorDTOList) && p005kotlin.jvm.internal.s.g(this.monitoringEnvironmentValuesArray, bVar.monitoringEnvironmentValuesArray) && p005kotlin.jvm.internal.s.g(this.spO2SingleValues, bVar.spO2SingleValues);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getLatestSpo2Value() {
            return this.latestSpo2Value;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getLatestSpo2ValueReadingTimeGmt() {
            return this.latestSpo2ValueReadingTimeGmt;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLatestSpo2ValueReadingTimeLocal() {
            return this.latestSpo2ValueReadingTimeLocal;
        }

        public final int hashCode() {
            String str = this.userProfilePk;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.calendarDate;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.startTimestampGMT;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.endTimestampGMT;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.startTimestampLocal;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.endTimestampLocal;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.latestSpo2Value;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str7 = this.latestSpo2ValueReadingTimeGmt;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.latestSpo2ValueReadingTimeLocal;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Double d14 = this.averageSpo2Value;
            int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
            List<p> list = this.spo2AccValueDescriptorDTOList;
            int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
            List<? extends List<Long>> list2 = this.spo2ValuesArrayInternal;
            int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<n> list3 = this.monitoringEnvironmentValueDescriptorDTOList;
            int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<? extends List<Double>> list4 = this.monitoringEnvironmentValuesArray;
            int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<List<Object>> list5 = this.spO2SingleValues;
            return iHashCode14 + (list5 != null ? list5.hashCode() : 0);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0046  */
        /* JADX WARN: Code duplicated, block: B:32:0x0073  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
        public final ArrayList i() {
            Integer numB;
            Integer numB2;
            y yVar;
            Object next;
            Object next2;
            List<? extends List<Double>> list = this.monitoringEnvironmentValuesArray;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                List<n> list3 = this.monitoringEnvironmentValueDescriptorDTOList;
                if (list3 != null) {
                    Iterator<T> it3 = list3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((n) next2).getMonEnvValueDescKey(), "timestamp"));
                    n nVar = (n) next2;
                    if (nVar != null) {
                        numB = nVar.getMonEnvValueDescIndex();
                    } else {
                        numB = null;
                    }
                } else {
                    numB = null;
                }
                List<n> list4 = this.monitoringEnvironmentValueDescriptorDTOList;
                if (list4 != null) {
                    Iterator<T> it4 = list4.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!p005kotlin.jvm.internal.s.g(((n) next).getMonEnvValueDescKey(), "monitoringEnvironmentLevel"));
                    n nVar2 = (n) next;
                    if (nVar2 != null) {
                        numB2 = nVar2.getMonEnvValueDescIndex();
                    } else {
                        numB2 = null;
                    }
                } else {
                    numB2 = null;
                }
                if (numB == null || numB2 == null) {
                    yVar = null;
                } else {
                    Double dF = d53.s.f(String.valueOf(((Number) list2.get(numB.intValue())).doubleValue()));
                    Long lValueOf = dF != null ? Long.valueOf((long) dF.doubleValue()) : null;
                    Double dF2 = d53.s.f(String.valueOf(((Number) list2.get(numB2.intValue())).doubleValue()));
                    if (lValueOf == null || dF2 == null) {
                        yVar = null;
                    } else {
                        yVar = new y(lValueOf.longValue(), dF2.doubleValue());
                    }
                }
                if (yVar != null) {
                    arrayList.add(yVar);
                }
            }
            return arrayList;
        }

        public final List<List<Double>> j() {
            return this.monitoringEnvironmentValuesArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<List<Long>> k() {
            int i14;
            Object next;
            List<List<Object>> list = this.spO2SingleValues;
            List list2 = this.spo2ValuesArrayInternal;
            if (list == null) {
                return list2;
            }
            c53.g gVarP = c0.p(c0.h(new g0(list), new g11.e(24)), new g11.e(25));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c53.g.a aVar = new c53.g.a(gVarP);
            while (true) {
                i14 = 0;
                if (!aVar.hasNext()) {
                    break;
                }
                Object next2 = aVar.next();
                DateTime dateTime = (DateTime) ((o13.p) next2).f128594a;
                dateTime.getClass();
                DateTime dateTimeWithMillisOfSecond = dateTime.withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
                dateTimeWithMillisOfSecond.getClass();
                Object arrayList = linkedHashMap.get(dateTimeWithMillisOfSecond);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(dateTimeWithMillisOfSecond, arrayList);
                }
                ((List) arrayList).add(next2);
            }
            ArrayList<o13.p> arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                double dLongValue = 0.0d;
                if (!it.hasNext()) {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                    for (o13.p pVar : arrayList2) {
                        arrayList3.add(p13.x.k(pVar.f128594a, pVar.f128595b));
                    }
                    List<List<Long>> listB1 = h0.b1(arrayList3);
                    if (list2 == null) {
                        return listB1;
                    }
                    ArrayList arrayList4 = new ArrayList(list2);
                    Iterator<T> it3 = listB1.iterator();
                    while (it3.hasNext()) {
                        List list3 = (List) it3.next();
                        Iterator it4 = arrayList4.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (((Number) ((List) next).get(i14)).longValue() != ((Number) list3.get(i14)).longValue());
                        List list4 = (List) next;
                        ArrayList arrayList5 = list4 != null ? new ArrayList(list4) : null;
                        if (arrayList5 != null) {
                            Long[] lArr = new Long[2];
                            lArr[i14] = arrayList5.get(1);
                            lArr[1] = list3.get(1);
                            int i15 = i14;
                            int i16 = i15;
                            double dLongValue2 = 0.0d;
                            while (i15 < 2) {
                                dLongValue2 += lArr[i15].longValue();
                                i16++;
                                i15++;
                            }
                            arrayList5.set(1, Long.valueOf((long) (i16 == 0 ? Double.NaN : dLongValue2 / ((double) i16))));
                        } else {
                            arrayList4.add(list3);
                        }
                        i14 = 0;
                    }
                    if (arrayList4.size() > 1) {
                        p13.c0.u(arrayList4, new r());
                    }
                    return arrayList4;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Long lValueOf = Long.valueOf(((DateTime) entry.getKey()).getMillis());
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList6 = new ArrayList(p13.y.r(iterable, 10));
                Iterator it5 = iterable.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(Long.valueOf(((Number) ((o13.p) it5.next()).f128595b).longValue()));
                }
                Iterator it6 = arrayList6.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    dLongValue += ((Number) it6.next()).longValue();
                    i17++;
                    if (i17 < 0) {
                        p13.x.p();
                        throw null;
                    }
                }
                arrayList2.add(new o13.p(lValueOf, Long.valueOf((long) (i17 == 0 ? Double.NaN : dLongValue / ((double) i17)))));
            }
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getStartTimestampGMT() {
            return this.startTimestampGMT;
        }

        public final void o(List<? extends List<Double>> list) {
            this.monitoringEnvironmentValuesArray = list;
        }

        public final void q(List<? extends List<Long>> list) {
            this.spo2ValuesArrayInternal = list;
        }

        public final String toString() {
            String str = this.userProfilePk;
            String str2 = this.calendarDate;
            String str3 = this.startTimestampGMT;
            String str4 = this.endTimestampGMT;
            String str5 = this.startTimestampLocal;
            String str6 = this.endTimestampLocal;
            Integer num = this.latestSpo2Value;
            String str7 = this.latestSpo2ValueReadingTimeGmt;
            String str8 = this.latestSpo2ValueReadingTimeLocal;
            Double d14 = this.averageSpo2Value;
            List<p> list = this.spo2AccValueDescriptorDTOList;
            List<? extends List<Long>> list2 = this.spo2ValuesArrayInternal;
            List<n> list3 = this.monitoringEnvironmentValueDescriptorDTOList;
            List<? extends List<Double>> list4 = this.monitoringEnvironmentValuesArray;
            List<List<Object>> list5 = this.spO2SingleValues;
            StringBuilder sbI = p6.b.i("Payload(userProfilePk=", str, ", calendarDate=", str2, ", startTimestampGMT=");
            sn.a.t(sbI, str3, ", endTimestampGMT=", str4, ", startTimestampLocal=");
            sn.a.t(sbI, str5, ", endTimestampLocal=", str6, ", latestSpo2Value=");
            p6.b.l(num, ", latestSpo2ValueReadingTimeGmt=", str7, ", latestSpo2ValueReadingTimeLocal=", sbI);
            b71.i.x(sbI, str8, ", averageSpo2Value=", d14, ", spo2AccValueDescriptorDTOList=");
            n23.j.z(sbI, list, ", spo2ValuesArrayInternal=", list2, ", monitoringEnvironmentValueDescriptorDTOList=");
            n23.j.z(sbI, list3, ", monitoringEnvironmentValuesArray=", list4, ", spO2SingleValues=");
            return u62.z.c(sbI, list5, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.userProfilePk);
            parcel.writeString(this.calendarDate);
            parcel.writeString(this.startTimestampGMT);
            parcel.writeString(this.endTimestampGMT);
            parcel.writeString(this.startTimestampLocal);
            parcel.writeString(this.endTimestampLocal);
            Integer num = this.latestSpo2Value;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            parcel.writeString(this.latestSpo2ValueReadingTimeGmt);
            parcel.writeString(this.latestSpo2ValueReadingTimeLocal);
            Double d14 = this.averageSpo2Value;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            List<p> list = this.spo2AccValueDescriptorDTOList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO = u0.o(parcel, list, 1);
                while (itO.hasNext()) {
                    ((p) itO.next()).writeToParcel(parcel, i14);
                }
            }
            List<? extends List<Long>> list2 = this.spo2ValuesArrayInternal;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO2 = u0.o(parcel, list2, 1);
                while (itO2.hasNext()) {
                    Iterator itE = kg.f.e((List) itO2.next(), parcel);
                    while (itE.hasNext()) {
                        parcel.writeLong(((Number) itE.next()).longValue());
                    }
                }
            }
            List<n> list3 = this.monitoringEnvironmentValueDescriptorDTOList;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO3 = u0.o(parcel, list3, 1);
                while (itO3.hasNext()) {
                    ((n) itO3.next()).writeToParcel(parcel, i14);
                }
            }
            List<? extends List<Double>> list4 = this.monitoringEnvironmentValuesArray;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO4 = u0.o(parcel, list4, 1);
                while (itO4.hasNext()) {
                    Iterator itE2 = kg.f.e((List) itO4.next(), parcel);
                    while (itE2.hasNext()) {
                        parcel.writeDouble(((Number) itE2.next()).doubleValue());
                    }
                }
            }
            List<List<Object>> list5 = this.spO2SingleValues;
            if (list5 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                Iterator itE3 = kg.f.e((List) itO5.next(), parcel);
                while (itE3.hasNext()) {
                    parcel.writeValue(itE3.next());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Double d14, List<p> list, List<? extends List<Long>> list2, List<n> list3, List<? extends List<Double>> list4, List<? extends List<? extends Object>> list5) {
            this.userProfilePk = str;
            this.calendarDate = str2;
            this.startTimestampGMT = str3;
            this.endTimestampGMT = str4;
            this.startTimestampLocal = str5;
            this.endTimestampLocal = str6;
            this.latestSpo2Value = num;
            this.latestSpo2ValueReadingTimeGmt = str7;
            this.latestSpo2ValueReadingTimeLocal = str8;
            this.averageSpo2Value = d14;
            this.spo2AccValueDescriptorDTOList = list;
            this.spo2ValuesArrayInternal = list2;
            this.monitoringEnvironmentValueDescriptorDTOList = list3;
            this.monitoringEnvironmentValuesArray = list4;
            this.spO2SingleValues = list5;
        }

        public b() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }
}
