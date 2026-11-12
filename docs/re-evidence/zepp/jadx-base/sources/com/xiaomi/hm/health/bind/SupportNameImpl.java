package com.xiaomi.hm.health.bind;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchDeviceWebAPI;
import com.xiaomi.hm.health.device.amazfit_watch.model.DeviceCloudConfig;
import com.xiaomi.hm.health.device.bind.HMBindMiLiLogic;
import com.xiaomi.hm.health.device.bind.SupportNameApi;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bind/SupportNameImpl;", "Lcom/xiaomi/hm/health/device/bind/SupportNameApi;", "", "", "a", "", PointCategory.INIT, "Lcom/xiaomi/hm/health/bt/scan/AdvData;", "advData", "", "isMatch", "", "Ljava/util/List;", "supportNames", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SupportNameImpl implements SupportNameApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> supportNames = new ArrayList();

    private final List<String> a() {
        DeviceCloudConfig deviceConfigSync = HMWatchDeviceWebAPI.getDeviceConfigSync(HMWatchDeviceWebAPI.PARAM_BIND_ENTRY_CONFIG);
        boolean z = deviceConfigSync != null && deviceConfigSync.isOn(HMDeviceType.MILI);
        ArrayList arrayList = new ArrayList();
        if (z) {
            HMBindMiLiLogic.initWithMiSeriesDevices(arrayList);
        } else {
            HMBindMiLiLogic.initDefaultMiliDevices(arrayList);
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.device.bind.SupportNameApi
    public void init() {
        this.supportNames.clear();
        this.supportNames.addAll(a());
    }

    @Override // com.xiaomi.hm.health.bt.scan.filter.DeviceFilter
    public boolean isMatch(@NotNull AdvData advData) {
        String deviceName = advData.getDeviceName();
        if (deviceName == null) {
            return false;
        }
        return this.supportNames.contains(deviceName);
    }
}
