package com.xiaomi.hm.health.device.setting.life;

import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/LifeCycleFilter;", "", "", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "proxyList", "filterProxies", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "subscriber", "filterSubscriber", "filterConnectSubscribers", "filterHealthSubscribers", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface LifeCycleFilter {
    @NotNull
    List<BleEventSubscriber> filterConnectSubscribers(@NotNull List<? extends BleEventSubscriber> subscriber);

    @NotNull
    List<BleEventSubscriber> filterHealthSubscribers(@NotNull List<? extends BleEventSubscriber> subscriber);

    @NotNull
    List<DeviceLifeCycle> filterProxies(@NotNull List<? extends DeviceLifeCycle> proxyList);

    @NotNull
    List<BleEventSubscriber> filterSubscriber(@NotNull List<? extends BleEventSubscriber> subscriber);
}
