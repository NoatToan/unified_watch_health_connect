package com.huami.device.core.agps.impl.store;

import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.core.agps.api.bean.FileResource;
import com.huami.device.core.agps.api.bean.ResourceItem;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/device/core/agps/impl/store/HmSecondaryStore;", "Lcom/huami/device/core/agps/impl/store/HmGpsStore;", "Lcom/huami/device/core/agps/api/bean/ResourceItem;", "resItem", "Lkotlin/Function2;", "", "", "", "onProgressMessage", "Lcom/huami/device/core/agps/api/bean/FileResource;", "downloadItem", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "f", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "httpClient", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "g", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "appInfo", "h", "Ljava/lang/String;", "saveFilePath", "<init>", "(Lcom/huami/device/core/agps/api/AgpsHttpClient;Lcom/huami/device/core/agps/api/bean/AppInfo;Ljava/lang/String;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class HmSecondaryStore extends HmGpsStore {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AgpsHttpClient httpClient;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AppInfo appInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String saveFilePath;

    public HmSecondaryStore(@NotNull AgpsHttpClient agpsHttpClient, @NotNull AppInfo appInfo, @NotNull String str) {
        super(agpsHttpClient, appInfo, str);
        this.httpClient = agpsHttpClient;
        this.appInfo = appInfo;
        this.saveFilePath = str;
    }

    @Override // com.huami.device.core.agps.impl.store.HmGpsStore
    @NotNull
    public FileResource downloadItem(@NotNull ResourceItem resItem, @NotNull Function2<? super String, ? super Integer, Unit> onProgressMessage) throws Exception {
        String secondaryUrl = resItem.getSecondaryUrl();
        Objects.requireNonNull(secondaryUrl, "secondary url is null");
        String str = this.saveFilePath + '/' + resItem.getFileType() + '/' + this.appInfo.getFileType().getValue() + '_' + filterFileName(secondaryUrl);
        onProgressMessage.invoke("start download file -> " + str, 0);
        onProgressMessage.invoke("start download file -> " + secondaryUrl, 0);
        boolean zDownloadFile = downloadFile(secondaryUrl, str);
        if (!zDownloadFile) {
            throw new Exception("download fail " + resItem.getFileType() + " - " + secondaryUrl);
        }
        onProgressMessage.invoke("download file [" + resItem.getFileType() + "] -> [" + zDownloadFile + JsonLexerKt.END_LIST, 0);
        return new FileResource(this.appInfo.getFileType(), str);
    }
}
