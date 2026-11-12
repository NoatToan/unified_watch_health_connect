package com.xiaomi.hm.health.devicex.inject;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/devicex/inject/DeviceFeatureDependsImpl;", "Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "preInitDeviceRecorder", "", "supportAlexa", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceFeatureDependsImpl implements IDeviceFeatureDepends {
    @Override // com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends
    public void preInitDeviceRecorder(@NotNull Context context) {
    }

    @Override // com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends
    public boolean supportAlexa(@NotNull Context context) {
        return CheckDeviceSupportAlexaKt.isLoginCountryAndDeviceSupportAlexa(context);
    }
}
