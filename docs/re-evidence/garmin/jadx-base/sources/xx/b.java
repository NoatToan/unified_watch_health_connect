package xx;

import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import gs1.t;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxx/b;", "", "Lorg/joda/time/DateTime;", "date", "", "groupId", "Lgs1/t;", "timelineDTO", "", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "calendarListItems", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/String;Lgs1/t;Ljava/util/List;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f192466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f192468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<CalendarItemDTO> f192469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vx.f f192470e;

    public b(DateTime dateTime, String str, t tVar, List<CalendarItemDTO> list) {
        dateTime.getClass();
        tVar.getClass();
        list.getClass();
        this.f192466a = dateTime;
        this.f192467b = str;
        this.f192468c = tVar;
        this.f192469d = list;
        this.f192470e = (vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f192466a, bVar.f192466a) && s.g(this.f192467b, bVar.f192467b) && s.g(this.f192468c, bVar.f192468c) && s.g(this.f192469d, bVar.f192469d);
    }

    public final int hashCode() {
        int iHashCode = this.f192466a.hashCode() * 31;
        String str = this.f192467b;
        return this.f192469d.hashCode() + ((this.f192468c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "CalendarDetails(date=" + this.f192466a + ", groupId=" + this.f192467b + ", timelineDTO=" + this.f192468c + ", calendarListItems=" + this.f192469d + ")";
    }

    public /* synthetic */ b(DateTime dateTime, String str, t tVar, List list, int i14, j jVar) {
        this(dateTime, (i14 & 2) != 0 ? null : str, tVar, list);
    }
}
