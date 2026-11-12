package com.xiaomi.hm.health.ui.smartplay.eventremind;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.databases.model.Reminder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ComparableReminder implements Comparable<ComparableReminder> {
    public static final int REMIND_ENDED = -1;
    public static final int REMIND_LATER = 2;
    public static final int REMIND_TODAY = 0;
    public static final int REMIND_TOMORROW = 1;
    private Reminder a;
    private int c = -1;
    private Calendar b = Calendar.getInstance();

    public ComparableReminder(Reminder reminder) {
        this.a = reminder;
    }

    public static List<ComparableReminder> a(List<Reminder> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Reminder> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new ComparableReminder(it2.next()));
        }
        return arrayList;
    }

    public Calendar b() {
        return this.b;
    }

    public ComparableReminder c(Calendar calendar) {
        this.b = calendar;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComparableReminder) {
            return ((ComparableReminder) obj).getReminder().getTime().equals(this.a.getTime());
        }
        return false;
    }

    public int getRemindType() {
        return this.c;
    }

    public Reminder getReminder() {
        return this.a;
    }

    public ComparableReminder setRemindType(int i) {
        this.c = i;
        return this;
    }

    public ComparableReminder setReminder(Reminder reminder) {
        this.a = reminder;
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull ComparableReminder comparableReminder) {
        if (this.b.before(comparableReminder.b())) {
            return -1;
        }
        if (this.b.after(comparableReminder.b())) {
            return 1;
        }
        if (this.a.getTime().longValue() < comparableReminder.getReminder().getTime().longValue()) {
            return -1;
        }
        return this.a.getTime().longValue() > comparableReminder.getReminder().getTime().longValue() ? 1 : 0;
    }
}
