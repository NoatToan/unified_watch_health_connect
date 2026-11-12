package com.huami.assistant.ui.schedule.split;

import android.text.TextUtils;
import android.text.format.Time;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.calendar.RecurrenceProcessor;
import com.huami.assistant.calendar.RecurrenceSet;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.util.UpdateParser;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/assistant/ui/schedule/split/EventSplit;", "", "Lcom/huami/assistant/model/bean/Update;", "update", "", "currentMillis", "Lkotlin/Pair;", "a", "b", "position", "Lcom/huami/assistant/calendar/Event;", "splitFuture", "", "splitCurrent", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class EventSplit {

    @NotNull
    public static final EventSplit INSTANCE = new EventSplit();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Schedule-EventSplit";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Update a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Update update, long j) {
            super(0);
            this.a = update;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start split, event:" + this.a.data + ", position:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Event> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Event> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "split result, saveItems:" + TextUtils.join("\n", this.a);
        }
    }

    private EventSplit() {
    }

    private final Pair<Long, Long> a(Update update, long currentMillis) {
        Event event = UpdateParser.toEvent(update.data);
        if (event == null) {
            return new Pair<>(null, null);
        }
        try {
            RecurrenceSet recurrenceSet = new RecurrenceSet(event.rrule, null, null, null);
            if (recurrenceSet.hasRecurrence()) {
                Time time = new Time();
                time.set(event.startMillis);
                RecurrenceProcessor recurrenceProcessor = new RecurrenceProcessor();
                long jB = b(update);
                long[] jArrExpand = recurrenceProcessor.expand(time, recurrenceSet, currentMillis - jB, currentMillis + jB);
                Long lValueOf = null;
                Long lValueOf2 = null;
                for (long j : jArrExpand) {
                    if (j < currentMillis && (lValueOf == null || j > lValueOf.longValue())) {
                        lValueOf = Long.valueOf(j);
                    }
                    if (j > currentMillis && (lValueOf2 == null || j < lValueOf2.longValue())) {
                        lValueOf2 = Long.valueOf(j);
                    }
                }
                return new Pair<>(lValueOf, lValueOf2);
            }
        } catch (Exception e) {
            HMLog.error(TAG, "", e, new a(e));
        }
        return new Pair<>(null, null);
    }

    private final long b(Update update) {
        Event event = UpdateParser.toEvent(update.data);
        long j = 1000;
        if (event == null) {
            return 1000L;
        }
        EventRecurrence eventRecurrence = new EventRecurrence();
        eventRecurrence.parse(event.rrule);
        switch (eventRecurrence.freq) {
            case 1:
                break;
            case 2:
                j = 60000;
                break;
            case 3:
                j = 3600000;
                break;
            case 4:
                j = 86400000;
                break;
            case 5:
                j = 604800000;
                break;
            case 6:
                j = 2678400000L;
                break;
            default:
                j = 31622400000L;
                break;
        }
        Integer numValueOf = Integer.valueOf(eventRecurrence.interval);
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        return (j * ((long) (numValueOf != null ? numValueOf.intValue() : 1))) + ((long) 1000);
    }

    @NotNull
    public final List<Event> splitCurrent(@NotNull Update update, long position) throws CloneNotSupportedException {
        HMLog.info(TAG, new b(update, position));
        ArrayList arrayList = new ArrayList();
        Event event = UpdateParser.toEvent(update.data);
        if (event == null) {
            return arrayList;
        }
        Update bySyncId = UpdatesManager.getManager().getBySyncId(update.syncId);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        Pair<Long, Long> pairA = a(bySyncId, position);
        Long first = pairA.getFirst();
        boolean z = false;
        if (first != null) {
            first.longValue();
            Event eventM3324clone = event.m3324clone();
            long j = Long.parseLong(bySyncId.syncId);
            eventM3324clone.id = j;
            eventM3324clone.syncId = String.valueOf(j);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(position);
            Unit unit = Unit.INSTANCE;
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            eventM3324clone.repeatStopTime = calendar.getTimeInMillis();
            eventM3324clone.resetRruleByRepeatStopTime();
            arrayList.add(eventM3324clone);
            z = true;
        }
        Long second = pairA.getSecond();
        if (second != null) {
            long jLongValue = second.longValue();
            Event eventM3324clone2 = event.m3324clone();
            if (!z) {
                jCurrentTimeMillis = bySyncId.getId().longValue();
            }
            eventM3324clone2.id = jCurrentTimeMillis;
            eventM3324clone2.syncId = String.valueOf(jCurrentTimeMillis);
            eventM3324clone2.startMillis = jLongValue;
            eventM3324clone2.endMillis = (jLongValue + bySyncId.endTime) - bySyncId.startTime;
            Unit unit2 = Unit.INSTANCE;
            arrayList.add(eventM3324clone2);
        }
        HMLog.info(TAG, new c(arrayList));
        return arrayList;
    }

    @Nullable
    public final Event splitFuture(@NotNull Update update, long position) throws CloneNotSupportedException {
        Event eventM3324clone = UpdateParser.toEvent(update.data).m3324clone();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(position);
        Unit unit = Unit.INSTANCE;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        eventM3324clone.repeatStopTime = calendar.getTimeInMillis();
        eventM3324clone.resetRruleByRepeatStopTime();
        return eventM3324clone;
    }
}
