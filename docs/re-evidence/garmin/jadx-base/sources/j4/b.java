package j4;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ MediaMetricsManager a(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder j(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder m(AutofillId autofillId, long j8) {
        return new ViewTranslationRequest.Builder(autofillId, j8);
    }

    public static /* synthetic */ void n() {
    }
}
