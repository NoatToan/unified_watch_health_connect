package hy;

import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhy/l;", "Lhy/g;", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;", "itemType", "Lorg/joda/time/DateTime;", "date", "<init>", "(Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;Lorg/joda/time/DateTime;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarItemDTO.b f86342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f86343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CalendarItemDTO.b bVar, DateTime dateTime) {
        super(null);
        bVar.getClass();
        dateTime.getClass();
        this.f86342a = bVar;
        this.f86343b = dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f86342a == lVar.f86342a && p005kotlin.jvm.internal.s.g(this.f86343b, lVar.f86343b);
    }

    public final int hashCode() {
        return this.f86343b.hashCode() + (this.f86342a.hashCode() * 31);
    }

    public final String toString() {
        return "FeatureDestination(itemType=" + this.f86342a + ", date=" + this.f86343b + ")";
    }
}
