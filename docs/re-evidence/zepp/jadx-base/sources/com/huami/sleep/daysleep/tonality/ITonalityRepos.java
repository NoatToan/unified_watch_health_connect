package com.huami.sleep.daysleep.tonality;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.daysleep.tonality.bean.TonalityDisplayDataInfo;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J#\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/ITonalityRepos;", "", "", "userId", "dayKey", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepData", "Lcom/huami/sleep/daysleep/tonality/bean/TonalityDisplayDataInfo;", "tonalityDisplayDataInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "fetchSleepTonalityData", "(Lcom/huami/sleep/daysleep/tonality/bean/TonalityDisplayDataInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ITonalityRepos {
    @Nullable
    Object fetchSleepTonalityData(@NotNull TonalityDisplayDataInfo tonalityDisplayDataInfo, @NotNull Continuation<? super Flow<SleepTonalityBean>> continuation);

    @NotNull
    LiveData<SleepInfo> getSleepData(@NotNull String userId, @NotNull String dayKey);
}
