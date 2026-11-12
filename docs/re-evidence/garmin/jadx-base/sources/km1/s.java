package km1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.sleep.data.api.DateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkm1/s;", "Landroid/os/Parcelable;", "", "sleepActivityLevel", "Lorg/joda/time/DateTime;", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "<init>", "(DLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "D", "d", "()D", "setSleepActivityLevel", "(D)V", "b", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", "setSleepStartTimestampGMT", "(Lorg/joda/time/DateTime;)V", "c", "f", "setSleepEndTimestampGMT", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityLevel")
    private double sleepActivityLevel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startGMT")
    @JsonAdapter(DateTimeAdapter.class)
    private DateTime sleepStartTimestampGMT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endGMT")
    @JsonAdapter(DateTimeAdapter.class)
    private DateTime sleepEndTimestampGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readDouble(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public /* synthetic */ s(double d14, DateTime dateTime, DateTime dateTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0.0d : d14, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : dateTime2);
    }

    public final int b() {
        DateTime dateTime = this.sleepStartTimestampGMT;
        DateTime dateTime2 = this.sleepEndTimestampGMT;
        if (dateTime == null || dateTime2 == null) {
            return 0;
        }
        return Minutes.minutesBetween(dateTime, dateTime2).getMinutes();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getSleepActivityLevel() {
        return this.sleepActivityLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.sleepActivityLevel, sVar.sleepActivityLevel) == 0 && p005kotlin.jvm.internal.s.g(this.sleepStartTimestampGMT, sVar.sleepStartTimestampGMT) && p005kotlin.jvm.internal.s.g(this.sleepEndTimestampGMT, sVar.sleepEndTimestampGMT);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getSleepEndTimestampGMT() {
        return this.sleepEndTimestampGMT;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getSleepStartTimestampGMT() {
        return this.sleepStartTimestampGMT;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.sleepActivityLevel) * 31;
        DateTime dateTime = this.sleepStartTimestampGMT;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.sleepEndTimestampGMT;
        return iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final String toString() {
        return "SleepChartDTO(sleepActivityLevel=" + this.sleepActivityLevel + ", sleepStartTimestampGMT=" + this.sleepStartTimestampGMT + ", sleepEndTimestampGMT=" + this.sleepEndTimestampGMT + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.sleepActivityLevel);
        parcel.writeSerializable(this.sleepStartTimestampGMT);
        parcel.writeSerializable(this.sleepEndTimestampGMT);
    }

    public s(double d14, DateTime dateTime, DateTime dateTime2) {
        this.sleepActivityLevel = d14;
        this.sleepStartTimestampGMT = dateTime;
        this.sleepEndTimestampGMT = dateTime2;
    }

    public s() {
        this(0.0d, null, null, 7, null);
    }
}
