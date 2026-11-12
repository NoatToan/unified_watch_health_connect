package o61;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.j0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.roomorama.caldroid.CaldroidFragment;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lo61/g;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends s1 implements Parcelable, Comparable<g> {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f129582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f129583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateTime f129584c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"o61/g$a", "Landroid/os/Parcelable$Creator;", "Lo61/g;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public g(Parcel parcel) {
        parcel.getClass();
        this.f129582a = parcel.readDouble();
        this.f129583b = parcel.readString();
        long j8 = parcel.readLong();
        if (j8 > 0) {
            this.f129584c = new DateTime(j8);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        g gVar2 = gVar;
        gVar2.getClass();
        DateTime dateTime = this.f129584c;
        if (dateTime == null && gVar2.f129584c == null) {
            return 0;
        }
        if (dateTime == null) {
            return 1;
        }
        DateTime dateTime2 = gVar2.f129584c;
        if (dateTime2 == null) {
            return -1;
        }
        return dateTime.compareTo((ReadableInstant) dateTime2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        DateTime dateTime;
        jSONObject.getClass();
        this.f129582a = jSONObject.optDouble("value");
        this.f129583b = s1.u(jSONObject, "activityId");
        if (jSONObject.has("calendarDate")) {
            String strU = s1.u(jSONObject, "calendarDate");
            if (TextUtils.isEmpty(strU)) {
                return;
            }
            this.f129584c = j0.I(strU);
            return;
        }
        if (jSONObject.has(CaldroidFragment.MONTH)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(CaldroidFragment.MONTH);
            try {
                dateTime = new LocalDateTime().withYear(jSONObject2.optInt(CaldroidFragment.YEAR)).withMonthOfYear(jSONObject2.optInt("monthId")).withHourOfDay(0).withMinuteOfHour(0).toDateTime();
            } catch (IllegalArgumentException e4) {
                String message = e4.getMessage();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "PerformanceStatsMeasurementDTO", message);
                dateTime = new DateTime();
            }
            this.f129584c = dateTime;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        long millis;
        parcel.getClass();
        parcel.writeDouble(this.f129582a);
        parcel.writeString(this.f129583b);
        DateTime dateTime = this.f129584c;
        if (dateTime != null) {
            dateTime.getClass();
            millis = dateTime.getMillis();
        } else {
            millis = 0;
        }
        parcel.writeLong(millis);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lo61/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "VALUE_KEY", "MONTH_WRAPPER_KEY", "ACTIVITY_ID_KEY", "MONTH_KEY", "YEAR_KEY", "CALENDAR_KEY", "Landroid/os/Parcelable$Creator;", "Lo61/g;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public g() {
    }
}
