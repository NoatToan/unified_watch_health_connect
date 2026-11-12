package com.xiaomi.hm.health.devicex.proxy;

import com.huami.devicex.injection.basic.StressUserCaseApi;
import com.huami.feature.config.FeatureSwitch;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.temperature.TempUseCaseUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/StressUserCaseProxy;", "Lcom/huami/devicex/injection/basic/StressUserCaseApi;", "", "Value", "deviceSource", "", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "", "syncDeviceData", "syncDataFromServer", "fetchDataFromServer", "syncDataToServer", "", "isSyncDataEnable", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressUserCaseProxy implements StressUserCaseApi {
    @Override // com.huami.devicex.injection.basic.StressUserCaseApi
    public void fetchDataFromServer() {
        TempUseCaseUtils.INSTANCE.fetchDataFromServer();
    }

    @Override // com.huami.devicex.injection.basic.StressUserCaseApi
    public boolean isSyncDataEnable() {
        FeatureSwitch featureSwitch = (FeatureSwitch) StressUseCaseUtils.INSTANCE.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null);
        if (featureSwitch == null) {
            return false;
        }
        return featureSwitch.isSyncDataEnable();
    }

    @Override // com.huami.devicex.injection.basic.StressUserCaseApi
    public void syncDataFromServer() {
        StressUseCaseUtils.INSTANCE.syncDataFromServer();
    }

    @Override // com.huami.devicex.injection.basic.StressUserCaseApi
    public void syncDataToServer() {
        StressUseCaseUtils.INSTANCE.syncDataToServer();
    }

    @Override // com.huami.devicex.injection.basic.StressUserCaseApi
    public void syncDeviceData(int Value, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn) {
        StressUseCaseUtils.INSTANCE.syncDataFromServer();
    }
}
