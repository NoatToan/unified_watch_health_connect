package j52;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.womenshealth.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj52/i;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "startDate", "", "periodLength", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;)V", "a", "Lorg/joda/time/LocalDate;", "getStartDate", "()Lorg/joda/time/LocalDate;", "setStartDate", "(Lorg/joda/time/LocalDate;)V", "b", "Ljava/lang/Integer;", "getPeriodLength", "()Ljava/lang/Integer;", "setPeriodLength", "(Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodLength")
    private Integer periodLength;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i((LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(LocalDate localDate, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.startDate, iVar.startDate) && s.g(this.periodLength, iVar.periodLength);
    }

    public final int hashCode() {
        LocalDate localDate = this.startDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Integer num = this.periodLength;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "OverlapCycle(startDate=" + this.startDate + ", periodLength=" + this.periodLength + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.startDate);
        Integer num = this.periodLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public i(LocalDate localDate, Integer num) {
        this.startDate = localDate;
        this.periodLength = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
