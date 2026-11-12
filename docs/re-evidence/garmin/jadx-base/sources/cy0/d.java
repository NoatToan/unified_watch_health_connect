package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcy0/d;", "Landroid/os/Parcelable;", "", "values", "Lcy0/d$a;", "aggregations", "<init>", "(Ljava/lang/String;Lcy0/d$a;)V", "a", "Ljava/lang/String;", "getValues", "()Ljava/lang/String;", "b", "Lcy0/d$a;", "()Lcy0/d$a;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final String values;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aggregations")
    private final a aggregations;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcy0/d$a;", "Landroid/os/Parcelable;", "", "restingCaloriesAverage", "activeCaloriesAverage", "totalCaloriesAverage", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "a", "Ljava/lang/Float;", "d", "()Ljava/lang/Float;", "b", "c", "f", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1215a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingCaloriesAverage")
        private final Float restingCaloriesAverage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("activeCaloriesAverage")
        private final Float activeCaloriesAverage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalCaloriesAverage")
        private final Float totalCaloriesAverage;

        /* JADX INFO: renamed from: cy0.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1215a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(Float f14, Float f15, Float f16) {
            this.restingCaloriesAverage = f14;
            this.activeCaloriesAverage = f15;
            this.totalCaloriesAverage = f16;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Float getActiveCaloriesAverage() {
            return this.activeCaloriesAverage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Float getRestingCaloriesAverage() {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.restingCaloriesAverage, aVar.restingCaloriesAverage) && p005kotlin.jvm.internal.s.g(this.activeCaloriesAverage, aVar.activeCaloriesAverage) && p005kotlin.jvm.internal.s.g(this.totalCaloriesAverage, aVar.totalCaloriesAverage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Float getTotalCaloriesAverage() {
            return this.totalCaloriesAverage;
        }

        public final int hashCode() {
            Float f14 = this.restingCaloriesAverage;
            int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
            Float f15 = this.activeCaloriesAverage;
            int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
            Float f16 = this.totalCaloriesAverage;
            return iHashCode2 + (f16 != null ? f16.hashCode() : 0);
        }

        public final String toString() {
            return "CalorieStats(restingCaloriesAverage=" + this.restingCaloriesAverage + ", activeCaloriesAverage=" + this.activeCaloriesAverage + ", totalCaloriesAverage=" + this.totalCaloriesAverage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Float f14 = this.restingCaloriesAverage;
            if (f14 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f14.floatValue());
            }
            Float f15 = this.activeCaloriesAverage;
            if (f15 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f15.floatValue());
            }
            Float f16 = this.totalCaloriesAverage;
            if (f16 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f16.floatValue());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, a aVar) {
        this.values = str;
        this.aggregations = aVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getAggregations() {
        return this.aggregations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.values, dVar.values) && p005kotlin.jvm.internal.s.g(this.aggregations, dVar.aggregations);
    }

    public final int hashCode() {
        String str = this.values;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.aggregations;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalorieStatsAggregatedDTO(values=" + this.values + ", aggregations=" + this.aggregations + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.values);
        a aVar = this.aggregations;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
    }
}
