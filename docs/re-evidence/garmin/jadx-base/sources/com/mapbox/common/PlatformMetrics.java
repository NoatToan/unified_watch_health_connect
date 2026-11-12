package com.mapbox.common;

import androidx.annotation.Keep;
import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/PlatformMetrics;", "", "()V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PlatformMetrics {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Keep
    public static final List<MetricsSource> getPlatformMetricsSources(MetricsServiceType metricsServiceType) {
        return INSTANCE.getPlatformMetricsSources(metricsServiceType);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/common/PlatformMetrics$Companion;", "", "()V", "getPlatformMetricsSources", "", "Lcom/mapbox/common/MetricsSource;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/common/MetricsServiceType;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Keep
        public final List<MetricsSource> getPlatformMetricsSources(MetricsServiceType type) {
            type.getClass();
            return w.c(MemoryMetricsSource.INSTANCE.getInstance());
        }

        private Companion() {
        }
    }
}
