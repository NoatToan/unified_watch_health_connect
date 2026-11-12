package com.xiaomi.hm.health.device.assistant.schedule.web;

import com.huami.assistant.calendar.Event;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/web/ScheduleWebApi;", "", "", "from", "to", "", "Lcom/huami/assistant/calendar/Event;", "queryEvents", "event", "", "saveEvent", "events", "deleteEvent", "", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ScheduleWebApi {
    boolean deleteEvent(@NotNull String event);

    boolean deleteEvent(@NotNull List<? extends Event> events);

    @NotNull
    List<Event> queryEvents(long from, long to);

    boolean saveEvent(@NotNull Event event);
}
