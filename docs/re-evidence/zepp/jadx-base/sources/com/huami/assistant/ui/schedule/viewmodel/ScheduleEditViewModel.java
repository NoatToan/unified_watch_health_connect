package com.huami.assistant.ui.schedule.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.ui.schedule.viewmodel.ScheduleEditViewModel;
import com.huami.watch.util.DateDay;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleEditViewModel extends AndroidViewModel {
    private static final int d = 0;
    private static final int e = -480;
    private MediatorLiveData<Event> a;
    private LiveData<Boolean> b;
    private String c;

    public ScheduleEditViewModel(@NonNull Application application) {
        super(application);
        MediatorLiveData<Event> mediatorLiveData = new MediatorLiveData<>();
        this.a = mediatorLiveData;
        this.b = Transformations.map(mediatorLiveData, new Function() { // from class: hi6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ScheduleEditViewModel.i((Event) obj);
            }
        });
        this.c = "";
        this.a.setValue(e());
    }

    private Event e() {
        Event event = new Event();
        long jF = f(false);
        event.startMillis = jF;
        event.endMillis = jF + 3600000;
        event.reminderMinutes = 0;
        event.hasAlarm = true;
        event.title = "";
        event.description = "";
        event.repeatStopTime = 4294967295L;
        event.source = 129;
        this.c = event.toString();
        return event;
    }

    private long f(boolean isAllDay) {
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
    public /* synthetic */ void g(String str) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.description = str;
        this.a.postValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        Event value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.title = str;
        this.a.postValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(Event event) {
        int i = event.source;
        boolean z = true;
        if (i != 1 && i != 2 && i != 129 && i != 132) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void bindDesc(LiveData<String> descData) {
        this.a.addSource(descData, new Observer() { // from class: ii6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.g((String) obj);
            }
        });
    }

    public void bindTitle(LiveData<String> titleData) {
        this.a.addSource(titleData, new Observer() { // from class: ji6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.h((String) obj);
            }
        });
    }

    public LiveData<Boolean> canEdit() {
        return this.b;
    }

    public LiveData<Event> getEvent() {
        return this.a;
    }

    public boolean hasChange() {
        return !this.c.equals(this.a.getValue() == null ? "" : this.a.getValue().toString());
    }

    public void setAllDay(boolean isAllDay) {
        Event value = this.a.getValue();
        if (value == null) {
            value = new Event();
        }
        if (isAllDay == value.allDay) {
            return;
        }
        long jF = f(isAllDay);
        if (!DateDay.from(value.startMillis).equals(jF)) {
            value.rrule = "";
        }
        value.reminderMinutes = isAllDay ? e : 0;
        value.startMillis = jF;
        value.endMillis = jF + (isAllDay ? 86400000L : 3600000L);
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
        this.c = event.toString();
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
