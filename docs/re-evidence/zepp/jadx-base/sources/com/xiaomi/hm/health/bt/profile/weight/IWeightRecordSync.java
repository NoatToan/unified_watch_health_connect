package com.xiaomi.hm.health.bt.profile.weight;

import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weight/IWeightRecordSync;", "", "Ljava/util/UUID;", "getSyncServiceUUID", "getSyncCharacteristicUUID", "Lcom/xiaomi/hm/health/bt/profile/weight/IWeightRecordParser;", "getRecordParser", "", "getIdLen", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IWeightRecordSync {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static int getIdLen(@NotNull IWeightRecordSync iWeightRecordSync) {
            return 4;
        }
    }

    int getIdLen();

    @NotNull
    IWeightRecordParser getRecordParser();

    @NotNull
    UUID getSyncCharacteristicUUID();

    @NotNull
    UUID getSyncServiceUUID();
}
