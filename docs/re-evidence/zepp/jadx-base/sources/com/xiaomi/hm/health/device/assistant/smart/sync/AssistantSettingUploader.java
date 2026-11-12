package com.xiaomi.hm.health.device.assistant.smart.sync;

import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import com.huami.bluetooth.profile.channel.module.syncable.Serializer;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/AssistantSettingUploader;", "Lcom/xiaomi/hm/health/device/assistant/smart/sync/AssistantUploader;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsResponse;", "data", "", "uploadToServer", "", "isDisplay", "uploadDisplayMatters", "Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;", "Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardSettingItems;", "a", "Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;", "serializer", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AssistantSettingUploader implements AssistantUploader {

    @NotNull
    private static final String b = "AssistantUploader";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Serializer<SmartCardSettingItems> serializer;

    public AssistantSettingUploader(@NotNull Serializer<SmartCardSettingItems> serializer) {
        this.serializer = serializer;
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.sync.AssistantUploader
    public void uploadDisplayMatters(boolean isDisplay) {
        try {
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(AssistantSerializer.KEY_DISPLAY_MATTERS, isDisplay ? "true" : "false");
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        } catch (Exception e) {
            HMLog.e(b, e);
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(AssistantSerializer.KEY_DISPLAY_MATTERS, "false");
        }
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.sync.AssistantUploader
    public void uploadToServer(@NotNull List<AppCardsResponse> data) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
            for (AppCardsResponse appCardsResponse : data) {
                arrayList.add(new SmartCardsSyncBean(appCardsResponse.getType().getValue(), appCardsResponse.isEnable()));
            }
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(AssistantSerializer.KEY, this.serializer.serialize(new SmartCardSettingItems(arrayList)));
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        } catch (Exception e) {
            HMLog.e(b, e);
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(AssistantSerializer.KEY, "");
        }
    }
}
