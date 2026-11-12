package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.assistant.calendar.Event;
import com.huami.watch.util.DateDay;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class EditScheduleViewModel extends AndroidViewModel {
    private static final int c = 0;
    private static final int d = -480;
    private MediatorLiveData<Event> a;
    private String b;

    public EditScheduleViewModel(@NonNull Application application) {
        super(application);
        MediatorLiveData<Event> mediatorLiveData = new MediatorLiveData<>();
        this.a = mediatorLiveData;
        this.b = "";
        mediatorLiveData.setValue(c());
    }

    private Event c() {
        Event event = new Event();
        long jE = e(false);
        event.startMillis = jE;
        event.endMillis = jE + 3600000;
        event.reminderMinutes = 0;
        event.hasAlarm = true;
        event.title = "";
        event.description = "";
        event.repeatStopTime = 4294967295L;
        event.source = 129;
        this.b = event.toString();
        return event;
    }

    private long e(boolean isAllDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (isAllDay) {
            calendar.set(11, 8);
            calendar.set(12, 0);
        } else {
            int i = calendar.get(12);
            if (i <= 29) {
                i = 30;
            } else if (i <= 59) {
                i = 60;
            }
            calendar.set(12, i);
        }
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.description = str;
        this.a.postValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.title = str;
        this.a.postValue(value);
    }

    public void bindDesc(LiveData<String> descData) {
        this.a.addSource(descData, new Observer() { // from class: nj1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.f((String) obj);
            }
        });
    }

    public void bindTitle(LiveData<String> titleData) {
        this.a.addSource(titleData, new Observer() { // from class: oj1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.g((String) obj);
            }
        });
    }

    public LiveData<Event> getEvent() {
        return this.a;
    }

    public boolean hasChange() {
        return !this.b.equals(this.a.getValue() == null ? "" : this.a.getValue().toString());
    }

    public void setAllDay(boolean isAllDay) {
        Event value = this.a.getValue();
        if (value == null) {
            value = new Event();
        }
        if (isAllDay == value.allDay) {
            return;
        }
        long jE = e(isAllDay);
        if (!DateDay.from(value.startMillis).equals(jE)) {
            value.rrule = "";
        }
        value.reminderMinutes = isAllDay ? d : 0;
        value.startMillis = jE;
        value.endMillis = jE + (isAllDay ? 86400000L : 3600000L);
        value.allDay = isAllDay;
        this.a.postValue(value);
    }

    public void setEndTime(long endTime) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        long j = value.startMillis;
        if (endTime < j) {
            endTime = j;
        }
        if (value.allDay) {
            endTime += 86400000;
        }
        value.endMillis = endTime;
        this.a.postValue(value);
    }

    public void setEvent(@NonNull Event event) {
        this.b = event.toString();
        this.a.setValue(event);
    }

    public void setReminderMin(int minute) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.reminderMinutes = minute;
        value.hasAlarm = minute != -1;
        this.a.postValue(value);
    }

    public void setRrule(String rrule) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.rrule = rrule;
        this.a.postValue(value);
    }

    public void setStartTime(long startTime) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        if (!DateDay.from(value.startMillis).equals(startTime)) {
            value.rrule = "";
        }
        value.startMillis = startTime;
        long j = value.allDay ? 86400000L : 3600000L;
        long j2 = value.endMillis;
        if (j2 - startTime < j || startTime > j2) {
            value.endMillis = startTime + j;
        }
        this.a.postValue(value);
    }
}
