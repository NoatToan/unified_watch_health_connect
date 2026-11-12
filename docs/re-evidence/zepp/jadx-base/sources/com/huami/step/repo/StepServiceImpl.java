package com.huami.step.repo;

import com.huami.step.service.StepEntry;
import com.huami.step.service.StepService;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/step/repo/StepServiceImpl;", "Lcom/huami/step/service/StepService;", "Ljava/util/Date;", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/step/service/StepEntry;", "loadSteps", "Lcom/huami/step/repo/StepInfoRepository;", "a", "Lcom/huami/step/repo/StepInfoRepository;", "stepInfoRepository", "<init>", "(Lcom/huami/step/repo/StepInfoRepository;)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepServiceImpl implements StepService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StepInfoRepository stepInfoRepository;

    public StepServiceImpl(@NotNull StepInfoRepository stepInfoRepository) {
        this.stepInfoRepository = stepInfoRepository;
    }

    @Override // com.huami.step.service.StepService
    @NotNull
    public Flow<List<StepEntry>> loadSteps(@NotNull Date start, @NotNull Date end) {
        return this.stepInfoRepository.getDayOfSteps(start, end);
    }
}
