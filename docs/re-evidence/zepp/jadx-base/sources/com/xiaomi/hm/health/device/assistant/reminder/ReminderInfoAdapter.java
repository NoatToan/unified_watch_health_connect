package com.xiaomi.hm.health.device.assistant.reminder;

import com.huami.assistant.calendar.Event;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/reminder/ReminderInfoAdapter;", "", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "a", "", "convert2InsertInfoList", "convert2DeleteInfoList", "Lcom/huami/assistant/calendar/Event;", "Lcom/huami/assistant/calendar/Event;", "event", "<init>", "(Lcom/huami/assistant/calendar/Event;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReminderInfoAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Event event;

    public ReminderInfoAdapter(@NotNull Event event) {
        this.event = event;
    }

    private final HMReminderInfo a() {
        HMReminderInfo hMReminderInfo = new HMReminderInfo();
        hMReminderInfo.setId((int) this.event.id);
        hMReminderInfo.setDelete(false);
        hMReminderInfo.setRepeat(false);
        Event event = this.event;
        hMReminderInfo.setRemindStr(event.title, event.description);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.event.startMillis);
        hMReminderInfo.setStartTime(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.event.endMillis);
        hMReminderInfo.setStopTime(calendar2);
        return hMReminderInfo;
    }

    @NotNull
    public final List<HMReminderInfo> convert2DeleteInfoList() {
        ArrayList arrayList = new ArrayList();
        HMReminderInfo hMReminderInfoA = a();
        if (hMReminderInfoA != null) {
            hMReminderInfoA.setDelete(true);
            arrayList.add(hMReminderInfoA);
        }
        return arrayList;
    }

    @NotNull
    public final List<HMReminderInfo> convert2InsertInfoList() {
        ArrayList arrayList = new ArrayList();
        HMReminderInfo hMReminderInfoA = a();
        if (hMReminderInfoA != null) {
            arrayList.add(hMReminderInfoA);
        }
        return arrayList;
    }
}
