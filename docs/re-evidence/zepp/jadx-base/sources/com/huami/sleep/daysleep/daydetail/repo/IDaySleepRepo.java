package com.huami.sleep.daysleep.daydetail.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J;\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011Ja\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH&J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0004H&J?\u0010%\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0$0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/repo/IDaySleepRepo;", "", "", "isSnoreShow", "", "userId", "date", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepData", "hasSleepQuotient", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "getSleepQuotient", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectDateTime", "sleepStartTime", "sleepEndTime", "intoSleepCount", "beMainSleep", "intoSleepTimes", "beToday", "awakeTimeIndex", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "fetchSleepTonalityData", "(JJJIZLjava/util/List;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "getmCompareIntoSlplist", "getmCompareDpSlplist", "getmCompareScoreSlplist", "", "clear", "Lkotlin/Triple;", "getSleepBreath", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IDaySleepRepo {
    void clear(@NotNull String date);

    @Nullable
    Object fetchSleepTonalityData(long j, long j2, long j3, int i, boolean z, @NotNull List<Long> list, boolean z2, int i2, @NotNull Continuation<? super Flow<SleepTonalityBean>> continuation);

    @ExperimentalCoroutinesApi
    @Nullable
    Object getSleepBreath(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Flow<Triple<Boolean, Integer, Integer>>> continuation);

    @NotNull
    LiveData<SleepInfo> getSleepData(@NotNull String userId, @NotNull String date);

    @ExperimentalCoroutinesApi
    @Nullable
    Object getSleepQuotient(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Flow<? extends Pair<Integer, ? extends List<SleepQuotientParam>>>> continuation);

    @NotNull
    List<SleepCompareModel> getmCompareDpSlplist();

    @NotNull
    List<SleepCompareModel> getmCompareIntoSlplist();

    @NotNull
    List<SleepCompareModel> getmCompareScoreSlplist();

    @NotNull
    LiveData<Boolean> hasSleepQuotient(@NotNull String userId, @NotNull String date);

    boolean isSnoreShow();
}
