package com.huami.respiratoryrate.core.data.remote;

import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/IRespRateWebApi;", "", "", "from", "to", "", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "getEventList", "dataList", "", "postEventList", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IRespRateWebApi {
    @NotNull
    List<RespRateEventItem> getEventList(long from, long to);

    boolean postEventList(@NotNull List<RespRateEventItem> dataList);
}
