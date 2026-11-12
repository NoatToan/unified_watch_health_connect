package com.huami.assistant.calendar;

import android.text.TextUtils;
import android.text.format.Time;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.Objects;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public class Event implements Comparable, Serializable, Cloneable {
    public boolean allDay;
    public String description;
    public long endMillis;
    public boolean hasAlarm;
    public long id;
    public String imageUrl;
    public int reminderMinutes;
    public long repeatStopTime = 4294967295L;
    public String rrule;
    public int source;
    public long startMillis;
    public String syncId;
    public String title;
    public long updateVersion;

    public static class Reminder implements Serializable {
        public int method;
        public int minutes;

        public String toString() {
            return "<minutes: " + this.minutes + ", method: " + this.method + Typography.greater;
        }
    }

    private String a(String value) {
        return TextUtils.isEmpty(value) ? "" : value;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Object o) {
        Event event = (Event) o;
        if (this.allDay) {
            return event.allDay ? 0 : -1;
        }
        if (event.allDay) {
            return 1;
        }
        return (int) (this.startMillis - this.endMillis);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        return a(this.syncId).equals(a(event.syncId)) && a(this.title).equals(a(event.title)) && a(this.description).equals(a(event.description)) && event.startMillis == this.startMillis && event.endMillis == this.endMillis && event.allDay == this.allDay && a(this.rrule).equals(a(event.rrule)) && event.hasAlarm == this.hasAlarm && event.reminderMinutes == this.reminderMinutes;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        return Objects.hashCode(this.syncId);
    }

    public void resetRruleByRepeatStopTime() {
        if (TextUtils.isEmpty(this.rrule) || this.rrule.toLowerCase().equals("null")) {
            return;
        }
        EventRecurrence eventRecurrence = new EventRecurrence();
        eventRecurrence.parse(this.rrule);
        Time time = new Time();
        time.set(this.startMillis);
        eventRecurrence.setStartDate(time);
        if (this.repeatStopTime != 4294967295L) {
            Time time2 = new Time();
            time2.set(this.repeatStopTime);
            eventRecurrence.until = time2.format2445();
        }
        this.rrule = eventRecurrence.toString();
    }

    public String toString() {
        return "<id: " + this.id + ", syncId: '" + this.syncId + "', title: '" + this.title + "', description: '" + this.description + "', startMillis: " + this.startMillis + ", endMillis: " + this.endMillis + ", allDay: " + this.allDay + ", rrule: '" + this.rrule + "', hasAlarm: " + this.hasAlarm + ", reminderMinutes: " + this.reminderMinutes + ", repeatStopTime: " + this.repeatStopTime + ", imageUrl: " + this.imageUrl + ", source: " + this.source + ", updateVersion: " + this.updateVersion + Typography.greater;
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Event m3324clone() throws CloneNotSupportedException {
        return (Event) super.clone();
    }
}
