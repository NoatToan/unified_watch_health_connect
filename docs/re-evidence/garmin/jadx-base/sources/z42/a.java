package z42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz42/a;", "Landroid/os/Parcelable;", "", "Lz42/e;", "values", "Lz42/a$b;", "aggregations", "<init>", "(Ljava/util/List;Lz42/a$b;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lz42/a$b;", "()Lz42/a$b;", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3771a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final List<e> values;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aggregations")
    private final b aggregations;

    /* JADX INFO: renamed from: z42.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3771a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(e.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(arrayList, parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List list, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getAggregations() {
        return this.aggregations;
    }

    public final List<e> d() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.values, aVar.values) && s.g(this.aggregations, aVar.aggregations);
    }

    public final int hashCode() {
        int iHashCode = this.values.hashCode() * 31;
        b bVar = this.aggregations;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "DailyPushesChartItemDTO(values=" + this.values + ", aggregations=" + this.aggregations + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.values, parcel);
        while (itE.hasNext()) {
            ((e) itE.next()).writeToParcel(parcel, i14);
        }
        b bVar = this.aggregations;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lz42/a$b;", "Landroid/os/Parcelable;", "", "totalPushesAverage", "totalPushesWeeklyAverage", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "d", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C3772a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalPushesAverage")
        private final Double totalPushesAverage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalPushesWeeklyAverage")
        private final Double totalPushesWeeklyAverage;

        /* JADX INFO: renamed from: z42.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3772a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getTotalPushesAverage() {
            return this.totalPushesAverage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getTotalPushesWeeklyAverage() {
            return this.totalPushesWeeklyAverage;
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
            return s.g(this.totalPushesAverage, bVar.totalPushesAverage) && s.g(this.totalPushesWeeklyAverage, bVar.totalPushesWeeklyAverage);
        }

        public final int hashCode() {
            Double d14 = this.totalPushesAverage;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.totalPushesWeeklyAverage;
            return iHashCode + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            return "DailyAggregations(totalPushesAverage=" + this.totalPushesAverage + ", totalPushesWeeklyAverage=" + this.totalPushesWeeklyAverage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Double d14 = this.totalPushesAverage;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Double d15 = this.totalPushesWeeklyAverage;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
        }

        public b(Double d14, Double d15) {
            this.totalPushesAverage = d14;
            this.totalPushesWeeklyAverage = d15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public a(List<e> list, b bVar) {
        list.getClass();
        this.values = list;
        this.aggregations = bVar;
    }

    public a() {
        this(null, null, 3, null);
    }
}
