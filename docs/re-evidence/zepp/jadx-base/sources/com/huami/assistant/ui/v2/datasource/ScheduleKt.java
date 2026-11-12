package com.huami.assistant.ui.v2.datasource;

import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/Schedule;", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "toScheduleModel", "", "deviceSource", "toSchedule", "assistant_release"}, k = 2, mv = {1, 5, 1})
public final class ScheduleKt {
    @NotNull
    public static final Schedule toSchedule(@NotNull ScheduleModel scheduleModel, int i) {
        long id = scheduleModel.getId();
        String title = scheduleModel.getTitle();
        String desc = scheduleModel.getDesc();
        long startTime = scheduleModel.getStartTime();
        long stopTime = scheduleModel.getStopTime();
        long alertTime = scheduleModel.getAlertTime();
        int mode = (int) scheduleModel.getRepeatMode().getMode();
        long repeatStopTime = scheduleModel.getRepeatStopTime();
        boolean zIsAllDayEvent = scheduleModel.isAllDayEvent();
        String imageUrl = scheduleModel.getImageUrl();
        return new Schedule(mode, repeatStopTime, (int) scheduleModel.getUpdateVersion(), id, scheduleModel.getSource().getSource(), title, zIsAllDayEvent, false, imageUrl, i, startTime, stopTime, alertTime, scheduleModel.getAddress(), desc);
    }

    @NotNull
    public static final ScheduleModel toScheduleModel(@NotNull Schedule schedule) {
        long clientScheduleId = schedule.getClientScheduleId();
        String title = schedule.getTitle();
        String desc = schedule.getDesc();
        String str = desc == null ? "" : desc;
        long startTime = schedule.getStartTime();
        long endTime = schedule.getEndTime();
        long alertTime = schedule.getAlertTime();
        ScheduleRepeatMode scheduleRepeatMode = new ScheduleRepeatMode(schedule.getRepeatMode());
        long repeatStopTime = ((long) schedule.getRepeatMode()) == ScheduleRepeatMode.Once.INSTANCE.getMode() ? 4294967295L : schedule.getRepeatStopTime();
        boolean zIsAllDay = schedule.isAllDay();
        String imageUrl = schedule.getImageUrl();
        String str2 = imageUrl == null ? "" : imageUrl;
        ScheduleSource scheduleSourceFromSource = ScheduleSource.INSTANCE.fromSource(schedule.getSource());
        long j = repeatStopTime;
        long updateVersion = schedule.getUpdateVersion();
        String location = schedule.getLocation();
        return new ScheduleModel(clientScheduleId, title, str, startTime, endTime, alertTime, scheduleRepeatMode, j, zIsAllDay, str2, scheduleSourceFromSource, updateVersion, location == null ? "" : location);
    }
}
