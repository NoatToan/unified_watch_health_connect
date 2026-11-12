package com.huami.moving.config;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/moving/config/SportConfigManager;", "", "", "sportType", "", "getGroupId", "", "Lcom/huami/moving/config/DataItem;", "getDataCardItems", "", "Lcom/huami/moving/config/DataGroup;", "getDataList", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface SportConfigManager {
    @NotNull
    List<DataItem> getDataCardItems(int sportType);

    @NotNull
    Map<DataGroup, List<DataItem>> getDataList(int sportType);

    @Nullable
    String getGroupId(int sportType);
}
