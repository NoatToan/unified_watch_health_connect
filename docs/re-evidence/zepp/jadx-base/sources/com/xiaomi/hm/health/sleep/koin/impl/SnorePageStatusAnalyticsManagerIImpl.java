package com.xiaomi.hm.health.sleep.koin.impl;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.snore.core.ext.IPageStatusAnalyticsManager;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/SnorePageStatusAnalyticsManagerIImpl;", "Lcom/huami/snore/core/ext/IPageStatusAnalyticsManager;", "", "id", "", "extras", "", "recordEvent", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SnorePageStatusAnalyticsManagerIImpl implements IPageStatusAnalyticsManager {
    @Override // com.huami.snore.core.ext.IPageStatusAnalyticsManager
    public void recordEvent(@NotNull String str) {
        IPageStatusAnalyticsManager.DefaultImpls.recordEvent(this, str);
    }

    @Override // com.huami.snore.core.ext.IPageStatusAnalyticsManager
    public void recordEvent(@NotNull String id, @NotNull Map<String, String> extras) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(id);
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            countEventBuilder.addExtra(entry.getKey(), entry.getValue());
        }
        Analytics.recordEvent(countEventBuilder);
    }
}
