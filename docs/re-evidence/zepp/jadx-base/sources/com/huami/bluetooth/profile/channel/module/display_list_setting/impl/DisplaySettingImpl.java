package com.huami.bluetooth.profile.channel.module.display_list_setting.impl;

import com.huami.bluetooth.profile.channel.module.display_list_setting.IDisplayListSettingApi;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/impl/DisplaySettingImpl;", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/IDisplayListSettingApi;", "", "type", "", "Lcom/xiaomi/hm/health/bt/profile/page/PageItem;", "getDisplayItems", "items", "", "setDisplayItems", "Lcom/xiaomi/hm/health/bt/profile/milipro/DisplaySetting;", "displaySetting", "setDisplaySetting", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DisplaySettingImpl implements IDisplayListSettingApi {

    @NotNull
    private static final String b = "DisplaySettingImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    public DisplaySettingImpl(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        return this.device;
    }

    @Override // com.huami.bluetooth.profile.channel.module.display_list_setting.IDisplayListSettingApi
    @Nullable
    public List<PageItem> getDisplayItems(int type) {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.display_list_setting.IDisplayListSettingApi
    public boolean setDisplayItems(@NotNull List<? extends PageItem> items) {
        HMBaseDevice hMBaseDevice = this.device;
        if (hMBaseDevice instanceof HMMiLiProDevice) {
            return ((HMMiLiProDevice) hMBaseDevice).setPagesSyncInternal(items);
        }
        Debug.fi(b, "设备不支持设置应用排序");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.display_list_setting.IDisplayListSettingApi
    public boolean setDisplaySetting(@NotNull DisplaySetting displaySetting) {
        HMBaseDevice hMBaseDevice = this.device;
        if (hMBaseDevice instanceof HMMiLiProDevice) {
            return ((HMMiLiProDevice) hMBaseDevice).setDisplaySettingSyncInternal(displaySetting);
        }
        Debug.fi(b, "设备不支持设置应用排序");
        return false;
    }
}
