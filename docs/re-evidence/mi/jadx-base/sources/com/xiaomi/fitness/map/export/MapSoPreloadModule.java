package com.xiaomi.fitness.map.export;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.map.export.MapSoPreloadModule;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.DownloadRequestKt;
import com.xiaomi.fitness.net.downloadV2.listener.BaseSingleFileDownloadListener;
import com.xiaomi.fitness.res.preload.export.ResRegistryModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/map/export/MapSoPreloadModule;", "", "<init>", "()V", "Companion", "map-amap-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MapSoPreloadModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "MapSoPreloadModule";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/map/export/MapSoPreloadModule$Companion;", "", "<init>", "()V", "TAG", "", "provides", "", "Lcom/xiaomi/fitness/res/preload/export/ResRegistryModel;", "map-amap-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean provides$lambda$0(DownloadRequest downloadRequest) {
            Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
            return DownloadRequestKt.isFileExist(downloadRequest);
        }

        @NotNull
        public final Set<ResRegistryModel> provides() {
            final DownloadRequest downloadRequest = new DownloadRequest(MapDynamicUtils.INSTANCE.getDownloadUrl(), new DownloadRequest.Option.Builder().external(false).build(), null, null, 12, null);
            return (AppUtil.INSTANCE.isPlayChannel() || !MapExportExtKt.getInstance(IMapExportService.INSTANCE).isPackageExcludeAMapSo()) ? SetsKt__SetsKt.emptySet() : SetsKt__SetsJVMKt.setOf(new ResRegistryModel(downloadRequest, new Function0() { // from class: p4f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(MapSoPreloadModule.Companion.provides$lambda$0(downloadRequest));
                }
            }, new BaseSingleFileDownloadListener() { // from class: com.xiaomi.fitness.map.export.MapSoPreloadModule$Companion$provides$2
                @Override // com.xiaomi.fitness.net.downloadV2.listener.BaseSingleFileDownloadListener, com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                public void onError(DownloadException e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    super.onError(e);
                    Logger.e("MapSoPreloadModule", "preload lib so exception:" + e.getError().getCode() + " - " + e.getError().getMsg());
                }

                @Override // com.xiaomi.fitness.net.downloadV2.listener.BaseSingleFileDownloadListener, com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                public void onSuccess(String path) {
                    Intrinsics.checkNotNullParameter(path, "path");
                    super.onSuccess(path);
                    MapDynamicUtils.INSTANCE.setLibPath(path);
                    Logger.e("MapSoPreloadModule", "preload lib so success");
                }
            }));
        }
    }
}
