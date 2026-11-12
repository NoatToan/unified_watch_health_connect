package gb1;

import com.garmin.android.apps.connectmobile.f3;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgb1/a;", "", "Lorg/joda/time/DateTime;", "calendarDate", "", "value", "", "count", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f76645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f76646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f76647c;

    public /* synthetic */ a(DateTime dateTime, Double d14, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f76645a, aVar.f76645a) && p005kotlin.jvm.internal.s.g(this.f76646b, aVar.f76646b) && p005kotlin.jvm.internal.s.g(this.f76647c, aVar.f76647c);
    }

    public final int hashCode() {
        DateTime dateTime = this.f76645a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Double d14 = this.f76646b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.f76647c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailyAverageGlucose(calendarDate=");
        sb3.append(this.f76645a);
        sb3.append(", value=");
        sb3.append(this.f76646b);
        sb3.append(", count=");
        return f3.i(sb3, this.f76647c, ")");
    }

    public a(DateTime dateTime, Double d14, Integer num) {
        this.f76645a = dateTime;
        this.f76646b = d14;
        this.f76647c = num;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
