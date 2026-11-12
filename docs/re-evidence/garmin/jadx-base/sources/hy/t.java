package hy;

import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhy/t;", "Lhy/g;", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "calendarItemDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarItemDTO f86361a;

    static {
        CalendarItemDTO.Companion companion = CalendarItemDTO.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CalendarItemDTO calendarItemDTO) {
        super(null);
        calendarItemDTO.getClass();
        this.f86361a = calendarItemDTO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && p005kotlin.jvm.internal.s.g(this.f86361a, ((t) obj).f86361a);
    }

    public final int hashCode() {
        return this.f86361a.hashCode();
    }

    public final String toString() {
        return "WorkoutDetailsDestination(calendarItemDTO=" + this.f86361a + ")";
    }
}
