package com.huami.devicerecorder.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002R\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/devicerecorder/model/RecorderStatistics;", "", "", "sourceValue", "", "setDeviceSource", "recordComing", "uploadFileCount", "recordDownloadBtnClick", "recordDownloadSuccess", "", "reason", RecorderStatistics.PARAM_FAIL_COUNT, "recordDownloadFailed", "a", "Ljava/lang/String;", "EVENT_RECORDER_ENTER", "b", "EVENT_RECORDER_START_DOWNLOAD", "c", "EVENT_RECORDER_DOWNLOAD_SUCCESS", GoogleApiAvailabilityLight.a, "EVENT_RECORDER_DOWNLOAD_FAILURE", "e", "PARAM_SOURCE", "f", "PARAM_COUNT", "g", "PARAM_REASON", "h", "PARAM_FAIL_COUNT", "i", LogUtil.I, "deviceSource", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderStatistics {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_RECORDER_ENTER = "RECORDER_ENTER";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_RECORDER_START_DOWNLOAD = "RECORDER_START_DOWNLOAD";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_RECORDER_DOWNLOAD_SUCCESS = "RECORDER_DOWNLOAD_SUCCESS";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_RECORDER_DOWNLOAD_FAILURE = "MUSIC_RECORDER_DOWNLOAD_FAILURE";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_SOURCE = "sourceID";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_COUNT = "count";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_REASON = "errorReason";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_FAIL_COUNT = "failCount";

    @NotNull
    public static final RecorderStatistics INSTANCE = new RecorderStatistics();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static int deviceSource = -1;

    private RecorderStatistics() {
    }

    public final void recordComing() {
        Analytics.recordEvent(new CountEventBuilder(EVENT_RECORDER_ENTER).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)));
    }

    public final void recordDownloadBtnClick(int uploadFileCount) {
        Analytics.recordEvent(new CountEventBuilder(EVENT_RECORDER_START_DOWNLOAD).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)).addExtra("count", String.valueOf(uploadFileCount)));
    }

    public final void recordDownloadFailed(@NotNull String reason, int failCount) {
        Analytics.recordEvent(new CountEventBuilder(EVENT_RECORDER_DOWNLOAD_FAILURE).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)).addExtra(PARAM_REASON, reason).addExtra(PARAM_FAIL_COUNT, String.valueOf(failCount)));
    }

    public final void recordDownloadSuccess() {
        Analytics.recordEvent(new CountEventBuilder(EVENT_RECORDER_DOWNLOAD_SUCCESS).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)));
    }

    public final void setDeviceSource(int sourceValue) {
        deviceSource = sourceValue;
    }
}
