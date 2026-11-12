package com.huami.assistant.ui.v2.parse;

import com.huami.assistant.calendar.Event;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/assistant/ui/v2/parse/ScheduleEventParser;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "schedule", "Lcom/huami/assistant/calendar/Event;", "parse", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleEventParser {

    @NotNull
    public static final ScheduleEventParser INSTANCE = new ScheduleEventParser();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "EventScheduleParser";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScheduleModel scheduleModel) {
            super(0);
            this.a = scheduleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse schedule to event, schedule:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Event a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Event event) {
            super(0);
            this.a = event;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse schedule to event, result:" + this.a;
        }
    }

    private ScheduleEventParser() {
    }

    @NotNull
    public final Event parse(@NotNull ScheduleModel schedule) {
        HMLog.info(TAG, new a(schedule));
        String strEncode = new RruleEncode(schedule.getRepeatMode(), schedule.getStartTime(), schedule.getRepeatStopTime()).encode();
        Event event = new Event();
        long id = schedule.getId();
        event.id = id;
        event.syncId = String.valueOf(id);
        event.title = schedule.getTitle();
        event.description = schedule.getDescription();
        long j = 1000;
        event.startMillis = schedule.getStartTime() * j;
        event.endMillis = schedule.getStopTime() * j;
        event.allDay = schedule.isAllDay();
        event.rrule = strEncode;
        event.reminderMinutes = ((int) schedule.getAlertTime()) / 60;
        event.repeatStopTime = schedule.getRepeatStopTime();
        event.imageUrl = schedule.getImageUrl();
        event.source = schedule.getSource();
        event.updateVersion = schedule.getUpdateVersion();
        HMLog.info(TAG, new b(event));
        return event;
    }
}
