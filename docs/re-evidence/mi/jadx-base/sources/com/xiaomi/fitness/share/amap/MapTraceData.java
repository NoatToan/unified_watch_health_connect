package com.xiaomi.fitness.share.amap;

import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/share/amap/MapTraceData;", "", "<init>", "()V", "mapTraceWidth", "", "getMapTraceWidth", "()I", "mapZoom", "", "getMapZoom", "()F", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapTraceData {

    @NotNull
    public static final MapTraceData INSTANCE = new MapTraceData();
    private static final int mapTraceWidth = ExtUtilsKt.getDp(5);
    private static final float mapZoom = 15.3f;

    private MapTraceData() {
    }

    public final int getMapTraceWidth() {
        return mapTraceWidth;
    }

    public final float getMapZoom() {
        return mapZoom;
    }
}
