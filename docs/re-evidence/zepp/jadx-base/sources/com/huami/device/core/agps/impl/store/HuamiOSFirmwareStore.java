package com.huami.device.core.agps.impl.store;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.api.MultiDependenceStore;
import com.huami.device.core.agps.api.bean.FileResource;
import com.huami.device.core.agps.comm.AGPSFwEncoder;
import com.huami.device.core.agps.comm.AGPSGroup;
import com.huami.device.core.agps.comm.FileDto;
import com.huami.device.core.agps.impl.AgpsAnalytics;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/device/core/agps/impl/store/HuamiOSFirmwareStore;", "Lcom/huami/device/core/agps/impl/store/BaseFirmwareStore;", "", "Lcom/huami/device/core/agps/api/bean/FileResource;", "fileResources", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "c", "getAGPSFirmwares", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "b", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "analytics", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "depStore", "", "Lcom/huami/device/core/agps/comm/AGPSGroup;", GoogleApiAvailabilityLight.a, "Ljava/lang/Iterable;", "types", "Lkotlin/Function2;", "", "", "", "e", "Lkotlin/jvm/functions/Function2;", "onMessage", "<init>", "(Lcom/huami/device/core/agps/impl/AgpsAnalytics;Lcom/huami/device/core/agps/api/MultiDependenceStore;Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiOSFirmwareStore extends BaseFirmwareStore {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AgpsAnalytics analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MultiDependenceStore depStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Iterable<AGPSGroup> types;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function2<String, Integer, Unit> onMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public HuamiOSFirmwareStore(@NotNull AgpsAnalytics agpsAnalytics, @NotNull MultiDependenceStore multiDependenceStore, @NotNull Iterable<? extends AGPSGroup> iterable, @NotNull Function2<? super String, ? super Integer, Unit> function2) {
        this.analytics = agpsAnalytics;
        this.depStore = multiDependenceStore;
        this.types = iterable;
        this.onMessage = function2;
    }

    private final List<HMFirmwareInfo> c(List<FileResource> fileResources) throws Throwable {
        String path;
        String path2;
        ManifestDecode manifestDecode = null;
        try {
            FileResource fileResource = (FileResource) CollectionsKt.firstOrNull((List) fileResources);
            if (fileResource == null || (path = fileResource.getPath()) == null) {
                throw new Exception("file error.");
            }
            ManifestDecode manifestDecode2 = new ManifestDecode(new File(path), getTempPath(), this.types);
            try {
                List<FileDto> list = CollectionsKt___CollectionsKt.toList(manifestDecode2.loadManifestFileMap());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (FileDto fileDto : list) {
                    File file = fileDto.getFile();
                    if (file == null || (path2 = file.getPath()) == null) {
                        throw new NullPointerException(fileDto + " --> file is null");
                    }
                    arrayList.add(new AGPSFwEncoder(path2, fileDto.getValue()));
                }
                List<HMFirmwareInfo> listListOf = e.listOf(AGPSFirmwareHelperKt.encoderFirmwaresToFirmwareInfo(HMFirmwareType.FIRMWARE_AGPS_BATCH, arrayList));
                manifestDecode2.clearTempFiles();
                return listListOf;
            } catch (Throwable th) {
                th = th;
                manifestDecode = manifestDecode2;
                if (manifestDecode != null) {
                    manifestDecode.clearTempFiles();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore
    @NotNull
    public List<HMFirmwareInfo> getAGPSFirmwares() {
        try {
            if (this.depStore.getType() != DownloadResourceType.EPO) {
                throw new Exception("resource error type: " + this.depStore.getType());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<FileResource> listDownload = this.depStore.download(this.onMessage);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (listDownload.isEmpty()) {
                this.analytics.recordDownloadFailEvent(jCurrentTimeMillis2, "timeout");
                throw new Exception("resource error!!");
            }
            this.analytics.recordDownloadSuccessEvent(jCurrentTimeMillis2);
            return c(listDownload);
        } catch (Throwable th) {
            this.onMessage.invoke("error " + th.getMessage(), 0);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
