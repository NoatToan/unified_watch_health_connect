package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.arch.AlarmListViewModel;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmListViewModel extends AndroidViewModel {
    private MutableLiveData<List<Alarm>> a;

    public AlarmListViewModel(@NonNull Application application) {
        super(application);
        this.a = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(ExchangeCenter.queryAllAlarm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ActionResult actionResult) throws Exception {
        if (!actionResult.isSuccess()) {
            this.a.setValue(null);
        } else {
            this.a.setValue(UpdateParser.toAlarms(actionResult.resultData));
        }
    }

    public void addAlarm(Alarm alarm) {
        List<Alarm> value = this.a.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        value.add(alarm);
        this.a.setValue(value);
    }

    public void delAlarm(Alarm alarm) {
        List<Alarm> value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.remove(alarm);
        this.a.setValue(value);
    }

    public MutableLiveData<List<Alarm>> getAlarmListLiveData() {
        return this.a;
    }

    public void loadData() {
        Rx.io(new ObservableOnSubscribe() { // from class: db
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                AlarmListViewModel.c(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: eb
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.e((ActionResult) obj);
            }
        });
    }

    public void updateAlarm(Alarm alarm) {
        List<Alarm> value = this.a.getValue();
        if (value == null) {
            return;
        }
        value.remove(alarm);
        value.add(alarm);
        this.a.setValue(value);
    }
}
