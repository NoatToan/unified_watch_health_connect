package com.huami.watchfacesstore.api;

import com.huami.watchfacesstore.bean.WatchListBean;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/watchfacesstore/api/HistoryRecordApi;", "", "", "device", "", DTransferConstants.PAGE, "perPage", "Lcom/huami/watchfacesstore/bean/WatchListBean;", "getHistoryRecord", "ids", "", "deleteHistoryRecord", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface HistoryRecordApi {
    boolean deleteHistoryRecord(@NotNull String device, @NotNull String ids);

    @NotNull
    WatchListBean getHistoryRecord(@NotNull String device, int page, int perPage);
}
