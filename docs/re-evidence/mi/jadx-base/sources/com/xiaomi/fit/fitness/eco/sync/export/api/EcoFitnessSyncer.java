package com.xiaomi.fit.fitness.eco.sync.export.api;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "syncData", "", "sid", "", "dataIds", "", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "data", "dataIdBytes", "addSyncResultListener", "Companion", "fitness-eco-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoFitnessSyncer extends EcoDeviceSyncer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer$Companion;", "", "<init>", "()V", "fitness-eco-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addSyncResultListener(@NotNull String sid, @Nullable EcoDeviceSyncCallback callBack);

    void syncData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull byte[] data);

    void syncData(@NotNull String sid, @NotNull byte[] dataIds, @Nullable EcoDeviceSyncCallback callBack);

    void syncData(@NotNull String sid, @NotNull byte[] dataIdBytes, @NotNull byte[] data);
}
