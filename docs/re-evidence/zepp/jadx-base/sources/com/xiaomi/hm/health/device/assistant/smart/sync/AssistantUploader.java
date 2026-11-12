package com.xiaomi.hm.health.device.assistant.smart.sync;

import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/AssistantUploader;", "", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsResponse;", "data", "", "uploadToServer", "", "isDisplay", "uploadDisplayMatters", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AssistantUploader {
    void uploadDisplayMatters(boolean isDisplay);

    void uploadToServer(@NotNull List<AppCardsResponse> data);
}
