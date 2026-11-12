package com.xiaomi.wearable.mass;

import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.wear.api.WearApiCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\f\u001a\u00020\u0007J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/wearable/mass/RunningMassManager;", "", "<init>", "()V", "runningApiCall", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "runningTaskId", "", "isRunning", "", "openMassTask", "apiCall", "taskId", "sendMassData", "", "massId", "data", "", "callback", "Lcom/xiaomi/wearable/core/ICallback;", "timeout", "cancelMassTask", "clearRunningMassTask", "TAG", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningMassManager {

    @NotNull
    private static final String TAG = "RunningMassManager";

    @Nullable
    private static volatile WearApiCall<?> runningApiCall;

    @NotNull
    public static final RunningMassManager INSTANCE = new RunningMassManager();
    private static volatile int runningTaskId = -1;

    private RunningMassManager() {
    }

    public final void cancelMassTask(int taskId) {
        CoreExtKt.getLogger().i(TAG, "cancelMassTask() called with: taskId = " + taskId);
        if (taskId != runningTaskId) {
            CoreExtKt.getLogger().e(TAG, "cancelMassTask " + taskId);
            return;
        }
        if (runningApiCall == null) {
            return;
        }
        WearApiCall<?> wearApiCall = runningApiCall;
        if (wearApiCall != null) {
            wearApiCall.cancel(taskId);
        }
        runningApiCall = null;
        runningTaskId = -1;
    }

    public final void clearRunningMassTask() {
        CoreExtKt.getLogger().i(TAG, "clearRunningMassTask() called " + runningTaskId);
        if (runningTaskId != -1) {
            cancelMassTask(runningTaskId);
        }
    }

    public final boolean isRunning() {
        return runningApiCall != null;
    }

    public final boolean openMassTask(@NotNull WearApiCall<?> apiCall, int taskId) {
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        CoreExtKt.getLogger().i(TAG, "openMassTask() called with: apiCall = " + apiCall + ", taskId = " + taskId + ", isRunning = " + isRunning());
        if (isRunning()) {
            return false;
        }
        runningApiCall = apiCall;
        runningTaskId = taskId;
        return true;
    }

    public final void sendMassData(int massId, @NotNull byte[] data, @NotNull ICallback callback, int timeout) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i(TAG, "sendMassData() called with: massId = " + massId + ", data = " + data + ", callback = " + callback + ", timeout = " + timeout);
        if (massId != runningTaskId) {
            callback.onCallback(new WearApiResult(-2));
            return;
        }
        if (runningApiCall == null) {
            callback.onCallback(new WearApiResult(-2));
            return;
        }
        WearApiCall<?> wearApiCall = runningApiCall;
        if (wearApiCall != null) {
            wearApiCall.massCall(massId, 104, data, false, callback, timeout);
        }
    }
}
