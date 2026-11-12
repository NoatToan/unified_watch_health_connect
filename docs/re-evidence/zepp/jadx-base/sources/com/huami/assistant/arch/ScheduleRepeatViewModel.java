package com.huami.assistant.arch;

import android.app.Application;
import android.text.TextUtils;
import android.text.format.Time;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.calendar.RecurrenceModel;
import com.huami.assistant.model.bean.EventRepeatType;
import com.huami.assistant.util.EventUtils;
import com.huami.assistant.util.RRuleUtil;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleRepeatViewModel extends AndroidViewModel {
    private final Time a;
    public MediatorLiveData<boolean[]> customRepeatDays;
    public MutableLiveData<EventRecurrence> eventRecu;
    public MediatorLiveData<EventRepeatType> repeatType;

    public ScheduleRepeatViewModel(@NonNull Application application) {
        super(application);
        this.eventRecu = new MutableLiveData<>();
        this.repeatType = new MediatorLiveData<>();
        this.customRepeatDays = new MediatorLiveData<>();
        this.a = new Time();
        this.repeatType.addSource(this.eventRecu, new Observer() { // from class: ij6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.c((EventRecurrence) obj);
            }
        });
        this.customRepeatDays.addSource(this.repeatType, new Observer() { // from class: jj6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.e((EventRepeatType) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(EventRecurrence eventRecurrence) {
        this.repeatType.setValue(EventUtils.getRepeatType(eventRecurrence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(EventRepeatType eventRepeatType) {
        EventRecurrence value = this.eventRecu.getValue();
        if (eventRepeatType != EventRepeatType.NEVER || value == null) {
            this.customRepeatDays.postValue(null);
        } else {
            this.customRepeatDays.postValue(EventUtils.getCustomRepeatDays(value));
        }
    }

    public void generateRrule(EventRepeatType type) {
        if (type == EventRepeatType.CUSTOM) {
            return;
        }
        RecurrenceModel recurrenceModel = new RecurrenceModel();
        recurrenceModel.interval = 1;
        boolean[] zArr = new boolean[7];
        recurrenceModel.weeklyByDayOfWeek = zArr;
        zArr[this.a.weekDay] = true;
        if (type == EventRepeatType.NEVER) {
            recurrenceModel = null;
        }
        if (type == EventRepeatType.EVERY_DAY) {
            recurrenceModel.freq = 0;
        }
        if (type == EventRepeatType.EVERY_WEEK) {
            recurrenceModel.freq = 1;
        }
        if (type == EventRepeatType.EVERY_TWO_WEEK) {
            recurrenceModel.interval = 2;
            recurrenceModel.freq = 1;
        }
        if (type == EventRepeatType.WORKDAY) {
            recurrenceModel.freq = 1;
            recurrenceModel.weeklyByDayOfWeek = new boolean[]{false, true, true, true, true, true, false};
        }
        if (type == EventRepeatType.WEEKEND) {
            recurrenceModel.freq = 1;
            recurrenceModel.weeklyByDayOfWeek = new boolean[]{true, false, false, false, false, false, true};
        }
        if (type == EventRepeatType.EVERY_MONTH) {
            recurrenceModel.freq = 2;
        }
        if (type == EventRepeatType.EVERY_YEAR) {
            recurrenceModel.freq = 3;
        }
        if (recurrenceModel == null) {
            this.eventRecu.setValue(null);
            return;
        }
        EventRecurrence eventRecurrence = new EventRecurrence();
        RRuleUtil.copyModelToEventRecurrence(recurrenceModel, eventRecurrence);
        eventRecurrence.setStartDate(this.a);
        this.eventRecu.setValue(eventRecurrence);
    }

    public void setCustomRepeat(boolean[] days) {
        if (days == null || days.length != 7) {
            return;
        }
        RecurrenceModel recurrenceModel = new RecurrenceModel();
        recurrenceModel.interval = 1;
        boolean[] zArr = new boolean[7];
        recurrenceModel.weeklyByDayOfWeek = zArr;
        zArr[this.a.weekDay] = true;
        recurrenceModel.freq = 1;
        recurrenceModel.weeklyByDayOfWeek = days;
        EventRecurrence eventRecurrence = new EventRecurrence();
        RRuleUtil.copyModelToEventRecurrence(recurrenceModel, eventRecurrence);
        eventRecurrence.setStartDate(this.a);
        this.eventRecu.setValue(eventRecurrence);
    }

    public void setRrule(String rrule) {
        if (TextUtils.isEmpty(rrule)) {
            this.eventRecu.setValue(null);
            return;
        }
        EventRecurrence eventRecurrence = new EventRecurrence();
        eventRecurrence.parse(rrule);
        eventRecurrence.setStartDate(this.a);
        this.eventRecu.setValue(eventRecurrence);
    }

    public void setStartTime(long startTime) {
        this.a.set(startTime);
    }
}
