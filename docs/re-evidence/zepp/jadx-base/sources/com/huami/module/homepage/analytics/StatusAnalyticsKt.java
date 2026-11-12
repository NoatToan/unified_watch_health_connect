package com.huami.module.homepage.analytics;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002.\u0010\u0006\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002.\u0010\u0006\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/huami/module/homepage/analytics/HomeAnalytics;", "event", "", "Lkotlin/Pair;", "", "", "extras", "", "recordEvent", "(Lcom/huami/module/homepage/analytics/HomeAnalytics;[Lkotlin/Pair;)V", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "loadCountEventBuilder", "(Lcom/huami/module/homepage/analytics/HomeAnalytics;[Lkotlin/Pair;)Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class StatusAnalyticsKt {
    @NotNull
    public static final CountEventBuilder loadCountEventBuilder(@NotNull HomeAnalytics homeAnalytics, @NotNull Pair<String, ? extends Object>... pairArr) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(homeAnalytics.getId());
        for (Pair<String, ? extends Object> pair : pairArr) {
            Object second = pair.getSecond();
            if (second != null) {
                countEventBuilder.addExtra(pair.getFirst(), second.toString());
            }
        }
        return countEventBuilder;
    }

    public static final void recordEvent(@NotNull HomeAnalytics homeAnalytics, @NotNull Pair<String, ? extends Object>... pairArr) {
        Analytics.recordEvent(loadCountEventBuilder(homeAnalytics, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
