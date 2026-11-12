package com.mi.health.map;

import com.amap.api.maps.ExceptionLogger;
import com.amap.api.maps.MapsInitializer;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.map.export.IMapExportService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/mi/health/map/MapExport;", "Lcom/xiaomi/fitness/map/export/IMapExportService;", "<init>", "()V", "isPackageExcludeAMapSo", "", "setLibPath", "", "soPath", "", "platform", "Companion", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapExport implements IMapExportService {

    @NotNull
    private static final String TAG = "MapExport";

    @Override // com.xiaomi.fitness.map.export.IMapExportService
    public boolean isPackageExcludeAMapSo() {
        Logger.d(TAG, "isPackageExcludeAMapSo:true");
        return true;
    }

    @Override // com.xiaomi.fitness.map.export.IMapExportService
    public void setLibPath(@NotNull String soPath, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(soPath, "soPath");
        Intrinsics.checkNotNullParameter(platform, "platform");
        MapsInitializer.setLibPath(soPath, platform);
        MapsInitializer.setExceptionLogger(new ExceptionLogger() { // from class: com.mi.health.map.MapExport.setLibPath.1
            @Override // com.amap.api.maps.ExceptionLogger
            public void onDownloaderException(int p0, int p1) {
                Logger.e(MapExport.TAG, "onDownloaderException: " + p0 + " " + p1);
            }

            @Override // com.amap.api.maps.ExceptionLogger
            public void onException(Throwable p0) {
                Object[] objArr = new Object[2];
                objArr[0] = "onException: " + (p0 != null ? p0.getMessage() : null);
                objArr[1] = p0;
                Logger.e(MapExport.TAG, objArr);
            }
        });
    }
}
