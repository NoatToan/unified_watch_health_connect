package com.huami.device.core.sync.report;

import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/device/core/sync/report/ReportApi;", "", "Lcom/huami/device/core/sync/report/ReportJobItem;", PointCategory.REPORT, "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface ReportApi {
    @NotNull
    ReportJobItem report();
}
