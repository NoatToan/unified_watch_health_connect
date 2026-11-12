package com.xiaomi.hm.health.utils;

import com.xiaomi.hm.health.device.setting.network.repo.IPropertyUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/utils/PropertyImpl;", "Lcom/xiaomi/hm/health/device/setting/network/repo/IPropertyUtil;", "", "key", "getProperty", "value", "", "setProperty", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PropertyImpl implements IPropertyUtil {
    @Override // com.xiaomi.hm.health.device.setting.network.repo.IPropertyUtil
    @Nullable
    public String getProperty(@NotNull String key) {
        return HMPropertyUtil.getProperty(key, "");
    }

    @Override // com.xiaomi.hm.health.device.setting.network.repo.IPropertyUtil
    public void setProperty(@NotNull String key, @NotNull String value) {
        HMPropertyUtil.setProperty(key, value);
    }
}
