package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "", "", "deviceId", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", Constants.JSON_FEATURE, "", "get", "(Ljava/lang/String;Lcom/xiaomi/hm/health/device/setting/SoftFeature;)Ljava/lang/Boolean;", "value", "", "cache", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SoftFeatureCache {
    void cache(@NotNull String deviceId, @NotNull SoftFeature feature, boolean value);

    @Nullable
    Boolean get(@NotNull String deviceId, @NotNull SoftFeature feature);
}
