package ny;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lny/b;", "Landroid/os/Parcelable;", "", "Lny/c;", "values", "Lny/b$b;", "aggregations", "<init>", "(Ljava/util/List;Lny/b$b;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lny/b$b;", "()Lny/b$b;", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final List<c> values;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aggregations")
    private final C2462b aggregations;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = f.a(c.CREATOR, parcel, arrayList, iA, 1);
            }
            return new b(arrayList, parcel.readInt() == 0 ? null : C2462b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(List list, C2462b c2462b, int i14, j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : c2462b);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C2462b getAggregations() {
        return this.aggregations;
    }

    public final List<c> d() {
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.values, bVar.values) && s.g(this.aggregations, bVar.aggregations);
    }

    public final int hashCode() {
        int iHashCode = this.values.hashCode() * 31;
        C2462b c2462b = this.aggregations;
        return iHashCode + (c2462b == null ? 0 : c2462b.hashCode());
    }

    public final String toString() {
        return "DailyCaloriesChartItemDTO(values=" + this.values + ", aggregations=" + this.aggregations + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = f.e(this.values, parcel);
        while (itE.hasNext()) {
            ((c) itE.next()).writeToParcel(parcel, i14);
        }
        C2462b c2462b = this.aggregations;
        if (c2462b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c2462b.writeToParcel(parcel, i14);
        }
    }

    public b(List<c> list, C2462b c2462b) {
        list.getClass();
        this.values = list;
        this.aggregations = c2462b;
    }

    public b() {
        this(null, null, 3, null);
    }

    /* JADX INFO: renamed from: ny.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lny/b$b;", "Landroid/os/Parcelable;", "", "caloriesAverage", "totalCaloriesAverage", "activeCaloriesAverage", "restingCaloriesAverage", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "getCaloriesAverage", "()Ljava/lang/Double;", "b", "f", "c", "d", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2462b implements Parcelable {
        public static final Parcelable.Creator<C2462b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("caloriesAverage")
        private final Double caloriesAverage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalCaloriesAverage")
        private final Double totalCaloriesAverage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("activeCaloriesAverage")
        private final Double activeCaloriesAverage;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingCaloriesAverage")
        private final Double restingCaloriesAverage;

        /* JADX INFO: renamed from: ny.b$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C2462b> {
            @Override // android.os.Parcelable.Creator
            public final C2462b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C2462b(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final C2462b[] newArray(int i14) {
                return new C2462b[i14];
            }
        }

        public /* synthetic */ C2462b(Double d14, Double d15, Double d16, Double d17, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getActiveCaloriesAverage() {
            return this.activeCaloriesAverage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getRestingCaloriesAverage() {
            return this.restingCaloriesAverage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2462b)) {
                return false;
            }
            C2462b c2462b = (C2462b) obj;
            return s.g(this.caloriesAverage, c2462b.caloriesAverage) && s.g(this.totalCaloriesAverage, c2462b.totalCaloriesAverage) && s.g(this.activeCaloriesAverage, c2462b.activeCaloriesAverage) && s.g(this.restingCaloriesAverage, c2462b.restingCaloriesAverage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Double getTotalCaloriesAverage() {
            return this.totalCaloriesAverage;
        }

        public final int hashCode() {
            Double d14 = this.caloriesAverage;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.totalCaloriesAverage;
            int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.activeCaloriesAverage;
            int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.restingCaloriesAverage;
            return iHashCode3 + (d17 != null ? d17.hashCode() : 0);
        }

        public final String toString() {
            return sn.a.f(this.activeCaloriesAverage, this.restingCaloriesAverage, ", restingCaloriesAverage=", ")", k.i("DailyAggregations(caloriesAverage=", this.caloriesAverage, this.totalCaloriesAverage, ", totalCaloriesAverage=", ", activeCaloriesAverage="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Double d14 = this.caloriesAverage;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Double d15 = this.totalCaloriesAverage;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
            Double d16 = this.activeCaloriesAverage;
            if (d16 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d16);
            }
            Double d17 = this.restingCaloriesAverage;
            if (d17 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d17);
            }
        }

        public C2462b(Double d14, Double d15, Double d16, Double d17) {
            this.caloriesAverage = d14;
            this.totalCaloriesAverage = d15;
            this.activeCaloriesAverage = d16;
            this.restingCaloriesAverage = d17;
        }

        public C2462b() {
            this(null, null, null, null, 15, null);
        }
    }
}
