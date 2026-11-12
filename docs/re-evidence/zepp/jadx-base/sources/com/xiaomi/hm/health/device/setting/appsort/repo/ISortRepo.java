package com.xiaomi.hm.health.device.setting.appsort.repo;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppGroup;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&R\u0016\u0010\u000e\u001a\u00020\u000b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/ISortRepo;", "", "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppGroup;", "groups", "", "saveToDeviceAndDb", "getAppGroup", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "getConditions", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ISortRepo {
    @Nullable
    List<AppGroup> getAppGroup();

    @NotNull
    List<Object> getConditions(@NotNull HMDeviceSource source);

    @NotNull
    Context getContext();

    @NotNull
    DeviceCenter getDeviceCenter();

    boolean saveToDeviceAndDb(@NotNull List<AppGroup> groups);
}
