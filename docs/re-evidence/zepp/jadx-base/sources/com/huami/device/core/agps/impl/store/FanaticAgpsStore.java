package com.huami.device.core.agps.impl.store;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.api.MultiDependenceStore;
import com.huami.device.core.agps.api.bean.FileResource;
import com.huami.device.core.agps.impl.AgpsAnalytics;
import com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/device/core/agps/impl/store/FanaticAgpsStore;", "Lcom/huami/device/core/agps/impl/store/BaseFirmwareStore;", "Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "type", "", "Lcom/huami/device/core/agps/api/bean/FileResource;", "fileResources", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "c", "getAGPSFirmwares", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "b", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "analytics", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "depStore", "Lkotlin/Function2;", "", "", "", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function2;", "onMessage", "<init>", "(Lcom/huami/device/core/agps/impl/AgpsAnalytics;Lcom/huami/device/core/agps/api/MultiDependenceStore;Lkotlin/jvm/functions/Function2;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class FanaticAgpsStore extends BaseFirmwareStore implements AGPSFirmwareStore {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AgpsAnalytics analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MultiDependenceStore depStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<String, Integer, Unit> onMessage;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadResourceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadResourceType.EPO_GR_3.ordinal()] = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FanaticAgpsStore(@NotNull AgpsAnalytics agpsAnalytics, @NotNull MultiDependenceStore multiDependenceStore, @NotNull Function2<? super String, ? super Integer, Unit> function2) {
        this.analytics = agpsAnalytics;
        this.depStore = multiDependenceStore;
        this.onMessage = function2;
    }

    private final List<HMFirmwareInfo> c(DownloadResourceType type, List<FileResource> fileResources) throws Exception {
        String path;
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] != 1) {
            throw new Exception("Not support type");
        }
        FileResource fileResource = (FileResource) CollectionsKt.firstOrNull((List) fileResources);
        if (fileResource == null || (path = fileResource.getPath()) == null) {
            throw new Exception("file error.");
        }
        File file = (File) CollectionsKt.firstOrNull((List) AGPSFirmwareHelperKt.unzip(new File(path), getTempPath()));
        return (file == null || file.length() <= 0) ? CollectionsKt__CollectionsKt.emptyList() : e.listOf(AGPSFirmwareHelperKt.encoderFirmwares(HMFirmwareType.FIRMWARE_AGPS_BATCH, e.listOf(new HMFirmwareInfo(file.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_GLN_EPO))));
    }

    @Override // com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore
    @NotNull
    public List<HMFirmwareInfo> getAGPSFirmwares() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<FileResource> listDownload = this.depStore.download(this.onMessage);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (listDownload.isEmpty()) {
                this.analytics.recordDownloadFailEvent(jCurrentTimeMillis2, "timeout");
                throw new Exception("resource error!!");
            }
            this.analytics.recordDownloadSuccessEvent(jCurrentTimeMillis2);
            return c(this.depStore.getType(), listDownload);
        } catch (Throwable th) {
            this.onMessage.invoke("error " + th.getMessage(), 0);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
