package com.xiaomi.fit.fitness.sync.export.api;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0005H&¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncer;", "syncData", "", "sid", "", "dataIds", "", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "data", "triggerDataSync", "manualForce", "", "triggerDataSyncByWidget", "testDeviceSync", "isBgAuto", "isBloodSugarThirdParty", "packageName", "Companion", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessSyncer extends DeviceSyncer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer$Companion;", "", "<init>", "()V", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void triggerDataSyncByWidget(@NotNull FitnessSyncer fitnessSyncer, boolean z) {
        }
    }

    boolean isBloodSugarThirdParty(@NotNull String packageName);

    void syncData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull byte[] data);

    void syncData(@NotNull String sid, @NotNull byte[] dataIds, @Nullable DeviceSyncCallback callBack);

    void testDeviceSync(boolean isBgAuto);

    void triggerDataSync(boolean manualForce);

    void triggerDataSyncByWidget(boolean manualForce);
}
