package com.huami.device.core.agps.api;

import com.huami.device.core.agps.api.bean.FileResource;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¨\u0006\f"}, d2 = {"Lcom/huami/device/core/agps/api/MultiDependenceStore;", "", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "getType", "Lkotlin/Function2;", "", "", "", "onProgressMessage", "", "Lcom/huami/device/core/agps/api/bean/FileResource;", WatchFaceApi.SORT_DOWNLOAD, "agps-api_release"}, k = 1, mv = {1, 4, 0})
public interface MultiDependenceStore {
    @NotNull
    List<FileResource> download(@NotNull Function2<? super String, ? super Integer, Unit> onProgressMessage);

    @NotNull
    DownloadResourceType getType();
}
