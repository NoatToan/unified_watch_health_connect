package com.huami.sleep.daysleep.tonality.tonalityService;

import com.huami.sky.service.RelaxData;
import com.huami.sky.service.RelaxDataService;
import com.huami.sleep.daysleep.tonality.ITonalityDataInterface;
import com.huami.sleep.daysleep.tonality.bean.QueryTonalityBean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/tonalityService/RealTonalityDataImpl;", "Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;", "queryTonalityBean", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/RelaxData;", "getSleepTonalityOriginalData", "(Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/service/RelaxDataService;", "a", "Lcom/huami/sky/service/RelaxDataService;", "tonalityService", "<init>", "(Lcom/huami/sky/service/RelaxDataService;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class RealTonalityDataImpl implements ITonalityDataInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RelaxDataService tonalityService;

    public RealTonalityDataImpl(@NotNull RelaxDataService relaxDataService) {
        this.tonalityService = relaxDataService;
    }

    @Override // com.huami.sleep.daysleep.tonality.ITonalityDataInterface
    @Nullable
    public Object getSleepTonalityOriginalData(@NotNull QueryTonalityBean queryTonalityBean, @NotNull Continuation<? super Flow<RelaxData>> continuation) {
        return this.tonalityService.getRelaxData(queryTonalityBean.getHideSleepStartTime(), queryTonalityBean.getHideSleepEndTime(), continuation);
    }
}
