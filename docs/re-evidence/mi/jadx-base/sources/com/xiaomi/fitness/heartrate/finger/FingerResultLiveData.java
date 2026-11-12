package com.xiaomi.fitness.heartrate.finger;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/FingerResultLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/heartrate/finger/HeartRateCmdResultLocal;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "onActive", "", LifecycleConstantKt.ON_RESUME, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "setHeartRateResultValue", "result", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FingerResultLiveData extends MutableLiveData<HeartRateCmdResultLocal> implements DefaultLifecycleObserver {
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        postValue(getValue());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        postValue(getValue());
    }

    public final void setHeartRateResultValue(@Nullable HeartRateCmdResultLocal result) {
        postValue(result);
    }
}
