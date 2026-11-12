package com.huami.device.core.agps.impl.strategy;

import com.huami.device.core.agps.api.NeedUpgradeStrategy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huami/device/core/agps/impl/strategy/UpgradeStrategy;", "Lcom/huami/device/core/agps/api/NeedUpgradeStrategy;", "", "isNeedUpdate", "<init>", "()V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class UpgradeStrategy implements NeedUpgradeStrategy {
    @Override // com.huami.device.core.agps.api.NeedUpgradeStrategy
    public boolean isNeedUpdate() {
        return true;
    }
}
