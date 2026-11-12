package com.xiaomi.hm.health.homepage.status.utils;

import android.content.Context;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.homepage.promotion.ui.ExternalNavigator;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.manager.HMAdManager;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/utils/HomePromotionNavigator;", "Lcom/huami/homepage/promotion/ui/ExternalNavigator;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/homepage/promotion/beans/PromotionVo;", "promotionVo", "", DbUtils.Const.Columns.Event.EVENT_ID, "", "eventParams", "", "onNavigate", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HomePromotionNavigator implements ExternalNavigator {
    @Override // com.huami.homepage.promotion.ui.ExternalNavigator
    public void onNavigate(@NotNull Context context, @NotNull PromotionVo promotionVo, @NotNull String eventId, @NotNull Map<String, String> eventParams) {
        HMAdManager.doJumpAction$default(context, Integer.valueOf(promotionVo.getNavigateInfo().getMode()), promotionVo.getNavigateInfo().getUrl(), eventId, eventParams, null, 32, null);
    }
}
