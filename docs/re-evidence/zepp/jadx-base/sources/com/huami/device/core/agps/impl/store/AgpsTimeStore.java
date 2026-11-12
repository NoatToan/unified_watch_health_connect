package com.huami.device.core.agps.impl.store;

import com.huami.passport.Configs;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xmlywind.sdk.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "", "", Constants.IS_EXPIRED, "", "getAgpsUpdateTime", "time", "", "setAgpsUpdateTime", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", com.xiaomi.market.sdk.Constants.JSON_FEATURE, "getAGPSExpireTime", AuthHandler.d, "setAutoAgpsCheckTime", "getAutoAgpsCheckTime", Configs.Params.RESET, "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public interface AgpsTimeStore {
    long getAGPSExpireTime(@Nullable Feature feature);

    long getAgpsUpdateTime();

    long getAutoAgpsCheckTime();

    boolean isExpired();

    void reset();

    void setAgpsUpdateTime(long time);

    void setAutoAgpsCheckTime(long ts);
}
