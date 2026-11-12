package com.huami.watch.musicupload.logic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0016\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0016\u0010#\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/watch/musicupload/logic/MusicUploadStatistics;", "", "", "sourceValue", "", "setDeviceSource", "recordComing", "uploadFileCount", "recordUploadBtnClick", "recordUploadSuccess", "", "reason", MusicUploadStatistics.PARAM_FAIL_COUNT, "recordUploadFailed", "recordRetryBtnClick", "a", "Ljava/lang/String;", "EVENT_MUSIC_TRANSFER_ENTER", "b", "EVENT_MUSIC_TRANSFER_START_UPLOAD", "c", "EVENT_MUSIC_TRANSFER_SUCCESS", GoogleApiAvailabilityLight.a, "EVENT_MUSIC_TRANSFER_FAILURE", "e", "EVENT_MUSIC_TRANSFER_REUPLOAD", "f", "PARAM_SOURCE", "g", "PARAM_COUNT", "h", "PARAM_REASON", "i", "PARAM_FAIL_COUNT", "FAILED_WIFI_CONNECT", "FAILED_FTP_CONNECT", z.j, LogUtil.I, "deviceSource", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicUploadStatistics {

    @NotNull
    public static final String FAILED_FTP_CONNECT = "ftp_connect_failed";

    @NotNull
    public static final String FAILED_WIFI_CONNECT = "wifi_connect_failed";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String EVENT_MUSIC_TRANSFER_ENTER = "MUSIC_TRANSFER_ENTER";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String EVENT_MUSIC_TRANSFER_START_UPLOAD = "MUSIC_TRANSFER_START_UPLOAD";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String EVENT_MUSIC_TRANSFER_SUCCESS = "MUSIC_TRANSFER_SUCCESS";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String EVENT_MUSIC_TRANSFER_FAILURE = "MUSIC_TRANSFER_FAILURE";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String EVENT_MUSIC_TRANSFER_REUPLOAD = "MUSIC_TRANSFER_REUPLOAD";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String PARAM_SOURCE = "sourceID";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String PARAM_COUNT = "count";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final String PARAM_REASON = "errorReason";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final String PARAM_FAIL_COUNT = "failCount";

    @NotNull
    public static final MusicUploadStatistics INSTANCE = new MusicUploadStatistics();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static int deviceSource = -1;

    private MusicUploadStatistics() {
    }

    public final void recordComing() {
        Analytics.recordEvent(new CountEventBuilder(EVENT_MUSIC_TRANSFER_ENTER).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)));
    }

    public final void recordRetryBtnClick() {
        Analytics.recordEvent(new CountEventBuilder(EVENT_MUSIC_TRANSFER_REUPLOAD).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)));
    }

    public final void recordUploadBtnClick(int uploadFileCount) {
        Analytics.recordEvent(new CountEventBuilder(EVENT_MUSIC_TRANSFER_START_UPLOAD).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)).addExtra("count", String.valueOf(uploadFileCount)));
    }

    public final void recordUploadFailed(@NotNull String reason, int failCount) {
        Analytics.recordEvent(new CountEventBuilder(EVENT_MUSIC_TRANSFER_FAILURE).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)).addExtra(PARAM_REASON, reason).addExtra(PARAM_FAIL_COUNT, String.valueOf(failCount)));
    }

    public final void recordUploadSuccess() {
        Analytics.recordEvent(new CountEventBuilder(EVENT_MUSIC_TRANSFER_SUCCESS).addExtra(PARAM_SOURCE, String.valueOf(deviceSource)));
    }

    public final void setDeviceSource(int sourceValue) {
        deviceSource = sourceValue;
    }
}
