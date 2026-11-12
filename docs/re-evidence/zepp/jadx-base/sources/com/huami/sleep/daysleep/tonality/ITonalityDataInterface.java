package com.huami.sleep.daysleep.tonality;

import com.huami.sky.service.RelaxData;
import com.huami.sleep.daysleep.tonality.bean.QueryTonalityBean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "", "Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;", "queryTonalityBean", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/RelaxData;", "getSleepTonalityOriginalData", "(Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ITonalityDataInterface {
    @Nullable
    Object getSleepTonalityOriginalData(@NotNull QueryTonalityBean queryTonalityBean, @NotNull Continuation<? super Flow<RelaxData>> continuation);
}
