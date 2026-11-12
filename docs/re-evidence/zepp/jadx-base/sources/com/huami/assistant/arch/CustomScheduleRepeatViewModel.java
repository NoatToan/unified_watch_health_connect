package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.assistant.calendar.RecurrenceModel;

/* JADX INFO: loaded from: classes5.dex */
public class CustomScheduleRepeatViewModel extends AndroidViewModel {
    private MutableLiveData<RecurrenceModel> a;

    public CustomScheduleRepeatViewModel(@NonNull Application application) {
        super(application);
        this.a = new MutableLiveData<>();
    }

    private RecurrenceModel a() {
        RecurrenceModel recurrenceModel = new RecurrenceModel();
        recurrenceModel.freq = 0;
        recurrenceModel.interval = 1;
        return recurrenceModel;
    }

    public LiveData<RecurrenceModel> getModel() {
        return this.a;
    }

    public void initData(int frequency, int interval) {
        RecurrenceModel recurrenceModelA = a();
        recurrenceModelA.freq = frequency;
        recurrenceModelA.interval = interval;
        this.a.postValue(recurrenceModelA);
    }

    public void setInterval(int interval) {
        RecurrenceModel value = this.a.getValue();
        if (value == null) {
            value = a();
        }
        value.interval = interval;
        this.a.postValue(value);
    }

    public void setModel(@NonNull RecurrenceModel model) {
        this.a.postValue(model);
    }

    public void setRepeatType(int repeatType) {
        RecurrenceModel value = this.a.getValue();
        if (value == null) {
            value = a();
        }
        value.freq = repeatType;
        this.a.postValue(value);
    }
}
