package com.huami.bluetooth.profile.channel.module.schedule;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J#\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCallback;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", AbstractJSONTokenResponse.RESPONSE, "", "onQueryDeviceDataResult", "", "onAddOrUpdateResult", "onDeleteResult", "onSyncDataToDeviceResult", "", "msg", "", "code", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "item", "onDeviceScheduleChange", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ScheduleCallback {
    void onAddOrUpdateResult(@NotNull Response<Boolean> response);

    void onDeleteResult(@NotNull Response<Boolean> response);

    void onDeviceScheduleChange(@NotNull ScheduleStatus item);

    void onError(@Nullable String msg, @Nullable Integer code);

    void onQueryDeviceDataResult(@NotNull Response<List<ScheduleModel>> response);

    void onSyncDataToDeviceResult(@NotNull Response<Boolean> response);
}
