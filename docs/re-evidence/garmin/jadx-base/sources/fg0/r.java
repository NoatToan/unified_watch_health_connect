package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lfg0/r;", "Landroid/os/Parcelable;", "", "startTimeHhMm", "timeZoneId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "b", "h", "j", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeHhMm")
    private String startTimeHhMm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeZoneId")
    private String timeZoneId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }

    public final DateTimeZone b() {
        String str = this.timeZoneId;
        if (str == null || str.length() == 0) {
            return null;
        }
        return DateTimeZone.forTimeZone(TimeZone.getTimeZone(this.timeZoneId));
    }

    public final DateTime d() {
        String str = this.timeZoneId;
        if (str == null || str.length() == 0) {
            return null;
        }
        return DateTime.now(DateTimeZone.forTimeZone(TimeZone.getTimeZone(this.timeZoneId)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.startTimeHhMm, rVar.startTimeHhMm) && p005kotlin.jvm.internal.s.g(this.timeZoneId, rVar.timeZoneId);
    }

    public final LocalTime f() {
        String str = this.startTimeHhMm;
        if (str == null || str.length() == 0) {
            return null;
        }
        return new LocalTime(this.startTimeHhMm);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStartTimeHhMm() {
        return this.startTimeHhMm;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final int hashCode() {
        String str = this.startTimeHhMm;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeZoneId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void i(String str) {
        this.startTimeHhMm = str;
    }

    public final void j(String str) {
        this.timeZoneId = str;
    }

    public final String toString() {
        return e0.g("EventTimeLocalDTO(startTimeHhMm=", this.startTimeHhMm, ", timeZoneId=", this.timeZoneId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.startTimeHhMm);
        parcel.writeString(this.timeZoneId);
    }

    public r(String str, String str2) {
        this.startTimeHhMm = str;
        this.timeZoneId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
