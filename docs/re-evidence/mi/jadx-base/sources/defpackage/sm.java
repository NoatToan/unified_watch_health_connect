package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lsm;", "Ldj;", "", "init", "()Z", "deInit", "", "temperatureUnit", PluginDeviceInfo.FMODEL, "(B)Z", "Ljet;", "gattPeripheral", "<init>", "(Ljet;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class sm implements dj {

    @NotNull
    public final jet t;

    @Nullable
    public SettingsModule u;

    public sm(@NotNull jet gattPeripheral) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.t = gattPeripheral;
        x7t x7tVar = gattPeripheral instanceof x7t ? (x7t) gattPeripheral : null;
        this.u = x7tVar != null ? (SettingsModule) x7tVar.i1(SettingsModule.class) : null;
    }

    @Override // defpackage.dj
    public boolean a(byte temperatureUnit) {
        SettingsModule settingsModule = this.u;
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
        General general = new General();
        general.setTemperatureUnit(new EnumData(temperatureUnit));
        map.put(settingsGroupType, general);
        return settingsModule.writeSettingSync(map);
    }

    @Override // defpackage.dj
    public boolean deInit() {
        return true;
    }

    @Override // defpackage.dj
    public boolean init() {
        return true;
    }
}
