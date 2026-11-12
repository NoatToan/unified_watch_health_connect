package com.xiaomi.hm.health.device.assistant.smart.sync;

import com.huami.bluetooth.profile.channel.module.syncable.Serializer;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/AssistantSerializer;", "Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;", "Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardSettingItems;", "parser", "data", "", "serialize", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AssistantSerializer implements Serializer<SmartCardSettingItems> {

    @NotNull
    public static final String KEY = "huami.mifit.user.settings.gt2series.smartassistant";

    @NotNull
    public static final String KEY_DISPLAY_MATTERS = "huami.amazfit.midong.settings.smartassistant";

    @NotNull
    private static final String a = "AssistantSerializer";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.bluetooth.profile.channel.module.syncable.Serializer
    @NotNull
    public SmartCardSettingItems parser() {
        try {
            String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(KEY, "");
            SmartCardSettingItems smartCardSettingItems = property == null ? null : (SmartCardSettingItems) SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(SmartCardSettingItems.INSTANCE.serializer(), property);
            return smartCardSettingItems == null ? new SmartCardSettingItems(CollectionsKt__CollectionsKt.emptyList()) : smartCardSettingItems;
        } catch (Exception e) {
            HMLog.e(a, e);
            return new SmartCardSettingItems(CollectionsKt__CollectionsKt.emptyList());
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.Serializer
    @NotNull
    public String serialize(@NotNull SmartCardSettingItems data) {
        try {
            return SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToJsonElement(SmartCardSettingItems.INSTANCE.serializer(), data).toString();
        } catch (Exception e) {
            HMLog.e(a, "error", e);
            return "";
        }
    }
}
