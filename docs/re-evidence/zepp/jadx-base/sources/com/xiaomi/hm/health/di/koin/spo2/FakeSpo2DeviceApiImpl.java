package com.xiaomi.hm.health.di.koin.spo2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.PSpo2Entity;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/spo2/FakeSpo2DeviceApiImpl;", "Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DeviceApi;", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;", "a", "", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "syncFromDevice", "", "supportSpo2", "supportOsa", "isOsaEnable", "", LogUtil.I, "fiveMinutes", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FakeSpo2DeviceApiImpl implements Spo2DeviceApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int fiveMinutes = 300000;

    private final List<PSpo2Entity> a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            arrayList.add(new PSpo2Entity(null, b(), jCurrentTimeMillis - ((long) (this.fiveMinutes * i)), i + 80, false, null, 0, null, null, 497, null));
            if (i2 > 20) {
                return arrayList;
            }
            i = i2;
        }
    }

    private final String b() {
        return HMPersonInfo.getInstance().getUserInfo().getUserid();
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean isOsaEnable() {
        return true;
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean supportOsa() {
        return true;
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean supportSpo2() {
        return true;
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public void syncFromDevice(@NotNull HMBaseDevice device) {
    }
}
