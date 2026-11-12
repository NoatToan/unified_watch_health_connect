package com.xiaomi.hm.health.temperature.api;

import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.koin.data.TempBarConfig;
import com.huami.bodymeasurements.temperature.model.koin.data.TempUserInfo;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/temperature/api/TempExternalApiImpl;", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "", "getAppName", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempBarConfig;", "getBarConfig", "", "getTempUnit", "userId", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "getUserInfo", "", "isFriend", "showAddEntrance", "showHistoryEntrance", "supportWristTempDevice", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempExternalApiImpl implements TempExternalApi {
    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    @NotNull
    public String getAppName() {
        return "com.huami.midong";
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    @NotNull
    public TempBarConfig getBarConfig() {
        return new TempBarConfig(false, false);
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    public int getTempUnit() {
        return WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getTemperatureUnit();
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    @NotNull
    public TempUserInfo getUserInfo(@NotNull String userId) {
        return new TempUserInfo(userId, new Date((AccountModuleKt.getAccountService().getRegisterDate() / 1000) * ((long) 1000)));
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    public boolean isFriend() {
        return false;
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    public boolean showAddEntrance() {
        return true;
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    public boolean showHistoryEntrance() {
        return true;
    }

    @Override // com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi
    public boolean supportWristTempDevice() {
        return TempUtils.INSTANCE.supportWristTempDevice();
    }
}
