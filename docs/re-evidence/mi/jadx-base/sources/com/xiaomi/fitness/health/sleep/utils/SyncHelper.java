package com.xiaomi.fitness.health.sleep.utils;

import com.xiaomi.fit.data.common.constant.SyncTriggerSource;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SyncHelper;", "", "<init>", "()V", "TAG", "", "syncServerWithCallback", "", "forceSync", "", "triggerSource", "callback", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncHelper {

    @NotNull
    public static final SyncHelper INSTANCE = new SyncHelper();

    @NotNull
    public static final String TAG = "SyncHelper";

    private SyncHelper() {
    }

    public final void syncServerWithCallback(boolean forceSync, @SyncTriggerSource @NotNull String triggerSource, @NotNull final WeakReference<FitnessServerSyncCallback> callback) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).syncWithServer(forceSync, triggerSource, new FitnessServerSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.utils.SyncHelper.syncServerWithCallback.1
            @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback
            public void onSyncResult(boolean success) {
                AnyExtKt.main$default(null, new SyncHelper$syncServerWithCallback$1$onSyncResult$1(callback, success, null), 1, null);
            }
        });
    }
}
