package com.huami.sleep.sleepstatefeel.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.sleepstatefeel.vo.MonthSleepStateFeelVo;
import com.huami.sleep.sleepstatefeel.vo.WeekSleepStateFeelVo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J2\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\n0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J(\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&J(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "", "", "userId", "date", "feeling", "", "saveSelectFeeling", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "states", "saveSelectState", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "getDaySleepFeelingData", "getDaySleepStateData", "startDate", "endDate", "Lcom/huami/sleep/sleepstatefeel/vo/WeekSleepStateFeelVo;", "getWeekStateFeelLiveData", "Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelVo;", "getMYStateFeelData", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepStateFeelRepo {
    @NotNull
    LiveData<String> getDaySleepFeelingData(@NotNull String userId, @NotNull String date);

    @NotNull
    LiveData<ArrayList<String>> getDaySleepStateData(@NotNull String userId, @NotNull String date);

    @NotNull
    LiveData<MonthSleepStateFeelVo> getMYStateFeelData(@NotNull String userId, @NotNull String startDate, @NotNull String endDate);

    @NotNull
    LiveData<WeekSleepStateFeelVo> getWeekStateFeelLiveData(@NotNull String userId, @NotNull String startDate, @NotNull String endDate);

    @Nullable
    Object saveSelectFeeling(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveSelectState(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull Continuation<? super Unit> continuation);
}
