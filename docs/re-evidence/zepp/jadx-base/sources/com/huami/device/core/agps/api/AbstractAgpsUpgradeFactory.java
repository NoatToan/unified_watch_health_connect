package com.huami.device.core.agps.api;

import com.huami.device.core.agps.api.bean.AppInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001c\u0010\u0017\u001a\u00020\u00128\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/device/core/agps/api/AbstractAgpsUpgradeFactory;", "", "Lcom/huami/device/core/agps/api/UpgradeTarget;", "createTarget", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "createStore", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "createAppInfo", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "createHttpClient", "Lcom/huami/device/core/agps/api/NeedUpgradeStrategy;", "createUpdateStrategy", "", "message", "", "progress", "", "onProgress", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "a", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "getResourceType", "()Lcom/huami/device/core/agps/api/DownloadResourceType;", "resourceType", "<init>", "(Lcom/huami/device/core/agps/api/DownloadResourceType;)V", "Companion", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public abstract class AbstractAgpsUpgradeFactory {
    private static final String b = "AbstractAgpsUpgradeFactory";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DownloadResourceType resourceType;

    public AbstractAgpsUpgradeFactory(@NotNull DownloadResourceType downloadResourceType) {
        this.resourceType = downloadResourceType;
    }

    @NotNull
    public abstract AppInfo createAppInfo();

    @NotNull
    public abstract AgpsHttpClient createHttpClient();

    @NotNull
    public abstract MultiDependenceStore createStore();

    @NotNull
    public abstract UpgradeTarget createTarget();

    @NotNull
    public abstract NeedUpgradeStrategy createUpdateStrategy();

    @NotNull
    public final DownloadResourceType getResourceType() {
        return this.resourceType;
    }

    public void onProgress(@NotNull String message, int progress) {
        AgpsModuleConfig.INSTANCE.getLogger().onProgress(message, progress);
    }
}
