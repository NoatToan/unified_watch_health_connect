package ip1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lip1/k;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "startTimeLocal", "", "duration", "gainSolarActivityTime", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Lorg/joda/time/DateTime;", "f", "()Lorg/joda/time/DateTime;", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "c", "d", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime startTimeLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gainSolarActivityTime")
    private final Double gainSolarActivityTime;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k((DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(DateTime dateTime, Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getGainSolarActivityTime() {
        return this.gainSolarActivityTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.startTimeLocal, kVar.startTimeLocal) && s.g(this.duration, kVar.duration) && s.g(this.gainSolarActivityTime, kVar.gainSolarActivityTime);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getStartTimeLocal() {
        return this.startTimeLocal;
    }

    public final boolean g() {
        Double d14 = this.gainSolarActivityTime;
        return d14 != null && d14.doubleValue() > 0.0d;
    }

    public final int hashCode() {
        DateTime dateTime = this.startTimeLocal;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Double d14 = this.duration;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.gainSolarActivityTime;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        DateTime dateTime = this.startTimeLocal;
        Double d14 = this.duration;
        Double d15 = this.gainSolarActivityTime;
        StringBuilder sb3 = new StringBuilder("SummaryDataDTO(startTimeLocal=");
        sb3.append(dateTime);
        sb3.append(", duration=");
        sb3.append(d14);
        sb3.append(", gainSolarActivityTime=");
        return b71.i.g(sb3, d15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.startTimeLocal);
        Double d14 = this.duration;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.gainSolarActivityTime;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
    }

    public k(DateTime dateTime, Double d14, Double d15) {
        this.startTimeLocal = dateTime;
        this.duration = d14;
        this.gainSolarActivityTime = d15;
    }

    public k() {
        this(null, null, null, 7, null);
    }
}
