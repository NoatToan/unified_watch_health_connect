package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lps/v1;", "Landroid/os/Parcelable;", "", "", "latitudes", "longitudes", "timestamps", "Lps/v1$b;", "typedSplits", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "f", "c", "g", "h", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v1 implements Parcelable {
    public static final Parcelable.Creator<v1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitudes")
    private final List<Double> latitudes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitudes")
    private final List<Double> longitudes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamps")
    private final List<Double> timestamps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typedSplits")
    private final List<b> typedSplits;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v1> {
        @Override // android.os.Parcelable.Creator
        public final v1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            int iA = 0;
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList2.add(Double.valueOf(parcel.readDouble()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList3.add(Double.valueOf(parcel.readDouble()));
            }
            int i18 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                arrayList4.add(Double.valueOf(parcel.readDouble()));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i24);
                while (iA != i24) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList5, iA, 1);
                }
                arrayList = arrayList5;
            }
            return new v1(arrayList2, arrayList3, arrayList4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final v1[] newArray(int i14) {
            return new v1[i14];
        }
    }

    public v1(List<Double> list, List<Double> list2, List<Double> list3, List<b> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.latitudes = list;
        this.longitudes = list2;
        this.timestamps = list3;
        this.typedSplits = list4;
    }

    public static v1 b(v1 v1Var, ArrayList arrayList) {
        List<Double> list = v1Var.latitudes;
        List<Double> list2 = v1Var.longitudes;
        List<Double> list3 = v1Var.timestamps;
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new v1(list, list2, list3, arrayList);
    }

    public final List<Double> d() {
        return this.latitudes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return p005kotlin.jvm.internal.s.g(this.latitudes, v1Var.latitudes) && p005kotlin.jvm.internal.s.g(this.longitudes, v1Var.longitudes) && p005kotlin.jvm.internal.s.g(this.timestamps, v1Var.timestamps) && p005kotlin.jvm.internal.s.g(this.typedSplits, v1Var.typedSplits);
    }

    public final List<Double> f() {
        return this.longitudes;
    }

    public final List<Double> g() {
        return this.timestamps;
    }

    public final List<b> h() {
        return this.typedSplits;
    }

    public final int hashCode() {
        int iB = lc.u0.b(lc.u0.b(this.latitudes.hashCode() * 31, 31, this.longitudes), 31, this.timestamps);
        List<b> list = this.typedSplits;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List<Double> list = this.latitudes;
        List<Double> list2 = this.longitudes;
        return n23.j.j(f3.k("TrackLogDMO(latitudes=", ", longitudes=", ", timestamps=", list, list2), this.timestamps, ", typedSplits=", this.typedSplits, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.latitudes, parcel);
        while (itE.hasNext()) {
            parcel.writeDouble(((Number) itE.next()).doubleValue());
        }
        Iterator itE2 = kg.f.e(this.longitudes, parcel);
        while (itE2.hasNext()) {
            parcel.writeDouble(((Number) itE2.next()).doubleValue());
        }
        Iterator itE3 = kg.f.e(this.timestamps, parcel);
        while (itE3.hasNext()) {
            parcel.writeDouble(((Number) itE3.next()).doubleValue());
        }
        List<b> list = this.typedSplits;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = lc.u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((b) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ v1(List list, List list2, List list3, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, list3, (i14 & 8) != 0 ? null : list4);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lps/v1$b;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "", "duration", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Double;)V", "a", "Lorg/joda/time/DateTime;", "f", "()Lorg/joda/time/DateTime;", "setStartDateTime", "(Lorg/joda/time/DateTime;)V", "b", "d", "setEndDateTime", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setDuration", "(Ljava/lang/Double;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("startTimeGMT")
        @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
        private DateTime startDateTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("endTimeGMT")
        @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
        private DateTime endDateTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("duration")
        private Double duration;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b((DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(DateTime dateTime, DateTime dateTime2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : dateTime2, (i14 & 4) != 0 ? Double.valueOf(0.0d) : d14);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DateTime getEndDateTime() {
            return this.endDateTime;
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
            return p005kotlin.jvm.internal.s.g(this.startDateTime, bVar.startDateTime) && p005kotlin.jvm.internal.s.g(this.endDateTime, bVar.endDateTime) && p005kotlin.jvm.internal.s.g(this.duration, bVar.duration);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final DateTime getStartDateTime() {
            return this.startDateTime;
        }

        public final int hashCode() {
            DateTime dateTime = this.startDateTime;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            DateTime dateTime2 = this.endDateTime;
            int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
            Double d14 = this.duration;
            return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            DateTime dateTime = this.startDateTime;
            DateTime dateTime2 = this.endDateTime;
            Double d14 = this.duration;
            StringBuilder sb3 = new StringBuilder("TypedSplitDMO(startDateTime=");
            sb3.append(dateTime);
            sb3.append(", endDateTime=");
            sb3.append(dateTime2);
            sb3.append(", duration=");
            return b71.i.g(sb3, d14, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeSerializable(this.startDateTime);
            parcel.writeSerializable(this.endDateTime);
            Double d14 = this.duration;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
        }

        public b(DateTime dateTime, DateTime dateTime2, Double d14) {
            this.startDateTime = dateTime;
            this.endDateTime = dateTime2;
            this.duration = d14;
        }

        public b() {
            this(null, null, null, 7, null);
        }
    }
}
