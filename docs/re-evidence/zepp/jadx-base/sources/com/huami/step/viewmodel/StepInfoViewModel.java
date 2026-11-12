package com.huami.step.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.step.model.StepsInTime;
import com.huami.step.repo.StepInfoRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/step/viewmodel/StepInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "startTime", "", "timeType", "Landroidx/lifecycle/LiveData;", "Lcom/huami/step/model/StepsInTime;", "getStepData", "Lcom/huami/step/repo/StepInfoRepository;", "a", "Lcom/huami/step/repo/StepInfoRepository;", "repository", "<init>", "(Lcom/huami/step/repo/StepInfoRepository;)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepInfoViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StepInfoRepository repository;

    public StepInfoViewModel(@NotNull StepInfoRepository stepInfoRepository) {
        this.repository = stepInfoRepository;
    }

    @Nullable
    public final LiveData<StepsInTime> getStepData(@NotNull String userId, long startTime, int timeType) {
        return this.repository.getStepsInTimeRange(startTime, timeType, userId);
    }
}
