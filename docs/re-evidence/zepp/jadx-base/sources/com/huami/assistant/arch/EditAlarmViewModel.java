package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.assistant.alarm.Alarm;

/* JADX INFO: loaded from: classes5.dex */
public class EditAlarmViewModel extends AndroidViewModel {
    private MutableLiveData<Alarm> a;

    public EditAlarmViewModel(@NonNull Application application) {
        super(application);
        MutableLiveData<Alarm> mutableLiveData = new MutableLiveData<>();
        this.a = mutableLiveData;
        mutableLiveData.setValue(new Alarm());
    }

    public LiveData<Alarm> getAlarm() {
        return this.a;
    }

    public void setAlarm(@NonNull Alarm alarm) {
        this.a.setValue(alarm);
    }

    public void setDays(int days) {
        Alarm value = this.a.getValue();
        if (value == null) {
            value = new Alarm();
        }
        if (days != value.days) {
            value.days = days;
            this.a.postValue(value);
        }
    }

    public void setEnable(boolean enable) {
        Alarm value = this.a.getValue();
        if (value == null) {
            value = new Alarm();
        }
        if (enable != value.enabled) {
            value.enabled = enable;
            this.a.postValue(value);
        }
    }

    public void setTime(int hour, int minutes) {
        Alarm value = this.a.getValue();
        if (value == null) {
            value = new Alarm();
        }
        if (hour == value.hour && minutes == value.minutes) {
            return;
        }
        value.hour = hour;
        value.minutes = minutes;
        this.a.postValue(value);
    }
}
