package com.huami.step.koin;

import com.huami.step.model.ChildInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/step/koin/StepHollywoodApi;", "", "", "id", "Lcom/huami/step/model/ChildInfo;", "getChildInfo", "", "getChildStepData", "step_release"}, k = 1, mv = {1, 5, 1})
public interface StepHollywoodApi {
    @NotNull
    ChildInfo getChildInfo(@NotNull String id);

    void getChildStepData(@NotNull String id);
}
