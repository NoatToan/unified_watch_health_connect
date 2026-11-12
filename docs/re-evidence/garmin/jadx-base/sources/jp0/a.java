package jp0;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.gson.annotations.SerializedName;
import g22.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Ljp0/a;", "Landroid/os/Parcelable;", "Ljp0/e;", "", "calendarDate", "", "valueInML", "goalInML", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "b", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "c", "f", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable, e {
    public static final Parcelable.Creator<a> CREATOR = new C1920a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valueInML")
    private final Double valueInML;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalInML")
    private final Double goalInML;

    /* JADX INFO: renamed from: jp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1920a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, Double d14, Double d15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15);
    }

    @Override // jp0.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getGoalInML() {
        return this.goalInML;
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
        return s.g(this.calendarDate, aVar.calendarDate) && s.g(this.valueInML, aVar.valueInML) && s.g(this.goalInML, aVar.goalInML);
    }

    public final Double f() {
        return this.goalInML;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getValueInML() {
        return this.valueInML;
    }

    @Override // jp0.e
    public final DateTime getDate() {
        String str = this.calendarDate;
        if (str != null) {
            return k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    @Override // jp0.e
    public final Double getValue() {
        return this.valueInML;
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.valueInML;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.goalInML;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.calendarDate;
        Double d14 = this.valueInML;
        Double d15 = this.goalInML;
        StringBuilder sb3 = new StringBuilder("HydrationDailySummaryDTO(calendarDate=");
        sb3.append(str);
        sb3.append(", valueInML=");
        sb3.append(d14);
        sb3.append(", goalInML=");
        return i.g(sb3, d15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.calendarDate);
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
    }

    public a(String str, Double d14, Double d15) {
        this.calendarDate = str;
        this.valueInML = d14;
        this.goalInML = d15;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
