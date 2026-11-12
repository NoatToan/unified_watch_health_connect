package com.huami.device.core.sync.report.service;

import com.huami.device.core.sync.report.ReportJobItem;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/device/core/sync/report/service/CSVFormatter;", "Lcom/huami/device/core/sync/report/service/FormatApi;", "", "Lcom/huami/device/core/sync/report/ReportJobItem;", "data", "Ljava/lang/StringBuffer;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "item", "", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class CSVFormatter implements FormatApi {
    @Override // com.huami.device.core.sync.report.service.FormatApi
    @NotNull
    public StringBuffer format(@NotNull Iterable<ReportJobItem> data) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<ReportJobItem> it2 = data.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(format(it2.next()));
            stringBuffer.append(',');
        }
        return stringBuffer;
    }

    @Override // com.huami.device.core.sync.report.service.FormatApi
    @NotNull
    public String format(@NotNull ReportJobItem item) {
        return item.tozCsv();
    }
}
