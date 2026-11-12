package mp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmp/l;", "Landroid/os/Parcelable;", "", "value", "", "calendarDate", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Double value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(Double d14, String str) {
        this.value = d14;
        this.calendarDate = str;
    }

    public static l b(l lVar, Double d14) {
        return new l(d14, lVar.calendarDate);
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.value, lVar.value) && s.g(this.calendarDate, lVar.calendarDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final int hashCode() {
        Double d14 = this.value;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.calendarDate;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ReportsMetricValue(value=" + this.value + ", calendarDate=" + this.calendarDate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.value;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.calendarDate);
    }
}
