package com.xiaomi.hm.health.device.earbud.viewmodel;

import android.os.Handler;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.device.earbud.viewmodel.RestLiveData;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\b\u001a\u00020\u0003R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/RestLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/RestModeInfo;", "", "c", "value", "setValue", "startTask", "cancelTask", "Landroid/os/Handler;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "mTask", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/disposables/Disposable;", "mDisposable", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RestLiveData extends MutableLiveData<RestModeInfo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Runnable mTask;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable mDisposable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Handler> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler();
        }
    }

    private final void c() {
        RestModeInfo value = getValue();
        if (value != null) {
            if (!(value.getTime() > 0 && value.getRemainTime() > 0)) {
                value = null;
            }
            if (value != null) {
                RestModeInfo restModeInfo = new RestModeInfo();
                restModeInfo.setTime(value.getTime());
                value.setRemainTime(value.getRemainTime() - 1);
                restModeInfo.setRemainTime(value.getRemainTime());
                Unit unit = Unit.INSTANCE;
                postValue(restModeInfo);
            }
        }
        RestModeInfo value2 = getValue();
        if (value2 == null) {
            return;
        }
        if ((value2.getTime() > 0 && value2.getRemainTime() > 0 ? null : value2) == null) {
            return;
        }
        cancelTask();
    }

    private final Handler d() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RestLiveData restLiveData, Long l) {
        restLiveData.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Throwable th) {
        th.printStackTrace();
    }

    public final void cancelTask() {
        Runnable runnable = this.mTask;
        if (runnable != null) {
            d().removeCallbacks(runnable);
            this.mTask = null;
        }
        Disposable disposable = this.mDisposable;
        if (disposable == null) {
            return;
        }
        Disposable disposable2 = disposable.isDisposed() ? null : disposable;
        if (disposable2 == null) {
            return;
        }
        disposable2.dispose();
    }

    public final void startTask(@Nullable RestModeInfo value) {
        cancelTask();
        postValue(value);
        if (value == null) {
            return;
        }
        if (!(value.getTime() > 0 && value.getRemainTime() > 0)) {
            value = null;
        }
        if (value == null) {
            return;
        }
        this.mDisposable = Observable.interval(1L, 1L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: ee6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RestLiveData.e(this.a, (Long) obj);
            }
        }, new Consumer() { // from class: fe6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RestLiveData.f((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.MutableLiveData, androidx.p008lifecycle.LiveData
    public void setValue(@Nullable RestModeInfo value) {
        super.setValue(value);
        if (value == null) {
            cancelTask();
        }
    }
}
