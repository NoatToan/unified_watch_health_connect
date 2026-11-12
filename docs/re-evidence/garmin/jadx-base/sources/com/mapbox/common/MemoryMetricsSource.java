package com.mapbox.common;

import android.os.Debug;
import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\n"}, d2 = {"Lcom/mapbox/common/MemoryMetricsSource;", "Lcom/mapbox/common/MetricsSource;", "()V", "getMetrics", "", "Lcom/mapbox/common/Metrics;", "toMetricValue", "Lcom/mapbox/bindgen/Value;", "", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MemoryMetricsSource implements MetricsSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<MemoryMetricsSource> instance$delegate = m.b(MemoryMetricsSource$Companion$instance$2.INSTANCE);
    private static final String prefix = "mapbox/common/tracker/android/";

    public /* synthetic */ MemoryMetricsSource(j jVar) {
        this();
    }

    private final Value toMetricValue(String str) {
        try {
            return ValueUtilsKt.toValue(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            return ValueUtilsKt.toValue(str);
        }
    }

    @Override // com.mapbox.common.MetricsSource
    public List<Metrics> getMetrics() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Map<String, String> memoryStats = memoryInfo.getMemoryStats();
        memoryStats.getClass();
        ArrayList arrayList = new ArrayList(memoryStats.size());
        for (Map.Entry<String, String> entry : memoryStats.entrySet()) {
            String str = prefix + entry.getKey();
            String value = entry.getValue();
            value.getClass();
            arrayList.add(new Metrics(str, toMetricValue(value)));
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mapbox/common/MemoryMetricsSource$Companion;", "", "<init>", "()V", "Lcom/mapbox/common/MemoryMetricsSource;", "instance$delegate", "Lo13/l;", "getInstance", "()Lcom/mapbox/common/MemoryMetricsSource;", "instance", "", "prefix", "Ljava/lang/String;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final MemoryMetricsSource getInstance() {
            return (MemoryMetricsSource) MemoryMetricsSource.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    private MemoryMetricsSource() {
    }
}
