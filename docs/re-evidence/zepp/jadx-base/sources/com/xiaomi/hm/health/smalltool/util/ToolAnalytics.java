package com.xiaomi.hm.health.smalltool.util;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/util/ToolAnalytics;", "", "", "id", "", "recordEvent", "", "extras", "<init>", "()V", "EventId", "ParamKey", "ParamValue", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolAnalytics {

    @NotNull
    public static final ToolAnalytics INSTANCE = new ToolAnalytics();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/util/ToolAnalytics$EventId;", "", "", "TOOLS_PULL_UP_C", "Ljava/lang/String;", EventId.TOOLS_RETRACT_C, EventId.TOOLS_ALL_C, EventId.TOOLS_CLICK_C, EventId.TOOLS_SEQUENCE_C, "MY_TOOLS_PAGE_CLICK_C", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class EventId {

        @NotNull
        public static final EventId INSTANCE = new EventId();

        @NotNull
        public static final String MY_TOOLS_PAGE_CLICK_C = "MYTOOLSPAGE_CLICK_C";

        @NotNull
        public static final String TOOLS_ALL_C = "TOOLS_ALL_C";

        @NotNull
        public static final String TOOLS_CLICK_C = "TOOLS_CLICK_C";

        @NotNull
        public static final String TOOLS_PULL_UP_C = "TOOLS_PULLUP_C";

        @NotNull
        public static final String TOOLS_RETRACT_C = "TOOLS_RETRACT_C";

        @NotNull
        public static final String TOOLS_SEQUENCE_C = "TOOLS_SEQUENCE_C";

        private EventId() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/util/ToolAnalytics$ParamKey;", "", "", "SOURCE", "Ljava/lang/String;", "STATUS", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ParamKey {

        @NotNull
        public static final ParamKey INSTANCE = new ParamKey();

        @NotNull
        public static final String SOURCE = "source";

        @NotNull
        public static final String STATUS = "status";

        private ParamKey() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/util/ToolAnalytics$ParamValue;", "", "", "STATUS_NORMAL", "Ljava/lang/String;", "STATUS_DEVICE_DISCONNECTED", "STATUS_MCU_NOT_SUPPORT", "STATUS_NET_DISCONNECTED", "STATUS_OTHER", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ParamValue {

        @NotNull
        public static final ParamValue INSTANCE = new ParamValue();

        @NotNull
        public static final String STATUS_DEVICE_DISCONNECTED = "1";

        @NotNull
        public static final String STATUS_MCU_NOT_SUPPORT = "2";

        @NotNull
        public static final String STATUS_NET_DISCONNECTED = "3";

        @NotNull
        public static final String STATUS_NORMAL = "0";

        @NotNull
        public static final String STATUS_OTHER = "4";

        private ParamValue() {
        }
    }

    private ToolAnalytics() {
    }

    @JvmStatic
    public static final void recordEvent(@NotNull String id) {
        recordEvent(id, r.emptyMap());
    }

    public static /* synthetic */ void recordEvent$default(String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = r.emptyMap();
        }
        recordEvent(str, map);
    }

    @JvmStatic
    public static final void recordEvent(@NotNull String id, @NotNull Map<String, String> extras) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(id);
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            countEventBuilder.addExtra(entry.getKey(), entry.getValue());
        }
        Analytics.recordEvent(countEventBuilder);
    }
}
