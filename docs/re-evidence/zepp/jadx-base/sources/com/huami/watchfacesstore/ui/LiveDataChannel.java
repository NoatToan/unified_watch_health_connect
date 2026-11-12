package com.huami.watchfacesstore.ui;

import androidx.p008lifecycle.MutableLiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/ui/LiveDataChannel;", "", "", "resetLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getCollectLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setCollectLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "collectLiveData", "Ljava/lang/Void;", "b", "getLocalWatchLiveData", "setLocalWatchLiveData", "localWatchLiveData", "c", "getOperateWatchLiveData", "setOperateWatchLiveData", "operateWatchLiveData", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LiveDataChannel {

    @NotNull
    public static final LiveDataChannel INSTANCE = new LiveDataChannel();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static MutableLiveData<Boolean> collectLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static MutableLiveData<Void> localWatchLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static MutableLiveData<Void> operateWatchLiveData = new MutableLiveData<>();

    private LiveDataChannel() {
    }

    @NotNull
    public final MutableLiveData<Boolean> getCollectLiveData() {
        return collectLiveData;
    }

    @NotNull
    public final MutableLiveData<Void> getLocalWatchLiveData() {
        return localWatchLiveData;
    }

    @NotNull
    public final MutableLiveData<Void> getOperateWatchLiveData() {
        return operateWatchLiveData;
    }

    public final void resetLiveData() {
        collectLiveData = new MutableLiveData<>();
        localWatchLiveData = new MutableLiveData<>();
        operateWatchLiveData = new MutableLiveData<>();
    }

    public final void setCollectLiveData(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        collectLiveData = mutableLiveData;
    }

    public final void setLocalWatchLiveData(@NotNull MutableLiveData<Void> mutableLiveData) {
        localWatchLiveData = mutableLiveData;
    }

    public final void setOperateWatchLiveData(@NotNull MutableLiveData<Void> mutableLiveData) {
        operateWatchLiveData = mutableLiveData;
    }
}
