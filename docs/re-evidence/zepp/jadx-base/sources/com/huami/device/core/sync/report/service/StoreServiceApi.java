package com.huami.device.core.sync.report.service;

import com.huami.device.core.sync.report.ReportJobItem;
import com.huami.message.utils.MessageRecorderEventHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/huami/device/core/sync/report/service/StoreServiceApi;", "", "Lcom/huami/device/core/sync/report/ReportJobItem;", "rs", "", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "flush", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface StoreServiceApi {
    void flush();

    void push(@Nullable ReportJobItem rs);
}
