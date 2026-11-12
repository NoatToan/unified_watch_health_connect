package com.huami.moving.sport.ui.common;

import com.huami.moving.datacenter.SportDataItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/moving/sport/ui/common/SportDataDisplayItemConverter;", "", "", "Lcom/huami/moving/datacenter/SportDataItem;", "item", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "convert", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public interface SportDataDisplayItemConverter {
    @NotNull
    List<SportDataDisplayItem> convert(@NotNull List<SportDataItem> item);
}
