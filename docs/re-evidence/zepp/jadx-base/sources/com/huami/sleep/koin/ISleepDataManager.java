package com.huami.sleep.koin;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/sleep/koin/ISleepDataManager;", "", "", "userId", "getLastDataDate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "date", "", "startAnalysis", "", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "getmCompareDpSlplist", "getmCompareIntoSlplist", "getmCompareScoreSlplist", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getLatestSleepData", "Lkotlin/Pair;", "", "getBandSleepTime", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepDataManager {
    @NotNull
    LiveData<Pair<Long, Long>> getBandSleepTime(@NotNull String userId, @NotNull String date);

    @Nullable
    Object getLastDataDate(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @NotNull
    LiveData<SleepInfo> getLatestSleepData(@NotNull String userId);

    @NotNull
    List<SleepCompareModel> getmCompareDpSlplist();

    @NotNull
    List<SleepCompareModel> getmCompareIntoSlplist();

    @NotNull
    List<SleepCompareModel> getmCompareScoreSlplist();

    void startAnalysis(@NotNull String userId, @NotNull String date);
}
