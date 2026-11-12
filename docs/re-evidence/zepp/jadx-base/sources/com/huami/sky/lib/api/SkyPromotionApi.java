package com.huami.sky.lib.api;

import com.huami.sky.lib.entity.SkyPromotionInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/sky/lib/api/SkyPromotionApi;", "", "", "Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "getFeatureUpdateTips", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface SkyPromotionApi {
    @Nullable
    List<SkyPromotionInfo> getFeatureUpdateTips();
}
