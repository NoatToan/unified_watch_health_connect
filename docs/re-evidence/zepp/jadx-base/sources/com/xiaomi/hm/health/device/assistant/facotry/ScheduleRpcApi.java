package com.xiaomi.hm.health.device.assistant.facotry;

import com.huami.assistant.calendar.Event;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.watch.notification.TransportUri;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "findAll", "findChanges", "", "ids", "", "clearDeviceChanges", "Lcom/huami/assistant/calendar/Event;", "event", "", TransportUri.ACTION_ADD, "id", "deleteById", "update", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ScheduleRpcApi {
    boolean add(@NotNull Event event);

    void clearDeviceChanges(@NotNull List<Long> ids);

    boolean deleteById(long id);

    @NotNull
    List<ScheduleModel> findAll();

    @NotNull
    List<ScheduleModel> findChanges();

    boolean update(@NotNull Event event);
}
