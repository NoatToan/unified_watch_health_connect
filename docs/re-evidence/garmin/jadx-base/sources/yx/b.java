package yx;

import c83.a0;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.roomorama.caldroid.CaldroidFragment;
import i83.f;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ9\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lyx/b;", "", "", CaldroidFragment.YEAR, "monthIndex", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "a", "(II)Lo53/i0;", "", "groupId", "b", "(Ljava/lang/String;II)Lo53/i0;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @f("/mobile-gateway/calendar/year/{year}/month/{monthIndex}")
    i0<a0<CalendarDTO>> a(@s(CaldroidFragment.YEAR) int year, @s("monthIndex") int monthIndex);

    @f("/calendar-service/group/{groupId}/year/{year}/month/{monthIndex}")
    i0<a0<CalendarDTO>> b(@s("groupId") String groupId, @s(CaldroidFragment.YEAR) int year, @s("monthIndex") int monthIndex);
}
