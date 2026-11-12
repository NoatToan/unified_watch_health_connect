package com.huami.sleep.koin;

import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/koin/IAppCacheData;", "", "", "userId", "date", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "getSpecifyDaySlpSummary", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "checkDayDatas", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "updateSummaryByDay", "(Ljava/lang/String;Lcom/xiaomi/hm/health/dataprocess/SportDay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isEarbud", "changeDataSource", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IAppCacheData {
    boolean changeDataSource(@NotNull String userId, @NotNull String date, boolean isEarbud);

    @Nullable
    Object checkDayDatas(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getSpecifyDaySlpSummary(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super SleepAllInfo> continuation);

    @Nullable
    Object updateSummaryByDay(@NotNull String str, @NotNull SportDay sportDay, @NotNull Continuation<? super Unit> continuation);
}
