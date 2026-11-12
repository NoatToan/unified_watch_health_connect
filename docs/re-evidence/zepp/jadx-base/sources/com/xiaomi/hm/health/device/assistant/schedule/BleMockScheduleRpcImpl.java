package com.xiaomi.hm.health.device.assistant.schedule;

import com.huami.assistant.calendar.Event;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/BleMockScheduleRpcImpl;", "Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "findAll", "findChanges", "", "ids", "", "clearDeviceChanges", "Lcom/huami/assistant/calendar/Event;", "event", "", TransportUri.ACTION_ADD, "id", "deleteById", "update", "", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BleMockScheduleRpcImpl implements ScheduleRpcApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "ScheduleRpcApi";

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public boolean add(@NotNull Event event) {
        HMLog.d(this.tag, "add or update --> " + event, new Object[0]);
        return true;
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public void clearDeviceChanges(@NotNull List<Long> ids) {
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public boolean deleteById(long id) {
        HMLog.d(this.tag, "delete by id " + id, new Object[0]);
        return true;
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    @NotNull
    public List<ScheduleModel> findAll() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    @NotNull
    public List<ScheduleModel> findChanges() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public boolean update(@NotNull Event event) {
        HMLog.d(this.tag, "update " + event, new Object[0]);
        return true;
    }
}
