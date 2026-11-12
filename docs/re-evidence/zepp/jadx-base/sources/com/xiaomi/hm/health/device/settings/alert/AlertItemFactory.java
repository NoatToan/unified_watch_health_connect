package com.xiaomi.hm.health.device.settings.alert;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "Lcom/xiaomi/hm/health/device/settings/alert/Item;", "create", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AlertItemFactory {
    @NotNull
    List<Item> create(@NotNull HMDeviceSource source);
}
