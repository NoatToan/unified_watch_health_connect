package com.xiaomi.fitness.device.manager.export;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.hm.ChangeListenerImplKt;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.o;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/ChangeListenerWrapper;", "Lcom/xiaomi/wearable/hm/o$a;", "", "", "Lcom/xiaomi/wearable/hm/HuamiDataWrapper;", "var1", "", "onChangeInternal", "(Ljava/util/Map;)V", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "onChange", "(Ljava/util/HashMap;)V", "<init>", "()V", "device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public abstract class ChangeListenerWrapper extends o.a {
    public abstract void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings);

    @Override // com.xiaomi.wearable.hm.o
    public void onChangeInternal(@Nullable Map<String, HuamiDataWrapper> var1) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        if (var1 != null) {
            for (Map.Entry<String, HuamiDataWrapper> entry : var1.entrySet()) {
                String key = entry.getKey();
                HuamiDataWrapper value = entry.getValue();
                SettingsGroupType settingsGroupTypeValue2SettingGroupType = ChangeListenerImplKt.value2SettingGroupType(key);
                Settings settingsAsSettings = ChangeListenerImplKt.asSettings(value, key);
                Logger.d("ChangeListenerWrapper", "onChangeInternal " + settingsGroupTypeValue2SettingGroupType + " " + settingsAsSettings);
                if (settingsGroupTypeValue2SettingGroupType != null && settingsAsSettings != null) {
                    map.put(settingsGroupTypeValue2SettingGroupType, settingsAsSettings);
                }
            }
        }
        onChange(map);
    }
}
