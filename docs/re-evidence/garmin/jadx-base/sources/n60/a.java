package n60;

import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import com.garmin.android.apps.connectmobile.util.adapters.LocalDateAdapter;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ln60/a;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", Constants.MessagePayloadKeys.FROM, "until", "", "series", "", "value", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Lorg/joda/time/LocalDate;", "f", "()Lorg/joda/time/LocalDate;", "b", "g", "c", "Ljava/lang/String;", "getSeries", "()Ljava/lang/String;", "d", "Ljava/lang/Long;", "getValue", "()Ljava/lang/Long;", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2326a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.MessagePayloadKeys.FROM)
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("until")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate until;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("series")
    private final String series;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Long value;

    /* JADX INFO: renamed from: n60.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2326a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(LocalDate localDate, LocalDate localDate2, String str, Long l14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : localDate2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : l14);
    }

    public final Double b() {
        Long l14 = this.value;
        if (l14 != null) {
            return Double.valueOf(l14.longValue() / ((double) 1000));
        }
        return null;
    }

    public final Double d() {
        Double dB = b();
        if (dB == null) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = dB.doubleValue();
        aVar.getClass();
        return Double.valueOf(l3.a.r(dDoubleValue, true));
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
        return s.g(this.from, aVar.from) && s.g(this.until, aVar.until) && s.g(this.series, aVar.series) && s.g(this.value, aVar.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getUntil() {
        return this.until;
    }

    public final int hashCode() {
        LocalDate localDate = this.from;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.until;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str = this.series;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.value;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        return "CriticalSwimSpeedAggregationDTO(from=" + this.from + ", until=" + this.until + ", series=" + this.series + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.from);
        parcel.writeSerializable(this.until);
        parcel.writeString(this.series);
        Long l14 = this.value;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public a(LocalDate localDate, LocalDate localDate2, String str, Long l14) {
        this.from = localDate;
        this.until = localDate2;
        this.series = str;
        this.value = l14;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
