package com.xiaomi.hm.health.device.setting.appsort.repo;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/AppSortRepoFactory;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/ISortRepo;", "createAppSortRepoApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppSortRepoFactory {

    @NotNull
    public static final AppSortRepoFactory INSTANCE = new AppSortRepoFactory();

    private AppSortRepoFactory() {
    }

    @NotNull
    public final ISortRepo createAppSortRepoApi(@NotNull Context context, @NotNull DeviceCenter deviceCenter) {
        return ConfigHelperKt.hasFeature(deviceCenter.getDeviceSource(), Feature.SUPPORT_READ_APP_SORT_FROM_DEVICE) ? new HuamiOSAppSortRepo(context, deviceCenter) : new DefaultAppSortRepo(context, deviceCenter);
    }
}
