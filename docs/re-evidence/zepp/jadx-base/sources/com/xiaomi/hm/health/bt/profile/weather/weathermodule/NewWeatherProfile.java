package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/NewWeatherProfile;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/IWeatherProfile;", "", PointCategory.INIT, "deInit", "", "temperatureUnit", "setTemperatureUnitSync", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "a", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "getSettingsModule", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "setSettingsModule", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;)V", "settingsModule", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NewWeatherProfile implements IWeatherProfile {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    public NewWeatherProfile(@NotNull GattPeripheral gattPeripheral) {
        this.gattPeripheral = gattPeripheral;
        MiLiProProfile miLiProProfile = gattPeripheral instanceof MiLiProProfile ? (MiLiProProfile) gattPeripheral : null;
        this.settingsModule = miLiProProfile != null ? (SettingsModule) miLiProProfile.getChannelModule(SettingsModule.class) : null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weather.weathermodule.IWeatherProfile
    public boolean deInit() {
        return true;
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }

    @Nullable
    public final SettingsModule getSettingsModule() {
        return this.settingsModule;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weather.weathermodule.IWeatherProfile
    public boolean init() {
        return true;
    }

    public final void setSettingsModule(@Nullable SettingsModule settingsModule) {
        this.settingsModule = settingsModule;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weather.weathermodule.IWeatherProfile
    public boolean setTemperatureUnitSync(byte temperatureUnit) {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
        General general = new General();
        general.setTemperatureUnit(new EnumData(temperatureUnit));
        map.put(settingsGroupType, general);
        Unit unit = Unit.INSTANCE;
        return settingsModule.writeSettingSync(map);
    }
}
