package com.xiaomi.hm.health.device.earbud.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.device.earbud.viewmodel.TomatoLiveData;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\b\u001a\u00020\u0003R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/TomatoLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/TomatoModeInfo;", "", "c", "value", "setValue", "startTask", "cancelTask", "", "a", "Z", "isRest", "()Z", "setRest", "(Z)V", "Lio/reactivex/disposables/Disposable;", "b", "Lio/reactivex/disposables/Disposable;", "mDisposable", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TomatoLiveData extends MutableLiveData<TomatoModeInfo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isRest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Disposable mDisposable;

    private final void c() {
        TomatoModeInfo value = getValue();
        if (value == null) {
            return;
        }
        if (value.getTime() <= 0 || value.getRestTime() <= 0) {
            value = null;
        }
        if (value == null) {
            return;
        }
        int remainTime = value.getRemainTime();
        int restRemainTime = value.getRestRemainTime();
        if (getIsRest()) {
            restRemainTime--;
            if (restRemainTime == 0) {
                remainTime = value.getTime();
                setRest(false);
            }
        } else {
            remainTime--;
            if (remainTime == 0) {
                restRemainTime = value.getRestTime();
                setRest(true);
            }
        }
        TomatoModeInfo tomatoModeInfo = new TomatoModeInfo();
        tomatoModeInfo.setTime(value.getTime());
        tomatoModeInfo.setRestTime(value.getRestTime());
        tomatoModeInfo.setRemainTime(remainTime);
        tomatoModeInfo.setRestRemainTime(restRemainTime);
        Unit unit = Unit.INSTANCE;
        super.postValue(tomatoModeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(TomatoLiveData tomatoLiveData, Long l) {
        tomatoLiveData.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Throwable th) {
        th.printStackTrace();
    }

    public final void cancelTask() {
        Disposable disposable = this.mDisposable;
        if (disposable == null) {
            return;
        }
        if (disposable.isDisposed()) {
            disposable = null;
        }
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    /* JADX INFO: renamed from: isRest, reason: from getter */
    public final boolean getIsRest() {
        return this.isRest;
    }

    public final void setRest(boolean z) {
        this.isRest = z;
    }

    public final void startTask(@Nullable TomatoModeInfo value) {
        cancelTask();
        postValue(value);
        if (value == null) {
            return;
        }
        if (value.getTime() <= 0 || value.getRestTime() <= 0) {
            value = null;
        }
        if (value == null) {
            return;
        }
        this.mDisposable = Observable.interval(1L, 1L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: cr7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TomatoLiveData.d(this.a, (Long) obj);
            }
        }, new Consumer() { // from class: dr7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TomatoLiveData.e((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.MutableLiveData, androidx.p008lifecycle.LiveData
    public void setValue(@Nullable TomatoModeInfo value) {
        super.setValue(value);
        if (value == null) {
            cancelTask();
        }
    }
}
