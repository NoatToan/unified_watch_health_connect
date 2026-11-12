package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.assistant.arch.UpdatesViewModel;
import com.huami.assistant.event.SyncUpdateConfigEvent;
import com.huami.assistant.event.UpdatePinEvent;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.AssistantConfigManager;
import com.huami.assistant.model.PinDataHelper;
import com.huami.assistant.model.SyncPhoneInfoHelper;
import com.huami.assistant.model.UpdatesDataHelper;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.assistant.util.PinUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceMainSwitchEvent;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import defpackage.pj6;
import defpackage.qj6;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesViewModel extends AndroidViewModel {
    private static final String i = "UpdatesViewModel";
    private static final int j = 5;
    private UpdatesDataHelper a;
    public final MutableLiveData<Result<Update>> addPinResult;
    private PinDataHelper b;
    private Disposable c;
    private Disposable d;
    public final MutableLiveData<Result<Update>> deletePinResult;
    public final MutableLiveData<Result<Update>> deleteUpdateResult;
    private Disposable e;
    private Disposable f;
    private Disposable g;
    private Disposable h;
    public final MutableLiveData<List<Object>> updates;

    public UpdatesViewModel(@NonNull Application application) {
        super(application);
        this.updates = new MutableLiveData<>();
        this.deleteUpdateResult = new MutableLiveData<>();
        this.addPinResult = new MutableLiveData<>();
        this.deletePinResult = new MutableLiveData<>();
        SyncPhoneInfoHelper.sync(application);
        this.a = new UpdatesDataHelper(application);
        this.b = new PinDataHelper(getApplication());
        loadData();
        z();
    }

    private void A() {
        List<Update> pinData = UpdatesManager.getManager().getPinData();
        n(this.h);
        if (ArraysUtil.isEmpty(pinData)) {
            return;
        }
        Update update = pinData.get(0);
        long pinExpiredTime = PinUtil.getPinExpiredTime(update);
        if (pinExpiredTime > 0) {
            this.h = Schedulers.io().scheduleDirect(new Runnable() { // from class: a58
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.loadData();
                }
            }, pinExpiredTime, TimeUnit.MILLISECONDS);
        } else {
            update.setPin(false);
            UpdatesManager.getManager().updatePinData(update);
        }
    }

    private void n(Disposable disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Update update, int i2, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Result.loading());
        observableEmitter.onNext(PinUtil.isUpdateHasPin(update) ? this.b.updatePin(update, i2) : this.b.addPin(update, i2) ? Result.success(update) : Result.error(update));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Update update, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Result.loading());
        observableEmitter.onNext(this.b.deletePin(update) ? Result.success(update) : Result.error(update));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Update update, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Result.loading());
        observableEmitter.onNext(this.a.deleteUpdate(update) ? Result.success(update) : Result.error(update));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(ObservableEmitter observableEmitter) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (UpdateType updateType : UpdateType.values()) {
            if (updateType.isVisible() && updateType.isDeviceSupport(getApplication()) && AssistantConfigManager.getInstance().isUpdatesVisible(getApplication(), updateType.typeId)) {
                arrayList.add(Integer.valueOf(updateType.typeId));
            }
        }
        observableEmitter.onNext(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource s(List list) throws Exception {
        return this.a.loadUpdates(list, DateDay.today().add(-2), 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(List list) throws Exception {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Throwable th) throws Exception {
        HMLog.warn(i, th, new Function0() { // from class: r48
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdatesViewModel.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Object obj) throws Exception {
        Log.d(i, "Event : " + obj, new Object[0]);
        if ((obj instanceof UpdateRefreshEvent) || (obj instanceof UpdatePinEvent) || (obj instanceof SyncUpdateConfigEvent) || (obj instanceof ConnectedEvent) || (obj instanceof DeviceMainSwitchEvent)) {
            loadData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Throwable th) throws Exception {
        HMLog.warn(i, th, new Function0() { // from class: q48
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdatesViewModel.x();
            }
        });
    }

    private void z() {
        this.c = RxBus.get().toObservable().subscribe(new Consumer() { // from class: w48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.w(obj);
            }
        }, new Consumer() { // from class: x48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UpdatesViewModel.y((Throwable) obj);
            }
        });
    }

    public void addPin(@NonNull final Update update, final int minute) {
        Rx.RxBuilder rxBuilderIo = Rx.io(new ObservableOnSubscribe() { // from class: u48
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.o(update, minute, observableEmitter);
            }
        });
        MutableLiveData<Result<Update>> mutableLiveData = this.addPinResult;
        Objects.requireNonNull(mutableLiveData);
        this.f = rxBuilderIo.safeSubscribe(new pj6(mutableLiveData));
    }

    public void deletePin(@NonNull final Update update) {
        Rx.RxBuilder rxBuilderIo = Rx.io(new ObservableOnSubscribe() { // from class: t48
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.p(update, observableEmitter);
            }
        });
        MutableLiveData<Result<Update>> mutableLiveData = this.deletePinResult;
        Objects.requireNonNull(mutableLiveData);
        this.g = rxBuilderIo.safeSubscribe(new pj6(mutableLiveData));
    }

    public void deleteUpdate(@NonNull final Update update) {
        Rx.RxBuilder rxBuilderIo = Rx.io(new ObservableOnSubscribe() { // from class: s48
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.q(update, observableEmitter);
            }
        });
        MutableLiveData<Result<Update>> mutableLiveData = this.deleteUpdateResult;
        Objects.requireNonNull(mutableLiveData);
        this.e = rxBuilderIo.safeSubscribe(new pj6(mutableLiveData));
    }

    public void loadData() {
        Observable observableDoOnNext = Rx.io(new ObservableOnSubscribe() { // from class: p48
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.r(observableEmitter);
            }
        }).observable().flatMap(new Function() { // from class: z48
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.s((List) obj);
            }
        }).doOnNext(new Consumer() { // from class: v48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.t((List) obj);
            }
        });
        MutableLiveData<List<Object>> mutableLiveData = this.updates;
        Objects.requireNonNull(mutableLiveData);
        this.d = observableDoOnNext.subscribe(new qj6(mutableLiveData), new Consumer() { // from class: y48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UpdatesViewModel.v((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        n(this.c);
        n(this.d);
        n(this.e);
        n(this.f);
        n(this.g);
        n(this.h);
    }
}
