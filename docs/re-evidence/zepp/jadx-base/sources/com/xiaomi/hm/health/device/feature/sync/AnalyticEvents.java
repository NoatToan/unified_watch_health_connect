package com.xiaomi.hm.health.device.feature.sync;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.ExceptionEventBuilder;
import com.xiaomi.hm.health.device.feature.sync.analytic.SyncEventsApi;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/AnalyticEvents;", "", "", "createStartEvent", "createFinishEvent", "", "message", "", Constants.EXCEPTION, "createErrorEvent", "code", "createInternalErrorEvent", "createConflictEvent", "deviceTag", "Ljava/lang/String;", "getDeviceTag", "()Ljava/lang/String;", "setDeviceTag", "(Ljava/lang/String;)V", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/SyncEventsApi;", "syncEventsApi", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/SyncEventsApi;", "getSyncEventsApi", "()Lcom/xiaomi/hm/health/device/feature/sync/analytic/SyncEventsApi;", "setSyncEventsApi", "(Lcom/xiaomi/hm/health/device/feature/sync/analytic/SyncEventsApi;)V", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AnalyticEvents {

    @NotNull
    private static final String EVENT_DEVICE_TAG = "TAG";

    @NotNull
    private static final String EVENT_ERROR = "ERROR";

    @NotNull
    private static final String EVENT_FINISH = "FINISH";

    @NotNull
    private static final String EVENT_START = "START";

    @NotNull
    private static final String module = "SyncCenter";

    @NotNull
    private String deviceTag = "";

    @Nullable
    private SyncEventsApi syncEventsApi;

    public static /* synthetic */ void createErrorEvent$default(AnalyticEvents analyticEvents, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        analyticEvents.createErrorEvent(str, th);
    }

    public final void createConflictEvent() {
        Analytics.recordEvent(new CountEventBuilder("SyncCenter").setValue("CONFLICT"));
    }

    public final void createErrorEvent(@NotNull String message, @Nullable Throwable exception) {
        ExceptionEventBuilder message2 = new ExceptionEventBuilder("SyncCenter").setMessage(message);
        if (exception != null) {
            message2.setException(exception);
        }
        Analytics.recordEvent(message2);
    }

    public final void createFinishEvent() {
        Analytics.recordEvent(new CountEventBuilder("SyncCenter").setValue(EVENT_FINISH).putExtras(q.mapOf(new Pair(EVENT_DEVICE_TAG, this.deviceTag))));
        SyncEventsApi syncEventsApi = this.syncEventsApi;
        if (syncEventsApi == null) {
            return;
        }
        syncEventsApi.onFinish();
    }

    public final void createInternalErrorEvent(@NotNull String code) {
        Analytics.recordEvent(new CountEventBuilder("SyncCenter").setValue("ERROR").putExtras(q.mapOf(new Pair(EVENT_DEVICE_TAG, this.deviceTag))).putExtras(q.mapOf(new Pair("CODE", code))));
    }

    public final void createStartEvent() {
        Analytics.recordEvent(new CountEventBuilder("SyncCenter").setValue(EVENT_START).putExtras(q.mapOf(new Pair(EVENT_DEVICE_TAG, this.deviceTag))));
        SyncEventsApi syncEventsApi = this.syncEventsApi;
        if (syncEventsApi == null) {
            return;
        }
        syncEventsApi.onStart();
    }

    @NotNull
    public final String getDeviceTag() {
        return this.deviceTag;
    }

    @Nullable
    public final SyncEventsApi getSyncEventsApi() {
        return this.syncEventsApi;
    }

    public final void setDeviceTag(@NotNull String str) {
        this.deviceTag = str;
    }

    public final void setSyncEventsApi(@Nullable SyncEventsApi syncEventsApi) {
        this.syncEventsApi = syncEventsApi;
    }
}
