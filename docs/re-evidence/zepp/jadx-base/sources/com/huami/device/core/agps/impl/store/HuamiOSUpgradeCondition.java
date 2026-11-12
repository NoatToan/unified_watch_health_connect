package com.huami.device.core.agps.impl.store;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/device/core/agps/impl/store/HuamiOSUpgradeCondition;", "Lcom/huami/device/core/agps/impl/store/AGPSUpgradeCondition;", "", "needUpgrade", "", "a", "J", "upgradeTime", "b", SDKConstants.PARAM_EXPIRATION_TIME, "<init>", "(JJ)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiOSUpgradeCondition implements AGPSUpgradeCondition {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long upgradeTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long expirationTime;

    public HuamiOSUpgradeCondition(long j, long j2) {
        this.upgradeTime = j;
        this.expirationTime = j2;
    }

    @Override // com.huami.device.core.agps.impl.store.AGPSUpgradeCondition
    public boolean needUpgrade() {
        return Calendar.getInstance().getTimeInMillis() - this.expirationTime >= TimeUnit.MINUTES.toMillis(20L);
    }
}
