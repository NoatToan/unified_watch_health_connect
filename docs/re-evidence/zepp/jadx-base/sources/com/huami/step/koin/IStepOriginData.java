package com.huami.step.koin;

import androidx.p008lifecycle.LiveData;
import com.huami.step.model.StepOriginData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/step/koin/IStepOriginData;", "", "", "userId", "startDate", "endDate", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/step/model/StepOriginData;", "getStepOriginData", "step_release"}, k = 1, mv = {1, 5, 1})
public interface IStepOriginData {
    @NotNull
    LiveData<List<StepOriginData>> getStepOriginData(@NotNull String userId, @NotNull String startDate, @NotNull String endDate);
}
