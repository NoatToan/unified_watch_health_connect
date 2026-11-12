package ny;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import j20.x;
import kg.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lny/e;", "Landroid/os/Parcelable;", "", "calendarDateString", "Lny/e$b;", "values", "<init>", "(Ljava/lang/String;Lny/e$b;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lny/e$b;", "f", "()Lny/e$b;", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDateString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final b values;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readString(), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bVar);
    }

    public final LocalDate b() {
        String str = this.calendarDateString;
        if (str != null) {
            return k.v(str, "yyyy-MM-dd");
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCalendarDateString() {
        return this.calendarDateString;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.calendarDateString, eVar.calendarDateString) && s.g(this.values, eVar.values);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getValues() {
        return this.values;
    }

    public final int hashCode() {
        String str = this.calendarDateString;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.values;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "WeeklyCaloriesSummaryDTO(calendarDateString=" + this.calendarDateString + ", values=" + this.values + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.calendarDateString);
        b bVar = this.values;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public e(String str, b bVar) {
        this.calendarDateString = str;
        this.values = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, d2 = {"Lny/e$b;", "Landroid/os/Parcelable;", "", "dataDaysCount", "restingCalories", "totalCalories", "averageDailyTotalCalories", "activeCalories", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "b", "g", "c", "getTotalCalories", "d", JWKParameterNames.RSA_EXPONENT, "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("wellnessDataDaysCount")
        private final Integer dataDaysCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingCalories")
        private final Integer restingCalories;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalCalories")
        private final Integer totalCalories;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("averageDailyTotalCalories")
        private final Integer averageDailyTotalCalories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("activeCalories")
        private final Integer activeCalories;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : num4, (i14 & 16) != 0 ? null : num5);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getActiveCalories() {
            return this.activeCalories;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getAverageDailyTotalCalories() {
            return this.averageDailyTotalCalories;
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
            return s.g(this.dataDaysCount, bVar.dataDaysCount) && s.g(this.restingCalories, bVar.restingCalories) && s.g(this.totalCalories, bVar.totalCalories) && s.g(this.averageDailyTotalCalories, bVar.averageDailyTotalCalories) && s.g(this.activeCalories, bVar.activeCalories);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getDataDaysCount() {
            return this.dataDaysCount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getRestingCalories() {
            return this.restingCalories;
        }

        public final Integer getTotalCalories() {
            return this.totalCalories;
        }

        public final int hashCode() {
            Integer num = this.dataDaysCount;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.restingCalories;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.totalCalories;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.averageDailyTotalCalories;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.activeCalories;
            return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
        }

        public final String toString() {
            Integer num = this.dataDaysCount;
            Integer num2 = this.restingCalories;
            Integer num3 = this.totalCalories;
            Integer num4 = this.averageDailyTotalCalories;
            Integer num5 = this.activeCalories;
            StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "Values(dataDaysCount=", ", restingCalories=", ", totalCalories=", num2);
            x.m(sbL, num3, ", averageDailyTotalCalories=", num4, ", activeCalories=");
            return f3.i(sbL, num5, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.dataDaysCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num);
            }
            Integer num2 = this.restingCalories;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num2);
            }
            Integer num3 = this.totalCalories;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num3);
            }
            Integer num4 = this.averageDailyTotalCalories;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num4);
            }
            Integer num5 = this.activeCalories;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num5);
            }
        }

        public b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.dataDaysCount = num;
            this.restingCalories = num2;
            this.totalCalories = num3;
            this.averageDailyTotalCalories = num4;
            this.activeCalories = num5;
        }

        public b() {
            this(null, null, null, null, null, 31, null);
        }
    }
}
