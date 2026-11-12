package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/PaiGoalDataHelper;", "Lcom/xiaomi/fit/fitness/sync/export/api/PaiDataInterface;", "<init>", "()V", "getPaiTargetDisparity", "", "getPaiSuggestHr", "getPaiSuggestTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaiGoalDataHelper implements PaiDataInterface {
    @Override // com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface
    public int getPaiSuggestHr() {
        return FitnessPreference.INSTANCE.getPaiSuggestHr();
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface
    public int getPaiSuggestTime() {
        return FitnessPreference.INSTANCE.getPaiSuggestTime();
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface
    public int getPaiTargetDisparity() {
        return FitnessPreference.INSTANCE.getPaiTargetDisparity();
    }
}
