package gb1;

import com.garmin.android.apps.connectmobile.f3;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgb1/b;", "", "Lorg/joda/time/DateTime;", "date", "", "movements", "duration", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f76648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f76649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f76650c;

    public /* synthetic */ b(DateTime dateTime, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f76648a, bVar.f76648a) && p005kotlin.jvm.internal.s.g(this.f76649b, bVar.f76649b) && p005kotlin.jvm.internal.s.g(this.f76650c, bVar.f76650c);
    }

    public final int hashCode() {
        DateTime dateTime = this.f76648a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Integer num = this.f76649b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f76650c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f76649b;
        Integer num2 = this.f76650c;
        StringBuilder sb3 = new StringBuilder("DailyMovementAverage(date=");
        sb3.append(this.f76648a);
        sb3.append(", movements=");
        sb3.append(num);
        sb3.append(", duration=");
        return f3.i(sb3, num2, ")");
    }

    public b(DateTime dateTime, Integer num, Integer num2) {
        this.f76648a = dateTime;
        this.f76649b = num;
        this.f76650c = num2;
    }

    public b() {
        this(null, null, null, 7, null);
    }
}
