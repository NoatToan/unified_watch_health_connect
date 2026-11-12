package com.xiaomi.fitness.devicesettings.base;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.n1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "loadingMsg", "", "getLoadingMsg", "()Ljava/lang/String;", "setLoadingMsg", "(Ljava/lang/String;)V", "loadStatus", "Landroidx/lifecycle/MutableLiveData;", "", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "observerLoadStatus", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "postLoadStatus", "status", "postDataOnLoading", "postDataLoaded", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseLoadableBindingViewModel extends AbsViewModel {
    public static final int LOAD_STATUS_FIRMWARE_NOT_SUPPORT = 4;
    public static final int LOAD_STATUS_INITIALIZE = -1;
    public static final int LOAD_STATUS_LOADED = 2;
    public static final int LOAD_STATUS_LOADING = 1;
    public static final int LOAD_STATUS_LOAD_ERROR = 3;
    public static final int LOAD_STATUS_SET_ERROR = 5;

    @NotNull
    private String loadingMsg = ResourceExtKt.getString(n1j.f);

    @NotNull
    private final MutableLiveData<Integer> loadStatus = new MutableLiveData<>(-1);

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final String getLoadingMsg() {
        return this.loadingMsg;
    }

    public final void observerLoadStatus(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<Integer> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.loadStatus.observe(lifecycleOwner, observer);
    }

    public final void postDataLoaded() {
        this.loadStatus.postValue(2);
    }

    public final void postDataOnLoading() {
        this.loadStatus.postValue(1);
    }

    public final void postLoadStatus(int status) {
        this.loadStatus.postValue(Integer.valueOf(status));
    }

    public final void setLoadingMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loadingMsg = str;
    }
}
