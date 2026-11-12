package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.assistant.arch.ScheduleViewModel;
import com.huami.assistant.event.SyncUpdateConfigEvent;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.AssistantConfigManager;
import com.huami.assistant.model.SyncPhoneInfoHelper;
import com.huami.assistant.model.UpdatesDataHelper;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceMainSwitchEvent;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleViewModel extends AndroidViewModel {
    private static final String e = "UpdatesViewModel";
    private static final int f = 18;
    private final UpdatesDataHelper a;
    private Disposable b;
    private Disposable c;
    private Disposable d;
    public final MutableLiveData<Result<Update>> deleteUpdateResult;
    public final MutableLiveData<List<Object>> updates;

    public ScheduleViewModel(@NonNull Application application) {
        super(application);
        this.updates = new MutableLiveData<>();
        this.deleteUpdateResult = new MutableLiveData<>();
        SyncPhoneInfoHelper.sync(application);
        this.a = new UpdatesDataHelper(application);
        loadData();
        t();
    }

    private void j(Disposable disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Update update, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Result.loading());
        observableEmitter.onNext(this.a.deleteUpdate(update) ? Result.success(update) : Result.error(update));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ObservableEmitter observableEmitter) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (UpdateType updateType : UpdateType.values()) {
            if (updateType.isVisible() && updateType.isDeviceSupport(getApplication()) && AssistantConfigManager.getInstance().isUpdatesVisible(getApplication(), updateType.typeId)) {
                arrayList.add(Integer.valueOf(updateType.typeId));
            }
        }
        observableEmitter.onNext(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource n(List list) throws Exception {
        return this.a.loadUpdates(list, DateDay.today().add(-3), 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Throwable th) throws Exception {
        HMLog.warn(e, th, new Function0() { // from class: wj6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ScheduleViewModel.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Object obj) throws Exception {
        Log.d(e, "Event : " + obj, new Object[0]);
        if ((obj instanceof UpdateRefreshEvent) || (obj instanceof SyncUpdateConfigEvent) || (obj instanceof ConnectedEvent) || (obj instanceof DeviceMainSwitchEvent)) {
            loadData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Throwable th) throws Exception {
        HMLog.warn(e, th, new Function0() { // from class: vj6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ScheduleViewModel.r();
            }
        });
    }

    private void t() {
        this.b = RxBus.get().toObservable().subscribe(new Consumer() { // from class: rj6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.q(obj);
            }
        }, new Consumer() { // from class: sj6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ScheduleViewModel.s((Throwable) obj);
            }
        });
    }

    public void deleteUpdate(@NonNull final Update update) {
        Rx.RxBuilder rxBuilderIo = Rx.io(new ObservableOnSubscribe() { // from class: oj6
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.k(update, observableEmitter);
            }
        });
        MutableLiveData<Result<Update>> mutableLiveData = this.deleteUpdateResult;
        Objects.requireNonNull(mutableLiveData);
        this.d = rxBuilderIo.safeSubscribe(new pj6(mutableLiveData));
    }

    public void loadData() {
        Observable observableFlatMap = Rx.io(new ObservableOnSubscribe() { // from class: nj6
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.m(observableEmitter);
            }
        }).observable().flatMap(new Function() { // from class: uj6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.n((List) obj);
            }
        });
        MutableLiveData<List<Object>> mutableLiveData = this.updates;
        Objects.requireNonNull(mutableLiveData);
        this.c = observableFlatMap.subscribe(new qj6(mutableLiveData), new Consumer() { // from class: tj6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ScheduleViewModel.p((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        j(this.b);
        j(this.c);
        j(this.d);
    }
}
