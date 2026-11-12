package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class ScheduleInfo implements Parcelable {
    public static final Parcelable.Creator<ScheduleInfo> CREATOR = new Parcelable.Creator<ScheduleInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.ScheduleInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScheduleInfo createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ScheduleInfo scheduleInfo = new ScheduleInfo(i);
            scheduleInfo.eventCount = i;
            Event[] eventArr = scheduleInfo.event;
            if (eventArr != null) {
                parcel.readTypedArray(eventArr, Event.CREATOR);
            }
            return scheduleInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScheduleInfo[] newArray(int i) {
            return new ScheduleInfo[i];
        }
    };
    public Event[] event;
    public int eventCount;

    public static class Event implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.ingenic.iwds.datatransactor.elf.ScheduleInfo.Event.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event createFromParcel(Parcel parcel) {
                Event event = new Event();
                event.id = parcel.readLong();
                event.title = parcel.readString();
                event.eventLocation = parcel.readString();
                event.description = parcel.readString();
                event.dtStart = parcel.readLong();
                event.dtEnd = parcel.readLong();
                event.eventTimezone = parcel.readString();
                event.duration = parcel.readString();
                event.allDay = parcel.readInt();
                event.hasAlarm = parcel.readInt();
                event.rrule = parcel.readString();
                event.reminder = (Reminder) parcel.readParcelable(Reminder.class.getClassLoader());
                return event;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event[] newArray(int i) {
                return new Event[i];
            }
        };
        public long id = 0;
        public String title = null;
        public String eventLocation = null;
        public String description = null;
        public long dtStart = 0;
        public long dtEnd = 0;
        public String eventTimezone = null;
        public String duration = null;
        public int allDay = 0;
        public int hasAlarm = 0;
        public String rrule = null;
        public Reminder reminder = null;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Event [id=" + this.id + ", title=" + this.title + ", eventLocation=" + this.eventLocation + ", description=" + this.description + ", dtStart=" + this.dtStart + ", dtEnd=" + this.dtEnd + ", eventTimezone=" + this.eventTimezone + ", duration=" + this.duration + ", allDay=" + this.allDay + ", hasAlarm=" + this.hasAlarm + ", rrule=" + this.rrule + ", reminder=" + this.reminder + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.eventLocation);
            parcel.writeString(this.description);
            parcel.writeLong(this.dtStart);
            parcel.writeLong(this.dtEnd);
            parcel.writeString(this.eventTimezone);
            parcel.writeString(this.duration);
            parcel.writeInt(this.allDay);
            parcel.writeInt(this.hasAlarm);
            parcel.writeString(this.rrule);
            parcel.writeParcelable(this.reminder, i);
        }
    }

    public static class Reminder implements Parcelable {
        public static final Parcelable.Creator<Reminder> CREATOR = new Parcelable.Creator<Reminder>() { // from class: com.ingenic.iwds.datatransactor.elf.ScheduleInfo.Reminder.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Reminder createFromParcel(Parcel parcel) {
                Reminder reminder = new Reminder();
                reminder.id = parcel.readLong();
                reminder.eventId = parcel.readLong();
                reminder.minutes = parcel.readLong();
                reminder.method = parcel.readLong();
                return reminder;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Reminder[] newArray(int i) {
                return new Reminder[i];
            }
        };
        public long eventId;
        public long id;
        public long method;
        public long minutes;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Reminder [id=" + this.id + ", eventId=" + this.eventId + ", minutes=" + this.minutes + ", method=" + this.method + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.id);
            parcel.writeLong(this.eventId);
            parcel.writeLong(this.minutes);
            parcel.writeLong(this.method);
        }
    }

    public ScheduleInfo(int i) {
        IwdsAssert.dieIf(this, i < 0, "Event count < 0.");
        this.eventCount = i;
        if (i != 0) {
            this.event = new Event[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ScheduleInfo [event=" + Arrays.toString(this.event) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.eventCount);
        Event[] eventArr = this.event;
        if (eventArr != null) {
            parcel.writeTypedArray(eventArr, i);
        }
    }
}
