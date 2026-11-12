package com.huami.watchfacesstore.analytic;

import android.text.TextUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002J)\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/watchfacesstore/analytic/WFAnalyticHelper;", "", "", DbUtils.Const.Columns.Event.EVENT_ID, "deviceValue", "", "extras", "value", "", "analyticCount", "eventType", "", WatchFaceDetailActivity.WATCH_FACE_ID, "", "syncTime", "reportWatchFaceAnalytic", "(Ljava/lang/String;ILjava/lang/Long;)V", "failType", "reportWatchFaceFailAnalytic", "", "isFree", "reportWatchFaceViewAnalytic", "(Ljava/lang/String;ILjava/lang/Boolean;)V", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WFAnalyticHelper {

    @NotNull
    public static final WFAnalyticHelper INSTANCE = new WFAnalyticHelper();

    private WFAnalyticHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void analyticCount$default(WFAnalyticHelper wFAnalyticHelper, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = KoinExtKt.getDeviceInfo().getDeviceId();
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        wFAnalyticHelper.analyticCount(str, str2, map, str3);
    }

    public static /* synthetic */ void reportWatchFaceAnalytic$default(WFAnalyticHelper wFAnalyticHelper, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = null;
        }
        wFAnalyticHelper.reportWatchFaceAnalytic(str, i, l);
    }

    public static /* synthetic */ void reportWatchFaceFailAnalytic$default(WFAnalyticHelper wFAnalyticHelper, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        wFAnalyticHelper.reportWatchFaceFailAnalytic(str, i, str2);
    }

    public final void analyticCount(@NotNull String eventId, @NotNull String deviceValue, @Nullable Map<String, String> extras, @Nullable String value) {
        CountEventBuilder countEventBuilderPutExtras = new CountEventBuilder(eventId).addExtra("DeviceSource", deviceValue).putExtras(extras);
        if (!TextUtils.isEmpty(value)) {
            countEventBuilderPutExtras.setValue(value);
        }
        Analytics.recordEvent(countEventBuilderPutExtras);
    }

    public final void reportWatchFaceAnalytic(@NotNull String eventType, int watchFaceId, @Nullable Long syncTime) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventType);
        countEventBuilder.addExtra("DeviceSource", KoinExtKt.getDeviceInfo().getDeviceId());
        countEventBuilder.addExtra("WatchFaceId", String.valueOf(watchFaceId));
        if (syncTime != null) {
            countEventBuilder.addExtra("SyncTime", syncTime.toString());
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public final void reportWatchFaceFailAnalytic(@NotNull String eventType, int watchFaceId, @Nullable String failType) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventType);
        countEventBuilder.addExtra("DeviceSource", KoinExtKt.getDeviceInfo().getDeviceId());
        countEventBuilder.addExtra("WatchFaceId", String.valueOf(watchFaceId));
        if (failType != null) {
            countEventBuilder.addExtra(WFStateEvent.WF_FAIL_TYPE, failType);
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public final void reportWatchFaceViewAnalytic(@NotNull String eventType, int watchFaceId, @Nullable Boolean isFree) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventType);
        countEventBuilder.addExtra("DeviceSource", KoinExtKt.getDeviceInfo().getDeviceId());
        countEventBuilder.addExtra("WatchFaceId", String.valueOf(watchFaceId));
        countEventBuilder.addExtra(WFStateEvent.WF_IS_PAY, String.valueOf(isFree));
        Analytics.recordEvent(countEventBuilder);
    }
}
