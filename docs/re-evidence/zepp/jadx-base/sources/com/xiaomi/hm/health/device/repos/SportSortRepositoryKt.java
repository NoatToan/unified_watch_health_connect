package com.xiaomi.hm.health.device.repos;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.device.repos.SportSortRepositoryKt;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t\u001a\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\"\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "config", "", "updateSportTypeConfig", "Lcom/xiaomi/hm/health/device/repos/OnSaveCallback;", "callback", "setSportTypeConfig", "Lio/reactivex/disposables/Disposable;", "compositeDisposable", "g", "", "a", "Ljava/lang/String;", "TAG", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class SportSortRepositoryKt {

    @NotNull
    private static final String a = "SportSortRepository";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    private static final void g(Disposable disposable, CompositeDisposable compositeDisposable) {
        compositeDisposable.add(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(HMMiLiProDevice hMMiLiProDevice, SportTypeConfig sportTypeConfig) {
        return Boolean.valueOf(hMMiLiProDevice.sendSportTypeSort(sportTypeConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(OnSaveCallback onSaveCallback, Boolean bool) {
        HMLog.info(a, new a(bool));
        onSaveCallback.onResult(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(OnSaveCallback onSaveCallback, Throwable th) {
        onSaveCallback.onResult(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportTypeConfig k(HMMiLiProDevice hMMiLiProDevice) {
        return hMMiLiProDevice.getSportTypeConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MutableLiveData mutableLiveData, SportTypeConfig sportTypeConfig) {
        if (sportTypeConfig == null) {
            return;
        }
        mutableLiveData.postValue(sportTypeConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    public static final void setSportTypeConfig(@NotNull HMDeviceType hMDeviceType, @NotNull CompositeDisposable compositeDisposable, @NotNull final SportTypeConfig sportTypeConfig, @NotNull final OnSaveCallback onSaveCallback) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        g(Observable.fromCallable(new Callable() { // from class: sc7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportSortRepositoryKt.h(hMMiLiProDevice, sportTypeConfig);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: oc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportSortRepositoryKt.i(onSaveCallback, (Boolean) obj);
            }
        }, new Consumer() { // from class: pc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportSortRepositoryKt.j(onSaveCallback, (Throwable) obj);
            }
        }), compositeDisposable);
    }

    public static final void updateSportTypeConfig(@NotNull HMDeviceType hMDeviceType, @NotNull CompositeDisposable compositeDisposable, @NotNull final MutableLiveData<SportTypeConfig> mutableLiveData) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        g(Observable.fromCallable(new Callable() { // from class: rc7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportSortRepositoryKt.k(hMMiLiProDevice);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: nc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportSortRepositoryKt.l(mutableLiveData, (SportTypeConfig) obj);
            }
        }, new Consumer() { // from class: qc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportSortRepositoryKt.m((Throwable) obj);
            }
        }), compositeDisposable);
    }
}
