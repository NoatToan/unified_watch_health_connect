package com.xiaomi.hm.health.ui.smartplay.eventremind;

import com.xiaomi.hm.health.databases.model.Reminder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ReminderModifiedEvent {
    public List<ComparableReminder> reminders = new ArrayList();

    public ReminderModifiedEvent(List<Reminder> list) {
        Iterator<Reminder> it2 = list.iterator();
        while (it2.hasNext()) {
            this.reminders.add(new ComparableReminder(it2.next()));
        }
    }
}
