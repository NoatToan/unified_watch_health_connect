package androidx.media3.common.util;

import android.app.ForegroundServiceStartNotAllowedException;
import android.graphics.Gainmap;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.session.MediaSessionManager;
import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Util$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException m(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Gainmap m477m(Object obj) {
        return (Gainmap) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m479m(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ NetworkEvent.Builder m480m() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PlaybackErrorEvent.Builder m481m() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PlaybackMetrics.Builder m482m() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m483m(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HttpEngine m485m(Object obj) {
        return (HttpEngine) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ NetworkException m486m(Object obj) {
        return (NetworkException) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ UrlResponseInfo m487m(Object obj) {
        return (UrlResponseInfo) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m492m(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof NetworkException;
    }
}
