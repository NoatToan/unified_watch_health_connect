package androidx.core.view;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.HealthConnectManager;
import android.health.connect.InsertRecordsResponse;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.changelog.ChangeLogTokenResponse;
import android.health.connect.changelog.ChangeLogsRequest;
import android.health.connect.changelog.ChangeLogsResponse;
import android.health.connect.datatypes.Record;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ AggregateRecordsGroupedByDurationResponse m(Object obj) {
        return (AggregateRecordsGroupedByDurationResponse) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AggregateRecordsGroupedByPeriodResponse m71m(Object obj) {
        return (AggregateRecordsGroupedByPeriodResponse) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AggregateRecordsResponse m72m(Object obj) {
        return (AggregateRecordsResponse) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HealthConnectManager m73m(Object obj) {
        return (HealthConnectManager) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InsertRecordsResponse m74m(Object obj) {
        return (InsertRecordsResponse) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ReadRecordsResponse m75m(Object obj) {
        return (ReadRecordsResponse) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ChangeLogTokenResponse m76m(Object obj) {
        return (ChangeLogTokenResponse) obj;
    }

    public static /* synthetic */ ChangeLogsRequest.Builder m(String str) {
        return new ChangeLogsRequest.Builder(str);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ChangeLogsResponse.DeletedLog m77m(Object obj) {
        return (ChangeLogsResponse.DeletedLog) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ChangeLogsResponse m78m(Object obj) {
        return (ChangeLogsResponse) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Record m79m(Object obj) {
        return (Record) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m81m() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m82m(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener m85m(Object obj) {
        return (WindowInsetsController.OnControllableInsetsChangedListener) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m87m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m91m() {
    }
}
