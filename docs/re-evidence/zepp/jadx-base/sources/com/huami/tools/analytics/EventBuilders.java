package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.tools.analytics.internal.utils.DefaultClock;
import com.huami.tools.analytics.internal.utils.JavaUtils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class EventBuilders {

    public static class CalculationEventBuilder extends a<CalculationEventBuilder> {
        private float c;

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public /* bridge */ /* synthetic */ HitEvent build() {
            return super.build();
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public Event buildBasicEvent() {
            Event event = new Event();
            event.setEventId(this.a);
            event.setType("cal");
            event.setNumberValue(Float.valueOf(this.c));
            event.setMultipleValue(this.b);
            return event;
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public /* bridge */ /* synthetic */ a setExtras(Map map) {
            return setExtras((Map<String, String>) map);
        }

        public CalculationEventBuilder setValue(float f) {
            this.c = f;
            return this;
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public CalculationEventBuilder addExtra(String str, String str2) {
            return (CalculationEventBuilder) super.addExtra(str, str2);
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public CalculationEventBuilder setExtras(Map<String, String> map) {
            return (CalculationEventBuilder) super.setExtras(map);
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public CalculationEventBuilder setId(String str) {
            return (CalculationEventBuilder) super.setId(str);
        }
    }

    public static class CountEventBuilder extends a<CountEventBuilder> {
        private String c;

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public /* bridge */ /* synthetic */ HitEvent build() {
            return super.build();
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public Event buildBasicEvent() {
            Event event = new Event();
            event.setEventId(this.a);
            event.setType(EventConst.a);
            event.setStringValue(this.c);
            event.setMultipleValue(this.b);
            return event;
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public /* bridge */ /* synthetic */ a setExtras(Map map) {
            return setExtras((Map<String, String>) map);
        }

        public CountEventBuilder setValue(String str) {
            this.c = str;
            return this;
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public CountEventBuilder addExtra(String str, String str2) {
            return (CountEventBuilder) super.addExtra(str, str2);
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public CountEventBuilder setExtras(Map<String, String> map) {
            return (CountEventBuilder) super.setExtras(map);
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        public CountEventBuilder setId(String str) {
            return (CountEventBuilder) super.setId(str);
        }
    }

    public static class ExceptionEventBuilder extends a<ExceptionEventBuilder> {
        private String c;
        private Throwable d;

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public /* bridge */ /* synthetic */ HitEvent build() {
            return super.build();
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public Event buildBasicEvent() {
            addExtra(Const.PARAM_STACK_TRACE, JavaUtils.getStackTraceString(this.d));
            Event event = new Event();
            event.setEventId(Const.EVENT_ID_CAUGHT_EXCEPTION);
            event.setType(EventConst.c);
            event.setStringValue(this.c);
            event.setMultipleValue(this.b);
            return event;
        }

        public ExceptionEventBuilder setDescription(String str) {
            this.c = str;
            return this;
        }

        public ExceptionEventBuilder setException(Throwable th) {
            this.d = th;
            return this;
        }
    }

    public static abstract class a<T extends a<T>> {
        public String a;
        public Map<String, String> b = new HashMap();

        public String a() {
            return Const.LOG_TAG_PREFIX + getClass().getSimpleName();
        }

        public T addExtra(String str, String str2) {
            if (str != null) {
                this.b.put(str, str2);
            } else {
                p.b().w(a(), "EventBuilder.addExtra() called with a null paramName.");
            }
            return this;
        }

        @NonNull
        public HitEvent build() {
            Event eventBuildBasicEvent = buildBasicEvent();
            EventBuilders.a(eventBuildBasicEvent);
            return eventBuildBasicEvent;
        }

        @NonNull
        public abstract Event buildBasicEvent();

        public T setExtras(Map<String, String> map) {
            if (map != null && !map.isEmpty()) {
                this.b.putAll(map);
            }
            return this;
        }

        public T setId(String str) {
            this.a = str;
            return this;
        }
    }

    public static class b extends a<b> {
        private Long c;

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.huami.tools.analytics.EventBuilders.a
        @NonNull
        public Event buildBasicEvent() {
            Event event = new Event();
            event.setEventId(Const.EVENT_ID_ACTIVITY_DURATION);
            event.setType(EventConst.d);
            Long l = this.c;
            event.setNumberValue(l != null ? Float.valueOf(l.floatValue()) : null);
            event.setMultipleValue(this.b);
            return event;
        }

        public b c(String str) {
            return addExtra(Const.PARAM_ACTIVITY_NAME, str);
        }
    }

    @VisibleForTesting
    public static void a(Event event) {
        event.setTimestamp(Long.valueOf(DefaultClock.get().currentTimeMillis()));
        Calendar nowCalendar = JavaUtils.getNowCalendar();
        int i = nowCalendar.get(15);
        int i2 = nowCalendar.get(16);
        event.setTimezone(JavaUtils.getTimeZoneKey(i) + "," + i2);
    }

    public static b b() {
        return new b();
    }

    public static CalculationEventBuilder newCalculationEventBuilder() {
        return new CalculationEventBuilder();
    }

    public static CountEventBuilder newCountEventBuilder() {
        return new CountEventBuilder();
    }

    public static ExceptionEventBuilder newExceptionEventBuilder() {
        return new ExceptionEventBuilder();
    }
}
