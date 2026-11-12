package com.huami.moving.datacenter;

import com.huami.moving.config.DataGroup;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/moving/datacenter/SportDataRender;", "", "", "Lcom/huami/moving/datacenter/SportDataItem;", "getCardDataList", "", "Lcom/huami/moving/config/DataGroup;", "getDataList", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface SportDataRender {
    @NotNull
    List<SportDataItem> getCardDataList();

    @NotNull
    Map<DataGroup, List<SportDataItem>> getDataList();
}
