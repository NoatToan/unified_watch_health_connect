package com.xiaomi.hm.health.sleep.eventbus;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/sleep/eventbus/SlpSummaryAnalasisJobFinishObserver;", "", "Landroidx/lifecycle/LiveData;", "", "isDataAnalysisFinish", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SlpSummaryAnalasisJobFinishObserver {

    @NotNull
    public static final SlpSummaryAnalasisJobFinishObserver INSTANCE = new SlpSummaryAnalasisJobFinishObserver();

    private SlpSummaryAnalasisJobFinishObserver() {
    }

    @NotNull
    public final LiveData<Boolean> isDataAnalysisFinish() {
        return Transformations.map(InvalidateLiveData.INSTANCE.listen(SleepDataNotifiers.INSTANCE.getSummeryAnalysisJobFinished()), new Function<EventSummeryAnalysisJobFinished, Boolean>() { // from class: com.xiaomi.hm.health.sleep.eventbus.SlpSummaryAnalasisJobFinishObserver$isDataAnalysisFinish$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(EventSummeryAnalysisJobFinished eventSummeryAnalysisJobFinished) {
                return Boolean.TRUE;
            }
        });
    }
}
