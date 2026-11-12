package com.huami.step.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.step.model.StepTimeLineInfo;
import com.huami.step.model.StepsInTime;
import com.huami.step.service.StepEntry;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J&\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH&¨\u0006\u0014"}, d2 = {"Lcom/huami/step/repo/StepInfoRepository;", "", "", "startTime", "", "timeType", "", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/step/model/StepsInTime;", "getStepsInTimeRange", "", "Lcom/huami/step/model/StepTimeLineInfo;", "getStepsStage", "Ljava/util/Date;", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/step/service/StepEntry;", "getDayOfSteps", "step_release"}, k = 1, mv = {1, 5, 1})
public interface StepInfoRepository {
    @NotNull
    Flow<List<StepEntry>> getDayOfSteps(@NotNull Date start, @NotNull Date end);

    @Nullable
    LiveData<StepsInTime> getStepsInTimeRange(long startTime, int timeType, @NotNull String userId);

    @Nullable
    LiveData<List<StepTimeLineInfo>> getStepsStage(long startTime, @NotNull String userId);
}
