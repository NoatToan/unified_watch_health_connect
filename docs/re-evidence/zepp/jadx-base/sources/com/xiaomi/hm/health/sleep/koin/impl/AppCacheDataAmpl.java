package com.xiaomi.hm.health.sleep.koin.impl;

import com.huami.sleep.koin.IAppCacheData;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.sleep.converter.DataTypeConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J#\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/AppCacheDataAmpl;", "Lcom/huami/sleep/koin/IAppCacheData;", "", "userId", "date", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "getSpecifyDaySlpSummary", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isEarbud", "changeDataSource", "", "checkDayDatas", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "updateSummaryByDay", "(Ljava/lang/String;Lcom/xiaomi/hm/health/dataprocess/SportDay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppCacheDataAmpl implements IAppCacheData {
    @Override // com.huami.sleep.koin.IAppCacheData
    public boolean changeDataSource(@NotNull String userId, @NotNull String date, boolean isEarbud) {
        return HMDataCacheCenter.getInstance().switchSleepSource(date, isEarbud);
    }

    @Override // com.huami.sleep.koin.IAppCacheData
    @Nullable
    public Object checkDayDatas(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        SportDay sportDayFromString = SportDay.fromString(str2);
        HMDataCacheCenter.getInstance().getmBandUint().checkDateDataDownloadStatus(sportDayFromString);
        HMDataCacheCenter.getInstance().getEarbudUnit().checkDayDatas(sportDayFromString);
        return Unit.INSTANCE;
    }

    @Override // com.huami.sleep.koin.IAppCacheData
    @Nullable
    public Object getSpecifyDaySlpSummary(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super SleepAllInfo> continuation) {
        HMSummery specifyDaySummary = HMDataCacheCenter.getInstance().getSpecifyDaySummary(str2);
        if (specifyDaySummary == null) {
            return null;
        }
        return DataTypeConverter.INSTANCE.convertSleepAllInfo(specifyDaySummary);
    }

    @Override // com.huami.sleep.koin.IAppCacheData
    @Nullable
    public Object updateSummaryByDay(@NotNull String str, @NotNull SportDay sportDay, @NotNull Continuation<? super Unit> continuation) {
        HMDataCacheCenter.getInstance().getmBandUint().updateSummaryByDay(sportDay);
        return Unit.INSTANCE;
    }
}
