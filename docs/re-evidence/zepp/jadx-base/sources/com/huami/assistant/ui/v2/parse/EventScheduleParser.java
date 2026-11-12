package com.huami.assistant.ui.v2.parse;

import android.text.TextUtils;
import android.text.format.Time;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.RecurrenceProcessor;
import com.huami.assistant.calendar.RecurrenceSet;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import com.huami.assistant.ui.v2.util.ScheduleIdUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.DateDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/assistant/ui/v2/parse/EventScheduleParser;", "", "Lcom/huami/assistant/calendar/Event;", "event", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "a", "parse", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class EventScheduleParser {

    @NotNull
    public static final EventScheduleParser INSTANCE = new EventScheduleParser();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "EventScheduleParser";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Event a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Event event) {
            super(0);
            this.a = event;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Could not parse RRULE recurrence string: " + this.a.rrule;
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
            return "parse event to schedule, event:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ScheduleModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<ScheduleModel> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse event to schedule, result:" + TextUtils.join(";", this.a);
        }
    }

    private EventScheduleParser() {
    }

    private final List<ScheduleModel> a(Event event) {
        RecurrenceSet recurrenceSet;
        String str;
        Long l;
        Event event2;
        String str2 = "";
        long jDayStartMills = DateDay.today().add(0).dayStartMills();
        long jDayEndMills = DateDay.today().add(30).dayEndMills();
        ArrayList<Event> arrayList = new ArrayList();
        RecurrenceProcessor recurrenceProcessor = new RecurrenceProcessor();
        Time time = new Time();
        try {
            recurrenceSet = new RecurrenceSet(event.rrule, null, null, null);
        } catch (Exception e) {
            HMLog.error(TAG, "", e, new a(event));
            arrayList.add(event);
            recurrenceSet = null;
        }
        if (recurrenceSet == null) {
            str = "";
            l = null;
        } else if (recurrenceSet.hasRecurrence()) {
            time.set(event.startMillis);
            try {
                l = null;
                try {
                    long[] jArrExpand = recurrenceProcessor.expand(time, recurrenceSet, event.startMillis, jDayEndMills);
                    long j = 1000;
                    long j2 = (event.endMillis - event.startMillis) / j;
                    int length = jArrExpand.length;
                    int i = 0;
                    while (i < length) {
                        long j3 = jArrExpand[i];
                        i++;
                        str = str2;
                        long j4 = j3 + j2;
                        if (j4 < jDayStartMills || jDayEndMills < j3) {
                            event2 = event;
                        } else {
                            try {
                                Event eventM3324clone = event.m3324clone();
                                eventM3324clone.startMillis = j3;
                                eventM3324clone.endMillis = j4;
                                event2 = event;
                                long j5 = ((long) ((int) (j3 / j))) + event2.id;
                                event2.id = j5;
                                event2.syncId = String.valueOf(j5);
                                arrayList.add(eventM3324clone);
                            } catch (Exception unused) {
                            }
                        }
                        jArrExpand = jArrExpand;
                        str2 = str;
                        jDayStartMills = jDayStartMills;
                    }
                } catch (Exception unused2) {
                }
                str = str2;
            } catch (Exception unused3) {
                str = "";
                l = null;
            }
        } else {
            str = "";
            l = null;
            arrayList.add(event);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Event event3 : arrayList) {
            long jGenerateId = ScheduleIdUtil.INSTANCE.generateId();
            String str3 = event3.title;
            String str4 = str3 == null ? str : str3;
            String str5 = event3.description;
            String str6 = str5 == null ? str : str5;
            long j6 = 1000;
            long j7 = event3.startMillis / j6;
            long j8 = event3.endMillis / j6;
            long j9 = event3.reminderMinutes;
            ScheduleRepeatMode.Once once = ScheduleRepeatMode.Once.INSTANCE;
            Long lValueOf = Long.valueOf(event3.repeatStopTime);
            if (!(lValueOf.longValue() > 0)) {
                lValueOf = l;
            }
            long jLongValue = lValueOf == null ? 4294967295L : lValueOf.longValue();
            boolean z = event3.allDay;
            String str7 = event3.imageUrl;
            arrayList2.add(new ScheduleModel(jGenerateId, str4, str6, j7, j8, j9, once, jLongValue, z, str7 == null ? str : str7, ScheduleSource.INSTANCE.fromSource(event3.source), event3.updateVersion, null, 4096, null));
        }
        return arrayList2;
    }

    @NotNull
    public final List<ScheduleModel> parse(@NotNull Event event) {
        Boolean boolValueOf;
        b bVar = new b(event);
        String str = TAG;
        HMLog.info(TAG, bVar);
        ArrayList arrayList = new ArrayList();
        String str2 = event.rrule;
        if (str2 == null) {
            str2 = "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(event.startMillis);
        Unit unit = Unit.INSTANCE;
        RruleDecode rruleDecode = new RruleDecode(str2, calendar);
        if (rruleDecode.isNeverRepeat()) {
            long jGenerateId = ScheduleIdUtil.INSTANCE.generateId();
            String str3 = event.title;
            String str4 = str3 == null ? "" : str3;
            String str5 = event.description;
            String str6 = str5 == null ? "" : str5;
            long j = 1000;
            long j2 = event.startMillis / j;
            long j3 = event.endMillis / j;
            long j4 = event.reminderMinutes;
            ScheduleRepeatMode.Once once = ScheduleRepeatMode.Once.INSTANCE;
            Long lValueOf = Long.valueOf(event.repeatStopTime);
            if (!(lValueOf.longValue() > 0)) {
                lValueOf = null;
            }
            long jLongValue = lValueOf == null ? 4294967295L : lValueOf.longValue();
            boolean z = event.allDay;
            String str7 = event.imageUrl;
            arrayList.add(new ScheduleModel(jGenerateId, str4, str6, j2, j3, j4, once, jLongValue, z, str7 == null ? "" : str7, ScheduleSource.INSTANCE.fromSource(event.source), event.updateVersion, null, 4096, null));
            str = TAG;
        } else {
            Long lDecode = rruleDecode.decode();
            if (lDecode == null) {
                boolValueOf = null;
            } else {
                long jLongValue2 = lDecode.longValue();
                long jGenerateId2 = ScheduleIdUtil.INSTANCE.generateId();
                String str8 = event.title;
                String str9 = str8 == null ? "" : str8;
                String str10 = event.description;
                String str11 = str10 == null ? "" : str10;
                long j5 = 1000;
                long j6 = event.startMillis / j5;
                long j7 = event.endMillis / j5;
                long j8 = event.reminderMinutes;
                ScheduleRepeatMode scheduleRepeatMode = new ScheduleRepeatMode(jLongValue2);
                long repeatStopTime = rruleDecode.getRepeatStopTime();
                boolean z2 = event.allDay;
                String str12 = event.imageUrl;
                ScheduleModel scheduleModel = new ScheduleModel(jGenerateId2, str9, str11, j6, j7, j8, scheduleRepeatMode, repeatStopTime, z2, str12 == null ? "" : str12, ScheduleSource.INSTANCE.fromSource(event.source), event.updateVersion, null, 4096, null);
                arrayList = arrayList;
                boolValueOf = Boolean.valueOf(arrayList.add(scheduleModel));
            }
            if (boolValueOf == null) {
                arrayList.addAll(a(event));
            } else {
                boolValueOf.booleanValue();
            }
        }
        HMLog.info(str, new c(arrayList));
        return arrayList;
    }
}
