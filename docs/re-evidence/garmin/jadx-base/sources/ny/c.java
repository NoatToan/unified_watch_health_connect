package ny;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import g22.k;
import kg.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lny/c;", "Landroid/os/Parcelable;", "", "calendarDateString", "Lny/c$b;", "values", "<init>", "(Ljava/lang/String;Lny/c$b;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lny/c$b;", "f", "()Lny/c$b;", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDateString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final b values;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, b bVar, int i14, j jVar) {
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.calendarDateString, cVar.calendarDateString) && s.g(this.values, cVar.values);
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
        return "DailyCaloriesSummaryDTO(calendarDateString=" + this.calendarDateString + ", values=" + this.values + ")";
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

    public c(String str, b bVar) {
        this.calendarDateString = str;
        this.values = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\f\u0010\u000b\"\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lny/c$b;", "Landroid/os/Parcelable;", "", "totalCalories", "restingCalories", "activeCalories", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "getTotalCalories", "()Ljava/lang/Integer;", "b", "d", "setRestingCalories", "(Ljava/lang/Integer;)V", "c", "setActiveCalories", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("totalCalories")
        private final Integer totalCalories;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingCalories")
        private Integer restingCalories;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("activeCalories")
        private Integer activeCalories;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(Integer num, Integer num2, Integer num3, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getActiveCalories() {
            return this.activeCalories;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getRestingCalories() {
            return this.restingCalories;
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
            return s.g(this.totalCalories, bVar.totalCalories) && s.g(this.restingCalories, bVar.restingCalories) && s.g(this.activeCalories, bVar.activeCalories);
        }

        public final Integer getTotalCalories() {
            return this.totalCalories;
        }

        public final int hashCode() {
            Integer num = this.totalCalories;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.restingCalories;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.activeCalories;
            return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            Integer num = this.totalCalories;
            Integer num2 = this.restingCalories;
            return f3.i(com.airbnb.lottie.animation.keyframe.a.l(num, "DailyValues(totalCalories=", ", restingCalories=", ", activeCalories=", num2), this.activeCalories, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.totalCalories;
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
            Integer num3 = this.activeCalories;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num3);
            }
        }

        public b(Integer num, Integer num2, Integer num3) {
            this.totalCalories = num;
            this.restingCalories = num2;
            this.activeCalories = num3;
        }

        public b() {
            this(null, null, null, 7, null);
        }
    }
}
